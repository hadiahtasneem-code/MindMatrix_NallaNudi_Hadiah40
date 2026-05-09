package com.example.nelanudi.data.local.database

import com.example.nelanudi.data.local.entity.Term

object PreloadedTerms {
    fun get(): List<Term> {
        val list = mutableListOf<Term>()

        fun add(w: String, k: String, ke: String, e: String, ex: String, kex: String, s: String) {
            list.add(
                Term(
                    englishWord = w,
                    kannadaMeaning = k,
                    pronunciation = w,
                    kannadaDefinition = ke,
                    simpleExplanation = e,
                    exampleUsage = ex,
                    kannadaExample = kex,
                    subject = s
                )
            )
        }

        // --- SCIENCE (200 Terms) ---

        // Chapter 1: Chemical Reactions and Equations
        add(
            "Chemical Reaction",
            "ರಾಸಾಯನಿಕ ಕ್ರಿಯೆ",
            "ಹೊಸ ಪದಾರ್ಥಗಳು ರೂಪುಗೊಳ್ಳುವ ಪ್ರಕ್ರಿಯೆ",
            "Process forming new substances",
            "Rusting of iron is a chemical reaction",
            "ಕಬ್ಬಿಣದ ತುಕ್ಕು ರಾಸಾಯನಿಕ ಕ್ರಿಯೆಯಾಗಿದೆ",
            "Science"
        )
        add(
            "Reactant",
            "ಕ್ರಿಯಾಕಾರಕ",
            "ರಾಸಾಯನಿಕ ಕ್ರಿಯೆಯಲ್ಲಿ ಭಾಗವಹಿಸುವ ಪದಾರ್ಥ",
            "Substance that participates in reaction",
            "Hydrogen is a reactant in water formation",
            "ಜಲಜನಕವು ನೀರಿನ ರಚನೆಯಲ್ಲಿ ಕ್ರಿಯಾಕಾರಕವಾಗಿದೆ",
            "Science"
        )
        add(
            "Product",
            "ಉತ್ಪನ್ನ",
            "ರಾಸಾಯನಿಕ ಕ್ರಿಯೆಯಿಂದ ಉತ್ಪನ್ನವಾಗುವ ಪದಾರ್ಥ",
            "Substance formed in a reaction",
            "Water is the product when hydrogen burns",
            "ಜಲಜನಕ ಉರಿದಾಗ ನೀರು ಉತ್ಪನ್ನವಾಗುತ್ತದೆ",
            "Science"
        )
        add(
            "Precipitation",
            "ಅವಕ್ಷೇಪ",
            "ದ್ರಾವಣದಲ್ಲಿ ಘನ ಪದಾರ್ಥ ರೂಪುಗೊಳ್ಳುವುದು",
            "Formation of solid in solution",
            "Silver chloride shows precipitation",
            "ಸಿಲ್ವರ್ ಕ್ಲೋರೈಡ್ ಅವಕ್ಷೇಪ ತೋರಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Oxidation",
            "ಆಕ್ಸಿಡೀಕರಣ",
            "ಆಮ್ಲಜನಕವನ್ನು ಪಡೆಯುವ ಅಥವಾ ಜಲಜನಕವನ್ನು ಕಳೆದುಕೊಳ್ಳುವ ಕ್ರಿಯೆ",
            "Gain of oxygen or loss of hydrogen",
            "Burning of magnesium is oxidation",
            "ಮೆಗ್ನೀಸಿಯಂ ಉರಿಯುವುದು ಆಕ್ಸಿಡೀಕರಣವಾಗಿದೆ",
            "Science"
        )
        add(
            "Reduction",
            "ಅಪಚಯನ",
            "ಆಮ್ಲಜನಕವನ್ನು ಕಳೆದುಕೊಳ್ಳುವ ಅಥವಾ ಜಲಜನಕವನ್ನು ಪಡೆಯುವ ಕ್ರಿಯೆ",
            "Loss of oxygen or gain of hydrogen",
            "Copper oxide loses oxygen in reduction",
            "ತಾಮ್ರದ ಆಕ್ಸೈಡ್ ಅಪಚಯನದಲ್ಲಿ ಆಮ್ಲಜನಕ ಕಳೆದುಕೊಳ್ಳುತ್ತದೆ",
            "Science"
        )
        add(
            "Corrosion",
            "ಸವೆತ",
            "ಲೋಹಗಳ ಮೇಲ್ಮೈ ನಾಶವಾಗುವುದು",
            "Surface deterioration of metals",
            "Rust is corrosion of iron",
            "ತುಕ್ಕು ಕಬ್ಬಿಣದ ಸವೆತವಾಗಿದೆ",
            "Science"
        )
        add(
            "Rancidity",
            "ಕೊಬ್ಬು ಕೆಡುವುದು",
            "ಕೊಬ್ಬು ಮತ್ತು ತೈಲಗಳು ಆಕ್ಸಿಡೀಕರಣದಿಂದ ಕೆಡುವುದು",
            "Oxidation of fats and oils",
            "Food becomes rancid when exposed to air",
            "ಗಾಳಿಗೆ ಒಡ್ಡಿದಾಗ ಆಹಾರ ಕೊಬ್ಬು ಕೆಡುತ್ತದೆ",
            "Science"
        )
        add(
            "Exothermic",
            "ಉಷ್ಣೋತ್ಪನ್ನ",
            "ಶಾಖವನ್ನು ಬಿಡುಗಡೆ ಮಾಡುವ ಕ್ರಿಯೆ",
            "Reaction that releases heat",
            "Combustion is exothermic",
            "ದಹನವು ಉಷ್ಣೋತ್ಪನ್ನ ಕ್ರಿಯೆಯಾಗಿದೆ",
            "Science"
        )
        add(
            "Endothermic",
            "ಉಷ್ಣಗ್ರಾಹಿ",
            "ಶಾಖವನ್ನು ಹೀರಿಕೊಳ್ಳುವ ಕ್ರಿಯೆ",
            "Reaction that absorbs heat",
            "Photosynthesis is endothermic",
            "ದ್ಯುತಿಸಂಶ್ಲೇಷಣೆ ಉಷ್ಣಗ್ರಾಹಿ ಕ್ರಿಯೆಯಾಗಿದೆ",
            "Science"
        )

        // Chapter 2: Acids, Bases and Salts
        add(
            "Acid",
            "ಆಮ್ಲ",
            "ಹುಳಿರುಚಿಯುಳ್ಳ ಮತ್ತು ನೀಲಿ ಲಿಟ್ಮಸ್ ಕೆಂಪು ಮಾಡುವ ಪದಾರ್ಥ",
            "Sour substance turning blue litmus red",
            "Lemon contains citric acid",
            "ನಿಂಬೆ ಸಿಟ್ರಿಕ್ ಆಮ್ಲವನ್ನು ಹೊಂದಿರುತ್ತದೆ",
            "Science"
        )
        add(
            "Base",
            "ಪ್ರತ್ಯಾಮ್ಲ",
            "ಕಹಿ ರುಚಿಯುಳ್ಳ ಮತ್ತು ಕೆಂಪು ಲಿಟ್ಮಸ್ ನೀಲಿ ಮಾಡುವ ಪದಾರ್ಥ",
            "Bitter substance turning red litmus blue",
            "Soap solution is a base",
            "ಸಾಬೂನು ದ್ರಾವಣವು ಪ್ರತ್ಯಾಮ್ಲವಾಗಿದೆ",
            "Science"
        )
        add(
            "Salt",
            "ಲವಣ",
            "ಆಮ್ಲ ಮತ್ತು ಪ್ರತ್ಯಾಮ್ಲದ ಕ್ರಿಯೆಯಿಂದ ರೂಪುಗೊಳ್ಳುವ ಪದಾರ್ಥ",
            "Product of acid-base reaction",
            "Common salt is sodium chloride",
            "ಸಾಮಾನ್ಯ ಉಪ್ಪು ಸೋಡಿಯಂ ಕ್ಲೋರೈಡ್ ಆಗಿದೆ",
            "Science"
        )
        add(
            "Indicator",
            "ಸೂಚಕ",
            "ಆಮ್ಲ ಅಥವಾ ಪ್ರತ್ಯಾಮ್ಲವನ್ನು ತೋರಿಸುವ ಪದಾರ್ಥ",
            "Substance showing acid or base",
            "Litmus is a common indicator",
            "ಲಿಟ್ಮಸ್ ಒಂದು ಸಾಮಾನ್ಯ ಸೂಚಕವಾಗಿದೆ",
            "Science"
        )
        add(
            "pH Scale",
            "pH ಮಾಪಕ",
            "ಆಮ್ಲತೆ ಅಥವಾ ಪ್ರತ್ಯಾಮ್ಲತೆಯನ್ನು ಅಳೆಯುವ ಮಾಪಕ",
            "Scale measuring acidity or basicity",
            "pH 7 is neutral",
            "pH 7 ತಟಸ್ಥವಾಗಿದೆ",
            "Science"
        )
        add(
            "Neutralization",
            "ತಟಸ್ಥೀಕರಣ",
            "ಆಮ್ಲ ಮತ್ತು ಪ್ರತ್ಯಾಮ್ಲದ ಪರಸ್ಪರ ಕ್ರಿಯೆ",
            "Reaction between acid and base",
            "Antacid neutralizes stomach acid",
            "ಉದರಶೂಲೆ ಔಷಧವು ಹೊಟ್ಟೆಯ ಆಮ್ಲವನ್ನು ತಟಸ್ಥಗೊಳಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Alkali",
            "ಕ್ಷಾರ",
            "ನೀರಿನಲ್ಲಿ ಕರಗುವ ಪ್ರತ್ಯಾಮ್ಲ",
            "Water-soluble base",
            "Sodium hydroxide is an alkali",
            "ಸೋಡಿಯಂ ಹೈಡ್ರಾಕ್ಸೈಡ್ ಒಂದು ಕ್ಷಾರವಾಗಿದೆ",
            "Science"
        )
        add(
            "Universal Indicator",
            "ಸಾರ್ವತ್ರಿಕ ಸೂಚಕ",
            "ವಿವಿಧ pH ಮೌಲ್ಯಗಳನ್ನು ತೋರಿಸುವ ಸೂಚಕ",
            "Indicator showing different pH values",
            "Universal indicator shows color range",
            "ಸಾರ್ವತ್ರಿಕ ಸೂಚಕ ಬಣ್ಣದ ಶ್ರೇಣಿ ತೋರಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Hydrochloric Acid",
            "ಹೈಡ್ರೋಕ್ಲೋರಿಕ್ ಆಮ್ಲ",
            "ಹೊಟ್ಟೆಯಲ್ಲಿರುವ ಬಲವಾದ ಆಮ್ಲ",
            "Strong acid in stomach",
            "HCl helps in digestion",
            "HCl ಜೀರ್ಣಕ್ರಿಯೆಗೆ ಸಹಾಯ ಮಾಡುತ್ತದೆ",
            "Science"
        )
        add(
            "Sulfuric Acid",
            "ಸಲ್ಫ್ಯೂರಿಕ್ ಆಮ್ಲ",
            "ಕಾರು ಬ್ಯಾಟರಿಯಲ್ಲಿರುವ ಆಮ್ಲ",
            "Acid used in car batteries",
            "H2SO4 is used in industries",
            "H2SO4 ಉದ್ಯಮಗಳಲ್ಲಿ ಬಳಸಲಾಗುತ್ತದೆ",
            "Science"
        )

        // Chapter 3: Metals and Non-metals
        add(
            "Metal",
            "ಲೋಹ",
            "ಹೊಳಪು, ವಿದ್ಯುತ್ ವಾಹಕತೆಯುಳ್ಳ ಮೂಲಧಾತು",
            "Shiny, electrically conductive element",
            "Iron is a common metal",
            "ಕಬ್ಬಿಣವು ಸಾಮಾನ್ಯ ಲೋಹವಾಗಿದೆ",
            "Science"
        )
        add(
            "Non-metal",
            "ಅಲೋಹ",
            "ಲೋಹದ ಗುಣಲಕ್ಷಣಗಳಿಲ್ಲದ ಮೂಲಧಾತು",
            "Element without metallic properties",
            "Oxygen is a non-metal",
            "ಆಮ್ಲಜನಕವು ಅಲೋಹವಾಗಿದೆ",
            "Science"
        )
        add(
            "Malleability",
            "ತಟ್ಟುವ ಸಾಮರ್ಥ್ಯ",
            "ತೆಳುವಾದ ಹಾಳೆಗಳಾಗಿ ಮಾಡುವ ಗುಣ",
            "Property of being hammered into sheets",
            "Gold shows high malleability",
            "ಚಿನ್ನವು ಹೆಚ್ಚಿನ ತಟ್ಟುವ ಸಾಮರ್ಥ್ಯವನ್ನು ತೋರಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Ductility",
            "ತಂತಿ ಎಳೆಯುವ ಸಾಮರ್ಥ್ಯ",
            "ತಂತಿಗಳಾಗಿ ಎಳೆಯುವ ಗುಣ",
            "Property of being drawn into wires",
            "Copper is highly ductile",
            "ತಾಮ್ರವು ಹೆಚ್ಚು ತಂತಿ ಎಳೆಯಬಲ್ಲದು",
            "Science"
        )
        add(
            "Conductivity",
            "ವಾಹಕತೆ",
            "ವಿದ್ಯುತ್ ಅಥವಾ ಶಾಖವನ್ನು ಸಾಗಿಸುವ ಸಾಮರ್ಥ್ಯ",
            "Ability to conduct electricity or heat",
            "Silver has highest conductivity",
            "ಬೆಳ್ಳಿಯು ಅತ್ಯಧಿಕ ವಾಹಕತೆ ಹೊಂದಿದೆ",
            "Science"
        )
        add(
            "Sonority",
            "ಸಣಸಣನೆ",
            "ಬಡಿದಾಗ ಧ್ವನಿ ಮಾಡುವ ಗುಣ",
            "Property of producing sound when struck",
            "Metals are sonorous",
            "ಲೋಹಗಳು ಸಣಸಣನೆಯುಳ್ಳವು",
            "Science"
        )
        add(
            "Alloy",
            "ಮಿಶ್ರಲೋಹ",
            "ಎರಡು ಅಥವಾ ಹೆಚ್ಚು ಲೋಹಗಳ ಮಿಶ್ರಣ",
            "Mixture of two or more metals",
            "Bronze is an alloy of copper and tin",
            "ಕಂಚು ತಾಮ್ರ ಮತ್ತು ತವರದ ಮಿಶ್ರಲೋಹವಾಗಿದೆ",
            "Science"
        )
        add(
            "Reactivity Series",
            "ಕ್ರಿಯಾಶೀಲತಾ ಶ್ರೇಣಿ",
            "ಲೋಹಗಳ ಕ್ರಿಯಾಶೀಲತೆಯ ಕ್ರಮ",
            "Arrangement of metals by reactivity",
            "Sodium is highly reactive",
            "ಸೋಡಿಯಂ ಹೆಚ್ಚು ಕ್ರಿಯಾಶೀಲವಾಗಿದೆ",
            "Science"
        )
        add(
            "Ore",
            "ಅದಿರು",
            "ಲೋಹವನ್ನು ಪಡೆಯಬಹುದಾದ ಖನಿಜ",
            "Mineral from which metal can be extracted",
            "Bauxite is an ore of aluminum",
            "ಬಾಕ್ಸೈಟ್ ಅಲ್ಯೂಮಿನಿಯಂನ ಅದಿರಾಗಿದೆ",
            "Science"
        )
        add(
            "Metallurgy",
            "ಲೋಹಶಾಸ್ತ್ರ",
            "ಅದಿರಿನಿಂದ ಲೋಹ ಪಡೆಯುವ ವಿಜ್ಞಾನ",
            "Science of extracting metals from ores",
            "Metallurgy is an ancient science",
            "ಲೋಹಶಾಸ್ತ್ರವು ಪ್ರಾಚೀನ ವಿಜ್ಞಾನವಾಗಿದೆ",
            "Science"
        )

        // Chapter 4: Carbon and its Compounds
        add(
            "Covalent Bond",
            "ಸಹಸಂಯೋಜಕ ಬಂಧ",
            "ಎಲೆಕ್ಟ್ರಾನ್‌ಗಳ ಹಂಚಿಕೆಯಿಂದ ಉಂಟಾಗುವ ಬಂಧ",
            "Bond formed by sharing electrons",
            "Water has covalent bonds",
            "ನೀರಿನಲ್ಲಿ ಸಹಸಂಯೋಜಕ ಬಂಧಗಳಿವೆ",
            "Science"
        )
        add(
            "Hydrocarbon",
            "ಜಲಜನಕ ಇಂಗಾಲಕ",
            "ಇಂಗಾಲ ಮತ್ತು ಜಲಜನಕ ಮಾತ್ರ ಹೊಂದಿರುವ ಸಂಯುಕ್ತ",
            "Compound containing only carbon and hydrogen",
            "Methane is a simple hydrocarbon",
            "ಮೀಥೇನ್ ಸರಳ ಜಲಜನಕ ಇಂಗಾಲಕವಾಗಿದೆ",
            "Science"
        )
        add(
            "Saturated",
            "ಸಂತೃಪ್ತ",
            "ಏಕ ಬಂಧಗಳಿರುವ ಸಂಯುಕ್ತ",
            "Compound with single bonds only",
            "Ethane is saturated",
            "ಈಥೇನ್ ಸಂತೃಪ್ತವಾಗಿದೆ",
            "Science"
        )
        add(
            "Unsaturated",
            "ಅಸಂತೃಪ್ತ",
            "ದ್ವಿ ಅಥವಾ ತ್ರಿ ಬಂಧಗಳಿರುವ ಸಂಯುಕ್ತ",
            "Compound with double or triple bonds",
            "Ethene is unsaturated",
            "ಈಥೀನ್ ಅಸಂತೃಪ್ತವಾಗಿದೆ",
            "Science"
        )
        add(
            "Isomer",
            "ಸಮಾವಯವ",
            "ಒಂದೇ ಸೂತ್ರ ಬೇರೆ ರಚನೆಯ ಸಂಯುಕ್ತ",
            "Compounds with same formula different structure",
            "Butane has isomers",
            "ಬ್ಯೂಟೇನ್ ಸಮಾವಯವಗಳನ್ನು ಹೊಂದಿದೆ",
            "Science"
        )
        add(
            "Functional Group",
            "ಕ್ರಿಯಾತ್ಮಕ ಗುಂಪು",
            "ಸಂಯುಕ್ತದ ಗುಣಲಕ್ಷಣ ನಿರ್ಧರಿಸುವ ಗುಂಪು",
            "Group determining properties of compound",
            "Alcohol has -OH group",
            "ಆಲ್ಕೊಹಾಲ್ -OH ಗುಂಪನ್ನು ಹೊಂದಿದೆ",
            "Science"
        )
        add(
            "Homologous Series",
            "ಸಮಾನ ಶ್ರೇಣಿ",
            "ಒಂದೇ ಕ್ರಿಯಾತ್ಮಕ ಗುಂಪಿನ ಸಂಯುಕ್ತಗಳ ಶ್ರೇಣಿ",
            "Series with same functional group",
            "Alkanes form homologous series",
            "ಆಲ್ಕೇನ್‌ಗಳು ಸಮಾನ ಶ್ರೇಣಿ ರೂಪಿಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Combustion",
            "ದಹನ",
            "ಆಮ್ಲಜನಕದೊಂದಿಗೆ ಉರಿಯುವ ಕ್ರಿಯೆ",
            "Burning in oxygen",
            "Complete combustion produces CO2",
            "ಸಂಪೂರ್ಣ ದಹನವು CO2 ಉತ್ಪಾದಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Substitution",
            "ಪ್ರತಿಸ್ಥಾಪನ",
            "ಒಂದು ಪರಮಾಣುವನ್ನು ಇನ್ನೊಂದರಿಂದ ಬದಲಾಯಿಸುವ ಕ್ರಿಯೆ",
            "Replacing one atom with another",
            "Chlorine substitutes hydrogen in methane",
            "ಕ್ಲೋರಿನ್ ಮೀಥೇನ್‌ನಲ್ಲಿ ಜಲಜನಕವನ್ನು ಪ್ರತಿಸ್ಥಾಪಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Addition",
            "ಸಂಕಲನ",
            "ಅಸಂತೃಪ್ತ ಬಂಧಕ್ಕೆ ಪರಮಾಣುಗಳನ್ನು ಸೇರಿಸುವ ಕ್ರಿಯೆ",
            "Adding atoms to unsaturated bond",
            "Hydrogen adds to ethene",
            "ಜಲಜನಕವು ಈಥೀನ್‌ಗೆ ಸೇರುತ್ತದೆ",
            "Science"
        )

        // Chapter 5: Periodic Classification
        add(
            "Periodic Table",
            "ಆವರ್ತಕ ಕೋಷ್ಟಕ",
            "ಮೂಲಧಾತುಗಳ ವ್ಯವಸ್ಥಿತ ಜೋಡಣೆ",
            "Systematic arrangement of elements",
            "Mendeleev created periodic table",
            "ಮೆಂಡಲೀವ್ ಆವರ್ತಕ ಕೋಷ್ಟಕ ರಚಿಸಿದರು",
            "Science"
        )
        add(
            "Period",
            "ಆವರ್ತ",
            "ಸಾಲು ಅಡ್ಡಲಾಗಿ ಇರುವ ಮೂಲಧಾತುಗಳು",
            "Horizontal row in periodic table",
            "There are seven periods",
            "ಏಳು ಆವರ್ತಗಳಿವೆ",
            "Science"
        )
        add(
            "Group",
            "ವರ್ಗ",
            "ಲಂಬವಾಗಿ ಇರುವ ಮೂಲಧಾತುಗಳು",
            "Vertical column in periodic table",
            "Group 1 contains alkali metals",
            "ವರ್ಗ 1 ರಲ್ಲಿ ಕ್ಷಾರ ಲೋಹಗಳಿವೆ",
            "Science"
        )
        add(
            "Atomic Number",
            "ಪರಮಾಣು ಸಂಖ್ಯೆ",
            "ಕೇಂದ್ರಕದಲ್ಲಿರುವ ಪ್ರೋಟಾನ್‌ಗಳ ಸಂಖ್ಯೆ",
            "Number of protons in nucleus",
            "Hydrogen has atomic number 1",
            "ಜಲಜನಕದ ಪರಮಾಣು ಸಂಖ್ಯೆ 1",
            "Science"
        )
        add(
            "Atomic Mass",
            "ಪರಮಾಣು ದ್ರವ್ಯರಾಶಿ",
            "ಪರಮಾಣುವಿನ ಸರಾಸರಿ ದ್ರವ್ಯರಾಶಿ",
            "Average mass of an atom",
            "Carbon has atomic mass 12",
            "ಇಂಗಾಲದ ಪರಮಾಣು ದ್ರವ್ಯರಾಶಿ 12",
            "Science"
        )
        add(
            "Valency",
            "ಸಂಯೋಜಕತೆ",
            "ಸಂಯೋಗ ಸಾಮರ್ಥ್ಯ",
            "Combining capacity of element",
            "Oxygen has valency 2",
            "ಆಮ್ಲಜನಕದ ಸಂಯೋಜಕತೆ 2",
            "Science"
        )
        add(
            "Noble Gas",
            "ಉದಾತ್ತ ಅನಿಲ",
            "ಕ್ರಿಯಾಶೀಲವಲ್ಲದ ಅನಿಲ",
            "Unreactive gas",
            "Helium is a noble gas",
            "ಹೀಲಿಯಂ ಉದಾತ್ತ ಅನಿಲವಾಗಿದೆ",
            "Science"
        )
        add(
            "Alkali Metal",
            "ಕ್ಷಾರ ಲೋಹ",
            "ವರ್ಗ 1 ರ ಲೋಹ",
            "Group 1 metal",
            "Sodium is alkali metal",
            "ಸೋಡಿಯಂ ಕ್ಷಾರ ಲೋಹವಾಗಿದೆ",
            "Science"
        )
        add(
            "Halogen",
            "ಹ್ಯಾಲೊಜನ್",
            "ವರ್ಗ 17 ರ ಮೂಲಧಾತು",
            "Group 17 element",
            "Chlorine is a halogen",
            "ಕ್ಲೋರಿನ್ ಹ್ಯಾಲೊಜನ್ ಆಗಿದೆ",
            "Science"
        )
        add(
            "Transition Element",
            "ಪರಿವರ್ತನ ಮೂಲಧಾತು",
            "ಮಧ್ಯದ ವರ್ಗಗಳ ಲೋಹ",
            "Middle group metal",
            "Iron is transition element",
            "ಕಬ್ಬಿಣವು ಪರಿವರ್ತನ ಮೂಲಧಾತು",
            "Science"
        )

        // Chapter 6: Life Processes
        add(
            "Nutrition",
            "ಪೋಷಣೆ",
            "ಆಹಾರ ಪಡೆಯುವ ಪ್ರಕ್ರಿಯೆ",
            "Process of obtaining food",
            "Nutrition is essential for life",
            "ಪೋಷಣೆ ಜೀವನಕ್ಕೆ ಅತ್ಯಗತ್ಯ",
            "Science"
        )
        add(
            "Autotroph",
            "ಸ್ವಪೋಷಕ",
            "ತಾನೇ ಆಹಾರ ತಯಾರಿಸುವ ಜೀವಿ",
            "Organism making its own food",
            "Plants are autotrophs",
            "ಸಸ್ಯಗಳು ಸ್ವಪೋಷಕಗಳಾಗಿವೆ",
            "Science"
        )
        add(
            "Heterotroph",
            "ಪರಪೋಷಕ",
            "ಇತರರಿಂದ ಆಹಾರ ಪಡೆಯುವ ಜೀವಿ",
            "Organism depending on others for food",
            "Animals are heterotrophs",
            "ಪ್ರಾಣಿಗಳು ಪರಪೋಷಕಗಳಾಗಿವೆ",
            "Science"
        )
        add(
            "Photosynthesis",
            "ದ್ಯುತಿಸಂಶ್ಲೇಷಣೆ",
            "ಸೂರ್ಯನ ಬೆಳಕಿನಿಂದ ಆಹಾರ ತಯಾರಿಕೆ",
            "Food preparation using sunlight",
            "Green plants do photosynthesis",
            "ಹಸಿರು ಸಸ್ಯಗಳು ದ್ಯುತಿಸಂಶ್ಲೇಷಣೆ ಮಾಡುತ್ತವೆ",
            "Science"
        )
        add(
            "Chlorophyll",
            "ಹರಿತತ್ತು",
            "ಸಸ್ಯದ ಹಸಿರು ವರ್ಣಕ",
            "Green pigment in plants",
            "Chlorophyll absorbs sunlight",
            "ಹರಿತತ್ತು ಸೂರ್ಯನ ಬೆಳಕನ್ನು ಹೀರಿಕೊಳ್ಳುತ್ತದೆ",
            "Science"
        )
        add(
            "Stomata",
            "ರಂಧ್ರಗಳು",
            "ಎಲೆಯ ಮೇಲಿನ ಸೂಕ್ಷ್ಮ ರಂಧ್ರಗಳು",
            "Tiny pores on leaf surface",
            "Stomata help in gas exchange",
            "ರಂಧ್ರಗಳು ಅನಿಲ ವಿನಿಮಯಕ್ಕೆ ಸಹಾಯ ಮಾಡುತ್ತವೆ",
            "Science"
        )
        add(
            "Respiration",
            "ಉಸಿರಾಟ",
            "ಆಹಾರದಿಂದ ಶಕ್ತಿ ಬಿಡುಗಡೆ",
            "Energy release from food",
            "All living beings respire",
            "ಎಲ್ಲಾ ಜೀವಿಗಳೂ ಉಸಿರಾಟ ಮಾಡುತ್ತವೆ",
            "Science"
        )
        add(
            "Aerobic",
            "ಆಮ್ಲಜನಕ ಸಹಿತ",
            "ಆಮ್ಲಜನಕದೊಂದಿಗೆ ನಡೆಯುವ ಕ್ರಿಯೆ",
            "Process with oxygen",
            "Aerobic respiration yields more energy",
            "ಆಮ್ಲಜನಕ ಸಹಿತ ಉಸಿರಾಟ ಹೆಚ್ಚು ಶಕ್ತಿ ನೀಡುತ್ತದೆ",
            "Science"
        )
        add(
            "Anaerobic",
            "ಆಮ್ಲಜನಕ ರಹಿತ",
            "ಆಮ್ಲಜನಕ ಇಲ್ಲದೆ ನಡೆಯುವ ಕ್ರಿಯೆ",
            "Process without oxygen",
            "Yeast does anaerobic respiration",
            "ಯೀಸ್ಟ್ ಆಮ್ಲಜನಕ ರಹಿತ ಉಸಿರಾಟ ಮಾಡುತ್ತದೆ",
            "Science"
        )
        add(
            "Transportation",
            "ಸಾಗಣೆ",
            "ಪದಾರ್ಥಗಳ ಚಲನೆ",
            "Movement of substances",
            "Blood transports oxygen",
            "ರಕ್ತವು ಆಮ್ಲಜನಕವನ್ನು ಸಾಗಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Excretion",
            "ವಿಸರ್ಜನೆ",
            "ತ್ಯಾಜ್ಯ ಪದಾರ್ಥಗಳ ತೆಗೆದುಹಾಕುವಿಕೆ",
            "Removal of waste products",
            "Kidneys help in excretion",
            "ಮೂತ್ರಪಿಂಡಗಳು ವಿಸರ್ಜನೆಗೆ ಸಹಾಯ ಮಾಡುತ್ತವೆ",
            "Science"
        )

        // Chapter 7: Control and Coordination
        add(
            "Stimulus",
            "ಪ್ರಚೋದನೆ",
            "ಪರಿಸರದಿಂದ ಬರುವ ಸಂಕೇತ",
            "Signal from environment",
            "Light is a stimulus for plants",
            "ಬೆಳಕು ಸಸ್ಯಗಳಿಗೆ ಪ್ರಚೋದನೆಯಾಗಿದೆ",
            "Science"
        )
        add(
            "Response",
            "ಪ್ರತಿಕ್ರಿಯೆ",
            "ಪ್ರಚೋದನೆಗೆ ಉಂಟಾಗುವ ಬದಲಾವಣೆ",
            "Change due to stimulus",
            "Plants show response to light",
            "ಸಸ್ಯಗಳು ಬೆಳಕಿಗೆ ಪ್ರತಿಕ್ರಿಯೆ ತೋರಿಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Nervous System",
            "ನರಮಂಡಲ",
            "ಸಂಕೇತಗಳನ್ನು ಸಾಗಿಸುವ ವ್ಯವಸ್ಥೆ",
            "System carrying signals",
            "Brain is part of nervous system",
            "ಮೆದುಳು ನರಮಂಡಲದ ಭಾಗವಾಗಿದೆ",
            "Science"
        )
        add(
            "Neuron",
            "ನರಕೋಶ",
            "ನರಮಂಡಲದ ಮೂಲ ಘಟಕ",
            "Basic unit of nervous system",
            "Neurons transmit impulses",
            "ನರಕೋಶಗಳು ಪ್ರಚೋದನೆಗಳನ್ನು ಸಾಗಿಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Reflex Action",
            "ಪ್ರತಿವರ್ತನ ಕ್ರಿಯೆ",
            "ತ್ವರಿತ ಸ್ವಯಂ ಪ್ರತಿಕ್ರಿಯೆ",
            "Quick automatic response",
            "Blinking is a reflex action",
            "ಕಣ್ಣು ಮಿಟುಕಿಸುವುದು ಪ್ರತಿವರ್ತನ ಕ್ರಿಯೆ",
            "Science"
        )
        add(
            "Hormone",
            "ಹಾರ್ಮೋನ್",
            "ರಾಸಾಯನಿಕ ಸಂದೇಶವಾಹಕ",
            "Chemical messenger",
            "Insulin is a hormone",
            "ಇನ್ಸುಲಿನ್ ಒಂದು ಹಾರ್ಮೋನ್ ಆಗಿದೆ",
            "Science"
        )
        add(
            "Endocrine Gland",
            "ಅಂತಃಸ್ರಾವಿ ಗ್ರಂಥಿ",
            "ಹಾರ್ಮೋನ್ ಉತ್ಪಾದಿಸುವ ಗ್ರಂಥಿ",
            "Gland producing hormones",
            "Thyroid is endocrine gland",
            "ಥೈರಾಯ್ಡ್ ಅಂತಃಸ್ರಾವಿ ಗ್ರಂಥಿಯಾಗಿದೆ",
            "Science"
        )
        add(
            "Tropism",
            "ಅನುಚಲನ",
            "ಪ್ರಚೋದನೆಯ ದಿಕ್ಕಿನಲ್ಲಿ ಬೆಳವಣಿಗೆ",
            "Growth towards stimulus",
            "Roots show positive geotropism",
            "ಬೇರುಗಳು ಧನಾತ್ಮಕ ಗುರುತ್ವಾನುಚಲನ ತೋರಿಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Phototropism",
            "ಪ್ರಕಾಶಾನುಚಲನ",
            "ಬೆಳಕಿನ ಕಡೆಗೆ ಬೆಳವಣಿಗೆ",
            "Growth towards light",
            "Stems show positive phototropism",
            "ಕಾಂಡಗಳು ಧನಾತ್ಮಕ ಪ್ರಕಾಶಾನುಚಲನ ತೋರಿಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Geotropism",
            "ಗುರುತ್ವಾನುಚಲನ",
            "ಗುರುತ್ವಾಕರ್ಷಣೆಯ ಕಡೆಗೆ ಬೆಳವಣಿಗೆ",
            "Growth in response to gravity",
            "Roots are positively geotropic",
            "ಬೇರುಗಳು ಧನಾತ್ಮಕ ಗುರುತ್ವಾನುಚಲನವುಳ್ಳವು",
            "Science"
        )

        // Chapter 8: Reproduction

        add(
            "Fission",
            "ವಿದಳನ",
            "ವಿಭಜನೆಯಿಂದ ಸಂತಾನ",
            "Reproduction by splitting",
            "Amoeba reproduces by binary fission",
            "ಅಮೀಬಾ ದ್ವಿವಿದಳನದಿಂದ ಸಂತಾನೋತ್ಪತ್ತಿ ಮಾಡುತ್ತದೆ",
            "Science"
        )
        add(
            "Budding",
            "ಮೊಗ್ಗು ಬಿಡುವಿಕೆ",
            "ಮೊಗ್ಗಿನಿಂದ ಹೊಸ ಜೀವಿ",
            "New organism from bud",
            "Yeast reproduces by budding",
            "ಯೀಸ್ಟ್ ಮೊಗ್ಗು ಬಿಡುವಿಕೆಯಿಂದ ಸಂತಾನೋತ್ಪತ್ತಿ ಮಾಡುತ್ತದೆ",
            "Science"
        )
        add(
            "Fragmentation",
            "ಛೇದನ",
            "ತುಂಡುಗಳಿಂದ ಹೊಸ ಜೀವಿ",
            "New organisms from fragments",
            "Spirogyra shows fragmentation",
            "ಸ್ಪೈರೋಗೈರಾ ಛೇದನ ತೋರಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Regeneration",
            "ಪುನರುತ್ಪಾದನೆ",
            "ಕಳೆದುಹೋದ ಭಾಗಗಳ ಮರುಬೆಳವಣಿಗೆ",
            "Regrowth of lost parts",
            "Planaria shows regeneration",
            "ಪ್ಲಾನೇರಿಯಾ ಪುನರುತ್ಪಾದನೆ ತೋರಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Spore",
            "ಬೀಜಕ",
            "ಸೂಕ್ಷ್ಮ ಸಂತಾನೋತ್ಪತ್ತಿ ಘಟಕ",
            "Tiny reproductive unit",
            "Fungi produce spores",
            "ಶಿಲೀಂಧ್ರಗಳು ಬೀಜಕಗಳನ್ನು ಉತ್ಪಾದಿಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Pollination",
            "ಪರಾಗಸ್ಪರ್ಶ",
            "ಪರಾಗವನ್ನು ಹೂವಿನ ಕಾರ್ಪೆಲ್‌ಗೆ ವರ್ಗಾಯಿಸುವುದು",
            "Transfer of pollen to carpel",
            "Bees help in pollination",
            "ಜೇನುನೊಣಗಳು ಪರಾಗಸ್ಪರ್ಶಕ್ಕೆ ಸಹಾಯ ಮಾಡುತ್ತವೆ",
            "Science"
        )
        add(
            "Fertilization",
            "ಫಲೀಕರಣ",
            "ಗ್ಯಾಮೀಟ್‌ಗಳ ಸಂಯೋಗ",
            "Fusion of gametes",
            "Fertilization forms zygote",
            "ಫಲೀಕರಣವು ಜೈಗೋಟ್ ರೂಪಿಸುತ್ತದೆ",
            "Science"
        )

        // Chapter 9: Heredity and Evolution
        add(
            "Heredity",
            "ಅನುವಂಶೀಯತೆ",
            "ಗುಣಲಕ್ಷಣಗಳ ವರ್ಗಾವಣೆ",
            "Transfer of characteristics",
            "Eye color is hereditary",
            "ಕಣ್ಣಿನ ಬಣ್ಣ ಅನುವಂಶೀಯವಾಗಿದೆ",
            "Science"
        )
        add(
            "Gene",
            "ಜೀನ್",
            "ಅನುವಂಶದ ಮೂಲ ಘಟಕ",
            "Basic unit of heredity",
            "Genes determine traits",
            "ಜೀನ್‌ಗಳು ಗುಣಲಕ್ಷಣಗಳನ್ನು ನಿರ್ಧರಿಸುತ್ತವೆ",
            "Science"
        )
        add(
            "DNA",
            "ಡಿಎನ್‌ಎ",
            "ಆನುವಂಶಿಕ ಮಾಹಿತಿಯ ವಾಹಕ",
            "Carrier of genetic information",
            "DNA is double helix",
            "ಡಿಎನ್‌ಎ ಡಬಲ್ ಹೆಲಿಕ್ಸ್ ಆಗಿದೆ",
            "Science"
        )
        add(
            "Chromosome",
            "ಕ್ರೋಮೋಸೋಮ್",
            "ಜೀನ್‌ಗಳ ರಚನೆ",
            "Structure containing genes",
            "Humans have 46 chromosomes",
            "ಮಾನವರಲ್ಲಿ 46 ಕ್ರೋಮೋಸೋಮ್‌ಗಳಿವೆ",
            "Science"
        )
        add(
            "Dominant",
            "ಪ್ರಬಲ",
            "ಯಾವಾಗಲೂ ವ್ಯಕ್ತವಾಗುವ ಗುಣ",
            "Always expressed trait",
            "Tall is dominant over dwarf",
            "ಎತ್ತರವು ಕುಳ್ಳೆತನದ ಮೇಲೆ ಪ್ರಬಲವಾಗಿದೆ",
            "Science"
        )
        add(
            "Recessive",
            "ಅಪ್ರಬಲ",
            "ಮರೆಮಾಚಲ್ಪಟ್ಟ ಗುಣ",
            "Hidden trait",
            "Dwarf is recessive trait",
            "ಕುಳ್ಳೆತನವು ಅಪ್ರಬಲ ಗುಣವಾಗಿದೆ",
            "Science"
        )
        add(
            "Genotype",
            "ಜೀನ್ ಪ್ರಕಾರ",
            "ಆನುವಂಶಿಕ ರಚನೆ",
            "Genetic composition",
            "Genotype determines phenotype",
            "ಜೀನ್ ಪ್ರಕಾರವು ಫೀನೊಟೈಪ್ ನಿರ್ಧರಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Phenotype",
            "ಬಾಹ್ಯ ಲಕ್ಷಣ",
            "ಕಾಣಿಸುವ ಗುಣಲಕ್ಷಣ",
            "Observable characteristic",
            "Tallness is a phenotype",
            "ಎತ್ತರವು ಬಾಹ್ಯ ಲಕ್ಷಣವಾಗಿದೆ",
            "Science"
        )
        add(
            "Evolution",
            "ವಿಕಾಸ",
            "ಕಾಲಾನಂತರದ ಜಾತಿಯ ಬದಲಾವಣೆ",
            "Change in species over time",
            "Darwin's theory explains evolution",
            "ಡಾರ್ವಿನ್ ಸಿದ್ಧಾಂತ ವಿಕಾಸವನ್ನು ವಿವರಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Natural Selection",
            "ನೈಸರ್ಗಿಕ ಆಯ್ಕೆ",
            "ಯೋಗ್ಯರ ಉಳಿವು",
            "Survival of the fittest",
            "Natural selection drives evolution",
            "ನೈಸರ್ಗಿಕ ಆಯ್ಕೆ ವಿಕಾಸವನ್ನು ನಡೆಸುತ್ತದೆ",
            "Science"
        )

        // Chapter 10: Light - Reflection and Refraction
        add(
            "Reflection",
            "ಪ್ರತಿಫಲನ",
            "ಬೆಳಕಿನ ಪುಟಿಯುವಿಕೆ",
            "Bouncing back of light",
            "Mirrors show reflection",
            "ಕನ್ನಡಿಗಳು ಪ್ರತಿಫಲನ ತೋರಿಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Refraction",
            "ವಕ್ರೀಭವನ",
            "ಬೆಳಕಿನ ತಿರುವು",
            "Bending of light",
            "Lenses use refraction",
            "ಮಸೂರಗಳು ವಕ್ರೀಭವನವನ್ನು ಬಳಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Concave Mirror",
            "ಅಂತರ್ಮುಖ ದರ್ಪಣ",
            "ಒಳಮುಖ ಕನ್ನಡಿ",
            "Inward curved mirror",
            "Concave mirrors converge light",
            "ಅಂತರ್ಮುಖ ದರ್ಪಣಗಳು ಬೆಳಕನ್ನು ಒಮ್ಮುಖಗೊಳಿಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Convex Mirror",
            "ಬಹಿರ್ಮುಖ ದರ್ಪಣ",
            "ಹೊರಮುಖ ಕನ್ನಡಿ",
            "Outward curved mirror",
            "Convex mirrors diverge light",
            "ಬಹಿರ್ಮುಖ ದರ್ಪಣಗಳು ಬೆಳಕನ್ನು ಅಪಸರಣಗೊಳಿಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Focal Length",
            "ನಾಭಿದೂರ",
            "ನಾಭಿಯ ದೂರ",
            "Distance to focal point",
            "Focal length determines power",
            "ನಾಭಿದೂರವು ಶಕ್ತಿಯನ್ನು ನಿರ್ಧರಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Lens",
            "ಮಸೂರ",
            "ಪಾರದರ್ಶಕ ವಕ್ರ ಮಾಧ್ಯಮ",
            "Transparent curved medium",
            "Lenses form images",
            "ಮಸೂರಗಳು ಪ್ರತಿಬಿಂಬಗಳನ್ನು ರೂಪಿಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Convex Lens",
            "ಉತ್ತಲ ಮಸೂರ",
            "ಮಧ್ಯದಲ್ಲಿ ದಪ್ಪವಾದ ಮಸೂರ",
            "Lens thicker in middle",
            "Convex lens is converging",
            "ಉತ್ತಲ ಮಸೂರ ಒಮ್ಮುಖಗೊಳಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Concave Lens",
            "ಅಂತಲ ಮಸೂರ",
            "ಅಂಚಿನಲ್ಲಿ ದಪ್ಪವಾದ ಮಸೂರ",
            "Lens thicker at edges",
            "Concave lens is diverging",
            "ಅಂತಲ ಮಸೂರ ಅಪಸರಣಗೊಳಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Power",
            "ಶಕ್ತಿ",
            "ಮಸೂರದ ಒಮ್ಮುಖ/ಅಪಸರಣ ಸಾಮರ್ಥ್ಯ",
            "Converging/diverging ability",
            "Power is measured in dioptre",
            "ಶಕ್ತಿಯನ್ನು ಡಯೊಪ್ಟರ್‌ನಲ್ಲಿ ಅಳೆಯಲಾಗುತ್ತದೆ",
            "Science"
        )
        add(
            "Dispersion",
            "ವಿಕಿರಣ",
            "ಬಿಳಿ ಬೆಳಕಿನ ವರ್ಣಗಳಾಗಿ ವಿಭಜನೆ",
            "Splitting of white light",
            "Prism shows dispersion",
            "ಪ್ರಿಸಂ ವಿಕಿರಣ ತೋರಿಸುತ್ತದೆ",
            "Science"
        )

        // Chapter 11: Human Eye
        add(
            "Cornea",
            "ಕಾರ್ನಿಯಾ",
            "ಕಣ್ಣಿನ ಪಾರದರ್ಶಕ ಮುಂಭಾಗ",
            "Transparent front part of eye",
            "Cornea refracts light",
            "ಕಾರ್ನಿಯಾ ಬೆಳಕನ್ನು ವಕ್ರೀಭವಗೊಳಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Iris",
            "ಐರಿಸ್",
            "ಕಣ್ಣಿನ ಬಣ್ಣದ ಭಾಗ",
            "Colored part of eye",
            "Iris controls pupil size",
            "ಐರಿಸ್ ಪ್ಯೂಪಿಲ್ ಗಾತ್ರವನ್ನು ನಿಯಂತ್ರಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Pupil",
            "ಪ್ಯೂಪಿಲ್",
            "ಕಣ್ಣಿನ ಕಪ್ಪು ರಂಧ್ರ",
            "Black opening in eye",
            "Pupil lets light enter",
            "ಪ್ಯೂಪಿಲ್ ಬೆಳಕು ಪ್ರವೇಶಿಸಲು ಅನುವು ಮಾಡಿಕೊಡುತ್ತದೆ",
            "Science"
        )
        add(
            "Retina",
            "ದೃಷ್ಟಿಪಟಲ",
            "ಕಣ್ಣಿನ ಹಿಂಭಾಗದ ಪರದೆ",
            "Light-sensitive screen of eye",
            "Retina has light receptors",
            "ದೃಷ್ಟಿಪಟಲವು ಬೆಳಕಿನ ಗ್ರಾಹಕಗಳನ್ನು ಹೊಂದಿದೆ",
            "Science"
        )
        add(
            "Accommodation",
            "ಸರಿಹೊಂದಿಕೆ",
            "ಕಣ್ಣಿನ ಮಸೂರದ ನಾಭಿದೂರ ಬದಲಾವಣೆ",
            "Focal length adjustment of eye",
            "Eye shows accommodation",
            "ಕಣ್ಣು ಸರಿಹೊಂದಿಕೆ ತೋರಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Myopia",
            "ಸಮೀಪದೃಷ್ಟಿ",
            "ದೂರದ ವಸ್ತುಗಳು ಸ್ಪಷ್ಟವಾಗಿ ಕಾಣದಿರುವಿಕೆ",
            "Near-sightedness",
            "Myopia needs concave lens",
            "ಸಮೀಪದೃಷ್ಟಿಗೆ ಅಂತಲ ಮಸೂರ ಬೇಕು",
            "Science"
        )
        add(
            "Hypermetropia",
            "ದೂರದೃಷ್ಟಿ",
            "ಹತ್ತಿರದ ವಸ್ತುಗಳು ಸ್ಪಷ್ಟವಾಗಿ ಕಾಣದಿರುವಿಕೆ",
            "Far-sightedness",
            "Hypermetropia needs convex lens",
            "ದೂರದೃಷ್ಟಿಗೆ ಉತ್ತಲ ಮಸೂರ ಬೇಕು",
            "Science"
        )
        add(
            "Presbyopia",
            "ವಯೋ ದೃಷ್ಟಿ",
            "ವಯಸ್ಸಿನಿಂದ ಉಂಟಾಗುವ ದೃಷ್ಟಿ ದೋಷ",
            "Age-related vision defect",
            "Presbyopia occurs in old age",
            "ವಯೋ ದೃಷ್ಟಿ ವೃದ್ಧಾಪ್ಯದಲ್ಲಿ ಉಂಟಾಗುತ್ತದೆ",
            "Science"
        )
        add(
            "Cataract",
            "ಕಣ್ಣಿನ ಕಪ್ಪು",
            "ಮಸೂರದ ಅಪಾರದರ್ಶಕತೆ",
            "Opacity of lens",
            "Cataract causes blindness",
            "ಕಣ್ಣಿನ ಕಪ್ಪು ಕುರುಡುತನಕ್ಕೆ ಕಾರಣ",
            "Science"
        )
        add(
            "Astigmatism",
            "ದೃಷ್ಟಿವಿಕಾರ",
            "ಅಸಮಾನ ವಕ್ರತೆಯ ದೋಷ",
            "Defect due to uneven curvature",
            "Astigmatism blurs vision",
            "ದೃಷ್ಟಿವಿಕಾರವು ದೃಷ್ಟಿಯನ್ನು ಮಂದಗೊಳಿಸುತ್ತದೆ",
            "Science"
        )

        // Chapter 12: Electricity
        add(
            "Current",
            "ವಿದ್ಯುತ್ ಪ್ರವಾಹ",
            "ವಿದ್ಯುದಾವೇಶದ ಹರಿವು",
            "Flow of electric charge",
            "Current flows through wire",
            "ತಂತಿಯ ಮೂಲಕ ಪ್ರವಾಹ ಹರಿಯುತ್ತದೆ",
            "Science"
        )
        add(
            "Voltage",
            "ವಿಭವಾಂತರ",
            "ವಿದ್ಯುತ್ ಒತ್ತಡ",
            "Electric potential difference",
            "Voltage drives current",
            "ವಿಭವಾಂತರವು ಪ್ರವಾಹವನ್ನು ನಡೆಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Resistance",
            "ಪ್ರತಿರೋಧ",
            "ವಿದ್ಯುತ್ ಹರಿವಿಗೆ ಅಡ್ಡಿ",
            "Opposition to current flow",
            "Resistance heats the wire",
            "ಪ್ರತಿರೋಧವು ತಂತಿಯನ್ನು ಬಿಸಿಗೊಳಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Ohm's Law",
            "ಓಂನ ನಿಯಮ",
            "V = IR ಸಂಬಂಧ",
            "V = IR relationship",
            "Ohm's law relates V, I, R",
            "ಓಂನ ನಿಯಮವು V, I, R ಸಂಬಂಧಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Circuit",
            "ಸರ್ಕ್ಯೂಟ್",
            "ವಿದ್ಯುತ್ ಹರಿವಿನ ಮಾರ್ಗ",
            "Path for current flow",
            "Circuit needs closed path",
            "ಸರ್ಕ್ಯೂಟ್‌ಗೆ ಮುಚ್ಚಿದ ಮಾರ್ಗ ಬೇಕು",
            "Science"
        )
        add(
            "Series",
            "ಶ್ರೇಣಿ",
            "ಒಂದರ ನಂತರ ಒಂದು ಜೋಡಣೆ",
            "One after another arrangement",
            "In series, current is same",
            "ಶ್ರೇಣಿಯಲ್ಲಿ ಪ್ರವಾಹ ಸಮಾನವಾಗಿರುತ್ತದೆ",
            "Science"
        )
        add(
            "Parallel",
            "ಸಮಾಂತರ",
            "ಅಕ್ಕ ಪಕ್ಕದ ಜೋಡಣೆ",
            "Side by side arrangement",
            "In parallel, voltage is same",
            "ಸಮಾಂತರದಲ್ಲಿ ವಿಭವ ಸಮಾನವಾಗಿರುತ್ತದೆ",
            "Science"
        )
        add(
            "Heating Effect",
            "ತಾಪನ ಪರಿಣಾಮ",
            "ವಿದ್ಯುತ್‌ನಿಂದ ಶಾಖ ಉತ್ಪತ್ತಿ",
            "Heat production by current",
            "Electric heater uses heating effect",
            "ವಿದ್ಯುತ್ ಹೀಟರ್ ತಾಪನ ಪರಿಣಾಮ ಬಳಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Power",
            "ವಿದ್ಯುತ್ ಶಕ್ತಿ",
            "ಪ್ರತಿ ಸೆಕೆಂಡ್‌ಗೆ ಶಕ್ತಿ ಬಳಕೆ",
            "Energy consumption per second",
            "Power is measured in watt",
            "ಶಕ್ತಿಯನ್ನು ವ್ಯಾಟ್‌ನಲ್ಲಿ ಅಳೆಯಲಾಗುತ್ತದೆ",
            "Science"
        )
        add(
            "Energy",
            "ವಿದ್ಯುತ್ ಶಕ್ತಿ",
            "ಮಾಡಿದ ಕೆಲಸದ ಮೊತ್ತ",
            "Total work done",
            "Energy is measured in joule",
            "ಶಕ್ತಿಯನ್ನು ಜೌಲ್‌ನಲ್ಲಿ ಅಳೆಯಲಾಗುತ್ತದೆ",
            "Science"
        )

        // Chapter 13: Magnetic Effects
        add(
            "Magnetic Field",
            "ಕಾಂತೀಯ ಕ್ಷೇತ್ರ",
            "ಕಾಂತದ ಪ್ರಭಾವದ ಪ್ರದೇಶ",
            "Region of magnetic influence",
            "Compass shows magnetic field",
            "ದಿಕ್ಸೂಚಿ ಕಾಂತೀಯ ಕ್ಷೇತ್ರ ತೋರಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Electromagnet",
            "ವಿದ್ಯುತ್ಕಾಂತ",
            "ವಿದ್ಯುತ್‌ನಿಂದ ಉಂಟಾಗುವ ಕಾಂತ",
            "Magnet produced by electricity",
            "Electromagnets are temporary",
            "ವಿದ್ಯುತ್ಕಾಂತಗಳು ತಾತ್ಕಾಲಿಕವಾಗಿವೆ",
            "Science"
        )
        add(
            "Fleming's Rule",
            "ಫ್ಲೆಮಿಂಗ್ ನಿಯಮ",
            "ಬಲ ದಿಕ್ಕು ಕಂಡುಹಿಡಿಯುವ ನಿಯಮ",
            "Rule to find force direction",
            "Fleming's left hand rule",
            "ಫ್ಲೆಮಿಂಗ್ ಎಡಗೈ ನಿಯಮ",
            "Science"
        )
        add(
            "Generator",
            "ಜನರೇಟರ್",
            "ವಿದ್ಯುತ್ ಉತ್ಪಾದಿಸುವ ಯಂತ್ರ",
            "Machine producing electricity",
            "Generator converts mechanical to electrical",
            "ಜನರೇಟರ್ ಯಾಂತ್ರಿಕವನ್ನು ವಿದ್ಯುತ್‌ಗೆ ಪರಿವರ್ತಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Motor",
            "ಮೋಟಾರ್",
            "ವಿದ್ಯುತ್‌ನಿಂದ ಚಲಿಸುವ ಯಂತ್ರ",
            "Machine running on electricity",
            "Motor converts electrical to mechanical",
            "ಮೋಟಾರ್ ವಿದ್ಯುತ್ ಅನ್ನು ಯಾಂತ್ರಿಕಕ್ಕೆ ಪರಿವರ್ತಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Solenoid",
            "ಸೊಲೆನಾಯಿಡ್",
            "ಸುರುಳಿಯಾಕಾರದ ತಂತಿ",
            "Coil of wire",
            "Solenoid produces magnetic field",
            "ಸೊಲೆನಾಯಿಡ್ ಕಾಂತೀಯ ಕ್ಷೇತ್ರ ಉತ್ಪಾದಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Galvanometer",
            "ಗ್ಯಾಲ್ವಾನೋಮೀಟರ್",
            "ವಿದ್ಯುತ್ ಪ್ರವಾಹ ಅಳೆಯುವ ಯಂತ್ರ",
            "Device measuring current",
            "Galvanometer detects small current",
            "ಗ್ಯಾಲ್ವಾನೋಮೀಟರ್ ಸಣ್ಣ ಪ್ರವಾಹ ಪತ್ತೆಹಚ್ಚುತ್ತದೆ",
            "Science"
        )
        add(
            "Fuse",
            "ಫ್ಯೂಸ್",
            "ಸುರಕ್ಷತಾ ಸಾಧನ",
            "Safety device",
            "Fuse prevents overloading",
            "ಫ್ಯೂಸ್ ಅತಿಯಾದ ಹೊರೆಯನ್ನು ತಡೆಯುತ್ತದೆ",
            "Science"
        )
        add(
            "Short Circuit",
            "ಶಾರ್ಟ್ ಸರ್ಕ್ಯೂಟ್",
            "ನೇರ ಸಂಪರ್ಕದಿಂದ ಹೆಚ್ಚಿನ ಪ್ರವಾಹ",
            "High current due to direct contact",
            "Short circuit causes fire",
            "ಶಾರ್ಟ್ ಸರ್ಕ್ಯೂಟ್ ಬೆಂಕಿಗೆ ಕಾರಣವಾಗುತ್ತದೆ",
            "Science"
        )
        add(
            "Earthing",
            "ಭೂಸಂಪರ್ಕ",
            "ವಿದ್ಯುತ್ ಸಾಧನವನ್ನು ಭೂಮಿಗೆ ಜೋಡಿಸುವುದು",
            "Connecting device to earth",
            "Earthing provides safety",
            "ಭೂಸಂಪರ್ಕ ಸುರಕ್ಷತೆ ನೀಡುತ್ತದೆ",
            "Science"
        )

        // Chapter 14: Sources of Energy
        add(
            "Renewable",
            "ನವೀಕರಿಸಬಹುದಾದ",
            "ಮತ್ತೆ ಪಡೆಯಬಹುದಾದ ಶಕ್ತಿ",
            "Energy that can be replenished",
            "Solar energy is renewable",
            "ಸೌರ ಶಕ್ತಿಯು ನವೀಕರಿಸಬಹುದಾದದ್ದು",
            "Science"
        )
        add(
            "Non-renewable",
            "ನವೀಕರಿಸಲಾಗದ",
            "ಮತ್ತೆ ಪಡೆಯಲು ಸಾಧ್ಯವಿಲ್ಲದ ಶಕ್ತಿ",
            "Energy that cannot be replenished",
            "Coal is non-renewable",
            "ಕಲ್ಲಿದ್ದಲು ನವೀಕರಿಸಲಾಗದದ್ದು",
            "Science"
        )
        add(
            "Fossil Fuel",
            "ಪಳೆಯುಳಿಕೆ ಇಂಧನ",
            "ಪುರಾತನ ಜೀವಿಗಳಿಂದ ಉಂಟಾದ ಇಂಧನ",
            "Fuel from ancient organisms",
            "Petrol is a fossil fuel",
            "ಪೆಟ್ರೋಲ್ ಪಳೆಯುಳಿಕೆ ಇಂಧನವಾಗಿದೆ",
            "Science"
        )
        add(
            "Solar Energy",
            "ಸೌರ ಶಕ್ತಿ",
            "ಸೂರ್ಯನಿಂದ ಬರುವ ಶಕ್ತಿ",
            "Energy from sun",
            "Solar panels use solar energy",
            "ಸೌರ ಫಲಕಗಳು ಸೌರ ಶಕ್ತಿ ಬಳಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Wind Energy",
            "ಗಾಳಿ ಶಕ್ತಿ",
            "ಗಾಳಿಯಿಂದ ಬರುವ ಶಕ್ತಿ",
            "Energy from wind",
            "Windmills generate wind energy",
            "ಗಾಳಿಯಂತ್ರಗಳು ಗಾಳಿ ಶಕ್ತಿ ಉತ್ಪಾದಿಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Hydroelectric",
            "ಜಲವಿದ್ಯುತ್",
            "ನೀರಿನಿಂದ ಉತ್ಪನ್ನವಾಗುವ ವಿದ್ಯುತ್",
            "Electricity from water",
            "Dams produce hydroelectric power",
            "ಅಣೆಕಟ್ಟುಗಳು ಜಲವಿದ್ಯುತ್ ಉತ್ಪಾದಿಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Geothermal",
            "ಭೂಉಷ್ಣ",
            "ಭೂಮಿಯ ಒಳಗಿನ ಶಾಖ",
            "Heat from inside earth",
            "Geothermal energy is clean",
            "ಭೂಉಷ್ಣ ಶಕ್ತಿಯು ಶುದ್ಧವಾಗಿದೆ",
            "Science"
        )
        add(
            "Biomass",
            "ಜೈವಿಕ ದ್ರವ್ಯರಾಶಿ",
            "ಸಸ್ಯ ಮತ್ತು ಪ್ರಾಣಿ ತ್ಯಾಜ್ಯ",
            "Plant and animal waste",
            "Biomass gives energy",
            "ಜೈವಿಕ ದ್ರವ್ಯರಾಶಿ ಶಕ್ತಿ ನೀಡುತ್ತದೆ",
            "Science"
        )
        add(
            "Nuclear Energy",
            "ಪರಮಾಣು ಶಕ್ತಿ",
            "ಪರಮಾಣು ವಿದಳನದಿಂದ ಶಕ್ತಿ",
            "Energy from nuclear fission",
            "Nuclear power plants use uranium",
            "ಪರಮಾಣು ವಿದ್ಯುತ್ ಘಟಕಗಳು ಯುರೇನಿಯಂ ಬಳಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Biogas",
            "ಜೈವಿಕ ಅನಿಲ",
            "ಜೈವಿಕ ತ್ಯಾಜ್ಯದಿಂದ ಅನಿಲ",
            "Gas from biological waste",
            "Biogas is eco-friendly",
            "ಜೈವಿಕ ಅನಿಲವು ಪರಿಸರ ಸ್ನೇಹಿಯಾಗಿದೆ",
            "Science"
        )

        // Chapter 15: Environment
        add(
            "Ecosystem",
            "ಪರಿಸರ ವ್ಯವಸ್ಥೆ",
            "ಜೀವಿಗಳು ಮತ್ತು ಅವುಗಳ ಪರಿಸರದ ಸಂಪರ್ಕ",
            "Organisms and their environment",
            "Forest is an ecosystem",
            "ಅರಣ್ಯವು ಪರಿಸರ ವ್ಯವಸ್ಥೆಯಾಗಿದೆ",
            "Science"
        )
        add(
            "Biodegradable",
            "ಜೈವಿಕ ವಿಭಜನೀಯ",
            "ಸೂಕ್ಷ್ಮಜೀವಿಗಳಿಂದ ಕೊಳೆಯಬಲ್ಲದು",
            "Can be decomposed by microbes",
            "Paper is biodegradable",
            "ಕಾಗದವು ಜೈವಿಕ ವಿಭಜನೀಯವಾಗಿದೆ",
            "Science"
        )
        add(
            "Non-biodegradable",
            "ಜೈವಿಕ ಅವಿಭಜನೀಯ",
            "ಕೊಳೆಯದ ಪದಾರ್ಥ",
            "Cannot be decomposed",
            "Plastic is non-biodegradable",
            "ಪ್ಲಾಸ್ಟಿಕ್ ಜೈವಿಕ ಅವಿಭಜನೀಯವಾಗಿದೆ",
            "Science"
        )
        add(
            "Ozone Layer",
            "ಓಝೋನ್ ಪದರ",
            "ವಾತಾವರಣದಲ್ಲಿನ ರಕ್ಷಣಾ ಪದರ",
            "Protective layer in atmosphere",
            "Ozone layer blocks UV rays",
            "ಓಝೋನ್ ಪದರವು UV ಕಿರಣಗಳನ್ನು ತಡೆಯುತ್ತದೆ",
            "Science"
        )
        add(
            "Food Chain",
            "ಆಹಾರ ಸರಪಳಿ",
            "ಆಹಾರದ ವರ್ಗಾವಣೆಯ ಸರಪಳಿ",
            "Chain of food transfer",
            "Grass-deer-tiger is food chain",
            "ಹುಲ್ಲು-ಜಿಂಕೆ-ಹುಲಿ ಆಹಾರ ಸರಪಳಿಯಾಗಿದೆ",
            "Science"
        )
        add(
            "Food Web",
            "ಆಹಾರ ಜಾಲ",
            "ಹಲವು ಆಹಾರ ಸರಪಳಿಗಳ ಜಾಲ",
            "Network of food chains",
            "Food web is complex",
            "ಆಹಾರ ಜಾಲವು ಸಂಕೀರ್ಣವಾಗಿದೆ",
            "Science"
        )
        add(
            "Producer",
            "ಉತ್ಪಾದಕ",
            "ತಾನೇ ಆಹಾರ ತಯಾರಿಸುವವರು",
            "Organisms making own food",
            "Plants are producers",
            "ಸಸ್ಯಗಳು ಉತ್ಪಾದಕಗಳಾಗಿವೆ",
            "Science"
        )
        add(
            "Consumer",
            "ಗ್ರಾಹಕ",
            "ಇತರರಿಂದ ಆಹಾರ ಪಡೆಯುವವರು",
            "Organisms depending on others",
            "Animals are consumers",
            "ಪ್ರಾಣಿಗಳು ಗ್ರಾಹಕಗಳಾಗಿವೆ",
            "Science"
        )
        add(
            "Decomposer",
            "ವಿಯೋಜಕ",
            "ಮೃತ ಪದಾರ್ಥಗಳನ್ನು ವಿಘಟಿಸುವವರು",
            "Organisms breaking down dead matter",
            "Bacteria are decomposers",
            "ಬ್ಯಾಕ್ಟೀರಿಯಾಗಳು ವಿಯೋಜಕಗಳಾಗಿವೆ",
            "Science"
        )
        add(
            "Trophic Level",
            "ಪೋಷಕ ಮಟ್ಟ",
            "ಆಹಾರ ಸರಪಳಿಯಲ್ಲಿನ ಸ್ಥಾನ",
            "Position in food chain",
            "Producers are first trophic level",
            "ಉತ್ಪಾದಕಗಳು ಮೊದಲ ಪೋಷಕ ಮಟ್ಟ",
            "Science"
        )
        add(
            "Pollution",
            "ಮಾಲಿನ್ಯ",
            "ಪರಿಸರದ ಕಲುಷಿತಗೊಳಿಕೆ",
            "Contamination of environment",
            "Air pollution harms health",
            "ವಾಯು ಮಾಲಿನ್ಯವು ಆರೋಗ್ಯಕ್ಕೆ ಹಾನಿ",
            "Science"
        )

        // Additional 100 Science terms to complete 200
        add(
            "Velocity",
            "ವೇಗ",
            "ಒಂದು ದಿಕ್ಕಿನಲ್ಲಿ ವೇಗ",
            "Speed in a direction",
            "Velocity is a vector quantity",
            "ವೇಗವು ಸದಿಶ ರಾಶಿಯಾಗಿದೆ",
            "Science"
        )
        add(
            "Acceleration",
            "ವೇಗವರ್ಧನೆ",
            "ವೇಗದಲ್ಲಿನ ಬದಲಾವಣೆಯ ದರ",
            "Rate of change of velocity",
            "Car shows acceleration",
            "ಕಾರು ವೇಗವರ್ಧನೆ ತೋರಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Force",
            "ಬಲ",
            "ತಳ್ಳುವಿಕೆ ಅಥವಾ ಎಳೆಯುವಿಕೆ",
            "Push or pull",
            "Force changes motion",
            "ಬಲವು ಚಲನೆಯನ್ನು ಬದಲಾಯಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Momentum",
            "ಆವೇಗ",
            "ದ್ರವ್ಯರಾಶಿ ಮತ್ತು ವೇಗದ ಗುಣಲಬ್ಧ",
            "Product of mass and velocity",
            "Momentum is conserved",
            "ಆವೇಗವು ಸಂರಕ್ಷಿತವಾಗಿದೆ",
            "Science"
        )
        add(
            "Gravity",
            "ಗುರುತ್ವಾಕರ್ಷಣೆ",
            "ಭೂಮಿಯ ಎಳೆಯುವ ಬಲ",
            "Earth's pulling force",
            "Gravity keeps us grounded",
            "ಗುರುತ್ವಾಕರ್ಷಣೆ ನಮ್ಮನ್ನು ನೆಲದಲ್ಲಿ ಇಡುತ್ತದೆ",
            "Science"
        )
        add(
            "Friction",
            "ಘರ್ಷಣೆ",
            "ಚಲನೆಗೆ ವಿರೋಧಿಸುವ ಬಲ",
            "Force opposing motion",
            "Friction produces heat",
            "ಘರ್ಷಣೆ ಶಾಖ ಉತ್ಪಾದಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Pressure",
            "ಒತ್ತಡ",
            "ಪ್ರತಿ ಘಟಕ ವಿಸ್ತೀರ್ಣಕ್ಕೆ ಬಲ",
            "Force per unit area",
            "Pressure increases with depth",
            "ಆಳದೊಂದಿಗೆ ಒತ್ತಡ ಹೆಚ್ಚಾಗುತ್ತದೆ",
            "Science"
        )
        add(
            "Density",
            "ಸಾಂದ್ರತೆ",
            "ಪ್ರತಿ ಘಟಕ ಪರಿಮಾಣಕ್ಕೆ ದ್ರವ್ಯರಾಶಿ",
            "Mass per unit volume",
            "Iron has high density",
            "ಕಬ್ಬಿಣವು ಹೆಚ್ಚಿನ ಸಾಂದ್ರತೆ ಹೊಂದಿದೆ",
            "Science"
        )
        add(
            "Buoyancy",
            "ತೇಲುವಿಕೆ",
            "ದ್ರವದಲ್ಲಿ ಮೇಲಕ್ಕೆ ತಳ್ಳುವ ಬಲ",
            "Upward force in fluid",
            "Ships float due to buoyancy",
            "ಹಡಗುಗಳು ತೇಲುವಿಕೆಯಿಂದ ತೇಲುತ್ತವೆ",
            "Science"
        )
        add(
            "Work",
            "ಕೆಲಸ",
            "ಬಲ ಮತ್ತು ಸ್ಥಳಾಂತರದ ಗುಣಲಬ್ಧ",
            "Product of force and displacement",
            "Work is energy transfer",
            "ಕೆಲಸವು ಶಕ್ತಿ ವರ್ಗಾವಣೆಯಾಗಿದೆ",
            "Science"
        )
        add(
            "Kinetic Energy",
            "ಚಾಲಕ ಶಕ್ತಿ",
            "ಚಲನೆಯಿಂದಾಗಿ ಶಕ್ತಿ",
            "Energy due to motion",
            "Moving car has kinetic energy",
            "ಚಲಿಸುವ ಕಾರಿಗೆ ಚಾಲಕ ಶಕ್ತಿ ಇದೆ",
            "Science"
        )
        add(
            "Potential Energy",
            "ಸ್ಥಿತಿ ಶಕ್ತಿ",
            "ಸ್ಥಾನದಿಂದಾಗಿ ಶಕ್ತಿ",
            "Energy due to position",
            "Water in dam has potential energy",
            "ಅಣೆಕಟ್ಟಿನ ನೀರಿಗೆ ಸ್ಥಿತಿ ಶಕ್ತಿ ಇದೆ",
            "Science"
        )
        add(
            "Joule",
            "ಜೌಲ್",
            "ಶಕ್ತಿಯ ಘಟಕ",
            "Unit of energy",
            "One joule is small energy",
            "ಒಂದು ಜೌಲ್ ಸಣ್ಣ ಶಕ್ತಿಯಾಗಿದೆ",
            "Science"
        )
        add(
            "Watt",
            "ವ್ಯಾಟ್",
            "ಶಕ್ತಿಯ ಘಟಕ",
            "Unit of power",
            "Bulb is rated in watts",
            "ಬಲ್ಬ್ ಅನ್ನು ವ್ಯಾಟ್‌ನಲ್ಲಿ ಅಳೆಯಲಾಗುತ್ತದೆ",
            "Science"
        )
        add(
            "Newton",
            "ನ್ಯೂಟನ್",
            "ಬಲದ ಘಟಕ",
            "Unit of force",
            "Weight is measured in newtons",
            "ತೂಕವನ್ನು ನ್ಯೂಟನ್‌ನಲ್ಲಿ ಅಳೆಯಲಾಗುತ್ತದೆ",
            "Science"
        )
        add(
            "Pascal",
            "ಪ್ಯಾಸ್ಕಲ್",
            "ಒತ್ತಡದ ಘಟಕ",
            "Unit of pressure",
            "Atmospheric pressure in pascals",
            "ವಾಯುಮಂಡಲದ ಒತ್ತಡ ಪ್ಯಾಸ್ಕಲ್‌ನಲ್ಲಿ",
            "Science"
        )
        add(
            "Hertz",
            "ಹರ್ಟ್ಜ್",
            "ಆವರ್ತನದ ಘಟಕ",
            "Unit of frequency",
            "Sound frequency in hertz",
            "ಧ್ವನಿ ಆವರ್ತನ ಹರ್ಟ್ಜ್‌ನಲ್ಲಿ",
            "Science"
        )
        add(
            "Wavelength",
            "ತರಂಗಾಂತರ",
            "ಎರಡು ಶಿಖರಗಳ ನಡುವಿನ ಅಂತರ",
            "Distance between two peaks",
            "Light has short wavelength",
            "ಬೆಳಕಿಗೆ ಕಿರಿದಾದ ತರಂಗಾಂತರವಿದೆ",
            "Science"
        )
        add(
            "Frequency",
            "ಆವರ್ತನ",
            "ಪ್ರತಿ ಸೆಕೆಂಡ್‌ಗೆ ತರಂಗಗಳ ಸಂಖ್ಯೆ",
            "Number of waves per second",
            "Radio has high frequency",
            "ರೇಡಿಯೊ ಹೆಚ್ಚಿನ ಆವರ್ತನ ಹೊಂದಿದೆ",
            "Science"
        )
        add(
            "Amplitude",
            "ಆಯಾಮ",
            "ತರಂಗದ ಗರಿಷ್ಠ ಸ್ಥಳಾಂತರ",
            "Maximum displacement of wave",
            "Loudness depends on amplitude",
            "ಜೋರಾಗಿರುವಿಕೆ ಆಯಾಮದ ಮೇಲೆ ಅವಲಂಬಿತವಾಗಿದೆ",
            "Science"
        )
        add(
            "Sound",
            "ಧ್ವನಿ",
            "ಕಿವಿಗೆ ಕೇಳಿಸುವ ಕಂಪನ",
            "Vibration that can be heard",
            "Sound travels through medium",
            "ಧ್ವನಿಯು ಮಾಧ್ಯಮದ ಮೂಲಕ ಚಲಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Ultrasound",
            "ಅಲ್ಟ್ರಾಸೌಂಡ್",
            "ಮಾನವ ಕಿವಿಗೆ ಕೇಳಿಸದ ಹೆಚ್ಚಿನ ಆವರ್ತನದ ಧ್ವನಿ",
            "Sound above human hearing",
            "Bats use ultrasound",
            "ಬಾವಲಿಗಳು ಅಲ್ಟ್ರಾಸೌಂಡ್ ಬಳಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Infrasound",
            "ಇನ್ಫ್ರಾಸೌಂಡ್",
            "ಮಾನವ ಕಿವಿಗೆ ಕೇಳಿಸದ ಕಡಿಮೆ ಆವರ್ತನದ ಧ್ವನಿ",
            "Sound below human hearing",
            "Elephants use infrasound",
            "ಆನೆಗಳು ಇನ್ಫ್ರಾಸೌಂಡ್ ಬಳಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Echo",
            "ಪ್ರತಿಧ್ವನಿ",
            "ಧ್ವನಿಯ ಪ್ರತಿಫಲನ",
            "Reflection of sound",
            "Echo is heard in mountains",
            "ಪರ್ವತಗಳಲ್ಲಿ ಪ್ರತಿಧ್ವನಿ ಕೇಳಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Sonar",
            "ಸೋನಾರ್",
            "ಧ್ವನಿಯಿಂದ ಅಂತರ ಕಂಡುಹಿಡಿಯುವ ತಂತ್ರಜ್ಞಾನ",
            "Technology using sound to find distance",
            "Ships use sonar",
            "ಹಡಗುಗಳು ಸೋನಾರ್ ಬಳಸುತ್ತವೆ",
            "Science"
        )
        add(
            "Magnet",
            "ಕಾಂತ",
            "ಕಬ್ಬಿಣವನ್ನು ಎಳೆಯುವ ವಸ್ತು",
            "Object attracting iron",
            "Magnet has two poles",
            "ಕಾಂತಕ್ಕೆ ಎರಡು ಧ್ರುವಗಳಿವೆ",
            "Science"
        )
        add(
            "Pole",
            "ಧ್ರುವ",
            "ಕಾಂತದ ತುದಿ",
            "End of magnet",
            "North and south are poles",
            "ಉತ್ತರ ಮತ್ತು ದಕ್ಷಿಣ ಧ್ರುವಗಳಾಗಿವೆ",
            "Science"
        )
        add(
            "Spectrum",
            "ವರ್ಣಪಟಲ",
            "ಬೆಳಕಿನ ಬಣ್ಣಗಳ ಶ್ರೇಣಿ",
            "Range of colors in light",
            "Rainbow shows spectrum",
            "ಮಳೆಬಿಲ್ಲು ವರ್ಣಪಟಲ ತೋರಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Prism",
            "ಪ್ರಿಸಂ",
            "ಬೆಳಕನ್ನು ವರ್ಣಗಳಾಗಿ ವಿಭಜಿಸುವ ಗಾಜು",
            "Glass splitting light into colors",
            "Prism forms spectrum",
            "ಪ್ರಿಸಂ ವರ್ಣಪಟಲ ರೂಪಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Ray",
            "ಕಿರಣ",
            "ಬೆಳಕಿನ ನೇರ ಮಾರ್ಗ",
            "Straight path of light",
            "Light travels in rays",
            "ಬೆಳಕು ಕಿರಣಗಳಲ್ಲಿ ಚಲಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Beam",
            "ಬೆಳಕಿನ ಕಿರಣಗುಚ್ಛ",
            "ಬೆಳಕಿನ ಕಿರಣಗಳ ಸಮೂಹ",
            "Group of light rays",
            "Torch produces light beam",
            "ಟಾರ್ಚ್ ಬೆಳಕಿನ ಕಿರಣಗುಚ್ಛ ಉತ್ಪಾದಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Shadow",
            "ನೆರಳು",
            "ಬೆಳಕು ತಡೆಯಲ್ಪಟ್ಟಾಗ ರೂಪುಗೊಳ್ಳುವ ಕತ್ತಲೆ",
            "Dark area when light blocked",
            "Tree casts shadow",
            "ಮರವು ನೆರಳು ರೂಪಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Eclipse",
            "ಗ್ರಹಣ",
            "ಒಂದು ಖಗೋಲ ಪಿಂಡವು ಇನ್ನೊಂದನ್ನು ಮರೆಮಾಡುವುದು",
            "One celestial body hiding another",
            "Solar eclipse is rare",
            "ಸೂರ್ಯಗ್ರಹಣ ಅಪರೂಪವಾಗಿದೆ",
            "Science"
        )
        add(
            "Phase",
            "ಹಂತ",
            "ಚಂದ್ರನ ಕಾಣಿಸುವ ರೂಪ",
            "Appearance of moon",
            "Full moon is a phase",
            "ಹುಣ್ಣಿಮೆ ಒಂದು ಹಂತವಾಗಿದೆ",
            "Science"
        )
        add(
            "Satellite",
            "ಉಪಗ್ರಹ",
            "ಗ್ರಹದ ಸುತ್ತ ಸುತ್ತುವ ಖಗೋಲ ಪಿಂಡ",
            "Body orbiting a planet",
            "Moon is Earth's satellite",
            "ಚಂದ್ರ ಭೂಮಿಯ ಉಪಗ್ರಹ",
            "Science"
        )
        add(
            "Orbit",
            "ಕಕ್ಷೆ",
            "ಖಗೋಲ ಪಿಂಡದ ಸುತ್ತಿನ ಮಾರ್ಗ",
            "Circular path around celestial body",
            "Earth's orbit is elliptical",
            "ಭೂಮಿಯ ಕಕ್ಷೆಯು ದೀರ್ಘವೃತ್ತಾಕಾರವಾಗಿದೆ",
            "Science"
        )
        add(
            "Constellation",
            "ನಕ್ಷತ್ರಪುಂಜ",
            "ನಕ್ಷತ್ರಗಳ ಗುಂಪು",
            "Group of stars",
            "Orion is a constellation",
            "ಒರಿಯನ್ ಒಂದು ನಕ್ಷತ್ರಪುಂಜವಾಗಿದೆ",
            "Science"
        )
        add(
            "Meteor",
            "ಉಲ್ಕೆ",
            "ವಾತಾವರಣದಲ್ಲಿ ಉರಿಯುವ ಬಂಡೆ",
            "Rock burning in atmosphere",
            "Meteor creates streak",
            "ಉಲ್ಕೆಯು ಗೆರೆ ರೂಪಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Asteroid",
            "ಕ್ಷುದ್ರಗ್ರಹ",
            "ಗ್ರಹಗಳ ನಡುವಿನ ಸಣ್ಣ ಬಂಡೆ",
            "Small rock between planets",
            "Asteroids orbit the sun",
            "ಕ್ಷುದ್ರಗ್ರಹಗಳು ಸೂರ್ಯನ ಸುತ್ತ ಸುತ್ತುತ್ತವೆ",
            "Science"
        )
        add(
            "Comet",
            "ಧೂಮಕೇತು",
            "ಬಾಲವುಳ್ಳ ಹಿಮದ ಖಗೋಲ ಪಿಂಡ",
            "Icy body with tail",
            "Halley's comet is famous",
            "ಹ್ಯಾಲೆಯ ಧೂಮಕೇತು ಪ್ರಸಿದ್ಧವಾಗಿದೆ",
            "Science"
        )
        add(
            "Telescope",
            "ದೂರದರ್ಶಕ",
            "ದೂರದ ವಸ್ತುಗಳನ್ನು ನೋಡುವ ಯಂತ್ರ",
            "Device to see distant objects",
            "Telescope magnifies stars",
            "ದೂರದರ್ಶಕವು ನಕ್ಷತ್ರಗಳನ್ನು ವರ್ಧಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Microscope",
            "ಸೂಕ್ಷ್ಮದರ್ಶಕ",
            "ಸೂಕ್ಷ್ಮ ವಸ್ತುಗಳನ್ನು ನೋಡುವ ಯಂತ್ರ",
            "Device to see tiny objects",
            "Microscope shows cells",
            "ಸೂಕ್ಷ್ಮದರ್ಶಕವು ಜೀವಕೋಶಗಳನ್ನು ತೋರಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Cell Membrane",
            "ಜೀವಕೋಶ ಪೊರೆ",
            "ಜೀವಕೋಶದ ಹೊರ ಪದರ",
            "Outer layer of cell",
            "Cell membrane is selective",
            "ಜೀವಕೋಶ ಪೊರೆ ಆಯ್ದವಾಗಿದೆ",
            "Science"
        )
        add(
            "Cytoplasm",
            "ಜೀವದ್ರವ್ಯ",
            "ಜೀವಕೋಶದ ದ್ರವ ವಿಷಯ",
            "Liquid content of cell",
            "Cytoplasm has organelles",
            "ಜೀವದ್ರವ್ಯವು ಅಂಗಕಗಳನ್ನು ಹೊಂದಿದೆ",
            "Science"
        )
        add(
            "Organelle",
            "ಅಂಗಕ",
            "ಜೀವಕೋಶದ ಸಣ್ಣ ಭಾಗ",
            "Small part of cell",
            "Mitochondria is an organelle",
            "ಮೈಟೊಕಾಂಡ್ರಿಯಾ ಅಂಗಕವಾಗಿದೆ",
            "Science"
        )
        add(
            "Vacuole",
            "ರಸಧಾನಿ",
            "ಜೀವಕೋಶದ ಶೇಖರಣಾ ಚೀಲ",
            "Storage sac in cell",
            "Plant cells have large vacuole",
            "ಸಸ್ಯ ಜೀವಕೋಶಗಳಿಗೆ ದೊಡ್ಡ ರಸಧಾನಿ ಇದೆ",
            "Science"
        )
        add(
            "Ribosome",
            "ರೈಬೋಸೋಮ್",
            "ಪ್ರೋಟೀನ್ ತಯಾರಿಸುವ ಅಂಗಕ",
            "Organelle making protein",
            "Ribosomes are protein factories",
            "ರೈಬೋಸೋಮ್‌ಗಳು ಪ್ರೋಟೀನ್ ಕಾರ್ಖಾನೆಗಳಾಗಿವೆ",
            "Science"
        )
        add(
            "Golgi Body",
            "ಗೊಲ್ಗಿ ಕಾಯ",
            "ಪದಾರ್ಥಗಳನ್ನು ಸಂಗ್ರಹಿಸಿ ಕಳುಹಿಸುವ ಅಂಗಕ",
            "Organelle packaging substances",
            "Golgi body modifies proteins",
            "ಗೊಲ್ಗಿ ಕಾಯವು ಪ್ರೋಟೀನ್‌ಗಳನ್ನು ಮಾರ್ಪಡಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Endoplasmic Reticulum",
            "ಅಂತರ್ದ್ರವ್ಯ ಜಾಲ",
            "ಪದಾರ್ಥಗಳ ಸಾರಿಗೆ ಜಾಲ",
            "Network for transport in cell",
            "ER transports materials",
            "ಅಂತರ್ದ್ರವ್ಯ ಜಾಲವು ವಸ್ತುಗಳನ್ನು ಸಾರಿಸುತ್ತದೆ",
            "Science"
        )
        add(
            "Lysosome",
            "ಲೈಸೋಸೋಮ್",
            "ಕೋಶದ ಹಾನಿಯಾದ ಭಾಗಗಳನ್ನು ಜೀರ್ಣಿಸುವ ಅಂಗಕ",
            "Organelle digesting waste",
            "Lysosomes clean the cell",
            "ಲೈಸೋಸೋಮ್‌ಗಳು ಜೀವಕೋಶವನ್ನು ಸ್ವಚ್ಛಗೊಳಿಸುತ್ತವೆ",
            "Science"
        )
        // --- COMMERCE (200 Terms) ---
        // Chapter 1: Accounting Basics
        add(
            "Accounting",
            "ಲೆಕ್ಕ ನಿರ್ವಹಣೆ",
            "ಆರ್ಥಿಕ ಸ್ಥಿತಿಯ ಬರಹದ ವಿಜ್ಞಾನ.",
            "Science of recording financial information.",
            "Accounting helps track business finances.",
            "ಲೆಕ್ಕ ನಿರ್ವಹಣೆ ವ್ಯವಹಾರದ ಆರ್ಥಿಕತೆಯನ್ನು ಪತ್ತೆ ಮಾಡಲು ಸಹಾಯ ಮಾಡುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Journal",
            "ದೈನಂದಿನಿ / ಖಾತೆ ಪತ್ರಿಕೆ",
            "ಎಲ್ಲಾ ಲೆನ್ದೇನಿಗಳನ್ನು ಮೊದಲು ದಾಖಲೆ ಮಾಡುವ ಸ್ಥಳ.",
            "First book of accounts.",
            "Daily transactions go in the journal.",
            "ದೈನಂದಿನಿ ಲೆನ್ದೇನಿಗಳನ್ನು ದಾಖಲೆ ಮಾಡುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Ledger",
            "ಖಾತೆ ಬಹಿ",
            "ನಿರ್ದಿಷ್ಟ ವಿಷಯ ಅಥವಾ ವ್ಯಕ್ತಿಯ ಎಲ್ಲಾ ಲೆನ್ದೇನಿಗಳು.",
            "Book of accounts.",
            "The ledger shows all transactions.",
            "ಖಾತೆ ಬಹಿ ಎಲ್ಲಾ ಲೆನ್ದೇನಿಗಳನ್ನು ತೋರಿಸುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Trial Balance",
            "ಪರೀಕ್ಷಾ ಸಾರ",
            "ಎಲ್ಲಾ ಖಾತೆಗಳ ಬಿಡಿ ಮತ್ತು ಸಾಲ ಪಾರ್ಶ್ವದ ಮೊತ್ತ.",
            "Check of account accuracy.",
            "Trial balance proves accuracy.",
            "ಪರೀಕ್ಷಾ ಸಾರ ನಿಖರತೆಯನ್ನು ಸಾಬೀತುಪಡಿಸುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Balance Sheet",
            "ತೂಲನ ಪತ್ರ",
            "ಒಂದು ನಿರ್ದಿಷ್ಟ ದಿನದಲ್ಲಿ ಸಂಸ್ಥೆಯ ಆಸ್ತಿ ಮತ್ತು ಹೊಣೆಗಾರಿಕೆಯನ್ನು ತೋರಿಸುವ ಹೇಳಿಕೆ.",
            "Financial position statement.",
            "Balance sheet shows company's worth.",
            "ತೂಲನ ಪತ್ರ ಕಂಪನಿಯ ಮೌಲ್ಯವನ್ನು ತೋರಿಸುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Income Statement",
            "ಆದಾಯ ಹೇಳಿಕೆ / ಲಾಭನಷ್ಟ ಖಾತೆ",
            "ನಿರ್ದಿಷ್ಟ ಅವಧಿಯಲ್ಲಿ ಲಾಭ ಮತ್ತು ನಷ್ಟ ತೋರಿಸುವ ಖಾತೆ.",
            "Shows profit and loss.",
            "Income statement shows profitability.",
            "ಆದಾಯ ಹೇಳಿಕೆ ಲಾಭ ಸಾಮರ್ಥ್ಯವನ್ನು ತೋರಿಸುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Debit",
            "ಖೋತ",
            "ಖಾತೆಯ ಎಡಭಾಗದಿಂದ ಆರ್ಥಿಕತೆ.",
            "Left side of account.",
            "Debit increases assets.",
            "ಖೋತ ಆಸ್ತಿಯನ್ನು ಹೆಚ್ಚಿಸುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Credit",
            "ಜಮೆ",
            "ಖಾತೆಯ ಬಲಭಾಗದಿಂದ ಆರ್ಥಿಕತೆ.",
            "Right side of account.",
            "Credit decreases assets.",
            "ಜಮೆ ಆಸ್ತಿಯನ್ನು ಕಡಿಮೆ ಮಾಡುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Double Entry",
            "ಎರಡು ಮುಖ್ಯ ಪ್ರವಿಷ್ಟಿ",
            "ಪ್ರತಿಯೊಂದು ಲೆನ್ದೇನಿ ಎರಡು ಖಾತೆಗಳಿಗೆ ಪ್ರಭಾವ ಬೀರುತ್ತದೆ.",
            "Two accounts per transaction.",
            "Double entry keeps accounts balanced.",
            "ಎರಡು ಮುಖ್ಯ ಪ್ರವಿಷ್ಟಿ ಖಾತೆಗಳನ್ನು ಸಮತೋಲಿತ ಮಾಡುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Golden Rule",
            "ಸ್ವರ್ಣ ನಿಯಮ",
            "ಲೆಕ್ಕ ನಿರ್ವಹಣೆಯ ಮೂಲ ನಿಯಮಗಳು.",
            "Basic accounting principles.",
            "Follow the golden rule.",
            "ಸ್ವರ್ಣ ನಿಯಮವನ್ನು ಅನುಸರಿಸಿ.",
            "Commerce"
        )

        // Chapter 2: Business & Trade
        add(
            "Inflation",
            "ಹಣದುಬ್ಬರ",
            "ವಸ್ತುಗಳ ಬೆಲೆ ಹೆಚ್ಚಾಗಿ ಹಣದ ಮೌಲ್ಯ ಕಡಿಮೆಯಾಗುವ ಸ್ಥಿತಿ.",
            "Prices going up.",
            "Inflation makes items more expensive.",
            "ಹಣದುಬ್ಬರವು ವಸ್ತುಗಳನ್ನು ದುಬಾರಿಯಾಗಿಸುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Liability",
            "ಹೊಣೆಗಾರಿಕೆ",
            "ಸಂಸ್ಥೆಯು ಇತರರಿಗೆ ಪಾವತಿಸಬೇಕಾದ ಸಾಲ.",
            "Money owed.",
            "Bank loan is a liability.",
            "ಬ್ಯಾಂಕ್ ಸಾಲ ಒಂದು ಹೊಣೆಗಾರಿಕೆ.",
            "Commerce"
        )
        add(
            "Asset",
            "ಆಸ್ತಿ",
            "ಸಂಸ್ಥೆಯ ಮಾಲೀಕತ್ವದಲ್ಲಿರುವ ಬೆಲೆಬಾಳುವ ವಸ್ತು.",
            "Owned value.",
            "Cash is a business asset.",
            "ನಗದು ವ್ಯವಹಾರದ ಆಸ್ತಿ.",
            "Commerce"
        )
        add(
            "Shares",
            "ಷೇರುಗಳು",
            "ಕಂಪನಿಯ ಬಂಡವಾಳದ ಸಣ್ಣಭಾಗಗಳು.",
            "Ownership units.",
            "Buying shares in a company.",
            "ಕಂಪನಿಯಲ್ಲಿ ಷೇರು ಖರೀದಿ.",
            "Commerce"
        )
        add(
            "Dividend",
            "ಲಾಭಾಂಶ",
            "ಲಾಭದಲ್ಲಿ ಷೇರುದಾರರಿಗೆ ನೀಡುವ ಭಾಗ.",
            "Profit share.",
            "Investors receive dividends.",
            "ಹೂಡಿಕೆದಾರರಿಗೆ ಲಾಭಾಂಶ.",
            "Commerce"
        )
        add(
            "Equity",
            "ಸ್ವಂತ ಬಂಡವಾಳ",
            "Owner's share.",
            "Brand equity.",
            "Private equity.",
            "ಖಾಸಗಿ ಬಂಡವಾಳ.",
            "Commerce"
        )
        add(
            "Marketing",
            "ಮಾರಾಟ ಪ್ರಕ್ರಿಯೆ",
            "ಉತ್ಪನ್ನಗಳ ಮಾರಾಟವನ್ನು ಹೆಚ್ಚಿಸುವ ಚಟುವಟಿಕೆಗಳು.",
            "Promotion activities.",
            "Social media marketing.",
            "ಸಾಮಾಜಿಕ ಮಾಧ್ಯಮ ಮಾರಾಟ.",
            "Commerce"
        )
        add(
            "Capital",
            "ಬಂಡವಾಳ",
            "ಹೂಡಿಕೆ ಹಣ.",
            "Business funds.",
            "Start with capital.",
            "ಬಂಡವಾಳದೊಂದಿಗೆ ಆರಂಭಿಸಿ.",
            "Commerce"
        )
        add(
            "Revenue",
            "ಆದಾಯ",
            "ಒಟ್ಟು ಗಳಿಕೆ.",
            "Total income.",
            "Increase revenue.",
            "ಆದಾಯ ಹೆಚ್ಚಿಸಿ.",
            "Commerce"
        )
        add(
            "Profit",
            "ಲಾಭ",
            "Earnings after costs.",
            "Make a profit.",
            "Net profit.",
            "ನಿವ್ವಳ ಲಾಭ.",
            "Commerce"
        )
        add(
            "Loss",
            "ನಷ್ಟ",
            "Spending more than earning.",
            "Avoid business loss.",
            "Heavy loss.",
            "ಭಾರಿ ನಷ್ಟ.",
            "Commerce"
        )
        add(
            "Gross Profit",
            "ಒಟ್ಟು ಲಾಭ",
            "ಮಾರಾಟದಿಂದ ನೇರ ವೆಚ್ಚ ಕಾಡಿದ ನಂತರದ ಲಾಭ.",
            "Sales minus COGS.",
            "Calculate gross profit.",
            "ಒಟ್ಟು ಲಾಭವನ್ನು ಲೆಕ್ಕ ಹಾಕಿ.",
            "Commerce"
        )
        add(
            "Net Profit",
            "ನಿವ್ವಳ ಲಾಭ",
            "ಎಲ್ಲಾ ವೆಚ್ಚಗಳನ್ನು ತೋರಿಸುವ ನಂತರ ಬಾಕಿ ಲಾಭ.",
            "Final profit after all expenses.",
            "Net profit shows true earnings.",
            "ನಿವ್ವಳ ಲಾಭ ನಿಜವಾದ ಆದಾಯವನ್ನು ತೋರಿಸುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Turnover",
            "ವ್ಯವಹಾರ ಪರಿಮಾಣ",
            "ನಿರ್ದಿಷ್ಟ ಅವಧಿಯಲ್ಲಿ ಮಾರಾಟದ ಒಟ್ಟು ಮೊತ್ತ.",
            "Total sales value.",
            "High turnover is good.",
            "ಹೆಚ್ಚಿನ ವ್ಯವಹಾರ ಪರಿಮಾಣ ಚೆನ್ನಾಗಿದೆ.",
            "Commerce"
        )
        add(
            "Cost Price",
            "ಕ್ರಯ ಬೆಲೆ",
            "ಸರಕು ತಳೆಯುವಿಕೆಗಾಗಿ ವೆಚ್ಚವಾದ ಹಣ.",
            "Purchase price.",
            "Cost price is lower than selling.",
            "ಕ್ರಯ ಬೆಲೆ ಮಾರಾಟ ಬೆಲೆಗಿಂತ ಕಡಿಮೆ.",
            "Commerce"
        )
        add(
            "Selling Price",
            "ವಿಕ್ರಯ ಬೆಲೆ",
            "ಸರಕು ಮಾರಾಟ ಮಾಡುವಾಗ ಪಡೆಯುವ ಬೆಲೆ.",
            "Sale price.",
            "Selling price determines profit.",
            "ವಿಕ್ರಯ ಬೆಲೆ ಲಾಭವನ್ನು ನಿರ್ಧರಿಸುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Markup",
            "ಲಾಭಾಂಶ",
            "ಮಾರಾಟ ಬೆಲೆ ಮತ್ತು ಕ್ರಯ ಬೆಲೆಯ ನಡುವಿನ ವ್ಯತ್ಯಾಸ.",
            "Price increase over cost.",
            "Apply markup on cost.",
            "ಕ್ರಯ ಬೆಲೆಗೆ ಲಾಭಾಂಶ ಸೇರಿಸಿ.",
            "Commerce"
        )
        add(
            "Discount",
            "ರಿಯಾಯತಿ",
            "ಮಾರಾಟ ಬೆಲೆಯಿಂದ ಕಮ್ಮಿ ನೀಡುವುದು.",
            "Reduction from price.",
            "Give customer discount.",
            "ಗ್ರಾಹಕನಿಗೆ ರಿಯಾಯತಿ ನೀಡಿ.",
            "Commerce"
        )

        // Chapter 3: Types of Business
        add(
            "Partnership",
            "ಸಹಭಾಗಿತ್ವ",
            "ಎರಡು ಅಥವಾ ಹೆಚ್ಚುಷ್ಟು ಜನೆಸ್ಸೆ ಮಾಡುವ ಉದ್ಯಮ.",
            "Multiple owners business.",
            "Partnership shares responsibility.",
            "ಸಹಭಾಗಿತ್ವ ಜವಾಬ್ದಾರಿಯನ್ನು ಹಂಚುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Sole Proprietor",
            "ಏಕ ಮಾಲಿಕ",
            "ಒಬ್ಬ ವ್ಯಕ್ತಿ ನಡೆಸುವ ವ್ಯವಹಾರ.",
            "Single owner business.",
            "Sole proprietor has full control.",
            "ಏಕ ಮಾಲಿಕ ಪೂರ್ಣ ನಿಯಂತ್ರಣವನ್ನು ಹೊಂದಿರುತ್ತಾನೆ.",
            "Commerce"
        )
        add(
            "Corporation",
            "ಸಂಸ್ಥೆ / ಕಾರ್ಪೊರೇಶನ್",
            "ಕಾನೂನಿನ ಎದುರಿನಲ್ಲಿ ಸಂಪೂರ್ಣ ಸ್ವತಂತ್ರ ಅಸ್ತಿತ್ವ ಹೊಂದಿರುವ ವ್ಯವಸ್ಥೆ.",
            "Registered company entity.",
            "Corporation is registered.",
            "ಸಂಸ್ಥೆ ನೋಂದಾಯಿತವಾಗಿರುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Cooperative",
            "ಸಕಾರಿ ಸಮಿತಿ",
            "ಸಾಮಾನ್ಯ ಉದ್ದೇಶದಿಂದ ಮೂಲಕ ಸ್ವಸ್ನಿಯ ಸಂಘ.",
            "Members own together.",
            "Cooperatives help members.",
            "ಸಕಾರಿ ಸಮಿತಿ ಸದಸ್ಯರಿಗೆ ಸಹಾಯ ಮಾಡುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Franchise",
            "ಲೈಸೆನ್ಸ್ ವ್ಯವಸ್ಥೆ",
            "ಇತರ ಕಂಪನಿಯ ಬ್ರ್ಯಾಂಡೀ ತನ್ನ ಹೆಸರಿನಲ್ಲಿ ನಡೆಸುವುದು.",
            "Using brand license.",
            "Franchise pays royalty.",
            "ಲೈಸೆನ್ಸ್ ರಾಯಲ್ಟಿ ಪಾವತಿಸುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "NGO",
            "ಸರಕಾರೇತರ ಸಂಸ್ಥೆ",
            "ಸರಕಾರಿ ನೆರವಿಲ್ಲದೆ ಚಲನೆ ಮಾಡುವ ಸಂಸ್ಥೆ.",
            "Non-government organization.",
            "NGO does social work.",
            "ಸರಕಾರೇತರ ಸಂಸ್ಥೆ ಸಾಮಾಜಿಕ ಕೆಲಸ ಮಾಡುತ್ತದೆ.",
            "Commerce"
        )

        // Chapter 4: Market & Economics
        add(
            "Market",
            "ಮಾರುಕಟ್ಟೆ",
            "Trading place.",
            "Go to market.",
            "Global market.",
            "ಜಾಗತಿಕ ಮಾರುಕಟ್ಟೆ.",
            "Commerce"
        )
        add(
            "Demand",
            "ಬೇಡಿಕೆ",
            "Buyer desire.",
            "High demand.",
            "Market demand.",
            "ಮಾರುಕಟ್ಟೆ ಬೇಡಿಕೆ.",
            "Commerce"
        )
        add(
            "Supply",
            "ಪೂರೈಕೆ",
            "Seller amount.",
            "Short supply.",
            "Constant supply.",
            "ನಿರಂತರ ಪೂರೈಕೆ.",
            "Commerce"
        )
        add(
            "Price",
            "ಬೆಲೆ",
            "Selling value.",
            "Retail price.",
            "Set the price.",
            "ಬೆಲೆಯನ್ನು ನಿಗದಿಪಡಿಸಿ.",
            "Commerce"
        )
        add(
            "Competition",
            "ಪೋಷ್ಯಾಂಗದ ಸ್ಥಿತಿ / ಸ್ಪರ್ಧೆ",
            "ಒಂದೇ ಸರಕುಗಳು ವಿವಿಧ ವಿಕ್ರೇತೆಲ್ಲಿಂದ ಮಾರುಕಟ್ಟೆಯಲ್ಲಿ.",
            "Market rivalry.",
            "Healthy competition is good.",
            "ಆರೋಗ್ಯಕರ ಸ್ಪರ್ಧೆ ಚೆನ್ನಾಗಿದೆ.",
            "Commerce"
        )
        add(
            "Monopoly",
            "ಏಕಾಧಿಕಾರ",
            "ಒಬ್ಬ ವಿಕ್ರೇತೆ ಒಂದೇ ಸರಕುದ ಸಂಪೂರ್ಣ ಮಾರುಕಟ್ಟೆ ಆಕ್ರಮಣ ಮಾಡುವುದು.",
            "One seller dominates.",
            "Monopoly controls market.",
            "ಏಕಾಧಿಕಾರ ಮಾರುಕಟ್ಟೆಯನ್ನು ನಿಯಂತ್ರಿಸುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Oligopoly",
            "ಬಹುಸಂಘೀಕರಣ",
            "ಕೆಲವು ಕಂಪನಿಗಳು ಮಾರುಕಟ್ಟೆಯನ್ನು ನಿಯಂತ್ರಿಸುವುದು.",
            "Few sellers dominate.",
            "Oligopoly limits choices.",
            "ಬಹುಸಂಘೀಕರಣ ಆಯ್ಕೆಗಳನ್ನು ಸೀಮಿತಗೊಳಿಸುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Economy",
            "ಆರ್ಥಿಕತೆ / ಆರ್ಥಿಕ ವ್ಯವಸ್ಥೆ",
            "ಲೋಕಪಾಲಿತ ವಸ್ತುಗಳು ತಯಾರಿ, ವಿತರಣೆ ಹಾಗೂ ಸೇವನಾ ಪ್ರಕ್ರಿಯೆ.",
            "Wealth system.",
            "Strong economy grows.",
            "ಬಲವಾದ ಆರ್ಥಿಕತೆ ಬೆಳೆಯುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "GDP",
            "ಜಿಡಿಪಿ",
            "ನೆಲೆಯ ಒಂದು ವರ್ಷದಲ್ಲಿ ಉತ್ಪಾದನಾ ಒಟ್ಟು ಮೌಲ್ಯ.",
            "Gross Domestic Product.",
            "GDP measures economic growth.",
            "ಜಿಡಿಪಿ ಆರ್ಥಿಕ ಬೆಳವಣಿಗೆಯನ್ನು ಅಳೆಯುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Recession",
            "ಅರ್ಥಸಂಕೋಚನ",
            "ಆರ್ಥಿಕತೆಯ ಬೆಳವಣಿಗೆ ಕಡಿಮೆ ಅಥವಾ ನುಗ್ಗುವುದು.",
            "Economic slowdown.",
            "Recession hurts businesses.",
            "ಅರ್ಥಸಂಕೋಚನ ವ್ಯವಹಾರಕ್ಕೆ ಹಾನಿ ಮಾಡುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Inflation",
            "ಹಣದುಬ್ಬರ",
            "ವಸ್ತುಗಳ ಬೆಲೆ ಹೆಚ್ಚಾಗುವುದು.",
            "Rising prices.",
            "Inflation reduces buying power.",
            "ಹಣದುಬ್ಬರ ಕ್ರಯ ಶಕ್ತಿಯನ್ನು ಕಡಿಮೆ ಮಾಡುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Deflation",
            "ಮೌಲ್ಯ ಅರ್ಥಸಂಕೋಚನ",
            "ವಸ್ತುಗಳ ಬೆಲೆ ಕಡಿಮೆ ಆಗುವುದು.",
            "Falling prices.",
            "Deflation can harm economy.",
            "ಮೌಲ್ಯ ಅರ್ಥಸಂಕೋಚನ ಆರ್ಥಿಕತೆಗೆ ಹಾನಿ ಮಾಡಬಹುದು.",
            "Commerce"
        )

        // Chapter 5: Money & Banking
        add(
            "Currency",
            "ನಿನಾದಿ / ಮುದ್ರಾ",
            "ಗಿರಕಿ ವ್ಯವಹಾರಕ್ಕೆ ಬಳಸುವ ಹಣ.",
            "Money medium.",
            "Currency exchange rate.",
            "ನಿನಾದಿ ವಿನಿಮಯ ದರ.",
            "Commerce"
        )
        add(
            "Cash",
            "ನಗದು",
            "Money coins and notes.",
            "Petty cash.",
            "In cash.",
            "ನಗದಿನಲ್ಲಿ.",
            "Commerce"
        )
        add(
            "Cheque",
            "ಚೆಕ್",
            "ಬ್ಯಾಂಕ್‌ನಿಂದ ಹಣ ತೆಗೆದುಕೊಳ್ಳುವ ಧಾತ್ರ.",
            "Bank payment document.",
            "Sign a cheque.",
            "ಚೆಕ್‌ಗೆ ಸಹಿ ಮಾಡಿ.",
            "Commerce"
        )
        add(
            "Bank",
            "ಬ್ಯಾಂಕ್",
            "Money store.",
            "National bank.",
            "Bank account.",
            "ಬ್ಯಾಂಕ್ ಖಾತೆ.",
            "Commerce"
        )
        add(
            "Loan",
            "ಸಾಲ",
            "ಸಾಲ ದಾನ ಮಾಡಿ ಮುಂದೆ ವಸೂಲಿ ಮಾಡುವುದು.",
            "Borrowed funds.",
            "Apply for a loan.",
            "ಸಾಲಕ್ಕೆ ದರಖಾಸ್ತು ಮಾಡಿ.",
            "Commerce"
        )
        add(
            "Interest",
            "ಸುದ್ದಿ / ಸುಲಭ",
            "ಸಾಲದ ಮೇಲೆ ಬೇಕಾದ ಅತಿರಿಕ್ತ ಹಣ.",
            "Cost of borrowing.",
            "Calculate interest rate.",
            "ಸುದ್ದಿ ದರವನ್ನು ಲೆಕ್ಕ ಹಾಕಿ.",
            "Commerce"
        )
        add(
            "Principal",
            "ಮೂಲಾಸ್ತಿ",
            "ಸಾಲಿಸಿದ ಬಿಡಿ ಹಣ.",
            "Loan amount.",
            "Principal and interest.",
            "ಮೂಲಾಸ್ತಿ ಮತ್ತು ಸುದ್ದಿ.",
            "Commerce"
        )
        add(
            "Credit",
            "ಸಾಲಸೌಲಭ್ಯ",
            "ಇದು ತರುವಾಯ ಪಾವತಿಸುವ ನಿಯಮದಲ್ಲಿ ವಿನಾ ನಗದು ಸರಕುಗಳನ್ನು ಪಾಶ್ವಪೂರಕ ನೀಡುವುದು.",
            "Buy now pay later.",
            "Credit card.",
            "ಸಾಲಸೌಲಭ್ಯ ಕಾರ್ಡ್.",
            "Commerce"
        )
        add(
            "Debit",
            "ಖೋತ",
            "ಬ್ಯಾಂಕ್ ಖಾತೆಯಿಂದ ನೇರವಾಗಿ ಹಣ ತೆಗೆದುಕೊಳ್ಳುವುದು.",
            "Money taken out.",
            "Debit card.",
            "ಖೋತ ಕಾರ್ಡ್.",
            "Commerce"
        )
        add(
            "Overdraft",
            "ವಮನಿ ಪೆರೋಲ್ / ಮೀರಿ ನೀಡುವಿಕೆ",
            "ಖಾತೆಯನ್ನು ಲೆಕ್ಕಾಚಾರಗೆ ಕೆಳಗೆ ಜನಾಂಘಾದು ತೆಗೆದುಕೊಳ್ಳುವುದು.",
            "Negative balance allowed.",
            "Overdraft facility.",
            "ಮೀರಿ ನೀಡುವಿಕೆ ಸುವಿಧೆ.",
            "Commerce"
        )
        add(
            "ATM",
            "ಎಟಿಎಂ",
            "ಬಾಂಕೋ ಸುವಿಧೆಯಲ್ಲಿ ದಿನ ಬಿನ ಹಣ ತೆಗೆದುಕೊಳ್ಳುವ ಯಂತ್ರ.",
            "Automated cash machine.",
            "Withdraw from ATM.",
            "ಎಟಿಎಂನಿಂದ ನಗದು ತೆಗೆದುಕೊಳ್ಳಿ.",
            "Commerce"
        )

        // Chapter 6: Insurance & Risk
        add(
            "Insurance",
            "ವಿಮೆ",
            "ಅನಿಶ್ಚಿತ ಘಟನೆಗಳಿಂದ ಆರ್ಥಿಕ ನಷ್ಟದಿಂದ ರಕ್ಷಣೆ.",
            "Protection against loss.",
            "Buy insurance coverage.",
            "ವಿಮೆ ಅವರಣ ಖರೀದಿ ಮಾಡಿ.",
            "Commerce"
        )
        add(
            "Premium",
            "ವಿಮೆ ಪಾವತಿ",
            "ವಿಮೆಗೆ ಬಾರಿ ಬಾರಿ ನೀಡುವ ಹಣ.",
            "Insurance payment.",
            "Pay your premium.",
            "ನಿಮ್ಮ ವಿಮೆ ಪಾವತಿ ನೀಡಿ.",
            "Commerce"
        )
        add(
            "Claim",
            "ಹಕ್ಕು / ನಿವೇದನೆ",
            "ವಿಮೆ ಗ್ರಾಹಕನು ನಷ್ಟಕ್ಕೆ ವಿಮೆಕಿಂದ ಹಣ ಆಶ್ರಿಸುವುದು.",
            "Payment request.",
            "File a claim.",
            "ನಿವೇದನೆ ಸಲ್ಲಿಸಿ.",
            "Commerce"
        )
        add(
            "Coverage",
            "ಅವರಣ",
            "ವಿಮೆ ಪಾಲೆಂಟರಲ್ಲಿ ನಿರ್ಧರಿತ ರಕ್ಷಣಾ ನೆಟ್ವರ್ಕ.",
            "Insurance protection range.",
            "Good coverage.",
            "ಉತ್ತಮ ಅವರಣ.",
            "Commerce"
        )
        add(
            "Life Insurance",
            "ಜೀವ ವಿಮೆ",
            "ವ್ಯಕ್ತಿಯ ಮೃತ್ಯುವಿನ ನಂತರ ಅವನ ಪರಿವಾರಕ್ಕೆ ಹಣ ನೀಡುವ ವಿಮೆ.",
            "Death protection.",
            "Life insurance secures family.",
            "ಜೀವ ವಿಮೆ ಪರಿವಾರವನ್ನು ಸುರಕ್ಷಿತಗೊಳಿಸುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Health Insurance",
            "ಆರೋಗ್ಯ ವಿಮೆ",
            "ವೈದ್ಯಕೀಯ ವೆಚ್ಚದ ವಿಮೆ.",
            "Medical protection.",
            "Health insurance covers medical.",
            "ಆರೋಗ್ಯ ವಿಮೆ ಚಿಕಿತ್ಸೆ ವೆಚ್ಚವನ್ನು ಆವರಿಸುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Vehicle Insurance",
            "ವಾಹನ ವಿಮೆ",
            "ಕಾರು ಮತ್ತು ಬೈಕ್ಕಿನ ವಿಮೆ.",
            "Car and bike coverage.",
            "Vehicle insurance is mandatory.",
            "ವಾಹನ ವಿಮೆ ಕಟ್ಟಾಯ.",
            "Commerce"
        )
        add(
            "Risk",
            "ಅಪಾಯ",
            "ನಷ್ಟವಾಗುವ ಸಾಧ್ಯತೆ.",
            "Danger of loss.",
            "Manage risk.",
            "ಅಪಾಯವನ್ನು ನಿರ್ವಹಿಸಿ.",
            "Commerce"
        )

        // Chapter 7: Taxes & Government
        add(
            "Tax",
            "ತೆರಿಗೆ",
            "ಸರಕಾರನಿಗೆ ಹಣ.",
            "Government levy.",
            "Pay your tax.",
            "ತೆರಿಗೆ ಪಾವತಿಸಿ.",
            "Commerce"
        )
        add(
            "Income Tax",
            "ಆದಾಯ ತೆರಿಗೆ",
            "ಆದಾಯದ ಮೇಲೆ ತೆರಿಗೆ.",
            "Earnings tax.",
            "Income tax return.",
            "ಆದಾಯ ತೆರಿಗೆ ರಿಟರ್ನ್.",
            "Commerce"
        )
        add(
            "GST",
            "ಜಿಎಸ್ಟಿ",
            "ಸರಕು ಮತ್ತು ಸೇವಾ ತೆರಿಗೆ.",
            "Goods/Service tax.",
            "GST invoice.",
            "ಜಿಎಸ್ಟಿ ಬಿಲ್.",
            "Commerce"
        )
        add(
            "VAT",
            "ವಿ.ಏ.ಟಿ",
            "ಮೂಲ್ಯ ವರ್ಧಿತ ತೆರಿಗೆ.",
            "Value Added Tax.",
            "VAT amount.",
            "ವಿ.ಏ.ಟಿ ಪ್ರಮಾಣ.",
            "Commerce"
        )
        add(
            "Tariff",
            "ಆಮದು ಸುಂಕ",
            "ರಫ್ತು ಹಾಗೂ ಆಮದಿನ ಮೇಲೆ ತೆರಿಗೆ.",
            "Import/export tax.",
            "Tariff on goods.",
            "ಸರಕುಗಳ ಮೇಲೆ ಸುಂಕ.",
            "Commerce"
        )
        add(
            "Custom Duty",
            "ಸುಂಕ ಪಾವತಿ",
            "ದೇಶದೊಳಗೆ ಸರಕುನೂ ಬರುವಾಗ ತೆರಿಗೆ.",
            "Border tax.",
            "Pay custom duty.",
            "ಸುಂಕ ಪಾವತಿ ನೀಡಿ.",
            "Commerce"
        )
        add(
            "Budget",
            "ಬಜೆಟ್",
            "ಸರಕಾರ ಹಾಗೂ ಸಂಸ್ಥೆಯ ವರ್ಷದ ಆದಾಯ ಮತ್ತು ವೆಚ್ಚದ ಯೋಜನೆ.",
            "Spending plan.",
            "Annual budget.",
            "ವಾರ್ಷಿಕ ಬಜೆಟ್.",
            "Commerce"
        )
        add(
            "Subsidy",
            "ಸಹಾಯತೆ",
            "ಸರಕಾರ ವಿಶೇಷ ವ್ಯವಸೆಗೆ ನೀಡುವ ಆರ್ಥಿಕ ಸಹಾಯ.",
            "Government support.",
            "Subsidy lowers prices.",
            "ಸಹಾಯತೆ ಬೆಲೆಯನ್ನು ಕಡಿಮೆ ಮಾಡುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Regulation",
            "ನಿಯಮಾವಳಿ",
            "ಸರಕಾರದ ಆದೇಶ ಹಾಗೂ ನಿಯಮಗಳು.",
            "Government rules.",
            "Follow regulations.",
            "ನಿಯಮಾವಳಿಯನ್ನು ಅನುಸರಿಸಿ.",
            "Commerce"
        )

        // Chapter 8: Trade & Commerce
        add(
            "Import",
            "ಆಮದು",
            "ಇತರ ದೇಶಗಳಿಂದ ಸರಕುಗಳು ತರುವುದು.",
            "Buying abroad.",
            "Import oil.",
            "ತೈಲ ಆಮದು.",
            "Commerce"
        )
        add(
            "Export",
            "ರಫ್ತು",
            "ಇತರ ದೇಶಗಳಿಗೆ ಸರಕುಗಳನ್ನು ಕಳುಹಿಸುವುದು.",
            "Selling abroad.",
            "Export tea.",
            "ಚಹಾ ರಫ್ತು.",
            "Commerce"
        )
        add(
            "Trade",
            "ವ್ಯಾಪಾರ",
            "ಸರಕುಗಳನ್ನು ಕೈಮಾಹಿತರಿ ಮಾಡಿ ಇತರರಿಗೆ ಮಾರುತ್ತ ಹಾಗೂ ಲಾಭ ಮೆತ್ತುವುದು.",
            "Exchange goods.",
            "International trade.",
            "ಆಂತರರಾಷ್ಟ್ರೀಯ ವ್ಯಾಪಾರ.",
            "Commerce"
        )
        add(
            "Commerce",
            "ವಾಣಿಜ್ಯ",
            "ಸರಕುಗಳು ಮತ್ತು ಸೇವೆಗಳ ವ್ಯವಹಾರ.",
            "Business activities.",
            "Commerce drives economy.",
            "ವಾಣಿಜ್ಯ ಆರ್ಥಿಕತೆಯನ್ನು ನಡೆಸುತ್ತದೆ.",
            "Commerce"
        )
        add(
            "Merchant",
            "ವ್ಯಾಪಾರಿ",
            "ವ್ಯಾಪಾರ ನಡೆಸುವ ವ್ಯಕ್ತಿ.",
            "Trader.",
            "Local merchant.",
            "ಸ್ಥಳೀಯ ವ್ಯಾಪಾರಿ.",
            "Commerce"
        )
        add(
            "Goods",
            "ಸರಕುಗಳು",
            "ಮಾರುಕಟ್ಟೆಯಲ್ಲಿ ಮಾರಾಟವಾಗುವ ವಸ್ತುಗಳು.",
            "Items for sale.",
            "Luxury goods.",
            "ಐಸ್ವರ್ಯ ಸರಕುಗಳು.",
            "Commerce"
        )
        add(
            "Service",
            "ಸೇವೆ",
            "ವಸ್ತುಗಳ ಬದಲಾಗಿ ನೀಡುವ ಕೆಲಸ ಮತ್ತು ಸಹಾಯ.",
            "Help or work.",
            "Customer service.",
            "ಗ್ರಾಹಕ ಸೇವೆ.",
            "Commerce"
        )
        add(
            "Broker",
            "ದಲ್ಲಾಳಿ",
            "ಕೆಲವು ವಸ್ತುಗಳ ಮುಕ್ತ ವರ್ತನೆಗಾಗಿ ವಿಶೇಷ ಸೃಷ್ಟಿಮಾರ್ಗ ತಾಣ.",
            "Middleman trader.",
            "Stock broker.",
            "ಷೇರು ದಲ್ಲಾಳಿ.",
            "Commerce"
        )
        add(
            "Agency",
            "ಏಜೆನ್ಸಿ",
            "ತನ್ನ ಸ್ವತಂತ್ರ ಅಥವಾ ಇತರ ದೇಹದ ಪಕ್ಷವಹನ ಮಾಡಿ ವ್ಯವಹಾರ ನಡೆಸುವ ಪ್ರತಿಷ್ಠಾನ.",
            "Service firm.",
            "Ad agency.",
            "ಜಾಹಿರಾತು ಏಜೆನ್ಸಿ.",
            "Commerce"
        )
        add(
            "Wholesale",
            "ಸಗಟು",
            "ಅಧಿಕ ಪರಿಮಾಣದಲ್ಲಿ ಸರಕುಗಳನ್ನು ಕಡಿಮೆ ಬೆಲೆಯಲ್ಲಿ ಖರೀದಿಸಿ ತಿಳಿವಾಯ್ತು ಮಾರುವುದು.",
            "Bulk buying/selling.",
            "Wholesale price.",
            "ಸಗಟು ಬೆಲೆ.",
            "Commerce"
        )
        add(
            "Retail",
            "ಚಿಲ್ಲರೆ",
            "ಸರಕುಗಳನ್ನು ಸಣ್ಣ ಪರಿಮಾಣದಲ್ಲಿ ಅಧಿಕ ಬೆಲೆಯಲ್ಲಿ ಗ್ರಾಹಕರಿಗೆ ಮಾರುವುದು.",
            "Direct sale to customers.",
            "Retail shop.",
            "ಚಿಲ್ಲರೆ ಅಂಗಡಿ.",
            "Commerce"
        )
        add(
            "Supply Chain",
            "ಪೂರೈಕೆ ಸರಬರಾಜು ಸರಿಣಿ",
            "ಸರಕುಗಳು ಉತ್ಪಾದನಾ ನೆಲೆಯಿಂದ ಗ್ರಾಹಕನೆಲೆಗೆ ಮುಂದುವರೆದ ವ್ಯವಸ್ಥೆ.",
            "Product journey to customer.",
            "Supply chain management.",
            "ಪೂರೈಕೆ ಸರಣಿ ನಿರ್ವಹಣೆ.",
            "Commerce"
        )
        add(
            "Warehouse",
            "ಭಾಂಡಾರ",
            "ಉತ್ಪಾದಿತ ಸರಕುಗಳನ್ನು ಸಂಗ್ರಹ ಮಾಡುವ ದೊಡ್ಡ ಕಟ್ಟಡ.",
            "Storage facility.",
            "Goods in warehouse.",
            "ಭಾಂಡಾರದಲ್ಲಿ ಸರಕುಗಳು.",
            "Commerce"
        )
        add(
            "Inventory",
            "ಸಾಧನ ನೋಂದೆ",
            "ಸಂಸ್ಥೆಯ ಬಳಿ ಸಂಗ್ರಹಿಸಿರುವ ಸರಕುಗಳು.",
            "Stock of goods.",
            "Check inventory.",
            "ಸಾಧನ ನೋಂದೆಯನ್ನು ಪರಿಶೀಲಿಸಿ.",
            "Commerce"
        )
        add(
            "Logistics",
            "ಸಂಭರ ಪ್ರಬಂಧನ",
            "ಸರಕುಗಳನ್ನು ಸಣ್ಣ ಸ್ಥಾನದಿಂದ ಇತರ ಸ್ಥಾನಕ್ಕೆ ಸಾಗಿಸುವ ಕಾರ್ಯ.",
            "Transportation management.",
            "Logistics company.",
            "ಸಂಭರ ಪ್ರಬಂಧನ ಸಂಸ್ಥೆ.",
            "Commerce"
        )

        // Chapter 9: Employment & HR
        add(
            "Employment",
            "ಕೆಲಸ / ನೆಮ್ಮದಿ",
            "ಒಂದು ಸಂಸ್ಥೆ ಸಾಲೆಯ ಕೆಲಸ ಮಾಡುವುದು.",
            "Job position.",
            "Full employment.",
            "ಪೂರ್ಣ ಕೆಲಸದ ಸ್ಥಿತಿ.",
            "Commerce"
        )
        add(
            "Unemployment",
            "ನಿರುದ್ಯೋಗ",
            "ಕೆಲಸ ಪಡೆದೆ ಇರದಿರುವ ಸ್ಥಿತಿ.",
            "Job shortage.",
            "Reduce unemployment.",
            "ನಿರುದ್ಯೋಗವನ್ನು ಕಡಿಮೆ ಮಾಡಿ.",
            "Commerce"
        )
        add(
            "Salary",
            "ವೇತನ",
            "ಪ್ರತಿ ತಿಂಗಳು ಅಥವಾ ವರ್ಷಕ್ಕೆ ಕೆಲವೆಬ್ಬರಿಗೆ ನೀಡುವ ಮುಂಗಡ ಹಣ.",
            "Employee pay.",
            "Gross salary.",
            "ಒಟ್ಟು ವೇತನ.",
            "Commerce"
        )
        add(
            "Wage",
            "ದೈನಿಕ ಈಟ್ಟ / ನಿಮಜೂರು",
            "ದೈನಿಕ ಪರಿಶ್ರಮದ ಜೆಡಭಾಗದ ವೇತನ.",
            "Hourly pay.",
            "Daily wage.",
            "ದೈನಿಕ ನಿಮಜೂರು.",
            "Commerce"
        )
        add(
            "Bonus",
            "ಬೋನಸ್",
            "ವೇತನದ ಬಿಡಿಸ ನೀಡುವ ಅತಿರಿಕ್ತ ಹಣ.",
            "Extra pay.",
            "Diwali bonus.",
            "ದೀಪಾವಳಿ ಬೋನಸ್.",
            "Commerce"
        )
        add(
            "Allowance",
            "ಸಾಲೆ",
            "ವೈಸು ವೇತನದ ಬಿಡಿಸಹಿಂದು ವಿಶೇಷ ಪರಿಸ್ಥಿತಿಯಲ್ಲಿ ನೀಡುವ ಹಣ.",
            "Extra benefit.",
            "Travel allowance.",
            "ಪ್ರವಾಸ ಸಾಲೆ.",
            "Commerce"
        )
        add(
            "Commission",
            "ಕಮಿಷನ",
            "ಮಾರಾಟದ ಒಂದು ನಿಸ್ತೃಹಾಂಶ.",
            "Sales incentive.",
            "Earn commission.",
            "ಕಮಿಷನ ಗಳಿಸಿ.",
            "Commerce"
        )
        add(
            "HR",
            "ಮಾನವ ಸಂಪನ್ಮೂಲ",
            "ಕೆಲಸಕ್ಕೆ ವ್ಯಕ್ತಿಗಳನ್ನು ನೀಡುವ ಸಂಸ್ಥೆ ವಿಭಾಗ.",
            "Employee management.",
            "HR department.",
            "ಮಾನವ ಸಂಪನ್ಮೂಲ ವಿಭಾಗ.",
            "Commerce"
        )
        add(
            "Recruitment",
            "ಪದಸ್ಥಾನ ನೆಲೆಟಾಯ್ ಗೊಳಿಸುವುದು",
            "ನಿರ್ದಿಷ್ಟ ಕೆಲಸಕ್ಕೆ ಮತ್ತೆ ಕಿತ್ತನೆ ನೇಮಿಸುವುದು.",
            "Hiring employees.",
            "Recruitment process.",
            "ನೆಲೆಟಾಯ್ ಪ್ರಕ್ರಿಯೆ.",
            "Commerce"
        )
        add(
            "Interview",
            "ಸಾಕ್ಷಾತ್ಕಾರ",
            "ನೌಕರೀ ಅರ್ಹತೆ ಆಪ್ಲಿಕಂಟ್‌ನ ಮುಖೋಮುಖಿ ಪರೀಕ್ಷೆ.",
            "Job selection meeting.",
            "Job interview.",
            "ಕೆಲಸದ ಸಾಕ್ಷಾತ್ಕಾರ.",
            "Commerce"
        )
        add(
            "Training",
            "ತರಂ / ತರೇಲು",
            "ಕೆಲಸಕ್ಕೆ ಬಿನ ಜನರಿಗೆ ತರಬೇತಿ ನೀಡುವುದು.",
            "Skill development.",
            "Employee training.",
            "ಉದ್ಯೋಗಿ ತರಂ.",
            "Commerce"
        )
        add(
            "Appraisal",
            "ಅನುಮಾನದಿ / ಚಾಪು",
            "ನೌಕರನ ಕೆಲಸದ ಯೋಗ್ಯತೆಯನ್ನು ತಿಳಿಯುವುದು.",
            "Performance evaluation.",
            "Annual appraisal.",
            "ವಾರ್ಷಿಕ ಅನುಮಾನದಿ.",
            "Commerce"
        )
        add(
            "Leave",
            "ರಜೆ",
            "ಕೆಲಸದಿಂದ ನಿಮಾ ಒಪ್ಪಂದದೊಂದಿಗೆ ಕೆಲವು ದಿನ ಹೊರತಾಗುವುದು.",
            "Absence from work.",
            "Sick leave.",
            "ಬೆಸಿ ರಜೆ.",
            "Commerce"
        )
        add(
            "Retirement",
            "ನಿವೃತ್ತಿ",
            "ನಿರ್ದಿಷ್ಟ ಮರುಮೈಗಲ್ಲಿ ನಾಕರಿ ಬಿಡುವುದು.",
            "End of job service.",
            "Retirement age.",
            "ನಿವೃತ್ತಿ ವಯಸ್ಸು.",
            "Commerce"
        )
        add(
            "Pension",
            "ಪೆನ್‌ಷನ್",
            "ನಿವೃತ್ತಿ ನಂತರ ಪ್ರತಿ ತಿಂಗಳು ಮಿಳುತ್ತದೆ ಮಾಡುವ ಹಣ.",
            "Retirement income.",
            "Monthly pension.",
            "ಮಾಸಿಕ ಪೆನ್‌ಷನ್.",
            "Commerce"
        )
        add(
            "Grievance",
            "ಶಿಕಾಯತಿ",
            "ಉದ್ಯೋಗಿ ಸಂಸ್ಥೆಯ ವಿರುದ್ಧ ಮಂಡಿಸುವ ದುಖದ ಸಲಿ.",
            "Complaint.",
            "File a grievance.",
            "ಶಿಕಾಯತಿ ಸಲ್ಲಿಸಿ.",
            "Commerce"
        )

        // Chapter 10: Technology & Modern Business
        add(
            "E-commerce",
            "ಇ-ವಾಣಿಜ್ಯ / ಇಂಟರ್ನೆಟ್ ವ್ಯಾಪಾರ",
            "ಇಂಟರನೆಟ್ ಬಳಕೆ ಮಾಡಿ ಸರಕುಗಳ ವ್ಯವಹಾರ ನಡೆಸುವುದು.",
            "Online business.",
            "E-commerce platform.",
            "ಇ-ವಾಣಿಜ್ಯ ವೆಬ್‌ಸೈಟ್.",
            "Commerce"
        )
        add(
            "Digital Marketing",
            "ಡಿಜಿಟಲ್ ಮಾರುಕಟ್ಟೆ",
            "ಇಂಟರನೆಟ್ ಮತ್ತು ಡಿಜಿಟಲ್ ಸಾಧನ ಬಳಕೆ ಮಾಡಿ ಮಾರಾಟ ಹೆಚ್ಚಿಸುವುದು.",
            "Online promotion.",
            "Social media marketing.",
            "ಸಾಮಾಜಿಕ ಮಾಧ್ಯಮ ಮಾರಾಟ.",
            "Commerce"
        )
        add(
            "Startup",
            "ಹೊಸ ಉದ್ಯಮ",
            "ಹೊಸ ಅಥವಾ ಬೆಳೆಯುತ್ತಿರುವ ವ್ಯವಹಾರ ನಿರ್ವಾಸ.",
            "New company.",
            "Tech startup.",
            "ತಂತ್ರಜ್ಞಾನ ಉದ್ಯಮ.",
            "Commerce"
        )
        add(
            "Cryptocurrency",
            "ಗುಪ್ತ ಮುದ್ರೆ",
            "ಅಸಾಧಾರಣ ಡಿಜಿಟಲ್ ನಗದು.",
            "Digital currency.",
            "Bitcoin is cryptocurrency.",
            "ಬಿಟ್‌ಕಾಯಿನ್ ಗುಪ್ತ ಮುದ್ರೆ.",
            "Commerce"
        )
        add(
            "Blockchain",
            "ಬ್ಲಾಕ್‌ಚೇನ್",
            "ವಿತರಿತ ಡಿಜಿಟಲ್ ದಾಖಲೆ ವ್ಯವಸ್ಥೆ.",
            "Distributed ledger.",
            "Blockchain technology.",
            "ಬ್ಲಾಕ್‌ಚೇನ್ ತಂತ್ರಜ್ಞಾನ.",
            "Commerce"
        )
        add(
            "Analytics",
            "ವಿಶ್ಲೇಷಣೆ",
            "ಮಾಹಿತಿಯನ್ನು ಪರೀಕ್ಷಾ ಮತ್ತು ವ್ಯಾಖ್ಯೆ ಮಾಡುವುದು.",
            "Data analysis.",
            "Business analytics.",
            "ವ್ಯವಹಾರ ವಿಶ್ಲೇಷಣೆ.",
            "Commerce"
        )
        add(
            "Cloud",
            "ಕ್ಲೌಡ್",
            "ಇಂಟರನೆಟ್ ಮೂಲಕ ಪ್ರವೇಶವಾಗುವ ಡೇಟಾ ಸಂಗ್ರಹ.",
            "Online storage.",
            "Cloud computing.",
            "ಕ್ಲೌಡ್ ಕಂಪ್ಯೂಟಿಂಗ್.",
            "Commerce"
        )
        add(
            "API",
            "ಎಪಿಐ",
            "ಸಂಪ್ರೇಷಣ ಪ್ರೋಟೋಕೋಲ ಇಂಟರಫೇಸ್.",
            "Software interface.",
            "REST API.",
            "ರೆಸ್ಟ್ ಎಪಿಐ.",
            "Commerce"
        )
        add(
            "Data",
            "ಮಾಹಿತಿ / ತಿಳಿವುಳ್ಳು",
            "ಸಂಖ್ಯೆ ಹಾಗೂ ವಿವರಣೆಗಳ ಸಂಗ್ರಹ.",
            "Information.",
            "Raw data.",
            "ಸರಳ ಮಾಹಿತಿ.",
            "Commerce"
        )
        add(
            "Automation",
            "ಯಂತ್ರೀಕರಣ",
            "ಕಂಪ್ಯೂಟರ್ ಮತ್ತು ಯಂತ್ರ ಬಳಕೆ ಮಾಡಿ ಕೆಲಸ ಸ್ವಯಂಚಾಲಿತಗೊಳಿಸುವುದು.",
            "Self-operating system.",
            "Marketing automation.",
            "ಮಾರುಕಟ್ಟೆ ಯಂತ್ರೀಕರಣ.",
            "Commerce"
        )


        // --- MATHEMATICS (200 Terms) ---

        // Chapter 1: Real Numbers
        add(
            "Real Numbers",
            "ವಾಸ್ತವ ಸಂಖ್ಯೆಗಳು",
            "ಸಂಖ್ಯೆ ರೇಖೆಯಲ್ಲಿರುವ ಎಲ್ಲಾ ಸಂಖ್ಯೆಗಳು",
            "All numbers on a number line",
            "Real numbers include 2, -3.5, and √2",
            "ವಾಸ್ತವ ಸಂಖ್ಯೆಗಳು 2, -3.5 ಮತ್ತು √2 ಅನ್ನು ಒಳಗೊಂಡಿರುತ್ತವೆ",
            "Math"
        )
        add(
            "Rational Numbers",
            "ಭಾಗಲಬ್ಧ ಸಂಖ್ಯೆಗಳು",
            "p/q ರೂಪದಲ್ಲಿ ವ್ಯಕ್ತಪಡಿಸಬಹುದಾದ ಸಂಖ್ಯೆಗಳು",
            "Numbers that can be written as p/q",
            "3/4 and -2/5 are rational numbers",
            "3/4 ಮತ್ತು -2/5 ಭಾಗಲಬ್ಧ ಸಂಖ್ಯೆಗಳಾಗಿವೆ",
            "Math"
        )
        add(
            "Irrational Numbers",
            "ಅಭಾಗಲಬ್ಧ ಸಂಖ್ಯೆಗಳು",
            "p/q ರೂಪದಲ್ಲಿ ವ್ಯಕ್ತಪಡಿಸಲಾಗದ ಸಂಖ್ಯೆಗಳು",
            "Numbers that cannot be written as p/q",
            "√2 and π are irrational numbers",
            "√2 ಮತ್ತು π ಅಭಾಗಲಬ್ಧ ಸಂಖ್ಯೆಗಳಾಗಿವೆ",
            "Math"
        )
        add(
            "Integer",
            "ಪೂರ್ಣಾಂಕ",
            "ಸಂಪೂರ್ಣ ಸಂಖ್ಯೆಗಳು, ಋಣ, ಶೂನ್ಯ ಮತ್ತು ಧನ",
            "Whole numbers positive, negative and zero",
            "..., -2, -1, 0, 1, 2, ...",
            "..., -2, -1, 0, 1, 2, ಸಂಖ್ಯೆಗಳು",
            "Math"
        )
        add(
            "Prime Number",
            "ಅಭಾಜ್ಯ ಸಂಖ್ಯೆ",
            "1 ಮತ್ತು ತಾನೆ ಹೊರತುಪಡಿಸಿ ಬೇರೆ ಭಾಜಕಗಳನ್ನು ಹೊಂದದ ಸಂಖ್ಯೆ",
            "Numbers with no divisors except 1 and itself",
            "2, 3, 5, 7, 11 are prime numbers",
            "2, 3, 5, 7, 11 ಅಭಾಜ್ಯ ಸಂಖ್ಯೆಗಳಾಗಿವೆ",
            "Math"
        )
        add(
            "Composite Number",
            "ಸಂಯುಕ್ತ ಸಂಖ್ಯೆ",
            "ಎರಡು ಕ್ಕಿ ಹೆಚ್ಚಿನ ಅವಿಭಾಜ್ಯ ಅಪವರ್ತನವನ್ನು ಹೊಂದಿದ ಸಂಖ್ಯೆ",
            "Numbers with more than two factors",
            "4, 6, 8, 9 are composite numbers",
            "4, 6, 8, 9 ಸಂಯುಕ್ತ ಸಂಖ್ಯೆಗಳಾಗಿವೆ",
            "Math"
        )
        add(
            "HCF",
            "ಮಹತ್ತಮ ಸಾಮಾನ್ಯ ಅಪವರ್ತನ",
            "ಎರಡು ಅಥವಾ ಹೆಚ್ಚಿನ ಸಂಖ್ಯೆಗಳ ದೊಡ್ಡ ಸಾಮಾನ್ಯ ಅಪವರ್ತನ",
            "Greatest common divisor of numbers",
            "HCF of 12 and 18 is 6",
            "12 ಮತ್ತು 18 ರ ಮಹತ್ತಮ ಸಾಮಾನ್ಯ ಅಪವರ್ತನ 6",
            "Math"
        )
        add(
            "LCM",
            "ಲಘುತ್ತಮ ಸಾಮಾನ್ಯ ಬಹುಪಟ್ಟು",
            "ಎರಡು ಅಥವಾ ಹೆಚ್ಚಿನ ಸಂಖ್ಯೆಗಳ ಲಘುತ್ತಮ ಸಾಮಾನ್ಯ ಪಾಲಿಪಲ",
            "Least common multiple of numbers",
            "LCM of 4 and 6 is 12",
            "4 ಮತ್ತು 6 ರ ಲಘುತ್ತಮ ಸಾಮಾನ್ಯ ಬಹುಪಟ್ಟು 12",
            "Math"
        )
        add(
            "Euclidean Algorithm",
            "ಯೂಕ್ಲಿಡಿಯನ ವಿಧಾನ",
            "ಎರಡು ಸಂಖ್ಯೆಗಳ HCF ಕಂಡುಹಿಡಿಯುವ ವಿಧಾನ",
            "Method to find HCF of two numbers",
            "Using Euclidean algorithm to find HCF",
            "ಯೂಕ್ಲಿಡಿಯನ ವಿಧಾನ ಬಳಸಿ HCF ಕಂಡುಹಿಡಿಯುವುದು",
            "Math"
        )
        add(
            "Fundamental Theorem",
            "ಅಂಕಗಣಿತದ ಮೌಲ್ಯಮಾಪನ",
            "ಪ್ರತಿಯೊಂದು ಸಂಖ್ಯೆ ಅವಿಭಾಜ್ಯ ಸಂಖ್ಯೆಗಳ ಅನನ್ಯ ಗುಣಲಬ್ಧ",
            "Every number is a unique product of primes",
            "12 = 2² × 3",
            "12 = 2² × 3 ಎಂಬುದು ನಿರ್ದಿಷ್ಟ ಅಪವರ್ತನೀಕರಣ",
            "Math"
        )
        add(
            "Decimal Expansion",
            "ದಶಮಾಂಶ ವಿಸ್ತೃತಿ",
            "ಭಾಗಲಬ್ಧ ಸಂಖ್ಯೆಗಳನ್ನು ದಶಮಾಂಶ ರೂಪದಲ್ಲಿ ವ್ಯಕ್ತಪಡಿಸುವುದು",
            "Expressing rational numbers as decimals",
            "1/2 = 0.5, 1/3 = 0.333...",
            "1/2 = 0.5, 1/3 = 0.333... ದಶಮಾಂಶ ವಿಸ್ತೃತಿ",
            "Math"
        )

        // Chapter 2: Polynomials
        add(
            "Polynomial",
            "ಬಹುಪದ",
            "ಸಂಖ್ಯೆ ಮತ್ತು ಚರಾಕ್ಷರಗಳ ಸೇರ್ಪಡೆ ಮತ್ತು ಗುಣಲಬ್ಧದಿಂದ ರೂಪುಗೊಂಡ ವ್ಯವಸ್ಥೆ",
            "Expression with variables and constants",
            "x² + 2x + 3 is a polynomial",
            "x² + 2x + 3 ಒಂದು ಬಹುಪದವಾಗಿದೆ",
            "Math"
        )
        add(
            "Degree",
            "ಪದಾಂಶ",
            "ಬಹುಪದದಲ್ಲಿ ಅತಿ ಹೆಚ್ಚಿನ ಶಕ್ತಿ",
            "Highest power of variable",
            "In x² + 3x + 1, degree is 2",
            "x² + 3x + 1 ನಲ್ಲಿ ಪದಾಂಶ 2",
            "Math"
        )
        add(
            "Coefficient",
            "ಗುಣಾಂಕ",
            "ಚರಾಕ್ಷರದೊಂದಿಗೆ ಗುಣಿಸಿದ ಸಂಖ್ಯೆ",
            "Number multiplied by variable",
            "In 3x, 3 is the coefficient",
            "3x ನಲ್ಲಿ 3 ಗುಣಾಂಕವಾಗಿದೆ",
            "Math"
        )
        add(
            "Root",
            "ಮೂಲ",
            "ಬಹುಪದವನ್ನು ಸೊನ್ನೆಗೆ ಸಮಾನವಾಗಿಸುವ ಚರಾಕ್ಷರದ ಮೌಲ್ಯ",
            "Value that makes polynomial equal to zero",
            "Root of x² - 4 = 0 is 2 or -2",
            "x² - 4 = 0 ರ ಮೂಲ 2 ಅಥವಾ -2",
            "Math"
        )
        add(
            "Zeroes",
            "ಸೊನ್ನಾಭಗಳು",
            "ಬಹುಪದವನ್ನು ಸೊನ್ನೆ ಮಾಡುವ ಮೌಲ್ಯಗಳು",
            "Values where polynomial equals zero",
            "Zeroes of x² - 5x + 6 are 2 and 3",
            "x² - 5x + 6 ರ ಸೊನ್ನಾಭಗಳು 2 ಮತ್ತು 3",
            "Math"
        )
        add(
            "Linear Polynomial",
            "ರೇಖೀಯ ಬಹುಪದ",
            "ಪದಾಂಶ 1 ಆಗಿರುವ ಬಹುಪದ",
            "Polynomial with degree 1",
            "2x + 3 is a linear polynomial",
            "2x + 3 ಒಂದು ರೇಖೀಯ ಬಹುಪದವಾಗಿದೆ",
            "Math"
        )
        add(
            "Quadratic Polynomial",
            "ವರ್ಗೀಯ ಬಹುಪದ",
            "ಪದಾಂಶ 2 ಆಗಿರುವ ಬಹುಪದ",
            "Polynomial with degree 2",
            "x² + 2x + 1 is quadratic",
            "x² + 2x + 1 ವರ್ಗೀಯ ಬಹುಪದವಾಗಿದೆ",
            "Math"
        )
        add(
            "Cubic Polynomial",
            "ತ್ರಿಘಾತ ಬಹುಪದ",
            "ಪದಾಂಶ 3 ಆಗಿರುವ ಬಹುಪದ",
            "Polynomial with degree 3",
            "x³ + x² + x + 1 is cubic",
            "x³ + x² + x + 1 ತ್ರಿಘಾತ ಬಹುಪದವಾಗಿದೆ",
            "Math"
        )
        add(
            "Factor Theorem",
            "ಅಪವರ್ತನ ಪ್ರಮೇಯ",
            "ಯಾವುದೇ ಬಹುಪದದ ಅಪವರ್ತನಕ್ಕೆ ಸಂಬಂಧಿಸಿದ ಪ್ರಮೇಯ",
            "Theorem relating factors and zeroes",
            "If f(a) = 0, then (x-a) is a factor",
            "f(a) = 0 ಆಗಿದ್ದರೆ, (x-a) ಅಪವರ್ತನವಾಗಿದೆ",
            "Math"
        )
        add(
            "Remainder Theorem",
            "ಶೇಷ ಪ್ರಮೇಯ",
            "ಬಹುಪದವನ್ನು (x-a) ರಿಂದ ಭಾಗಿಸಿದಾಗ ಶೇಷ ಸಂಬಂಧ",
            "Theorem about remainder when dividing polynomials",
            "When f(x) is divided by (x-a), remainder is f(a)",
            "f(x) ವನ್ನು (x-a) ರಿಂದ ಭಾಗಿಸಿದಾಗ ಶೇಷ f(a)",
            "Math"
        )
        add(
            "Factorization",
            "ಅಪವರ್ತನೀಕರಣ",
            "ಬಹುಪದವನ್ನು ಸರಳ ಗುಣಲಬ್ಧವಾಗಿ ವ್ಯಕ್ತಪಡಿಸುವುದು",
            "Breaking into factors",
            "x² - 4 = (x+2)(x-2)",
            "x² - 4 = (x+2)(x-2) ಅಪವರ್ತನೀಕರಣ",
            "Math"
        )
        add(
            "Synthetic Division",
            "ಕೃತ್ರಿಮ ವಿಭಜನ",
            "ಬಹುಪದ ವಿಭಜನದ ಕಿರುಮುದ್ರ ವಿಧಾನ",
            "Short method of polynomial division",
            "Synthetic division simplifies calculations",
            "ಕೃತ್ರಿಮ ವಿಭಜನ ಲೆಕ್ಕಾಚಾರವನ್ನು ಸುಲಭಗೊಳಿಸುತ್ತದೆ",
            "Math"
        )
        add(
            "Identities",
            "ಅಂಗೀಕಾರ",
            "ಎಲ್ಲಾ ಮೌಲ್ಯಗಳಿಗೆ ಸತ್ಯವಾಗುವ ಸಮೀಕರಣ",
            "Equations always true",
            "(a+b)² = a² + 2ab + b²",
            "(a+b)² = a² + 2ab + b² ಒಂದು ಅಂಗೀಕಾರ",
            "Math"
        )

        // Chapter 3: Pair of Linear Equations
        add(
            "Linear Equation",
            "ರೇಖೀಯ ಸಮೀಕರಣ",
            "ಪದಾಂಶ 1 ಆಗಿರುವ ಸಮೀಕರಣ",
            "Equation with degree 1",
            "2x + 3 = 7 is linear",
            "2x + 3 = 7 ರೇಖೀಯ ಸಮೀಕರಣವಾಗಿದೆ",
            "Math"
        )
        add(
            "Variables",
            "ಚರಾಕ್ಷರಗಳು",
            "ಬದಲಾಗುವ ಮೌಲ್ಯಗಳನ್ನು ಪ್ರತಿನಿಧಿಸುವ ಚಿಹ್ನೆಗಳು",
            "Symbols representing unknown values",
            "x and y are variables",
            "x ಮತ್ತು y ಚರಾಕ್ಷರಗಳಾಗಿವೆ",
            "Math"
        )
        add(
            "Consistent",
            "ಅನುಕೂಲ",
            "ಸಮೀಕರಣಗಳ ಜೋಡಿ ಸೊನ್ನೆಯಾಗದ ಸಮಾಧಾನವನ್ನು ಹೊಂದಿದಾಗ",
            "System has at least one solution",
            "A pair of equations with one solution is consistent",
            "ಒಂದು ಸಮೀಕರಣ ಜೋಡಿ ಅನುಕೂಲವಾಗಿದೆ",
            "Math"
        )
        add(
            "Inconsistent",
            "ಅಸಂಗತ",
            "ಸಮೀಕರಣಗಳ ಜೋಡಿ ಯಾವುದೇ ಸಮಾಧಾನವನ್ನು ಹೊಂದದಾಗ",
            "System has no solution",
            "Parallel lines are inconsistent",
            "ಸಮಾಂತರ ರೇಖೆಗಳು ಅಸಂಗತವಾಗಿವೆ",
            "Math"
        )
        add(
            "Dependent",
            "ಅವಲಂಬಿತ",
            "ಸಮೀಕರಣಗಳ ಜೋಡಿ ಅನಂತ ಸಮಾಧಾನವನ್ನು ಹೊಂದಿದಾಗ",
            "System has infinite solutions",
            "Dependent equations represent the same line",
            "ಅವಲಂಬಿತ ಸಮೀಕರಣಗಳು ಅನುರೂಪ ರೇಖೆ",
            "Math"
        )
        add(
            "Substitution Method",
            "ಆದೇಶ ವಿಧಾನ",
            "ಒಂದು ಸಮೀಕರಣದಿಂದ ಒಂದು ಚರಾಕ್ಷರವನ್ನು ಕಂಡುಹಿಡಿದು ಇನ್ನೊಂದರಲ್ಲಿ ಆದೇಶ ಮಾಡುವುದು",
            "Solving by substituting one variable",
            "Solve y = 2x and x + y = 3 using substitution",
            "ಆದೇಶ ವಿಧಾನದ ಮೂಲಕ ಸಮಾಧಾನ",
            "Math"
        )
        add(
            "Elimination Method",
            "ವರ್ಜನ ವಿಧಾನ",
            "ಎರಡೂ ಸಮೀಕರಣವನ್ನು ಗುಣಿಸಿ ಒಂದು ಚರಾಕ್ಷರವನ್ನು ತೆಗೆದುಹಾಕುವುದು",
            "Solving by removing one variable",
            "Eliminate x by adding equations",
            "ಸಮೀಕರಣಗಳನ್ನು ಸಂಕಲಿಸಿ x ತೆಗೆದುಹಾಕಿ",
            "Math"
        )
        add(
            "Cross Multiplication",
            "ಅಡ್ಡ ಗುಣಲಬ್ಧ",
            "ಭಿನ್ನರಾಶಿಗಳನ್ನು ಸಮಾಧಾನ ಮಾಡುವ ವಿಧಾನ",
            "Method of solving using cross products",
            "Use cross multiplication to solve equations",
            "ಸಮೀಕರಣಗಳನ್ನು ಸಮಾಧಾನ ಮಾಡಲು ಅಡ್ಡ ಗುಣಲಬ್ಧ ಬಳಸಿ",
            "Math"
        )
        add(
            "Graphical Method",
            "ಆಲೇಖ ವಿಧಾನ",
            "ಸಮೀಕರಣಗಳನ್ನು ರೇಖೆಗಳಾಗಿ ಚಿತ್ರಿಸಿ ಸಮಾಧಾನ ಕಂಡುಹಿಡಿಯುವುದು",
            "Solving by plotting lines",
            "Lines intersect at solution point",
            "ರೇಖೆಗಳು ಸಮಾಧಾನ ಬಿಂದುವಿನಲ್ಲಿ ಛೇದಿಸುತ್ತವೆ",
            "Math"
        )
        add(
            "Slope",
            "ಓರತೆ",
            "ರೇಖೆಯ ಆಡ್ಡ ಸ್ಥಿತಿ",
            "Steepness of a line",
            "Slope m = (y₂-y₁)/(x₂-x₁)",
            "ರೇಖೆಯ ಓರತೆ m = (y₂-y₁)/(x₂-x₁)",
            "Math"
        )
        add(
            "Intercept",
            "ಛೇದಬಿಂದು",
            "ರೇಖೆ ಅಕ್ಷವನ್ನು ಛೇದಿಸುವ ಬಿಂದು",
            "Where line crosses an axis",
            "y-intercept is where x = 0",
            "y-ಛೇದಬಿಂದು x = 0 ನಲ್ಲಿ",
            "Math"
        )
        add(
            "Collinear",
            "ಸರಳರೇಖೀಯ",
            "ಮೂರು ಅಥವಾ ಹೆಚ್ಚಿನ ಬಿಂದುಗಳು ಒಂದೇ ರೇಖೆಯಲ್ಲಿ ಇರುವುದು",
            "Points on the same line",
            "Check if three points are collinear",
            "ಮೂರು ಬಿಂದುಗಳು ಸರಳರೇಖೀಯವಾಗಿವೆಯೇ ಪರೀಕ್ಷಿಸಿ",
            "Math"
        )

        // Chapter 4: Quadratic Equations
        add(
            "Quadratic Equation",
            "ವರ್ಗಸಮೀಕರಣ",
            "ax² + bx + c = 0 ಸ್ವರೂಪದ ಸಮೀಕರಣ",
            "Equation of degree 2",
            "x² + 2x + 1 = 0 is quadratic",
            "x² + 2x + 1 = 0 ವರ್ಗಸಮೀಕರಣವಾಗಿದೆ",
            "Math"
        )
        add(
            "Discriminant",
            "ವಿವೇಚಕ",
            "b² - 4ac ಮೌಲ್ಯ",
            "Value b² - 4ac determines nature of roots",
            "If Δ > 0, roots are real and distinct",
            "Δ > 0 ಆದರೆ ಮೂಲಗಳು ವಾಸ್ತವ ಮತ್ತು ಭಿನ್ನ",
            "Math"
        )
        add(
            "Real Roots",
            "ವಾಸ್ತವ ಮೂಲಗಳು",
            "ವರ್ಗಸಮೀಕರಣದ ಸಮಾಧಾನವು ನಿಜವಾದ ಸಂಖ್ಯೆಗಳು",
            "Solutions are real numbers",
            "x² - 4 = 0 has real roots 2 and -2",
            "x² - 4 = 0 ರ ವಾಸ್ತವ ಮೂಲಗಳು 2 ಮತ್ತು -2",
            "Math"
        )
        add(
            "Complex Roots",
            "ಸಮ್ಮಿಶ್ರ ಮೂಲಗಳು",
            "ವರ್ಗಸಮೀಕರಣದ ಸಮಾಧಾನವು i ಒಳಗೊಂಡಿರುವ ಸಂಖ್ಯೆಗಳು",
            "Solutions contain imaginary unit i",
            "x² + 1 = 0 has complex roots i and -i",
            "x² + 1 = 0 ರ ಸಮ್ಮಿಶ್ರ ಮೂಲಗಳು i ಮತ್ತು -i",
            "Math"
        )
        add(
            "Equal Roots",
            "ಸಮ ಮೂಲಗಳು",
            "ವರ್ಗಸಮೀಕರಣದ ಎರಡೂ ಮೂಲಗಳು ಸಮಾನವಾಗಿರುವುದು",
            "Both roots have same value",
            "When Δ = 0, roots are equal",
            "Δ = 0 ಆದರೆ ಮೂಲಗಳು ಸಮಾನ",
            "Math"
        )
        add(
            "Quadratic Formula",
            "ವರ್ಗಸೂತ್ರ",
            "x = (-b ± √(b²-4ac))/2a ಸೂತ್ರ",
            "Formula to solve quadratic equations",
            "Use quadratic formula for any equation",
            "ಯಾವುದೇ ವರ್ಗಸಮೀಕರಣಕ್ಕೆ ವರ್ಗಸೂತ್ರ ಬಳಸಿ",
            "Math"
        )
        add(
            "Factorization",
            "ಅಪವರ್ತನೀಕರಣ",
            "ವರ್ಗಸಮೀಕರಣವನ್ನು (px+q)(rx+s) ಸ್ವರೂಪದಲ್ಲಿ ವ್ಯಕ್ತಪಡಿಸುವುದು",
            "Breaking equation into factors",
            "x² + 5x + 6 = (x+2)(x+3)",
            "x² + 5x + 6 = (x+2)(x+3) ಅಪವರ್ತನೀಕರಣ",
            "Math"
        )
        add(
            "Completing the Square",
            "ವರ್ಗ ಪೂರ್ಣಿತೆ",
            "ವರ್ಗಸಮೀಕರಣವನ್ನು (x+a)² = b ರೂಪಕ್ಕೆ ತಿರುಗಿಸುವುದು",
            "Converting to perfect square form",
            "x² + 6x + 5 = 0 becomes (x+3)² = 4",
            "x² + 6x + 5 = 0 ಅನ್ನು (x+3)² = 4 ಆಗಿ ಪರಿವರ್ತಿಸಿ",
            "Math"
        )
        add(
            "Sum of Roots",
            "ಮೂಲಗಳ ಮೊತ್ತ",
            "ax² + bx + c = 0 ನಿಂದ ಮೂಲಗಳ ಮೊತ್ತ = -b/a",
            "Sum of both roots",
            "For x² + 3x + 2 = 0, sum = -3",
            "x² + 3x + 2 = 0 ಗೆ ಮೂಲಗಳ ಮೊತ್ತ = -3",
            "Math"
        )
        add(
            "Product of Roots",
            "ಮೂಲಗಳ ಗುಣಲಬ್ಧ",
            "ax² + bx + c = 0 ನಿಂದ ಮೂಲಗಳ ಗುಣಲಬ್ಧ = c/a",
            "Product of both roots",
            "For x² + 3x + 2 = 0, product = 2",
            "x² + 3x + 2 = 0 ಗೆ ಮೂಲಗಳ ಗುಣಲಬ್ಧ = 2",
            "Math"
        )
        add(
            "Word Problems",
            "ಪದ ಸಮಸ್ಯೆಗಳು",
            "ಸಾಮಾನ್ಯ ಸ್ಥಿತಿಯಿಂದ ವರ್ಗಸಮೀಕರಣ ರಚನೆ ಮತ್ತು ಸಮಾಧಾನ",
            "Real-life problems solved using quadratics",
            "Find dimensions given perimeter and area",
            "ಪರಿಧಿ ಮತ್ತು ವಿಸ್ತೀರ್ಣ ನೀಡಿದರೆ ಆಯಾಮ ಕಂಡುಹಿಡಿಯಿರಿ",
            "Math"
        )

        // Chapter 5: Arithmetic Progressions
        add(
            "Arithmetic Progression",
            "ಸಮಾಂತರ ಶ್ರೇಣಿ",
            "ಪರಸ್ಪರ ಸ್ಥಿರ ವ್ಯತ್ಯಾಸ ಹೊಂದಿರುವ ಸಂಖ್ಯೆಗಳ ವಿಂಗಡಣೆ",
            "Sequence with constant difference",
            "2, 4, 6, 8, ... is an AP",
            "2, 4, 6, 8, ... ಸಮಾಂತರ ಶ್ರೇಣಿ",
            "Math"
        )
        add(
            "First Term",
            "ಮೊದಲ ಪದ",
            "ಸಮಾಂತರ ಶ್ರೇಣಿಯ ಮೊದಲ ಪದ a₁",
            "The initial term of AP",
            "In 2, 4, 6, first term is 2",
            "2, 4, 6 ನಲ್ಲಿ ಮೊದಲ ಪದ 2",
            "Math"
        )
        add(
            "Common Difference",
            "ಸಾಮಾನ್ಯ ವ್ಯತ್ಯಾಸ",
            "ಪರಸ್ಪರ ಪದಗಳ ವ್ಯತ್ಯಾಸ d",
            "Difference between consecutive terms",
            "In 2, 4, 6, common difference is 2",
            "2, 4, 6 ನಲ್ಲಿ ಸಾಮಾನ್ಯ ವ್ಯತ್ಯಾಸ 2",
            "Math"
        )
        add(
            "nth Term",
            "n ನೇ ಪದ",
            "aₙ = a + (n-1)d ಸೂತ್ರದಿಂದ ಕಂಡುಹಿಡಿದ ಯಾವುದೇ ಪದ",
            "General term formula",
            "aₙ = a + (n-1)d",
            "aₙ = a + (n-1)d ನೇ ಪದದ ಸೂತ್ರ",
            "Math"
        )
        add(
            "Sum of n Terms",
            "n ಪದಗಳ ಮೊತ್ತ",
            "Sₙ = n/2 [2a + (n-1)d] ಸೂತ್ರದಿಂದ",
            "Formula Sₙ = n/2 [2a + (n-1)d]",
            "Find sum of first n terms",
            "ಮೊದಲ n ಪದಗಳ ಮೊತ್ತ ಕಂಡುಹಿಡಿಯಿರಿ",
            "Math"
        )
        add(
            "Finite AP",
            "ಸೀಮಿತ ಸಮಾಂತರ ಶ್ರೇಣಿ",
            "ಪದಗಳ ಸಂಖ್ಯೆ ನಿರ್ದಿಷ್ಟವಾಗಿರುವ ಸಮಾಂತರ ಶ್ರೇಣಿ",
            "AP with fixed number of terms",
            "1, 2, 3, 4, 5 is a finite AP",
            "1, 2, 3, 4, 5 ಸೀಮಿತ ಸಮಾಂತರ ಶ್ರೇಣಿ",
            "Math"
        )
        add(
            "Infinite AP",
            "ಅನಂತ ಸಮಾಂತರ ಶ್ರೇಣಿ",
            "ಪದಗಳ ಸಂಖ್ಯೆ ಅನಂತವಾಗಿರುವ ಸಮಾಂತರ ಶ್ರೇಣಿ",
            "AP with infinite terms",
            "1, 2, 3, 4, ... is infinite AP",
            "1, 2, 3, 4, ... ಅನಂತ ಸಮಾಂತರ ಶ್ರೇಣಿ",
            "Math"
        )
        add(
            "Middle Term",
            "ಮಧ್ಯ ಪದ",
            "ಸೀಮಿತ ಸಮಾಂತರ ಶ್ರೇಣಿಯ ಮಧ್ಯದ ಪದ",
            "Central term in finite AP",
            "In 1, 2, 3, 4, 5, middle term is 3",
            "1, 2, 3, 4, 5 ನಲ್ಲಿ ಮಧ್ಯ ಪದ 3",
            "Math"
        )

        // Chapter 6: Triangles
        add(
            "Triangle",
            "ತ್ರಿಕೋನ",
            "ಮೂರು ಬಾಹುಗಳು ಮತ್ತು ಮೂರು ಕೋನಗಳನ್ನು ಹೊಂದಿರುವ ಜ್ಯಾಮಿತಿ ಚಿತ್ರ",
            "Three-sided polygon",
            "ABC is a triangle",
            "ABC ಒಂದು ತ್ರಿಕೋನವಾಗಿದೆ",
            "Math"
        )
        add(
            "Similar Triangles",
            "ಸಮರೂಪ ತ್ರಿಕೋನಗಳು",
            "ತ್ರಿಕೋನಗಳ ಸಂಬಂಧಿತ ಕೋನಗಳು ಸಮಾನ ಮತ್ತು ಬಾಹುಗಳು ಅನುಪಾತೀಯ",
            "Triangles with same shape but different size",
            "ΔABC ~ ΔDEF means similar triangles",
            "ΔABC ~ ΔDEF ಸಮರೂಪ ತ್ರಿಕೋನಗಳನ್ನು ಅರ್ಥ",
            "Math"
        )
        add(
            "Congruent Triangles",
            "ಸರ್ವಸಮ ತ್ರಿಕೋನಗಳು",
            "ತ್ರಿಕೋನಗಳು ಪರಿಪೂರ್ಣವಾಗಿ ಅವುಗಳ ಮೇಲೆ ಅಧಿಕ್ಷೇಪಿಸಿದಾಗ",
            "Exactly same in shape and size",
            "ΔABC ≅ ΔDEF means congruent",
            "ΔABC ≅ ΔDEF ಸರ್ವಸಮ ತ್ರಿಕೋನಗಳು",
            "Math"
        )
        add(
            "SSS Criterion",
            "SSS ಮಾನದಂಡ",
            "ಮೂರು ಬಾಹುಗಳು ಸರಿಸಾಟಿ ಆದರೆ ತ್ರಿಕೋನಗಳು ಸರ್ವಸಮ",
            "Side-Side-Side criterion for congruence",
            "If three sides match, triangles are congruent",
            "ಮೂರು ಬಾಹುಗಳು ಹೊಂದಾಣಿಕೆಯಾದರೆ ತ್ರಿಕೋನಗಳು ಸರ್ವಸಮ",
            "Math"
        )
        add(
            "SAS Criterion",
            "SAS ಮಾನದಂಡ",
            "ಎರಡು ಬಾಹುಗಳು ಮತ್ತು ಅವುಗಳ ಮಧ್ಯಕೋನ ಸರಿಸಾಟಿ",
            "Side-Angle-Side criterion for congruence",
            "Two sides and included angle equal",
            "ಎರಡು ಬಾಹುಗಳು ಮತ್ತು ಸೇರಿದ ಕೋನ ಸಮಾನ",
            "Math"
        )
        add(
            "ASA Criterion",
            "ASA ಮಾನದಂಡ",
            "ಎರಡು ಕೋನಗಳು ಮತ್ತು ಅವುಗಳ ಮಧ್ಯಬಾಹು ಸರಿಸಾಟಿ",
            "Angle-Side-Angle criterion for congruence",
            "Two angles and included side equal",
            "ಎರಡು ಕೋನಗಳು ಮತ್ತು ಸೇರಿದ ಬಾಹು ಸಮಾನ",
            "Math"
        )
        add(
            "RHS Criterion",
            "RHS ಮಾನದಂಂಡ",
            "ಲಂಬಕೋನ ತ್ರಿಕೋನಗಳಿಗೆ ಸರ್ವಸಮತಾ",
            "Right Angle - Hypotenuse - Side criterion",
            "Hypotenuse and one side equal",
            "ಕರ್ಣ ಮತ್ತು ಒಂದು ಬಾಹು ಸಮಾನ",
            "Math"
        )
        add(
            "Similarity Criterion",
            "ಸಮರೂಪತೆ ಮಾನದಂಡ",
            "ತ್ರಿಕೋನಗಳ ಸಮರೂಪತೆ ಪರಿಶೀಲನೆಯ ಮಾನದಂಡ",
            "Criteria for triangle similarity",
            "AA, SSS, SAS criteria for similarity",
            "AA, SSS, SAS ಸಮರೂಪತೆಯ ಮಾನದಂಡ",
            "Math"
        )
        add(
            "Pythagoras Theorem",
            "ಪೈಥಾಗೋರಸ್ ಪ್ರಮೇಯ",
            "ಲಂಬಕೋನ ತ್ರಿಕೋನದಲ್ಲಿ c² = a² + b²",
            "a² + b² = c² for right triangle",
            "In right triangle, (hypotenuse)² = sum of squares of other sides",
            "ಲಂಬಕೋನದಲ್ಲಿ (ಕರ್ಣ)² = ಇತರ ಎರಡು ಬಾಹುಗಳ ವರ್ಗಗಳ ಮೊತ್ತ",
            "Math"
        )
        add(
            "Altitude",
            "ಲಂಬ",
            "ಒಂದು ಶೃಂಗದಿಂದ ಎದುರು ಬಾಹುವಿಗೆ ಲಂಬವಾಗಿ ಎಳೆದ ರೇಖೆ",
            "Perpendicular from vertex to opposite side",
            "Draw an altitude to find height",
            "ಎತ್ತರ ಕಂಡುಹಿಡಿಯಲು ಲಂಬ ಎಳೆಯಿರಿ",
            "Math"
        )
        add(
            "Median",
            "ಮಧ್ಯಮ",
            "ಒಂದು ಶೃಂಗದಿಂದ ಎದುರು ಬಾಹುವಿನ ಮಧ್ಯಬಿಂದುವಿಗೆ ಎಳೆದ ರೇಖೆ",
            "Line from vertex to midpoint of opposite side",
            "A median bisects the opposite side",
            "ಮಧ್ಯಮವು ಎದುರು ಬಾಹುವನ್ನು ಪರಿಭಾಜಿತ ಮಾಡುತ್ತದೆ",
            "Math"
        )
        add(
            "Centroid",
            "ಕೇಂದ್ರಾಭಿಲಾಷ",
            "ತ್ರಿಕೋನದ ಮೂರು ಮಧ್ಯಮ ರೇಖೆಗಳ ಛೇದಕ ಬಿಂದು",
            "Intersection point of three medians",
            "Centroid divides each median in 2:1 ratio",
            "ಕೇಂದ್ರಾಭಿಲಾಷ ಪ್ರತಿ ಮಧ್ಯಮವನ್ನು 2:1 ಅನುಪಾತದಲ್ಲಿ ವಿಭಜಿಸುತ್ತದೆ",
            "Math"
        )

        // Chapter 7: Coordinate Geometry
        add(
            "Coordinate Geometry",
            "ಸ್ಥಾನಾಂಕ ಜ್ಯಾಮಿತಿ",
            "ಜ್ಯಾಮಿತಿ ಮತ್ತು ಸಂಖ್ಯೆಗಳನ್ನು ಸಂಯೋಜಿತ ಅಧ್ಯಯನ",
            "Geometry using algebraic coordinates",
            "Points represented as (x, y)",
            "ಬಿಂದುಗಳನ್ನು (x, y) ರೂಪದಲ್ಲಿ ನಿರೂಪಿಸುವುದು",
            "Math"
        )
        add(
            "Cartesian Plane",
            "ಕಾರ್ಟಿಸಿಯನ್ ಸಮತಲ",
            "ಎರಡು ಲಂಬವಾದ ಸಂಖ್ಯೆ ರೇಖೆಗಳ ಸಂಯೋಜನೆ",
            "Plane with x and y axes",
            "Two perpendicular number lines forming a plane",
            "ಎರಡು ಲಂಬವಾದ ಸಂಖ್ಯೆ ರೇಖೆಗಳು ಸಮತಲ ರೂಪಿಸುತ್ತವೆ",
            "Math"
        )
        add(
            "Abscissa",
            "ಭುಜ",
            "ಬಿಂದುವಿನ x ನಿರ್ದೇಶಾಂಕ",
            "x-coordinate of a point",
            "In point (3, 5), abscissa is 3",
            "(3, 5) ಬಿಂದುದಲ್ಲಿ ಭುಜ 3",
            "Math"
        )
        add(
            "Ordinate",
            "ಕೋಟಿ",
            "ಬಿಂದುವಿನ y ನಿರ್ದೇಶಾಂಕ",
            "y-coordinate of a point",
            "In point (3, 5), ordinate is 5",
            "(3, 5) ಬಿಂದುದಲ್ಲಿ ಕೋಟಿ 5",
            "Math"
        )
        add(
            "Origin",
            "ಮೂಲ ಬಿಂದು",
            "ಸ್ಥಾನಾಂಕ ಸಮತಲದ (0,0) ಬಿಂದು",
            "Point where axes intersect (0,0)",
            "The origin is at (0, 0)",
            "ಮೂಲ ಬಿಂದು (0, 0) ನಲ್ಲಿ ಇದೆ",
            "Math"
        )
        add(
            "Distance Formula",
            "ದೂರ ಸೂತ್ರ",
            "d = √[(x₂-x₁)² + (y₂-y₁)²] ಸೂತ್ರ",
            "Formula to find distance between two points",
            "Distance between (1,2) and (4,6) is √(9+16)=5",
            "ಎರಡು ಬಿಂದುಗಳ ನಡುವಿನ ದೂರ √[(x₂-x₁)² + (y₂-y₁)²]",
            "Math"
        )
        add(
            "Section Formula",
            "ವಿಭಾಗ ಸೂತ್ರ",
            "ನಿರ್ದಿಷ್ಟ ಅನುಪಾತದಲ್ಲಿ ಬೋಧಕ ರೇಖೆಖಂಡವನ್ನು ವಿಭಾಗಿಸುವ ಬಿಂದು",
            "Formula to find dividing point",
            "Point dividing segment in ratio m:n",
            "ರೇಖೆಖಂಡವನ್ನು m:n ಅನುಪಾತದಲ್ಲಿ ವಿಭಾಗಿಸುವ ಬಿಂದು",
            "Math"
        )
        add(
            "Midpoint Formula",
            "ಮಧ್ಯಬಿಂದು ಸೂತ್ರ",
            "ಎರಡು ಬಿಂದುಗಳ ಮಧ್ಯಬಿಂದು ((x₁+x₂)/2, (y₁+y₂)/2)",
            "Formula to find midpoint",
            "Midpoint of (1,2) and (5,8) is (3,5)",
            "(1,2) ಮತ್ತು (5,8) ರ ಮಧ್ಯಬಿಂದು (3,5)",
            "Math"
        )
        add(
            "Collinearity",
            "ಸರಳರೇಖೀಯತೆ",
            "ಮೂರು ಬಿಂದುಗಳ ಚೆಕ್ಕಿಂಗ್ ಅವು ಒಂದೇ ರೇಖೆಯಲ್ಲಿ ಇವೆಯೇ",
            "Checking if three points lie on same line",
            "Use slope to check collinearity",
            "ಸರಳರೇಖೀಯತೆ ಪರೀಕ್ಷೆಗೆ ಓರತೆ ಬಳಸಿ",
            "Math"
        )
        add(
            "Area of Triangle",
            "ತ್ರಿಕೋನದ ವಿಸ್ತೀರ್ಣ",
            "ನಿರ್ದೇಶಾಂಕ ಬಳಸಿ ತ್ರಿಕೋನದ ವಿಸ್ತೀರ್ಣ ಲೆಕ್ಕ",
            "Area = ½|x₁(y₂-y₃) + x₂(y₃-y₁) + x₃(y₁-y₂)|",
            "Find area using coordinate geometry",
            "ನಿರ್ದೇಶಾಂಕ ಜ್ಯಾಮಿತಿ ಬಳಸಿ ವಿಸ್ತೀರ್ಣ ಕಂಡುಹಿಡಿಯಿರಿ",
            "Math"
        )

        // Chapter 8: Introduction to Trigonometry
        add(
            "Trigonometry",
            "ತ್ರಿಕೋಣಮಿತಿ",
            "ತ್ರಿಕೋನಗಳ ಬಾಹುಗಳು ಮತ್ತು ಕೋನಗಳ ಸಂಬಂಧ",
            "Study of triangle sides and angles",
            "Trigonometry helps in navigation",
            "ತ್ರಿಕೋಣಮಿತಿ ನೌಕಾ ಸಂಚರಣೆಗೆ ಸಹಾಯ ಮಾಡುತ್ತದೆ",
            "Math"
        )
        add(
            "Sine",
            "ಸೈನ್",
            "sin θ = ಎದುರು ಬಾಹು / ಕರ್ಣ",
            "sin θ = opposite/hypotenuse",
            "sin 30° = 1/2",
            "sin 30° = 1/2",
            "Math"
        )
        add(
            "Cosine",
            "ಕೋಸೈನ್",
            "cos θ = ಪಕ್ಕದ ಬಾಹು / ಕರ್ಣ",
            "cos θ = adjacent/hypotenuse",
            "cos 60° = 1/2",
            "cos 60° = 1/2",
            "Math"
        )
        add(
            "Tangent",
            "ಟ್ಯಾಂಜೆಂಟ್",
            "tan θ = ಎದುರು ಬಾಹು / ಪಕ್ಕದ ಬಾಹು",
            "tan θ = opposite/adjacent",
            "tan 45° = 1",
            "tan 45° = 1",
            "Math"
        )
        add(
            "Cosecant",
            "ಕೋಸೆಕ್ಯಾಂಟ್",
            "cosec θ = ಕರ್ಣ / ಎದುರು ಬಾಹು",
            "cosec θ = hypotenuse/opposite",
            "cosec 30° = 2",
            "cosec 30° = 2",
            "Math"
        )
        add(
            "Secant",
            "ಸೆಕಾಂಟ್",
            "sec θ = ಕರ್ಣ / ಪಕ್ಕದ ಬಾಹು",
            "sec θ = hypotenuse/adjacent",
            "sec 60° = 2",
            "sec 60° = 2",
            "Math"
        )
        add(
            "Cotangent",
            "ಕೋಟ್ಯಾಂಜೆಂಟ್",
            "cot θ = ಪಕ್ಕದ ಬಾಹು / ಎದುರು ಬಾಹು",
            "cot θ = adjacent/opposite",
            "cot 45° = 1",
            "cot 45° = 1",
            "Math"
        )
        add(
            "Right Triangle",
            "ಲಂಬಕೋನ ತ್ರಿಕೋನ",
            "ಒಂದು ಕೋನ 90° ಆಗಿರುವ ತ್ರಿಕೋನ",
            "Triangle with one 90° angle",
            "In a right triangle, one angle is 90°",
            "ಲಂಬಕೋನ ತ್ರಿಕೋನದಲ್ಲಿ ಒಂದು ಕೋನ 90°",
            "Math"
        )
        add(
            "Angle of Elevation",
            "ಉನ್ನತ ಕೋನ",
            "ನೋಡುವವರ ದೃಷ್ಟಿರೇಖೆ ಮತ್ತು ಸಮತಲ ರೇಖೆಯ ನಡುವಿನ ಕೋನ",
            "Angle above horizontal",
            "Looking up at a bird creates angle of elevation",
            "ಪಕ್ಷಿಯನ್ನು ಅನ್ವೇಷಿಸುವುದು ಉನ್ನತ ಕೋನ ರೂಪಿಸುತ್ತದೆ",
            "Math"
        )
        add(
            "Angle of Depression",
            "ಅವನತ ಕೋನ",
            "ನೋಡುವವರ ದೃಷ್ಟಿರೇಖೆ ಮತ್ತು ಸಮತಲ ರೇಖೆಯ ನಡುವಿನ ಕೋನ",
            "Angle below horizontal",
            "Looking at ground from tower creates angle of depression",
            "ಗೋಪುರದಿಂದ ನೆಲಕ್ಕೆ ನೋಡುವುದು ಅವನತ ಕೋನ",
            "Math"
        )
        add(
            "Complementary Angles",
            "ಪೂರಕ ಕೋನಗಳು",
            "ಎರಡು ಕೋನಗಳ ಮೊತ್ತ 90°",
            "Two angles that sum to 90°",
            "30° and 60° are complementary",
            "30° ಮತ್ತು 60° ಪೂರಕ ಕೋನಗಳಾಗಿವೆ",
            "Math"
        )
        add(
            "Identity",
            "ಸರ್ವಸಮತೆ",
            "sin² θ + cos² θ = 1 ಪ್ರತಿ ಕೋನಕ್ಕೆ",
            "sin² θ + cos² θ = 1 for all angles",
            "Fundamental trigonometric identity",
            "sin² θ + cos² θ = 1 ಮೌಲಿಕ ತ್ರಿಕೋಣಮಿತೀಯ ಸರ್ವಸಮತೆ",
            "Math"
        )
        add(
            "Standard Angles",
            "ಪ್ರಮಾಣಿತ ಕೋನಗಳು",
            "0°, 30°, 45°, 60°, 90° ಕೋನಗಳು",
            "0°, 30°, 45°, 60°, 90° angles",
            "Learn trigonometric values of standard angles",
            "ಪ್ರಮಾಣಿತ ಕೋನಗಳ ತ್ರಿಕೋಣಮಿತೀಯ ಮೌಲ್ಯಗಳು ಕಲಿಯಿರಿ",
            "Math"
        )

        // Chapter 9: Some Applications of Trigonometry
        add(
            "Clinometer",
            "ಲಂಬ ಮಾಪಕ",
            "ಕೋನಗಳನ್ನು ಮಾಪನ ಮಾಡುವ ಸಾಧನ",
            "Device to measure angles",
            "Clinometer measures height of building",
            "ಕಟ್ಟಡದ ಎತ್ತರ ಮಾಪನ ಮಾಡಲು ಲಂಬ ಮಾಪಕ",
            "Math"
        )
        add(
            "Height",
            "ಎತ್ತರ",
            "ನೆಲದಿಂದ ಮೇಲಕ್ಕೆ ದೂರ",
            "Vertical distance upward",
            "Find the height of the tree",
            "ಮರದ ಎತ್ತರ ಕಂಡುಹಿಡಿಯಿರಿ",
            "Math"
        )
        add(
            "Distance",
            "ದೂರ",
            "ಎರಡು ಬಿಂದುಗಳ ನಡುವಿನ ಭೂಮಿ ದೂರ",
            "Horizontal distance",
            "Find distance across river",
            "ನದಿಯಾದ್ಯಂತ ದೂರ ಕಂಡುಹಿಡಿಯಿರಿ",
            "Math"
        )
        add(
            "Bearing",
            "ದಿಕ್ಕು",
            "ನೋರ್ತ್‌ಗೆ ಸಂಬಂಧಿತ ದಿಕ್ಕು",
            "Direction relative to north",
            "Ship's bearing is 45°",
            "ಹಡಗಿನ ದಿಕ್ಕು 45°",
            "Math"
        )

        // Chapter 10: Circles
        add(
            "Circle",
            "ವೃತ್ತ",
            "ಒಂದು ನಿಶ್ಚಿತ ಬಿಂದುವಿಂದ ಸಮದೂರದಲ್ಲಿರುವ ಬಿಂದುಗಳ ಗುಂಪು",
            "Set of points equidistant from center",
            "Wheels are circular in shape",
            "ಚಕ್ರಗಳು ವೃತ್ತಾಕಾರವಾಗಿರುತ್ತವೆ",
            "Math"
        )
        add(
            "Center",
            "ಕೇಂದ್ರ",
            "ವೃತ್ತದ ನಿಜಾವೂ ಮಧ್ಯ ಬಿಂದು",
            "Point inside circle, fixed distance from all points",
            "The center of a circle is fixed",
            "ವೃತ್ತದ ಕೇಂದ್ರ ನಿಶ್ಚಿತವಾಗಿರುತ್ತದೆ",
            "Math"
        )
        add(
            "Radius",
            "ತ್ರಿಜ್ಯೆ",
            "ಕೇಂದ್ರದಿಂದ ವೃತ್ತದ ಯಾವುದೇ ಬಿಂದುವಿಗೆ ದೂರ",
            "Distance from center to any point on circle",
            "Radius is half of diameter",
            "ತ್ರಿಜ್ಯೆ ವ್ಯಾಸದ ಅರ್ಧವಾಗಿದೆ",
            "Math"
        )
        add(
            "Diameter",
            "ವ್ಯಾಸ",
            "ವೃತ್ತದ ಕೇಂದ್ರ ಹಾದುಹೋಗುವ ನೀಲಿ",
            "Chord passing through center",
            "Diameter = 2 × radius",
            "ವ್ಯಾಸ = 2 × ತ್ರಿಜ್ಯೆ",
            "Math"
        )
        add(
            "Chord",
            "ನೀಲಿ",
            "ವೃತ್ತದ ಯಾವುದೇ ಎರಡು ಬಿಂದುಗಳನ್ನು ಸಂಯೋಜಿಸುವ ರೇಖೆ",
            "Line joining two points on circle",
            "A diameter is the longest chord",
            "ವ್ಯಾಸ ಅತಿ ಉದ್ದವಾದ ನೀಲಿ",
            "Math"
        )
        add(
            "Arc",
            "ಚಾಪ",
            "ವೃತ್ತದ ಒಂದು ಭಾಗ",
            "Part of circle between two points",
            "Major arc is more than semicircle",
            "ದೊಡ್ಡ ಚಾಪ ಅರ್ಧವೃತ್ತಕ್ಕಿಂತ ಹೆಚ್ಚು",
            "Math"
        )
        add(
            "Secant",
            "ಛೇದಕ",
            "ವೃತ್ತವನ್ನು ಎರಡು ಬಿಂದುಗಳಲ್ಲಿ ಛೇದಿಸುವ ರೇಖೆ",
            "Line cutting circle at two points",
            "A secant extends beyond the circle",
            "ಛೇದಕ ವೃತ್ತದ ಹೊರಗೆ ವಿಸ್ತರಿತವಾಗುತ್ತದೆ",
            "Math"
        )
        add(
            "Tangent",
            "ಸ್ಪರ್ಶರೇಖೆ",
            "ವೃತ್ತವನ್ನು ಒಂದೇ ಬಿಂದುವಿನಲ್ಲಿ ಸ್ಪರ್ಶಿಸುವ ರೇಖೆ",
            "Line touching circle at exactly one point",
            "Tangent is perpendicular to radius",
            "ಸ್ಪರ್ಶರೇಖೆ ತ್ರಿಜ್ಯೆಗೆ ಲಂಬವಾಗಿರುತ್ತದೆ",
            "Math"
        )
        add(
            "Point of Tangency",
            "ಸ್ಪರ್ಶ ಬಿಂದು",
            "ಸ್ಪರ್ಶರೇಖೆ ವೃತ್ತವನ್ನು ಛೆದಿಸುವ ಬಿಂದು",
            "Point where tangent touches circle",
            "A tangent touches circle at point of tangency",
            "ಸ್ಪರ್ಶರೇಖೆ ಸ್ಪರ್ಶ ಬಿಂದುವಿನಲ್ಲಿ ಮುಟ್ಟುತ್ತದೆ",
            "Math"
        )
        add(
            "Segment",
            "ವಿಭಾಗ",
            "ನೀಲಿ ಮತ್ತು ವೃತ್ತದ ಚಾಪದಿಂದ ಸುತ್ತುವ ವಿಸ್ತೀರ್ಣ",
            "Region between chord and arc",
            "Find area of a segment",
            "ವಿಭಾಗದ ವಿಸ್ತೀರ್ಣ ಕಂಡುಹಿಡಿಯಿರಿ",
            "Math"
        )
        add(
            "Sector",
            "ತ್ರೈಜ್ಯ ಖಂಡ",
            "ಎರಡು ತ್ರಿಜ್ಯೆ ಮತ್ತು ಆರ್ಕ್ ರಿಂದ ಸುತ್ತುವ ಪ್ರದೇಶ",
            "Region between two radii and arc",
            "Area of sector = (θ/360°) × πr²",
            "ತ್ರೈಜ್ಯ ಖಂಡದ ವಿಸ್ತೀರ್ಣ = (θ/360°) × πr²",
            "Math"
        )
        add(
            "Angle Subtended",
            "ಉಪತಂಜ ಕೋನ",
            "ಚಾಪ ಅಥವಾ ನೀಲಿ ಕೇಂದ್ರದಲ್ಲಿ ರೂಪಿಸುವ ಕೋನ",
            "Central angle formed by chord or arc",
            "Angle subtended by diameter is 90°",
            "ವ್ಯಾಸದಿಂದ ಉಪತಂಜ ಕೋನ 90°",
            "Math"
        )
        add(
            "Cyclic Quadrilateral",
            "ಚಕ್ರೀಯ ಚತುರ್ಭುಜ",
            "ನಾಲ್ಕ ಶೃಂಗಗಳು ವೃತ್ತದ ಮೇಲೆ ಇರುವ ಚತುರ್ಭುಜ",
            "Quadrilateral with all vertices on circle",
            "Opposite angles of cyclic quadrilateral sum to 180°",
            "ಚಕ್ರೀಯ ಚತುರ್ಭುಜದ ಎದುರು ಕೋನಗಳ ಮೊತ್ತ 180°",
            "Math"
        )

        // Chapter 11: Constructions
        add(
            "Construction",
            "ರಚನೆ",
            "ಜ್ಯಾಮಿತಿಮತಿಕ ಆಕೃತಿಗಳನ್ನು ಯಲ್ಪನೆ ಪರಿಮಾಣದೊಂದಿಗೆ ತಯಾರಿಸುವುದು",
            "Creating geometric figures with ruler and compass",
            "Construct angle bisector of angle ABC",
            "∠ABC ನ ಕೋನ ದ್ವಿಭಾಜಕ ರಚಿಸಿ",
            "Math"
        )
        add(
            "Angle Bisector",
            "ಕೋನ ದ್ವಿಭಾಜಕ",
            "ಕೋನವನ್ನು ಎರಡು ಸಮಾನ ಭಾಗಗಳಾಗಿ ವಿಭಾಗಿಸುವ ರೇಖೆ",
            "Line dividing angle into two equal parts",
            "Bisect the given angle",
            "ನೀಡಿದ ಕೋನವನ್ನು ದ್ವಿಭಾಗಿತ ಮಾಡಿ",
            "Math"
        )
        add(
            "Perpendicular Bisector",
            "ಲಂಬ ದ್ವಿಭಾಜಕ",
            "ರೇಖೆಖಂಡದ ಮಧ್ಯಬಿಂದುದಿಂದ ಲಂಬವಾಗಿ ಚಲಿಸುವ ರೇಖೆ",
            "Line perpendicular to segment at midpoint",
            "Draw perpendicular bisector of AB",
            "AB ರ ಲಂಬ ದ್ವಿಭಾಜಕ ಎಳೆಯಿರಿ",
            "Math"
        )
        add(
            "Parallel Lines",
            "ಸಮಾಂತರ ರೇಖೆಗಳು",
            "ಎಂದೂ ಛೇದಿಸದ ಎರಡು ರೇಖೆಗಳು",
            "Lines that never intersect",
            "Construct parallel line to AB through C",
            "C ಮೂಲಕ AB ಗೆ ಸಮಾಂತರ ರೇಖೆ ರಚಿಸಿ",
            "Math"
        )
        add(
            "Perpendicular",
            "ಲಂಬ",
            "ಎರಡು ರೇಖೆಗಳು 90° ಕೋನದಲ್ಲಿ ಸಭೆ",
            "Lines meeting at 90° angle",
            "Draw perpendicular from P to AB",
            "AB ಗೆ P ನಿಂದ ಲಂಬ ಎಳೆಯಿರಿ",
            "Math"
        )
        add(
            "Triangle Construction",
            "ತ್ರಿಕೋನ ರಚನೆ",
            "ನೀಡಿದ ಷರತ್ತುಗಳ ಆಧಾರದ ಮೇಲೆ ತ್ರಿಕೋನ ಎಳೆಯುವುದು",
            "Drawing triangle with given conditions",
            "Construct triangle with sides 3cm, 4cm, 5cm",
            "ಬಾಹುಗಳು 3 cm, 4 cm, 5 cm ನ ತ್ರಿಕೋನ ರಚಿಸಿ",
            "Math"
        )
        add(
            "Tangent from External Point",
            "ಬಾಹ್ಯ ಬಿಂದುದಿಂದ ಸ್ಪರ್ಶರೇಖೆ",
            "ವೃತ್ತದ ಹೊರತಗೆ ಇರುವ ಬಿಂದುದಿಂದ ವೃತ್ತಕ್ಕೆ ಸ್ಪರ್ಶರೇಖೆ",
            "Tangent to circle from point outside",
            "Draw tangent from P to circle with center O",
            "O ಕೇಂದ್ರದ ವೃತ್ತಕ್ಕೆ P ನಿಂದ ಸ್ಪರ್ಶರೇಖೆ ಎಳೆಯಿರಿ",
            "Math"
        )

        // Chapter 12: Areas Related to Circles
        add(
            "Circumference",
            "ಸುತ್ತಳತೆ",
            "ವೃತ್ತದ ಪರಿಧಿ C = 2πr",
            "Perimeter of a circle",
            "Circumference = 2πr",
            "ಸುತ್ತಳತೆ = 2πr",
            "Math"
        )
        add(
            "Area of Circle",
            "ವೃತ್ತದ ವಿಸ್ತೀರ್ಣ",
            "ವೃತ್ತದ ಒಳಗಿನ ಪ್ರದೇಶ A = πr²",
            "Area = πr²",
            "Area of circle with radius 5 = 25π",
            "ತ್ರಿಜ್ಯೆ 5 ಆಗಿರುವ ವೃತ್ತದ ವಿಸ್ತೀರ್ಣ = 25π",
            "Math"
        )
        add(
            "Area of Sector",
            "ತ್ರೈಜ್ಯ ಖಂಡದ ವಿಸ್ತೀರ್ಣ",
            "A = (θ/360°) × πr² ಸೂತ್ರ",
            "Area = (θ/360°) × πr²",
            "Find area of sector with angle 60°",
            "60° ಕೋನದ ತ್ರೈಜ್ಯ ಖಂಡದ ವಿಸ್ತೀರ್ಣ ಕಂಡುಹಿಡಿಯಿರಿ",
            "Math"
        )
        add(
            "Length of Arc",
            "ಚಾಪದ ಉದ್ದ",
            "L = (θ/360°) × 2πr ಸೂತ್ರ",
            "Arc length = (θ/360°) × 2πr",
            "Find arc length of 90° angle",
            "90° ಕೋನದ ಚಾಪದ ಉದ್ದ ಕಂಡುಹಿಡಿಯಿರಿ",
            "Math"
        )
        add(
            "Area of Segment",
            "ವಿಭಾಗದ ವಿಸ್ತೀರ್ಣ",
            "ಸೆಕ್ಟರ ವಿಸ್ತೀರ್ಣ - ತ್ರಿಕೋನ ವಿಸ್ತೀರ್ಣ",
            "Area of segment = Area of sector - Area of triangle",
            "Calculate area of segment",
            "ವಿಭಾಗದ ವಿಸ್ತೀರ್ಣ ಲೆಕ್ಕ ಹಾಕಿ",
            "Math"
        )

        // Chapter 13: Surface Areas and Volumes
        add(
            "Surface Area",
            "ಮೇಲ್ಮೈ ವಿಸ್ತೀರ್ಣ",
            "ಘನ ವಸ್ತುವಿನ ಸಂಪೂರ್ಣ ಮೇಲ್ಮೈಯ ವಿಸ್ತೀರ್ಣ",
            "Total area of all faces",
            "Surface area of cube = 6a²",
            "ಘನದ ಮೇಲ್ಮೈ ವಿಸ್ತೀರ್ಣ = 6a²",
            "Math"
        )
        add(
            "Volume",
            "ಘನಫಲ",
            "ಘನ ವಸ್ತುವು ಆಕ್ರಮಿಸುವ ಜಾಗ",
            "Space occupied by object",
            "Volume of cube = a³",
            "ಘನದ ಘನಫಲ = a³",
            "Math"
        )
        add(
            "Cube",
            "ಘನ",
            "6 ಸಮಾನ ಚದರ ಮುಖಗಳು ಹೊಂದಿದ ಘನ ವಸ್ತು",
            "Six equal square faces",
            "Surface area of cube = 6a²",
            "ಘನದ ಮೇಲ್ಮೈ ವಿಸ್ತೀರ್ಣ = 6a²",
            "Math"
        )
        add(
            "Cuboid",
            "ಆಯತಘನ",
            "ಆಯತಾಕಾರದ ಪ್ರತಿ ಮುಖದೊಂದಿಗೆ ಘನವಾಗಿದೆ",
            "Rectangular solid",
            "Surface area = 2(lb+bh+hl)",
            "ಆಯತಘನದ ಮೇಲ್ಮೈ ವಿಸ್ತೀರ್ಣ = 2(lb+bh+hl)",
            "Math"
        )
        add(
            "Cylinder",
            "ಸಿಲಿಂಡರ್",
            "ವೃತ್ತಾಕಾರದ ಮೇಲೆ ಮತ್ತು ಕೆಳಗೆ ಹೊಂದಿದ ಗುಲಾಮ ಆಕಾರ",
            "Two circular faces and curved side",
            "Surface area = 2πr(h+r)",
            "ಸಿಲಿಂಡರ್ ಮೇಲ್ಮೈ ವಿಸ್ತೀರ್ಣ = 2πr(h+r)",
            "Math"
        )
        add(
            "Cone",
            "ಶಂಕು",
            "ವೃತ್ತಾಕಾರದ ತಳ ಮತ್ತು ಎಲೆಯಾಗಿ ಕೊನೆಗೊಳ್ಳುವ ಘನ",
            "Circular base tapering to point",
            "Surface area = πr(l+r)",
            "ಶಂಕುವಿನ ಮೇಲ್ಮೈ ವಿಸ್ತೀರ್ಣ = πr(l+r)",
            "Math"
        )
        add(
            "Sphere",
            "ಗೋಳ",
            "ಎಲ್ಲಾ ಬಿಂದುಗಳು ಕೇಂದ್ರದಿಂದ ಸಮದೂರದಲ್ಲಿರುವ ಘನ",
            "All points equidistant from center",
            "Surface area of sphere = 4πr²",
            "ಗೋಳದ ಮೇಲ್ಮೈ ವಿಸ್ತೀರ್ಣ = 4πr²",
            "Math"
        )
        add(
            "Hemisphere",
            "ಅರ್ಧಗೋಳ",
            "ಗೋಳವನ್ನು ಸರಿಸಮ ಮಾಗುವುದು",
            "Half of a sphere",
            "Surface area = 3πr²",
            "ಅರ್ಧಗೋಳದ ಮೇಲ್ಮೈ ವಿಸ್ತೀರ್ಣ = 3πr²",
            "Math"
        )
        add(
            "Slant Height",
            "ಇಚ್ಛೆದ ಎತ್ತರ",
            "ಶಂಕುವು ಜನರೇಟರ್ ರೇಖೆ",
            "Distance along side of cone",
            "Calculate slant height using Pythagoras",
            "ಪೈಥಾಗೋರಸ್ ಬಳಸಿ ಇಚ್ಛೆದ ಎತ್ತರ ಲೆಕ್ಕ ಹಾಕಿ",
            "Math"
        )

        // Chapter 14: Statistics
        add(
            "Statistics",
            "ಅಂಕಿಅಂಶ",
            "ದತ್ತಾಂಶ ಸಂಗ್ರಹ, ವಿಶ್ಲೇಷಣೆ ಮತ್ತು ವಿವರಣೆ",
            "Science of data collection and analysis",
            "Statistics helps in decision-making",
            "ಅಂಕಿಅಂಶ ನಿರ್ಧಾರ ತೆಗೆದುಕೊಳ್ಳಲು ಸಹಾಯ ಮಾಡುತ್ತದೆ",
            "Math"
        )
        add(
            "Data",
            "ದತ್ತಾಂಶ",
            "ಸಂಗ್ರಹಿಸಿದ ಸಂಖ್ಯೆ ಅಥವಾ ಮಾಹಿತಿ",
            "Collection of numbers or facts",
            "Record the data carefully",
            "ದತ್ತಾಂಶವನ್ನು ಎಚ್ಚರಿಕೆಯಿಂದ ದಾಖಲೆ ಮಾಡಿ",
            "Math"
        )
        add(
            "Frequency",
            "ಆವೃತ್ತಿ",
            "ಡೇಟಾ ಪರಿಸ್ಥಿತಿ ಎಷ್ಟು ಬಾರಿ ಬರುತ್ತದೆ",
            "How many times data value appears",
            "Frequency distribution table",
            "ಆವೃತ್ತಿ ವಿತರಣೆ ಕೋಷ್ಟಕ",
            "Math"
        )
        add(
            "Mean",
            "ಸರಾಸರಿ",
            "ಎಲ್ಲಾ ಮೌಲ್ಯಗಳ ಸಂಕಲನ ÷ ಮೌಲ್ಯಗಳ ಸಂಖ್ಯೆ",
            "Average of all values",
            "Mean = Sum/Number of values",
            "ಸರಾಸರಿ = ಮೊತ್ತ/ಮೌಲ್ಯಗಳ ಸಂಖ್ಯೆ",
            "Math"
        )
        add(
            "Median",
            "ಮಧ್ಯಾಂಕ",
            "ಡೇಟಾವನ್ನು ಕ್ರಮದಲ್ಲಿ ಜೋಡಿಸಿದಾಗ ಮಧ್ಯದ ಮೌಲ್ಯ",
            "Middle value when data is ordered",
            "Find median of 2, 3, 5, 7, 9",
            "2, 3, 5, 7, 9 ರ ಮಧ್ಯಾಂಕ ಕಂಡುಹಿಡಿಯಿರಿ",
            "Math"
        )
        add(
            "Mode",
            "ಬಹುಲಕ",
            "ಯಾವುದೇ ಮೌಲ್ಯ ಅತಿ ಅಂತಃ ಬರುತ್ತದೆ",
            "Most frequently occurring value",
            "Find the mode of the data",
            "ದತ್ತಾಂಶದ ಬಹುಲಕ ಕಂಡುಹಿಡಿಯಿರಿ",
            "Math"
        )
        add(
            "Range",
            "ವ್ಯಾಪ್ತಿ",
            "ಎತ್ತರ ಮೌಲ್ಯ - ನಿಮ್ನ ಮೌಲ್ಯ",
            "Highest value - Lowest value",
            "Range = Max - Min",
            "ವ್ಯಾಪ್ತಿ = ಗರಿಷ್ಠ - ಕನಿಷ್ಠ",
            "Math"
        )
        add(
            "Standard Deviation",
            "ಪ್ರಮಾಣ ವಿಚಲನ",
            "ಡೇಟಾ ಎರಡರೆ ವಿತರಣೆ ಅಳತೆ",
            "Measure of data spread",
            "Calculate standard deviation",
            "ಪ್ರಮಾಣ ವಿಚಲನ ಲೆಕ್ಕ ಹಾಕಿ",
            "Math"
        )
        add(
            "Variance",
            "ವ್ಯತ್ಯಾಸ",
            "ಡೇಟಾ ಬಿಂದುಗಳ ಪ್ರಮಾಣ ವಿಚಲನದ ವರ್ಗ",
            "Square of standard deviation",
            "Variance = σ²",
            "ವ್ಯತ್ಯಾಸ = σ²",
            "Math"
        )
        add(
            "Histogram",
            "ಆವೃತ್ತಿ ರೇಖಾತ್ಮಕ",
            "ಚಿತ್ರಿಸುವ ವೃತ್ತೀಕೃತ ಗ್ರಾಫ್",
            "Bar graph for grouped data",
            "Draw histogram from frequency table",
            "ಆವೃತ್ತಿ ಕೋಷ್ಟಕದಿಂದ ಆವೃತ್ತಿ ರೇಖಾತ್ಮಕ ಎಳೆಯಿರಿ",
            "Math"
        )
        add(
            "Pie Chart",
            "ವೃತ್ತಾಕಾರ ರೇಖಾಮುದ್ರಣ",
            "ಸಂಪೂರ್ಣ ಅಡ್ಡಕ್ಕೆ ತುಂಡಿನ ಸಮಸ್ಪರ್ಶೀ ತೀಕ್ಷ್ಣ",
            "Circular chart divided into sectors",
            "Create pie chart from percentages",
            "ಶೇಕಡಾವಾರುವಿಂದ ವೃತ್ತಾಕಾರ ರೇಖಾಮುದ್ರಣ ರಚಿಸಿ",
            "Math"
        )

        // Chapter 15: Probability
        add(
            "Probability",
            "ಸಂಭವನೀಯತೆ",
            "ಘಟನೆ ಪ್ರತಿಫಲವಾಗುವ ಸ್ಥಿತಿ",
            "Chance or likelihood of an event",
            "Probability ranges from 0 to 1",
            "ಸಂಭವನೀಯತೆ 0 ನಿಂದ 1 ರವರೆಗೆ",
            "Math"
        )
        add(
            "Experiment",
            "ಪ್ರಯೋಗ",
            "ಯಾವುದೇ ಕ್ರಿಯೆ ಫಲಿತಾಂಶ ಅನಿಶ್ಚಿತ",
            "Trial with uncertain outcome",
            "Tossing a coin is an experiment",
            "ನೆಣ ಎಸೆಯುವುದು ಒಂದು ಪ್ರಯೋಗ",
            "Math"
        )
        add(
            "Outcome",
            "ಫಲಿತಾಂಶ",
            "ಪ್ರಯೋಗದ ಸೂತ್ರಿತ ಫಲ",
            "Result of an experiment",
            "Heads or tails is outcome",
            "ಮೇಲು ಅಥವಾ ಬೆಳೆಯು ಫಲಿತಾಂಶ",
            "Math"
        )
        add(
            "Sample Space",
            "ಮಾದರಿ ಜಾಗ",
            "ಪ್ರಯೋಗದ ಎಲ್ಲಾ ಸಾಧ್ಯ ಫಲಿತಾಂಶದ ಸಮೂಹ",
            "All possible outcomes of experiment",
            "Sample space for coin = {H, T}",
            "ನೆಣದ ಮಾದರಿ ಜಾಗ = {H, T}",
            "Math"
        )
        add(
            "Event",
            "ಘಟನೆ",
            "ಮಾದರಿ ಜಾಗದ ಉಪಸೇಟ್",
            "Subset of sample space",
            "Getting heads is an event",
            "ಮೇಲು ಪಡೆಯುವುದು ಒಂದು ಘಟನೆ",
            "Math"
        )
        add(
            "Favorable Outcomes",
            "ಸಕಾರಾತ್ಮಕ ಫಲಿತಾಂಶಗಳು",
            "ಸಾಧ್ಯ ಫಲಿತಾಂಶಗಳು ನಮಗೆ ಚೆನ್ನಾಗಿರುವ",
            "Outcomes we want",
            "For even number, favorable outcomes are 2, 4, 6",
            "ಸಮ ಸಂಖ್ಯೆಗಾಗಿ ಸಕಾರಾತ್ಮಕ ಫಲಿತಾಂಶಗಳು 2, 4, 6",
            "Math"
        )
        add(
            "Total Outcomes",
            "ಒಟ್ಟು ಫಲಿತಾಂಶಗಳು",
            "ಸಾಧ್ಯ ಫಲಿತಾಂಶಗಳ ಒಟ್ಟು ಸಂಖ್ಯೆ",
            "Total number of possible outcomes",
            "Total outcomes when rolling die = 6",
            "ಸಲಿಕೆ ಕುಲುಂಬಿಸುವಾಗ ಒಟ್ಟು ಫಲಿತಾಂಶಗಳು = 6",
            "Math"
        )
        add(
            "Probability Formula",
            "ಸಂಭವನೀಯತೆ ಸೂತ್ರ",
            "P(E) = ಸಕಾರಾತ್ಮಕ ಫಲಿತಾಂಶಗಳು / ಒಟ್ಟು ಫಲಿತಾಂಶಗಳು",
            "P(E) = Favorable/Total",
            "Calculate probability of even number",
            "ಸಮ ಸಂಖ್ಯೆಯ ಸಂಭವನೀಯತೆ ಲೆಕ್ಕ ಹಾಕಿ",
            "Math"
        )
        add(
            "Complementary Event",
            "ವರ್ಜಿತ ಘಟನೆ",
            "ಘಟನೆ E ಘಟಿತವಾಗದ ಫಲಿತಾಂಶ",
            "Event that E does not occur",
            "P(E) + P(not E) = 1",
            "P(E) + P(E ಆದರೆ) = 1",
            "Math"
        )
        add(
            "Independent Events",
            "ಸ್ವತಂತ್ರ ಘಟನೆಗಳು",
            "ಒಂದು ಘಟನೆ ಮತ್ತೊಂದರ ಸಂಭವನೀಯತೆ ಪರಿವರ್ತಿತ ಮಾಡದ",
            "Events not affecting each other",
            "Tossing coin and rolling die are independent",
            "ನೆಣ ಎಸೆಯುವುದು ಮತ್ತು ಸಲಿಕೆ ಕುಲುಂಬಿಸುವುದು ಸ್ವತಂತ್ರ",
            "Math"
        )
        add(
            "Dependent Events",
            "ಅವಲಂಬಿತ ಘಟನೆಗಳು",
            "ಒಂದು ಘಟನೆ ಮತ್ತೊಂದರ ಸಂಭವನೀಯತೆ ಬದಲಾಯಿಸುವ",
            "Events affecting each other",
            "Drawing cards without replacement",
            "ಬದಲಾಗುವುದಿಲ್ಲದೆ ಕಾರ್ಡ್‌ಗಳನ್ನು ಸೆಳೆಯುವುದು",
            "Math"
        )

        return list
    }
}


