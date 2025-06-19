package com.idiomasinternacionales.utils

import android.os.Build

object RootDetection {
    fun isDeviceRooted(): Boolean {
        val buildTags = Build.TAGS
        if (buildTags != null && buildTags.contains("test-keys")) return true
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
        for (path in paths) {
            if (java.io.File(path).exists()) return true
        }
        return false
    }
}
