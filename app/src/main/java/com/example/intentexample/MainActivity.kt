package com.example.intentexample

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)//.apply {
             //   putExtra("name","robert")
             //   putExtra("age",22)
           //}
            val bundle = Bundle().apply {
                //put all data in a bundle
                putString("Name","Lily")
                putInt("Age",22)
            }
            intent.putExtras(bundle)
            startActivity(intent)
        }

        binding.button2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("http://www.elearn.ndhu.edu.tw")
            startActivity(intent)
        }
        binding.button3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("tel:0900000000")
            startActivity(intent)
        }

    }
}