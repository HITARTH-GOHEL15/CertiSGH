package com.example.certisgh.Presentation.verification

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.certisgh.R
import com.example.certisgh.ui.theme.quicksand_bold
import com.example.certisgh.ui.theme.quicksand_medium

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun VerificationAndAnalysisScreen() {
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
                            text = "Doc",
                            fontSize = 20.sp,
                            fontFamily = quicksand_medium,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.padding(4.dp))
                        Text(
                            text = "Verification/Analysis",
                            fontSize = 20.sp,
                            fontFamily = quicksand_medium,
                            fontWeight = FontWeight.ExtraBold
                        )
                    }
                },
//                navigationIcon = {
//                    Icon(
//                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
//                        contentDescription = "ArrowBack",
//                        modifier = Modifier
//                            .padding(start = 6.dp)
//                    )
//                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background
                )
            )
        }

    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 100.dp , start = 20.dp , end = 20.dp , bottom = 100.dp)
                .background(color = MaterialTheme.colorScheme.background)
        ) {
            item {
                VerificationBox()
            }
            item {
                AnalysisBox()
            }
        }
    }
}

@Composable
fun VerificationBox() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .height(380.dp)
            .clickable {  }
            .border(0.1.dp , shape = MaterialTheme.shapes.medium , color = MaterialTheme.colorScheme.inverseSurface)
            .shadow(8.dp , MaterialTheme.shapes.medium , spotColor = MaterialTheme.colorScheme.inverseSurface , ambientColor = MaterialTheme.colorScheme.inverseSurface)
            .background(color = MaterialTheme.colorScheme.surface , shape = MaterialTheme.shapes.medium),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .background(
                        color = MaterialTheme.colorScheme.surface,
                        shape = MaterialTheme.shapes.medium
                    ),
                contentAlignment = Alignment.Center
            ) {
                val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.animation_docverification))
                LottieAnimation(
                    composition = composition,
                    iterations = LottieConstants.IterateForever,
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(300.dp)
                )
            }
            Spacer(modifier = Modifier.padding(12.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Verify Your Document",
                    fontFamily = quicksand_bold,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            }
        }
    }
}

@Composable
fun AnalysisBox() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .height(380.dp)
            .clickable {  }
            .border(0.1.dp , shape = MaterialTheme.shapes.medium , color = MaterialTheme.colorScheme.inverseSurface)
            .shadow(8.dp , MaterialTheme.shapes.medium , spotColor = MaterialTheme.colorScheme.inverseSurface , ambientColor = MaterialTheme.colorScheme.inverseSurface)
            .background(color = MaterialTheme.colorScheme.surface , shape = MaterialTheme.shapes.medium),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .background(
                        color = MaterialTheme.colorScheme.surface,
                        shape = MaterialTheme.shapes.medium
                    ),
                contentAlignment = Alignment.Center
            ) {
                val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.animation_docanalysis))
                LottieAnimation(
                    composition = composition,
                    iterations = LottieConstants.IterateForever,
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(400.dp)
                )
            }
            Spacer(modifier = Modifier.padding(12.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Analysis Your Document",
                    fontFamily = quicksand_bold,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier
                        .padding(bottom = 32.dp)
                )
            }
        }
    }
}