package endsstudios.simpledagger2.model.car;

import android.util.Log;

import javax.inject.Inject;

import endsstudios.simpledagger2.model.Car;
import endsstudios.simpledagger2.model.Engine;

/**
 * Created by MEHMET on 19.09.2017.
 */

public class MercedesCar implements Car {

    Engine engine;

    @Inject
    public MercedesCar(Engine engine){
        this.engine = engine;
    }


    @Override
    public void start() {
        engine.turnOn();
        Log.v("Dagger2","Mercedes Car start");
    }

    @Override
    public void stop() {
        engine.turnOff();
        Log.v("Dagger2","Mercedes Car stop");
    }
}
