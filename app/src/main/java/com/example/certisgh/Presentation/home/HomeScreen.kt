package com.example.certisgh.Presentation.home

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.certisgh.Presentation.applications.CertiApplicationScreen
import com.example.certisgh.Presentation.verification.VerificationAndAnalysisScreen
import com.example.certisgh.R
import com.example.certisgh.data.DataSourceCertificate
import com.example.certisgh.ui.theme.quicksand_medium

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(
    modifier: Modifier
) {
    var bottomNavigationScreens by rememberSaveable { 
        mutableStateOf(BottomNavigationScreens.HomeScreenView)
    }

    var isHomeScreen by remember {
        mutableStateOf(true)
    }
    Scaffold(
        topBar = {
            if(isHomeScreen) {
                TopAppBar(
                    title = {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "Certificate",
                                fontFamily = quicksand_medium,
                                color = MaterialTheme.colorScheme.primary,
                                fontWeight = FontWeight.ExtraBold
                            )
                            Spacer(modifier = Modifier.padding(4.dp))
                            Text(
                                text = "issuance",
                                fontFamily = quicksand_medium,
                                fontWeight = FontWeight.ExtraBold
                            )                        }
                    },
                    actions = {
                        IconButton(
                            onClick = {}
                        ) {
                            Icon(
                                imageVector = Icons.Default.Notifications,
                                contentDescription = "Notifications"
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.background
                    )
                )
            }
        },
        floatingActionButton = {
            if (isHomeScreen) {
                FloatingActionButton(
                    onClick = {},
                    shape = MaterialTheme.shapes.medium,
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onBackground
                ) {
                    Icon(
                        painter = painterResource(R.drawable.help_center_24dp_e3e3e3_fill0_wght400_grad0_opsz24),
                        contentDescription = "chatbot"
                    )
                }
            }
        },
        bottomBar = {
            NavigationBar(
                containerColor = MaterialTheme.colorScheme.surface
            ) {
                //Application
                NavigationBarItem(
                    colors = NavigationBarItemDefaults.colors(
                        unselectedIconColor = MaterialTheme.colorScheme.onBackground,
                        indicatorColor = Color.Transparent,
                        selectedIconColor = MaterialTheme.colorScheme.inverseSurface
                    ),
                    onClick = {
                        bottomNavigationScreens = BottomNavigationScreens.HomeScreenView
                    },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.domain_verification_24dp_e3e3e3_fill0_wght400_grad0_opsz24),
                            contentDescription = "Home"
                        )
                    },
                    selected = bottomNavigationScreens == BottomNavigationScreens.HomeScreenView
                )
                //Verification/Analysis
                NavigationBarItem(
                    colors = NavigationBarItemDefaults.colors(
                        unselectedIconColor = MaterialTheme.colorScheme.onBackground,
                        indicatorColor = Color.Transparent,
                        selectedIconColor = MaterialTheme.colorScheme.inverseSurface
                    ),
                    onClick = {
                        bottomNavigationScreens = BottomNavigationScreens.VerificationScreenView
                    },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.analytics_24dp_e3e3e3_fill0_wght400_grad0_opsz24 ),
                            contentDescription = "tracker"
                        )
                    },
                    selected = bottomNavigationScreens == BottomNavigationScreens.VerificationScreenView
                )
                //Dashboard
                NavigationBarItem(
                    colors = NavigationBarItemDefaults.colors(
                        unselectedIconColor = MaterialTheme.colorScheme.onBackground,
                        indicatorColor = Color.Transparent,
                        selectedIconColor = MaterialTheme.colorScheme.inverseSurface
                    ),
                    onClick = {
                        bottomNavigationScreens = BottomNavigationScreens.ChatbotScreenView
                    },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.dashboard_24dp_e3e3e3_fill0_wght400_grad0_opsz24),
                            contentDescription = "chatbot"
                        )
                    },
                    selected = bottomNavigationScreens == BottomNavigationScreens.ChatbotScreenView
                )
                //Profile
                NavigationBarItem(
                    colors = NavigationBarItemDefaults.colors(
                        unselectedIconColor = MaterialTheme.colorScheme.onBackground,
                        indicatorColor = Color.Transparent,
                        selectedIconColor = MaterialTheme.colorScheme.inverseSurface
                    ),
                    onClick = {
                        bottomNavigationScreens = BottomNavigationScreens.ProfileScreenView
                    },
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Profile"
                        )
                    },
                    selected = bottomNavigationScreens == BottomNavigationScreens.ProfileScreenView
                )
            }
        }
    ) { innerPadding ->
        AnimatedContent(
            targetState = bottomNavigationScreens,
            label = "",
            transitionSpec = {
               when(this.targetState) {
                   BottomNavigationScreens.HomeScreenView -> slideInHorizontally(){it}.togetherWith(slideOutHorizontally(){-it})
                   BottomNavigationScreens.VerificationScreenView -> slideInHorizontally(){it}.togetherWith(slideOutHorizontally(){-it})
                   BottomNavigationScreens.ChatbotScreenView -> slideInHorizontally(){it}.togetherWith(slideOutHorizontally(){-it})
                   BottomNavigationScreens.ProfileScreenView -> slideInHorizontally(){it}.togetherWith(slideOutHorizontally(){-it})
               }
            },
            modifier = Modifier
                .background(color = MaterialTheme.colorScheme.background)
        ) { navScreen ->
            when(navScreen) {
                BottomNavigationScreens.HomeScreenView -> {
                    isHomeScreen = true
                    CertiApplicationScreen(
                        CertificateInfo = DataSourceCertificate().loadCertificateInfo()
                    )
                }
                BottomNavigationScreens.VerificationScreenView -> {
                    isHomeScreen = false
                    VerificationAndAnalysisScreen()

                }
                BottomNavigationScreens.ChatbotScreenView -> {}
                BottomNavigationScreens.ProfileScreenView -> {}
            }
        }

    }
}

private enum class BottomNavigationScreens{
    HomeScreenView,
    VerificationScreenView,
    ChatbotScreenView,
    ProfileScreenView
}