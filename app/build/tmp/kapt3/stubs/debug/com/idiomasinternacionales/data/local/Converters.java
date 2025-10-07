package com.idiomasinternacionales.data.local;

/**
 * Conversores de tipos para Room.
 * Le dice a Room cómo convertir objetos complejos a y desde un formato que pueda almacenar en la base de datos.
 * En este caso, usamos Moshi para serializar/deserializar los objetos a/desde JSON (String).
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/idiomasinternacionales/data/local/Converters;", "", "()V", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "fromEstadisticas", "", "estadisticas", "Lcom/idiomasinternacionales/model/Estadisticas;", "fromNotificacionList", "notificaciones", "", "Lcom/idiomasinternacionales/model/Notificacion;", "fromPreferencias", "preferencias", "Lcom/idiomasinternacionales/model/Preferencias;", "fromProgreso", "progreso", "Lcom/idiomasinternacionales/model/Progreso;", "toEstadisticas", "json", "toNotificacionList", "toPreferencias", "toProgreso", "app_debug"})
public final class Converters {
    private final com.squareup.moshi.Moshi moshi = null;
    
    public Converters() {
        super();
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromProgreso(@org.jetbrains.annotations.Nullable()
    com.idiomasinternacionales.model.Progreso progreso) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final com.idiomasinternacionales.model.Progreso toProgreso(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromPreferencias(@org.jetbrains.annotations.Nullable()
    com.idiomasinternacionales.model.Preferencias preferencias) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final com.idiomasinternacionales.model.Preferencias toPreferencias(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromEstadisticas(@org.jetbrains.annotations.Nullable()
    com.idiomasinternacionales.model.Estadisticas estadisticas) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final com.idiomasinternacionales.model.Estadisticas toEstadisticas(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromNotificacionList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.idiomasinternacionales.model.Notificacion> notificaciones) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.idiomasinternacionales.model.Notificacion> toNotificacionList(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        return null;
    }
}