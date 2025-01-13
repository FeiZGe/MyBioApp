package com.thanapat.mybio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Build
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.thanapat.mybio.ui.theme.Grey
import com.thanapat.mybio.ui.theme.MyBioTheme
import com.thanapat.mybio.ui.theme.NavBG
import com.thanapat.mybio.ui.theme.WhiteBG

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyBioTheme {
                Surface(
                    modifier = Modifier.fillMaxSize().padding(8.dp),
                    color = WhiteBG
                ) {
                    MyBottomAppBar()
                }
            }
        }
    }
}

@Composable
fun MyBottomAppBar() {
    val navigationController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val selected = remember {
        mutableStateOf(Icons.Rounded.Home)
    }

    Scaffold(
        bottomBar = {
            Box(
                modifier = Modifier
                    .padding(16.dp) // เพิ่ม margin รอบ BottomAppBar
            ) {
                Surface(
                    shape = RoundedCornerShape(16.dp), // ปรับขอบโค้ง
                    color = NavBG,
                    shadowElevation = 8.dp // เพิ่มเงาให้ BottomAppBar
                ) {
                    BottomAppBar(
                        containerColor = NavBG, // ใช้ Surface คุมสีแทน
                        modifier = Modifier.height(80.dp) // ตั้งความสูง
                    ) {
                        // Home
                        IconButton(
                            onClick = {
                                selected.value = Icons.Rounded.Home
                                navigationController.navigate(Screens.Home.screen) {
                                    popUpTo(0)
                                }
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Icon(
                                    Icons.Rounded.Home,
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp),
                                    tint = if (selected.value == Icons.Rounded.Home) WhiteBG else Grey
                                )
                                Text(
                                    text = "Home",
                                    color = if (selected.value == Icons.Rounded.Home) WhiteBG else Grey,
                                    fontSize = 12.sp
                                )
                            }
                        }

                        // About
                        IconButton(
                            onClick = {
                                selected.value = Icons.Rounded.Person
                                navigationController.navigate(Screens.About.screen) {
                                    popUpTo(0)
                                }
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Icon(
                                    Icons.Rounded.Person,
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp),
                                    tint = if (selected.value == Icons.Rounded.Person) WhiteBG else Grey
                                )
                                Text(
                                    text = "About",
                                    color = if (selected.value == Icons.Rounded.Person) WhiteBG else Grey,
                                    fontSize = 12.sp
                                )
                            }
                        }

                        // Skill
                        IconButton(
                            onClick = {
                                selected.value = Icons.Rounded.Build
                                navigationController.navigate(Screens.Skill.screen) {
                                    popUpTo(0)
                                }
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Icon(
                                    Icons.Rounded.Build,
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp),
                                    tint = if (selected.value == Icons.Rounded.Build) WhiteBG else Grey
                                )
                                Text(
                                    text = "Skill",
                                    color = if (selected.value == Icons.Rounded.Build) WhiteBG else Grey,
                                    fontSize = 12.sp
                                )
                            }
                        }

                        // Project
                        IconButton(
                            onClick = {
                                selected.value = Icons.Rounded.Favorite
                                navigationController.navigate(Screens.Project.screen) {
                                    popUpTo(0)
                                }
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Icon(
                                    Icons.Rounded.Favorite,
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp),
                                    tint = if (selected.value == Icons.Rounded.Favorite) WhiteBG else Grey
                                )
                                Text(
                                    text = "Project",
                                    color = if (selected.value == Icons.Rounded.Favorite) WhiteBG else Grey,
                                    fontSize = 12.sp
                                )
                            }
                        }

                        // Contact
                        IconButton(
                            onClick = {
                                selected.value = Icons.Rounded.Email
                                navigationController.navigate(Screens.Contact.screen) {
                                    popUpTo(0)
                                }
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Icon(
                                    Icons.Rounded.Email,
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp),
                                    tint = if (selected.value == Icons.Rounded.Email) WhiteBG else Grey
                                )
                                Text(
                                    text = "Contact",
                                    color = if (selected.value == Icons.Rounded.Email) WhiteBG else Grey,
                                    fontSize = 12.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navigationController,
            startDestination = Screens.Home.screen,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(Screens.Home.screen) { Home() }
            composable(Screens.About.screen) { About() }
            composable(Screens.Skill.screen) { Skill() }
            composable(Screens.Project.screen) { Project() }
            composable(Screens.Contact.screen) { Contact() }
        }
    }
}
