package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.appcompat.widget.a1;
import b6.l0;
import b6.m0;
import b6.n0;
import b6.x0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.ui.d;
import d.o0;
import d.u;
import h0.k2;
import h0.u0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p2.a;
import q7.m;
import w7.q0;

public class c {
    public static final String O = "com.google.android.exoplayer.play";
    public static final String P = "com.google.android.exoplayer.pause";
    public static final String Q = "com.google.android.exoplayer.prev";
    public static final String R = "com.google.android.exoplayer.next";
    public static final String S = "com.google.android.exoplayer.ffwd";
    public static final String T = "com.google.android.exoplayer.rewind";
    public static final String U = "com.google.android.exoplayer.stop";
    public static final String V = "INSTANCE_ID";
    public static final String W = "com.google.android.exoplayer.dismiss";
    public static final int X = 15000;
    public static final int Y = 5000;
    public static final long Z = 3000;

    /* renamed from: a0  reason: collision with root package name */
    public static int f5535a0;
    public boolean A;
    public boolean B;
    public long C;
    public long D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    @u
    public int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public int N;

    /* renamed from: a  reason: collision with root package name */
    public final Context f5536a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5537b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5538c;

    /* renamed from: d  reason: collision with root package name */
    public final d f5539d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public final C0090c f5540e;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f5541f;

    /* renamed from: g  reason: collision with root package name */
    public final k2 f5542g;

    /* renamed from: h  reason: collision with root package name */
    public final IntentFilter f5543h;

    /* renamed from: i  reason: collision with root package name */
    public final n0.d f5544i;

    /* renamed from: j  reason: collision with root package name */
    public final e f5545j;

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, u0.b> f5546k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, u0.b> f5547l;

    /* renamed from: m  reason: collision with root package name */
    public final PendingIntent f5548m;

    /* renamed from: n  reason: collision with root package name */
    public final int f5549n;

    /* renamed from: o  reason: collision with root package name */
    public final x0.c f5550o;
    @o0

    /* renamed from: p  reason: collision with root package name */
    public u0.g f5551p;
    @o0

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<u0.b> f5552q;
    @o0

    /* renamed from: r  reason: collision with root package name */
    public n0 f5553r;
    @o0

    /* renamed from: s  reason: collision with root package name */
    public m0 f5554s;

    /* renamed from: t  reason: collision with root package name */
    public b6.d f5555t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5556u;

    /* renamed from: v  reason: collision with root package name */
    public int f5557v;
    @o0

    /* renamed from: w  reason: collision with root package name */
    public f f5558w;
    @o0

    /* renamed from: x  reason: collision with root package name */
    public MediaSessionCompat.Token f5559x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5560y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f5561z;

    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5562a;

        public b(int i10) {
            this.f5562a = i10;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(Bitmap bitmap) {
            if (c.this.f5553r != null && this.f5562a == c.this.f5557v && c.this.f5556u) {
                Notification unused = c.this.h0(bitmap);
            }
        }

        public void c(Bitmap bitmap) {
            if (bitmap != null) {
                c.this.f5541f.post(new r7.g(this, bitmap));
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.c$c  reason: collision with other inner class name */
    public interface C0090c {
        void a(n0 n0Var, String str, Intent intent);

        List<String> b(n0 n0Var);

        Map<String, u0.b> c(Context context, int i10);
    }

    public interface d {
        @o0
        Bitmap a(n0 n0Var, b bVar);

        @o0
        String b(n0 n0Var);

        @o0
        String c(n0 n0Var);

        String d(n0 n0Var);

        @o0
        PendingIntent e(n0 n0Var);
    }

    public class e extends BroadcastReceiver {
        public e() {
        }

        public void onReceive(Context context, Intent intent) {
            n0 b10 = c.this.f5553r;
            if (b10 != null && c.this.f5556u && intent.getIntExtra(c.V, c.this.f5549n) == c.this.f5549n) {
                String action = intent.getAction();
                if (c.O.equals(action)) {
                    if (b10.e() == 1) {
                        if (c.this.f5554s != null) {
                            c.this.f5554s.a();
                        }
                    } else if (b10.e() == 4) {
                        c.this.f5555t.b(b10, b10.Q(), b6.c.f4201b);
                    }
                    c.this.f5555t.a(b10, true);
                } else if (c.P.equals(action)) {
                    c.this.f5555t.a(b10, false);
                } else if (c.Q.equals(action)) {
                    c.this.I(b10);
                } else if (c.T.equals(action)) {
                    c.this.J(b10);
                } else if (c.S.equals(action)) {
                    c.this.B(b10);
                } else if (c.R.equals(action)) {
                    c.this.H(b10);
                } else if (c.U.equals(action)) {
                    c.this.f5555t.e(b10, true);
                } else if (c.W.equals(action)) {
                    c.this.i0(true);
                } else if (action != null && c.this.f5540e != null && c.this.f5547l.containsKey(action)) {
                    c.this.f5540e.a(b10, action, intent);
                }
            }
        }
    }

    public interface f {
        void a(int i10, Notification notification, boolean z10);

        @Deprecated
        void b(int i10, Notification notification);

        @Deprecated
        void c(int i10);

        void d(int i10, boolean z10);
    }

    public class g implements n0.d {
        public g() {
        }

        public void A(boolean z10, int i10) {
            if (c.this.M != z10 || c.this.N != i10) {
                Notification unused = c.this.g0();
                boolean unused2 = c.this.M = z10;
                int unused3 = c.this.N = i10;
            }
        }

        public void C(int i10) {
            Notification unused = c.this.g0();
        }

        public /* synthetic */ void K(TrackGroupArray trackGroupArray, m mVar) {
            b6.o0.j(this, trackGroupArray, mVar);
        }

        public /* synthetic */ void N(b6.i iVar) {
            b6.o0.c(this, iVar);
        }

        public void b(l0 l0Var) {
            Notification unused = c.this.g0();
        }

        public /* synthetic */ void d(boolean z10) {
            b6.o0.a(this, z10);
        }

        public void e(int i10) {
            Notification unused = c.this.g0();
        }

        public /* synthetic */ void i() {
            b6.o0.g(this);
        }

        public void k(x0 x0Var, @o0 Object obj, int i10) {
            Notification unused = c.this.g0();
        }

        public /* synthetic */ void t(boolean z10) {
            b6.o0.h(this, z10);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    public c(Context context, String str, int i10, d dVar) {
        this(context, str, i10, dVar, (f) null, (C0090c) null);
    }

    public c(Context context, String str, int i10, d dVar, @o0 C0090c cVar) {
        this(context, str, i10, dVar, (f) null, cVar);
    }

    public c(Context context, String str, int i10, d dVar, @o0 f fVar) {
        this(context, str, i10, dVar, fVar, (C0090c) null);
    }

    public c(Context context, String str, int i10, d dVar, @o0 f fVar, @o0 C0090c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5536a = applicationContext;
        this.f5537b = str;
        this.f5538c = i10;
        this.f5539d = dVar;
        this.f5558w = fVar;
        this.f5540e = cVar;
        this.f5555t = new b6.e();
        this.f5550o = new x0.c();
        int i11 = f5535a0;
        f5535a0 = i11 + 1;
        this.f5549n = i11;
        this.f5541f = new Handler(Looper.getMainLooper());
        this.f5542g = k2.p(applicationContext);
        this.f5544i = new g();
        this.f5545j = new e();
        this.f5543h = new IntentFilter();
        this.f5560y = true;
        this.A = true;
        this.F = true;
        this.L = true;
        this.H = 0;
        this.I = d.C0091d.exo_notification_small_icon;
        this.G = 0;
        this.K = -1;
        this.C = a1.Z;
        this.D = b6.h.f4357h;
        this.E = 1;
        this.J = 1;
        Map<String, u0.b> w10 = w(applicationContext, i11);
        this.f5546k = w10;
        for (String addAction : w10.keySet()) {
            this.f5543h.addAction(addAction);
        }
        Map<String, u0.b> c10 = cVar != null ? cVar.c(applicationContext, this.f5549n) : Collections.emptyMap();
        this.f5547l = c10;
        for (String addAction2 : c10.keySet()) {
            this.f5543h.addAction(addAction2);
        }
        this.f5548m = u(W, applicationContext, this.f5549n);
        this.f5543h.addAction(W);
    }

    @Deprecated
    public static c A(Context context, String str, @d.a1 int i10, int i11, d dVar, @o0 f fVar) {
        return y(context, str, i10, 0, i11, dVar, fVar);
    }

    public static void S(u0.g gVar, @o0 Bitmap bitmap) {
        gVar.a0(bitmap);
    }

    public static PendingIntent u(String str, Context context, int i10) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra(V, i10);
        return PendingIntent.getBroadcast(context, i10, intent, 134217728);
    }

    public static Map<String, u0.b> w(Context context, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put(O, new u0.b(d.C0091d.exo_notification_play, (CharSequence) context.getString(d.h.exo_controls_play_description), u(O, context, i10)));
        hashMap.put(P, new u0.b(d.C0091d.exo_notification_pause, (CharSequence) context.getString(d.h.exo_controls_pause_description), u(P, context, i10)));
        hashMap.put(U, new u0.b(d.C0091d.exo_notification_stop, (CharSequence) context.getString(d.h.exo_controls_stop_description), u(U, context, i10)));
        hashMap.put(T, new u0.b(d.C0091d.exo_notification_rewind, (CharSequence) context.getString(d.h.exo_controls_rewind_description), u(T, context, i10)));
        hashMap.put(S, new u0.b(d.C0091d.exo_notification_fastforward, (CharSequence) context.getString(d.h.exo_controls_fastforward_description), u(S, context, i10)));
        hashMap.put(Q, new u0.b(d.C0091d.exo_notification_previous, (CharSequence) context.getString(d.h.exo_controls_previous_description), u(Q, context, i10)));
        hashMap.put(R, new u0.b(d.C0091d.exo_notification_next, (CharSequence) context.getString(d.h.exo_controls_next_description), u(R, context, i10)));
        return hashMap;
    }

    public static c x(Context context, String str, @d.a1 int i10, @d.a1 int i11, int i12, d dVar) {
        w7.u.b(context, str, i10, i11, 2);
        return new c(context, str, i12, dVar);
    }

    public static c y(Context context, String str, @d.a1 int i10, @d.a1 int i11, int i12, d dVar, @o0 f fVar) {
        w7.u.b(context, str, i10, i11, 2);
        return new c(context, str, i12, dVar, fVar);
    }

    @Deprecated
    public static c z(Context context, String str, @d.a1 int i10, int i11, d dVar) {
        return x(context, str, i10, 0, i11, dVar);
    }

    public final void B(n0 n0Var) {
        if (n0Var.C() && this.C > 0) {
            L(n0Var, n0Var.getCurrentPosition() + this.C);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] C(java.util.List<java.lang.String> r7, b6.n0 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "com.google.android.exoplayer.pause"
            int r0 = r7.indexOf(r0)
            java.lang.String r1 = "com.google.android.exoplayer.play"
            int r1 = r7.indexOf(r1)
            boolean r2 = r6.f5561z
            r3 = -1
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "com.google.android.exoplayer.prev"
            int r2 = r7.indexOf(r2)
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            boolean r4 = r6.f5561z
            if (r4 == 0) goto L_0x0024
            java.lang.String r4 = "com.google.android.exoplayer.next"
            int r7 = r7.indexOf(r4)
            goto L_0x0025
        L_0x0024:
            r7 = r3
        L_0x0025:
            r4 = 3
            int[] r4 = new int[r4]
            r5 = 0
            if (r2 == r3) goto L_0x002e
            r4[r5] = r2
            r5 = 1
        L_0x002e:
            boolean r8 = r8.q()
            if (r0 == r3) goto L_0x003c
            if (r8 == 0) goto L_0x003c
            int r8 = r5 + 1
            r4[r5] = r0
        L_0x003a:
            r5 = r8
            goto L_0x0045
        L_0x003c:
            if (r1 == r3) goto L_0x0045
            if (r8 != 0) goto L_0x0045
            int r8 = r5 + 1
            r4[r5] = r1
            goto L_0x003a
        L_0x0045:
            if (r7 == r3) goto L_0x004c
            int r8 = r5 + 1
            r4[r5] = r7
            r5 = r8
        L_0x004c:
            int[] r7 = java.util.Arrays.copyOf(r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.c.C(java.util.List, b6.n0):int[]");
    }

    public List<String> D(n0 n0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        x0 t02 = n0Var.t0();
        boolean z13 = false;
        if (t02.r() || n0Var.m()) {
            z12 = false;
            z11 = false;
            z10 = false;
        } else {
            t02.n(n0Var.Q(), this.f5550o);
            x0.c cVar = this.f5550o;
            boolean z14 = cVar.f4501d || !cVar.f4502e || n0Var.hasPrevious();
            z11 = this.D > 0;
            z10 = this.C > 0;
            if (this.f5550o.f4502e || n0Var.hasNext()) {
                z13 = true;
            }
            boolean z15 = z13;
            z13 = z14;
            z12 = z15;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f5560y && z13) {
            arrayList.add(Q);
        }
        if (z11) {
            arrayList.add(T);
        }
        if (this.A) {
            arrayList.add(G(n0Var) ? P : O);
        }
        if (z10) {
            arrayList.add(S);
        }
        if (this.f5560y && z12) {
            arrayList.add(R);
        }
        C0090c cVar2 = this.f5540e;
        if (cVar2 != null) {
            arrayList.addAll(cVar2.b(n0Var));
        }
        if (this.B) {
            arrayList.add(U);
        }
        return arrayList;
    }

    public boolean E(n0 n0Var) {
        int e10 = n0Var.e();
        return (e10 == 2 || e10 == 3) && n0Var.q();
    }

    public void F() {
        if (this.f5556u && this.f5553r != null) {
            g0();
        }
    }

    public final boolean G(n0 n0Var) {
        return (n0Var.e() == 4 || n0Var.e() == 1 || !n0Var.q()) ? false : true;
    }

    public final void H(n0 n0Var) {
        x0 t02 = n0Var.t0();
        if (!t02.r() && !n0Var.m()) {
            int Q2 = n0Var.Q();
            int n02 = n0Var.n0();
            if (n02 != -1) {
                K(n0Var, n02, b6.c.f4201b);
            } else if (t02.n(Q2, this.f5550o).f4502e) {
                K(n0Var, Q2, b6.c.f4201b);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r1.f4501d == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(b6.n0 r6) {
        /*
            r5 = this;
            b6.x0 r0 = r6.t0()
            boolean r1 = r0.r()
            if (r1 != 0) goto L_0x0043
            boolean r1 = r6.m()
            if (r1 == 0) goto L_0x0011
            goto L_0x0043
        L_0x0011:
            int r1 = r6.Q()
            b6.x0$c r2 = r5.f5550o
            r0.n(r1, r2)
            int r0 = r6.c0()
            r1 = -1
            if (r0 == r1) goto L_0x003e
            long r1 = r6.getCurrentPosition()
            r3 = 3000(0xbb8, double:1.482E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0035
            b6.x0$c r1 = r5.f5550o
            boolean r2 = r1.f4502e
            if (r2 == 0) goto L_0x003e
            boolean r1 = r1.f4501d
            if (r1 != 0) goto L_0x003e
        L_0x0035:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.K(r6, r0, r1)
            goto L_0x0043
        L_0x003e:
            r0 = 0
            r5.L(r6, r0)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.c.I(b6.n0):void");
    }

    public final void J(n0 n0Var) {
        if (n0Var.C() && this.D > 0) {
            L(n0Var, Math.max(n0Var.getCurrentPosition() - this.D, 0));
        }
    }

    public final void K(n0 n0Var, int i10, long j10) {
        long duration = n0Var.getDuration();
        if (duration != b6.c.f4201b) {
            j10 = Math.min(j10, duration);
        }
        this.f5555t.b(n0Var, i10, Math.max(j10, 0));
    }

    public final void L(n0 n0Var, long j10) {
        K(n0Var, n0Var.Q(), j10);
    }

    public final void M(int i10) {
        if (this.E != i10) {
            if (i10 == 0 || i10 == 1 || i10 == 2) {
                this.E = i10;
                F();
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public final void N(int i10) {
        if (this.H != i10) {
            this.H = i10;
            F();
        }
    }

    public final void O(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            F();
        }
    }

    public final void P(b6.d dVar) {
        if (dVar == null) {
            dVar = new b6.e();
        }
        this.f5555t = dVar;
    }

    public final void Q(int i10) {
        if (this.G != i10) {
            this.G = i10;
            F();
        }
    }

    public final void R(long j10) {
        if (this.C != j10) {
            this.C = j10;
            F();
        }
    }

    public final void T(MediaSessionCompat.Token token) {
        if (!q0.e(this.f5559x, token)) {
            this.f5559x = token;
            F();
        }
    }

    @Deprecated
    public final void U(f fVar) {
        this.f5558w = fVar;
    }

    public void V(@o0 m0 m0Var) {
        this.f5554s = m0Var;
    }

    public final void W(@o0 n0 n0Var) {
        boolean z10 = true;
        w7.a.i(Looper.myLooper() == Looper.getMainLooper());
        if (!(n0Var == null || n0Var.u0() == Looper.getMainLooper())) {
            z10 = false;
        }
        w7.a.a(z10);
        n0 n0Var2 = this.f5553r;
        if (n0Var2 != n0Var) {
            if (n0Var2 != null) {
                n0Var2.J(this.f5544i);
                if (n0Var == null) {
                    i0(false);
                }
            }
            this.f5553r = n0Var;
            if (n0Var != null) {
                this.M = n0Var.q();
                this.N = n0Var.e();
                n0Var.P(this.f5544i);
                g0();
            }
        }
    }

    public final void X(int i10) {
        if (this.K != i10) {
            if (i10 == -2 || i10 == -1 || i10 == 0 || i10 == 1 || i10 == 2) {
                this.K = i10;
                F();
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public final void Y(long j10) {
        if (this.D != j10) {
            this.D = j10;
            F();
        }
    }

    public final void Z(@u int i10) {
        if (this.I != i10) {
            this.I = i10;
            F();
        }
    }

    public final void a0(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            F();
        }
    }

    public final void b0(boolean z10) {
        if (this.f5560y != z10) {
            this.f5560y = z10;
            F();
        }
    }

    public final void c0(boolean z10) {
        if (this.f5561z != z10) {
            this.f5561z = z10;
            F();
        }
    }

    public final void d0(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            F();
        }
    }

    public final void e0(boolean z10) {
        if (this.B != z10) {
            this.B = z10;
            F();
        }
    }

    public final void f0(int i10) {
        if (this.J != i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.J = i10;
                F();
                return;
            }
            throw new IllegalStateException();
        }
    }

    @o0
    public final Notification g0() {
        w7.a.g(this.f5553r);
        return h0((Bitmap) null);
    }

    @o0
    @RequiresNonNull({"player"})
    public final Notification h0(@o0 Bitmap bitmap) {
        n0 n0Var = this.f5553r;
        boolean E2 = E(n0Var);
        u0.g v10 = v(n0Var, this.f5551p, E2, bitmap);
        this.f5551p = v10;
        if (v10 == null) {
            i0(false);
            return null;
        }
        Notification h10 = v10.h();
        this.f5542g.C(this.f5538c, h10);
        if (!this.f5556u) {
            this.f5556u = true;
            this.f5536a.registerReceiver(this.f5545j, this.f5543h);
            f fVar = this.f5558w;
            if (fVar != null) {
                fVar.b(this.f5538c, h10);
            }
        }
        f fVar2 = this.f5558w;
        if (fVar2 != null) {
            fVar2.a(this.f5538c, h10, E2);
        }
        return h10;
    }

    public final void i0(boolean z10) {
        if (this.f5556u) {
            this.f5556u = false;
            this.f5542g.b(this.f5538c);
            this.f5536a.unregisterReceiver(this.f5545j);
            f fVar = this.f5558w;
            if (fVar != null) {
                fVar.d(this.f5538c, z10);
                this.f5558w.c(this.f5538c);
            }
        }
    }

    @o0
    public u0.g v(n0 n0Var, @o0 u0.g gVar, boolean z10, @o0 Bitmap bitmap) {
        if (n0Var.e() != 1 || (!n0Var.t0().r() && this.f5554s != null)) {
            List<String> D2 = D(n0Var);
            ArrayList<u0.b> arrayList = new ArrayList<>(D2.size());
            for (int i10 = 0; i10 < D2.size(); i10++) {
                String str = D2.get(i10);
                u0.b bVar = (this.f5546k.containsKey(str) ? this.f5546k : this.f5547l).get(str);
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
            if (gVar == null || !arrayList.equals(this.f5552q)) {
                gVar = new u0.g(this.f5536a, this.f5537b);
                this.f5552q = arrayList;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    gVar.b(arrayList.get(i11));
                }
            }
            a.b bVar2 = new a.b();
            MediaSessionCompat.Token token = this.f5559x;
            if (token != null) {
                bVar2.I(token);
            }
            bVar2.J(C(D2, n0Var));
            bVar2.K(!z10);
            bVar2.H(this.f5548m);
            gVar.x0(bVar2);
            gVar.T(this.f5548m);
            gVar.D(this.E).g0(z10).I(this.H).J(this.F).r0(this.I).E0(this.J).i0(this.K).S(this.G);
            if (q0.f14786a < 21 || !this.L || n0Var.m() || n0Var.I() || !n0Var.q() || n0Var.e() != 3) {
                gVar.p0(false).C0(false);
            } else {
                gVar.F0(System.currentTimeMillis() - n0Var.a0()).p0(true).C0(true);
            }
            gVar.O(this.f5539d.d(n0Var));
            gVar.N(this.f5539d.b(n0Var));
            gVar.y0(this.f5539d.c(n0Var));
            if (bitmap == null) {
                d dVar = this.f5539d;
                int i12 = this.f5557v + 1;
                this.f5557v = i12;
                bitmap = dVar.a(n0Var, new b(i12));
            }
            S(gVar, bitmap);
            gVar.M(this.f5539d.e(n0Var));
            return gVar;
        }
        this.f5552q = null;
        return null;
    }
}
