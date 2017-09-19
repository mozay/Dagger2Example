package endsstudios.simpledagger2.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import endsstudios.simpledagger2.Dagger2Application;
import endsstudios.simpledagger2.R;
import endsstudios.simpledagger2.model.Car;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inject();

        car.start();
        car.stop();


    }

    private void inject(){
        Dagger2Application app = (Dagger2Application) getApplication();
        app.getAppComponent().inject(this);
    }

}
