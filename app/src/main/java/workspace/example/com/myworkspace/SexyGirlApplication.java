package workspace.example.com.myworkspace;

import android.app.Application;

/**
 * Created by ShiLiang on 2016/10/12.
 */
public class SexyGirlApplication extends Application {
    private static final String TAG = "SexyGirlApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        NetworkManager.init(getApplicationContext());
    }
}
