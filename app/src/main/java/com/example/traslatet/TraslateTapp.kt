package com.example.traslatet

import android.app.Application
import com.google.android.gms.ads.MobileAds

class TraslateTapp:Application() {

    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(this)
    }
}
