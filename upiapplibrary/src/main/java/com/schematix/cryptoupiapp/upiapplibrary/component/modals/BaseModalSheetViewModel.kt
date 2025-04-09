package com.schematix.cryptoupiapp.upiapplibrary.component.modals

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

abstract class BaseModalSheetViewModel<B, T>(
    val inputData: B?,
     val onCloseModal: ((data: ModalData<T>) -> Unit)? = null
) :
    ViewModel() {

    private val _isModalOpen = MutableStateFlow(false)
    val isModalOpen: StateFlow<Boolean> = _isModalOpen.asStateFlow()

    private val _data = MutableStateFlow(inputData)
    val data: StateFlow<B?> = _data;

    fun openModal(inputData: B? = null) {
        _data.update { inputData }
        _isModalOpen.update { true }
    }

    fun closeModal(data: ModalData<T>) {
        this.onCloseModal?.invoke(data);
        _isModalOpen.update { false };
    }

}
