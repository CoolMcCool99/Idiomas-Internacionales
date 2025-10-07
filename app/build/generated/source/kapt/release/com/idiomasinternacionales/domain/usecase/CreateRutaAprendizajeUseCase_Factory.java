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
public final class CreateRutaAprendizajeUseCase_Factory implements Factory<CreateRutaAprendizajeUseCase> {
  private final Provider<RutaAprendizajeRepository> rutaAprendizajeRepositoryProvider;

  public CreateRutaAprendizajeUseCase_Factory(
      Provider<RutaAprendizajeRepository> rutaAprendizajeRepositoryProvider) {
    this.rutaAprendizajeRepositoryProvider = rutaAprendizajeRepositoryProvider;
  }

  @Override
  public CreateRutaAprendizajeUseCase get() {
    return newInstance(rutaAprendizajeRepositoryProvider.get());
  }

  public static CreateRutaAprendizajeUseCase_Factory create(
      Provider<RutaAprendizajeRepository> rutaAprendizajeRepositoryProvider) {
    return new CreateRutaAprendizajeUseCase_Factory(rutaAprendizajeRepositoryProvider);
  }

  public static CreateRutaAprendizajeUseCase newInstance(
      RutaAprendizajeRepository rutaAprendizajeRepository) {
    return new CreateRutaAprendizajeUseCase(rutaAprendizajeRepository);
  }
}
