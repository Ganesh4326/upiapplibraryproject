//package com.schematix.cryptoupiapp.upiapplibrary.ui.theme
//
//import androidx.compose.material3.ColorScheme
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.darkColorScheme
//import androidx.compose.material3.lightColorScheme
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.CompositionLocalProvider
//import androidx.compose.runtime.ReadOnlyComposable
//import androidx.compose.runtime.staticCompositionLocalOf
//import androidx.compose.ui.graphics.Color
//
//data class MyColors(
//    val material: ColorScheme,
//    val neutralWhite: Color,
//    val neutralLightest: Color,
//    val neutralLighter: Color,
//    val neutralLight: Color,
//    val neutralDark: Color,
//    val neutralDarker: Color,
//    val neutralDarkest: Color,
//    val brandPrimary: Color
//) {
//    val primary: Color get() = material.primary
//    val inversePrimary: Color get() = material.inversePrimary
//    val secondary: Color get() = material.secondary
//    val background: Color get() = material.background
//    val surface: Color get() = material.surface
//    val error: Color get() = material.error
//    val onPrimary: Color get() = material.onPrimary
//    val onSecondary: Color get() = material.onSecondary
//    val onBackground: Color get() = material.onBackground
//    val onSurface: Color get() = material.onSurface
//    val onError: Color get() = material.onError
//}
//private val DarkColorScheme = MyColors(
//    material = darkColorScheme(),
//    neutralWhite = NeutralWhite,
//    neutralLightest = NeutralLightest,
//    neutralLighter = NeutralLighter,
//    neutralLight = NeutralLight,
//    neutralDark = NeutralDark,
//    neutralDarker = NeutralDarker,
//    neutralDarkest = NeutralDarkest,
//    brandPrimary = BrandPrimary
//)
//
//private val LightColorScheme = MyColors(
//    material = lightColorScheme(),
//    neutralWhite = NeutralWhite,
//    neutralLightest = NeutralLightest,
//    neutralLighter = NeutralLighter,
//    neutralLight = NeutralLight,
//    neutralDark = NeutralDark,
//    neutralDarker = NeutralDarker,
//    neutralDarkest = NeutralDarkest,
//    brandPrimary = BrandPrimary
//)
//
///**
// * @param darkTheme Whether the theme should use a dark color scheme (follows system by default).
// * @param androidTheme Whether the theme should use the Android theme color scheme instead of the
// *        default theme.
// * @param disableDynamicTheming If `true`, disables the use of dynamic theming, even when it is
// *        supported. This parameter has no effect if [androidTheme] is `true`.
// * @param content composables to create the content for display
// */
//private val LocalColors = staticCompositionLocalOf { LightColorScheme }
//
//val MaterialTheme.myColors: MyColors
//    @Composable
//    @ReadOnlyComposable
//    get() = LocalColors.current
//
//@Composable
//fun CryptoUPIAppTheme(
//    darkTheme: Boolean = true,
//    androidTheme: Boolean = false,
//    // Dynamic color is available on Android 12+
//    dynamicColor: Boolean = true,
//    content: @Composable () -> Unit
//) {
//    val colorScheme:MyColors = if (androidTheme) {
//        if (darkTheme) DarkColorScheme else LightColorScheme
//    }
//    else {
//        if (darkTheme) DarkColorScheme else LightColorScheme
//    }
//    CompositionLocalProvider(LocalColors provides colorScheme) {
//        MaterialTheme(
//            colorScheme = colorScheme.material,
//            typography = Typography,
//            content = content
//        )
//    }
//}