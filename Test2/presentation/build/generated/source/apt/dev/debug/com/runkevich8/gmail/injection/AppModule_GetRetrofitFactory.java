package com.runkevich8.gmail.injection;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_GetRetrofitFactory implements Factory<Retrofit> {
  private final AppModule module;

  private final Provider<Gson> gsonProvider;

  public AppModule_GetRetrofitFactory(AppModule module, Provider<Gson> gsonProvider) {
    this.module = module;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.getRetrofit(gsonProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_GetRetrofitFactory create(AppModule module, Provider<Gson> gsonProvider) {
    return new AppModule_GetRetrofitFactory(module, gsonProvider);
  }

  public static Retrofit proxyGetRetrofit(AppModule instance, Gson gson) {
    return Preconditions.checkNotNull(
        instance.getRetrofit(gson), "Cannot return null from a non-@Nullable @Provides method");
  }
}
