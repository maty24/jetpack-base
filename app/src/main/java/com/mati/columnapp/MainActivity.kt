package com.mati.columnapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mati.columnapp.ui.theme.ColumnAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //vistas de la app
        setContent {
            app()
        }
    }
}

@Preview
@Composable
fun app() {
    //no es como un scroll, pero hace scroll rederizando el contenido cuando baja
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red)
    ) {
        item {
            Text(
                text = "Holaa",
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(text = "Holaa", color = Color.White)
            Text(text = "Holaa", color = Color.White)
        }
    }
}