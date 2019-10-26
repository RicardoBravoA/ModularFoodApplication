package com.rba.modular

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rba.modular.navigation.Activity
import com.rba.modular.navigation.intentTo

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Thread {
            Thread.sleep(1500)
            startActivity(intentTo(Activity.Main))
            finish()
        }.start()

    }

}
