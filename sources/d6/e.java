package d6;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import d.o0;
import w7.q0;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6290a;

    /* renamed from: b  reason: collision with root package name */
    public final d f6291b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f6292c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final BroadcastReceiver f6293d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public final b f6294e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public d f6295f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6296g;

    public final class b extends ContentObserver {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f6297a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f6298b;

        public b(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f6297a = contentResolver;
            this.f6298b = uri;
        }

        public void a() {
            this.f6297a.registerContentObserver(this.f6298b, false, this);
        }

        public void b() {
            this.f6297a.unregisterContentObserver(this);
        }

        public void onChange(boolean z10) {
            e eVar = e.this;
            eVar.c(d.b(eVar.f6290a));
        }
    }

    public final class c extends BroadcastReceiver {
        public c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                e.this.c(d.c(context, intent));
            }
        }
    }

    public interface d {
        void a(d dVar);
    }

    public e(Context context, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f6290a = applicationContext;
        this.f6291b = (d) w7.a.g(dVar);
        Handler handler = new Handler(q0.U());
        this.f6292c = handler;
        b bVar = null;
        this.f6293d = q0.f14786a >= 21 ? new c() : null;
        Uri d10 = d.d();
        this.f6294e = d10 != null ? new b(handler, applicationContext.getContentResolver(), d10) : bVar;
    }

    public final void c(d dVar) {
        if (this.f6296g && !dVar.equals(this.f6295f)) {
            this.f6295f = dVar;
            this.f6291b.a(dVar);
        }
    }

    public d d() {
        if (this.f6296g) {
            return (d) w7.a.g(this.f6295f);
        }
        this.f6296g = true;
        b bVar = this.f6294e;
        if (bVar != null) {
            bVar.a();
        }
        Intent intent = null;
        if (this.f6293d != null) {
            intent = this.f6290a.registerReceiver(this.f6293d, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), (String) null, this.f6292c);
        }
        d c10 = d.c(this.f6290a, intent);
        this.f6295f = c10;
        return c10;
    }

    public void e() {
        if (this.f6296g) {
            this.f6295f = null;
            BroadcastReceiver broadcastReceiver = this.f6293d;
            if (broadcastReceiver != null) {
                this.f6290a.unregisterReceiver(broadcastReceiver);
            }
            b bVar = this.f6294e;
            if (bVar != null) {
                bVar.b();
            }
            this.f6296g = false;
        }
    }
}
