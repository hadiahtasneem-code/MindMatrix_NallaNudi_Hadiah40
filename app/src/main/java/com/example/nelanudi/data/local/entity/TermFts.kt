package com.example.nelanudi.data.local.entity

import androidx.room.Entity
import androidx.room.Fts4

// FTS virtual table to enable fast full-text search on englishWord and kannadaMeaning
@Entity(tableName = "terms_fts")
@Fts4(contentEntity = Term::class)
data class TermFts(
    val englishWord: String,
    val kannadaMeaning: String
)
