package com.idiomasinternacionales.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.idiomasinternacionales.domain.model.LeccionInteractiva
import com.idiomasinternacionales.domain.usecase.GetLeccionesPorModuloUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LeccionViewModel @Inject constructor(
    private val getLeccionesPorModulo: GetLeccionesPorModuloUseCase
) : ViewModel() {
    private val _lecciones = MutableStateFlow<List<LeccionInteractiva>>(emptyList())
    val lecciones: StateFlow<List<LeccionInteractiva>> = _lecciones

    fun cargarLecciones(moduloId: String) {
        viewModelScope.launch {
            _lecciones.value = getLeccionesPorModulo(moduloId)
        }
    }
}
