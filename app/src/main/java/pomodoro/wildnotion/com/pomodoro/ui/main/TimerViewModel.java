package pomodoro.wildnotion.com.pomodoro.ui.main;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import javax.inject.Inject;

import pomodoro.wildnotion.com.pomodoro.data.TimerModel;
import pomodoro.wildnotion.com.pomodoro.data.TimerRepository;

/**
 * Created by schlendeus on 3/17/18.
 */

public class TimerViewModel extends ViewModel {
    private final LiveData<TimerModel> timerModel;

    @Inject
    public TimerViewModel(TimerRepository repository){
        timerModel = repository.getTimerLiveData();
    }

    public LiveData<TimerModel> getTimerModel(){
        return timerModel;
    }
}
