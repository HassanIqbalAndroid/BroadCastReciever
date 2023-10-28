package com.example.broadcast_reciever_practice

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class Charging:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val action = intent?.action
        when(action){
            Intent.ACTION_POWER_CONNECTED-> Toast.makeText(context,"Charging ON",Toast.LENGTH_SHORT).show()
            Intent.ACTION_POWER_DISCONNECTED-> Toast.makeText(context,"Charging OFF",Toast.LENGTH_SHORT).show()
        }
    }
}