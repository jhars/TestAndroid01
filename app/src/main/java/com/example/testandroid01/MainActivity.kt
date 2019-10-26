package com.example.testandroid01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var view = findViewById<TextView>(R.id.show_text_view)

        var user_input = findViewById<EditText>(R.id.user_input)
        var show_btn = findViewById<Button>(R.id.show_btn)

        show_btn.setOnClickListener {
            var text = user_input.text.toString()

            view.text = text
        }




    }
}
