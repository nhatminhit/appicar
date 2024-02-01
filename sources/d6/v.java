package d6;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import b6.c;
import b6.h;
import d.o0;
import w7.q0;

public final class v {

    /* renamed from: g  reason: collision with root package name */
    public static final int f6447g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final int f6448h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static final int f6449i = 2;

    /* renamed from: j  reason: collision with root package name */
    public static final int f6450j = 3;

    /* renamed from: k  reason: collision with root package name */
    public static final int f6451k = 4;

    /* renamed from: l  reason: collision with root package name */
    public static final int f6452l = 5000;

    /* renamed from: m  reason: collision with root package name */
    public static final int f6453m = 10000000;

    /* renamed from: n  reason: collision with root package name */
    public static final int f6454n = 500000;

    /* renamed from: o  reason: collision with root package name */
    public static final int f6455o = 500000;
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final a f6456a;

    /* renamed from: b  reason: collision with root package name */
    public int f6457b;

    /* renamed from: c  reason: collision with root package name */
    public long f6458c;

    /* renamed from: d  reason: collision with root package name */
    public long f6459d;

    /* renamed from: e  reason: collision with root package name */
    public long f6460e;

    /* renamed from: f  reason: collision with root package name */
    public long f6461f;

    @TargetApi(19)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final AudioTrack f6462a;

        /* renamed from: b  reason: collision with root package name */
        public final AudioTimestamp f6463b = new AudioTimestamp();

        /* renamed from: c  reason: collision with root package name */
        public long f6464c;

        /* renamed from: d  reason: collision with root package name */
        public long f6465d;

        /* renamed from: e  reason: collision with root package name */
        public long f6466e;

        public a(AudioTrack audioTrack) {
            this.f6462a = audioTrack;
        }

        public long a() {
            return this.f6466e;
        }

        public long b() {
            return this.f6463b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f6462a.getTimestamp(this.f6463b);
            if (timestamp) {
                long j10 = this.f6463b.framePosition;
                if (this.f6465d > j10) {
                    this.f6464c++;
                }
                this.f6465d = j10;
                this.f6466e = j10 + (this.f6464c << 32);
            }
            return timestamp;
        }
    }

    public v(AudioTrack audioTrack) {
        if (q0.f14786a >= 19) {
            this.f6456a = new a(audioTrack);
            h();
            return;
        }
        this.f6456a = null;
        i(3);
    }

    public void a() {
        if (this.f6457b == 4) {
            h();
        }
    }

    public long b() {
        a aVar = this.f6456a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1;
    }

    public long c() {
        a aVar = this.f6456a;
        return aVar != null ? aVar.b() : c.f4201b;
    }

    public boolean d() {
        int i10 = this.f6457b;
        return i10 == 1 || i10 == 2;
    }

    public boolean e() {
        return this.f6457b == 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r0 != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r0 == false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(long r7) {
        /*
            r6 = this;
            d6.v$a r0 = r6.f6456a
            r1 = 0
            if (r0 == 0) goto L_0x0071
            long r2 = r6.f6460e
            long r2 = r7 - r2
            long r4 = r6.f6459d
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0010
            goto L_0x0071
        L_0x0010:
            r6.f6460e = r7
            boolean r0 = r0.c()
            int r2 = r6.f6457b
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L_0x0049
            r7 = 2
            if (r2 == r4) goto L_0x0033
            if (r2 == r7) goto L_0x0030
            if (r2 == r3) goto L_0x002d
            r7 = 4
            if (r2 != r7) goto L_0x0027
            goto L_0x0070
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L_0x002d:
            if (r0 == 0) goto L_0x0070
            goto L_0x0045
        L_0x0030:
            if (r0 != 0) goto L_0x0070
            goto L_0x0045
        L_0x0033:
            if (r0 == 0) goto L_0x0045
            d6.v$a r8 = r6.f6456a
            long r1 = r8.a()
            long r3 = r6.f6461f
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x0070
            r6.i(r7)
            goto L_0x0070
        L_0x0045:
            r6.h()
            goto L_0x0070
        L_0x0049:
            if (r0 == 0) goto L_0x0063
            d6.v$a r7 = r6.f6456a
            long r7 = r7.b()
            long r2 = r6.f6458c
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x0071
            d6.v$a r7 = r6.f6456a
            long r7 = r7.a()
            r6.f6461f = r7
            r6.i(r4)
            goto L_0x0070
        L_0x0063:
            long r1 = r6.f6458c
            long r7 = r7 - r1
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x0070
            r6.i(r3)
        L_0x0070:
            r1 = r0
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.v.f(long):boolean");
    }

    public void g() {
        i(4);
    }

    public void h() {
        if (this.f6456a != null) {
            i(0);
        }
    }

    public final void i(int i10) {
        this.f6457b = i10;
        long j10 = h.f4357h;
        if (i10 == 0) {
            this.f6460e = 0;
            this.f6461f = -1;
            this.f6458c = System.nanoTime() / 1000;
        } else if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                j10 = 10000000;
            } else if (i10 == 4) {
                j10 = 500000;
            } else {
                throw new IllegalStateException();
            }
        }
        this.f6459d = j10;
    }
}
