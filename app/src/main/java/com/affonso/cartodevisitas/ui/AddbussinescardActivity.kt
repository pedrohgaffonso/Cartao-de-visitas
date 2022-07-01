package com.affonso.cartodevisitas.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.affonso.cartodevisitas.databinding.ActivityAddbussinescardBinding
import com.affonso.cartodevisitas.databinding.ActivityMainBinding

class AddbussinescardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddbussinescardBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListeners()
    }
    private fun insertListeners() {
        binding.btnClose.setOnClickListener {
            finish()
        }
    }
}