package es.murallaromana.pmdm_ud3_test_compose.ui.login

import android.R.attr.onClick
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.SemiBold
import androidx.compose.ui.text.style.TextAlign.Companion.Left
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lint.kotlin.metadata.Visibility
import es.murallaromana.pmdm_ud3_test_compose.R


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginAppearance(
    welcomeSms: String = "Bienvenido"
) {
    var email by remember { mutableStateOf("") }
    var pwd by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val image = painterResource(R.drawable.candado)
        Image(
            painter = image,
            contentDescription = "",
            Modifier.size(100.dp)
        )

        Spacer(
            Modifier
                .size(20.dp)
        )

        Text(
            text = welcomeSms,
            fontWeight = SemiBold,
            fontSize = 24.sp
        )

        Text(
            text = "Inicia sesión para continuar",
            fontSize = 16.sp
        )

        Spacer(
            Modifier
                .size(20.dp)
        )

        OutlinedTextField(
            value = email,
            onValueChange={},
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            label = { Text("Correo Electrónico") },
            placeholder = {Text("example@email.com")}

        )

        OutlinedTextField(
            value = pwd,
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            label = {Text("Contraseña")},
            placeholder = {Text("******")},
            trailingIcon = {
                Icon(
                    painter = painterResource(id=R.drawable.baseline_remove_red_eye_24),
                    contentDescription="Icono pwd ojo abierto" //TODO: Estudiar muy bien dferencia nombre parámetros entre image e icon
                )
            }
        )

        Button(
            onClick = { } ,
           // contentColor = Color.Green
        ){
            Text(text= "¿Olvidaste tu contraseña?")
        }


    }
}

