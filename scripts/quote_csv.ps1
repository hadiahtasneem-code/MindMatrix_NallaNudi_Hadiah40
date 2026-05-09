Param(
    [string]$input = "app/src/main/assets/preloaded_terms.csv",
    [string]$output = "app/src/main/assets/preloaded_terms_quoted.csv"
)

$cwd = (Get-Location).Path
# Explicit asset paths relative to project root (safer on Windows)
$inPath = Join-Path $cwd "app\src\main\assets\preloaded_terms.csv"
$outPath = Join-Path $cwd "app\src\main\assets\preloaded_terms_quoted.csv"

if (-not (Test-Path $inPath)) {
    Write-Error "Input file not found: $inPath"
    exit 1
}

Write-Host "Reading $inPath`nWriting $outPath"

Get-Content -Raw -Path $inPath -Encoding UTF8 | ForEach-Object {
    $lines = $_ -split "\r?\n"
    $outLines = @()
    foreach ($line in $lines) {
        if ([string]::IsNullOrWhiteSpace($line)) { continue }
        # naive split on commas but preserve existing quotes by using regex to split on commas not inside quotes
        $pattern = ',(?=(?:[^`"]*`"[^`"]*`")*[^`"]*$)'
        # Instead use a simple state machine in PowerShell
        $fields = @()
        $cur = ""
        $inQuotes = $false
        for ($i=0; $i -lt $line.Length; $i++) {
            $c = $line[$i]
            if ($c -eq '"') {
                if ($inQuotes -and ($i+1 -lt $line.Length) -and $line[$i+1] -eq '"') {
                    $cur += '"'; $i++
                } else {
                    $inQuotes = -not $inQuotes
                }
            } elseif ($c -eq ',' -and -not $inQuotes) {
                $fields += $cur
                $cur = ""
            } else {
                $cur += $c
            }
        }
        if ($cur -ne "") { $fields += $cur }
        # Quote each field and escape existing quotes
        $quoted = $fields | ForEach-Object { '"' + ($_ -replace '"', '""') + '"' }
        $outLines += ($quoted -join ',')
    }
    $outLines -join "`n" | Out-File -FilePath $outPath -Encoding UTF8
}

Write-Host "Done. Output: $outPath"
