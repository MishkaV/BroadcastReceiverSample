package io.mishkav.broadcastreceiversample.service

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder
import android.util.Log
import io.mishkav.broadcastreceiversample.receiver.MyReceiver

class MyService : Service() {

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "onStartCommand")
        return START_NOT_STICKY
    }

    override fun onBind(intent: Intent): IBinder? {
        Log.d(TAG, "onBind")
        return null
    }

    companion object {
        private const val TAG = "MY_SERVICE_TAG"
        fun getIntent(context: Context) = Intent(context, MyService::class.java)
    }
}