package com.idiomasinternacionales.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/idiomasinternacionales/ui/viewmodel/LoginState;", "", "()V", "Loading", "Success", "Lcom/idiomasinternacionales/ui/viewmodel/LoginState$Loading;", "Lcom/idiomasinternacionales/ui/viewmodel/LoginState$Success;", "app_debug"})
public abstract class LoginState {
    
    private LoginState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/idiomasinternacionales/ui/viewmodel/LoginState$Loading;", "Lcom/idiomasinternacionales/ui/viewmodel/LoginState;", "()V", "app_debug"})
    public static final class Loading extends com.idiomasinternacionales.ui.viewmodel.LoginState {
        @org.jetbrains.annotations.NotNull()
        public static final com.idiomasinternacionales.ui.viewmodel.LoginState.Loading INSTANCE = null;
        
        private Loading() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/idiomasinternacionales/ui/viewmodel/LoginState$Success;", "Lcom/idiomasinternacionales/ui/viewmodel/LoginState;", "()V", "app_debug"})
    public static final class Success extends com.idiomasinternacionales.ui.viewmodel.LoginState {
        @org.jetbrains.annotations.NotNull()
        public static final com.idiomasinternacionales.ui.viewmodel.LoginState.Success INSTANCE = null;
        
        private Success() {
        }
    }
}