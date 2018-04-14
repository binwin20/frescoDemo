package com.binwin20.frescodemo

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

/**
 *
 * @author justin.wu
 * @date 4/14/18
 */
class DemoApp:Application() {
    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
    }
}