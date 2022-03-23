package com.danderson.mymemory.utils

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

fun isPermissionGranted(context: Context, permission: String): Boolean {
    return ContextCompat.checkSelfPermission(context, permission) == PackageManager.PERMISSION_GRANTED
}

fun requestPermission(activiy: Activity?, permission: String, requestCode: Int) {
    ActivityCompat.requestPermissions(activiy!!, arrayOf(permission), requestCode)
}