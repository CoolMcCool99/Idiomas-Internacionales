package com.idiomasinternacionales.data.ia;

/**
 * Servicio para integración de IA (pronunciación y rutas personalizadas).
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/idiomasinternacionales/data/ia/IAService;", "", "generarRutaPersonalizada", "", "usuario", "Lcom/idiomasinternacionales/model/Usuario;", "(Lcom/idiomasinternacionales/model/Usuario;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "obtenerFeedbackPronunciacion", "audioUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface IAService {
    
    /**
     * Obtiene feedback fonético de la pronunciación del usuario.
     * @param audioUrl URL del audio a analizar.
     * @return Feedback textual.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object obtenerFeedbackPronunciacion(@org.jetbrains.annotations.NotNull()
    java.lang.String audioUrl, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion);
    
    /**
     * Genera una ruta de aprendizaje personalizada usando IA.
     * @param usuario Usuario para el que se genera la ruta.
     * @return Descripción de la ruta generada.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object generarRutaPersonalizada(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.model.Usuario usuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion);
}