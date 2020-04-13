package com.example.app_object.di.component;

import android.content.SharedPreferences;
import com.example.app_object.di.module.AppModule;
import com.example.app_object.di.module.AppModule_ProvideSpFactory;
import com.example.app_object.mvp.model.OkManagerModule;
import com.example.app_object.mvp.model.OkManagerModule_ProvideApiServiceFactory;
import com.example.app_object.mvp.model.OkManagerModule_ProvideOkClientFactory;
import com.example.app_object.mvp.model.api.ApiService;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<SharedPreferences> provideSpProvider;

  private Provider<OkHttpClient> provideOkClientProvider;

  private Provider<ApiService> provideApiServiceProvider;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideSpProvider =
        DoubleCheck.provider(AppModule_ProvideSpFactory.create(builder.appModule));

    this.provideOkClientProvider =
        DoubleCheck.provider(
            OkManagerModule_ProvideOkClientFactory.create(builder.okManagerModule));

    this.provideApiServiceProvider =
        DoubleCheck.provider(
            OkManagerModule_ProvideApiServiceFactory.create(builder.okManagerModule));
  }

  @Override
  public SharedPreferences provideSp() {
    return provideSpProvider.get();
  }

  @Override
  public OkHttpClient provideOk() {
    return provideOkClientProvider.get();
  }

  @Override
  public ApiService provideApiService() {
    return provideApiServiceProvider.get();
  }

  public static final class Builder {
    private AppModule appModule;

    private OkManagerModule okManagerModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      if (okManagerModule == null) {
        this.okManagerModule = new OkManagerModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder okManagerModule(OkManagerModule okManagerModule) {
      this.okManagerModule = Preconditions.checkNotNull(okManagerModule);
      return this;
    }
  }
}
