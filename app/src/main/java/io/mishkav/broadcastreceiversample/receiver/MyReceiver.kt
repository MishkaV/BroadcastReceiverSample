package io.mishkav.broadcastreceiversample.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import io.mishkav.broadcastreceiversample.service.MyService

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.d(TAG, "onReceive")
        val pendingResult: PendingResult = goAsync()
        context.startService(MyService.getIntent(context))
    }

    companion object {
        private const val TAG = "MY_RECEIVER_TAG"
    }
}