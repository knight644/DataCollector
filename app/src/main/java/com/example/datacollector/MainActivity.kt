package com.example.datacollector

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when user taps on 'Standing' button */
    fun openStanding(view: View) {
        //Do something in response
        val buttonName = findViewById<Button>(R.id.button1)
        val message = buttonName.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    /** Called when user taps on 'Walking' button */
    fun openWalking(view: View) {
        //Do something in response
        val buttonName = findViewById<Button>(R.id.button2)
        val message = buttonName.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    /** Called when user taps on 'Sitting' button */
    fun openSitting(view: View) {
        //Do something in response
        val buttonName = findViewById<Button>(R.id.button3)
        val message = buttonName.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    /** Called when user taps on 'Falling' button */
    fun openFalling(view: View) {
        //Do something in response
        val buttonName = findViewById<Button>(R.id.button4)
        val message = buttonName.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}
