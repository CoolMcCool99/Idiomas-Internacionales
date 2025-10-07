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
public final class CreateUsuarioUseCase_Factory implements Factory<CreateUsuarioUseCase> {
  private final Provider<UsuarioRepository> usuarioRepositoryProvider;

  public CreateUsuarioUseCase_Factory(Provider<UsuarioRepository> usuarioRepositoryProvider) {
    this.usuarioRepositoryProvider = usuarioRepositoryProvider;
  }

  @Override
  public CreateUsuarioUseCase get() {
    return newInstance(usuarioRepositoryProvider.get());
  }

  public static CreateUsuarioUseCase_Factory create(
      Provider<UsuarioRepository> usuarioRepositoryProvider) {
    return new CreateUsuarioUseCase_Factory(usuarioRepositoryProvider);
  }

  public static CreateUsuarioUseCase newInstance(UsuarioRepository usuarioRepository) {
    return new CreateUsuarioUseCase(usuarioRepository);
  }
}
