package com.example.nelanudi.data.local.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "terms",
    indices = [
        Index(value = ["englishWord"]),
        Index(value = ["subject"]),
        Index(value = ["viewCount"])
    ]
)
data class Term(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val englishWord: String,
    val kannadaMeaning: String,
    val pronunciation: String,
    val kannadaDefinition: String,
    val simpleExplanation: String,
    val exampleUsage: String,
    val kannadaExample: String = "",
    val subject: String,
    val isSaved: Boolean = false,
    val viewCount: Int = 0
)
