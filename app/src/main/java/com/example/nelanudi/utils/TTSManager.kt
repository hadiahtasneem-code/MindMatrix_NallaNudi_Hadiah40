package com.example.nelanudi.utils

import android.content.Context
import android.media.AudioAttributes
import android.os.Bundle
import android.speech.tts.TextToSpeech
import java.util.*

class TTSManager(context: Context) {

    private var tts: TextToSpeech? = null
    private var isInitialized = false

    init {
        tts = TextToSpeech(context) { status ->
            if (status == TextToSpeech.SUCCESS) {
                tts?.apply {
                    language = Locale.US
                    // Ensure the audio attributes are set to use the music stream
                    val audioAttributes = AudioAttributes.Builder()
                        .setUsage(AudioAttributes.USAGE_ASSISTANCE_ACCESSIBILITY)
                        .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                        .build()
                    setAudioAttributes(audioAttributes)
                    isInitialized = true
                }
            }
        }
    }

    fun speak(text: String) {
        if (isInitialized) {
            val params = Bundle()
            // Set volume to maximum for the TTS engine
            params.putFloat(TextToSpeech.Engine.KEY_PARAM_VOLUME, 1.0f)
            tts?.speak(text, TextToSpeech.QUEUE_FLUSH, params, "tts_id")
        }
    }

    fun shutdown() {
        tts?.shutdown()
    }
}
