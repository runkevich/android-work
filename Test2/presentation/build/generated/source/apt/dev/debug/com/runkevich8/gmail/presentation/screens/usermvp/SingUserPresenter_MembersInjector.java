package com.runkevich8.gmail.presentation.screens.usermvp;

import com.gmail.runkevich8.domain.interactor.GetUserByIdUseCase;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SingUserPresenter_MembersInjector implements MembersInjector<SingUserPresenter> {
  private final Provider<GetUserByIdUseCase> getUserByIdUseCaseProvider;

  public SingUserPresenter_MembersInjector(
      Provider<GetUserByIdUseCase> getUserByIdUseCaseProvider) {
    this.getUserByIdUseCaseProvider = getUserByIdUseCaseProvider;
  }

  public static MembersInjector<SingUserPresenter> create(
      Provider<GetUserByIdUseCase> getUserByIdUseCaseProvider) {
    return new SingUserPresenter_MembersInjector(getUserByIdUseCaseProvider);
  }

  @Override
  public void injectMembers(SingUserPresenter instance) {
    injectGetUserByIdUseCase(instance, getUserByIdUseCaseProvider.get());
  }

  public static void injectGetUserByIdUseCase(
      SingUserPresenter instance, GetUserByIdUseCase getUserByIdUseCase) {
    instance.getUserByIdUseCase = getUserByIdUseCase;
  }
}
