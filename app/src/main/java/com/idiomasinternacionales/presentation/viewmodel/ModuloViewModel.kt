package com.idiomasinternacionales.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.idiomasinternacionales.domain.model.ModuloAprendizaje
import com.idiomasinternacionales.domain.model.TipoModulo
import com.idiomasinternacionales.domain.usecase.GetModulosUseCase
import com.idiomasinternacionales.domain.usecase.GetModuloPorTipoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ModuloViewModel @Inject constructor(
    private val getModulos: GetModulosUseCase,
    private val getModuloPorTipo: GetModuloPorTipoUseCase
) : ViewModel() {
    private val _modulos = MutableStateFlow<List<ModuloAprendizaje>>(emptyList())
    val modulos: StateFlow<List<ModuloAprendizaje>> = _modulos

    fun cargarModulos() {
        viewModelScope.launch {
            _modulos.value = getModulos()
        }
    }

    fun cargarModuloPorTipo(tipo: TipoModulo) {
        viewModelScope.launch {
            getModuloPorTipo(tipo)?.let {
                _modulos.value = listOf(it)
            }
        }
    }
}
