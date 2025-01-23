package org.roger.project

import android.app.Application
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.ktx.messaging
import com.google.firebase.FirebaseApp

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // 初始化 Firebase
        FirebaseApp.initializeApp(this)

        // 取得並印出 Token
        // TODO 上傳後端
        Firebase.messaging.token.addOnCompleteListener { task ->
            if (!task.isSuccessful) {
                // 失敗處理
                return@addOnCompleteListener
            }
            val token = task.result

            println("FCM Token: $token")
        }
    }
}