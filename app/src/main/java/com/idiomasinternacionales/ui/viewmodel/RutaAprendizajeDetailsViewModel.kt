package com.idiomasinternacionales.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.idiomasinternacionales.model.RutaAprendizaje
import com.idiomasinternacionales.domain.usecase.GetRutaAprendizajeDetailsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RutaAprendizajeDetailsViewModel @Inject constructor(
    private val getRutaAprendizajeDetailsUseCase: GetRutaAprendizajeDetailsUseCase
) : ViewModel() {

    private val _rutaAprendizajeDetails = MutableStateFlow<RutaAprendizaje?>(null)
    val rutaAprendizajeDetails: StateFlow<RutaAprendizaje?> = _rutaAprendizajeDetails

    fun loadRutaAprendizajeDetails(rutaId: String) {
        viewModelScope.launch {
            getRutaAprendizajeDetailsUseCase(rutaId).collect {
                _rutaAprendizajeDetails.value = it
            }
        }
    }
}
