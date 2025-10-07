package com.idiomasinternacionales.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lcom/idiomasinternacionales/domain/repository/RutaAprendizajeRepository;", "", "getAllRutasAprendizaje", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/idiomasinternacionales/model/RutaAprendizaje;", "getRutaAprendizajeById", "rutaId", "", "insertRutaAprendizaje", "", "ruta", "(Lcom/idiomasinternacionales/model/RutaAprendizaje;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRutaAprendizaje", "app_release"})
public abstract interface RutaAprendizajeRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertRutaAprendizaje(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.RutaAprendizaje ruta, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateRutaAprendizaje(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.RutaAprendizaje ruta, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.idiomasinternacionales.model.RutaAprendizaje> getRutaAprendizajeById(@org.jetbrains.annotations.NotNull()
    java.lang.String rutaId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.idiomasinternacionales.model.RutaAprendizaje>> getAllRutasAprendizaje();
}