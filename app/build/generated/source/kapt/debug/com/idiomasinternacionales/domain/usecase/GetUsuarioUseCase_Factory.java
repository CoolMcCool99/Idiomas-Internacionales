package com.idiomasinternacionales.domain.usecase;

import com.idiomasinternacionales.domain.repository.UsuarioRepository;
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
public final class GetUsuarioUseCase_Factory implements Factory<GetUsuarioUseCase> {
  private final Provider<UsuarioRepository> usuarioRepositoryProvider;

  public GetUsuarioUseCase_Factory(Provider<UsuarioRepository> usuarioRepositoryProvider) {
    this.usuarioRepositoryProvider = usuarioRepositoryProvider;
  }

  @Override
  public GetUsuarioUseCase get() {
    return newInstance(usuarioRepositoryProvider.get());
  }

  public static GetUsuarioUseCase_Factory create(
      Provider<UsuarioRepository> usuarioRepositoryProvider) {
    return new GetUsuarioUseCase_Factory(usuarioRepositoryProvider);
  }

  public static GetUsuarioUseCase newInstance(UsuarioRepository usuarioRepository) {
    return new GetUsuarioUseCase(usuarioRepository);
  }
}
