package com.pdmtaller2.AbrahamFlores_00067323

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pdmtaller2.AbrahamFlores_00067323.navigation.NavGraph
import com.pdmtaller2.AbrahamFlores_00067323.navigation.Routes
import com.pdmtaller2.AbrahamFlores_00067323.ui.theme.FoodSpotByAgarciaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotByAgarciaTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    NavGraph(startDestination = Routes.HOME)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComposableMainScreen(){
    MainActivity()
}


