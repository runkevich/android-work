package com.gmail.runkevich8.domain.interactor;

import com.gmail.runkevich8.domain.executor.PostExecutionThread;
import com.gmail.runkevich8.domain.repository.UserRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RemoveUserUseCase_Factory implements Factory<RemoveUserUseCase> {
  private final Provider<PostExecutionThread> postExecuteionThreadProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  public RemoveUserUseCase_Factory(
      Provider<PostExecutionThread> postExecuteionThreadProvider,
      Provider<UserRepository> userRepositoryProvider) {
    this.postExecuteionThreadProvider = postExecuteionThreadProvider;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public RemoveUserUseCase get() {
    return new RemoveUserUseCase(postExecuteionThreadProvider.get(), userRepositoryProvider.get());
  }

  public static RemoveUserUseCase_Factory create(
      Provider<PostExecutionThread> postExecuteionThreadProvider,
      Provider<UserRepository> userRepositoryProvider) {
    return new RemoveUserUseCase_Factory(postExecuteionThreadProvider, userRepositoryProvider);
  }
}
