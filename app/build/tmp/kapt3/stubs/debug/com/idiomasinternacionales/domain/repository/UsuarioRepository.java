package com.idiomasinternacionales.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\tH&J\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lcom/idiomasinternacionales/domain/repository/UsuarioRepository;", "", "deleteAllUsuarios", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUsuarioById", "Lkotlinx/coroutines/flow/Flow;", "Lcom/idiomasinternacionales/model/Usuario;", "id", "", "insertUsuario", "usuario", "(Lcom/idiomasinternacionales/model/Usuario;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUsuario", "app_debug"})
public abstract interface UsuarioRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertUsuario(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.Usuario usuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateUsuario(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.Usuario usuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.idiomasinternacionales.model.Usuario> getUsuarioById(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAllUsuarios(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}