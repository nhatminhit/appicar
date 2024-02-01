package vn.icar.entertaiment.view.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import vn.icar.entertaiment.R;
import vn.icar.entertaiment.view.activity.HomeActivity;
import wj.f;

public class EntertainmentQ5Widget extends BaseAppWidgetProvider {
    @SuppressLint({"RemoteViewLayout"})
    public static void k(Context context, AppWidgetManager appWidgetManager, int i10) {
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, HomeActivity.class), 201326592);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_entertainment_q5);
        remoteViews.setOnClickPendingIntent(R.id.root_layout, activity);
        remoteViews.setImageViewResource(R.id.btn_play, f.f24351a ? R.drawable.ic_play_s503 : R.drawable.ic_pause_s503);
        remoteViews.setOnClickPendingIntent(R.id.btn_play, PendingIntent.getBroadcast(context, 0, new Intent("vn.icar.entertaiment.PLAY_PAUSE"), BaseAppWidgetProvider.b()));
        remoteViews.setOnClickPendingIntent(R.id.btn_prev, PendingIntent.getBroadcast(context, 0, new Intent("vn.icar.entertaiment.BACK"), BaseAppWidgetProvider.b()));
        remoteViews.setOnClickPendingIntent(R.id.btn_next, PendingIntent.getBroadcast(context, 0, new Intent("vn.icar.entertaiment.NEXT"), BaseAppWidgetProvider.b()));
        String str = f.f24353c;
        if (str == null || str.equals("")) {
            f.f24353c = context.getString(R.string.text_no_media);
        }
        String str2 = f.f24354d;
        if (str2 == null || str2.equals("")) {
            f.f24354d = context.getString(R.string.text_no_channel);
        }
        remoteViews.setTextViewText(R.id.txt_title, f.f24353c);
        remoteViews.setTextViewText(R.id.txt_channel, f.f24354d);
        Bitmap bitmap = f.f24352b;
        if (bitmap == null) {
            remoteViews.setImageViewResource(R.id.img_thumbnail, R.drawable.thumbnail_media_q5);
        } else {
            remoteViews.setImageViewBitmap(R.id.img_thumbnail, BaseAppWidgetProvider.c(BaseAppWidgetProvider.a(bitmap)));
        }
        appWidgetManager.updateAppWidget(i10, remoteViews);
    }

    public void onDisabled(Context context) {
    }

    public void onEnabled(Context context) {
    }

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if (intent != null && intent.getAction() != null) {
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("vn.icar.entertainment.widget.REFRESH")) {
                AppWidgetManager instance = AppWidgetManager.getInstance(context);
                for (int k10 : instance.getAppWidgetIds(new ComponentName(context, EntertainmentQ5Widget.class))) {
                    k(context, instance, k10);
                }
            }
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int k10 : iArr) {
            k(context, appWidgetManager, k10);
        }
    }
}
