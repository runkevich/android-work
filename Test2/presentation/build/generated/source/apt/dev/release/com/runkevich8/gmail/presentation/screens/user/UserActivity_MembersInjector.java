package com.runkevich8.gmail.presentation.screens.user;

import com.gmail.runkevich8.data.sharedprefs.AppSharedPrefs;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserActivity_MembersInjector implements MembersInjector<UserActivity> {
  private final Provider<AppSharedPrefs> appSharedPrefsProvider;

  public UserActivity_MembersInjector(Provider<AppSharedPrefs> appSharedPrefsProvider) {
    this.appSharedPrefsProvider = appSharedPrefsProvider;
  }

  public static MembersInjector<UserActivity> create(
      Provider<AppSharedPrefs> appSharedPrefsProvider) {
    return new UserActivity_MembersInjector(appSharedPrefsProvider);
  }

  @Override
  public void injectMembers(UserActivity instance) {
    injectAppSharedPrefs(instance, appSharedPrefsProvider.get());
  }

  public static void injectAppSharedPrefs(UserActivity instance, AppSharedPrefs appSharedPrefs) {
    instance.appSharedPrefs = appSharedPrefs;
  }
}
