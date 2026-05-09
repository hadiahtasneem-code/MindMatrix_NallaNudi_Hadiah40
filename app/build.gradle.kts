plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp") // ✅ Replaced kapt with KSP (modern)
}

android {
    namespace = "com.example.nelanudi"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.nelanudi"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.8"
    }

    kotlinOptions {
        jvmTarget = "17" // ✅ Updated from "1.8"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17 // ✅ Added
        targetCompatibility = JavaVersion.VERSION_17 // ✅ Added
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    // ✅ Core (was missing!)
    implementation("androidx.core:core-ktx:1.12.0")

    // ✅ Compose BOM - manages all compose versions together
    val composeBom = platform("androidx.compose:compose-bom:2024.02.00")
    implementation(composeBom)

    // Compose (versions managed by BOM)
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.animation:animation") // ✅ No duplicate
    implementation("androidx.compose.material:material-icons-extended")
    debugImplementation("androidx.compose.ui:ui-tooling")

    // Activity
    implementation("androidx.activity:activity-compose:1.8.2")

    // Navigation
    implementation("androidx.navigation:navigation-compose:2.7.7")

    // Lifecycle
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.7.0")

    // Room DB - ✅ Using KSP instead of kapt
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    ksp("androidx.room:room-compiler:2.6.1") // ✅ ksp instead of kapt

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    // WorkManager for scheduling daily reminders
    implementation("androidx.work:work-runtime-ktx:2.8.1")
    // Coil for image loading in Compose
    implementation("io.coil-kt:coil-compose:2.4.0")
}

// Helper task to copy a prebuilt DB into assets (run: ./gradlew copyPrebuiltDb)
tasks.register<Copy>("copyPrebuiltDb") {
    val src = System.getenv("PREBUILT_DB_PATH") ?: "C:/tmp/nalla_nudi_db.db"
    val destDir = layout.projectDirectory.dir("src/main/assets/databases")
    from(src)
    into(destDir)
}

// Task to generate a preloaded CSV in assets (useful for testing / machine-generated placeholders)
// Usage: ./gradlew generatePreloadedCsv -PpreloadedCount=350
tasks.register("generatePreloadedCsv") {
    doLast {
        val total = (project.findProperty("preloadedCount") as String?)?.toIntOrNull() ?: 350
        val outFile = file("src/main/assets/preloaded_terms.csv")
        outFile.parentFile?.mkdirs()
        outFile.writeText("englishWord,kannadaMeaning,pronunciation,kannadaDefinition,simpleExplanation,exampleUsage,subject\n")

        // First add the high quality ones
        val highQuality = listOf(
            "Photosynthesis,ದ್ಯುತಿಸಂಶ್ಲೇಷಣೆ,Dyuti-sanshleshane,ಸಸ್ಯಗಳು ಆಹಾರ ತಯಾರಿಸುವ ಪ್ರಕ್ರಿಯೆ.,Plants use sunlight water and carbon dioxide to create oxygen and energy in the form of sugar.,Photosynthesis is essential for life on Earth as it produces oxygen.,Science",
            "Gravity,ಗುರುತ್ವಾಕರ್ಷಣೆ,Gurutvakarshane,ವಸ್ತುಗಳನ್ನು ಭೂಮಿಯ ಕಡೆಗೆ ಎಳೆಯುವ ಶಕ್ತಿ.,A force that pulls objects toward each other like how Earth pulls everything toward its center.,Gravity is what keeps us on the ground and causes things to fall down.,Science",
            "Evaporation,ಬಾಷ್ಪೀಕರಣ,Bashpikarane,ನೀರು ಹಬೆಯಾಗಿ ಬದಲಾಗುವ ಕ್ರಿಯೆ.,The process of a liquid turning into a gas like when a puddle dries up in the sun.,Heat from the sun causes the evaporation of water in lakes.,Science",
            "Trigonometry,ತ್ರಿಕೋನಮಿತಿ,Trikonamiti,ತ್ರಿಕೋನಗಳ ಅಳತೆ ಮತ್ತು ಸಂಬಂಧಗಳ ಅಭ್ಯಾಸ.,A branch of mathematics that studies the relationship between the sides and angles of triangles.,Architects use trigonometry to calculate the height of buildings.,Math",
            "Hypotenuse,ವಿಕರ್ಣ,Vikarna,ಲಂಬಕೋನ ತ್ರಿಕೋನದ ಅತಿ ದೊಡ್ಡ ಬಾಹು.,The longest side of a right-angled triangle opposite the right angle.,In a right triangle the square of the hypotenuse is equal to the sum of the squares of the other sides.,Math",
            "Algorithm,ಕ್ರಮಾವಳಿ,Kramavali,ಒಂದು ಕೆಲಸವನ್ನು ಮಾಡಲು ಅನುಸರಿಸಬೇಕಾದ ಹಂತಗಳು.,A step-by-step procedure or set of rules to be followed in calculations or other problem-solving operations.,The computer follows an algorithm to sort these names alphabetically.,Math",
            "Inflation,ಹಣದುಬ್ಬರ,Hanadubbara,ವಸ್ತುಗಳ ಬೆಲೆ ಏರಿಕೆ ಮತ್ತು ಹಣದ ಮೌಲ್ಯ ಕುಸಿತ.,A general increase in prices and fall in the purchasing value of money.,Inflation makes items more expensive to buy over time.,Commerce",
            "Liability,ಹೊಣೆಗಾರಿಕೆ / ಸಾಲ,Honegarike,ಒಬ್ಬ ವ್ಯಕ್ತಿ ಅಥವಾ ಸಂಸ್ಥೆ ನೀಡಬೇಕಾದ ಹಣ.,Something a person or company owes usually a sum of money.,A loan from a bank is a business liability.,Commerce",
            "Asset,ಆಸ್ತಿ,Aasti,ಮೌಲ್ಯವನ್ನು ಹೊಂದಿರುವ ವಸ್ತು ಅಥವಾ ಸಂಪನ್ಮೂಲ.,A useful or valuable thing person or quality that a business or person owns.,Cash and inventory are examples of a company’s assets.,Commerce"
        )
        highQuality.forEach { outFile.appendText(it + "\n") }

        val remaining = total - highQuality.size
        val perSubject = remaining / 3
        val remainder = remaining % 3

        val scienceCount = perSubject + if (remainder > 0) 1 else 0
        val mathCount = perSubject + if (remainder > 1) 1 else 0
        val commerceCount = perSubject

        fun pad(i: Int) = String.format("%03d", i)

        for (i in 1..scienceCount) {
            val idx = pad(i)
            val line = "ScienceTerm${idx},ಆಟೋ_ವಿಜ್ಞಾನ_${idx},ScienceTerm${idx},ವಿಜ್ಞಾನ ವಿವರಣೆ ${idx},Auto-translated explanation for ScienceTerm${idx} (machine),Example usage for ScienceTerm${idx},Science\n"
            outFile.appendText(line)
        }

        for (i in 1..mathCount) {
            val idx = pad(i)
            val line = "MathTerm${idx},ಆಟೋ_ಗಣಿತ_${idx},MathTerm${idx},ಗಣಿತ ವಿವರಣೆ ${idx},Auto-translated explanation for MathTerm${idx} (machine),Example usage for MathTerm${idx},Math\n"
            outFile.appendText(line)
        }

        for (i in 1..commerceCount) {
            val idx = pad(i)
            val line = "CommerceTerm${idx},ಆಟೋ_ವಾಣಿಜ್ಯ_${idx},CommerceTerm${idx},ವಾಣಿಜ್ಯ ವಿವರಣೆ ${idx},Auto-translated explanation for CommerceTerm${idx} (machine),Example usage for CommerceTerm${idx},Commerce\n"
            outFile.appendText(line)
        }

        println("Generated preloaded_terms.csv with $total entries at: " + outFile.absolutePath)
    }
}
