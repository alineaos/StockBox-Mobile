package com.example.stockbox

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.stockbox.databinding.ActivityContagemBinding

class ContagemActivity : AppCompatActivity() {
    private lateinit var binding : ActivityContagemBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityContagemBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btVoltar.setOnClickListener { voltar() }
    }

    private fun voltar(){
        finish()
    }
}