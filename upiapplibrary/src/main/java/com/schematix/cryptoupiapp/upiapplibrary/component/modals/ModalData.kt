package com.schematix.cryptoupiapp.upiapplibrary.component.modals

class ModalData<T> constructor(
    var status: ModalStatus = ModalStatus.NONE,

    var data: T? = null
) {


}

enum class ModalStatus {
    SUCCESS,
    CLOSED,
    NONE
}