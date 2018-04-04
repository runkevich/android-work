package com.gmail.runkevich8.data.net;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RestService_Factory implements Factory<RestService> {
  private final Provider<RestApi> restApiProvider;

  public RestService_Factory(Provider<RestApi> restApiProvider) {
    this.restApiProvider = restApiProvider;
  }

  @Override
  public RestService get() {
    return new RestService(restApiProvider.get());
  }

  public static RestService_Factory create(Provider<RestApi> restApiProvider) {
    return new RestService_Factory(restApiProvider);
  }
}
