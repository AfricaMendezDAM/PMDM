package es.murallaromana.pmdm_ud3_review.ui.login

import android.graphics.Outline
import android.graphics.drawable.Icon
import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import es.murallaromana.pmdm_ud3_review.R

@Preview(showSystemUi = true)
@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_sin_bg),
            contentDescription = "login logo",
            modifier = modifier
                .weight(1f)
        )

//        Icon(
//            painter = painterResource(R.drawable.logo_sin_bg),
//            contentDescription = "Logo",
//            modifier = Modifier
//                .size(120.dp),
//            tint = Color.Yellow
//        )

        Spacer(
            modifier = Modifier.height(50.dp)
        )

        Text(
            text = "INTRODUCE OS TEUS DATOS",
            modifier = modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Introduce o teu correo electrónico") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )

        Row(
            modifier = Modifier
                .weight(2f),
            verticalAlignment =Alignment.CenterVertically

        ) {
            Text(
                text = "Nome: "
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text("Introduce o teu nome") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)

            )
        }

        Row(
            modifier = Modifier
                .weight(2f),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Apelidos: ",
                textAlign = TextAlign.Left
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text("Introduce o teus apelidos") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)

            )

        }

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f),
            enabled = TODO(),
            shape = TODO(),
            colors = TODO(),
            elevation = TODO(),
            border = TODO(),
            contentPadding = TODO(),
            interactionSource = TODO(),
            content = TODO()
        )
    }

}

