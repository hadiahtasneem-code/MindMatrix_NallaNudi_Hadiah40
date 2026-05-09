package com.example.nelanudi.data.prefs

import android.content.Context
import androidx.core.content.edit
import org.json.JSONArray

object PreferencesManager {
    private const val PREFS = "nalla_prefs"
    private const val KEY_DARK = "theme_dark"
    private const val KEY_PRACTICED = "practiced_count"
    private const val KEY_MASTERED = "mastered_count"
    private const val KEY_STREAK_DAYS = "streak_days"
    private const val KEY_STREAK_LAST = "streak_last"
    private const val KEY_REVISION_IDS = "revision_ids" // stored as JSON array of ints
    private const val KEY_PROFILE_NAME = "profile_name"
    private const val KEY_PROFILE_BIO = "profile_bio"
    private const val KEY_PROFILE_GOAL = "profile_goal"
    private const val KEY_PROFILE_IMAGE = "profile_image"
    private const val KEY_DAILY_PRACTICE = "daily_practice" // JSON object date->count
    private const val KEY_REMINDER_ENABLED = "reminder_enabled"
    private const val KEY_REMINDER_TIME = "reminder_time" // stored as "HH:mm"

    private fun prefs(ctx: Context) = ctx.getSharedPreferences(PREFS, Context.MODE_PRIVATE)

    fun isDark(ctx: Context): Boolean = prefs(ctx).getBoolean(KEY_DARK, false)
    fun setDark(ctx: Context, v: Boolean) = prefs(ctx).edit { putBoolean(KEY_DARK, v) }

    fun isReminderEnabled(ctx: Context): Boolean = prefs(ctx).getBoolean(KEY_REMINDER_ENABLED, false)
    fun setReminderEnabled(ctx: Context, v: Boolean) = prefs(ctx).edit { putBoolean(KEY_REMINDER_ENABLED, v) }

    fun getReminderTime(ctx: Context): String = prefs(ctx).getString(KEY_REMINDER_TIME, "09:00") ?: "09:00"
    fun setReminderTime(ctx: Context, v: String) = prefs(ctx).edit { putString(KEY_REMINDER_TIME, v) }

    fun resetProgress(ctx: Context) {
        prefs(ctx).edit {
            remove(KEY_PRACTICED)
            remove(KEY_MASTERED)
            remove(KEY_STREAK_DAYS)
            remove(KEY_STREAK_LAST)
            remove(KEY_REVISION_IDS)
            remove(KEY_DAILY_PRACTICE)
        }
    }

    fun incrementPracticed(ctx: Context, delta: Int = 1) {
        val p = prefs(ctx)
        val cur = p.getInt(KEY_PRACTICED, 0)
        p.edit { putInt(KEY_PRACTICED, cur + delta) }
    }

    fun incrementMastered(ctx: Context, delta: Int = 1) {
        val p = prefs(ctx)
        val cur = p.getInt(KEY_MASTERED, 0)
        p.edit { putInt(KEY_MASTERED, cur + delta) }
    }

    fun getPracticed(ctx: Context): Int = prefs(ctx).getInt(KEY_PRACTICED, 0)
    fun getMastered(ctx: Context): Int = prefs(ctx).getInt(KEY_MASTERED, 0)

    fun setStreak(ctx: Context, days: Int, lastIso: String) {
        prefs(ctx).edit { putInt(KEY_STREAK_DAYS, days); putString(KEY_STREAK_LAST, lastIso) }
    }

    fun getStreakDays(ctx: Context): Int = prefs(ctx).getInt(KEY_STREAK_DAYS, 0)
    fun getStreakLastIso(ctx: Context): String? = prefs(ctx).getString(KEY_STREAK_LAST, null)

    fun addRevisionId(ctx: Context, id: Int) {
        val p = prefs(ctx)
        val arr = JSONArray(p.getString(KEY_REVISION_IDS, "[]"))
        // avoid duplicates
        for (i in 0 until arr.length()) if (arr.optInt(i) == id) return
        arr.put(id)
        p.edit { putString(KEY_REVISION_IDS, arr.toString()) }
    }

    fun clearRevisionIds(ctx: Context) { prefs(ctx).edit { putString(KEY_REVISION_IDS, "[]") } }

    fun getRevisionCount(ctx: Context): Int {
        val arr = JSONArray(prefs(ctx).getString(KEY_REVISION_IDS, "[]"))
        return arr.length()
    }

    fun getRevisionIds(ctx: Context): List<Int> {
        val arr = JSONArray(prefs(ctx).getString(KEY_REVISION_IDS, "[]"))
        val list = mutableListOf<Int>()
        for (i in 0 until arr.length()) list.add(arr.optInt(i))
        return list
    }

    // Profile
    fun saveProfile(ctx: Context, name: String, bio: String, goal: String, imageUri: String?) {
        prefs(ctx).edit {
            putString(KEY_PROFILE_NAME, name)
            putString(KEY_PROFILE_BIO, bio)
            putString(KEY_PROFILE_GOAL, goal)
            putString(KEY_PROFILE_IMAGE, imageUri)
        }
    }

    fun getProfile(ctx: Context): Map<String, String?> = mapOf(
        "name" to prefs(ctx).getString(KEY_PROFILE_NAME, ""),
        "bio" to prefs(ctx).getString(KEY_PROFILE_BIO, ""),
        "goal" to prefs(ctx).getString(KEY_PROFILE_GOAL, ""),
        "image" to prefs(ctx).getString(KEY_PROFILE_IMAGE, null)
    )

    // Daily practice counts (map of ISO date -> count stored as JSON object)
    fun addPracticeForDate(ctx: Context, isoDate: String, delta: Int = 1) {
        val json = prefs(ctx).getString(KEY_DAILY_PRACTICE, "{}") ?: "{}"
        val obj = org.json.JSONObject(json)
        val cur = obj.optInt(isoDate, 0)
        obj.put(isoDate, cur + delta)
        prefs(ctx).edit { putString(KEY_DAILY_PRACTICE, obj.toString()) }
    }

    fun getLastNDays(ctx: Context, n: Int): Map<String, Int> {
        val json = prefs(ctx).getString(KEY_DAILY_PRACTICE, "{}") ?: "{}"
        val obj = org.json.JSONObject(json)
        val out = mutableMapOf<String, Int>()
        val keys = obj.keys()
        while (keys.hasNext()) {
            val k = keys.next()
            out[k] = obj.optInt(k, 0)
        }
        return out.toMap()
    }
}

