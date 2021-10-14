package uv.desarrolloaplicaciones.hipotenusatriangulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.*
import android.widget.Toast
import kotlin.text.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalcular.setOnClickListener{
            guardarCatetos()
        }
        btnLimpiar.setOnClickListener{
            limpiarCampos()
        }

    }

    fun calcularHipotenusa(B: String, C: String){
        val exponente = 2
        val bCuadrado =  Math.pow(B.toDouble(), exponente.toDouble())
        val cCuadrado =  Math.pow(C.toDouble(), exponente.toDouble())
        val resultadoCuadrado = bCuadrado + cCuadrado
        val resultado = Math.sqrt(resultadoCuadrado)
        textViewHipotenusa.text = resultado.toString()
        val mensaje = "Hipotenusa: ${resultado}"
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
    }

    fun String.intOrString() = toIntOrNull() ?: this

    fun guardarCatetos(){
        editTextCatetoB.text.toString().intOrString()
        editText_CatetoC.text.toString().intOrString()
        if(editTextCatetoB.text.toString().isNotEmpty() && editText_CatetoC.text.toString().isNotEmpty()
            && editTextCatetoB.text.toString() != "." && editTextCatetoB.text.toString() != ","
            && editText_CatetoC.text.toString() != "." && editText_CatetoC.text.toString() != ","){
            val catetob = editTextCatetoB.text.toString()
            val catetoc = editText_CatetoC.text.toString()
            calcularHipotenusa(catetob, catetoc)
            }
        else{
            val mensaje = "Debes ingresar ambos catetos y ambos deben ser números enteros"
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
        }

    }

    fun limpiarCampos(){
        editTextCatetoB.text.clear()
        editText_CatetoC.text.clear()
        textViewHipotenusa.text = ""
    }
}