package com.idiomasinternacionales.model;

/**
 * Modelo principal de usuario.
 * @property id Identificador único.
 * @property nombre Nombre del usuario.
 * @property email Correo electrónico.
 * @property idiomaMeta Idioma objetivo.
 * @property nivel Nivel actual del usuario.
 * @property progreso Progreso global.
 * @property preferencias Preferencias de aprendizaje.
 * @property estadisticas Estadísticas de uso y logros.
 * @property notificaciones Lista de notificaciones.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\bH\u00c6\u0003J\t\u0010\'\u001a\u00020\nH\u00c6\u0003J\t\u0010(\u001a\u00020\fH\u00c6\u0003J\t\u0010)\u001a\u00020\u000eH\u00c6\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003Ji\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u00d6\u0003J\t\u00100\u001a\u000201H\u00d6\u0001J\t\u00102\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u00063"}, d2 = {"Lcom/idiomasinternacionales/model/Usuario;", "Ljava/io/Serializable;", "id", "", "nombre", "email", "idiomaMeta", "nivel", "Lcom/idiomasinternacionales/model/Nivel;", "progreso", "Lcom/idiomasinternacionales/model/Progreso;", "preferencias", "Lcom/idiomasinternacionales/model/Preferencias;", "estadisticas", "Lcom/idiomasinternacionales/model/Estadisticas;", "notificaciones", "", "Lcom/idiomasinternacionales/model/Notificacion;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/idiomasinternacionales/model/Nivel;Lcom/idiomasinternacionales/model/Progreso;Lcom/idiomasinternacionales/model/Preferencias;Lcom/idiomasinternacionales/model/Estadisticas;Ljava/util/List;)V", "getEmail", "()Ljava/lang/String;", "getEstadisticas", "()Lcom/idiomasinternacionales/model/Estadisticas;", "getId", "getIdiomaMeta", "getNivel", "()Lcom/idiomasinternacionales/model/Nivel;", "getNombre", "getNotificaciones", "()Ljava/util/List;", "getPreferencias", "()Lcom/idiomasinternacionales/model/Preferencias;", "getProgreso", "()Lcom/idiomasinternacionales/model/Progreso;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"})
public final class Usuario implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nombre = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idiomaMeta = null;
    @org.jetbrains.annotations.NotNull()
    private final com.idiomasinternacionales.model.Nivel nivel = null;
    @org.jetbrains.annotations.NotNull()
    private final com.idiomasinternacionales.model.Progreso progreso = null;
    @org.jetbrains.annotations.NotNull()
    private final com.idiomasinternacionales.model.Preferencias preferencias = null;
    @org.jetbrains.annotations.NotNull()
    private final com.idiomasinternacionales.model.Estadisticas estadisticas = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.idiomasinternacionales.model.Notificacion> notificaciones = null;
    
    public Usuario(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String idiomaMeta, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.Nivel nivel, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.Progreso progreso, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.Preferencias preferencias, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.Estadisticas estadisticas, @org.jetbrains.annotations.NotNull()
    java.util.List<com.idiomasinternacionales.model.Notificacion> notificaciones) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNombre() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdiomaMeta() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.Nivel getNivel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.Progreso getProgreso() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.Preferencias getPreferencias() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.Estadisticas getEstadisticas() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.idiomasinternacionales.model.Notificacion> getNotificaciones() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.Nivel component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.Progreso component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.Preferencias component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.Estadisticas component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.idiomasinternacionales.model.Notificacion> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.model.Usuario copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String idiomaMeta, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.Nivel nivel, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.Progreso progreso, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.Preferencias preferencias, @org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.Estadisticas estadisticas, @org.jetbrains.annotations.NotNull()
    java.util.List<com.idiomasinternacionales.model.Notificacion> notificaciones) {
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