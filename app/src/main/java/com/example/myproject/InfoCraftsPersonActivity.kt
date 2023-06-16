package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class InfoCraftsPersonActivity : AppCompatActivity() {
    lateinit var mNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_crafts_person)
        setContentView(R.layout.activity_crafts_info)
        mNext = findViewById(R.id.mBtnNext)

        mNext.setOnClickListener {
            val next = Intent(this@InfoCraftsPersonActivity, HomeActivity::class.java)
            startActivity(next)
        }
    }
}