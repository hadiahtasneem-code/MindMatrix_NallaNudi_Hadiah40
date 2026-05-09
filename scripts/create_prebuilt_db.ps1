# PowerShell helper to pull the runtime DB from an emulator/device and copy it into app assets
# Usage: run this after installing and running the debug app at least once so it seeds the DB.
# Requires adb in PATH and that the app is debuggable (debug build)

param(
    [string]$package = "com.example.nelanudi",
    [string]$out = "C:\tmp\nalla_nudi_db.db",
    [string]$projectDir = "$(Resolve-Path ..)\nelanudi\app"
)

Write-Host "Pulling DB from device for package: $package"

# try to cat the DB via run-as and write to file
$cmd = "adb exec-out run-as $package cat databases/nalla_nudi_db > \"$out\""
Write-Host "Running: $cmd"

$proc = Start-Process -FilePath adb -ArgumentList "exec-out", "run-as", $package, "cat", "databases/nalla_nudi_db" -NoNewWindow -RedirectStandardOutput $out -PassThru -Wait
if ($proc.ExitCode -ne 0) {
    Write-Host "Failed to pull DB via run-as. Ensure you're using an emulator or a debuggable app."
    exit 1
}

# Copy into project assets
$dest = Join-Path -Path $projectDir -ChildPath "src\main\assets\databases"
if (!(Test-Path $dest)) { New-Item -ItemType Directory -Path $dest -Force | Out-Null }
Copy-Item -Path $out -Destination (Join-Path $dest "nalla_nudi_db.db") -Force
Write-Host "Copied DB to: $dest\nalla_nudi_db.db"

# Optionally run gradle task to ensure it's included
Push-Location $projectDir
Write-Host "Running: gradlew copyPrebuiltDb (will use PREBUILT_DB_PATH if set)"
& .\gradlew.bat copyPrebuiltDb
Pop-Location

Write-Host "Done. Now rebuild your app (assembleDebug / installDebug) to use the prepackaged DB on fresh installs."
