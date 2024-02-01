package i6;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import b6.b0;
import b6.l0;
import b6.n0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import d.m0;
import d.o0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q7.m;
import w7.q0;

public final class b {
    public static final long A = 2359815;
    public static final int B = 3;
    public static final int C = 7;
    public static final MediaMetadataCompat D = new MediaMetadataCompat.c().a();

    /* renamed from: v  reason: collision with root package name */
    public static final long f9135v = 2360143;

    /* renamed from: w  reason: collision with root package name */
    public static final long f9136w = 2360143;

    /* renamed from: x  reason: collision with root package name */
    public static final int f9137x = 15000;

    /* renamed from: y  reason: collision with root package name */
    public static final int f9138y = 5000;

    /* renamed from: z  reason: collision with root package name */
    public static final String f9139z = "EXO_PITCH";

    /* renamed from: a  reason: collision with root package name */
    public final MediaSessionCompat f9140a;

    /* renamed from: b  reason: collision with root package name */
    public final Looper f9141b;

    /* renamed from: c  reason: collision with root package name */
    public final c f9142c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<C0154b> f9143d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<C0154b> f9144e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public b6.d f9145f = new b6.e();

    /* renamed from: g  reason: collision with root package name */
    public d[] f9146g = new d[0];

    /* renamed from: h  reason: collision with root package name */
    public Map<String, d> f9147h = Collections.emptyMap();
    @o0

    /* renamed from: i  reason: collision with root package name */
    public g f9148i;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public n0 f9149j;
    @o0

    /* renamed from: k  reason: collision with root package name */
    public w7.h<? super b6.i> f9150k;
    @o0

    /* renamed from: l  reason: collision with root package name */
    public Pair<Integer, CharSequence> f9151l;
    @o0

    /* renamed from: m  reason: collision with root package name */
    public Bundle f9152m;
    @o0

    /* renamed from: n  reason: collision with root package name */
    public i f9153n;
    @o0

    /* renamed from: o  reason: collision with root package name */
    public k f9154o;
    @o0

    /* renamed from: p  reason: collision with root package name */
    public j f9155p;
    @o0

    /* renamed from: q  reason: collision with root package name */
    public l f9156q;
    @o0

    /* renamed from: r  reason: collision with root package name */
    public f f9157r;

    /* renamed from: s  reason: collision with root package name */
    public long f9158s;

    /* renamed from: t  reason: collision with root package name */
    public int f9159t;

    /* renamed from: u  reason: collision with root package name */
    public int f9160u;

    /* renamed from: i6.b$b  reason: collision with other inner class name */
    public interface C0154b {
        boolean n(n0 n0Var, b6.d dVar, String str, Bundle bundle, ResultReceiver resultReceiver);
    }

    public class c extends MediaSessionCompat.d implements n0.d {
        public int S;
        public int T;

        public c() {
        }

        public void A(boolean z10, int i10) {
            b.this.E();
        }

        public void C(int i10) {
            MediaSessionCompat mediaSessionCompat = b.this.f9140a;
            int i11 = 2;
            if (i10 == 1) {
                i11 = 1;
            } else if (i10 != 2) {
                i11 = 0;
            }
            mediaSessionCompat.C(i11);
            b.this.E();
        }

        public void D(RatingCompat ratingCompat) {
            if (b.this.z()) {
                b.this.f9156q.a(b.this.f9149j, ratingCompat);
            }
        }

        public void E(RatingCompat ratingCompat, Bundle bundle) {
            if (b.this.z()) {
                b.this.f9156q.d(b.this.f9149j, ratingCompat, bundle);
            }
        }

        public void F(int i10) {
            if (b.this.x(262144)) {
                int i11 = 2;
                if (i10 == 1) {
                    i11 = 1;
                } else if (!(i10 == 2 || i10 == 3)) {
                    i11 = 0;
                }
                b.this.f9145f.d(b.this.f9149j, i11);
            }
        }

        public void G(int i10) {
            if (b.this.x(2097152)) {
                boolean z10 = true;
                if (!(i10 == 1 || i10 == 2)) {
                    z10 = false;
                }
                b.this.f9145f.c(b.this.f9149j, z10);
            }
        }

        public void H() {
            if (b.this.B(32)) {
                b.this.f9154o.h(b.this.f9149j, b.this.f9145f);
            }
        }

        public void I() {
            if (b.this.B(16)) {
                b.this.f9154o.f(b.this.f9149j, b.this.f9145f);
            }
        }

        public void J(long j10) {
            if (b.this.B(PlaybackStateCompat.f556m0)) {
                b.this.f9154o.b(b.this.f9149j, b.this.f9145f, j10);
            }
        }

        public /* synthetic */ void K(TrackGroupArray trackGroupArray, m mVar) {
            b6.o0.j(this, trackGroupArray, mVar);
        }

        public void L() {
            if (b.this.x(1)) {
                b.this.f9145f.e(b.this.f9149j, true);
            }
        }

        public /* synthetic */ void N(b6.i iVar) {
            b6.o0.c(this, iVar);
        }

        public void b(l0 l0Var) {
            b.this.E();
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat) {
            if (b.this.y()) {
                b.this.f9155p.o(b.this.f9149j, mediaDescriptionCompat);
            }
        }

        public /* synthetic */ void d(boolean z10) {
            b6.o0.a(this, z10);
        }

        public void e(int i10) {
            if (this.S != b.this.f9149j.Q()) {
                if (b.this.f9154o != null) {
                    b.this.f9154o.j(b.this.f9149j);
                }
                this.S = b.this.f9149j.Q();
                b.this.E();
                b.this.D();
                return;
            }
            b.this.E();
        }

        public void f(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            if (b.this.y()) {
                b.this.f9155p.p(b.this.f9149j, mediaDescriptionCompat, i10);
            }
        }

        public void g(String str, Bundle bundle, ResultReceiver resultReceiver) {
            if (b.this.f9149j != null) {
                int i10 = 0;
                int i11 = 0;
                while (i11 < b.this.f9143d.size()) {
                    if (!((C0154b) b.this.f9143d.get(i11)).n(b.this.f9149j, b.this.f9145f, str, bundle, resultReceiver)) {
                        i11++;
                    } else {
                        return;
                    }
                }
                while (i10 < b.this.f9144e.size() && !((C0154b) b.this.f9144e.get(i10)).n(b.this.f9149j, b.this.f9145f, str, bundle, resultReceiver)) {
                    i10++;
                }
            }
        }

        public void h(@m0 String str, @o0 Bundle bundle) {
            if (b.this.f9149j != null && b.this.f9147h.containsKey(str)) {
                ((d) b.this.f9147h.get(str)).a(b.this.f9149j, b.this.f9145f, str, bundle);
                b.this.E();
            }
        }

        public /* synthetic */ void i() {
            b6.o0.g(this);
        }

        public void j() {
            if (b.this.x(64)) {
                b bVar = b.this;
                bVar.C(bVar.f9149j);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
            if (r1.S == r3) goto L_0x003e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void k(b6.x0 r2, @d.o0 java.lang.Object r3, int r4) {
            /*
                r1 = this;
                i6.b r2 = i6.b.this
                b6.n0 r2 = r2.f9149j
                b6.x0 r2 = r2.t0()
                int r2 = r2.q()
                i6.b r3 = i6.b.this
                b6.n0 r3 = r3.f9149j
                int r3 = r3.Q()
                i6.b r4 = i6.b.this
                i6.b$k r4 = r4.f9154o
                if (r4 == 0) goto L_0x0035
                i6.b r4 = i6.b.this
                i6.b$k r4 = r4.f9154o
                i6.b r0 = i6.b.this
                b6.n0 r0 = r0.f9149j
                r4.k(r0)
            L_0x002f:
                i6.b r4 = i6.b.this
                r4.E()
                goto L_0x003e
            L_0x0035:
                int r4 = r1.T
                if (r4 != r2) goto L_0x002f
                int r4 = r1.S
                if (r4 == r3) goto L_0x003e
                goto L_0x002f
            L_0x003e:
                r1.T = r2
                r1.S = r3
                i6.b r2 = i6.b.this
                r2.D()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i6.b.c.k(b6.x0, java.lang.Object, int):void");
        }

        public boolean l(Intent intent) {
            return (b.this.w() && b.this.f9157r.a(b.this.f9149j, b.this.f9145f, intent)) || super.l(intent);
        }

        public void m() {
            if (b.this.x(2)) {
                b.this.f9145f.a(b.this.f9149j, false);
            }
        }

        public void n() {
            if (b.this.x(4)) {
                if (b.this.f9149j.e() == 1) {
                    if (b.this.f9153n != null) {
                        b.this.f9153n.l(true);
                    }
                } else if (b.this.f9149j.e() == 4) {
                    b.this.f9145f.b(b.this.f9149j, b.this.f9149j.Q(), b6.c.f4201b);
                }
                b.this.f9145f.a((n0) w7.a.g(b.this.f9149j), true);
            }
        }

        public void o(String str, Bundle bundle) {
            if (b.this.A(PlaybackStateCompat.f554k0)) {
                b.this.f9153n.q(str, true, bundle);
            }
        }

        public void p(String str, Bundle bundle) {
            if (b.this.A(2048)) {
                b.this.f9153n.e(str, true, bundle);
            }
        }

        public void q(Uri uri, Bundle bundle) {
            if (b.this.A(8192)) {
                b.this.f9153n.r(uri, true, bundle);
            }
        }

        public void r() {
            if (b.this.A(16384)) {
                b.this.f9153n.l(false);
            }
        }

        public void s(String str, Bundle bundle) {
            if (b.this.A(PlaybackStateCompat.f559p0)) {
                b.this.f9153n.q(str, false, bundle);
            }
        }

        public void t(boolean z10) {
            b.this.f9140a.E(z10 ? 1 : 0);
            b.this.E();
            b.this.F();
        }

        public void u(String str, Bundle bundle) {
            if (b.this.A(65536)) {
                b.this.f9153n.e(str, false, bundle);
            }
        }

        public void v(Uri uri, Bundle bundle) {
            if (b.this.A(PlaybackStateCompat.f561r0)) {
                b.this.f9153n.r(uri, false, bundle);
            }
        }

        public void w(MediaDescriptionCompat mediaDescriptionCompat) {
            if (b.this.y()) {
                b.this.f9155p.i(b.this.f9149j, mediaDescriptionCompat);
            }
        }

        public void y() {
            if (b.this.x(8)) {
                b bVar = b.this;
                bVar.J(bVar.f9149j);
            }
        }

        public void z(long j10) {
            if (b.this.x(256)) {
                b bVar = b.this;
                bVar.L(bVar.f9149j, j10);
            }
        }
    }

    public interface d {
        void a(n0 n0Var, b6.d dVar, String str, Bundle bundle);

        PlaybackStateCompat.CustomAction b(n0 n0Var);
    }

    public static final class e implements g {

        /* renamed from: a  reason: collision with root package name */
        public final MediaControllerCompat f9161a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9162b;

        public e(MediaControllerCompat mediaControllerCompat, @o0 String str) {
            this.f9161a = mediaControllerCompat;
            this.f9162b = str == null ? "" : str;
        }

        public MediaMetadataCompat a(n0 n0Var) {
            String str;
            long intValue;
            if (n0Var.t0().r()) {
                return b.D;
            }
            MediaMetadataCompat.c cVar = new MediaMetadataCompat.c();
            if (n0Var.m()) {
                cVar.c(MediaMetadataCompat.f383v0, 1);
            }
            cVar.c(MediaMetadataCompat.U, n0Var.getDuration() == b6.c.f4201b ? -1 : n0Var.getDuration());
            long c10 = this.f9161a.l().c();
            if (c10 != -1) {
                List<MediaSessionCompat.QueueItem> m10 = this.f9161a.m();
                int i10 = 0;
                while (true) {
                    if (m10 == null || i10 >= m10.size()) {
                        break;
                    }
                    MediaSessionCompat.QueueItem queueItem = m10.get(i10);
                    if (queueItem.d() == c10) {
                        MediaDescriptionCompat c11 = queueItem.c();
                        Bundle c12 = c11.c();
                        if (c12 != null) {
                            for (String next : c12.keySet()) {
                                Object obj = c12.get(next);
                                if (obj instanceof String) {
                                    cVar.e(this.f9162b + next, (String) obj);
                                } else if (obj instanceof CharSequence) {
                                    cVar.f(this.f9162b + next, (CharSequence) obj);
                                } else {
                                    if (obj instanceof Long) {
                                        str = this.f9162b + next;
                                        intValue = ((Long) obj).longValue();
                                    } else if (obj instanceof Integer) {
                                        str = this.f9162b + next;
                                        intValue = (long) ((Integer) obj).intValue();
                                    } else if (obj instanceof Bitmap) {
                                        cVar.b(this.f9162b + next, (Bitmap) obj);
                                    } else if (obj instanceof RatingCompat) {
                                        cVar.d(this.f9162b + next, (RatingCompat) obj);
                                    }
                                    cVar.c(str, intValue);
                                }
                            }
                        }
                        if (c11.l() != null) {
                            String valueOf = String.valueOf(c11.l());
                            cVar.e(MediaMetadataCompat.S, valueOf);
                            cVar.e(MediaMetadataCompat.f375n0, valueOf);
                        }
                        if (c11.j() != null) {
                            cVar.e(MediaMetadataCompat.f376o0, String.valueOf(c11.j()));
                        }
                        if (c11.b() != null) {
                            cVar.e(MediaMetadataCompat.f377p0, String.valueOf(c11.b()));
                        }
                        if (c11.d() != null) {
                            cVar.b(MediaMetadataCompat.f378q0, c11.d());
                        }
                        if (c11.e() != null) {
                            cVar.e(MediaMetadataCompat.f379r0, String.valueOf(c11.e()));
                        }
                        if (c11.g() != null) {
                            cVar.e(MediaMetadataCompat.f380s0, String.valueOf(c11.g()));
                        }
                        if (c11.h() != null) {
                            cVar.e(MediaMetadataCompat.f381t0, String.valueOf(c11.h()));
                        }
                    } else {
                        i10++;
                    }
                }
            }
            return cVar.a();
        }
    }

    public interface f {
        boolean a(n0 n0Var, b6.d dVar, Intent intent);
    }

    public interface g {
        MediaMetadataCompat a(n0 n0Var);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    public interface i extends C0154b {

        /* renamed from: a  reason: collision with root package name */
        public static final long f9163a = 257024;

        void e(String str, boolean z10, Bundle bundle);

        void l(boolean z10);

        long m();

        void q(String str, boolean z10, Bundle bundle);

        void r(Uri uri, boolean z10, Bundle bundle);
    }

    public interface j extends C0154b {
        void i(n0 n0Var, MediaDescriptionCompat mediaDescriptionCompat);

        void o(n0 n0Var, MediaDescriptionCompat mediaDescriptionCompat);

        void p(n0 n0Var, MediaDescriptionCompat mediaDescriptionCompat, int i10);
    }

    public interface k extends C0154b {

        /* renamed from: b  reason: collision with root package name */
        public static final long f9164b = 4144;

        void b(n0 n0Var, b6.d dVar, long j10);

        long c(n0 n0Var);

        void f(n0 n0Var, b6.d dVar);

        long g(@o0 n0 n0Var);

        void h(n0 n0Var, b6.d dVar);

        void j(n0 n0Var);

        void k(n0 n0Var);
    }

    public interface l extends C0154b {
        void a(n0 n0Var, RatingCompat ratingCompat);

        void d(n0 n0Var, RatingCompat ratingCompat, Bundle bundle);
    }

    static {
        b0.a("goog.exo.mediasession");
    }

    public b(MediaSessionCompat mediaSessionCompat) {
        this.f9140a = mediaSessionCompat;
        Looper U = q0.U();
        this.f9141b = U;
        c cVar = new c();
        this.f9142c = cVar;
        this.f9148i = new e(mediaSessionCompat.e(), (String) null);
        this.f9158s = 2360143;
        this.f9159t = 5000;
        this.f9160u = 15000;
        mediaSessionCompat.t(3);
        mediaSessionCompat.q(cVar, new Handler(U));
    }

    public final boolean A(long j10) {
        i iVar = this.f9153n;
        return (iVar == null || (j10 & iVar.m()) == 0) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f9154o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B(long r3) {
        /*
            r2 = this;
            b6.n0 r0 = r2.f9149j
            if (r0 == 0) goto L_0x0015
            i6.b$k r1 = r2.f9154o
            if (r1 == 0) goto L_0x0015
            long r0 = r1.c(r0)
            long r3 = r3 & r0
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.b.B(long):boolean");
    }

    public final void C(n0 n0Var) {
        if (n0Var.C() && this.f9160u > 0) {
            L(n0Var, n0Var.getCurrentPosition() + ((long) this.f9160u));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f9149j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D() {
        /*
            r2 = this;
            i6.b$g r0 = r2.f9148i
            if (r0 == 0) goto L_0x000d
            b6.n0 r1 = r2.f9149j
            if (r1 == 0) goto L_0x000d
            android.support.v4.media.MediaMetadataCompat r0 = r0.a(r1)
            goto L_0x000f
        L_0x000d:
            android.support.v4.media.MediaMetadataCompat r0 = D
        L_0x000f:
            android.support.v4.media.session.MediaSessionCompat r1 = r2.f9140a
            if (r0 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            android.support.v4.media.MediaMetadataCompat r0 = D
        L_0x0016:
            r1.v(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.b.D():void");
    }

    public final void E() {
        w7.h<? super b6.i> hVar;
        PlaybackStateCompat.c cVar = new PlaybackStateCompat.c();
        if (this.f9149j == null) {
            cVar.d(v()).k(0, 0, 0.0f, 0);
        } else {
            HashMap hashMap = new HashMap();
            boolean z10 = false;
            for (d dVar : this.f9146g) {
                PlaybackStateCompat.CustomAction b10 = dVar.b(this.f9149j);
                if (b10 != null) {
                    hashMap.put(b10.b(), dVar);
                    cVar.a(b10);
                }
            }
            this.f9147h = Collections.unmodifiableMap(hashMap);
            int e10 = this.f9149j.e();
            Bundle bundle = new Bundle();
            b6.i y10 = e10 == 1 ? this.f9149j.y() : null;
            if (!(y10 == null && this.f9151l == null)) {
                z10 = true;
            }
            int G = z10 ? 7 : G(this.f9149j.e(), this.f9149j.q());
            Pair<Integer, CharSequence> pair = this.f9151l;
            if (pair != null) {
                cVar.g(((Integer) pair.first).intValue(), (CharSequence) this.f9151l.second);
                Bundle bundle2 = this.f9152m;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
            } else if (!(y10 == null || (hVar = this.f9150k) == null)) {
                Pair<Integer, String> a10 = hVar.a(y10);
                cVar.g(((Integer) a10.first).intValue(), (CharSequence) a10.second);
            }
            k kVar = this.f9154o;
            long g10 = kVar != null ? kVar.g(this.f9149j) : -1;
            bundle.putFloat(f9139z, this.f9149j.d().f4403b);
            cVar.d(v() | u(this.f9149j)).e(g10).f(this.f9149j.e0()).k(G, this.f9149j.getCurrentPosition(), this.f9149j.d().f4402a, SystemClock.elapsedRealtime()).i(bundle);
        }
        this.f9140a.w(cVar.c());
    }

    public final void F() {
        n0 n0Var;
        k kVar = this.f9154o;
        if (kVar != null && (n0Var = this.f9149j) != null) {
            kVar.k(n0Var);
        }
    }

    public final int G(int i10, boolean z10) {
        if (i10 != 2) {
            return i10 != 3 ? i10 != 4 ? 0 : 1 : z10 ? 3 : 2;
        }
        return 6;
    }

    public final void H(C0154b bVar) {
        if (!this.f9143d.contains(bVar)) {
            this.f9143d.add(bVar);
        }
    }

    public void I(C0154b bVar) {
        if (!this.f9144e.contains(bVar)) {
            this.f9144e.add(bVar);
        }
    }

    public final void J(n0 n0Var) {
        if (n0Var.C() && this.f9159t > 0) {
            L(n0Var, n0Var.getCurrentPosition() - ((long) this.f9159t));
        }
    }

    public final void K(n0 n0Var, int i10, long j10) {
        long duration = n0Var.getDuration();
        if (duration != b6.c.f4201b) {
            j10 = Math.min(j10, duration);
        }
        this.f9145f.b(n0Var, i10, Math.max(j10, 0));
    }

    public final void L(n0 n0Var, long j10) {
        K(n0Var, n0Var.Q(), j10);
    }

    public void M(@o0 b6.d dVar) {
        if (this.f9145f != dVar) {
            if (dVar == null) {
                dVar = new b6.e();
            }
            this.f9145f = dVar;
        }
    }

    public void N(@o0 d... dVarArr) {
        if (dVarArr == null) {
            dVarArr = new d[0];
        }
        this.f9146g = dVarArr;
        E();
    }

    public void O(@o0 CharSequence charSequence) {
        P(charSequence, charSequence == null ? 0 : 1);
    }

    public void P(@o0 CharSequence charSequence, int i10) {
        Q(charSequence, i10, (Bundle) null);
    }

    public void Q(@o0 CharSequence charSequence, int i10, @o0 Bundle bundle) {
        this.f9151l = charSequence == null ? null : new Pair<>(Integer.valueOf(i10), charSequence);
        if (charSequence == null) {
            bundle = null;
        }
        this.f9152m = bundle;
        E();
    }

    public void R(long j10) {
        long j11 = j10 & 2360143;
        if (this.f9158s != j11) {
            this.f9158s = j11;
            E();
        }
    }

    public void S(@o0 w7.h<? super b6.i> hVar) {
        if (this.f9150k != hVar) {
            this.f9150k = hVar;
            E();
        }
    }

    public void T(int i10) {
        if (this.f9160u != i10) {
            this.f9160u = i10;
            E();
        }
    }

    public void U(@o0 f fVar) {
        this.f9157r = fVar;
    }

    public void V(@o0 g gVar) {
        if (this.f9148i != gVar) {
            this.f9148i = gVar;
            D();
        }
    }

    public void W(@o0 i iVar) {
        i iVar2 = this.f9153n;
        if (iVar2 != iVar) {
            c0(iVar2);
            this.f9153n = iVar;
            H(iVar);
            E();
        }
    }

    public void X(@o0 n0 n0Var) {
        w7.a.a(n0Var == null || n0Var.u0() == this.f9141b);
        n0 n0Var2 = this.f9149j;
        if (n0Var2 != null) {
            n0Var2.J(this.f9142c);
        }
        this.f9149j = n0Var;
        if (n0Var != null) {
            n0Var.P(this.f9142c);
        }
        E();
        D();
    }

    public void Y(j jVar) {
        j jVar2 = this.f9155p;
        if (jVar2 != jVar) {
            c0(jVar2);
            this.f9155p = jVar;
            H(jVar);
            this.f9140a.t(jVar == null ? 3 : 7);
        }
    }

    public void Z(k kVar) {
        k kVar2 = this.f9154o;
        if (kVar2 != kVar) {
            c0(kVar2);
            this.f9154o = kVar;
            H(kVar);
        }
    }

    public void a0(l lVar) {
        l lVar2 = this.f9156q;
        if (lVar2 != lVar) {
            c0(lVar2);
            this.f9156q = lVar;
            H(lVar);
        }
    }

    public void b0(int i10) {
        if (this.f9159t != i10) {
            this.f9159t = i10;
            E();
        }
    }

    public final void c0(C0154b bVar) {
        this.f9143d.remove(bVar);
    }

    public void d0(C0154b bVar) {
        this.f9144e.remove(bVar);
    }

    public final long u(n0 n0Var) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        boolean z13 = false;
        if (n0Var.t0().r() || n0Var.m()) {
            z11 = false;
            z12 = false;
            z10 = false;
        } else {
            boolean C2 = n0Var.C();
            z10 = C2 && this.f9159t > 0;
            if (C2 && this.f9160u > 0) {
                z13 = true;
            }
            boolean z14 = z13;
            z13 = C2;
            z11 = z14;
        }
        long j10 = A;
        if (z13) {
            j10 = 2360071;
        }
        if (z11) {
            j10 |= 64;
        }
        if (z10) {
            j10 |= 8;
        }
        long j11 = this.f9158s & j10;
        k kVar = this.f9154o;
        if (kVar != null) {
            j11 |= k.f9164b & kVar.c(n0Var);
        }
        return (this.f9156q == null || !z12) ? j11 : j11 | 128;
    }

    public final long v() {
        i iVar = this.f9153n;
        if (iVar == null) {
            return 0;
        }
        return iVar.m() & i.f9163a;
    }

    public final boolean w() {
        return (this.f9149j == null || this.f9157r == null) ? false : true;
    }

    public final boolean x(long j10) {
        return (this.f9149j == null || (j10 & this.f9158s) == 0) ? false : true;
    }

    public final boolean y() {
        return (this.f9149j == null || this.f9155p == null) ? false : true;
    }

    public final boolean z() {
        return (this.f9149j == null || this.f9156q == null) ? false : true;
    }
}
