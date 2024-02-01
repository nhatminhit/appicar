package d6;

import android.media.AudioTrack;
import android.os.SystemClock;
import b6.c;
import d.o0;
import java.lang.reflect.Method;
import u0.m;
import w7.q0;

public final class w {
    public static final int A = 2;
    public static final int B = 3;
    public static final long C = 5000000;
    public static final long D = 5000000;
    public static final long E = 200;
    public static final int F = 10;
    public static final int G = 30000;
    public static final int H = 500000;

    /* renamed from: z  reason: collision with root package name */
    public static final int f6467z = 1;

    /* renamed from: a  reason: collision with root package name */
    public final a f6468a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f6469b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public AudioTrack f6470c;

    /* renamed from: d  reason: collision with root package name */
    public int f6471d;

    /* renamed from: e  reason: collision with root package name */
    public int f6472e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public v f6473f;

    /* renamed from: g  reason: collision with root package name */
    public int f6474g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6475h;

    /* renamed from: i  reason: collision with root package name */
    public long f6476i;

    /* renamed from: j  reason: collision with root package name */
    public long f6477j;

    /* renamed from: k  reason: collision with root package name */
    public long f6478k;
    @o0

    /* renamed from: l  reason: collision with root package name */
    public Method f6479l;

    /* renamed from: m  reason: collision with root package name */
    public long f6480m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6481n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f6482o;

    /* renamed from: p  reason: collision with root package name */
    public long f6483p;

    /* renamed from: q  reason: collision with root package name */
    public long f6484q;

    /* renamed from: r  reason: collision with root package name */
    public long f6485r;

    /* renamed from: s  reason: collision with root package name */
    public long f6486s;

    /* renamed from: t  reason: collision with root package name */
    public int f6487t;

    /* renamed from: u  reason: collision with root package name */
    public int f6488u;

    /* renamed from: v  reason: collision with root package name */
    public long f6489v;

    /* renamed from: w  reason: collision with root package name */
    public long f6490w;

    /* renamed from: x  reason: collision with root package name */
    public long f6491x;

    /* renamed from: y  reason: collision with root package name */
    public long f6492y;

    public interface a {
        void a(int i10, long j10);

        void b(long j10);

        void c(long j10, long j11, long j12, long j13);

        void d(long j10, long j11, long j12, long j13);
    }

    public w(a aVar) {
        this.f6468a = (a) w7.a.g(aVar);
        if (q0.f14786a >= 18) {
            try {
                this.f6479l = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f6469b = new long[10];
    }

    public static boolean o(int i10) {
        return q0.f14786a < 23 && (i10 == 5 || i10 == 6);
    }

    public final boolean a() {
        return this.f6475h && ((AudioTrack) w7.a.g(this.f6470c)).getPlayState() == 2 && e() == 0;
    }

    public final long b(long j10) {
        return (j10 * 1000000) / ((long) this.f6474g);
    }

    public int c(long j10) {
        return this.f6472e - ((int) (j10 - (e() * ((long) this.f6471d))));
    }

    public long d(boolean z10) {
        if (((AudioTrack) w7.a.g(this.f6470c)).getPlayState() == 3) {
            m();
        }
        long nanoTime = System.nanoTime() / 1000;
        v vVar = (v) w7.a.g(this.f6473f);
        if (vVar.d()) {
            long b10 = b(vVar.b());
            return !vVar.e() ? b10 : b10 + (nanoTime - vVar.c());
        }
        long f10 = this.f6488u == 0 ? f() : nanoTime + this.f6477j;
        return !z10 ? f10 - this.f6480m : f10;
    }

    public final long e() {
        AudioTrack audioTrack = (AudioTrack) w7.a.g(this.f6470c);
        if (this.f6489v != c.f4201b) {
            return Math.min(this.f6492y, this.f6491x + ((((SystemClock.elapsedRealtime() * 1000) - this.f6489v) * ((long) this.f6474g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f6475h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f6486s = this.f6484q;
            }
            playbackHeadPosition += this.f6486s;
        }
        if (q0.f14786a <= 29) {
            if (playbackHeadPosition == 0 && this.f6484q > 0 && playState == 3) {
                if (this.f6490w == c.f4201b) {
                    this.f6490w = SystemClock.elapsedRealtime();
                }
                return this.f6484q;
            }
            this.f6490w = c.f4201b;
        }
        if (this.f6484q > playbackHeadPosition) {
            this.f6485r++;
        }
        this.f6484q = playbackHeadPosition;
        return playbackHeadPosition + (this.f6485r << 32);
    }

    public final long f() {
        return b(e());
    }

    public void g(long j10) {
        this.f6491x = e();
        this.f6489v = SystemClock.elapsedRealtime() * 1000;
        this.f6492y = j10;
    }

    public boolean h(long j10) {
        return j10 > e() || a();
    }

    public boolean i() {
        return ((AudioTrack) w7.a.g(this.f6470c)).getPlayState() == 3;
    }

    public boolean j(long j10) {
        return this.f6490w != c.f4201b && j10 > 0 && SystemClock.elapsedRealtime() - this.f6490w >= 200;
    }

    public boolean k(long j10) {
        a aVar;
        int playState = ((AudioTrack) w7.a.g(this.f6470c)).getPlayState();
        if (this.f6475h) {
            if (playState == 2) {
                this.f6481n = false;
                return false;
            } else if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z10 = this.f6481n;
        boolean h10 = h(j10);
        this.f6481n = h10;
        if (z10 && !h10 && playState != 1 && (aVar = this.f6468a) != null) {
            aVar.a(this.f6472e, c.c(this.f6476i));
        }
        return true;
    }

    public final void l(long j10, long j11) {
        v vVar = (v) w7.a.g(this.f6473f);
        if (vVar.f(j10)) {
            long c10 = vVar.c();
            long b10 = vVar.b();
            if (Math.abs(c10 - j10) > 5000000) {
                this.f6468a.d(b10, c10, j10, j11);
            } else if (Math.abs(b(b10) - j11) > 5000000) {
                this.f6468a.c(b10, c10, j10, j11);
            } else {
                vVar.a();
                return;
            }
            vVar.g();
        }
    }

    public final void m() {
        long f10 = f();
        if (f10 != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f6478k >= m.f13390a) {
                long[] jArr = this.f6469b;
                int i10 = this.f6487t;
                jArr[i10] = f10 - nanoTime;
                this.f6487t = (i10 + 1) % 10;
                int i11 = this.f6488u;
                if (i11 < 10) {
                    this.f6488u = i11 + 1;
                }
                this.f6478k = nanoTime;
                this.f6477j = 0;
                int i12 = 0;
                while (true) {
                    int i13 = this.f6488u;
                    if (i12 >= i13) {
                        break;
                    }
                    this.f6477j += this.f6469b[i12] / ((long) i13);
                    i12++;
                }
            }
            if (!this.f6475h) {
                l(nanoTime, f10);
                n(nanoTime);
            }
        }
    }

    public final void n(long j10) {
        Method method;
        if (this.f6482o && (method = this.f6479l) != null && j10 - this.f6483p >= 500000) {
            try {
                long intValue = (((long) ((Integer) q0.l((Integer) method.invoke(w7.a.g(this.f6470c), new Object[0]))).intValue()) * 1000) - this.f6476i;
                this.f6480m = intValue;
                long max = Math.max(intValue, 0);
                this.f6480m = max;
                if (max > 5000000) {
                    this.f6468a.b(max);
                    this.f6480m = 0;
                }
            } catch (Exception unused) {
                this.f6479l = null;
            }
            this.f6483p = j10;
        }
    }

    public boolean p() {
        r();
        if (this.f6489v != c.f4201b) {
            return false;
        }
        ((v) w7.a.g(this.f6473f)).h();
        return true;
    }

    public void q() {
        r();
        this.f6470c = null;
        this.f6473f = null;
    }

    public final void r() {
        this.f6477j = 0;
        this.f6488u = 0;
        this.f6487t = 0;
        this.f6478k = 0;
    }

    public void s(AudioTrack audioTrack, int i10, int i11, int i12) {
        this.f6470c = audioTrack;
        this.f6471d = i11;
        this.f6472e = i12;
        this.f6473f = new v(audioTrack);
        this.f6474g = audioTrack.getSampleRate();
        this.f6475h = o(i10);
        boolean s02 = q0.s0(i10);
        this.f6482o = s02;
        this.f6476i = s02 ? b((long) (i12 / i11)) : -9223372036854775807L;
        this.f6484q = 0;
        this.f6485r = 0;
        this.f6486s = 0;
        this.f6481n = false;
        this.f6489v = c.f4201b;
        this.f6490w = c.f4201b;
        this.f6480m = 0;
    }

    public void t() {
        ((v) w7.a.g(this.f6473f)).h();
    }
}
