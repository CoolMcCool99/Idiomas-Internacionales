package com.idiomasinternacionales.presentation.viewmodel;

import com.idiomasinternacionales.domain.usecase.GenerarRutaPersonalizadaUseCase;
import com.idiomasinternacionales.domain.usecase.ObtenerFeedbackPronunciacionUseCase;
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
public final class IAViewModel_Factory implements Factory<IAViewModel> {
  private final Provider<ObtenerFeedbackPronunciacionUseCase> obtenerFeedbackProvider;

  private final Provider<GenerarRutaPersonalizadaUseCase> generarRutaProvider;

  public IAViewModel_Factory(Provider<ObtenerFeedbackPronunciacionUseCase> obtenerFeedbackProvider,
      Provider<GenerarRutaPersonalizadaUseCase> generarRutaProvider) {
    this.obtenerFeedbackProvider = obtenerFeedbackProvider;
    this.generarRutaProvider = generarRutaProvider;
  }

  @Override
  public IAViewModel get() {
    return newInstance(obtenerFeedbackProvider.get(), generarRutaProvider.get());
  }

  public static IAViewModel_Factory create(
      Provider<ObtenerFeedbackPronunciacionUseCase> obtenerFeedbackProvider,
      Provider<GenerarRutaPersonalizadaUseCase> generarRutaProvider) {
    return new IAViewModel_Factory(obtenerFeedbackProvider, generarRutaProvider);
  }

  public static IAViewModel newInstance(ObtenerFeedbackPronunciacionUseCase obtenerFeedback,
      GenerarRutaPersonalizadaUseCase generarRuta) {
    return new IAViewModel(obtenerFeedback, generarRuta);
  }
}
