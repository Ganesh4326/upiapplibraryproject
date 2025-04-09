package com.schematix.cryptoupiapp.upiapplibrary.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.schematix.cryptoupiapp.upiapplibrary.ui.theme.myColors
import com.schematix.cryptoupiapp.upiapplibrary.ui.theme.s1Regular
import com.schematix.cryptoupiapp.upiapplibrary.ui.theme.s2Regular


@Composable
fun CustomOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    testTag: String? = "",
    placeholder: String,
    trailingIcon: @Composable (() -> Unit)? = null,
    imeAction: ImeAction = ImeAction.Next,            // Default IME action is "Next"
    onImeAction: (() -> Unit)? = null,
    isError: Boolean = false
) {
    val focusManager = LocalFocusManager.current      // To manage focus shifts

    Column(modifier = Modifier.fillMaxWidth()) {
        // Label
        Text(
            text = label,
            style = MaterialTheme.typography.s2Regular,
            color = MaterialTheme.myColors.neutralWhite
        )
        Spacer(modifier = Modifier.height(4.dp))

        // Outlined Text Field
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            isError = isError,
            placeholder = {
                Text(
                    text = placeholder,
                    style = MaterialTheme.typography.s1Regular,
                    color = MaterialTheme.myColors.neutralLight
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .testTag(testTag.toString()),
            colors = TextFieldDefaults.colors(),
            trailingIcon = trailingIcon,
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = imeAction
            ),
            keyboardActions = KeyboardActions(
                onNext = { focusManager.moveFocus(FocusDirection.Down) },
                onDone = {
                    focusManager.clearFocus()
                    onImeAction?.invoke()
                }
            ),
            singleLine = true
        )
    }
}

