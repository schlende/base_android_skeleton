package pomodoro.wildnotion.com.pomodoro.ui.main;

import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import pomodoro.wildnotion.com.pomodoro.R;
import pomodoro.wildnotion.com.pomodoro.data.TimerRepository;
import pomodoro.wildnotion.com.pomodoro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Inject
    ViewModelProvider.Factory viewModelFactory;

    @Inject
    TimerRepository repository;

    LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);

    ActivityMainBinding binding;

    TimerViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setEventHandler(this);

        viewModel = ViewModelProviders.of(this, viewModelFactory).get(TimerViewModel.class);

        viewModel.getTimerModel()
                .observe(this, timerModel -> binding.setTimer(timerModel));
    }

    @Override
    public LifecycleRegistry getLifecycle() {
        return lifecycleRegistry;
    }

    public void handleChangeTimeClicked(){
        repository.getTimerModel().startTimer();
        Toast.makeText(this, "Clicked", Toast.LENGTH_LONG).show();
    }
}
