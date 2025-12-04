package com.example.dagger

import android.util.Log
import javax.inject.Singleton

interface AnalyticsService {
    fun trackEvent(eventName: String, eventType: String)
}

@Singleton
class Mixpanel : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("Analytics Service", "Mixpanel - $eventName - $eventType")
    }
}

class FirebaseAnalytics : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("Analytics Service", "Firebase - $eventName - $eventType")
    }
}