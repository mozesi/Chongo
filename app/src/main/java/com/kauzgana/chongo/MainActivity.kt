package com.kauzgana.chongo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.kauzgana.chongo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding :ActivityMainBinding
    private val userOne:User = User("Moses","Msukwa")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
       /* binding.buttonName.setOnClickListener{
            binding.user = userOne
        }*/
    }
}