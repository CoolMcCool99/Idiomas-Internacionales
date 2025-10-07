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
public final class SaveUsuarioUseCase_Factory implements Factory<SaveUsuarioUseCase> {
  @Override
  public SaveUsuarioUseCase get() {
    return newInstance();
  }

  public static SaveUsuarioUseCase_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SaveUsuarioUseCase newInstance() {
    return new SaveUsuarioUseCase();
  }

  private static final class InstanceHolder {
    private static final SaveUsuarioUseCase_Factory INSTANCE = new SaveUsuarioUseCase_Factory();
  }
}
