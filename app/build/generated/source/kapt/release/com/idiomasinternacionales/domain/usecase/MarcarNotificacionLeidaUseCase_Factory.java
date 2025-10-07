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
public final class MarcarNotificacionLeidaUseCase_Factory implements Factory<MarcarNotificacionLeidaUseCase> {
  @Override
  public MarcarNotificacionLeidaUseCase get() {
    return newInstance();
  }

  public static MarcarNotificacionLeidaUseCase_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MarcarNotificacionLeidaUseCase newInstance() {
    return new MarcarNotificacionLeidaUseCase();
  }

  private static final class InstanceHolder {
    private static final MarcarNotificacionLeidaUseCase_Factory INSTANCE = new MarcarNotificacionLeidaUseCase_Factory();
  }
}
