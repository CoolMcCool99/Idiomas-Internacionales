package com.idiomasinternacionales.presentation.viewmodel;

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
public final class ModuloViewModel_Factory implements Factory<ModuloViewModel> {
  private final Provider<GetRutasAprendizajeUseCase> getRutasAprendizajeProvider;

  public ModuloViewModel_Factory(Provider<GetRutasAprendizajeUseCase> getRutasAprendizajeProvider) {
    this.getRutasAprendizajeProvider = getRutasAprendizajeProvider;
  }

  @Override
  public ModuloViewModel get() {
    return newInstance(getRutasAprendizajeProvider.get());
  }

  public static ModuloViewModel_Factory create(
      Provider<GetRutasAprendizajeUseCase> getRutasAprendizajeProvider) {
    return new ModuloViewModel_Factory(getRutasAprendizajeProvider);
  }

  public static ModuloViewModel newInstance(GetRutasAprendizajeUseCase getRutasAprendizaje) {
    return new ModuloViewModel(getRutasAprendizaje);
  }
}
