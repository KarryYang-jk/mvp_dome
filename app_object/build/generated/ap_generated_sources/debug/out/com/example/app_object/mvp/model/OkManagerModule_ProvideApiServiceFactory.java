package com.example.app_object.mvp.model;

import com.example.app_object.mvp.model.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OkManagerModule_ProvideApiServiceFactory implements Factory<ApiService> {
  private final OkManagerModule module;

  public OkManagerModule_ProvideApiServiceFactory(OkManagerModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ApiService get() {
    return Preconditions.checkNotNull(
        module.provideApiService(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ApiService> create(OkManagerModule module) {
    return new OkManagerModule_ProvideApiServiceFactory(module);
  }
}
