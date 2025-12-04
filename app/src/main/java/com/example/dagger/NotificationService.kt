package com.example.dagger

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService {
    fun send(to: String, from: String, body: String)
}

@ApplicationScope
class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.d("Notification Service", "Email sent")
    }
}

class MessageService(private val retryCount: Int) : NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.d("Notification Service", "Message sent $retryCount")
    }
}