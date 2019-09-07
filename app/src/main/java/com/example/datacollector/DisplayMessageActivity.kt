package com.example.datacollector

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Chronometer
import android.widget.TextView
import android.widget.Switch


class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        findViewById<TextView>(R.id.textView).apply {
            text = message
        }

        val chronometer = findViewById<Chronometer>(R.id.chronometer)
        chronometer.setOnChronometerTickListener {  }
            // do something when chronometer changes

        val switch = findViewById<Switch>(R.id.switch1)
        switch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Start chronometer
                chronometer.start()
            } else {
                // Stop chronometer
                chronometer.stop()
            }
        }
    }
}
