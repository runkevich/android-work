package com.runkevich8.gmail.injection;

import android.content.Context;
import com.gmail.runkevich8.data.database.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_GetAppDatabaseFactory implements Factory<AppDatabase> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  public AppModule_GetAppDatabaseFactory(AppModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public AppDatabase get() {
    return Preconditions.checkNotNull(
        module.getAppDatabase(contextProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_GetAppDatabaseFactory create(
      AppModule module, Provider<Context> contextProvider) {
    return new AppModule_GetAppDatabaseFactory(module, contextProvider);
  }

  public static AppDatabase proxyGetAppDatabase(AppModule instance, Context context) {
    return Preconditions.checkNotNull(
        instance.getAppDatabase(context),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
