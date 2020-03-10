package br.ufpr.tads.macedo.pedro.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val subtrair = findViewById<Button>(R.id.btn_subtrair)
        val soma = findViewById<Button>(R.id.btn_soma)
        val multiplicar = findViewById<Button>(R.id.btn_multiplicar)
        val dividir = findViewById<Button>(R.id.btn_dividir)

        val operando1 = findViewById<EditText>(R.id.operando1)
        val operando2 = findViewById<EditText>(R.id.operando2)

        val msg_input_errado = getString(R.string.msg_input_invalido)

        subtrair.setOnClickListener {
            val op1 = operando1.text.toString().toIntOrNull()
            val op2 = operando2.text.toString().toIntOrNull()
            val resultado = if (op1 != null && op2 != null) op1?.minus(op2).toString() else msg_input_errado
            Toast.makeText(this,resultado,Toast.LENGTH_SHORT).show()
        }
        soma.setOnClickListener {
            val op1 = operando1.text.toString().toIntOrNull()
            val op2 = operando2.text.toString().toIntOrNull()
            val resultado = if (op1 != null && op2 != null) op1?.plus(op2).toString() else msg_input_errado
            Toast.makeText(this,resultado,Toast.LENGTH_SHORT).show()
        }
        dividir.setOnClickListener {
            val op1 = operando1.text.toString().toIntOrNull()
            val op2 = operando2.text.toString().toIntOrNull()
            val resultado = if (op1 != null && op2 != null) op1?.div(op2.toFloat()).toString() else msg_input_errado
            Toast.makeText(this,resultado,Toast.LENGTH_SHORT).show()
        }
        multiplicar.setOnClickListener {
            val op1 = operando1.text.toString().toIntOrNull()
            val op2 = operando2.text.toString().toIntOrNull()
            val resultado = if (op1 != null && op2 != null) op1?.times(op2).toString() else msg_input_errado
            Toast.makeText(this,resultado,Toast.LENGTH_SHORT).show()
        }

    }
}
