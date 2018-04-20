package com.gmail.runkevich8.data.net;

import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ErrorTransformers_Factory implements Factory<ErrorTransformers> {
  private final Provider<Gson> gsonProvider;

  public ErrorTransformers_Factory(Provider<Gson> gsonProvider) {
    this.gsonProvider = gsonProvider;
  }

  @Override
  public ErrorTransformers get() {
    return new ErrorTransformers(gsonProvider.get());
  }

  public static ErrorTransformers_Factory create(Provider<Gson> gsonProvider) {
    return new ErrorTransformers_Factory(gsonProvider);
  }
}
