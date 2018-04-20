package com.runkevich8.gmail.injection;

import com.gmail.runkevich8.data.database.AppDatabase;
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

  private final Provider<RestService> restServiceProvider;

  private final Provider<AppDatabase> appDatabaseProvider;

  public AppModule_GetUserRepositoryFactory(
      AppModule module,
      Provider<RestService> restServiceProvider,
      Provider<AppDatabase> appDatabaseProvider) {
    this.module = module;
    this.restServiceProvider = restServiceProvider;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public UserRepository get() {
    return Preconditions.checkNotNull(
        module.getUserRepository(restServiceProvider.get(), appDatabaseProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_GetUserRepositoryFactory create(
      AppModule module,
      Provider<RestService> restServiceProvider,
      Provider<AppDatabase> appDatabaseProvider) {
    return new AppModule_GetUserRepositoryFactory(module, restServiceProvider, appDatabaseProvider);
  }

  public static UserRepository proxyGetUserRepository(
      AppModule instance, RestService restService, AppDatabase appDatabase) {
    return Preconditions.checkNotNull(
        instance.getUserRepository(restService, appDatabase),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
