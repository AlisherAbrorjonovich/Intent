package com.example.intent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tel.setOnClickListener{
            var intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:+998911125130")
            startActivity(intent)
        }
        binding.telegram.setOnClickListener{
            var intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://t.me/+998911055305")
            startActivity(intent)
        }
        binding.instagram.setOnClickListener{
            var intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.instagram.com/_yolchiboev_009?igsh=Y2FpamF6c3Ezem9w")
            startActivity(intent)
        }
        binding.adress.setOnClickListener{
            var inten = Intent(Intent.ACTION_VIEW)
            inten.data = Uri.parse("geo:40.38300394608604, 71.78271946156762")
            startActivity(inten)
        }
    }
}