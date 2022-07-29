package com.example.passingdatawithintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.passingdatawithintent.databinding.ActivityMainBinding
import kotlin.jvm.internal.Intrinsics

class DisplayWindow : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var Float: Float= 0f
        var String: String=""
        var Double: Double = 0.0
        var Char: Char='\u0000'
        intent ?.let { abc->
           String =abc.getStringExtra("String")as String
            Float=abc.getFloatExtra("Float",0f)
            Double= abc.getDoubleExtra("Double",0.0)
            Char= abc.getCharExtra("Char",'\u0000')
        }?:kotlin.run{ }
    }
}