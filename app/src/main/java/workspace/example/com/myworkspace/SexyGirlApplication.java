package workspace.example.com.myworkspace;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by ShiLiang on 2016/10/12.
 */
public class SexyGirlApplication extends Application {
    private static final String TAG = "SexyGirlApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        NetworkManager.init(getApplicationContext());
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
        getChannel();
    }
    public void getChannel() {
        PackageManager pm = getPackageManager();
        try {
            PackageInfo packageInfo = pm.getPackageInfo(getPackageName(), PackageManager.GET_META_DATA);
            Bundle metaData = packageInfo.applicationInfo.metaData;
            String data = (String) metaData.get("CHANNEL");
            Log.d(TAG, "getChannel: " + data);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
