package br.senai.sp.jandira.projetofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.projetofile.screens.HomeScreen
import br.senai.sp.jandira.projetofile.ui.theme.ProjetoFileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjetoFileTheme {
                //HomeScreen()

                var navegacao = rememberNavController()

                NavHost(
                    navController = navegacao,
                    startDestination = "home"
                ){
                    composable("home"){ HomeScreen(navegacao) }
                }
            }
        }
    }
}