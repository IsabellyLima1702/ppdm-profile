package br.senai.sp.jandira.projetofile.screens

import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.projetofile.R
import java.util.Locale

@Composable
fun HomeScreen(navegacao: NavHostController?){

    //Abrir ou criar um arquivo SharePreferences
    val context = LocalContext.current
    val  userFile = context
        //Mode_Private deixa o seu programa privado para que outros programas nao acessem os dados do seu
        .getSharedPreferences("UserFile", Context.MODE_PRIVATE)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(440.dp),
    ){

        Image(
            painter = painterResource(R.drawable.background),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column (
            modifier = Modifier
                .padding(vertical = 48.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Row {
                Icon(
                    modifier = Modifier
                        .padding(end = 100.dp),
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "",
                    tint = Color(0xFFEC8666)
                )
                Text(
                    text = stringResource(
                        R.string.details
                    ),
                    modifier = Modifier
                        .padding(15.dp, end = 135.dp),
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal
                )
            }

            Image(
                painter = painterResource(
                    R.drawable.icon
                ),
                contentDescription = stringResource(
                    R.string.app_name
                ),
                modifier = Modifier
                    .padding(bottom = 22.dp)
                    .size(80.dp)

            )
            Text(
                text = stringResource(
                    R.string.name
                ),
                modifier = Modifier
                    .padding(bottom = 90.dp),
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(
                    R.string.function
                ),
                modifier = Modifier
                    .padding(1.dp),
                color = Color(0xFFD9D2E3),
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal
            )
            Row (){
                Card (
                    border = BorderStroke(
                        width = 2.dp,
                        color = Color(0xFFD9D2E3),
                    ),
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .width(90.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .background(
                                color = Color(0xFF1D4077)
                            )
                            .padding(6.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "",
                            tint = Color(0xFFEC8666)
                        )
                        Column(
                            modifier = Modifier
                                .weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = stringResource(
                                    R.string.email
                                ),
                                color = Color(0xFFD9D2E3),
                                fontSize = 15.sp
                            )
                        }
                    }
                }
                Card (
                    border = BorderStroke(
                        width = 2.dp,
                        color = Color(0xFFD9D2E3),
                    ),
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .width(75.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .background(
                                color = Color(0xFF1D4077)
                            )
                            .padding(6.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Phone,
                            contentDescription = "",
                            tint = Color(0xFFEC8666)
                        )
                        Column(
                            modifier = Modifier
                                .weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = stringResource(
                                    R.string.call
                                ),
                                color = Color(0xFFD9D2E3),
                                fontSize = 15.sp
                            )
                        }
                    }
                }

                Card (
                    border = BorderStroke(
                        width = 2.dp,
                        color = Color(0xFFD9D2E3),
                    ),
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .width(103.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .background(
                                color = Color(0xFF1D4077)
                            )
                            .padding(6.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.AddCircle,
                            contentDescription = "",
                            tint = Color(0xFFEC8666)
                        )
                        Column(
                            modifier = Modifier
                                .weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = stringResource(
                                    R.string.whatsapp
                                ),
                                color = Color(0xFFD9D2E3),
                                fontSize = 15.sp
                            )
                        }
                    }
                }
                Card (
                    border = BorderStroke(
                        width = 2.dp,
                        color = Color(0xFFD9D2E3),
                    ),
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .width(98.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .background(
                                color = Color(0xFF1D4077)
                            )
                            .padding(5.dp),
                    ) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color(0xFFEC8666)
                        )

                        Column(
                            modifier = Modifier
                                .weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = stringResource(
                                    R.string.favorite
                                ),
                                color = Color(0xFFD9D2E3),
                                fontSize = 15.sp
                            )
                        }
                    }
                }

            }


        }

    }

}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(null)

}