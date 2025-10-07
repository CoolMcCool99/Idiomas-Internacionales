package com.idiomasinternacionales.model;

/**
 * Lección individual dentro de un módulo.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\nH\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013JN\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006("}, d2 = {"Lcom/idiomasinternacionales/model/Leccion;", "Ljava/io/Serializable;", "id", "", "tipo", "Lcom/idiomasinternacionales/model/TipoLeccion;", "contenido", "Lcom/idiomasinternacionales/model/ContenidoLeccion;", "retroalimentacion", "completada", "", "fechaCompletada", "", "(Ljava/lang/String;Lcom/idiomasinternacionales/model/TipoLeccion;Lcom/idiomasinternacionales/model/ContenidoLeccion;Ljava/lang/String;ZLjava/lang/Long;)V", "getCompletada", "()Z", "getContenido", "()Lcom/idiomasinternacionales/model/ContenidoLeccion;", "getFechaCompletada", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "()Ljava/lang/String;", "getRetroalimentacion", "getTipo", "()Lcom/idiomasinternacionales/model/TipoLeccion;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/idiomasinternacionales/model/TipoLeccion;Lcom/idiomasinternacionales/model/ContenidoLeccion;Ljava/lang/String;ZLjava/lang/Long;)Lcom/idiomasinternacionales/model/Leccion;", "equals", "other", "", "hashCode", "", "toString", "app_release"})
public final class Leccion implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final com.idiomasinternacionales.model.TipoLeccion tipo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.idiomasinternacionales.model.ContenidoLeccion contenido = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String retroalimentacion = null;
    private final boolean completada = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long fechaCompletada = null;
    
    public Leccion(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.TipoLeccion tipo, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.ContenidoLeccion contenido, @org.jetbrains.annotations.Nullable()
    java.lang.String retroalimentacion, boolean completada, @org.jetbrains.annotations.Nullable()
    java.lang.Long fechaCompletada) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.TipoLeccion getTipo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.ContenidoLeccion getContenido() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRetroalimentacion() {
        return null;
    }
    
    public final boolean getCompletada() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getFechaCompletada() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.TipoLeccion component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.ContenidoLeccion component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.Leccion copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.TipoLeccion tipo, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.ContenidoLeccion contenido, @org.jetbrains.annotations.Nullable()
    java.lang.String retroalimentacion, boolean completada, @org.jetbrains.annotations.Nullable()
    java.lang.Long fechaCompletada) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}