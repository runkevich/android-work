package com.runkevich8.gmail.injection;

import com.gmail.runkevich8.data.net.ErrorTransformers;
import com.gmail.runkevich8.data.net.RestApi;
import com.gmail.runkevich8.data.net.RestService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_GetRestServiceFactory implements Factory<RestService> {
  private final AppModule module;

  private final Provider<RestApi> restAPIProvider;

  private final Provider<ErrorTransformers> errorTransformersProvider;

  public AppModule_GetRestServiceFactory(
      AppModule module,
      Provider<RestApi> restAPIProvider,
      Provider<ErrorTransformers> errorTransformersProvider) {
    this.module = module;
    this.restAPIProvider = restAPIProvider;
    this.errorTransformersProvider = errorTransformersProvider;
  }

  @Override
  public RestService get() {
    return Preconditions.checkNotNull(
        module.getRestService(restAPIProvider.get(), errorTransformersProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_GetRestServiceFactory create(
      AppModule module,
      Provider<RestApi> restAPIProvider,
      Provider<ErrorTransformers> errorTransformersProvider) {
    return new AppModule_GetRestServiceFactory(module, restAPIProvider, errorTransformersProvider);
  }

  public static RestService proxyGetRestService(
      AppModule instance, RestApi restAPI, ErrorTransformers errorTransformers) {
    return Preconditions.checkNotNull(
        instance.getRestService(restAPI, errorTransformers),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
