package com.example.monprofil.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.window.core.layout.WindowSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import com.example.monprofil.R

@Composable
fun Screen(windowSizeClass: WindowSizeClass, modifier: Modifier = Modifier) {
    when (windowSizeClass.windowWidthSizeClass) {
        WindowWidthSizeClass.COMPACT -> {
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.image_profil),
                    contentDescription = "Photo de profil",
                    modifier = Modifier
                        .size(250.dp)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Mohamed Amine Saghraoui",
                    fontSize = 32.sp
                )
                Text(
                    text = "Étudiant ingénieur en E-santé",
                    fontSize = 20.sp
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.icon_gmail),
                        contentDescription = "Icône email",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "saghraoui.mohamedamine@gmail.com",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Left
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.icon_linkedin),
                        contentDescription = "Icône LinkedIn",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "https://www.linkedin.com/in/amine-saghraoui-b22a36292/",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Left
                    )
                }

                Button(onClick = { }) {
                    Text(text = "Démarrer")
                }
            }
        }

        else -> {
            Row(
                modifier = modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Image(
                        painter = painterResource(R.drawable.image_profil),
                        contentDescription = "Photo de profil",
                        modifier = Modifier
                            .size(250.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Mohamed Amine Saghraoui",
                        fontSize = 32.sp
                    )
                    Text(
                        text = "Étudiant ingénieur en E-santé",
                        fontSize = 20.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.icon_gmail),
                            contentDescription = "Icône email",
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "saghraoui.mohamedamine@gmail.com",
                            fontSize = 16.sp,
                            textAlign = TextAlign.Left
                        )
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.icon_linkedin),
                            contentDescription = "Icône LinkedIn",
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "https://www.linkedin.com/in/amine-saghraoui-b22a36292/",
                            fontSize = 16.sp,
                            textAlign = TextAlign.Left
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(onClick = { }) {
                        Text(text = "Démarrer")
                    }
                }
            }
        }
    }
}