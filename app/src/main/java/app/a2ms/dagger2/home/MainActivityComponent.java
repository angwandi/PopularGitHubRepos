package app.a2ms.dagger2.home;

import app.a2ms.dagger2.di.ActivityScope;
import app.a2ms.dagger2.ui.NavigationModule;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@ActivityScope
@Subcomponent(modules = {
        MainScreenBindingModule.class,
        NavigationModule.class,
})
public interface MainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
        //Prevents Injecting MainActivity in other classes
        @Override
        public void seedInstance(MainActivity instance) {

        }
    }
}
