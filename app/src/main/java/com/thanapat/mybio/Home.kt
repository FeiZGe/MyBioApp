package com.thanapat.mybio

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.thanapat.mybio.ui.theme.BlackText
import com.thanapat.mybio.ui.theme.Blue
import com.thanapat.mybio.ui.theme.Grey
import com.thanapat.mybio.ui.theme.White

@Composable
fun Home() {
    val gradientColors = listOf(BlackText, Blue)

    Box(modifier = Modifier.fillMaxSize()
        .padding(35.dp)) {
        Column(modifier = Modifier.fillMaxWidth()
            .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(id = R.drawable.profile_home),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(190.dp)
                    .shadow(elevation = 10.dp, shape = CircleShape)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Hi🤚, I'm",
                fontSize = 50.sp,
                color = BlackText,
                fontWeight = Bold
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center) {
                Text(
                    text = "Thanapat",
                    fontSize = 32.sp,
                    fontWeight = Bold,
                    style = TextStyle(
                        brush = Brush.linearGradient(
                            colors = gradientColors
                        )
                    )
                )
                Text(
                    text = " Nawang",
                    fontSize = 32.sp,
                    color = BlackText,
                    fontWeight = Bold
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "A third year ComSCI student.",
                fontSize = 18.sp,
                color = Grey
            )

        }
    }
}