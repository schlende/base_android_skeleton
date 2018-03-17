package pomodoro.wildnotion.com.pomodoro.data;

import android.databinding.BaseObservable;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by schlendeus on 3/17/18.
 */

public class TimerModel extends BaseObservable {

    private int currentTimeInSeconds = 0;
    private Timer timer;


    public TimerModel(){
        timer = new Timer("pomodoroTimer",true);
    }

    public String getCurrentTimeInSeconds(){
        return String.valueOf(currentTimeInSeconds);
    }

    public void setCurrentTimeInSeconds(int currentTimeInSeconds) {
        this.currentTimeInSeconds = currentTimeInSeconds;
        this.notifyChange();
    }

    public void startTimer(){
        timer.scheduleAtFixedRate(timerTask, 0, 1000);
    }

    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            currentTimeInSeconds += 1;
            TimerModel.this.notifyChange();
        }
    };
}
