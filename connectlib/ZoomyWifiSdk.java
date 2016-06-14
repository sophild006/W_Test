package com.zoomy.wifi.connectlib;

import android.content.Context;

import com.zoomy.wifi.connectlib.utils.GlobalContext;
import com.zoomy.wifi.connectlib.wificore.ZoomyWifiManager;

/**
 * Created by csc on 16/6/6.
 */
public class ZoomyWifiSdk {

    private static ZoomyWifiManager mWifiManager;

    // call init function in application
    public static void init(Context context) {
        GlobalContext.setAppContext(context.getApplicationContext());
        mWifiManager = new ZoomyWifiManager(context.getApplicationContext());
    }

    public static ZoomyWifiManager getWifiManager() {
        return mWifiManager;
    }

}
