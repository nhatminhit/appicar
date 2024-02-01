package vn.icar.entertaiment.view.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import vn.icar.entertaiment.R;
import vn.icar.entertaiment.view.activity.HomeActivity;

public class EntertainmentAlusaWidget extends BaseAppWidgetProvider {
    public static void k(Context context, AppWidgetManager appWidgetManager, int i10) {
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, HomeActivity.class), 201326592);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_entertainment_alusa);
        remoteViews.setOnClickPendingIntent(R.id.imgLogo, activity);
        appWidgetManager.updateAppWidget(i10, remoteViews);
    }

    public void onDisabled(Context context) {
    }

    public void onEnabled(Context context) {
    }

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int k10 : iArr) {
            k(context, appWidgetManager, k10);
        }
    }
}
