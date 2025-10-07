package com.idiomasinternacionales.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.idiomasinternacionales.model.Leccion
import com.idiomasinternacionales.domain.usecase.GetRutasAprendizajeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LeccionViewModel @Inject constructor(
    private val getRutasAprendizaje: GetRutasAprendizajeUseCase
) : ViewModel() {
    private val _lecciones = MutableStateFlow<List<Leccion>>(emptyList())
    val lecciones: StateFlow<List<Leccion>> = _lecciones

    fun cargarLecciones(moduloId: String) {
        viewModelScope.launch {
            getRutasAprendizaje().collect { rutas ->
                val modulo = rutas.flatMap { it.modulos }.find { it.id == moduloId }
                _lecciones.value = modulo?.lecciones ?: emptyList()
            }
        }
    }
}
