package com.example.app_object.mvp.presenter;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomePresenter_MembersInjector implements MembersInjector<HomePresenter> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  public HomePresenter_MembersInjector(Provider<OkHttpClient> okHttpClientProvider) {
    assert okHttpClientProvider != null;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  public static MembersInjector<HomePresenter> create(Provider<OkHttpClient> okHttpClientProvider) {
    return new HomePresenter_MembersInjector(okHttpClientProvider);
  }

  @Override
  public void injectMembers(HomePresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.okHttpClient = okHttpClientProvider.get();
  }

  public static void injectOkHttpClient(
      HomePresenter instance, Provider<OkHttpClient> okHttpClientProvider) {
    instance.okHttpClient = okHttpClientProvider.get();
  }
}
