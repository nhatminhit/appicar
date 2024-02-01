package i6;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import b6.c;
import b6.d;
import b6.n0;
import b6.x0;
import d.o0;
import i6.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import w7.a;

public abstract class f implements b.k {

    /* renamed from: g  reason: collision with root package name */
    public static final long f9179g = 3000;

    /* renamed from: h  reason: collision with root package name */
    public static final int f9180h = 10;

    /* renamed from: c  reason: collision with root package name */
    public final MediaSessionCompat f9181c;

    /* renamed from: d  reason: collision with root package name */
    public final x0.c f9182d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9183e;

    /* renamed from: f  reason: collision with root package name */
    public long f9184f;

    public f(MediaSessionCompat mediaSessionCompat) {
        this(mediaSessionCompat, 10);
    }

    public f(MediaSessionCompat mediaSessionCompat, int i10) {
        a.i(i10 > 0);
        this.f9181c = mediaSessionCompat;
        this.f9183e = i10;
        this.f9184f = -1;
        this.f9182d = new x0.c();
    }

    public void b(n0 n0Var, d dVar, long j10) {
        int i10;
        x0 t02 = n0Var.t0();
        if (!t02.r() && !n0Var.m() && (i10 = (int) j10) >= 0 && i10 < t02.q()) {
            dVar.b(n0Var, i10, c.f4201b);
        }
    }

    public long c(n0 n0Var) {
        boolean z10;
        boolean z11;
        x0 t02 = n0Var.t0();
        boolean z12 = false;
        if (t02.r() || n0Var.m()) {
            z10 = false;
            z11 = false;
        } else {
            t02.n(n0Var.Q(), this.f9182d);
            boolean z13 = t02.q() > 1;
            x0.c cVar = this.f9182d;
            z11 = cVar.f4501d || !cVar.f4502e || n0Var.hasPrevious();
            if (this.f9182d.f4502e || n0Var.hasNext()) {
                z12 = true;
            }
            z10 = z12;
            z12 = z13;
        }
        long j10 = 0;
        if (z12) {
            j10 = PlaybackStateCompat.f556m0;
        }
        if (z11) {
            j10 |= 16;
        }
        return z10 ? j10 | 32 : j10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r2.f4501d == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(b6.n0 r7, b6.d r8) {
        /*
            r6 = this;
            b6.x0 r0 = r7.t0()
            boolean r1 = r0.r()
            if (r1 != 0) goto L_0x0043
            boolean r1 = r7.m()
            if (r1 == 0) goto L_0x0011
            goto L_0x0043
        L_0x0011:
            int r1 = r7.Q()
            b6.x0$c r2 = r6.f9182d
            r0.n(r1, r2)
            int r0 = r7.c0()
            r2 = -1
            if (r0 == r2) goto L_0x003e
            long r2 = r7.getCurrentPosition()
            r4 = 3000(0xbb8, double:1.482E-320)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0035
            b6.x0$c r2 = r6.f9182d
            boolean r3 = r2.f4502e
            if (r3 == 0) goto L_0x003e
            boolean r2 = r2.f4501d
            if (r2 != 0) goto L_0x003e
        L_0x0035:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.b(r7, r0, r1)
            goto L_0x0043
        L_0x003e:
            r2 = 0
            r8.b(r7, r1, r2)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.f.f(b6.n0, b6.d):void");
    }

    public final long g(@o0 n0 n0Var) {
        return this.f9184f;
    }

    public void h(n0 n0Var, d dVar) {
        x0 t02 = n0Var.t0();
        if (!t02.r() && !n0Var.m()) {
            int Q = n0Var.Q();
            int n02 = n0Var.n0();
            if (n02 != -1) {
                dVar.b(n0Var, n02, c.f4201b);
            } else if (t02.n(Q, this.f9182d).f4502e) {
                dVar.b(n0Var, Q, c.f4201b);
            }
        }
    }

    public final void j(n0 n0Var) {
        if (this.f9184f == -1 || n0Var.t0().q() > this.f9183e) {
            t(n0Var);
        } else if (!n0Var.t0().r()) {
            this.f9184f = (long) n0Var.Q();
        }
    }

    public final void k(n0 n0Var) {
        t(n0Var);
    }

    public boolean n(n0 n0Var, d dVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        return false;
    }

    public abstract MediaDescriptionCompat s(n0 n0Var, int i10);

    public final void t(n0 n0Var) {
        x0 t02 = n0Var.t0();
        if (t02.r()) {
            this.f9181c.z(Collections.emptyList());
            this.f9184f = -1;
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int min = Math.min(this.f9183e, t02.q());
        int Q = n0Var.Q();
        long j10 = (long) Q;
        arrayDeque.add(new MediaSessionCompat.QueueItem(s(n0Var, Q), j10));
        boolean z02 = n0Var.z0();
        int i10 = Q;
        while (true) {
            if (!(Q == -1 && i10 == -1) && arrayDeque.size() < min) {
                if (!(i10 == -1 || (i10 = t02.e(i10, 0, z02)) == -1)) {
                    arrayDeque.add(new MediaSessionCompat.QueueItem(s(n0Var, i10), (long) i10));
                }
                if (!(Q == -1 || arrayDeque.size() >= min || (Q = t02.l(Q, 0, z02)) == -1)) {
                    arrayDeque.addFirst(new MediaSessionCompat.QueueItem(s(n0Var, Q), (long) Q));
                }
            }
        }
        this.f9181c.z(new ArrayList(arrayDeque));
        this.f9184f = j10;
    }
}
