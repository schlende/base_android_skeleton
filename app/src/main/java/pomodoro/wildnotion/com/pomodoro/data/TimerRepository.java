package pomodoro.wildnotion.com.pomodoro.data;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import java.util.Timer;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by schlendeus on 3/16/18.
 */

@Singleton
public class TimerRepository {

    final TimerModel timerModel;
    final MutableLiveData<TimerModel> data = new MutableLiveData<>();

    public TimerRepository(){
        timerModel = new TimerModel();
        data.setValue(timerModel);
    }

    public LiveData<TimerModel> getTimerLiveData(){
        return data;
    }

    public TimerModel getTimerModel(){
        return timerModel;
    }
}
