package com.idiomasinternacionales.data.repository;

import com.idiomasinternacionales.data.local.dao.RutaAprendizajeDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class RutaAprendizajeRepositoryImpl_Factory implements Factory<RutaAprendizajeRepositoryImpl> {
  private final Provider<RutaAprendizajeDao> rutaAprendizajeDaoProvider;

  public RutaAprendizajeRepositoryImpl_Factory(
      Provider<RutaAprendizajeDao> rutaAprendizajeDaoProvider) {
    this.rutaAprendizajeDaoProvider = rutaAprendizajeDaoProvider;
  }

  @Override
  public RutaAprendizajeRepositoryImpl get() {
    return newInstance(rutaAprendizajeDaoProvider.get());
  }

  public static RutaAprendizajeRepositoryImpl_Factory create(
      Provider<RutaAprendizajeDao> rutaAprendizajeDaoProvider) {
    return new RutaAprendizajeRepositoryImpl_Factory(rutaAprendizajeDaoProvider);
  }

  public static RutaAprendizajeRepositoryImpl newInstance(RutaAprendizajeDao rutaAprendizajeDao) {
    return new RutaAprendizajeRepositoryImpl(rutaAprendizajeDao);
  }
}
