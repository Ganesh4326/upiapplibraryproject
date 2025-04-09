package com.schematix.cryptoupiapp.upiapplibrary.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.schematix.cryptoupiapp.upiapplibrary.R

val firaSansFamily = FontFamily(
    Font(R.font.afacad_medium, FontWeight.Light),
    Font(R.font.afacad_regular, FontWeight.Normal),
    Font(R.font.afacad_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.afacad_medium, FontWeight.Medium),
    Font(R.font.afacad_bold, FontWeight.Bold)
)


// Set of Material typography styles to start with
val Typography = Typography(
    bodySmall = TextStyle(
        fontFamily = firaSansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 26.sp
    ),
)

val Typography.h1Bold: TextStyle
    get() = TextStyle(
        fontFamily = firaSansFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    )

val Typography.h1Medium: TextStyle
    get() = TextStyle(
        fontFamily = firaSansFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp
    )

val Typography.h2Bold: TextStyle
    get() = TextStyle(
        fontFamily = firaSansFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )

val Typography.h2Medium: TextStyle
    get() = TextStyle(
        fontFamily = firaSansFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp
    )

val Typography.h3Bold: TextStyle
    get() = TextStyle(
        fontFamily = firaSansFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    )

val Typography.h3Medium: TextStyle
    get() = TextStyle(
        fontFamily = firaSansFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp
    )

val Typography.s1Medium: TextStyle
    get() = TextStyle(
        fontFamily = firaSansFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    )

val Typography.s1Regular: TextStyle
    get() = TextStyle(
        fontFamily = firaSansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )

val Typography.s2Medium: TextStyle
    get() = TextStyle(
        fontFamily = firaSansFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    )

val Typography.s2Regular: TextStyle
    get() = TextStyle(
        fontFamily = firaSansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )

val Typography.s3Medium: TextStyle
    get() = TextStyle(
        fontFamily = firaSansFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp
    )

val Typography.s3Regular: TextStyle
    get() = TextStyle(
        fontFamily = firaSansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )