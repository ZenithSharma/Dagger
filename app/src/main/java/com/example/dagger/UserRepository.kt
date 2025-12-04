package com.example.dagger

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun saveUser(email: String, password: String)
}

@ActivityScope
class SqlRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("User Repository", "User saved in DB")
        analyticsService.trackEvent("Save User", "CREATE")
    }
}

class FireBaseRepository(val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("User Repository", "User saved in Firebase")
        analyticsService.trackEvent("Save User", "CREATE")
    }
}