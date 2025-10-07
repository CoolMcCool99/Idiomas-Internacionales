package com.idiomasinternacionales.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/idiomasinternacionales/presentation/viewmodel/LeccionViewModel;", "Landroidx/lifecycle/ViewModel;", "getRutasAprendizaje", "Lcom/idiomasinternacionales/domain/usecase/GetRutasAprendizajeUseCase;", "(Lcom/idiomasinternacionales/domain/usecase/GetRutasAprendizajeUseCase;)V", "_lecciones", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/idiomasinternacionales/model/Leccion;", "lecciones", "Lkotlinx/coroutines/flow/StateFlow;", "getLecciones", "()Lkotlinx/coroutines/flow/StateFlow;", "cargarLecciones", "", "moduloId", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class LeccionViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.idiomasinternacionales.domain.usecase.GetRutasAprendizajeUseCase getRutasAprendizaje = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.idiomasinternacionales.model.Leccion>> _lecciones = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.idiomasinternacionales.model.Leccion>> lecciones = null;
    
    @javax.inject.Inject()
    public LeccionViewModel(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.domain.usecase.GetRutasAprendizajeUseCase getRutasAprendizaje) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.idiomasinternacionales.model.Leccion>> getLecciones() {
        return null;
    }
    
    public final void cargarLecciones(@org.jetbrains.annotations.NotNull()
    java.lang.String moduloId) {
    }
}