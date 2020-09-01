package com.moriarity_code.trackyourfit.activity

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.moriarity_code.trackyourfit.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(
            {
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
            }, 1000
        )
        if (Build.VERSION.SDK_INT >= 21) {
            window.statusBarColor =
                ContextCompat.getColor(this@SplashActivity, R.color.colorPrimaryBackground)
            window.navigationBarColor =
                ContextCompat.getColor(this@SplashActivity, R.color.colorPrimaryBackground)
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}