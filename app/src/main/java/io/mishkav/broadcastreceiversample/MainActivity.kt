package io.mishkav.broadcastreceiversample

import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import io.mishkav.broadcastreceiversample.receiver.MyReceiver
import io.mishkav.broadcastreceiversample.service.MyService

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.button).setOnClickListener {
            registerReceiver(br, filter)
        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(br)
    }
    companion object {
        val br = MyReceiver()
        val filter = IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION).apply {
            addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        }
    }
}