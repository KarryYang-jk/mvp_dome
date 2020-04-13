package com.example.app_object.di.component;

import com.example.app_object.mvp.presenter.HomePresenter;
import com.example.app_object.mvp.presenter.HomePresenter_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerHomeComponent implements HomeComponent {
  private Provider<OkHttpClient> provideOkProvider;

  private MembersInjector<HomePresenter> homePresenterMembersInjector;

  private DaggerHomeComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideOkProvider =
        new Factory<OkHttpClient>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public OkHttpClient get() {
            return Preconditions.checkNotNull(
                appComponent.provideOk(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.homePresenterMembersInjector = HomePresenter_MembersInjector.create(provideOkProvider);
  }

  @Override
  public void inject(HomePresenter homePresenter) {
    homePresenterMembersInjector.injectMembers(homePresenter);
  }

  public static final class Builder {
    private AppComponent appComponent;

    private Builder() {}

    public HomeComponent build() {
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerHomeComponent(this);
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
