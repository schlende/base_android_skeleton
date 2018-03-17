package pomodoro.wildnotion.com.pomodoro.di;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import dagger.Binds;
import dagger.Module;

import dagger.multibindings.IntoMap;
import pomodoro.wildnotion.com.pomodoro.ui.main.TimerViewModel;
import pomodoro.wildnotion.com.pomodoro.viewmodel.ViewModelFactory;


/**
 * Created by schlendeus on 3/16/18.
 */

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(TimerViewModel.class)
    abstract ViewModel bindsTimerViewModel(TimerViewModel movieDetailViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindsViewModelFactory(ViewModelFactory viewModelFactory);
}