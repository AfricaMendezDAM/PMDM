package es.murallaromana.pmdm_ud3_test_compose.ui.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview (showSystemUi = true)
@Composable
fun MiFila(modifier: Modifier = Modifier) { //los composable empiezan por mayuscula, el resto de metodos no
    Row(modifier = Modifier
        .background(Color.Blue)
        .padding(horizontal = 0.dp, vertical = 0.dp)

    ){
        Text ("Soy una fila!", modifier = Modifier.background(Color.Red))
        Text ("Soy una fila!", modifier = Modifier.background(Color.Red))
        Text ("Soy una fila!", modifier = Modifier.background(Color.Red))
        Text ("Soy una fila!", modifier = Modifier.background(Color.Red))
        Text ("Soy una fila!", modifier = Modifier.background(Color.Red))
    }
}
