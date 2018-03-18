package pomodoro.wildnotion.com.pomodoro.data;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by schlendeus on 3/18/18.
 */

@RunWith(JUnit4.class)
public class TimerModelTest {

    private TimerModel timerModel;


    @Before
    public void setup() {
        TimerRepository timerRepository = mock(TimerRepository.class);
        timerModel = new TimerModel();
    }

    @Test
    public void testTimerStartsStopped() {
        assertTrue("Timer starts out stopped", timerModel.getStatus() == TimerModel.Status.STOPPED);
    }

    @Test
    public void testStartingTimerChangesStatus() {
        // This test is failing on purpose as an exercise for a class ;)

        timerModel.startTimer();
        assertTrue("Timer status changes to RUNNING", timerModel.getStatus() == TimerModel.Status.RUNNING);
    }
}