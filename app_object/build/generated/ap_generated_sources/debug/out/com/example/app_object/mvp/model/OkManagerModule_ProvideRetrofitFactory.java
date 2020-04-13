package com.example.app_object.mvp.model;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OkManagerModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final OkManagerModule module;

  public OkManagerModule_ProvideRetrofitFactory(OkManagerModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.provideRetrofit(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Retrofit> create(OkManagerModule module) {
    return new OkManagerModule_ProvideRetrofitFactory(module);
  }
}
