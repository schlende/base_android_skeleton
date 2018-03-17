package pomodoro.wildnotion.com.pomodoro.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import pomodoro.wildnotion.com.pomodoro.ui.main.MainActivity;

/**
 * Created by schlendeus on 3/16/18.
 */


@Module
public abstract class ActivityBuilderModule {
    @ContributesAndroidInjector(modules = {FragmentBuilderModule.class, AndroidSupportInjectionModule.class})
    abstract MainActivity mainActivity();
}