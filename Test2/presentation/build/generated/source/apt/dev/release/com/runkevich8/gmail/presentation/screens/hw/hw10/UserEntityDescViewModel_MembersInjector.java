package com.runkevich8.gmail.presentation.screens.hw.hw10;

import android.content.Context;
import com.gmail.runkevich8.domain.interactor.GetUserByIdUseCase;
import com.gmail.runkevich8.domain.interactor.RemoveUserUseCase;
import com.gmail.runkevich8.domain.interactor.SaveUserUseCase;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserEntityDescViewModel_MembersInjector
    implements MembersInjector<UserEntityDescViewModel> {
  private final Provider<Context> contextProvider;

  private final Provider<GetUserByIdUseCase> userByIdProvider;

  private final Provider<SaveUserUseCase> saveUserProvider;

  private final Provider<RemoveUserUseCase> removeProvider;

  public UserEntityDescViewModel_MembersInjector(
      Provider<Context> contextProvider,
      Provider<GetUserByIdUseCase> userByIdProvider,
      Provider<SaveUserUseCase> saveUserProvider,
      Provider<RemoveUserUseCase> removeProvider) {
    this.contextProvider = contextProvider;
    this.userByIdProvider = userByIdProvider;
    this.saveUserProvider = saveUserProvider;
    this.removeProvider = removeProvider;
  }

  public static MembersInjector<UserEntityDescViewModel> create(
      Provider<Context> contextProvider,
      Provider<GetUserByIdUseCase> userByIdProvider,
      Provider<SaveUserUseCase> saveUserProvider,
      Provider<RemoveUserUseCase> removeProvider) {
    return new UserEntityDescViewModel_MembersInjector(
        contextProvider, userByIdProvider, saveUserProvider, removeProvider);
  }

  @Override
  public void injectMembers(UserEntityDescViewModel instance) {
    injectContext(instance, contextProvider.get());
    injectUserById(instance, userByIdProvider.get());
    injectSaveUser(instance, saveUserProvider.get());
    injectRemove(instance, removeProvider.get());
  }

  public static void injectContext(UserEntityDescViewModel instance, Context context) {
    instance.context = context;
  }

  public static void injectUserById(UserEntityDescViewModel instance, GetUserByIdUseCase userById) {
    instance.userById = userById;
  }

  public static void injectSaveUser(UserEntityDescViewModel instance, SaveUserUseCase saveUser) {
    instance.saveUser = saveUser;
  }

  public static void injectRemove(UserEntityDescViewModel instance, RemoveUserUseCase remove) {
    instance.remove = remove;
  }
}
