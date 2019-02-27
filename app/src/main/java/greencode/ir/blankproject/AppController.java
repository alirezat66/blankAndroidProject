package greencode.ir.blankproject;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class AppController extends MultiDexApplication {
    private static final String TAG = AppController.class.getSimpleName();

    public Bitmap cropped = null;
    private Thread.UncaughtExceptionHandler defaultUEH;
    private static Activity CurrentActivity = null;
    private static Context CurrentContext;
    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder().setDefaultFontPath("iransansmobilefanum.ttf").setFontAttrId(R.attr.fontPath).build());
        MultiDex.install(this);
        sContext = getApplicationContext();

    }
    public static Context getContext() {
        return sContext;
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(base);
    }
    public static void setActivityContext(Activity activity, Context context) {
        CurrentActivity = activity;
        CurrentContext = context;
    }

    public static Activity getCurrentActivity() {
        return CurrentActivity;
    }
}
