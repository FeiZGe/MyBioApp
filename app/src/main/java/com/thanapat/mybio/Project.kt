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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thanapat.mybio.ui.theme.BlackText
import com.thanapat.mybio.ui.theme.White

@Composable
fun Project() {
    val zentry = listOf(
        "React" to Color.Yellow,
        "GSAP" to Color.Green
    )

    val clote = listOf(
        "NextJS" to Color.Gray,
        "TypeScript" to Color.Cyan
    )

    val movie = listOf(
        "PHP" to Color.Magenta
    )

    val student = listOf(
        "PHP" to Color.Magenta
    )

    Box(modifier = Modifier.fillMaxSize()
        .padding(PaddingValues(start = 35.dp, top = 35.dp, end = 35.dp))) {
        Column(modifier = Modifier.fillMaxSize()
            .align(Alignment.Center)
            .verticalScroll(
                rememberScrollState()
            )) {
            Text(text = "Project", fontSize = 40.sp, color = BlackText, fontWeight = Bold)
            Spacer(modifier = Modifier.height(20.dp))
            ProjectBox(
                projectName = "Zentry-Clone",
                projectImage = painterResource(id = R.drawable.p_zentry),
                badges = zentry
            )
            Spacer(modifier = Modifier.height(10.dp))
            ProjectBox(
                projectName = "Clote",
                projectImage = painterResource(id = R.drawable.p_clote),
                badges = clote
            )
            Spacer(modifier = Modifier.height(10.dp))
            ProjectBox(
                projectName = "Movie-Webapp",
                projectImage = painterResource(id = R.drawable.p_movie),
                badges = movie
            )
            Spacer(modifier = Modifier.height(10.dp))
            ProjectBox(
                projectName = "Student-Webapp",
                projectImage = painterResource(id = R.drawable.p_student),
                badges = student
            )
        }
    }
}

@Composable
fun ProjectBox(
    projectName: String,
    projectImage: Painter,
    badges: List<Pair<String, Color>>
) {
    Surface(
        modifier = Modifier.height(320.dp).width(400.dp).padding(10.dp),
        color = White,
        shadowElevation = 15.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp)
        ) {
            Image(
                painter = projectImage,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .aspectRatio(16f / 9f)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = projectName, fontSize = 30.sp, color = BlackText, fontWeight = Bold)
            Spacer(modifier = Modifier.weight(1f))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                badges.forEach { badge ->
                    Badge(badgeName = badge.first, badgeColor = badge.second)
                    Spacer(modifier = Modifier.width(5.dp))
                }
            }
        }
    }
}

@Composable
fun Badge(badgeName: String, badgeColor: Color) {
    Box(
        modifier = Modifier
            .height(30.dp)
            .background(
                color = badgeColor,
                shape = RoundedCornerShape(15.dp)
            )
            .padding(
                horizontal = 15.dp,
                vertical = 5.dp
            )
    ) {
        Text(text = badgeName, fontSize = 16.sp, color = BlackText)
    }
}
