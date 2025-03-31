package com.example.certisgh.Presentation.applications.birthCerti

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.certisgh.ui.theme.CertiSGHTheme
import com.example.certisgh.ui.theme.quicksand_bold
import com.example.certisgh.ui.theme.quicksand_medium

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ApplicationDetailScreen() {
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
                            text = "Personal",
                            fontSize = 25.sp,
                            fontFamily = quicksand_medium,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.padding(4.dp))
                        Text(
                            text = "Details",
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
                .padding(top = 85.dp, start = 8.dp, end = 8.dp, bottom = 10.dp)
                .fillMaxSize()
        ) { item {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
                    .border(0.1.dp , shape = MaterialTheme.shapes.medium , color = MaterialTheme.colorScheme.inverseSurface)
                    .shadow(8.dp, shape = MaterialTheme.shapes.medium , spotColor = MaterialTheme.colorScheme.inverseSurface , ambientColor = MaterialTheme.colorScheme.inverseSurface)
                    .background(
                        color = MaterialTheme.colorScheme.surface,
                        shape = MaterialTheme.shapes.medium
                    )
            ) {
                InfoFillUp()
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(12.dp)
                    .border(0.1.dp , shape = MaterialTheme.shapes.medium , color = MaterialTheme.colorScheme.inverseSurface)
                    .shadow(8.dp , shape = MaterialTheme.shapes.medium , spotColor = MaterialTheme.colorScheme.inverseSurface , ambientColor = MaterialTheme.colorScheme.inverseSurface)
                    .background(color = MaterialTheme.colorScheme.surface , shape = MaterialTheme.shapes.medium),
                contentAlignment = Alignment.TopStart
            ) {
                Text(
                    text = "AI suggestion's:",
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
                        .padding(start = 10.dp , end = 10.dp)
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
                        .padding(start = 10.dp , end = 10.dp)
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

@Composable
fun InfoFillUp() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .background(color = MaterialTheme.colorScheme.surface)
    ) {
        Text(
            text = "Child Name",
            fontFamily = quicksand_bold,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .padding(start = 24.dp , end = 24.dp)
            )
            InfoTextField(
                value = "",
                onValueChange = {},
                text = ""
            )
        Spacer(modifier = Modifier.padding(8.dp))
        Text(
            text = "Parent's Name",
            fontFamily = quicksand_bold,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .padding(start = 24.dp , end = 24.dp)
        )
          InfoTextField(
              value = "",
              onValueChange = {},
              text = ""
          )
        Spacer(modifier = Modifier.padding(8.dp))
        Text(
            text = "Parent's Aadhaar number",
            fontFamily = quicksand_bold,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .padding(start = 24.dp , end = 24.dp)
        )
        InfoTextField(
            text = "",
            onValueChange = {},
            value = ""
        )
        Spacer(modifier = Modifier.padding(8.dp))
        Text(
            text = "Place of birth",
            fontFamily = quicksand_bold,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .padding(start = 24.dp , end = 24.dp)
        )
        InfoTextField(
            text = "",
            onValueChange = {},
            value = ""
        )
        Spacer(modifier = Modifier.padding(8.dp))
        Text(
            text = "Date of birth",
            fontFamily = quicksand_bold,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .padding(start = 24.dp , end = 24.dp)
        )
        InfoTextField(
            text = "",
            onValueChange = {},
            value = ""
        )
        Spacer(modifier = Modifier.padding(8.dp))
        Text(
            text = "Permanent Address",
            fontFamily = quicksand_bold,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .padding(start = 24.dp , end = 24.dp)
        )
        InfoTextField(
            text = "",
            onValueChange = {},
            value = ""
        )
        Spacer(modifier = Modifier.padding(8.dp))
    }
}

@Composable
fun InfoTextField(
    value: String,
    onValueChange: (String) -> Unit,
    text: String
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        shape = MaterialTheme.shapes.small,
        label = {
           Text(
               text = text,
               fontFamily = quicksand_medium,
               fontWeight = FontWeight.Bold
           )
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 24.dp , end = 24.dp),
        singleLine = true,
    )
}

@Preview
@Composable
fun ApplicationDetailScreenPreview() {
    CertiSGHTheme {
        ApplicationDetailScreen()
    }
}