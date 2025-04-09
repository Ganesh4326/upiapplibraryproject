package com.schematix.cryptoupiapp.upiapplibrary.component.modals.content

import androidx.lifecycle.ViewModel
import com.schematix.cryptoupiapp.upiapplibrary.component.modals.ModalData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

abstract class BaseModalSheetContentViewModel<B, T>(
    val inputData: B? = null,
    val onCloseModal: ((data: ModalData<T>) -> Unit)? = null
) : ViewModel() {
    private val _data = MutableStateFlow(inputData)
    val data: StateFlow<B?> = _data;

    fun closeModal(data: ModalData<T>) {
        this.onCloseModal?.invoke(data);
    }

    fun setData(data: B?) {
        _data.update { data }
    }
}
