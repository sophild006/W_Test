package com.zoomy.wifi.connectlib;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by csc on 16/6/6.
 */
public class ZoomyWifiConstant {
    public static final boolean DEBUG = true;

    public static final String KEY = "wifi:validate:key";

    public static final int INVALID_NETWORK_ID = -1;
    public static final int INVALID_RSSI = -127;
    public static final String INVALID_BSSID = "00:00:00:00:00:00";

    public static final int MIN_RSSI = -100;
    public static final int MAX_RSSI = -55;

    // 加密方式
    public static final int SECURITY_NONE = 0;
    public static final int SECURITY_WEP = 1;
    public static final int SECURITY_PSK = 2;
    public static final int SECURITY_EAP = 3;

    // wifitype
    public static final String TYPE_ZOOMY = "zoomywifi";
    public static final String TYPE_AIRPORT = "airportwifi";
    public static final String TYPE_WIFIID = "wifiidwifi";

    // wifi分类
    public enum FreeWifiType implements Parcelable {
        UNKNOWN, ZOOMY_WIFI, AIRPORT_WIFI, WIFI_ID_WIFI;

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(name());
        }

        public static final Creator<FreeWifiType> CREATOR = new Creator<FreeWifiType>() {
            public FreeWifiType createFromParcel(Parcel in) {
                return FreeWifiType.valueOf(in.readString());
            }

            public FreeWifiType[] newArray(int size) {
                return new FreeWifiType[size];
            }
        };
    }

    public enum APCheckResult implements Parcelable {
        UNKNOWN, SUCCESS, FAIL, LOGIN, TIMEOUT;

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(name());
        }

        public static final Creator<APCheckResult> CREATOR = new Creator<APCheckResult>() {
            public APCheckResult createFromParcel(Parcel in) {
                return APCheckResult.valueOf(in.readString());
            }

            public APCheckResult[] newArray(int size) {
                return new APCheckResult[size];
            }
        };
    }

    public static final int WIFI_RESCAN_INTERVAL_MS = 60 * 1000;


    public static final int MAX_PRIORITY = 99999;

    public static final String DEFAULT_CHARSET = "UTF-8";
    public static final String KEY_ASS_APIVER = "0.4";


    public static final String APPLE_TEST_WAN = "http://www.apple.com/library/test/success.html";
    public static final String TEST_WIFI_DEVICE = "http://192.168.100.1/wifibox/udisk/web/util/ajax.php?type=wlan&time=1800";

    public static String PREF_NAME = "WifiKernel";

    public static class PrefKey {
        public static String LAST_TIME_CHECK_DB_SPACE = "last_time_check_db_space";
    }
}
