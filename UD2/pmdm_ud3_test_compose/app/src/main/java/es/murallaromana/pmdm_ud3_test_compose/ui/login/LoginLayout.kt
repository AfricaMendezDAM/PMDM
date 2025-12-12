package es.murallaromana.pmdm_ud3_test_compose.ui.login

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
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.SemiBold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import es.murallaromana.pmdm_ud3_test_compose.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginAppearance(
    email: String = "", //TODO: No debería poner parámetros por defecto para credenciales
    pwd: String = "",
    welcomeSms: String = "Bienvenido"
) {
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

        Spacer(
            Modifier
                .size(20.dp)
        )

        TextField(
            value = email,
            onValueChange = {emailTxt -> email = emailTxt},
            

        )
    }
}

