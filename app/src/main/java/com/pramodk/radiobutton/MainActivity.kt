package com.pramodk.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var radioButton:RadioButton
    private lateinit var rb_male:RadioButton
    private lateinit var rb_female:RadioButton
    private lateinit var rb_football:RadioButton
    private lateinit var rb_cricket:RadioButton
    private lateinit var rb_hockey:RadioButton
    private lateinit var rb_badminton:RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioButton = findViewById(R.id.radioButton)
        rb_male = findViewById(R.id.rb_male)
        rb_female = findViewById(R.id.rb_female)
        rb_football = findViewById(R.id.rb_football)
        rb_cricket = findViewById(R.id.rb_cricket)
        rb_hockey = findViewById(R.id.rb_hockey)
        rb_badminton = findViewById(R.id.rb_badminton)

        radioButton.setOnClickListener(View.OnClickListener {
            message("Selected")
        })
    }

    // multiple Radio click method
    fun onRadioButtonClicked(view: View) {
        var checked = view as RadioButton
        if (rb_male == checked) {
            message(rb_male.text.toString() + if (rb_male.isChecked) " Checked " else " UnChecked ")
        }
        if (rb_female == checked) {
            message(rb_female.text.toString() + if (rb_female.isChecked) " Checked " else " UnChecked ")
        }

        if (rb_football == checked) {
            message(rb_football.text.toString() + if (rb_football.isChecked) " Checked " else " UnChecked ")
        }
        if (rb_cricket == checked) {
            message(rb_cricket.text.toString() + if (rb_cricket.isChecked) " Checked " else " UnChecked ")
        }
        if (rb_hockey == checked) {
            message(rb_hockey.text.toString() + if (rb_hockey.isChecked) " Checked " else " UnChecked ")
        }
        if (rb_badminton == checked) {
            message(rb_badminton.text.toString() + if (rb_badminton.isChecked) " Checked " else " UnChecked ")
        }
    }

    private fun message(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show()
    }
}