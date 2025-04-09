package com.schematix.cryptoupiapp.upiapplibrary.utils

import android.os.Build
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale

@RequiresApi(Build.VERSION_CODES.O)
fun getFormattedDateTime(dateTime: OffsetDateTime?): String {
    if (dateTime == null) return "Invalid datetime"

    val formatter = DateTimeFormatter.ofPattern("dd MMM yyyy hh:mma", Locale.ENGLISH)
    return dateTime.format(formatter)
}

fun getCurrentTimeStamp(): String {
    return SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Date())
}