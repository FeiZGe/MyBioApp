package com.thanapat.mybio

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thanapat.mybio.ui.theme.BlackText
import com.thanapat.mybio.ui.theme.Blue
import com.thanapat.mybio.ui.theme.White
import com.thanapat.mybio.ui.theme.WhiteBG

@Composable
fun About() {
    Surface(modifier = Modifier.fillMaxSize()
        .padding(PaddingValues(start = 20.dp, top = 35.dp, end = 20.dp))
        ,color = WhiteBG) {

        Text(
            text = "About",
            fontSize = 40.sp,
            color = BlackText,
            fontWeight = Bold
        )

        Column(modifier = Modifier.fillMaxSize()
            .padding(PaddingValues(start = 15.dp, top = 60.dp, end = 15.dp))
            .verticalScroll(
                rememberScrollState()
            ),
            horizontalAlignment = Alignment.CenterHorizontally) {

            Image(
                painter = painterResource(id = R.drawable.pic_about),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .shadow(elevation = 10.dp, shape = RoundedCornerShape(10.dp))
                    .clip(RoundedCornerShape(10.dp))
                    .aspectRatio(16f / 9f)
            )
            Spacer(modifier = Modifier.height(20.dp))

            // Info
            Box(modifier = Modifier.fillMaxWidth()
                .shadow(elevation = 4.dp, shape = RoundedCornerShape(10.dp))
                .background(
                    color = White,
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(15.dp)
            ) {
                Row(Modifier.fillMaxSize()) {
                    Text(
                        text = "I'm a student of Com-Sci.",
                        fontSize = 28.sp,
                        color = BlackText,
                        fontWeight = Bold,
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "I am always committed to learning and improving my skills.",
                        fontSize = 18.sp,
                        color = BlackText,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Row(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.pic_about_2),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .shadow(elevation = 10.dp, shape = RoundedCornerShape(10.dp))
                        .clip(RoundedCornerShape(10.dp))
                        .height(175.dp)
                        .width(150.dp)
                        .aspectRatio(1f / 2f)
                )
                Spacer(modifier = Modifier.width(20.dp))

                Column(modifier = Modifier.fillMaxWidth()) {
                    // Name
                    Box(modifier = Modifier.fillMaxWidth()
                        .shadow(elevation = 4.dp, shape = RoundedCornerShape(10.dp))
                        .background(
                            color = White,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(15.dp)) {
                        Text(
                            text = "Thanapat Nawang",
                            fontSize = 24.sp,
                            color = BlackText,
                            fontWeight = Bold
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))

                    // University
                    Box(modifier = Modifier.fillMaxWidth()
                        .shadow(elevation = 4.dp, shape = RoundedCornerShape(10.dp))
                        .background(
                            color = Color(0xFF652D91),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(15.dp),
                        Alignment.Center
                    ) {
                        Text(
                            text = "RMUTP",
                            fontSize = 32.sp,
                            color = White,
                            fontWeight = Bold
                        )
                    }
                }

            }

            // Age&GPA
            Spacer(modifier = Modifier.height(20.dp))

            Row(modifier = Modifier.fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f)
                    .shadow(elevation = 4.dp, shape = RoundedCornerShape(10.dp))
                    .background(
                        color = White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(15.dp)
                ) {
                    Row(modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween // จัดช่องว่างระหว่างข้อความ
                    ) {
                        Text(
                            text = "Age",
                            fontSize = 13.sp,
                            color = BlackText,
                            fontWeight = Bold
                        )
                        Text(
                            text = "21",
                            fontSize = 24.sp,
                            color = BlackText
                        )
                    }
                }
                Spacer(modifier = Modifier.width(20.dp))

                // Grade
                Box(modifier = Modifier.weight(1f)
                    .shadow(elevation = 4.dp, shape = RoundedCornerShape(10.dp))
                    .background(
                        color = White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(15.dp)
                ) {
                    Row(modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween // จัดช่องว่างระหว่างข้อความ
                    ) {
                        Text(
                            text = "GPA",
                            fontSize = 13.sp,
                            color = BlackText,
                            fontWeight = Bold
                        )
                        Text(
                            text = "3.77",
                            fontSize = 24.sp,
                            color = BlackText
                        )
                    }
                }

            }

            Spacer(modifier = Modifier.height(20.dp))

            // Tel
            Box(modifier = Modifier.fillMaxWidth()
                .shadow(elevation = 4.dp, shape = RoundedCornerShape(10.dp))
                .background(
                    color = Blue,
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(15.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center // จัดช่องว่างระหว่างข้อความ
                ) {
                    Icon(
                        Icons.Rounded.Call,
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),
                        tint = White
                    )
                    Spacer(modifier = Modifier.width(10.dp)) // ช่องว่าง
                    Text(
                        text = "061-583-5779",
                        fontSize = 24.sp,
                        color = White,
                        fontWeight = Bold
                    )
                }
            }

        }
    }
}