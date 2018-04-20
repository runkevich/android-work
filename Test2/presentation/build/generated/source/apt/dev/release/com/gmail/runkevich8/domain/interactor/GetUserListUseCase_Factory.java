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
public final class GetUserListUseCase_Factory implements Factory<GetUserListUseCase> {
  private final Provider<PostExecutionThread> postExecutionThreadProvider;

  private final Provider<UserRepository> userProfileRepositoryProvider;

  public GetUserListUseCase_Factory(
      Provider<PostExecutionThread> postExecutionThreadProvider,
      Provider<UserRepository> userProfileRepositoryProvider) {
    this.postExecutionThreadProvider = postExecutionThreadProvider;
    this.userProfileRepositoryProvider = userProfileRepositoryProvider;
  }

  @Override
  public GetUserListUseCase get() {
    return new GetUserListUseCase(
        postExecutionThreadProvider.get(), userProfileRepositoryProvider.get());
  }

  public static GetUserListUseCase_Factory create(
      Provider<PostExecutionThread> postExecutionThreadProvider,
      Provider<UserRepository> userProfileRepositoryProvider) {
    return new GetUserListUseCase_Factory(
        postExecutionThreadProvider, userProfileRepositoryProvider);
  }
}
