package com.binwin20.frescodemo

import android.app.Activity
import android.os.Bundle
import com.facebook.drawee.view.SimpleDraweeView

/**
 *
 * @author justin.wu
 * @date 4/14/18
 */
class SecondActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val draweeView: SimpleDraweeView = findViewById(R.id.image_view)
        draweeView.setImageURI(Constant.URL)
    }
}