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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thanapat.mybio.ui.theme.BlackText
import com.thanapat.mybio.ui.theme.Blue
import com.thanapat.mybio.ui.theme.White
import com.thanapat.mybio.ui.theme.WhiteBG

@Composable
fun Skill() {
    Surface(modifier = Modifier.fillMaxSize()
        .padding(PaddingValues(start = 20.dp, top = 35.dp, end = 20.dp))
        ,color = WhiteBG
    ) {

        // Title
        Text(
            text = "Skill",
            fontSize = 40.sp,
            color = BlackText,
            fontWeight = Bold
        )

        Column(modifier = Modifier.fillMaxSize()
            .padding(PaddingValues(start = 15.dp, top = 60.dp, end = 15.dp))
            .verticalScroll(
                rememberScrollState()
            ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Programming language
            Box(modifier = Modifier.fillMaxWidth()
                .shadow(elevation = 4.dp, shape = RoundedCornerShape(10.dp))
                .background(
                    color = White,
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(15.dp)
            ) {

                Column(modifier = Modifier.fillMaxWidth()) {
                    // sub title
                    Text(
                        text = "Programming language",
                        fontSize = 24.sp,
                        color = Blue,
                        fontWeight = Bold
                    )
                    SubTextList(
                        subtitles = listOf(
                            "Kotlin",
                            "Java",
                            "JavaScript",
                            "TypeScript",
                            "Python",
                            "PHP"
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            // Framework & Library
            Box(modifier = Modifier.fillMaxWidth()
                .shadow(elevation = 4.dp, shape = RoundedCornerShape(10.dp))
                .background(
                    color = White,
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(15.dp)
            ) {

                Column(modifier = Modifier.fillMaxWidth()) {
                    // sub title
                    Text(
                        text = "Framework & Library",
                        fontSize = 24.sp,
                        color = Blue,
                        fontWeight = Bold
                    )
                    SubTextList(
                        subtitles = listOf(
                            "React",
                            "NextJS",
                            "NodeJS",
                            "TailwindCSS",
                            "Shadcn",
                            "Sanity"
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            // Tool
            Box(modifier = Modifier.fillMaxWidth()
                .shadow(elevation = 4.dp, shape = RoundedCornerShape(10.dp))
                .background(
                    color = White,
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(15.dp)
            ) {

                Column(modifier = Modifier.fillMaxWidth()) {
                    // sub title
                    Text(
                        text = "Tool",
                        fontSize = 24.sp,
                        color = Blue,
                        fontWeight = Bold
                    )
                    SubTextList(
                        subtitles = listOf(
                            "VsCode",
                            "Android Studio",
                            "Postman",
                            "Figma"
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

        }

    }
}

// วนลูปแสดงรายการข้อความ List
@Composable
fun SubTextList(subtitles: List<String>) {
    Column(modifier = Modifier.fillMaxWidth()) {
        subtitles.forEach { subtitle ->
            SubText(subtitle = subtitle)
        }
    }
}

@Composable
fun SubText(subtitle: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(PaddingValues(top = 10.dp, start = 15.dp))
    ) {
        Text(
            text = "- ",
            fontSize = 18.sp,
            color = BlackText
        )
        Text(
            text = subtitle,
            fontSize = 18.sp,
            color = BlackText
        )
    }
}