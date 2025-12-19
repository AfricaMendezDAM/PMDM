package es.murallaromana.pmdm_ud3_test_compose.ejemplos_clase

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


fun  saludar (nombre: String, edad: Int, miFuncion: (param1: Float, param2: Float) ->Int): Int{
    return 1
}

fun main(){
    saludar("pepe", 20, ::sumaEntero) //funciones como parametro
    saludar("pepe", 20, ()->Unit) //formas de esribirlos
    saludar("pepe", 20, { x: Float, y: Float)-> x.toInt()+y.toInt()} as (Float, Float) -> Int)
}