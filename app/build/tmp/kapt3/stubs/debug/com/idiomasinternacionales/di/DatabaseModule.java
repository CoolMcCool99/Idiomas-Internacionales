package com.idiomasinternacionales.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/idiomasinternacionales/di/DatabaseModule;", "", "()V", "provideDatabase", "Lcom/idiomasinternacionales/data/local/AppDatabase;", "context", "Landroid/content/Context;", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideRutaAprendizajeDao", "Lcom/idiomasinternacionales/data/local/dao/RutaAprendizajeDao;", "database", "provideUsuarioDao", "Lcom/idiomasinternacionales/data/local/dao/UsuarioDao;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DatabaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.idiomasinternacionales.di.DatabaseModule INSTANCE = null;
    
    private DatabaseModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.data.local.AppDatabase provideDatabase(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.data.local.dao.UsuarioDao provideUsuarioDao(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.data.local.AppDatabase database) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.idiomasinternacionales.data.local.dao.RutaAprendizajeDao provideRutaAprendizajeDao(@org.jetbrains.annotations.NotNull()
    com.idiomasinternacionales.data.local.AppDatabase database) {
        return null;
    }
}