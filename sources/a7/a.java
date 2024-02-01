package a7;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import com.google.android.exoplayer2.scheduler.Requirements;
import d.t0;
import w7.q0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f275a;

    /* renamed from: b  reason: collision with root package name */
    public final d f276b;

    /* renamed from: c  reason: collision with root package name */
    public final Requirements f277c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f278d = new Handler(q0.U());

    /* renamed from: e  reason: collision with root package name */
    public c f279e;

    /* renamed from: f  reason: collision with root package name */
    public int f280f;

    /* renamed from: g  reason: collision with root package name */
    public b f281g;

    @t0(api = 21)
    public final class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b() {
            if (a.this.f281g != null) {
                a.this.d();
            }
        }

        public final void c() {
            a.this.f278d.post(new b(this));
        }

        public void onAvailable(Network network) {
            c();
        }

        public void onLost(Network network) {
            c();
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                a.this.d();
            }
        }
    }

    public interface d {
        void a(a aVar, int i10);
    }

    public a(Context context, d dVar, Requirements requirements) {
        this.f275a = context.getApplicationContext();
        this.f276b = dVar;
        this.f277c = requirements;
    }

    public final void d() {
        int c10 = this.f277c.c(this.f275a);
        if (this.f280f != c10) {
            this.f280f = c10;
            this.f276b.a(this, c10);
        }
    }

    public Requirements e() {
        return this.f277c;
    }

    @TargetApi(23)
    public final void f() {
        NetworkRequest build = new NetworkRequest.Builder().addCapability(16).build();
        b bVar = new b();
        this.f281g = bVar;
        ((ConnectivityManager) w7.a.g((ConnectivityManager) this.f275a.getSystemService("connectivity"))).registerNetworkCallback(build, bVar);
    }

    public int g() {
        String str;
        this.f280f = this.f277c.c(this.f275a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.f277c.l()) {
            if (q0.f14786a >= 23) {
                f();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f277c.e()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f277c.h()) {
            if (q0.f14786a >= 23) {
                str = "android.os.action.DEVICE_IDLE_MODE_CHANGED";
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                str = "android.intent.action.SCREEN_OFF";
            }
            intentFilter.addAction(str);
        }
        c cVar = new c();
        this.f279e = cVar;
        this.f275a.registerReceiver(cVar, intentFilter, (String) null, this.f278d);
        return this.f280f;
    }

    public void h() {
        this.f275a.unregisterReceiver(this.f279e);
        this.f279e = null;
        if (this.f281g != null) {
            i();
        }
    }

    public final void i() {
        if (q0.f14786a >= 21) {
            ((ConnectivityManager) this.f275a.getSystemService("connectivity")).unregisterNetworkCallback(this.f281g);
            this.f281g = null;
        }
    }
}
