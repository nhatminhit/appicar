package vn.icar.entertaiment.utils;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class ApplicationClass extends Application {
    public static final String O = "CHANNEL_1";
    public static final String P = "CHANNEL_2";
    public static final String Q = "NEXT";
    public static final String R = "PREVIOUS";
    public static final String S = "PLAY";

    public final void a() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(O, "Channel(1)", 4);
            notificationChannel.setDescription("Channel 1 Description");
            NotificationChannel notificationChannel2 = new NotificationChannel(P, "Channel(2)", 4);
            notificationChannel2.setDescription("Channel 2 Description");
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(notificationChannel);
            notificationManager.createNotificationChannel(notificationChannel2);
        }
    }

    public void onCreate() {
        super.onCreate();
        a();
    }
}
