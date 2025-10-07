package com.idiomasinternacionales.di;

import com.idiomasinternacionales.data.local.AppDatabase;
import com.idiomasinternacionales.data.local.dao.RutaAprendizajeDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DatabaseModule_ProvideRutaAprendizajeDaoFactory implements Factory<RutaAprendizajeDao> {
  private final Provider<AppDatabase> databaseProvider;

  public DatabaseModule_ProvideRutaAprendizajeDaoFactory(Provider<AppDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public RutaAprendizajeDao get() {
    return provideRutaAprendizajeDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvideRutaAprendizajeDaoFactory create(
      Provider<AppDatabase> databaseProvider) {
    return new DatabaseModule_ProvideRutaAprendizajeDaoFactory(databaseProvider);
  }

  public static RutaAprendizajeDao provideRutaAprendizajeDao(AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideRutaAprendizajeDao(database));
  }
}
