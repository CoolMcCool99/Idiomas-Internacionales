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
public final class ObtenerFeedbackPronunciacionUseCase_Factory implements Factory<ObtenerFeedbackPronunciacionUseCase> {
  @Override
  public ObtenerFeedbackPronunciacionUseCase get() {
    return newInstance();
  }

  public static ObtenerFeedbackPronunciacionUseCase_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ObtenerFeedbackPronunciacionUseCase newInstance() {
    return new ObtenerFeedbackPronunciacionUseCase();
  }

  private static final class InstanceHolder {
    private static final ObtenerFeedbackPronunciacionUseCase_Factory INSTANCE = new ObtenerFeedbackPronunciacionUseCase_Factory();
  }
}
