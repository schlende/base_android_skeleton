package pomodoro.wildnotion.com.pomodoro.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pomodoro.wildnotion.com.pomodoro.data.TimerRepository;

/**
 * Created by schlendeus on 3/16/18.
 */

@Module(includes = ViewModelModule.class)
public class AppModule {
    @Provides
    @Singleton
    TimerRepository provideTimerRepository(){
        return new TimerRepository();
    }
}