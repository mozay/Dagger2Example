package endsstudios.simpledagger2.injectors;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import endsstudios.simpledagger2.Dagger2Application;
import endsstudios.simpledagger2.model.Car;
import endsstudios.simpledagger2.model.Engine;
import endsstudios.simpledagger2.model.car.BMWCar;
import endsstudios.simpledagger2.model.car.MercedesCar;
import endsstudios.simpledagger2.model.engine.PetrolEngine;

/**
 * Created by MEHMET on 19.09.2017.
 */

@Module
public class AppModule {

    private final Dagger2Application dagger2Application;

    public AppModule(Dagger2Application dagger2Application) {
        this.dagger2Application = dagger2Application;
    }

    @Provides @Singleton
    Dagger2Application provideApp(){
        return dagger2Application;
    }

    @Provides @Singleton
    Engine provideEngine(){
        return new PetrolEngine();
    }

    @Provides
    @Singleton
    Car provideCar(Engine engine){
        return new MercedesCar(engine);
    }


}
