package com.schematix.cryptoupiapp.upiapplibrary.services

import android.content.Context
import android.widget.Toast
import javax.inject.Inject

class ToastService @Inject constructor(
) {
    fun show(context: Context, message: String) {
        val toast = Toast.makeText(context, message, Toast.LENGTH_SHORT)
        toast.show()
    }
}