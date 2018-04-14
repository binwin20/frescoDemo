package com.binwin20.frescodemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

/**
 *
 * @author justin.wu
 * @date 4/14/18
 */
class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.goto_second_button)
        button.setOnClickListener({
            startActivity(Intent(this, SecondActivity::class.java))
        })
    }
}