package com.schematix.cryptoupiapp.upiapplibrary.utils

import android.content.Context
import android.content.SharedPreferences

object SharedPreferencesUtils {
    private const val PREFS_NAME = "my_prefs"

    public const val EMAIL_ID_KEY = "com.schematix.cryptoupiapp.preference.email";
    public const val PASSWORD_KEY = "com.schematix.cryptoupiapp.preference.password";
    public const val MERCHANT_ID_KEY = "com.schematix.cryptoupiapp.preference.merchantid";
    public const val TERMINAL_ID_KEY = "com.schematix.cryptoupiapp.preference.terminalid";
    public const val CURRENCY_ID_KEY = "com.schematix.cryptoupiapp.preference.currencyid";
    public const val ACCESS_TOKEN = "com.schematix.cryptoupiapp.preference.accesstoken";

    fun getString(context: Context, key: String, defaultValue: String = ""): String {
        val prefs: SharedPreferences =
            context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        return prefs.getString(key, defaultValue) ?: defaultValue
    }

    fun setString(context: Context, key: String, value: String) {
        val prefs: SharedPreferences =
            context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        with(prefs.edit()) {
            putString(key, value)
            apply()
        }
    }
}
