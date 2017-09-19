package endsstudios.simpledagger2.model.engine;

import android.util.Log;

import endsstudios.simpledagger2.model.Engine;

/**
 * Created by MEHMET on 19.09.2017.
 */

public class PetrolEngine implements Engine {
    @Override
    public void turnOn() {
        Log.v("Dagger2","Petrol Engine turn on");
    }

    @Override
    public void turnOff() {
        Log.v("Dagger2","Petrol Engine turn off");
    }
}
