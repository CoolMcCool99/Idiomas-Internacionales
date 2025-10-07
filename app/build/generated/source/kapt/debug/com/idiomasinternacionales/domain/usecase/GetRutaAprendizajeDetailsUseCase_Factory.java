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
public final class GetRutaAprendizajeDetailsUseCase_Factory implements Factory<GetRutaAprendizajeDetailsUseCase> {
  private final Provider<RutaAprendizajeRepository> rutaAprendizajeRepositoryProvider;

  public GetRutaAprendizajeDetailsUseCase_Factory(
      Provider<RutaAprendizajeRepository> rutaAprendizajeRepositoryProvider) {
    this.rutaAprendizajeRepositoryProvider = rutaAprendizajeRepositoryProvider;
  }

  @Override
  public GetRutaAprendizajeDetailsUseCase get() {
    return newInstance(rutaAprendizajeRepositoryProvider.get());
  }

  public static GetRutaAprendizajeDetailsUseCase_Factory create(
      Provider<RutaAprendizajeRepository> rutaAprendizajeRepositoryProvider) {
    return new GetRutaAprendizajeDetailsUseCase_Factory(rutaAprendizajeRepositoryProvider);
  }

  public static GetRutaAprendizajeDetailsUseCase newInstance(
      RutaAprendizajeRepository rutaAprendizajeRepository) {
    return new GetRutaAprendizajeDetailsUseCase(rutaAprendizajeRepository);
  }
}
