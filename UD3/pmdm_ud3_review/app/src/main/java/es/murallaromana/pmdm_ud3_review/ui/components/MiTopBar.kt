package es.murallaromana.pmdm_ud3_review.ui.components

import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import java.lang.reflect.Modifier

@Preview(showSystemUi = true)
@Composable

fun MiTopBar(modifier: Modifier = Modifier){
    TopAppBar(
        title={Text("TOP BAR")},
        navigationIcon = {
            IconButton() { }
        }
    ){


    }
}

