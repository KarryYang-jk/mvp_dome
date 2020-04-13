package com.example.app_object.mvp.model;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OkManagerModule_ProvideOkClientFactory implements Factory<OkHttpClient> {
  private final OkManagerModule module;

  public OkManagerModule_ProvideOkClientFactory(OkManagerModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideOkClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(OkManagerModule module) {
    return new OkManagerModule_ProvideOkClientFactory(module);
  }
}
