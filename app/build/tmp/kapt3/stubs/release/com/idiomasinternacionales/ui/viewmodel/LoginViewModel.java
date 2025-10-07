package com.idiomasinternacionales.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/idiomasinternacionales/ui/viewmodel/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "createUsuarioUseCase", "Lcom/idiomasinternacionales/domain/usecase/CreateUsuarioUseCase;", "getUsuarioUseCase", "Lcom/idiomasinternacionales/domain/usecase/GetUsuarioUseCase;", "(Lcom/idiomasinternacionales/domain/usecase/CreateUsuarioUseCase;Lcom/idiomasinternacionales/domain/usecase/GetUsuarioUseCase;)V", "_loginState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/idiomasinternacionales/ui/viewmodel/LoginState;", "loginState", "Lkotlinx/coroutines/flow/StateFlow;", "getLoginState", "()Lkotlinx/coroutines/flow/StateFlow;", "createDefaultUser", "Lcom/idiomasinternacionales/model/Usuario;", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.idiomasinternacionales.domain.usecase.CreateUsuarioUseCase createUsuarioUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.idiomasinternacionales.domain.usecase.GetUsuarioUseCase getUsuarioUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.idiomasinternacionales.ui.viewmodel.LoginState> _loginState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.idiomasinternacionales.ui.viewmodel.LoginState> loginState = null;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.domain.usecase.CreateUsuarioUseCase createUsuarioUseCase, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.domain.usecase.GetUsuarioUseCase getUsuarioUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.idiomasinternacionales.ui.viewmodel.LoginState> getLoginState() {
        return null;
    }
    
    private final com.idiomasinternacionales.model.Usuario createDefaultUser() {
        return null;
    }
}