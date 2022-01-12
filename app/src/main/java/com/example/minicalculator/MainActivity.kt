package com.example.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        plus.setOnClickListener {
            val n1 = Num1.text.toString().toInt()
            val n2 = Num2.text.toString().toInt()
            val sum = n1 + n2
            Resultnum.setText("$sum")
            Symbol.setText("+")
        }
        minus.setOnClickListener {
            val n1 = Num1.text.toString().toInt()
            val n2 = Num2.text.toString().toInt()
            val sum = n1 - n2
            Resultnum.setText("$sum")
            Symbol.setText("-")
        }
        multiply.setOnClickListener {
            val n1 = Num1.text.toString().toInt()
            val n2 = Num2.text.toString().toInt()
            val sum = n1 * n2
            Resultnum.setText("$sum")
            Symbol.setText("*")
        }
        divider.setOnClickListener {
            val n1 = Num1.text.toString().toInt()
            val n2 = Num2.text.toString().toInt()
            val sum = n1 / n2
            Resultnum.setText("$sum")
            Symbol.setText("/")
        }
        modulo.setOnClickListener {
            val n1 = Num1.text.toString().toInt()
            val n2 = Num2.text.toString().toInt()
            val sum = n1 % n2
            Resultnum.setText("$sum")
            Symbol.setText("%")
        }
        clear.setOnClickListener {
            Num1.setText("")
            Num2.setText("")
            Symbol.setText("")
            Resultnum.setText("")
        }
    }
}