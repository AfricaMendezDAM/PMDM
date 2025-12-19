package es.murallaromana.pmdm_ud3_test_compose.ejemplos_clase

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


fun  saludar(param1: Float, param2: Float): Int{
    return
}

fun main(){
    saludar("pepe", 20, ::sumaEntero) //funciones como parametro
    saludar("pepe", 20, ()->Unit) //formas de esribirlos
    saludar("pepe", 20, { x: Float, y: Float)-> x.toInt()+y.toInt()})
}