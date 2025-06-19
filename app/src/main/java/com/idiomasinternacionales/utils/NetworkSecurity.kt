package com.idiomasinternacionales.utils

import okhttp3.CertificatePinner
import okhttp3.OkHttpClient

object NetworkSecurity {
    fun getPinnedClient(): OkHttpClient {
        val certificatePinner = CertificatePinner.Builder()
            .add("your.api.domain.com", "sha256/AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA=")
            .build()
        return OkHttpClient.Builder()
            .certificatePinner(certificatePinner)
            .build()
    }
}
