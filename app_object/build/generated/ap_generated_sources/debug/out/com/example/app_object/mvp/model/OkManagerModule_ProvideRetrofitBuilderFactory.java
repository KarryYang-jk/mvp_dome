package com.example.app_object.mvp.model;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OkManagerModule_ProvideRetrofitBuilderFactory
    implements Factory<Retrofit.Builder> {
  private final OkManagerModule module;

  public OkManagerModule_ProvideRetrofitBuilderFactory(OkManagerModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Retrofit.Builder get() {
    return Preconditions.checkNotNull(
        module.provideRetrofitBuilder(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Retrofit.Builder> create(OkManagerModule module) {
    return new OkManagerModule_ProvideRetrofitBuilderFactory(module);
  }
}
