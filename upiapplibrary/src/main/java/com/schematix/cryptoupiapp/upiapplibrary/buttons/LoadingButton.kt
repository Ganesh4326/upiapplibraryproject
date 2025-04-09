package com.schematix.cryptoupiapp.upiapplibrary.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import com.example.cryptoupiapp.upiapplibrary.ui.theme.Fonts.FONT_SIZE_16
import com.schematix.cryptoupiapp.upiapplibrary.constants.ButtonHeights.BUTTON_HEIGHT_46
import com.schematix.cryptoupiapp.upiapplibrary.constants.ButtonWidths.BASE_PROGRESS_BUTTON_COMMON_WIDTH
import com.schematix.cryptoupiapp.upiapplibrary.constants.Constants
import com.schematix.cryptoupiapp.upiapplibrary.constants.Sizes.SIZE_12_DP
import com.schematix.cryptoupiapp.upiapplibrary.ui.theme.BrandPrimary
import com.schematix.cryptoupiapp.upiapplibrary.ui.theme.firaSansFamily
import com.schematix.cryptoupiapp.upiapplibrary.usecases.misc.UseCaseResult

import com.simform.ssjetpackcomposeprogressbuttonlibrary.SSButtonState
import com.simform.ssjetpackcomposeprogressbuttonlibrary.SSButtonType
import com.simform.ssjetpackcomposeprogressbuttonlibrary.SSJetPackComposeProgressButton


@Composable
fun LoadingButton(
    type: SSButtonType,
    buttonState: UseCaseResult<Any>,
    onClick: () -> Unit,
    assetColor: Color = Color.White,
    width: Dp = BASE_PROGRESS_BUTTON_COMMON_WIDTH,
    height: Dp = BUTTON_HEIGHT_46,
    cornerRadius: Int = Constants.BASE_PROGRESS_BUTTON_CORNER_RADIUS,
    leftImagePainter: Painter? = null,
    rightImagePainter: Painter? = null,
    successIconPainter: Painter = rememberVectorPainter(image = Icons.Default.Done),
    failureIconPainter: Painter = rememberVectorPainter(image = Icons.Outlined.Info),
    leftImageTintColor: Color = BrandPrimary,
    rightImageTintColor: Color = BrandPrimary,
    successIconTintColor: Color = BrandPrimary,
    failureIconTintColor: Color = BrandPrimary,
    padding: PaddingValues = PaddingValues(SIZE_12_DP),
    colors: ButtonColors = ButtonDefaults.buttonColors(
        containerColor = BrandPrimary,
        disabledContainerColor = BrandPrimary
    ),
    isBlinkingIcon: Boolean = false,
    blinkingIconColor: Color? = null,
    hourHandColor: Color = Color.Black,
    text: String? = null,
    textModifier: Modifier = Modifier,
    fontSize: TextUnit = FONT_SIZE_16,
    fontStyle: FontStyle? = null,
    fontFamily: FontFamily? = firaSansFamily,
    fontWeight: FontWeight? = FontWeight.Medium,
    enabled: Boolean = true
) {
    val mappedButtonState = when (buttonState) {
        is UseCaseResult.Initial -> SSButtonState.IDLE
        is UseCaseResult.Success -> SSButtonState.SUCCESS
        is UseCaseResult.Error -> SSButtonState.FAILURE
        is UseCaseResult.Loading -> SSButtonState.LOADING
    }

    SSJetPackComposeProgressButton(
        assetColor = assetColor,
        colors = colors,
        type = type,
        onClick = onClick,
        buttonState = mappedButtonState,
        width = width,
        height = height,
        padding = padding,
        text = text,
        textModifier = textModifier,
        fontSize = fontSize,
        fontStyle = fontStyle,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        hourHandColor = hourHandColor,
        isBlinkingIcon = isBlinkingIcon,
        blinkingIconColor = blinkingIconColor,
        cornerRadius = cornerRadius,
        leftImagePainter = leftImagePainter,
        leftImageTintColor = leftImageTintColor,
        successIconPainter = successIconPainter,
        failureIconTintColor = failureIconTintColor,
        successIconTintColor = successIconTintColor,
        failureIconPainter = failureIconPainter,
        rightImagePainter = rightImagePainter,
        rightImageTintColor = rightImageTintColor,
        enabled = enabled
    )
}