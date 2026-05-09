package com.example.nelanudi.data.local.database
import com.example.nelanudi.data.local.entity.Term
import android.content.Context
import androidx.room.*

import com.example.nelanudi.data.local.dao.TermDao

@Database(entities = [Term::class], version = 5)
abstract class AppDatabase : RoomDatabase() {

    abstract fun termDao(): TermDao

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "nalla_nudi_db"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}
