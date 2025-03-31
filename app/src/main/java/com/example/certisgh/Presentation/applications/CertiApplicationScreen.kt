package com.example.certisgh.Presentation.applications

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.LottieComposition
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.certisgh.R
import com.example.certisgh.data.DataSourceCertificate
import com.example.certisgh.domain.Certificate
import com.example.certisgh.ui.theme.CertiSGHTheme
import com.example.certisgh.ui.theme.quicksand_bold

@Composable
fun CertiApplicationScreen(
    CertificateInfo: List<Certificate>
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp , bottom = 20.dp)
    ) {
        LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(start = 10.dp , end = 10.dp)
            ) {
                items(
                    CertificateInfo
                ) { Certificate ->
                    CertificateBox(
                        composition = LottieCompositionSpec.RawRes(Certificate.certiIcon),
                        text = LocalContext.current.getString(Certificate.certiTitle)
                    )
                }
            }
        }
    }


@Composable
fun CertificateBox(
    composition: LottieCompositionSpec.RawRes,
    text: String
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(8.dp)
            .border(0.1.dp , shape = MaterialTheme.shapes.medium , color = MaterialTheme.colorScheme.inverseSurface)
            .shadow(8.dp , shape = MaterialTheme.shapes.large , spotColor = MaterialTheme.colorScheme.inverseSurface , ambientColor = MaterialTheme.colorScheme.inverseSurface)
            .clickable {

            }
            .background(color = MaterialTheme.colorScheme.surface , shape = MaterialTheme.shapes.large),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .background(color = MaterialTheme.colorScheme.surface)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp)
                    .background(
                        color = MaterialTheme.colorScheme.surface,
                        shape = MaterialTheme.shapes.medium
                    ),
                contentAlignment = Alignment.Center
            ) {
                val composition1 by rememberLottieComposition(composition)
                LottieAnimation(
                    composition = composition1,
                    iterations = LottieConstants.IterateForever,
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(200.dp)
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = text,
                    fontFamily = quicksand_bold,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            }
        }
    }
}


@Preview
@Composable
fun CertificateBoxPreview() {
    CertiSGHTheme {
       CertiApplicationScreen(
           CertificateInfo = DataSourceCertificate().loadCertificateInfo()
       )
    }
}
