package com.thanapat.mybio

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.thanapat.mybio.ui.theme.BlackText
import com.thanapat.mybio.ui.theme.Blue
import com.thanapat.mybio.ui.theme.Grey
import com.thanapat.mybio.ui.theme.White

@Composable
fun Home(navigationController: NavController) {
    Box(modifier = Modifier.fillMaxSize()
        .padding(35.dp)) {
        Column(modifier = Modifier.fillMaxWidth()
            .align(Alignment.Center)
            .background(
                color = Color.White, // สีพื้นหลังของ Box
                shape = RoundedCornerShape(20.dp) // ขอบโค้ง
            )
            .padding(25.dp)
            .height(350.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center) {
            Text(text = "Hi, there🤚", fontSize = 50.sp, color = BlackText, fontWeight = Bold)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "I'm Thanapat", fontSize = 40.sp, color = BlackText, fontWeight = Bold)
            Text(text = "Nawang", fontSize = 40.sp, color = BlackText, fontWeight = Bold)
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "A third year ComSCI student.", fontSize = 18.sp, color = Grey)
            Spacer(modifier = Modifier.height(15.dp))
            // ปุ่มเพื่อไปหน้า About
            Button(
                onClick = {
                    navigationController.navigate(Screens.About.screen) // นำทางไปหน้า About
                },
                colors = buttonColors(
                    containerColor = Blue,
                    contentColor = White
                ),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(text = "About Me", fontSize = 18.sp)
            }
        }
    }
}