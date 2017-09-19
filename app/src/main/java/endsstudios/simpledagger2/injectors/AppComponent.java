package endsstudios.simpledagger2.injectors;

import javax.inject.Singleton;

import dagger.Component;
import endsstudios.simpledagger2.view.MainActivity;

/**
 * Created by MEHMET on 19.09.2017.
 */

@Singleton @Component(modules = AppModule.class)
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
