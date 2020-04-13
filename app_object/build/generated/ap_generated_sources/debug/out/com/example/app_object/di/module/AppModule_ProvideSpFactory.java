package com.example.app_object.di.module;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideSpFactory implements Factory<SharedPreferences> {
  private final AppModule module;

  public AppModule_ProvideSpFactory(AppModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SharedPreferences get() {
    return Preconditions.checkNotNull(
        module.provideSp(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SharedPreferences> create(AppModule module) {
    return new AppModule_ProvideSpFactory(module);
  }
}
