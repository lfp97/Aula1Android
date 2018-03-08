package com.example.lucas.conversortemperatura

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ListView
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickButtonRadioBttnCelsius (view: View)
    {
        radioButtonFahrenheit.setChecked(false)
    }

    fun onClickButtonRadioBttnFah (view: View)
    {
        radioButtonCelsius.setChecked(false)
    }

    fun onClickButtonConverter (view: View)
    {
        val rbCelsius= findViewById<View>(R.id.radioButtonCelsius) as RadioButton
        val rbFahr= findViewById<View>(R.id.radioButtonFahrenheit) as RadioButton
        val txTemperatura= findViewById<View>(R.id.editTextTemperatura) as EditText
        var msg: String= ""

        if (rbCelsius.isChecked)
        {
            //val nFahr= Float.parseFloat(txTemperatura.text.toString()) * 1.8 + 32
            val nFahr= txTemperatura.text.toString().toFloat() * 1.8 + 32
            msg= "Temperatura em Celsius ${txTemperatura.text} = Temperatura em Fahrenheit $nFahr"
        }
        if (rbFahr.isChecked)
        {
            //val nCelsius= (Float.parseFloat(txTemperatura.text.toString()) - 32) * 5/9
            val nCelsius= (txTemperatura.text.toString().toFloat()) * 5/9
            msg= "Temperatura em Fahrenheit ${txTemperatura.text} = Temperatura em Celsius $nCelsius"
        }
        Toast.makeText(applicationContext, msg, Toast.LENGTH_LONG).show()
    }
}
