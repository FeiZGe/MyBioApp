package com.thanapat.mybio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thanapat.mybio.ui.theme.BlackText
import com.thanapat.mybio.ui.theme.Blue
import com.thanapat.mybio.ui.theme.White
import com.thanapat.mybio.ui.theme.WhiteBG

@Composable
fun Contact() {
    Surface(modifier = Modifier.fillMaxSize()
        .padding(PaddingValues(start = 20.dp, top = 35.dp, end = 20.dp))
        ,color = WhiteBG
    ) {

        Column(modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 30.dp)
            .verticalScroll(
                rememberScrollState()
            ),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Title
            Text(
                text = "Contact",
                fontSize = 45.sp,
                color = BlackText,
                fontWeight = Bold,
                modifier = Modifier.align(Alignment.Start)
            )
            Spacer(modifier = Modifier.height(15.dp))

            Row(modifier = Modifier.fillMaxWidth()
            ) {

                // Github
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .shadow(elevation = 4.dp, shape = RoundedCornerShape(10.dp))
                        .background(
                            color = Color(0xFF181717),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(15.dp),
                    contentAlignment = Alignment.Center // จัดข้อความให้อยู่ตรงกลางทั้งแนวตั้งและแนวนอน
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally // จัดข้อความให้อยู่ตรงกลางในแนวนอน
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.con_github),
                            contentDescription = null,
                            tint = WhiteBG,
                            modifier = Modifier.size(48.dp)
                        )
                        Spacer(modifier = Modifier.height(8.dp)) // ระยะห่างระหว่างข้อความ
                        Text(
                            text = "@FeiZGe",
                            fontSize = 22.sp,
                            color = WhiteBG
                        )
                    }
                }

                Spacer(modifier = Modifier.width(20.dp))

                // LinkedIN
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .shadow(elevation = 4.dp, shape = RoundedCornerShape(10.dp))
                        .background(
                            color = Color(0xFF0A66C2),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(15.dp),
                    contentAlignment = Alignment.Center // จัดข้อความให้อยู่ตรงกลางทั้งแนวตั้งและแนวนอน
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally // จัดข้อความให้อยู่ตรงกลางในแนวนอน
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.con_linkedin),
                            contentDescription = null,
                            tint = WhiteBG,
                            modifier = Modifier.size(48.dp)
                        )
                        Spacer(modifier = Modifier.height(8.dp)) // ระยะห่างระหว่างข้อความ
                        Text(
                            text = "thanapat-n",
                            fontSize = 22.sp,
                            color = WhiteBG
                        )
                    }
                }


            }
            Spacer(modifier = Modifier.height(20.dp))

            // Email
            Box(modifier = Modifier.fillMaxWidth()
                .shadow(elevation = 4.dp, shape = RoundedCornerShape(10.dp))
                .background(
                    color = White,
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(15.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center // จัดช่องว่างระหว่างข้อความ
                ) {
                    Icon(
                        Icons.Rounded.Email,
                        contentDescription = null,
                        modifier = Modifier.size(20.dp),
                        tint = BlackText
                    )
                    Spacer(modifier = Modifier.width(10.dp)) // ช่องว่าง
                    Text(
                        text = "thanapattt.m@gmail.com",
                        fontSize = 20.sp,
                        color = BlackText,
                        fontWeight = Bold
                    )
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
                        modifier = Modifier.size(22.dp),
                        tint = White
                    )
                    Spacer(modifier = Modifier.width(10.dp)) // ช่องว่าง
                    Text(
                        text = "061-583-5779",
                        fontSize = 22.sp,
                        color = White,
                        fontWeight = Bold
                    )
                }
            }

        }

    }
}