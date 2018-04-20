package com.runkevich8.gmail.presentation.screens.hw.hw10;

import android.content.Context;
import com.gmail.runkevich8.domain.interactor.AddNewUserUseCase;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddUserViewModel_MembersInjector implements MembersInjector<AddUserViewModel> {
  private final Provider<AddNewUserUseCase> addUserProvider;

  private final Provider<Context> contextProvider;

  public AddUserViewModel_MembersInjector(
      Provider<AddNewUserUseCase> addUserProvider, Provider<Context> contextProvider) {
    this.addUserProvider = addUserProvider;
    this.contextProvider = contextProvider;
  }

  public static MembersInjector<AddUserViewModel> create(
      Provider<AddNewUserUseCase> addUserProvider, Provider<Context> contextProvider) {
    return new AddUserViewModel_MembersInjector(addUserProvider, contextProvider);
  }

  @Override
  public void injectMembers(AddUserViewModel instance) {
    injectAddUser(instance, addUserProvider.get());
    injectContext(instance, contextProvider.get());
  }

  public static void injectAddUser(AddUserViewModel instance, AddNewUserUseCase addUser) {
    instance.addUser = addUser;
  }

  public static void injectContext(AddUserViewModel instance, Context context) {
    instance.context = context;
  }
}
