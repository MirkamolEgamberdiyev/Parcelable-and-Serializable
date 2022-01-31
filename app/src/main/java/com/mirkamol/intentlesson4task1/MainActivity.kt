package com.mirkamol.intentlesson4task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import com.mirkamol.intentlesson4task1.activity.*
import com.mirkamol.intentlesson4task1.model.Member
import com.mirkamol.intentlesson4task1.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

    }

    private fun initViews() {
        val btn_first = findViewById<Button>(R.id.btn_first)
        val btn_second = findViewById<Button>(R.id.btn_second)
        val btn_third = findViewById<Button>(R.id.btn_third)
        val btn_fourth = findViewById<Button>(R.id.btn_fourth)
        val btn_fiveth = findViewById<Button>(R.id.btn_fiveth)


        btn_first.setOnClickListener {
            val intent = Intent(this, FirstAactivity::class.java)
            intent.putExtra("name", "Egamberdiyev Mirkamol")
            intent.putExtra("age", "22")
            startActivity(intent)

        }
        btn_second.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            val member = Member("Mirkamol", "22")
            intent.putExtra("user", member)
            startActivity(intent)
        }
        btn_third.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            val user = User("Mirkamol", "22")
            intent.putExtra("user" ,user)
            startActivity(intent)
        }

        btn_fourth.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }


        btn_fiveth.setOnClickListener {
            val intent = Intent(this, FivethActivity::class.java)
            startActivity(intent)
        }

    }


}