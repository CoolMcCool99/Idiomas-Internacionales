package com.idiomasinternacionales.presentation.viewmodel;

import com.idiomasinternacionales.domain.usecase.CrearNotificacionUseCase;
import com.idiomasinternacionales.domain.usecase.GetNotificacionesUseCase;
import com.idiomasinternacionales.domain.usecase.MarcarNotificacionLeidaUseCase;
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
public final class NotificacionViewModel_Factory implements Factory<NotificacionViewModel> {
  private final Provider<GetNotificacionesUseCase> getNotificacionesProvider;

  private final Provider<MarcarNotificacionLeidaUseCase> marcarLeidaProvider;

  private final Provider<CrearNotificacionUseCase> crearNotificacionProvider;

  public NotificacionViewModel_Factory(Provider<GetNotificacionesUseCase> getNotificacionesProvider,
      Provider<MarcarNotificacionLeidaUseCase> marcarLeidaProvider,
      Provider<CrearNotificacionUseCase> crearNotificacionProvider) {
    this.getNotificacionesProvider = getNotificacionesProvider;
    this.marcarLeidaProvider = marcarLeidaProvider;
    this.crearNotificacionProvider = crearNotificacionProvider;
  }

  @Override
  public NotificacionViewModel get() {
    return newInstance(getNotificacionesProvider.get(), marcarLeidaProvider.get(), crearNotificacionProvider.get());
  }

  public static NotificacionViewModel_Factory create(
      Provider<GetNotificacionesUseCase> getNotificacionesProvider,
      Provider<MarcarNotificacionLeidaUseCase> marcarLeidaProvider,
      Provider<CrearNotificacionUseCase> crearNotificacionProvider) {
    return new NotificacionViewModel_Factory(getNotificacionesProvider, marcarLeidaProvider, crearNotificacionProvider);
  }

  public static NotificacionViewModel newInstance(GetNotificacionesUseCase getNotificaciones,
      MarcarNotificacionLeidaUseCase marcarLeida, CrearNotificacionUseCase crearNotificacion) {
    return new NotificacionViewModel(getNotificaciones, marcarLeida, crearNotificacion);
  }
}
