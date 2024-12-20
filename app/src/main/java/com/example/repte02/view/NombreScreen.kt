package com.example.repte02.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.repte02.R
import com.example.repte02.model.Routes
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.repte02.viewmodel.RepteViewModel

@Composable
fun NombreScreen(
    navController: NavController,
    repteViewModel: RepteViewModel) {

    val nombre by repteViewModel.nombre.observeAsState("")



    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.dragonball_daima_logo
                ),
                contentDescription = null,
                modifier = Modifier.size(400.dp)
            )

            //TextField

            Button(
                onClick = {navController.navigate(Routes.ResultadoScreen.route)}
            ) {
                Text (
                    text = "Mostrar"
                )
            }

        }
    }
}


