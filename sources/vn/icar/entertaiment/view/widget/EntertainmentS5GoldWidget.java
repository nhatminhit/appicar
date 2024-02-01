package vn.icar.entertaiment.view.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.widget.RemoteViews;
import vn.icar.entertaiment.R;
import vn.icar.entertaiment.view.activity.HomeActivity;
import wj.f;

public class EntertainmentS5GoldWidget extends BaseAppWidgetProvider {
    @SuppressLint({"RemoteViewLayout"})
    public static void k(Context context, AppWidgetManager appWidgetManager, int i10) {
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, HomeActivity.class), 201326592);
        String packageName = context.getPackageName();
        int i11 = Build.VERSION.SDK_INT;
        RemoteViews remoteViews = new RemoteViews(packageName, i11 >= 31 ? R.layout.widget_entertainment_s5_gold : R.layout.widget_entertainment_s4_gold);
        remoteViews.setOnClickPendingIntent(R.id.root_layout, activity);
        remoteViews.setImageViewResource(R.id.btn_play, f.f24351a ? R.drawable.ic_play_s5gold : R.drawable.ic_pause_s5gold);
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
            remoteViews.setImageViewResource(R.id.img_thumbnail, R.drawable.img_s5gold);
        } else {
            remoteViews.setImageViewBitmap(R.id.img_thumbnail, BaseAppWidgetProvider.d(BaseAppWidgetProvider.a(bitmap), (int) context.getResources().getDimension(R.dimen.size16dp)));
        }
        int i12 = 8;
        remoteViews.setViewVisibility(R.id.layout_app, BaseAppWidgetProvider.i() ? 0 : 8);
        remoteViews.setViewVisibility(R.id.img_logo, BaseAppWidgetProvider.i() ? 8 : 0);
        if (!BaseAppWidgetProvider.i()) {
            i12 = 0;
        }
        remoteViews.setViewVisibility(R.id.layout_space2, i12);
        if (i11 >= 31) {
            float f10 = 20.0f;
            if (BaseAppWidgetProvider.i()) {
                remoteViews.setViewLayoutWidth(R.id.img_app_icon, 32.0f, 0);
                remoteViews.setViewLayoutHeight(R.id.img_app_icon, 32.0f, 0);
                remoteViews.setTextViewTextSize(R.id.txt_app_name, 0, 20.0f);
            }
            remoteViews.setViewLayoutMargin(R.id.img_background, 4, 10.0f, 0);
            remoteViews.setViewLayoutMargin(R.id.img_background, 5, 3.0f, 0);
            remoteViews.setViewLayoutMargin(R.id.img_background, 1, 14.0f, 0);
            remoteViews.setViewLayoutMargin(R.id.img_background, 3, 14.0f, 0);
            remoteViews.setViewLayoutWidth(R.id.img_logo, 40.0f, 0);
            remoteViews.setViewLayoutHeight(R.id.img_logo, 40.0f, 0);
            remoteViews.setViewLayoutWidth(R.id.layout_space1, 26.0f, 0);
            remoteViews.setViewLayoutWidth(R.id.layout_space2, 16.0f, 0);
            float f11 = 146.0f;
            remoteViews.setViewLayoutWidth(R.id.img_thumbnail, BaseAppWidgetProvider.i() ? 126.0f : 146.0f, 0);
            if (BaseAppWidgetProvider.i()) {
                f11 = 126.0f;
            }
            remoteViews.setViewLayoutHeight(R.id.img_thumbnail, f11, 0);
            remoteViews.setTextViewTextSize(R.id.txt_title, 0, BaseAppWidgetProvider.i() ? 23.0f : 28.0f);
            if (BaseAppWidgetProvider.i()) {
                f10 = 16.0f;
            }
            remoteViews.setTextViewTextSize(R.id.txt_channel, 0, f10);
            float f12 = 50.0f;
            remoteViews.setViewLayoutWidth(R.id.btn_play, BaseAppWidgetProvider.i() ? 50.0f : 64.0f, 0);
            remoteViews.setViewLayoutHeight(R.id.btn_play, BaseAppWidgetProvider.i() ? 50.0f : 64.0f, 0);
            remoteViews.setViewLayoutWidth(R.id.btn_prev, BaseAppWidgetProvider.i() ? 50.0f : 64.0f, 0);
            remoteViews.setViewLayoutHeight(R.id.btn_prev, BaseAppWidgetProvider.i() ? 50.0f : 64.0f, 0);
            remoteViews.setViewLayoutWidth(R.id.btn_next, BaseAppWidgetProvider.i() ? 50.0f : 64.0f, 0);
            if (!BaseAppWidgetProvider.i()) {
                f12 = 64.0f;
            }
            remoteViews.setViewLayoutHeight(R.id.btn_next, f12, 0);
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
                for (int k10 : instance.getAppWidgetIds(new ComponentName(context, EntertainmentS5GoldWidget.class))) {
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
