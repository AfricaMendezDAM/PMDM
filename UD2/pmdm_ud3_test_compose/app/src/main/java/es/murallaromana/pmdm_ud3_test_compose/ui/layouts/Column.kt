package es.murallaromana.pmdm_ud3_test_compose.ui.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview (showSystemUi = true)
@Composable
fun MiColumna(modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .background(Color.LightGray)
        .padding(horizontal = 0.dp, vertical = 0.dp)

    ){
        Text ("Hola mundo!", modifier = Modifier.background(Color.Red))
        Text ("Hola mundo!")
        Text ("Hola mundo!")
    }
}
