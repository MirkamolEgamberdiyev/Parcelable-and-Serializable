package com.mirkamol.intentlesson4task1.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.mirkamol.intentlesson4task1.R
import com.mirkamol.intentlesson4task1.model.Human
import com.mirkamol.intentlesson4task1.model.Person
import com.mirkamol.intentlesson4task1.model.User

class FivethActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fiveth2)

        initViews()
    }

    fun initViews() {
        val tv_detail = findViewById<TextView>(R.id.tv_text)
        val btn_back = findViewById<Button>(R.id.btn_button)

        btn_back.setOnClickListener {
            backToFinish(human)
        }

        val user = intent.getParcelableExtra<User>("user")

        tv_detail.setText(user.toString())

    }
    val human = Human("Muhammadyusuf", "22")

    override fun onBackPressed() {
        super.onBackPressed()
        backToFinish(human)
    }

    fun backToFinish(human: Human) {
        val returnIntent = Intent()
        returnIntent.putExtra("human", human)
        setResult(RESULT_OK, returnIntent)
        finish()
    }

}