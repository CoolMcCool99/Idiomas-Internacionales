package com.idiomasinternacionales.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/idiomasinternacionales/presentation/viewmodel/PerfilViewModel;", "Landroidx/lifecycle/ViewModel;", "getUsuario", "Lcom/idiomasinternacionales/domain/usecase/GetUsuarioUseCase;", "saveUsuario", "Lcom/idiomasinternacionales/domain/usecase/SaveUsuarioUseCase;", "(Lcom/idiomasinternacionales/domain/usecase/GetUsuarioUseCase;Lcom/idiomasinternacionales/domain/usecase/SaveUsuarioUseCase;)V", "_perfil", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/idiomasinternacionales/model/Usuario;", "perfil", "Lkotlinx/coroutines/flow/StateFlow;", "getPerfil", "()Lkotlinx/coroutines/flow/StateFlow;", "cargarPerfil", "", "id", "", "guardarPerfil", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class PerfilViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.idiomasinternacionales.domain.usecase.GetUsuarioUseCase getUsuario = null;
    @org.jetbrains.annotations.NotNull()
    private final com.idiomasinternacionales.domain.usecase.SaveUsuarioUseCase saveUsuario = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.idiomasinternacionales.model.Usuario> _perfil = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.idiomasinternacionales.model.Usuario> perfil = null;
    
    @javax.inject.Inject()
    public PerfilViewModel(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.domain.usecase.GetUsuarioUseCase getUsuario, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.domain.usecase.SaveUsuarioUseCase saveUsuario) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.idiomasinternacionales.model.Usuario> getPerfil() {
        return null;
    }
    
    public final void cargarPerfil(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final void guardarPerfil(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.Usuario perfil) {
    }
}