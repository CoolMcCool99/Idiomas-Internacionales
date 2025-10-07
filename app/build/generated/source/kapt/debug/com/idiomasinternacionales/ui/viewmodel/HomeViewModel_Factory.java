package com.idiomasinternacionales.ui.viewmodel;

import com.idiomasinternacionales.domain.usecase.CreateRutaAprendizajeUseCase;
import com.idiomasinternacionales.domain.usecase.GetRutasAprendizajeUseCase;
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<GetRutasAprendizajeUseCase> getRutasAprendizajeUseCaseProvider;

  private final Provider<CreateRutaAprendizajeUseCase> createRutaAprendizajeUseCaseProvider;

  public HomeViewModel_Factory(
      Provider<GetRutasAprendizajeUseCase> getRutasAprendizajeUseCaseProvider,
      Provider<CreateRutaAprendizajeUseCase> createRutaAprendizajeUseCaseProvider) {
    this.getRutasAprendizajeUseCaseProvider = getRutasAprendizajeUseCaseProvider;
    this.createRutaAprendizajeUseCaseProvider = createRutaAprendizajeUseCaseProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(getRutasAprendizajeUseCaseProvider.get(), createRutaAprendizajeUseCaseProvider.get());
  }

  public static HomeViewModel_Factory create(
      Provider<GetRutasAprendizajeUseCase> getRutasAprendizajeUseCaseProvider,
      Provider<CreateRutaAprendizajeUseCase> createRutaAprendizajeUseCaseProvider) {
    return new HomeViewModel_Factory(getRutasAprendizajeUseCaseProvider, createRutaAprendizajeUseCaseProvider);
  }

  public static HomeViewModel newInstance(GetRutasAprendizajeUseCase getRutasAprendizajeUseCase,
      CreateRutaAprendizajeUseCase createRutaAprendizajeUseCase) {
    return new HomeViewModel(getRutasAprendizajeUseCase, createRutaAprendizajeUseCase);
  }
}
