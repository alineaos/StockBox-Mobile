package com.example.stockbox

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.stockbox.databinding.ActivityProdutoBinding

class ProdutoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProdutoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityProdutoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btCadastrar.setOnClickListener { cadastarProduto() }
        binding.btEntrada.setOnClickListener { entradaProduto() }
        binding.btSaida.setOnClickListener { saidaProduto() }
        binding.btContagem.setOnClickListener { contagemProduto() }
        binding.btVoltar.setOnClickListener { voltar() }
    }

    private fun cadastarProduto() {}
    private fun entradaProduto() {
        val telaEntradaProduto = Intent(this, EntradaProdutoActivity::class.java)
        startActivity(telaEntradaProduto)
    }
    private fun saidaProduto() {}
    private fun contagemProduto() {
        val telaContagem = Intent(this, ContagemActivity::class.java)
        startActivity(telaContagem)
    }
    private fun voltar() {
        finish()
    }

}