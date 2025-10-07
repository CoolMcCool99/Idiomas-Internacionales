package com.idiomasinternacionales.presentation.viewmodel;

import com.idiomasinternacionales.domain.usecase.GetUsuarioUseCase;
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
public final class GamificacionViewModel_Factory implements Factory<GamificacionViewModel> {
  private final Provider<GetUsuarioUseCase> getUsuarioProvider;

  public GamificacionViewModel_Factory(Provider<GetUsuarioUseCase> getUsuarioProvider) {
    this.getUsuarioProvider = getUsuarioProvider;
  }

  @Override
  public GamificacionViewModel get() {
    return newInstance(getUsuarioProvider.get());
  }

  public static GamificacionViewModel_Factory create(
      Provider<GetUsuarioUseCase> getUsuarioProvider) {
    return new GamificacionViewModel_Factory(getUsuarioProvider);
  }

  public static GamificacionViewModel newInstance(GetUsuarioUseCase getUsuario) {
    return new GamificacionViewModel(getUsuario);
  }
}
