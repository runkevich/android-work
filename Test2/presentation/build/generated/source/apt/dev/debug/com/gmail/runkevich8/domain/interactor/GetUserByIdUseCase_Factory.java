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
public final class GetUserByIdUseCase_Factory implements Factory<GetUserByIdUseCase> {
  private final Provider<PostExecutionThread> postExecuteionThreadProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  public GetUserByIdUseCase_Factory(
      Provider<PostExecutionThread> postExecuteionThreadProvider,
      Provider<UserRepository> userRepositoryProvider) {
    this.postExecuteionThreadProvider = postExecuteionThreadProvider;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public GetUserByIdUseCase get() {
    return new GetUserByIdUseCase(postExecuteionThreadProvider.get(), userRepositoryProvider.get());
  }

  public static GetUserByIdUseCase_Factory create(
      Provider<PostExecutionThread> postExecuteionThreadProvider,
      Provider<UserRepository> userRepositoryProvider) {
    return new GetUserByIdUseCase_Factory(postExecuteionThreadProvider, userRepositoryProvider);
  }
}
