package es.murallaromana.pmdm_ud3_test_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import es.murallaromana.pmdm_ud3_test_compose.ui.components.MisTextFields
import es.murallaromana.pmdm_ud3_test_compose.ui.layouts.MiColumna
import es.murallaromana.pmdm_ud3_test_compose.ui.layouts.MiFila
import es.murallaromana.pmdm_ud3_test_compose.ui.theme.Pmdm_ud3_test_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { //extension function que recibe un composable y dentro de ellos solo puedes meter composables y todo lo que pintes tiene que ser composable
            Pmdm_ud3_test_composeTheme {
                MiColumna(Modifier.padding(vertical = 16.dp))
                MiFila(Modifier.background(Color.LightGray))
                MisTextFields()
            }
        }
    }

    @Preview
    @Composable
    fun mostrarTexto(){
        Text(
            text = "Hola mundo!",
            modifier = Modifier //MIRAR QUÉ ENTRA AQUÍ
                .padding(36.dp, 20.dp, 20.dp, 30.dp)
                .fillMaxWidth()
                .clip(CircleShape)
                .background(Color.Red),//Influye dónde pones las cosas, posición en el código,
            textAlign = TextAlign.Center
        )
    }
//FILE-->SETTINGS-->EDIT-->LIVE EDIT-->PUSH..ON SAVE
}
