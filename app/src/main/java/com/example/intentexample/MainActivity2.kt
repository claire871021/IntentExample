package com.example.intentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val name = intent.getStringExtra("name")
        //val age = intent.getIntExtra("age",0)
        val bundle = intent.extras
        val name = bundle?.getString("Name")
        val Age = bundle?.getInt("Age")
        Toast.makeText(this, "Name:${name} Age:${Age}", Toast.LENGTH_SHORT).show()
        setContentView(R.layout.activity_main2)
    }
}