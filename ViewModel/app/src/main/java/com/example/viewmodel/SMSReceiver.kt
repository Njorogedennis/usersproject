package com.example.viewmodel

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Telephony

class SMSReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Telephony.Sms.Intents.SMS_RECEIVED_ACTION) {
            //val contentResolver = context.contentResolver
            val smsMessages = Telephony.Sms.Intents.getMessagesFromIntent(intent)
            smsMessages.forEach {
                // it.
            }
        }
    }
}