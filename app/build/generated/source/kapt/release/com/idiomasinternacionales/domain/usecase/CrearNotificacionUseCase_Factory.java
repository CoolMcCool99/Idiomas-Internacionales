package com.idiomasinternacionales.domain.usecase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class CrearNotificacionUseCase_Factory implements Factory<CrearNotificacionUseCase> {
  @Override
  public CrearNotificacionUseCase get() {
    return newInstance();
  }

  public static CrearNotificacionUseCase_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CrearNotificacionUseCase newInstance() {
    return new CrearNotificacionUseCase();
  }

  private static final class InstanceHolder {
    private static final CrearNotificacionUseCase_Factory INSTANCE = new CrearNotificacionUseCase_Factory();
  }
}
