package com.example.toast_msg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        val btn=findViewById<Button>(R.id.button2)
        btn.setOnClickListener(View.OnClickListener()
        {
            val text = "Hello toast!"
            val duration = Toast.LENGTH_LONG

            val toast = Toast.makeText(this, text, duration) // in Activity
            toast.show()
        });

    }

}