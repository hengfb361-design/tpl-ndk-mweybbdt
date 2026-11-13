package com.example.tndk

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // Implemented in app/src/main/cpp/native-lib.cpp
    private external fun stringFromJNI(): String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.label).text = stringFromJNI()
    }

    companion object {
        init { System.loadLibrary("native-lib") }
    }
}
