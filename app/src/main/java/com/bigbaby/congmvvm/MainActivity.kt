package com.bigbaby.congmvvm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.bigbaby.congmvvm.demotest.databinding.DemoTestActivity
import com.bigbaby.congmvvm.demotest.viewmodel.ViewModelTestActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tv_data_binding).setOnClickListener {
            var intent = Intent(this, DemoTestActivity::class.java)
            startActivity(intent)
        }
        findViewById<TextView>(R.id.tv_view_model).setOnClickListener {
            var intent = Intent(this, ViewModelTestActivity::class.java)
            startActivity(intent)
        }
    }
}