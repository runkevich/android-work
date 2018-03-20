package com.runkevich8.gmail.presentation.screens.user;

import com.gmail.runkevich8.domain.interactor.GetUserByIdUseCase;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserViewModel_MembersInjector implements MembersInjector<UserViewModel> {
  private final Provider<GetUserByIdUseCase> getUserByIdUseCaseProvider;

  public UserViewModel_MembersInjector(Provider<GetUserByIdUseCase> getUserByIdUseCaseProvider) {
    this.getUserByIdUseCaseProvider = getUserByIdUseCaseProvider;
  }

  public static MembersInjector<UserViewModel> create(
      Provider<GetUserByIdUseCase> getUserByIdUseCaseProvider) {
    return new UserViewModel_MembersInjector(getUserByIdUseCaseProvider);
  }

  @Override
  public void injectMembers(UserViewModel instance) {
    injectGetUserByIdUseCase(instance, getUserByIdUseCaseProvider.get());
  }

  public static void injectGetUserByIdUseCase(
      UserViewModel instance, GetUserByIdUseCase getUserByIdUseCase) {
    instance.getUserByIdUseCase = getUserByIdUseCase;
  }
}
