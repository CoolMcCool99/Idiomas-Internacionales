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
public final class GenerarRutaPersonalizadaUseCase_Factory implements Factory<GenerarRutaPersonalizadaUseCase> {
  @Override
  public GenerarRutaPersonalizadaUseCase get() {
    return newInstance();
  }

  public static GenerarRutaPersonalizadaUseCase_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GenerarRutaPersonalizadaUseCase newInstance() {
    return new GenerarRutaPersonalizadaUseCase();
  }

  private static final class InstanceHolder {
    private static final GenerarRutaPersonalizadaUseCase_Factory INSTANCE = new GenerarRutaPersonalizadaUseCase_Factory();
  }
}
