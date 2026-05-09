package com.example.nelanudi.work

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.nelanudi.data.prefs.PreferencesManager
import com.example.nelanudi.utils.NotificationHelper

class RevisionReminderWorker(ctx: Context, params: WorkerParameters) : CoroutineWorker(ctx, params) {
    override suspend fun doWork(): Result {
        return try {
            val pending = PreferencesManager.getRevisionCount(applicationContext)
            NotificationHelper.sendRevisionReminder(applicationContext, pending)
            Result.success()
        } catch (e: Exception) {
            Result.failure()
        }
    }
}

