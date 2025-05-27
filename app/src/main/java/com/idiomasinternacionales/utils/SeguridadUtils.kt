package com.idiomasinternacionales.utils

import android.content.Context
import android.os.Build

object SeguridadUtils {
    fun isDeviceRooted(): Boolean {
        val paths = arrayOf(
            "/system/app/Superuser.apk",
            "/sbin/su",
            "/system/bin/su",
            "/system/xbin/su",
            "/data/local/xbin/su",
            "/data/local/bin/su",
            "/system/sd/xbin/su",
            "/system/bin/failsafe/su",
            "/data/local/su"
        )
        return paths.any { path -> java.io.File(path).exists() }
    }

    fun isEmulator(): Boolean =
        Build.FINGERPRINT.startsWith("generic") ||
        Build.MODEL.contains("Emulator") ||
        Build.MODEL.contains("Android SDK built for x86")
}
