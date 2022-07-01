package com.affonso.cartodevisitas.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.affonso.cartodevisitas.R
import com.affonso.cartodevisitas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}