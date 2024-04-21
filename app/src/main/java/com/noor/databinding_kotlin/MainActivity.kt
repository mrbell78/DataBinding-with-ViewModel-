package com.noor.databinding_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.noor.databinding_kotlin.databinding.ActivityMainBinding
import com.noor.databinding_kotlin.model.User
import com.noor.databinding_kotlin.view.UserFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

//        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//
//        val user = User("John Doe", "johndoe@example.com")
//        binding.user = user



        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, UserFragment())
            .commit()

    }
}