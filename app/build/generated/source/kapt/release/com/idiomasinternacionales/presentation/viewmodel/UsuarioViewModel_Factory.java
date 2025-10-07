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
public final class UsuarioViewModel_Factory implements Factory<UsuarioViewModel> {
  private final Provider<GetUsuarioUseCase> getUsuarioProvider;

  private final Provider<SaveUsuarioUseCase> saveUsuarioProvider;

  public UsuarioViewModel_Factory(Provider<GetUsuarioUseCase> getUsuarioProvider,
      Provider<SaveUsuarioUseCase> saveUsuarioProvider) {
    this.getUsuarioProvider = getUsuarioProvider;
    this.saveUsuarioProvider = saveUsuarioProvider;
  }

  @Override
  public UsuarioViewModel get() {
    return newInstance(getUsuarioProvider.get(), saveUsuarioProvider.get());
  }

  public static UsuarioViewModel_Factory create(Provider<GetUsuarioUseCase> getUsuarioProvider,
      Provider<SaveUsuarioUseCase> saveUsuarioProvider) {
    return new UsuarioViewModel_Factory(getUsuarioProvider, saveUsuarioProvider);
  }

  public static UsuarioViewModel newInstance(GetUsuarioUseCase getUsuario,
      SaveUsuarioUseCase saveUsuario) {
    return new UsuarioViewModel(getUsuario, saveUsuario);
  }
}
