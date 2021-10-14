package uv.desarrolloaplicaciones.hipotenusatriangulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalcular.setOnClickListener{
            guardarCatetos();
        }
        btnLimpiar.setOnClickListener{
            limpiarCampos();
        }

    }

    fun guardarCatetos(){
        var catetob = editTextCatetoB.text.toString();
        var catetoc = editText_CatetoC.text.toString();
        val exponente = 2
        var bCuadrado = Math.pow(catetob.toDouble(), exponente.toDouble());
        var cCuadrado = Math.pow(catetoc.toDouble(), exponente.toDouble());
        val resultadoCuadrado = bCuadrado + cCuadrado;
        val resultado = Math.sqrt(resultadoCuadrado);
        print(resultado);
        textViewHipotenusa.text = resultado.toString();
    }

    fun limpiarCampos(){
        editTextCatetoB.text.clear();
        editText_CatetoC.text.clear();
        textViewHipotenusa.text = "";
    }
}