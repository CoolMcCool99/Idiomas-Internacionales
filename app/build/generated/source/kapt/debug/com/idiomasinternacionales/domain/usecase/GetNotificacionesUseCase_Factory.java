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
public final class GetNotificacionesUseCase_Factory implements Factory<GetNotificacionesUseCase> {
  @Override
  public GetNotificacionesUseCase get() {
    return newInstance();
  }

  public static GetNotificacionesUseCase_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GetNotificacionesUseCase newInstance() {
    return new GetNotificacionesUseCase();
  }

  private static final class InstanceHolder {
    private static final GetNotificacionesUseCase_Factory INSTANCE = new GetNotificacionesUseCase_Factory();
  }
}
