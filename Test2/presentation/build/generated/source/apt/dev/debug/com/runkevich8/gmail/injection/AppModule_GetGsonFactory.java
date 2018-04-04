package com.runkevich8.gmail.injection;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_GetGsonFactory implements Factory<Gson> {
  private final AppModule module;

  public AppModule_GetGsonFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Gson get() {
    return Preconditions.checkNotNull(
        module.getGson(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_GetGsonFactory create(AppModule module) {
    return new AppModule_GetGsonFactory(module);
  }

  public static Gson proxyGetGson(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.getGson(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
