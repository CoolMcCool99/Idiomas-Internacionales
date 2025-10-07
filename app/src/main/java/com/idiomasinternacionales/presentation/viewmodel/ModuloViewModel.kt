package com.idiomasinternacionales.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.idiomasinternacionales.model.Modulo
import com.idiomasinternacionales.model.TipoModulo
import com.idiomasinternacionales.domain.usecase.GetRutasAprendizajeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ModuloViewModel @Inject constructor(
    private val getRutasAprendizaje: GetRutasAprendizajeUseCase
) : ViewModel() {
    private val _modulos = MutableStateFlow<List<Modulo>>(emptyList())
    val modulos: StateFlow<List<Modulo>> = _modulos

    fun cargarModulos() {
        viewModelScope.launch {
            getRutasAprendizaje().collect { rutas ->
                _modulos.value = rutas.flatMap { it.modulos }
            }
        }
    }

    fun cargarModuloPorTipo(tipo: TipoModulo) {
        viewModelScope.launch {
            getRutasAprendizaje().collect { rutas ->
                _modulos.value = rutas.flatMap { it.modulos }.filter { it.tipo == tipo }
            }
        }
    }
}
