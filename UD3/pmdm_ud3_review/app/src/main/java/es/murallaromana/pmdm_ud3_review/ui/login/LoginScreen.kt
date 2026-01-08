package es.murallaromana.pmdm_ud3_review.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import es.murallaromana.pmdm_ud3_review.R

@Preview(showSystemUi = true)
@Composable
fun LoginScreen(modifier: Modifier = Modifier){
    Column (
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.logo_sin_bg),
            contentDescription = "login logo",
            modifier = modifier
                .weight(1f)
        )

        Spacer(
            modifier= Modifier.height(50.dp)
        )

        Text(
            text = "INTRODUCE OS TEUS DATOS",
            modifier=modifier
                .fillMaxWidth()
        )
    }

}