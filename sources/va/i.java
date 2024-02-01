package va;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

public final class i {

    /* renamed from: g  reason: collision with root package name */
    public static final String f23543g = "i";

    /* renamed from: h  reason: collision with root package name */
    public static final long f23544h = 300000;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23545a;

    /* renamed from: b  reason: collision with root package name */
    public final BroadcastReceiver f23546b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23547c = false;

    /* renamed from: d  reason: collision with root package name */
    public Handler f23548d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f23549e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f23550f;

    public final class b extends BroadcastReceiver {
        public b() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(boolean z10) {
            i.this.f(z10);
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                i.this.f23548d.post(new j(this, intent.getIntExtra("plugged", -1) <= 0));
            }
        }
    }

    public i(Context context, Runnable runnable) {
        this.f23545a = context;
        this.f23549e = runnable;
        this.f23546b = new b();
        this.f23548d = new Handler();
    }

    public void c() {
        e();
        if (this.f23550f) {
            this.f23548d.postDelayed(this.f23549e, f23544h);
        }
    }

    public void d() {
        e();
        i();
    }

    public final void e() {
        this.f23548d.removeCallbacksAndMessages((Object) null);
    }

    public final void f(boolean z10) {
        this.f23550f = z10;
        if (this.f23547c) {
            c();
        }
    }

    public final void g() {
        if (!this.f23547c) {
            this.f23545a.registerReceiver(this.f23546b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f23547c = true;
        }
    }

    public void h() {
        g();
        c();
    }

    public final void i() {
        if (this.f23547c) {
            this.f23545a.unregisterReceiver(this.f23546b);
            this.f23547c = false;
        }
    }
}
