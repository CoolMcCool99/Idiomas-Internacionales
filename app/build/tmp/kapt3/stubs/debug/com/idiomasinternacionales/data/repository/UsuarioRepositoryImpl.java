package com.idiomasinternacionales.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/idiomasinternacionales/data/repository/UsuarioRepositoryImpl;", "Lcom/idiomasinternacionales/domain/repository/UsuarioRepository;", "usuarioDao", "Lcom/idiomasinternacionales/data/local/dao/UsuarioDao;", "(Lcom/idiomasinternacionales/data/local/dao/UsuarioDao;)V", "deleteAllUsuarios", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUsuarioById", "Lkotlinx/coroutines/flow/Flow;", "Lcom/idiomasinternacionales/model/Usuario;", "id", "", "insertUsuario", "usuario", "(Lcom/idiomasinternacionales/model/Usuario;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUsuario", "app_debug"})
public final class UsuarioRepositoryImpl implements com.idiomasinternacionales.domain.repository.UsuarioRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.idiomasinternacionales.data.local.dao.UsuarioDao usuarioDao = null;
    
    @javax.inject.Inject()
    public UsuarioRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.data.local.dao.UsuarioDao usuarioDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertUsuario(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.Usuario usuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateUsuario(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.Usuario usuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<com.idiomasinternacionales.model.Usuario> getUsuarioById(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteAllUsuarios(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}