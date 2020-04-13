package com.example.app_object.mvp.model;

import com.example.app_object.mvp.model.api.ApiService;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RxOperateImpl_MembersInjector implements MembersInjector<RxOperateImpl> {
  private final Provider<ApiService> mApiServiceProvider;

  public RxOperateImpl_MembersInjector(Provider<ApiService> mApiServiceProvider) {
    assert mApiServiceProvider != null;
    this.mApiServiceProvider = mApiServiceProvider;
  }

  public static MembersInjector<RxOperateImpl> create(Provider<ApiService> mApiServiceProvider) {
    return new RxOperateImpl_MembersInjector(mApiServiceProvider);
  }

  @Override
  public void injectMembers(RxOperateImpl instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mApiService = mApiServiceProvider.get();
  }

  public static void injectMApiService(
      RxOperateImpl instance, Provider<ApiService> mApiServiceProvider) {
    instance.mApiService = mApiServiceProvider.get();
  }
}
