package c4;

import a4.j;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import d.g1;
import d.m0;
import g4.g;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import t4.m;
import v3.f;
import z3.e;

public final class a implements Runnable {
    @g1
    public static final String W = "PreFillRunner";
    public static final C0075a X = new C0075a();
    public static final long Y = 32;
    public static final long Z = 40;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f4806a0 = 4;

    /* renamed from: b0  reason: collision with root package name */
    public static final long f4807b0 = TimeUnit.SECONDS.toMillis(1);
    public final e O;
    public final j P;
    public final c Q;
    public final C0075a R;
    public final Set<d> S;
    public final Handler T;
    public long U;
    public boolean V;

    @g1
    /* renamed from: c4.a$a  reason: collision with other inner class name */
    public static class C0075a {
        public long a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    public static final class b implements f {
        public void a(@m0 MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public a(e eVar, j jVar, c cVar) {
        this(eVar, jVar, cVar, X, new Handler(Looper.getMainLooper()));
    }

    @g1
    public a(e eVar, j jVar, c cVar, C0075a aVar, Handler handler) {
        this.S = new HashSet();
        this.U = 40;
        this.O = eVar;
        this.P = jVar;
        this.Q = cVar;
        this.R = aVar;
        this.T = handler;
    }

    @g1
    public boolean a() {
        Bitmap bitmap;
        long a10 = this.R.a();
        while (!this.Q.b() && !e(a10)) {
            d c10 = this.Q.c();
            if (!this.S.contains(c10)) {
                this.S.add(c10);
                bitmap = this.O.g(c10.d(), c10.b(), c10.a());
            } else {
                bitmap = Bitmap.createBitmap(c10.d(), c10.b(), c10.a());
            }
            int h10 = m.h(bitmap);
            if (c() >= ((long) h10)) {
                this.P.g(new b(), g.f(bitmap, this.O));
            } else {
                this.O.d(bitmap);
            }
            if (Log.isLoggable(W, 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("allocated [");
                sb2.append(c10.d());
                sb2.append("x");
                sb2.append(c10.b());
                sb2.append("] ");
                sb2.append(c10.a());
                sb2.append(" size: ");
                sb2.append(h10);
            }
        }
        return !this.V && !this.Q.b();
    }

    public void b() {
        this.V = true;
    }

    public final long c() {
        return this.P.e() - this.P.d();
    }

    public final long d() {
        long j10 = this.U;
        this.U = Math.min(4 * j10, f4807b0);
        return j10;
    }

    public final boolean e(long j10) {
        return this.R.a() - j10 >= 32;
    }

    public void run() {
        if (a()) {
            this.T.postDelayed(this, d());
        }
    }
}
