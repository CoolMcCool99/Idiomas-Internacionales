package com.idiomasinternacionales.model;

/**
 * Representa el contenido de una lección.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/idiomasinternacionales/model/ContenidoLeccion;", "Ljava/io/Serializable;", "()V", "Escucha", "Flashcard", "OpcionMultiple", "RellenarHuecos", "Lcom/idiomasinternacionales/model/ContenidoLeccion$Escucha;", "Lcom/idiomasinternacionales/model/ContenidoLeccion$Flashcard;", "Lcom/idiomasinternacionales/model/ContenidoLeccion$OpcionMultiple;", "Lcom/idiomasinternacionales/model/ContenidoLeccion$RellenarHuecos;", "app_debug"})
public abstract class ContenidoLeccion implements java.io.Serializable {
    
    private ContenidoLeccion() {
        super();
    }
    
    /**
     * Ejercicio de escucha.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/idiomasinternacionales/model/ContenidoLeccion$Escucha;", "Lcom/idiomasinternacionales/model/ContenidoLeccion;", "urlAudio", "", "pregunta", "respuesta", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPregunta", "()Ljava/lang/String;", "getRespuesta", "getUrlAudio", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Escucha extends com.idiomasinternacionales.model.ContenidoLeccion {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String urlAudio = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String pregunta = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String respuesta = null;
        
        public Escucha(@org.jetbrains.annotations.NotNull()
        java.lang.String urlAudio, @org.jetbrains.annotations.NotNull()
        java.lang.String pregunta, @org.jetbrains.annotations.NotNull()
        java.lang.String respuesta) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrlAudio() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPregunta() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRespuesta() {
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
        public final com.idiomasinternacionales.model.ContenidoLeccion.Escucha copy(@org.jetbrains.annotations.NotNull()
        java.lang.String urlAudio, @org.jetbrains.annotations.NotNull()
        java.lang.String pregunta, @org.jetbrains.annotations.NotNull()
        java.lang.String respuesta) {
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
    
    /**
     * Flashcard: pregunta/respuesta simple.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/idiomasinternacionales/model/ContenidoLeccion$Flashcard;", "Lcom/idiomasinternacionales/model/ContenidoLeccion;", "pregunta", "", "respuesta", "(Ljava/lang/String;Ljava/lang/String;)V", "getPregunta", "()Ljava/lang/String;", "getRespuesta", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Flashcard extends com.idiomasinternacionales.model.ContenidoLeccion {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String pregunta = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String respuesta = null;
        
        public Flashcard(@org.jetbrains.annotations.NotNull()
        java.lang.String pregunta, @org.jetbrains.annotations.NotNull()
        java.lang.String respuesta) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPregunta() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRespuesta() {
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
        public final com.idiomasinternacionales.model.ContenidoLeccion.Flashcard copy(@org.jetbrains.annotations.NotNull()
        java.lang.String pregunta, @org.jetbrains.annotations.NotNull()
        java.lang.String respuesta) {
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
    
    /**
     * Opción múltiple.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/idiomasinternacionales/model/ContenidoLeccion$OpcionMultiple;", "Lcom/idiomasinternacionales/model/ContenidoLeccion;", "pregunta", "", "opciones", "", "respuestaCorrecta", "", "(Ljava/lang/String;Ljava/util/List;I)V", "getOpciones", "()Ljava/util/List;", "getPregunta", "()Ljava/lang/String;", "getRespuestaCorrecta", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
    public static final class OpcionMultiple extends com.idiomasinternacionales.model.ContenidoLeccion {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String pregunta = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> opciones = null;
        private final int respuestaCorrecta = 0;
        
        public OpcionMultiple(@org.jetbrains.annotations.NotNull()
        java.lang.String pregunta, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> opciones, int respuestaCorrecta) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPregunta() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getOpciones() {
            return null;
        }
        
        public final int getRespuestaCorrecta() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component2() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.idiomasinternacionales.model.ContenidoLeccion.OpcionMultiple copy(@org.jetbrains.annotations.NotNull()
        java.lang.String pregunta, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> opciones, int respuestaCorrecta) {
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
    
    /**
     * Ejercicio de rellenar huecos.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J3\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/idiomasinternacionales/model/ContenidoLeccion$RellenarHuecos;", "Lcom/idiomasinternacionales/model/ContenidoLeccion;", "frase", "", "huecos", "", "respuestas", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getFrase", "()Ljava/lang/String;", "getHuecos", "()Ljava/util/List;", "getRespuestas", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class RellenarHuecos extends com.idiomasinternacionales.model.ContenidoLeccion {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String frase = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> huecos = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> respuestas = null;
        
        public RellenarHuecos(@org.jetbrains.annotations.NotNull()
        java.lang.String frase, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> huecos, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> respuestas) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFrase() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getHuecos() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getRespuestas() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.idiomasinternacionales.model.ContenidoLeccion.RellenarHuecos copy(@org.jetbrains.annotations.NotNull()
        java.lang.String frase, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> huecos, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> respuestas) {
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
}