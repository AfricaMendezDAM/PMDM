package es.murallaromana.pmdm_ud3_test_compose.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import es.murallaromana.pmdm_ud3_test_compose.R


@Preview(showSystemUi = true)
@Composable
fun ReutilizarButton(modifier: Modifier = Modifier) {
    Button(
        onClick = {},
        modifier = Modifier
            .padding(36.dp, 20.dp, 20.dp, 30.dp)
            .fillMaxWidth(),
        //colors = ButtonDefaults.buttonColors(containerColor )
    ) {}


}

@Preview(showSystemUi = true)
@Composable
fun MiFloatingActionButton() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomEnd
    ) {
        FloatingActionButton(
            onClick = {},
            modifier = Modifier.padding(end=16.dp, bottom=16.dp),
            containerColor = Color.Green,
            contentColor = Color.White,
            shape = CircleShape
        ){
            Icon(
                modifier = Modifier.size(24.dp),
                painter = painterResource(R.drawable.baseline_add_24),
                contentDescription = "Add button"
            )
        }
    }

}