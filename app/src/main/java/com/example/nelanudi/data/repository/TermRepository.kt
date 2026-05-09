package com.example.nelanudi.data.repository

import com.example.nelanudi.data.local.dao.TermDao
import com.example.nelanudi.data.local.entity.Term
import kotlinx.coroutines.flow.Flow

class TermRepository(private val dao: TermDao) {

    fun getAll() = dao.getAllTerms()

    fun search(q: String): Flow<List<Term>> = dao.searchTerms(q)

    // Generic search used by ViewModel (wraps DAO searchTerms)
    fun searchAny(q: String): Flow<List<Term>> = dao.searchTerms(q)

    fun getBySubject(s: String) = dao.getTermsBySubject(s)

    fun searchBySubject(q: String, s: String) = dao.searchTermsBySubject(q, s)

    fun saved() = dao.getSavedTerms()

    suspend fun random() = dao.getRandomTerm()

    suspend fun insertAll(list: List<Term>) = dao.insertAll(list)

    suspend fun updateTerm(term: Term) = dao.updateTerm(term)
    
    fun getRecentlyViewed() = dao.getRecentlyViewed()

    suspend fun clearAll() = dao.clearAll()

    suspend fun getCount() = dao.getCount()

    suspend fun exists(word: String) = dao.exists(word)
}
