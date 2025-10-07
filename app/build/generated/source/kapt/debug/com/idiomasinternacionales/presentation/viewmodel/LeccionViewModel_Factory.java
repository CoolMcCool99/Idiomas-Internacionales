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
public final class LeccionViewModel_Factory implements Factory<LeccionViewModel> {
  private final Provider<GetRutasAprendizajeUseCase> getRutasAprendizajeProvider;

  public LeccionViewModel_Factory(
      Provider<GetRutasAprendizajeUseCase> getRutasAprendizajeProvider) {
    this.getRutasAprendizajeProvider = getRutasAprendizajeProvider;
  }

  @Override
  public LeccionViewModel get() {
    return newInstance(getRutasAprendizajeProvider.get());
  }

  public static LeccionViewModel_Factory create(
      Provider<GetRutasAprendizajeUseCase> getRutasAprendizajeProvider) {
    return new LeccionViewModel_Factory(getRutasAprendizajeProvider);
  }

  public static LeccionViewModel newInstance(GetRutasAprendizajeUseCase getRutasAprendizaje) {
    return new LeccionViewModel(getRutasAprendizaje);
  }
}
