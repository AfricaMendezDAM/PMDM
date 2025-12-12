package es.murallaromana.pmdm_ud3_test_compose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Layouts {


    @Preview(showSystemUi = true)
    @Composable
    fun EjemploWeight(){
        Column {
            Box(modifier = Modifier.fillMaxWidth().background(Color.Black).weight(0.1f)) //10
            Box(modifier = Modifier.fillMaxWidth().background(Color.Red).weight(0.5f)) //50
            Box(modifier = Modifier.fillMaxWidth().background(Color.Green).weight(0.1f)) //10
            Box(modifier = Modifier.fillMaxWidth().background(Color.Blue).weight(0.1f)) //10
            Box(modifier = Modifier.fillMaxWidth().background(Color.Yellow).weight(0.1f)) //10
            Box(modifier = Modifier.fillMaxWidth().background(Color.Magenta).weight(0.1f))//10
        }
    }



    @Preview(showSystemUi = true)
    @Composable
    fun DistribucionFilas() {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .background(Color.Red)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(150.dp)
                    .background(Color.Blue)
            )

            Row {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.Yellow)
                )


                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(50.dp)
                            .background(Color.Black)
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(50.dp)
                            .background(Color.Blue)
                    )
                }

            }

            Row {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .background(Color.White)
                )
            }

            //divider
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(Color.Blue)
                )

                Box(
                    modifier = Modifier
                        .weight(4f)
                        .fillMaxHeight()
                        .background(Color.Green)
                )

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(Color.Blue)
                )
            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 18.dp, end = 16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(imageVector = Icons.Default.Person, contentDescription = "")
            Spacer(Modifier.width(20.dp))
            Text(
                text = "uno",
                fontSize = 24.sp, //sp es medida de tipografia, no dp
                fontFamily = FontFamily.SansSerif
            )

        }
    }

}