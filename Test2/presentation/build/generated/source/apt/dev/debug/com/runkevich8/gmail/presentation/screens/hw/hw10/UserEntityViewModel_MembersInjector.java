package com.runkevich8.gmail.presentation.screens.hw.hw10;

import android.content.Context;
import com.gmail.runkevich8.domain.interactor.GetUserListUseCase;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserEntityViewModel_MembersInjector
    implements MembersInjector<UserEntityViewModel> {
  private final Provider<GetUserListUseCase> profileListUseCaseProvider;

  private final Provider<Context> contextProvider;

  public UserEntityViewModel_MembersInjector(
      Provider<GetUserListUseCase> profileListUseCaseProvider, Provider<Context> contextProvider) {
    this.profileListUseCaseProvider = profileListUseCaseProvider;
    this.contextProvider = contextProvider;
  }

  public static MembersInjector<UserEntityViewModel> create(
      Provider<GetUserListUseCase> profileListUseCaseProvider, Provider<Context> contextProvider) {
    return new UserEntityViewModel_MembersInjector(profileListUseCaseProvider, contextProvider);
  }

  @Override
  public void injectMembers(UserEntityViewModel instance) {
    injectProfileListUseCase(instance, profileListUseCaseProvider.get());
    injectContext(instance, contextProvider.get());
  }

  public static void injectProfileListUseCase(
      UserEntityViewModel instance, GetUserListUseCase profileListUseCase) {
    instance.profileListUseCase = profileListUseCase;
  }

  public static void injectContext(UserEntityViewModel instance, Context context) {
    instance.context = context;
  }
}
