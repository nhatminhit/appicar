package com.tatv.baseapp.service;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import cd.b;
import cd.c;
import cd.d;
import h0.u0;

public abstract class BaseService extends Service implements d {
    public static String S = "BaseService";
    public static final /* synthetic */ boolean T = false;
    public BroadcastReceiver O;
    public Context P;
    public mc.a Q;
    public b R;

    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            BaseService.this.n(context, intent);
        }
    }

    static {
        Class<BaseService> cls = BaseService.class;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m(String str) {
        Toast.makeText(getApplicationContext(), str, 0).show();
    }

    public /* synthetic */ void G(int i10) {
        c.a(this, i10);
    }

    public void J(long j10) {
    }

    public void f(boolean z10) {
    }

    public final void g() {
        stopForeground(true);
    }

    @SuppressLint({"WrongConstant", "InvalidWakeLockTag", "UnspecifiedImmutableFlag"})
    public void h(Context context, String str, String str2, String str3, int i10, Class cls, Class cls2, String str4) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, 0);
            notificationChannel.setLockscreenVisibility(0);
            ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(notificationChannel);
            startForeground(1, new u0.g(context, str).C(false).g0(true).r0(i10).N(str3).M(PendingIntent.getActivity(context, 0, new Intent(context, cls), 201326592)).i0(5).F(u0.f8548z0).F(u0.f8548z0).a(i10, "Close", PendingIntent.getService(context, 0, new Intent(this, cls2).setAction(str4), 335544320)).h());
            return;
        }
        startForeground(2, new Notification.Builder(context).setAutoCancel(false).setOngoing(true).setSmallIcon(i10).setContentText(str3).setContentIntent(PendingIntent.getActivity(context, 0, new Intent(context, cls), 201326592)).setPriority(2).build());
    }

    public abstract String[] i();

    public <T extends mc.a> T j() {
        return this.Q;
    }

    public void k() {
        this.P = this;
        this.Q = new mc.a(this);
        o();
        b bVar = new b(this.P);
        this.R = bVar;
        bVar.c(new b.C0267b(S, this));
    }

    public boolean l() {
        return this.R.k();
    }

    public abstract void n(Context context, Intent intent);

    public void o() {
        this.O = new a();
        IntentFilter intentFilter = new IntentFilter();
        for (String addAction : i()) {
            intentFilter.addAction(addAction);
        }
        try {
            registerReceiver(this.O, intentFilter);
        } catch (Exception e10) {
            ad.d.c(S, e10.getMessage());
        }
    }

    public void onCreate() {
        super.onCreate();
        k();
    }

    public void onDestroy() {
        super.onDestroy();
        BroadcastReceiver broadcastReceiver = this.O;
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e10) {
                e10.getMessage();
            }
        }
        this.R.o(S);
    }

    public void p(String str) {
        new Handler(Looper.getMainLooper()).post(new rc.b(this, str));
    }
}
