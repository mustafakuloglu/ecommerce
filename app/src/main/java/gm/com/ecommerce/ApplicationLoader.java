package gm.com.ecommerce;

import android.app.Application;
import android.content.Context;

/**
 * Created by musta on 28.07.2016.
 */
public class ApplicationLoader extends Application {

    public static volatile Context applicationContext = null;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = getApplicationContext();
    }
}