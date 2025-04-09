package com.schematix.cryptoupiapp.upiapplibrary.navigation

sealed class NavigationEvent<out T> {
    data object Initial : NavigationEvent<Nothing>();
    data class NavigateTo<out T>(val data: T) : NavigationEvent<T>()
    data object NavigateBack:NavigationEvent<Nothing>();
}