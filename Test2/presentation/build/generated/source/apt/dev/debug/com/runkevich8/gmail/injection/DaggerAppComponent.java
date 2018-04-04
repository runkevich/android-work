package com.runkevich8.gmail.injection;

import android.content.Context;
import com.gmail.runkevich8.data.net.RestApi;
import com.gmail.runkevich8.data.net.RestService;
import com.gmail.runkevich8.data.net.RestService_Factory;
import com.gmail.runkevich8.domain.executor.PostExecutionThread;
import com.gmail.runkevich8.domain.interactor.GetUserByIdUseCase;
import com.gmail.runkevich8.domain.repository.UserRepository;
import com.google.gson.Gson;
import com.runkevich8.gmail.presentation.screens.user.UserViewModel;
import com.runkevich8.gmail.presentation.screens.user.UserViewModel_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<PostExecutionThread> getUiThreadProvider;

  private Provider<Context> getContextProvider;

  private Provider<OkHttpClient> getOkHttpClientProvider;

  private Provider<Gson> getGsonProvider;

  private Provider<Retrofit> getRetrofitProvider;

  private Provider<RestApi> getRestApiProvider;

  private Provider<RestService> restServiceProvider;

  private Provider<UserRepository> getUserRepositoryProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  private GetUserByIdUseCase getGetUserByIdUseCase() {
    return new GetUserByIdUseCase(getUiThreadProvider.get(), getUserRepositoryProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.getUiThreadProvider =
        DoubleCheck.provider(AppModule_GetUiThreadFactory.create(builder.appModule));
    this.getContextProvider =
        DoubleCheck.provider(AppModule_GetContextFactory.create(builder.appModule));
    this.getOkHttpClientProvider =
        DoubleCheck.provider(AppModule_GetOkHttpClientFactory.create(builder.appModule));
    this.getGsonProvider = DoubleCheck.provider(AppModule_GetGsonFactory.create(builder.appModule));
    this.getRetrofitProvider =
        DoubleCheck.provider(
            AppModule_GetRetrofitFactory.create(
                builder.appModule, getOkHttpClientProvider, getGsonProvider));
    this.getRestApiProvider =
        DoubleCheck.provider(
            AppModule_GetRestApiFactory.create(builder.appModule, getRetrofitProvider));
    this.restServiceProvider = DoubleCheck.provider(RestService_Factory.create(getRestApiProvider));
    this.getUserRepositoryProvider =
        DoubleCheck.provider(
            AppModule_GetUserRepositoryFactory.create(
                builder.appModule, getContextProvider, restServiceProvider));
  }

  @Override
  public void inject(UserViewModel userViewModel) {
    injectUserViewModel(userViewModel);
  }

  private UserViewModel injectUserViewModel(UserViewModel instance) {
    UserViewModel_MembersInjector.injectGetUserByIdUseCase(instance, getGetUserByIdUseCase());
    return instance;
  }

  public static final class Builder {
    private AppModule appModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }
  }
}
