package com.example.certisgh.Presentation.applications.birthCerti

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.certisgh.R
import com.example.certisgh.ui.theme.CertiSGHTheme
import com.example.certisgh.ui.theme.quicksand_bold
import com.example.certisgh.ui.theme.quicksand_light
import com.example.certisgh.ui.theme.quicksand_medium

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BirthDocumentUploadScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 8.dp)
                    ) {
                        Text(
                            text = "Required",
                            fontSize = 25.sp,
                            fontFamily = quicksand_medium,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.padding(4.dp))
                        Text(
                            text = "Document",
                            fontSize = 25.sp,
                            fontFamily = quicksand_medium,
                            fontWeight = FontWeight.ExtraBold
                        )
                    }
                },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "ArrowBack",
                        modifier = Modifier
                            .padding(start = 6.dp)
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background
                )
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
                .padding(top = 85.dp, start = 20.dp, end = 20.dp , bottom = 10.dp)
        ) {
            item {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(20.dp)
                            .border(0.1.dp , shape = MaterialTheme.shapes.medium , color = MaterialTheme.colorScheme.inverseSurface)
                            .shadow(8.dp, MaterialTheme.shapes.medium , spotColor = MaterialTheme.colorScheme.inverseSurface , ambientColor = MaterialTheme.colorScheme.inverseSurface)
                            .background(
                                color = MaterialTheme.colorScheme.surface,
                                shape = MaterialTheme.shapes.medium
                            )
                    ) {
                        Documents()
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .padding(12.dp)
                            .border(0.1.dp , shape = MaterialTheme.shapes.medium , color = MaterialTheme.colorScheme.inverseSurface)
                            .shadow(8.dp, shape = MaterialTheme.shapes.medium , spotColor = MaterialTheme.colorScheme.inverseSurface , ambientColor = MaterialTheme.colorScheme.inverseSurface)
                            .background(
                                color = MaterialTheme.colorScheme.surface,
                                shape = MaterialTheme.shapes.medium
                            ),
                        contentAlignment = Alignment.TopStart
                    ) {
                        Text(
                            text = "AI suggestion's:",
                            color = MaterialTheme.colorScheme.onBackground,
                            fontFamily = quicksand_bold,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                            modifier = Modifier
                                .padding(12.dp)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.BottomCenter
                    ) {
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.textButtonColors(
                                containerColor = MaterialTheme.colorScheme.primaryContainer
                            ),
                            shape = MaterialTheme.shapes.large,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp, end = 10.dp)
                        ) {
                            Text(
                                text = "Next",
                                fontFamily = quicksand_medium,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onBackground,
                                fontSize = 12.sp
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.BottomCenter
                    ) {
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.textButtonColors(
                                containerColor = MaterialTheme.colorScheme.inverseSurface.copy(0.2f)
                            ),
                            shape = MaterialTheme.shapes.large,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp, end = 10.dp)
                        ) {
                            Text(
                                text = "Back",
                                fontFamily = quicksand_medium,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onBackground,
                                fontSize = 12.sp
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Documents() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        Text(
            text = "Birth Certificate from the hospital:",
            fontSize = 15.sp,
            fontFamily = quicksand_bold,
            fontWeight = FontWeight.ExtraBold
        )
        UploadBox()
        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            text = "Statement of birth from the hospital or birthplace:",
            fontSize = 15.sp,
            fontFamily = quicksand_bold,
            fontWeight = FontWeight.ExtraBold
        )
        UploadBox()
        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            text = "Parent's marriage certificate:",
            fontSize = 15.sp,
            fontFamily = quicksand_bold,
            fontWeight = FontWeight.ExtraBold
        )
        UploadBox()
        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            text = "Parent's Identification Documents:",
            fontSize = 15.sp,
            fontFamily = quicksand_bold,
            fontWeight = FontWeight.ExtraBold
        )
        UploadBox()
        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            text = "Aadhaar card of parents:",
            fontSize = 15.sp,
            fontFamily = quicksand_bold,
            fontWeight = FontWeight.ExtraBold
        )
        UploadBox()
    }
}

@Composable
fun UploadBox() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(12.dp)
            .border(0.1.dp, color = MaterialTheme.colorScheme.inverseSurface , shape = MaterialTheme.shapes.medium)
            .shadow(8.dp , MaterialTheme.shapes.medium , spotColor = MaterialTheme.colorScheme.inverseSurface , ambientColor = MaterialTheme.colorScheme.inverseSurface)
            .clickable {  }
            .background(color = MaterialTheme.colorScheme.surface , shape = MaterialTheme.shapes.medium),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(R.drawable.download_24dp_e3e3e3_fill0_wght400_grad0_opsz24),
                    contentDescription = "Upload"
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Upload Document",
                    fontFamily = quicksand_bold,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 12.sp
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Supported Formats: .jpg .png .pdf",
                    fontFamily = quicksand_light,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 10.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun BirthDocumentUploadScreenPreview() {
    CertiSGHTheme {
        BirthDocumentUploadScreen()

    }
}