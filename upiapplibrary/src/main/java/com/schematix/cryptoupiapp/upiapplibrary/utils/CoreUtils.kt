package com.schematix.cryptoupiapp.upiapplibrary.utils

import java.math.BigDecimal
import java.math.RoundingMode

fun convertFromBaseUnitToDecimal(amount: Long?, baseUnits: Int, decimals: Int): String {
    return if (amount == null) {
        "0.00"
    } else {
        BigDecimal(amount)
            .movePointLeft(baseUnits)
            .setScale(decimals, RoundingMode.HALF_UP)
            .toPlainString()
    }
}
fun convertFromDecimalToBaseUnit(amount: Long, decimals: Int): Int {
    return BigDecimal(amount)
        .movePointRight(decimals)
        .setScale(0, RoundingMode.HALF_UP)
        .toInt()
}



