package org.roger.project.fcm

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class FcmMessagingService : FirebaseMessagingService() {

    // 當 token 重新產生時（例如使用者重新安裝、清除資料）
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        // 重新上傳或儲存 token
        println("New FCM Token: $token")
    }

    // 當收到前景推播訊息時會呼叫此函式
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)

        val data = remoteMessage.data
        val notificationBody = remoteMessage.notification?.body
        val notificationTitle = remoteMessage.notification?.title

        println("FCM message data: $data")
        println("FCM notification title: $notificationTitle")
        println("FCM notification body: $notificationBody")
    }
}