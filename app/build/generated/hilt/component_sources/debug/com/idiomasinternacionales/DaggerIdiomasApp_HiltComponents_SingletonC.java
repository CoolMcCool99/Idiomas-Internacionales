package com.idiomasinternacionales;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.idiomasinternacionales.data.local.AppDatabase;
import com.idiomasinternacionales.data.local.dao.RutaAprendizajeDao;
import com.idiomasinternacionales.data.local.dao.UsuarioDao;
import com.idiomasinternacionales.data.repository.RutaAprendizajeRepositoryImpl;
import com.idiomasinternacionales.data.repository.UsuarioRepositoryImpl;
import com.idiomasinternacionales.di.DatabaseModule;
import com.idiomasinternacionales.di.DatabaseModule_ProvideDatabaseFactory;
import com.idiomasinternacionales.di.DatabaseModule_ProvideRutaAprendizajeDaoFactory;
import com.idiomasinternacionales.di.DatabaseModule_ProvideUsuarioDaoFactory;
import com.idiomasinternacionales.domain.repository.RutaAprendizajeRepository;
import com.idiomasinternacionales.domain.repository.UsuarioRepository;
import com.idiomasinternacionales.domain.usecase.CrearNotificacionUseCase;
import com.idiomasinternacionales.domain.usecase.CreateRutaAprendizajeUseCase;
import com.idiomasinternacionales.domain.usecase.CreateUsuarioUseCase;
import com.idiomasinternacionales.domain.usecase.GenerarRutaPersonalizadaUseCase;
import com.idiomasinternacionales.domain.usecase.GetNotificacionesUseCase;
import com.idiomasinternacionales.domain.usecase.GetRutaAprendizajeDetailsUseCase;
import com.idiomasinternacionales.domain.usecase.GetRutasAprendizajeUseCase;
import com.idiomasinternacionales.domain.usecase.GetUsuarioUseCase;
import com.idiomasinternacionales.domain.usecase.MarcarNotificacionLeidaUseCase;
import com.idiomasinternacionales.domain.usecase.ObtenerFeedbackPronunciacionUseCase;
import com.idiomasinternacionales.domain.usecase.SaveUsuarioUseCase;
import com.idiomasinternacionales.presentation.viewmodel.GamificacionViewModel;
import com.idiomasinternacionales.presentation.viewmodel.GamificacionViewModel_HiltModules_KeyModule_ProvideFactory;
import com.idiomasinternacionales.presentation.viewmodel.IAViewModel;
import com.idiomasinternacionales.presentation.viewmodel.IAViewModel_HiltModules_KeyModule_ProvideFactory;
import com.idiomasinternacionales.presentation.viewmodel.LeccionViewModel;
import com.idiomasinternacionales.presentation.viewmodel.LeccionViewModel_HiltModules_KeyModule_ProvideFactory;
import com.idiomasinternacionales.presentation.viewmodel.ModuloViewModel;
import com.idiomasinternacionales.presentation.viewmodel.ModuloViewModel_HiltModules_KeyModule_ProvideFactory;
import com.idiomasinternacionales.presentation.viewmodel.NotificacionViewModel;
import com.idiomasinternacionales.presentation.viewmodel.NotificacionViewModel_HiltModules_KeyModule_ProvideFactory;
import com.idiomasinternacionales.presentation.viewmodel.PerfilViewModel;
import com.idiomasinternacionales.presentation.viewmodel.PerfilViewModel_HiltModules_KeyModule_ProvideFactory;
import com.idiomasinternacionales.presentation.viewmodel.UsuarioViewModel;
import com.idiomasinternacionales.presentation.viewmodel.UsuarioViewModel_HiltModules_KeyModule_ProvideFactory;
import com.idiomasinternacionales.ui.viewmodel.HomeViewModel;
import com.idiomasinternacionales.ui.viewmodel.HomeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.idiomasinternacionales.ui.viewmodel.LoginViewModel;
import com.idiomasinternacionales.ui.viewmodel.LoginViewModel_HiltModules_KeyModule_ProvideFactory;
import com.idiomasinternacionales.ui.viewmodel.RutaAprendizajeDetailsViewModel;
import com.idiomasinternacionales.ui.viewmodel.RutaAprendizajeDetailsViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class DaggerIdiomasApp_HiltComponents_SingletonC {
  private DaggerIdiomasApp_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder databaseModule(DatabaseModule databaseModule) {
      Preconditions.checkNotNull(databaseModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    public IdiomasApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements IdiomasApp_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public IdiomasApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements IdiomasApp_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public IdiomasApp_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements IdiomasApp_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public IdiomasApp_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements IdiomasApp_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public IdiomasApp_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements IdiomasApp_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public IdiomasApp_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements IdiomasApp_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public IdiomasApp_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements IdiomasApp_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public IdiomasApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends IdiomasApp_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends IdiomasApp_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends IdiomasApp_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends IdiomasApp_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return ImmutableSet.<String>of(GamificacionViewModel_HiltModules_KeyModule_ProvideFactory.provide(), HomeViewModel_HiltModules_KeyModule_ProvideFactory.provide(), IAViewModel_HiltModules_KeyModule_ProvideFactory.provide(), LeccionViewModel_HiltModules_KeyModule_ProvideFactory.provide(), LoginViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ModuloViewModel_HiltModules_KeyModule_ProvideFactory.provide(), NotificacionViewModel_HiltModules_KeyModule_ProvideFactory.provide(), PerfilViewModel_HiltModules_KeyModule_ProvideFactory.provide(), RutaAprendizajeDetailsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), UsuarioViewModel_HiltModules_KeyModule_ProvideFactory.provide());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends IdiomasApp_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<GamificacionViewModel> gamificacionViewModelProvider;

    private Provider<HomeViewModel> homeViewModelProvider;

    private Provider<IAViewModel> iAViewModelProvider;

    private Provider<LeccionViewModel> leccionViewModelProvider;

    private Provider<LoginViewModel> loginViewModelProvider;

    private Provider<ModuloViewModel> moduloViewModelProvider;

    private Provider<NotificacionViewModel> notificacionViewModelProvider;

    private Provider<PerfilViewModel> perfilViewModelProvider;

    private Provider<RutaAprendizajeDetailsViewModel> rutaAprendizajeDetailsViewModelProvider;

    private Provider<UsuarioViewModel> usuarioViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    private GetUsuarioUseCase getUsuarioUseCase() {
      return new GetUsuarioUseCase(singletonCImpl.bindUsuarioRepositoryProvider.get());
    }

    private GetRutasAprendizajeUseCase getRutasAprendizajeUseCase() {
      return new GetRutasAprendizajeUseCase(singletonCImpl.bindRutaAprendizajeRepositoryProvider.get());
    }

    private CreateRutaAprendizajeUseCase createRutaAprendizajeUseCase() {
      return new CreateRutaAprendizajeUseCase(singletonCImpl.bindRutaAprendizajeRepositoryProvider.get());
    }

    private CreateUsuarioUseCase createUsuarioUseCase() {
      return new CreateUsuarioUseCase(singletonCImpl.bindUsuarioRepositoryProvider.get());
    }

    private GetRutaAprendizajeDetailsUseCase getRutaAprendizajeDetailsUseCase() {
      return new GetRutaAprendizajeDetailsUseCase(singletonCImpl.bindRutaAprendizajeRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.gamificacionViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.homeViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.iAViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.leccionViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.loginViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.moduloViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
      this.notificacionViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 6);
      this.perfilViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 7);
      this.rutaAprendizajeDetailsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 8);
      this.usuarioViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 9);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return ImmutableMap.<String, Provider<ViewModel>>builderWithExpectedSize(10).put("com.idiomasinternacionales.presentation.viewmodel.GamificacionViewModel", ((Provider) gamificacionViewModelProvider)).put("com.idiomasinternacionales.ui.viewmodel.HomeViewModel", ((Provider) homeViewModelProvider)).put("com.idiomasinternacionales.presentation.viewmodel.IAViewModel", ((Provider) iAViewModelProvider)).put("com.idiomasinternacionales.presentation.viewmodel.LeccionViewModel", ((Provider) leccionViewModelProvider)).put("com.idiomasinternacionales.ui.viewmodel.LoginViewModel", ((Provider) loginViewModelProvider)).put("com.idiomasinternacionales.presentation.viewmodel.ModuloViewModel", ((Provider) moduloViewModelProvider)).put("com.idiomasinternacionales.presentation.viewmodel.NotificacionViewModel", ((Provider) notificacionViewModelProvider)).put("com.idiomasinternacionales.presentation.viewmodel.PerfilViewModel", ((Provider) perfilViewModelProvider)).put("com.idiomasinternacionales.ui.viewmodel.RutaAprendizajeDetailsViewModel", ((Provider) rutaAprendizajeDetailsViewModelProvider)).put("com.idiomasinternacionales.presentation.viewmodel.UsuarioViewModel", ((Provider) usuarioViewModelProvider)).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.idiomasinternacionales.presentation.viewmodel.GamificacionViewModel 
          return (T) new GamificacionViewModel(viewModelCImpl.getUsuarioUseCase());

          case 1: // com.idiomasinternacionales.ui.viewmodel.HomeViewModel 
          return (T) new HomeViewModel(viewModelCImpl.getRutasAprendizajeUseCase(), viewModelCImpl.createRutaAprendizajeUseCase());

          case 2: // com.idiomasinternacionales.presentation.viewmodel.IAViewModel 
          return (T) new IAViewModel(new ObtenerFeedbackPronunciacionUseCase(), new GenerarRutaPersonalizadaUseCase());

          case 3: // com.idiomasinternacionales.presentation.viewmodel.LeccionViewModel 
          return (T) new LeccionViewModel(viewModelCImpl.getRutasAprendizajeUseCase());

          case 4: // com.idiomasinternacionales.ui.viewmodel.LoginViewModel 
          return (T) new LoginViewModel(viewModelCImpl.createUsuarioUseCase(), viewModelCImpl.getUsuarioUseCase());

          case 5: // com.idiomasinternacionales.presentation.viewmodel.ModuloViewModel 
          return (T) new ModuloViewModel(viewModelCImpl.getRutasAprendizajeUseCase());

          case 6: // com.idiomasinternacionales.presentation.viewmodel.NotificacionViewModel 
          return (T) new NotificacionViewModel(new GetNotificacionesUseCase(), new MarcarNotificacionLeidaUseCase(), new CrearNotificacionUseCase());

          case 7: // com.idiomasinternacionales.presentation.viewmodel.PerfilViewModel 
          return (T) new PerfilViewModel(viewModelCImpl.getUsuarioUseCase(), new SaveUsuarioUseCase());

          case 8: // com.idiomasinternacionales.ui.viewmodel.RutaAprendizajeDetailsViewModel 
          return (T) new RutaAprendizajeDetailsViewModel(viewModelCImpl.getRutaAprendizajeDetailsUseCase());

          case 9: // com.idiomasinternacionales.presentation.viewmodel.UsuarioViewModel 
          return (T) new UsuarioViewModel(viewModelCImpl.getUsuarioUseCase(), new SaveUsuarioUseCase());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends IdiomasApp_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends IdiomasApp_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends IdiomasApp_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<AppDatabase> provideDatabaseProvider;

    private Provider<UsuarioRepositoryImpl> usuarioRepositoryImplProvider;

    private Provider<UsuarioRepository> bindUsuarioRepositoryProvider;

    private Provider<RutaAprendizajeRepositoryImpl> rutaAprendizajeRepositoryImplProvider;

    private Provider<RutaAprendizajeRepository> bindRutaAprendizajeRepositoryProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    private UsuarioDao usuarioDao() {
      return DatabaseModule_ProvideUsuarioDaoFactory.provideUsuarioDao(provideDatabaseProvider.get());
    }

    private RutaAprendizajeDao rutaAprendizajeDao() {
      return DatabaseModule_ProvideRutaAprendizajeDaoFactory.provideRutaAprendizajeDao(provideDatabaseProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.provideDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<AppDatabase>(singletonCImpl, 1));
      this.usuarioRepositoryImplProvider = new SwitchingProvider<>(singletonCImpl, 0);
      this.bindUsuarioRepositoryProvider = DoubleCheck.provider((Provider) usuarioRepositoryImplProvider);
      this.rutaAprendizajeRepositoryImplProvider = new SwitchingProvider<>(singletonCImpl, 2);
      this.bindRutaAprendizajeRepositoryProvider = DoubleCheck.provider((Provider) rutaAprendizajeRepositoryImplProvider);
    }

    @Override
    public void injectIdiomasApp(IdiomasApp idiomasApp) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return ImmutableSet.<Boolean>of();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.idiomasinternacionales.data.repository.UsuarioRepositoryImpl 
          return (T) new UsuarioRepositoryImpl(singletonCImpl.usuarioDao());

          case 1: // com.idiomasinternacionales.data.local.AppDatabase 
          return (T) DatabaseModule_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 2: // com.idiomasinternacionales.data.repository.RutaAprendizajeRepositoryImpl 
          return (T) new RutaAprendizajeRepositoryImpl(singletonCImpl.rutaAprendizajeDao());

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
