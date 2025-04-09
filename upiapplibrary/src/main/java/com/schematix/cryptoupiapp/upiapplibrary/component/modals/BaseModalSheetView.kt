package com.schematix.cryptoupiapp.upiapplibrary.component.modals

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import com.schematix.cryptoupiapp.upiapplibrary.component.modals.content.BaseModalSheetContentViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun <T : BaseModalSheetContentViewModel<I, O>, I, O> BaseModalSheetView(
    viewModel: BaseModalSheetViewModel<I, O>,
    contentViewModel: T,
    sheetContent: @Composable (contentViewModel: T) -> Unit,
    mainContent: @Composable () -> Unit
) {
    val sheetState = rememberModalBottomSheetState()
    val showBottomSheet by viewModel.isModalOpen.collectAsState()
    val inputData by viewModel.data.collectAsState()
    val scope = rememberCoroutineScope()

    LaunchedEffect(showBottomSheet) {
        if (showBottomSheet) {
            contentViewModel.setData(inputData)
            scope.launch {
                sheetState.show()
            }
        } else {
            scope.launch {
                sheetState.hide()
            }
        }
    }

    mainContent()
    if (showBottomSheet || sheetState.isVisible) {
        contentViewModel.setData(inputData)
        ModalBottomSheet(
            onDismissRequest = {
                viewModel.closeModal(data = ModalData())
            },
            sheetState = sheetState,
            containerColor = Color.White
        ) {
            // Sheet content
            sheetContent(contentViewModel)


        }
    }
}
