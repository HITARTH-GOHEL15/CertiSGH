package com.example.certisgh.data

import com.example.certisgh.R
import com.example.certisgh.domain.Certificate

class DataSourceCertificate {
    fun loadCertificateInfo(): List<Certificate> {
        return listOf<Certificate>(
            //birth Certificate
            Certificate(
                id = 1,
                certiIcon = R.raw.animation_certificate3,
                certiTitle = R.string.birth_certificate
            ),
            //caste Certificate
            Certificate(
                id = 2,
                certiIcon = R.raw.animation_certificate,
                certiTitle = R.string.caste_certificate
            ),
            //income Certificate
            Certificate(
                id = 3,
                certiIcon = R.raw.animation_certificate1,
                certiTitle = R.string.income_certificate
            ),
            //non - creamy layer Certificate
            Certificate(
                id = 4,
                certiIcon = R.raw.animation_certificate2,
                certiTitle = R.string.ncl_certificate
            ),
            //death Certificate
            Certificate(
                id = 5,
                certiIcon = R.raw.animation_certificate,
                certiTitle = R.string.Death_certificate
            )
        )
    }
}