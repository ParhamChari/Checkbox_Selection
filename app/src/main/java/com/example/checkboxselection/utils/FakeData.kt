package com.example.checkboxselection.utils

import com.example.checkboxselection.R
import com.example.checkboxselection.data.model.AppModel

object FakeData {

    val appData = arrayListOf(
        AppModel(R.drawable.whatsapp, "WhatsApp"),
        AppModel(R.drawable.telegram, "Telegram"),
        AppModel(R.drawable.instagram, "Instagram"),
        AppModel(R.drawable.twitter_x, "Twitter"),
        AppModel(R.drawable.facebook, "Facebook"),
        AppModel(R.drawable.facebook_messenger, "Messenger")
    )
}