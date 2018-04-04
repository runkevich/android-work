package com.runkevich8.gmail.injection;

import com.gmail.runkevich8.domain.executor.PostExecutionThread;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_GetUiThreadFactory implements Factory<PostExecutionThread> {
  private final AppModule module;

  public AppModule_GetUiThreadFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public PostExecutionThread get() {
    return Preconditions.checkNotNull(
        module.getUiThread(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_GetUiThreadFactory create(AppModule module) {
    return new AppModule_GetUiThreadFactory(module);
  }

  public static PostExecutionThread proxyGetUiThread(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.getUiThread(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
