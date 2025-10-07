package com.idiomasinternacionales.presentation.viewmodel;

import com.idiomasinternacionales.domain.usecase.GetUsuarioUseCase;
import com.idiomasinternacionales.domain.usecase.SaveUsuarioUseCase;
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
public final class PerfilViewModel_Factory implements Factory<PerfilViewModel> {
  private final Provider<GetUsuarioUseCase> getUsuarioProvider;

  private final Provider<SaveUsuarioUseCase> saveUsuarioProvider;

  public PerfilViewModel_Factory(Provider<GetUsuarioUseCase> getUsuarioProvider,
      Provider<SaveUsuarioUseCase> saveUsuarioProvider) {
    this.getUsuarioProvider = getUsuarioProvider;
    this.saveUsuarioProvider = saveUsuarioProvider;
  }

  @Override
  public PerfilViewModel get() {
    return newInstance(getUsuarioProvider.get(), saveUsuarioProvider.get());
  }

  public static PerfilViewModel_Factory create(Provider<GetUsuarioUseCase> getUsuarioProvider,
      Provider<SaveUsuarioUseCase> saveUsuarioProvider) {
    return new PerfilViewModel_Factory(getUsuarioProvider, saveUsuarioProvider);
  }

  public static PerfilViewModel newInstance(GetUsuarioUseCase getUsuario,
      SaveUsuarioUseCase saveUsuario) {
    return new PerfilViewModel(getUsuario, saveUsuario);
  }
}
