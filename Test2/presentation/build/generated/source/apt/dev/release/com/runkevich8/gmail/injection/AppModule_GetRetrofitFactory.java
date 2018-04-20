package com.runkevich8.gmail.injection;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_GetRetrofitFactory implements Factory<Retrofit> {
  private final AppModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<Gson> gsonProvider;

  public AppModule_GetRetrofitFactory(
      AppModule module, Provider<OkHttpClient> okHttpClientProvider, Provider<Gson> gsonProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.getRetrofit(okHttpClientProvider.get(), gsonProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_GetRetrofitFactory create(
      AppModule module, Provider<OkHttpClient> okHttpClientProvider, Provider<Gson> gsonProvider) {
    return new AppModule_GetRetrofitFactory(module, okHttpClientProvider, gsonProvider);
  }

  public static Retrofit proxyGetRetrofit(
      AppModule instance, OkHttpClient okHttpClient, Gson gson) {
    return Preconditions.checkNotNull(
        instance.getRetrofit(okHttpClient, gson),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
