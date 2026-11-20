package com.example.stockbox

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.stockbox.databinding.ActivityInicialBinding

class InicialActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInicialBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityInicialBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btProdutos.setOnClickListener { telaProdutos() }
        binding.btRelatorios.setOnClickListener { telaRelatorios() }
        binding.btSair.setOnClickListener { sair() }
    }

    private fun telaProdutos() {
        val telaProduto = Intent(this, ProdutoActivity::class.java)
        startActivity(telaProduto)
    }

    private fun telaRelatorios() {}

    private fun sair() {
        finishAffinity()
    }


}