package com.example.lucas.conversortemperatura

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickButtonTemperatura (v: view)
    {
        val rbCelsius= findViewById(R.id.radioButtonCelsius) as RadioButton
        val rbFahr= findViewById(R.id.radioButtonFahrenheit) as RadioButton
        val txTemperatura= findViewById(R.id.editTextTemperatura) as EditText
        var msg: String= ""

        if (rbCelsius.isChecked)
        {
            val nFahr= Float.parseFloat(txTemperatura.text.toString()) * 1.8 + 32
            msg= "Temperatura em Celsius ${txTemperatura.text} = Temperatura em Fahrenheit $nFahr"
        }
        if (rbFahr.isChecked)
        {
            val nCelsius= (Float.parseFloat(txTemperatura.text.toString()) - 32) * 5/9
            msg= "Temperatura em Fahrenheit ${txTemperatura.text} = Temperatura em Celsius $nCelsius"
        }
        Toast.makeText(applicationContext, msg, Toast.LENGTH_LONG).show()
    }
}