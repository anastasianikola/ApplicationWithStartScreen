package com.example.applicationwithstartscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun AutorizationAndRegistration(navController: NavController) {
    val email = remember { mutableStateOf("") }
    val isButtonEnabled = email.value.isNotEmpty()
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        verticalAlignment = Alignment.CenterVertically,
    )
    {
        Spacer(modifier = Modifier
            .padding(start = 20.dp))
        Image(
            bitmap = ImageBitmap.imageResource(R.drawable.emojies),
            contentDescription = "shape",
            modifier = Modifier
                .size(30.dp)
        )
        Text (
            text = "Добро пожаловать!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Black,
            modifier = Modifier
        )
    }
    Column (
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text (
            text = "Войдите, чтобы пользоваться функциями\n"
                    + "приложения",
            fontSize = 15.sp,
            modifier = Modifier
                .padding(top = 130.dp, start = 23.dp)
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 220.dp, start = 20.dp)
    ) {
        Text(
            text = "Вход по E-mail:",
            fontSize = 15.sp,
            color = Color.Gray,
            modifier = Modifier
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 250.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            email.value,
            {email.value = it},
            textStyle = TextStyle(fontSize = 15.sp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                focusedTextColor = Color.Black,
                focusedBorderColor = colorResource(R.color.new_color),
                unfocusedBorderColor = Color.Gray,
                unfocusedTextColor = Color.Gray,
                unfocusedContainerColor = Color(0xffeeeeee)
            ),
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .width(380.dp)
                .height(50.dp)
        )

    }
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Button(
            onClick = {
                if (isButtonEnabled) {
                    navController.navigate("code_in_email")
                }
            },
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .width(380.dp)
                .height(70.dp),
            enabled = isButtonEnabled,
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isButtonEnabled) colorResource(R.color.new_color) else colorResource(R.color.new_color_buttom),
                contentColor = Color.White,
            )
        ) {
            Text(
                "Далее",
                fontSize = 25.sp,
                fontWeight = FontWeight.Black
            )
        }
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(bottom = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom) {
        Text(
            text = "Или войдите с помощью",
            color = Color.Gray
        )
        Spacer(modifier = Modifier
            .height(10.dp))
        Button(
            onClick = {
            },
            modifier = Modifier
                .width(380.dp)
                .height(70.dp)
                .border(width = 2.dp, color = Color.Gray, shape = RoundedCornerShape(20.dp)),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black,
                containerColor = Color.White
            )
        ) {
            Text(
                "Войти с Яндекс"
            )
        }
    }
}

