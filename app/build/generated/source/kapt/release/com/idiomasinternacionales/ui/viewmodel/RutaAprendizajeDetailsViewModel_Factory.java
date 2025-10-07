package com.idiomasinternacionales.ui.viewmodel;

import com.idiomasinternacionales.domain.usecase.GetRutaAprendizajeDetailsUseCase;
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
public final class RutaAprendizajeDetailsViewModel_Factory implements Factory<RutaAprendizajeDetailsViewModel> {
  private final Provider<GetRutaAprendizajeDetailsUseCase> getRutaAprendizajeDetailsUseCaseProvider;

  public RutaAprendizajeDetailsViewModel_Factory(
      Provider<GetRutaAprendizajeDetailsUseCase> getRutaAprendizajeDetailsUseCaseProvider) {
    this.getRutaAprendizajeDetailsUseCaseProvider = getRutaAprendizajeDetailsUseCaseProvider;
  }

  @Override
  public RutaAprendizajeDetailsViewModel get() {
    return newInstance(getRutaAprendizajeDetailsUseCaseProvider.get());
  }

  public static RutaAprendizajeDetailsViewModel_Factory create(
      Provider<GetRutaAprendizajeDetailsUseCase> getRutaAprendizajeDetailsUseCaseProvider) {
    return new RutaAprendizajeDetailsViewModel_Factory(getRutaAprendizajeDetailsUseCaseProvider);
  }

  public static RutaAprendizajeDetailsViewModel newInstance(
      GetRutaAprendizajeDetailsUseCase getRutaAprendizajeDetailsUseCase) {
    return new RutaAprendizajeDetailsViewModel(getRutaAprendizajeDetailsUseCase);
  }
}
