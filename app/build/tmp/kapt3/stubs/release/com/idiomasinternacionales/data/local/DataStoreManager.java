package com.idiomasinternacionales.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0005H\u0086@\u00a2\u0006\u0002\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0005H\u0086@\u00a2\u0006\u0002\u0010\u001aJ\u001e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u001fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007\u00a8\u0006 "}, d2 = {"Lcom/idiomasinternacionales/data/local/DataStoreManager;", "", "()V", "FUENTE_DISLEXIA", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getFUENTE_DISLEXIA", "()Landroidx/datastore/preferences/core/Preferences$Key;", "IDIOMA_META", "", "getIDIOMA_META", "MODO_OSCURO", "getMODO_OSCURO", "TAMANO_TEXTO", "", "getTAMANO_TEXTO", "getFuenteDislexia", "Lkotlinx/coroutines/flow/Flow;", "context", "Landroid/content/Context;", "getIdiomaMeta", "getModoOscuro", "getTamanoTexto", "setFuenteDislexia", "", "value", "(Landroid/content/Context;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setIdiomaMeta", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setModoOscuro", "setTamanoTexto", "(Landroid/content/Context;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class DataStoreManager {
    @org.jetbrains.annotations.NotNull()
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> MODO_OSCURO = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> FUENTE_DISLEXIA = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Float> TAMANO_TEXTO = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> IDIOMA_META = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.idiomasinternacionales.data.local.DataStoreManager INSTANCE = null;
    
    private DataStoreManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> getMODO_OSCURO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> getFUENTE_DISLEXIA() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Float> getTAMANO_TEXTO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getIDIOMA_META() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setModoOscuro(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getModoOscuro(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setFuenteDislexia(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getFuenteDislexia(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setTamanoTexto(@org.jetbrains.annotations.NotNull()
    android.content.Context context, float value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Float> getTamanoTexto(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setIdiomaMeta(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getIdiomaMeta(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}