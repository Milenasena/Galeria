package com.example.galeria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.galeria.ui.theme.GaleriaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GaleriaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Fotos()
                }
            }
        }
    }
}

@Composable
fun Fotos( 
    idImagem:Int,
    idDescricao: Int
) {

    Card() {
        Column() {
            Image(
                painter = painterResource(id = R.drawable.m6),
                contentDescription = null
            )
            Text(
                text = stringResource(id = idDescricao)
            )

        }
    }
}
@Preview
@Composable
fun PreviewFotos() {
    Fotos(idImagem = R.drawable.m6,
        idDescricao = R.string.descricao_m6)
    }