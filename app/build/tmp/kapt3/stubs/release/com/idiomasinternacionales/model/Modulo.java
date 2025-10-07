package com.idiomasinternacionales.model;

/**
 * Módulo de aprendizaje.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006#"}, d2 = {"Lcom/idiomasinternacionales/model/Modulo;", "Ljava/io/Serializable;", "id", "", "tipo", "Lcom/idiomasinternacionales/model/TipoModulo;", "lecciones", "", "Lcom/idiomasinternacionales/model/Leccion;", "progreso", "Lcom/idiomasinternacionales/model/ProgresoModulo;", "descripcion", "(Ljava/lang/String;Lcom/idiomasinternacionales/model/TipoModulo;Ljava/util/List;Lcom/idiomasinternacionales/model/ProgresoModulo;Ljava/lang/String;)V", "getDescripcion", "()Ljava/lang/String;", "getId", "getLecciones", "()Ljava/util/List;", "getProgreso", "()Lcom/idiomasinternacionales/model/ProgresoModulo;", "getTipo", "()Lcom/idiomasinternacionales/model/TipoModulo;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"})
public final class Modulo implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final com.idiomasinternacionales.model.TipoModulo tipo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.idiomasinternacionales.model.Leccion> lecciones = null;
    @org.jetbrains.annotations.NotNull()
    private final com.idiomasinternacionales.model.ProgresoModulo progreso = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String descripcion = null;
    
    public Modulo(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.TipoModulo tipo, @org.jetbrains.annotations.NotNull()
    java.util.List<com.idiomasinternacionales.model.Leccion> lecciones, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.ProgresoModulo progreso, @org.jetbrains.annotations.NotNull()
    java.lang.String descripcion) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.TipoModulo getTipo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.idiomasinternacionales.model.Leccion> getLecciones() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.ProgresoModulo getProgreso() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescripcion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.TipoModulo component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.idiomasinternacionales.model.Leccion> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.ProgresoModulo component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.Modulo copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.TipoModulo tipo, @org.jetbrains.annotations.NotNull()
    java.util.List<com.idiomasinternacionales.model.Leccion> lecciones, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.ProgresoModulo progreso, @org.jetbrains.annotations.NotNull()
    java.lang.String descripcion) {
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