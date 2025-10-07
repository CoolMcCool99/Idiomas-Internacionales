package com.idiomasinternacionales.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/idiomasinternacionales/presentation/viewmodel/IAViewModel;", "Landroidx/lifecycle/ViewModel;", "obtenerFeedback", "Lcom/idiomasinternacionales/domain/usecase/ObtenerFeedbackPronunciacionUseCase;", "generarRuta", "Lcom/idiomasinternacionales/domain/usecase/GenerarRutaPersonalizadaUseCase;", "(Lcom/idiomasinternacionales/domain/usecase/ObtenerFeedbackPronunciacionUseCase;Lcom/idiomasinternacionales/domain/usecase/GenerarRutaPersonalizadaUseCase;)V", "_feedback", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_ruta", "feedback", "Lkotlinx/coroutines/flow/StateFlow;", "getFeedback", "()Lkotlinx/coroutines/flow/StateFlow;", "ruta", "getRuta", "generarRutaPersonalizada", "", "usuarioId", "obtenerFeedbackPronunciacion", "audioUrl", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class IAViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.idiomasinternacionales.domain.usecase.ObtenerFeedbackPronunciacionUseCase obtenerFeedback = null;
    @org.jetbrains.annotations.NotNull()
    private final com.idiomasinternacionales.domain.usecase.GenerarRutaPersonalizadaUseCase generarRuta = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _feedback = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> feedback = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _ruta = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> ruta = null;
    
    @javax.inject.Inject()
    public IAViewModel(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.domain.usecase.ObtenerFeedbackPronunciacionUseCase obtenerFeedback, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.domain.usecase.GenerarRutaPersonalizadaUseCase generarRuta) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getFeedback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getRuta() {
        return null;
    }
    
    public final void obtenerFeedbackPronunciacion(@org.jetbrains.annotations.NotNull()
    java.lang.String audioUrl) {
    }
    
    public final void generarRutaPersonalizada(@org.jetbrains.annotations.NotNull()
    java.lang.String usuarioId) {
    }
}