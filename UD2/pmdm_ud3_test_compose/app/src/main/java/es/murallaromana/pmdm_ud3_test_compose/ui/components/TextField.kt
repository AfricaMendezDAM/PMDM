package es.murallaromana.pmdm_ud3_test_compose.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@SuppressLint("UnrememberedMutableState")
@Composable

fun MisTextFields(modifier: Modifier = Modifier) {

    var texto by rememberSaveable { mutableStateOf("") } //para que se repita en pantalla, el by te ahorra tener que hacer text.value

    Column(
        modifier = Modifier
            .padding(26.dp)
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        TextField(
            value = texto,
            onValueChange = { textoDelTextField ->
                texto = textoDelTextField
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            label = { Text("Introduce tu nombre") }
        )

        Row { }//noseque }
        Spacer(modifier = Modifier.size(14.dp).background(Color.Red))

        OutlinedTextField(
            value = texto,
            onValueChange = { textoDelTextField -> texto = textoDelTextField },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            label = { Text("Introduce tus apellidos") },
        )
    }
}

