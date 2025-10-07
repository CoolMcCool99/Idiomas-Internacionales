package com.idiomasinternacionales.ui.viewmodel;

import com.idiomasinternacionales.domain.usecase.CreateUsuarioUseCase;
import com.idiomasinternacionales.domain.usecase.GetUsuarioUseCase;
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
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<CreateUsuarioUseCase> createUsuarioUseCaseProvider;

  private final Provider<GetUsuarioUseCase> getUsuarioUseCaseProvider;

  public LoginViewModel_Factory(Provider<CreateUsuarioUseCase> createUsuarioUseCaseProvider,
      Provider<GetUsuarioUseCase> getUsuarioUseCaseProvider) {
    this.createUsuarioUseCaseProvider = createUsuarioUseCaseProvider;
    this.getUsuarioUseCaseProvider = getUsuarioUseCaseProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(createUsuarioUseCaseProvider.get(), getUsuarioUseCaseProvider.get());
  }

  public static LoginViewModel_Factory create(
      Provider<CreateUsuarioUseCase> createUsuarioUseCaseProvider,
      Provider<GetUsuarioUseCase> getUsuarioUseCaseProvider) {
    return new LoginViewModel_Factory(createUsuarioUseCaseProvider, getUsuarioUseCaseProvider);
  }

  public static LoginViewModel newInstance(CreateUsuarioUseCase createUsuarioUseCase,
      GetUsuarioUseCase getUsuarioUseCase) {
    return new LoginViewModel(createUsuarioUseCase, getUsuarioUseCase);
  }
}
