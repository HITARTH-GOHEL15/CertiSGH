package com.example.certisgh.Presentation.applications.birthCerti

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.certisgh.ui.theme.CertiSGHTheme
import com.example.certisgh.ui.theme.quicksand_bold
import com.example.certisgh.ui.theme.quicksand_light
import com.example.certisgh.ui.theme.quicksand_medium

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BirthCertificateInstructions() {
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
                            text = "Birth",
                            fontSize = 25.sp,
                            fontFamily = quicksand_medium,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.padding(4.dp))
                        Text(
                            text = "Certificate",
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
                .padding(top = 100.dp , end = 20.dp , bottom = 10.dp , start = 20.dp),
        ) {
            item {
                Text(
                    text = "Instructions:",
                    fontSize = 25.sp,
                    color = MaterialTheme.colorScheme.onBackground,
                    fontFamily = quicksand_bold,
                    fontWeight = FontWeight.ExtraBold
                )
                InstructionBox()
                Text(
                    text = "Required Documents:",
                    color = MaterialTheme.colorScheme.onBackground,
                    fontSize = 25.sp,
                    fontFamily = quicksand_bold,
                    fontWeight = FontWeight.ExtraBold
                )
                RequiredDocBox()
                Spacer(modifier = Modifier.padding(8.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.textButtonColors(
                            containerColor = MaterialTheme.colorScheme.primaryContainer
                        ),
                        shape = MaterialTheme.shapes.large,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "Apply",
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
                    contentAlignment = Alignment.Center
                ) {
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.textButtonColors(
                            containerColor = MaterialTheme.colorScheme.inverseSurface.copy(0.2f)
                        ),
                        shape = MaterialTheme.shapes.large,
                        modifier = Modifier
                            .fillMaxWidth()
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
fun InstructionBox() {
    Box(
        modifier = Modifier
            .padding(12.dp)
            .height(400.dp)
            .border(0.1.dp , shape = MaterialTheme.shapes.medium , color = MaterialTheme.colorScheme.inverseSurface)
            .shadow(8.dp , shape = MaterialTheme.shapes.medium , spotColor = MaterialTheme.colorScheme.inverseSurface , ambientColor = MaterialTheme.colorScheme.inverseSurface)
            .background(color = MaterialTheme.colorScheme.surface , shape = MaterialTheme.shapes.medium)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
            Text(
                text = ">  Click on the Birth Certificate Box\n" + "" +
                        ">  Ensure that names, birth dates, and parent information match the documents.\n" + "" +
                        ">  AI assistance will highlight missing or incorrect information in red.\n" + "" +
                        ">  Only upload clear, scanned copies of the required documents.\n" + "" +
                        ">  Allowed file formats: JPEG, PNG, PDF (Max 5MB per file). \n" + "" +
                        ">  The system will generate an AI Summary of the application, highlighting key details.\n" + "" +
                        ">  Any missing or incorrect information will be shown for correction before submission.\n" + "" +
                        ">  Click 0n Apply for final submission.\n" + "" +
                        ">  Alternatively, click Save as Draft if you need to complete it later.\n" + "",
                fontSize = 15.sp,
                color = MaterialTheme.colorScheme.onBackground,
                fontFamily = quicksand_light,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(6.dp)
            )
    }
}

@Composable
fun RequiredDocBox() {
    Box(
        modifier = Modifier
            .padding(12.dp)
            .height(150.dp)
            .border(0.1.dp , shape = MaterialTheme.shapes.medium , color = MaterialTheme.colorScheme.inverseSurface)
            .shadow(8.dp , shape = MaterialTheme.shapes.medium , spotColor = MaterialTheme.colorScheme.inverseSurface , ambientColor = MaterialTheme.colorScheme.inverseSurface)
            .background(color = MaterialTheme.colorScheme.surface , shape = MaterialTheme.shapes.medium)
            .fillMaxWidth(),
        contentAlignment = Alignment.TopStart
    ) {
        Text(
            text = ">  Birth Certificate from the hospital\n" +
                   ">  Statement of birth from the hospital or birthplace\n" +
                   ">  Parent’s marriage certificate \n" +
                   ">  Parent’s Identification Documents \n" +
                   ">  Aadhaar card of parents \n",
            fontSize = 15.sp,
            color = MaterialTheme.colorScheme.onBackground,
            fontFamily = quicksand_light,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(6.dp)
        )
    }
}

@Preview
@Composable
fun BirthCertificateInstructionsPreview() {
    CertiSGHTheme {
        BirthCertificateInstructions()
    }
}