package com.example.stockbox

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.stockbox.databinding.ActivityEntradaProdutoBinding

class EntradaProdutoActivity : AppCompatActivity() {
    private lateinit var binding : ActivityEntradaProdutoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityEntradaProdutoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btImportarNotaFiscal.setOnClickListener { importarNotaFiscal() }
        binding.btSalvarRegistro.setOnClickListener { salvarRegistro() }
        binding.btVoltar.setOnClickListener { voltar() }
    }

    private fun importarNotaFiscal(){}
    private fun salvarRegistro(){}
    private fun voltar(){
        finish()
    }

}