package com.example.app_object.mvp.model;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OkManagerModule_ProvideOkBuilderFactory
    implements Factory<OkHttpClient.Builder> {
  private final OkManagerModule module;

  public OkManagerModule_ProvideOkBuilderFactory(OkManagerModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OkHttpClient.Builder get() {
    return Preconditions.checkNotNull(
        module.provideOkBuilder(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient.Builder> create(OkManagerModule module) {
    return new OkManagerModule_ProvideOkBuilderFactory(module);
  }
}
