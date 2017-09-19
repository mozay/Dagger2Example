package endsstudios.simpledagger2;

import android.app.Application;

import endsstudios.simpledagger2.injectors.AppComponent;
import endsstudios.simpledagger2.injectors.AppModule;
import endsstudios.simpledagger2.injectors.DaggerAppComponent;

/**
 * Created by MEHMET on 19.09.2017.
 */

public class Dagger2Application extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initializeInjector();

    }

    private void initializeInjector(){
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
