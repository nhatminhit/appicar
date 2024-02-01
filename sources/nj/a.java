package nj;

import ad.d;
import aj.a;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.widget.RemoteViews;
import hj.a;
import ji.a;
import vn.icar.entertaiment.R;
import vn.icar.entertaiment.view.activity.HomeActivity;
import vn.icar.entertaiment.view.widget.EntertainmentAlusaWidget;
import vn.icar.entertaiment.view.widget.EntertainmentQ5Widget;
import vn.icar.entertaiment.view.widget.EntertainmentS503Widget;
import vn.icar.entertaiment.view.widget.EntertainmentS5GoldWidget;
import vn.icar.entertaiment.view.widget.EntertainmentVinfastWidget;
import vn.icar.entertaiment.view.widget.EntertainmentWidget;
import vn.icar.entertaiment.view.widget.EventWidgetRemoteViewsService;
import vn.icar.entertaiment.view.widget.ListTabWidgetRemoteViewService;
import wj.f;

public class a {

    /* renamed from: n  reason: collision with root package name */
    public static final String f21292n = "WidgetController";

    /* renamed from: o  reason: collision with root package name */
    public static a f21293o = null;

    /* renamed from: p  reason: collision with root package name */
    public static final int f21294p = 0;

    /* renamed from: q  reason: collision with root package name */
    public static final int f21295q = 1;

    /* renamed from: r  reason: collision with root package name */
    public static final int f21296r = 2;

    /* renamed from: s  reason: collision with root package name */
    public static int f21297s;

    /* renamed from: a  reason: collision with root package name */
    public Context f21298a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f21299b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21300c = false;

    /* renamed from: d  reason: collision with root package name */
    public AppWidgetManager f21301d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21302e = false;

    /* renamed from: f  reason: collision with root package name */
    public String f21303f = "";

    /* renamed from: g  reason: collision with root package name */
    public String f21304g = "";

    /* renamed from: h  reason: collision with root package name */
    public String f21305h = "";

    /* renamed from: i  reason: collision with root package name */
    public String f21306i = "";

    /* renamed from: j  reason: collision with root package name */
    public String f21307j = "";

    /* renamed from: k  reason: collision with root package name */
    public float f21308k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f21309l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    public String f21310m = "";

    /* renamed from: nj.a$a  reason: collision with other inner class name */
    public class C0373a implements a.d {
        public C0373a() {
        }

        public void a(Bitmap bitmap) {
            hj.a.f(a.this.f21298a).d();
            a.this.j(bitmap);
        }
    }

    public a(Context context) {
        int i10;
        this.f21298a = context;
        this.f21301d = AppWidgetManager.getInstance(context);
        if (ej.a.b().c() == 0.0d) {
            ej.a.b().G(context);
        }
        double c10 = ej.a.b().c();
        if (c10 > 2.4d) {
            i10 = 1;
        } else if (c10 > 1.4d) {
            f21297s = 0;
            m();
        } else {
            i10 = 2;
        }
        f21297s = i10;
        m();
    }

    public static a d(Context context) {
        if (f21293o == null) {
            f21293o = new a(context);
        }
        return f21293o;
    }

    public final Bitmap b(Bitmap bitmap) {
        return bitmap.getWidth() >= bitmap.getHeight() ? Bitmap.createBitmap(bitmap, (bitmap.getWidth() / 2) - (bitmap.getHeight() / 2), 0, bitmap.getHeight(), bitmap.getHeight()) : Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() / 2) - (bitmap.getWidth() / 2), bitmap.getWidth(), bitmap.getWidth());
    }

    public final int c() {
        return Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
    }

    public Bitmap e(Bitmap bitmap, int i10) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float f10 = (float) i10;
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f10, f10, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    public final RemoteViews f(int i10, int i11) {
        return f21297s != 1 ? new RemoteViews(this.f21298a.getPackageName(), i10) : new RemoteViews(this.f21298a.getPackageName(), i11);
    }

    public final RemoteViews g(int i10, int i11, int i12) {
        int i13 = f21297s;
        return i13 != 1 ? i13 != 2 ? new RemoteViews(this.f21298a.getPackageName(), i10) : new RemoteViews(this.f21298a.getPackageName(), i12) : new RemoteViews(this.f21298a.getPackageName(), i11);
    }

    public void h() {
        int i10;
        int i11;
        int i12;
        int i13;
        Class<HomeActivity> cls = HomeActivity.class;
        d.e(f21292n, a.C0341a.f19973a);
        RemoteViews f10 = f(R.layout.widget_entertainment, R.layout.widget_entertainment_long);
        int[] appWidgetIds = this.f21301d.getAppWidgetIds(new ComponentName(this.f21298a, EntertainmentWidget.class));
        int length = appWidgetIds.length;
        int i14 = 0;
        while (true) {
            i10 = R.id.txtCategories;
            i11 = 8;
            i12 = R.id.listTab;
            if (i14 >= length) {
                break;
            }
            int i15 = appWidgetIds[i14];
            if (this.f21299b) {
                f10.setViewVisibility(R.id.viewListRadio, 0);
                f10.setViewVisibility(R.id.viewTab, 8);
            } else {
                f10.setViewVisibility(R.id.viewListRadio, 8);
                f10.setViewVisibility(R.id.viewTab, 0);
            }
            if (this.f21300c) {
                f10.setViewVisibility(R.id.listTab, 0);
            } else {
                f10.setViewVisibility(R.id.listTab, 8);
            }
            f10.setTextViewText(R.id.txtCategories, this.f21303f);
            f10.setTextViewText(R.id.txtChannels, this.f21304g);
            f10.setTextViewText(R.id.txtList, this.f21298a.getResources().getString(R.string.playlists));
            f10.setTextViewText(R.id.txtTimeVideo, this.f21306i);
            f10.setTextViewText(R.id.txtTimePlaingVideo, this.f21307j);
            f10.setProgressBar(R.id.progressBar, (int) this.f21309l, (int) this.f21308k, false);
            f10.setTextViewText(R.id.txtChannel, this.f21305h);
            f10.setImageViewResource(R.id.imgPlay, this.f21302e ? R.drawable.ic_play : R.drawable.ic_pause);
            f10.setRemoteAdapter(R.id.listTab, new Intent(this.f21298a, ListTabWidgetRemoteViewService.class));
            f10.setPendingIntentTemplate(R.id.listTab, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.ACTION_OPEN_LIST_TAB"), c()));
            this.f21301d.notifyAppWidgetViewDataChanged(i15, R.id.listTab);
            f10.setOnClickPendingIntent(R.id.viewDown, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.EVENT_LIST_TAB"), c()));
            f10.setOnClickPendingIntent(R.id.viewRadio, PendingIntent.getActivity(this.f21298a, 0, new Intent(this.f21298a, cls), 0));
            f10.setRemoteAdapter(i15, R.id.widgetListchannels, new Intent(this.f21298a, EventWidgetRemoteViewsService.class));
            f10.setPendingIntentTemplate(R.id.widgetListchannels, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.ACTION_OPEN_LIST"), c()));
            this.f21301d.notifyAppWidgetViewDataChanged(i15, R.id.widgetListchannels);
            f10.setOnClickPendingIntent(R.id.imgPlay, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.PLAY_PAUSE"), c()));
            f10.setOnClickPendingIntent(R.id.imgback, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.BACK"), c()));
            f10.setOnClickPendingIntent(R.id.imgnext, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.NEXT"), c()));
            this.f21301d.updateAppWidget(i15, f10);
            f10.setOnClickPendingIntent(R.id.imgList, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.OPEN_LIST"), c()));
            f10.setOnClickPendingIntent(R.id.imgClose, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.CLOSE_LIST"), c()));
            this.f21301d.updateAppWidget(i15, f10);
            i14++;
        }
        RemoteViews remoteViews = new RemoteViews(this.f21298a.getPackageName(), R.layout.widget_entertainment_alusa);
        int[] appWidgetIds2 = this.f21301d.getAppWidgetIds(new ComponentName(this.f21298a, EntertainmentAlusaWidget.class));
        int length2 = appWidgetIds2.length;
        int i16 = 0;
        while (i16 < length2) {
            int i17 = appWidgetIds2[i16];
            if (this.f21299b) {
                remoteViews.setViewVisibility(R.id.viewListRadio, 0);
                remoteViews.setViewVisibility(R.id.viewTab, i11);
            } else {
                remoteViews.setViewVisibility(R.id.viewListRadio, i11);
                remoteViews.setViewVisibility(R.id.viewTab, 0);
            }
            if (this.f21300c) {
                remoteViews.setViewVisibility(i12, 0);
            } else {
                remoteViews.setViewVisibility(i12, i11);
            }
            remoteViews.setTextViewText(i10, this.f21303f);
            remoteViews.setTextViewText(R.id.txtChannels, this.f21304g);
            remoteViews.setTextViewText(R.id.txtList, this.f21298a.getResources().getString(R.string.playlists));
            remoteViews.setTextViewText(R.id.txtTimeVideo, this.f21306i);
            remoteViews.setTextViewText(R.id.txtTimePlaingVideo, this.f21307j);
            remoteViews.setProgressBar(R.id.progressBar, (int) this.f21309l, (int) this.f21308k, false);
            remoteViews.setTextViewText(R.id.txtChannel, this.f21305h);
            remoteViews.setImageViewResource(R.id.imgPlay, this.f21302e ? R.drawable.ic_play : R.drawable.ic_pause);
            remoteViews.setRemoteAdapter(i12, new Intent(this.f21298a, ListTabWidgetRemoteViewService.class));
            remoteViews.setPendingIntentTemplate(i12, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.ACTION_OPEN_LIST_TAB"), c()));
            this.f21301d.notifyAppWidgetViewDataChanged(i17, i12);
            remoteViews.setOnClickPendingIntent(R.id.viewDown, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.EVENT_LIST_TAB"), c()));
            remoteViews.setOnClickPendingIntent(R.id.viewRadio, PendingIntent.getActivity(this.f21298a, 0, new Intent(this.f21298a, cls), 0));
            remoteViews.setRemoteAdapter(i17, R.id.widgetListchannels, new Intent(this.f21298a, EventWidgetRemoteViewsService.class));
            remoteViews.setPendingIntentTemplate(R.id.widgetListchannels, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.ACTION_OPEN_LIST"), c()));
            this.f21301d.notifyAppWidgetViewDataChanged(i17, R.id.widgetListchannels);
            remoteViews.setOnClickPendingIntent(R.id.imgPlay, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.PLAY_PAUSE"), c()));
            remoteViews.setOnClickPendingIntent(R.id.imgback, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.BACK"), c()));
            remoteViews.setOnClickPendingIntent(R.id.imgnext, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.NEXT"), c()));
            this.f21301d.updateAppWidget(i17, remoteViews);
            remoteViews.setOnClickPendingIntent(R.id.imgList, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.OPEN_LIST"), c()));
            remoteViews.setOnClickPendingIntent(R.id.imgClose, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.CLOSE_LIST"), c()));
            this.f21301d.updateAppWidget(i17, remoteViews);
            i16++;
            i11 = 8;
            i12 = R.id.listTab;
            i10 = R.id.txtCategories;
        }
        RemoteViews remoteViews2 = new RemoteViews(this.f21298a.getPackageName(), R.layout.widget_entertainment_vinfast);
        for (int i18 : this.f21301d.getAppWidgetIds(new ComponentName(this.f21298a, EntertainmentVinfastWidget.class))) {
            if (this.f21299b) {
                remoteViews2.setViewVisibility(R.id.viewListRadio, 0);
                i13 = 8;
                remoteViews2.setViewVisibility(R.id.viewTab, 8);
            } else {
                i13 = 8;
                remoteViews2.setViewVisibility(R.id.viewListRadio, 8);
                remoteViews2.setViewVisibility(R.id.viewTab, 0);
            }
            if (this.f21300c) {
                remoteViews2.setViewVisibility(R.id.listTab, 0);
            } else {
                remoteViews2.setViewVisibility(R.id.listTab, i13);
            }
            remoteViews2.setTextViewText(R.id.txtCategories, this.f21303f);
            remoteViews2.setTextViewText(R.id.txtChannels, this.f21304g);
            remoteViews2.setTextViewText(R.id.txtList, this.f21298a.getResources().getString(R.string.playlists));
            remoteViews2.setTextViewText(R.id.txtTimeVideo, this.f21306i);
            remoteViews2.setTextViewText(R.id.txtTimePlaingVideo, this.f21307j);
            remoteViews2.setProgressBar(R.id.progressBar, (int) this.f21309l, (int) this.f21308k, false);
            remoteViews2.setTextViewText(R.id.txtChannel, this.f21305h);
            if (this.f21302e) {
                remoteViews2.setImageViewResource(R.id.imgPlay, R.drawable.ic_play);
            } else {
                remoteViews2.setImageViewResource(R.id.imgPlay, R.drawable.ic_pause);
            }
            remoteViews2.setRemoteAdapter(R.id.listTab, new Intent(this.f21298a, ListTabWidgetRemoteViewService.class));
            remoteViews2.setPendingIntentTemplate(R.id.listTab, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.ACTION_OPEN_LIST_TAB"), c()));
            this.f21301d.notifyAppWidgetViewDataChanged(i18, R.id.listTab);
            remoteViews2.setOnClickPendingIntent(R.id.viewDown, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.EVENT_LIST_TAB"), c()));
            remoteViews2.setOnClickPendingIntent(R.id.viewRadio, PendingIntent.getActivity(this.f21298a, 0, new Intent(this.f21298a, cls), 0));
            remoteViews2.setRemoteAdapter(i18, R.id.widgetListchannels, new Intent(this.f21298a, EventWidgetRemoteViewsService.class));
            remoteViews2.setPendingIntentTemplate(R.id.widgetListchannels, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.ACTION_OPEN_LIST"), c()));
            this.f21301d.notifyAppWidgetViewDataChanged(i18, R.id.widgetListchannels);
            remoteViews2.setOnClickPendingIntent(R.id.imgPlay, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.PLAY_PAUSE"), c()));
            remoteViews2.setOnClickPendingIntent(R.id.imgback, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.BACK"), c()));
            remoteViews2.setOnClickPendingIntent(R.id.imgnext, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.NEXT"), c()));
            this.f21301d.updateAppWidget(i18, remoteViews2);
            remoteViews2.setOnClickPendingIntent(R.id.imgList, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.OPEN_LIST"), c()));
            remoteViews2.setOnClickPendingIntent(R.id.imgClose, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.CLOSE_LIST"), c()));
            this.f21301d.updateAppWidget(i18, remoteViews2);
        }
    }

    public void i(String str) {
        if (!str.equals("") && !this.f21310m.equals(str)) {
            this.f21310m = str;
            if (str.equals(a.e.f16179k)) {
                f.f24352b = null;
                this.f21298a.sendBroadcast(new Intent(this.f21298a, EntertainmentS503Widget.class).setAction("vn.icar.entertainment.widget.REFRESH"));
                this.f21298a.sendBroadcast(new Intent(this.f21298a, EntertainmentS5GoldWidget.class).setAction("vn.icar.entertainment.widget.REFRESH"));
                this.f21298a.sendBroadcast(new Intent(this.f21298a, EntertainmentQ5Widget.class).setAction("vn.icar.entertainment.widget.REFRESH"));
                return;
            }
            hj.a.f(this.f21298a).a(new C0373a(), str);
        }
    }

    public void j(Bitmap bitmap) {
        f.f24352b = bitmap;
        this.f21298a.sendBroadcast(new Intent(this.f21298a, EntertainmentS503Widget.class).setAction("vn.icar.entertainment.widget.REFRESH"));
        this.f21298a.sendBroadcast(new Intent(this.f21298a, EntertainmentS5GoldWidget.class).setAction("vn.icar.entertainment.widget.REFRESH"));
        this.f21298a.sendBroadcast(new Intent(this.f21298a, EntertainmentQ5Widget.class).setAction("vn.icar.entertainment.widget.REFRESH"));
    }

    public void k(boolean z10) {
        if (z10) {
            if (this.f21300c) {
                this.f21300c = false;
            } else {
                this.f21300c = true;
            }
        } else if (this.f21299b) {
            this.f21299b = false;
        } else {
            this.f21299b = true;
        }
    }

    public void l(boolean z10, String str, String str2, float f10, float f11, String str3, String str4, String str5) {
        int i10;
        int i11;
        boolean z11 = z10;
        String str6 = str;
        String str7 = str2;
        float f12 = f10;
        float f13 = f11;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        this.f21302e = z11;
        this.f21305h = str8;
        this.f21303f = str6;
        this.f21304g = str7;
        this.f21308k = f12;
        this.f21309l = f13;
        this.f21307j = str10;
        this.f21306i = str9;
        RemoteViews f14 = f(R.layout.widget_entertainment, R.layout.widget_entertainment_long);
        int[] appWidgetIds = this.f21301d.getAppWidgetIds(new ComponentName(this.f21298a, EntertainmentWidget.class));
        int length = appWidgetIds.length;
        int i12 = 0;
        while (true) {
            i10 = R.id.txtChannels;
            i11 = R.id.txtCategories;
            if (i12 >= length) {
                break;
            }
            int i13 = appWidgetIds[i12];
            f14.setTextViewText(R.id.txtCategories, str6);
            f14.setTextViewText(R.id.txtChannels, str7);
            f14.setTextViewText(R.id.txtList, this.f21298a.getResources().getString(R.string.playlists));
            f14.setTextViewText(R.id.txtTimeVideo, str9);
            f14.setTextViewText(R.id.txtTimePlaingVideo, str10);
            int[] iArr = appWidgetIds;
            int i14 = length;
            f14.setProgressBar(R.id.progressBar, (int) f13, (int) f12, false);
            f14.setTextViewText(R.id.txtChannel, str8);
            f14.setImageViewResource(R.id.imgPlay, z11 ? R.drawable.ic_play : R.drawable.ic_pause);
            this.f21301d.updateAppWidget(i13, f14);
            i12++;
            appWidgetIds = iArr;
            length = i14;
        }
        RemoteViews remoteViews = new RemoteViews(this.f21298a.getPackageName(), R.layout.widget_entertainment_alusa);
        int[] appWidgetIds2 = this.f21301d.getAppWidgetIds(new ComponentName(this.f21298a, EntertainmentAlusaWidget.class));
        int length2 = appWidgetIds2.length;
        int i15 = 0;
        while (i15 < length2) {
            int i16 = appWidgetIds2[i15];
            remoteViews.setTextViewText(i11, str6);
            remoteViews.setTextViewText(i10, str7);
            remoteViews.setTextViewText(R.id.txtList, this.f21298a.getResources().getString(R.string.playlists));
            remoteViews.setTextViewText(R.id.txtTimeVideo, str9);
            remoteViews.setTextViewText(R.id.txtTimePlaingVideo, str10);
            int[] iArr2 = appWidgetIds2;
            int i17 = length2;
            remoteViews.setProgressBar(R.id.progressBar, (int) f13, (int) f12, false);
            remoteViews.setTextViewText(R.id.txtChannel, str8);
            remoteViews.setImageViewResource(R.id.imgPlay, z11 ? R.drawable.ic_play : R.drawable.ic_pause);
            this.f21301d.updateAppWidget(i16, remoteViews);
            i15++;
            appWidgetIds2 = iArr2;
            length2 = i17;
            i10 = R.id.txtChannels;
            i11 = R.id.txtCategories;
        }
        RemoteViews remoteViews2 = new RemoteViews(this.f21298a.getPackageName(), R.layout.widget_entertainment_vinfast);
        int[] appWidgetIds3 = this.f21301d.getAppWidgetIds(new ComponentName(this.f21298a, EntertainmentVinfastWidget.class));
        int length3 = appWidgetIds3.length;
        int i18 = 0;
        while (i18 < length3) {
            int i19 = appWidgetIds3[i18];
            remoteViews2.setTextViewText(R.id.txtCategories, str6);
            remoteViews2.setTextViewText(R.id.txtChannels, str7);
            remoteViews2.setTextViewText(R.id.txtList, this.f21298a.getResources().getString(R.string.playlists));
            remoteViews2.setTextViewText(R.id.txtTimeVideo, str9);
            remoteViews2.setTextViewText(R.id.txtTimePlaingVideo, str10);
            remoteViews2.setProgressBar(R.id.progressBar, (int) f13, (int) f12, false);
            remoteViews2.setTextViewText(R.id.txtChannel, str8);
            if (z11) {
                remoteViews2.setImageViewResource(R.id.imgPlay, R.drawable.ic_play);
            } else {
                remoteViews2.setImageViewResource(R.id.imgPlay, R.drawable.ic_pause);
            }
            this.f21301d.updateAppWidget(i19, remoteViews2);
            i18++;
            str6 = str;
            f12 = f10;
        }
        f.f24351a = z11;
        f.f24353c = str8;
        f.f24354d = str7;
        this.f21298a.sendBroadcast(new Intent(this.f21298a, EntertainmentS503Widget.class).setAction("vn.icar.entertainment.widget.REFRESH"));
        this.f21298a.sendBroadcast(new Intent(this.f21298a, EntertainmentS5GoldWidget.class).setAction("vn.icar.entertainment.widget.REFRESH"));
        this.f21298a.sendBroadcast(new Intent(this.f21298a, EntertainmentQ5Widget.class).setAction("vn.icar.entertainment.widget.REFRESH"));
        m();
    }

    public void m() {
        String str;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Class<HomeActivity> cls = HomeActivity.class;
        RemoteViews f10 = f(R.layout.widget_entertainment, R.layout.widget_entertainment_long);
        int[] appWidgetIds = this.f21301d.getAppWidgetIds(new ComponentName(this.f21298a, EntertainmentWidget.class));
        int length = appWidgetIds.length;
        int i22 = 0;
        while (true) {
            str = "vn.icar.entertaiment.ACTION_OPEN_LIST_TAB";
            i10 = R.id.viewListRadio;
            if (i22 >= length) {
                break;
            }
            int i23 = appWidgetIds[i22];
            int[] iArr2 = appWidgetIds;
            if (this.f21299b) {
                f10.setViewVisibility(R.id.viewListRadio, 0);
                i20 = 8;
                f10.setViewVisibility(R.id.viewTab, 8);
                i18 = length;
                i19 = 0;
            } else {
                i18 = length;
                i20 = 8;
                f10.setViewVisibility(R.id.viewListRadio, 8);
                i19 = 0;
                f10.setViewVisibility(R.id.viewTab, 0);
            }
            if (this.f21300c) {
                i21 = R.id.listTab;
                f10.setViewVisibility(R.id.listTab, i19);
            } else {
                i21 = R.id.listTab;
                f10.setViewVisibility(R.id.listTab, i20);
            }
            f10.setRemoteAdapter(i21, new Intent(this.f21298a, ListTabWidgetRemoteViewService.class));
            f10.setPendingIntentTemplate(i21, PendingIntent.getBroadcast(this.f21298a, 0, new Intent(str), c()));
            this.f21301d.notifyAppWidgetViewDataChanged(i23, i21);
            f10.setOnClickPendingIntent(R.id.viewDown, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.EVENT_LIST_TAB"), c()));
            f10.setOnClickPendingIntent(R.id.viewRadio, PendingIntent.getActivity(this.f21298a, 0, new Intent(this.f21298a, cls), c()));
            f10.setRemoteAdapter(i23, R.id.widgetListchannels, new Intent(this.f21298a, EventWidgetRemoteViewsService.class));
            f10.setPendingIntentTemplate(R.id.widgetListchannels, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.ACTION_OPEN_LIST"), c()));
            this.f21301d.notifyAppWidgetViewDataChanged(i23, R.id.widgetListchannels);
            f10.setOnClickPendingIntent(R.id.imgPlay, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.PLAY_PAUSE"), c()));
            f10.setOnClickPendingIntent(R.id.imgback, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.BACK"), c()));
            f10.setOnClickPendingIntent(R.id.imgnext, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.NEXT"), c()));
            this.f21301d.updateAppWidget(i23, f10);
            f10.setOnClickPendingIntent(R.id.imgList, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.OPEN_LIST"), c()));
            f10.setOnClickPendingIntent(R.id.imgClose, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.CLOSE_LIST"), c()));
            this.f21301d.updateAppWidget(i23, f10);
            i22++;
            appWidgetIds = iArr2;
            length = i18;
        }
        RemoteViews remoteViews = new RemoteViews(this.f21298a.getPackageName(), R.layout.widget_entertainment_alusa);
        int[] appWidgetIds2 = this.f21301d.getAppWidgetIds(new ComponentName(this.f21298a, EntertainmentAlusaWidget.class));
        int length2 = appWidgetIds2.length;
        int i24 = 0;
        while (i24 < length2) {
            int i25 = appWidgetIds2[i24];
            int[] iArr3 = appWidgetIds2;
            if (this.f21299b) {
                remoteViews.setViewVisibility(i10, 0);
                i15 = 8;
                remoteViews.setViewVisibility(R.id.viewTab, 8);
                i14 = length2;
                i16 = 0;
            } else {
                i14 = length2;
                int i26 = i10;
                i15 = 8;
                remoteViews.setViewVisibility(i26, 8);
                i16 = 0;
                remoteViews.setViewVisibility(R.id.viewTab, 0);
            }
            if (this.f21300c) {
                i17 = R.id.listTab;
                remoteViews.setViewVisibility(R.id.listTab, i16);
            } else {
                i17 = R.id.listTab;
                remoteViews.setViewVisibility(R.id.listTab, i15);
            }
            remoteViews.setRemoteAdapter(i17, new Intent(this.f21298a, ListTabWidgetRemoteViewService.class));
            remoteViews.setPendingIntentTemplate(i17, PendingIntent.getBroadcast(this.f21298a, 0, new Intent(str), c()));
            this.f21301d.notifyAppWidgetViewDataChanged(i25, i17);
            remoteViews.setOnClickPendingIntent(R.id.viewDown, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.EVENT_LIST_TAB"), c()));
            remoteViews.setOnClickPendingIntent(R.id.viewRadio, PendingIntent.getActivity(this.f21298a, 0, new Intent(this.f21298a, cls), c()));
            remoteViews.setRemoteAdapter(i25, R.id.widgetListchannels, new Intent(this.f21298a, EventWidgetRemoteViewsService.class));
            remoteViews.setPendingIntentTemplate(R.id.widgetListchannels, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.ACTION_OPEN_LIST"), c()));
            this.f21301d.notifyAppWidgetViewDataChanged(i25, R.id.widgetListchannels);
            remoteViews.setOnClickPendingIntent(R.id.imgPlay, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.PLAY_PAUSE"), c()));
            remoteViews.setOnClickPendingIntent(R.id.imgback, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.BACK"), c()));
            remoteViews.setOnClickPendingIntent(R.id.imgnext, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.NEXT"), c()));
            this.f21301d.updateAppWidget(i25, remoteViews);
            remoteViews.setOnClickPendingIntent(R.id.imgList, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.OPEN_LIST"), c()));
            remoteViews.setOnClickPendingIntent(R.id.imgClose, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.CLOSE_LIST"), c()));
            this.f21301d.updateAppWidget(i25, remoteViews);
            i24++;
            appWidgetIds2 = iArr3;
            length2 = i14;
            str = str;
            i10 = R.id.viewListRadio;
        }
        String str2 = str;
        RemoteViews remoteViews2 = new RemoteViews(this.f21298a.getPackageName(), R.layout.widget_entertainment_vinfast);
        int[] appWidgetIds3 = this.f21301d.getAppWidgetIds(new ComponentName(this.f21298a, EntertainmentVinfastWidget.class));
        int i27 = 0;
        for (int length3 = appWidgetIds3.length; i27 < length3; length3 = length3) {
            int i28 = appWidgetIds3[i27];
            if (this.f21299b) {
                remoteViews2.setViewVisibility(R.id.viewListRadio, 0);
                i11 = 8;
                remoteViews2.setViewVisibility(R.id.viewTab, 8);
                iArr = appWidgetIds3;
                i12 = 0;
            } else {
                iArr = appWidgetIds3;
                i11 = 8;
                remoteViews2.setViewVisibility(R.id.viewListRadio, 8);
                i12 = 0;
                remoteViews2.setViewVisibility(R.id.viewTab, 0);
            }
            if (this.f21300c) {
                i13 = R.id.listTab;
                remoteViews2.setViewVisibility(R.id.listTab, i12);
            } else {
                i13 = R.id.listTab;
                remoteViews2.setViewVisibility(R.id.listTab, i11);
            }
            remoteViews2.setRemoteAdapter(i13, new Intent(this.f21298a, ListTabWidgetRemoteViewService.class));
            remoteViews2.setPendingIntentTemplate(i13, PendingIntent.getBroadcast(this.f21298a, 0, new Intent(str2), c()));
            this.f21301d.notifyAppWidgetViewDataChanged(i28, i13);
            remoteViews2.setOnClickPendingIntent(R.id.viewDown, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.EVENT_LIST_TAB"), c()));
            remoteViews2.setOnClickPendingIntent(R.id.viewRadio, PendingIntent.getActivity(this.f21298a, 0, new Intent(this.f21298a, cls), c()));
            remoteViews2.setRemoteAdapter(i28, R.id.widgetListchannels, new Intent(this.f21298a, EventWidgetRemoteViewsService.class));
            remoteViews2.setPendingIntentTemplate(R.id.widgetListchannels, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.ACTION_OPEN_LIST"), c()));
            this.f21301d.notifyAppWidgetViewDataChanged(i28, R.id.widgetListchannels);
            remoteViews2.setOnClickPendingIntent(R.id.imgPlay, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.PLAY_PAUSE"), c()));
            remoteViews2.setOnClickPendingIntent(R.id.imgback, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.BACK"), c()));
            remoteViews2.setOnClickPendingIntent(R.id.imgnext, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.NEXT"), c()));
            this.f21301d.updateAppWidget(i28, remoteViews2);
            remoteViews2.setOnClickPendingIntent(R.id.imgList, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.OPEN_LIST"), c()));
            remoteViews2.setOnClickPendingIntent(R.id.imgClose, PendingIntent.getBroadcast(this.f21298a, 0, new Intent("vn.icar.entertaiment.CLOSE_LIST"), c()));
            this.f21301d.updateAppWidget(i28, remoteViews2);
            i27++;
            appWidgetIds3 = iArr;
        }
    }
}
