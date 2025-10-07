package com.idiomasinternacionales.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/idiomasinternacionales/data/repository/RutaAprendizajeRepositoryImpl;", "Lcom/idiomasinternacionales/domain/repository/RutaAprendizajeRepository;", "rutaAprendizajeDao", "Lcom/idiomasinternacionales/data/local/dao/RutaAprendizajeDao;", "(Lcom/idiomasinternacionales/data/local/dao/RutaAprendizajeDao;)V", "getAllRutasAprendizaje", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/idiomasinternacionales/model/RutaAprendizaje;", "getRutaAprendizajeById", "rutaId", "", "insertRutaAprendizaje", "", "ruta", "(Lcom/idiomasinternacionales/model/RutaAprendizaje;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRutaAprendizaje", "app_release"})
public final class RutaAprendizajeRepositoryImpl implements com.idiomasinternacionales.domain.repository.RutaAprendizajeRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.idiomasinternacionales.data.local.dao.RutaAprendizajeDao rutaAprendizajeDao = null;
    
    @javax.inject.Inject()
    public RutaAprendizajeRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.data.local.dao.RutaAprendizajeDao rutaAprendizajeDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertRutaAprendizaje(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.RutaAprendizaje ruta, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateRutaAprendizaje(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.RutaAprendizaje ruta, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<com.idiomasinternacionales.model.RutaAprendizaje> getRutaAprendizajeById(@org.jetbrains.annotations.NotNull()
    java.lang.String rutaId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.idiomasinternacionales.model.RutaAprendizaje>> getAllRutasAprendizaje() {
        return null;
    }
}