package androidx.media.session;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import androidx.media.MediaBrowserServiceCompat;
import d.x0;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3031a = "MediaButtonReceiver";

    public static class a extends MediaBrowserCompat.b {

        /* renamed from: c  reason: collision with root package name */
        public final Context f3032c;

        /* renamed from: d  reason: collision with root package name */
        public final Intent f3033d;

        /* renamed from: e  reason: collision with root package name */
        public final BroadcastReceiver.PendingResult f3034e;

        /* renamed from: f  reason: collision with root package name */
        public MediaBrowserCompat f3035f;

        public a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f3032c = context;
            this.f3033d = intent;
            this.f3034e = pendingResult;
        }

        public void a() {
            try {
                new MediaControllerCompat(this.f3032c, this.f3035f.h()).d((KeyEvent) this.f3033d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException unused) {
            }
            e();
        }

        public void b() {
            e();
        }

        public void c() {
            e();
        }

        public final void e() {
            this.f3035f.b();
            this.f3034e.finish();
        }

        public void f(MediaBrowserCompat mediaBrowserCompat) {
            this.f3035f = mediaBrowserCompat;
        }
    }

    public static PendingIntent a(Context context, long j10) {
        ComponentName c10 = c(context);
        if (c10 == null) {
            return null;
        }
        return b(context, c10, j10);
    }

    public static PendingIntent b(Context context, ComponentName componentName, long j10) {
        if (componentName == null) {
            return null;
        }
        int r10 = PlaybackStateCompat.r(j10);
        if (r10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot build a media button pending intent with the given action: ");
            sb2.append(j10);
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, r10));
        return PendingIntent.getBroadcast(context, r10, intent, 0);
    }

    @x0({x0.a.O})
    public static ComponentName c(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        queryBroadcastReceivers.size();
        return null;
    }

    public static ComponentName d(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    public static KeyEvent e(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.e().d(keyEvent);
        return keyEvent;
    }

    public static void f(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            ComponentName unused = context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Ignore unsupported intent: ");
            sb2.append(intent);
            return;
        }
        ComponentName d10 = d(context, "android.intent.action.MEDIA_BUTTON");
        if (d10 != null) {
            intent.setComponent(d10);
            f(context, intent);
            return;
        }
        ComponentName d11 = d(context, MediaBrowserServiceCompat.W);
        if (d11 != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            a aVar = new a(applicationContext, intent, goAsync);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, d11, aVar, (Bundle) null);
            aVar.f(mediaBrowserCompat);
            mediaBrowserCompat.a();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
}
