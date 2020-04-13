package com.example.app_object.di.component;

import com.example.app_object.mvp.model.RxOperateImpl;
import com.example.app_object.mvp.model.RxOperateImpl_MembersInjector;
import com.example.app_object.mvp.model.api.ApiService;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerRxOperateComponent implements RxOperateComponent {
  private Provider<ApiService> provideApiServiceProvider;

  private MembersInjector<RxOperateImpl> rxOperateImplMembersInjector;

  private DaggerRxOperateComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideApiServiceProvider =
        new Factory<ApiService>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public ApiService get() {
            return Preconditions.checkNotNull(
                appComponent.provideApiService(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.rxOperateImplMembersInjector =
        RxOperateImpl_MembersInjector.create(provideApiServiceProvider);
  }

  @Override
  public void inject(RxOperateImpl rxOperate) {
    rxOperateImplMembersInjector.injectMembers(rxOperate);
  }

  public static final class Builder {
    private AppComponent appComponent;

    private Builder() {}

    public RxOperateComponent build() {
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerRxOperateComponent(this);
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
