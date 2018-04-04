package com.runkevich8.gmail.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_GetOkHttpClientFactory implements Factory<OkHttpClient> {
  private final AppModule module;

  public AppModule_GetOkHttpClientFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.getOkHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_GetOkHttpClientFactory create(AppModule module) {
    return new AppModule_GetOkHttpClientFactory(module);
  }

  public static OkHttpClient proxyGetOkHttpClient(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.getOkHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
