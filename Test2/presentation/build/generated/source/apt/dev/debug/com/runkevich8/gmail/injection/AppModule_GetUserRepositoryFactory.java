package com.runkevich8.gmail.injection;

import android.content.Context;
import com.gmail.runkevich8.data.net.RestService;
import com.gmail.runkevich8.domain.repository.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_GetUserRepositoryFactory implements Factory<UserRepository> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  private final Provider<RestService> restServiceProvider;

  public AppModule_GetUserRepositoryFactory(
      AppModule module,
      Provider<Context> contextProvider,
      Provider<RestService> restServiceProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.restServiceProvider = restServiceProvider;
  }

  @Override
  public UserRepository get() {
    return Preconditions.checkNotNull(
        module.getUserRepository(contextProvider.get(), restServiceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_GetUserRepositoryFactory create(
      AppModule module,
      Provider<Context> contextProvider,
      Provider<RestService> restServiceProvider) {
    return new AppModule_GetUserRepositoryFactory(module, contextProvider, restServiceProvider);
  }

  public static UserRepository proxyGetUserRepository(
      AppModule instance, Context context, RestService restService) {
    return Preconditions.checkNotNull(
        instance.getUserRepository(context, restService),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
