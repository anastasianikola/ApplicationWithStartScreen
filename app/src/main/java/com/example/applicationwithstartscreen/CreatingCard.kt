package com.example.applicationwithstartscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Text as Text1

@Composable
fun CreatingCard(navController: NavController) {
    val name = remember { mutableStateOf("Имя") }
    val lastname = remember { mutableStateOf("Отчество") }
    val surname = remember { mutableStateOf("Фамилия") }
    val birthday = remember { mutableStateOf("Дата рождения") }
    val gender = remember { mutableStateOf("Пол") }
    val isButtonEnabledName = name.value.isNotEmpty()
    val isButtonEnabledLastName = lastname.value.isNotEmpty()
    val isButtonEnabledBirthday = birthday.value.isNotEmpty()
    val isButtonEnabledGender = gender.value.isNotEmpty()
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 250.dp, top = 80.dp, bottom = 30.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Text1(
            text = "Пропустить",
            color = colorResource(R.color.new_color),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .clickable(
                    onClick = {
                        navController.navigate("autorization_screen")
                    }
                )
        )
    }
        Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 23.dp)
            .height(200.dp),
        verticalAlignment = Alignment.CenterVertically,
    )
    {
        Text1 (
            text = "Создание карты\nпациента",
            fontSize = 25.sp,
            fontWeight = FontWeight.Black,
            modifier = Modifier
        )
    }
    Column (
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text1 (
            text = "Без карты пациента вы не сможете заказать анализы.",
            fontSize = 13.sp,
            modifier = Modifier
                .padding(top = 140.dp, start = 23.dp),
            color = Color.Gray
        )
        Text1 (
            text = "В картах пациентов будут храниться результаты\nанализов вас и ваших близких",
            fontSize = 13.sp,
            modifier = Modifier
                .padding(top = 5.dp, start = 23.dp),
            color = Color.Gray
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 250.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            name.value,
            {name.value = it},
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
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            surname.value,
            {surname.value = it},
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
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            lastname.value,
            {lastname.value = it},
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
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            birthday.value,
            {birthday.value = it},
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
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            gender.value,
            {gender.value = it},
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
        .fillMaxSize()
        .padding(bottom = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom

    )
    {
        Button(
            onClick = {
                if (isButtonEnabledName && isButtonEnabledLastName && isButtonEnabledBirthday && isButtonEnabledGender) {
                    navController.navigate("code_in_email")
                }
            },
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .width(380.dp)
                .height(70.dp),
            enabled = isButtonEnabledName && isButtonEnabledLastName && isButtonEnabledBirthday && isButtonEnabledGender,
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isButtonEnabledName && isButtonEnabledLastName && isButtonEnabledBirthday && isButtonEnabledGender) colorResource(R.color.new_color) else colorResource(R.color.new_color_buttom),
                contentColor = Color.White,
            )
        ) {
            Text1(
                "Далее",
                fontSize = 25.sp,
                fontWeight = FontWeight.Black
            )
        }
    }
}