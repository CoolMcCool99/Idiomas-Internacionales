package com.idiomasinternacionales.domain.usecase;

import com.idiomasinternacionales.domain.repository.RutaAprendizajeRepository;
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
public final class GetRutasAprendizajeUseCase_Factory implements Factory<GetRutasAprendizajeUseCase> {
  private final Provider<RutaAprendizajeRepository> rutaAprendizajeRepositoryProvider;

  public GetRutasAprendizajeUseCase_Factory(
      Provider<RutaAprendizajeRepository> rutaAprendizajeRepositoryProvider) {
    this.rutaAprendizajeRepositoryProvider = rutaAprendizajeRepositoryProvider;
  }

  @Override
  public GetRutasAprendizajeUseCase get() {
    return newInstance(rutaAprendizajeRepositoryProvider.get());
  }

  public static GetRutasAprendizajeUseCase_Factory create(
      Provider<RutaAprendizajeRepository> rutaAprendizajeRepositoryProvider) {
    return new GetRutasAprendizajeUseCase_Factory(rutaAprendizajeRepositoryProvider);
  }

  public static GetRutasAprendizajeUseCase newInstance(
      RutaAprendizajeRepository rutaAprendizajeRepository) {
    return new GetRutasAprendizajeUseCase(rutaAprendizajeRepository);
  }
}
