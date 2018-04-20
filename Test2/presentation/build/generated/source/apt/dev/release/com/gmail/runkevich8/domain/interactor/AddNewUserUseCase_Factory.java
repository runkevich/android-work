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
public final class AddNewUserUseCase_Factory implements Factory<AddNewUserUseCase> {
  private final Provider<PostExecutionThread> postExecuteionThreadProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  public AddNewUserUseCase_Factory(
      Provider<PostExecutionThread> postExecuteionThreadProvider,
      Provider<UserRepository> userRepositoryProvider) {
    this.postExecuteionThreadProvider = postExecuteionThreadProvider;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public AddNewUserUseCase get() {
    return new AddNewUserUseCase(postExecuteionThreadProvider.get(), userRepositoryProvider.get());
  }

  public static AddNewUserUseCase_Factory create(
      Provider<PostExecutionThread> postExecuteionThreadProvider,
      Provider<UserRepository> userRepositoryProvider) {
    return new AddNewUserUseCase_Factory(postExecuteionThreadProvider, userRepositoryProvider);
  }
}
