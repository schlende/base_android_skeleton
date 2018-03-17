package pomodoro.wildnotion.com.pomodoro.di;

/**
 * Created by schlendeus on 3/16/18.
 */

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import pomodoro.wildnotion.com.pomodoro.PomodoroApp;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilderModule.class
})

public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(PomodoroApp pomodoroApp);
}