package com.idiomasinternacionales.data.repository;

import com.idiomasinternacionales.data.local.dao.UsuarioDao;
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
public final class UsuarioRepositoryImpl_Factory implements Factory<UsuarioRepositoryImpl> {
  private final Provider<UsuarioDao> usuarioDaoProvider;

  public UsuarioRepositoryImpl_Factory(Provider<UsuarioDao> usuarioDaoProvider) {
    this.usuarioDaoProvider = usuarioDaoProvider;
  }

  @Override
  public UsuarioRepositoryImpl get() {
    return newInstance(usuarioDaoProvider.get());
  }

  public static UsuarioRepositoryImpl_Factory create(Provider<UsuarioDao> usuarioDaoProvider) {
    return new UsuarioRepositoryImpl_Factory(usuarioDaoProvider);
  }

  public static UsuarioRepositoryImpl newInstance(UsuarioDao usuarioDao) {
    return new UsuarioRepositoryImpl(usuarioDao);
  }
}
