package m6;

import b6.j0;
import j6.j;
import java.io.IOException;
import java.util.ArrayDeque;
import y4.c;

public final class a implements c {

    /* renamed from: h  reason: collision with root package name */
    public static final int f10472h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final int f10473i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f10474j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static final int f10475k = 4;

    /* renamed from: l  reason: collision with root package name */
    public static final int f10476l = 8;

    /* renamed from: m  reason: collision with root package name */
    public static final int f10477m = 8;

    /* renamed from: n  reason: collision with root package name */
    public static final int f10478n = 4;

    /* renamed from: o  reason: collision with root package name */
    public static final int f10479o = 8;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f10480a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<b> f10481b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public final g f10482c = new g();

    /* renamed from: d  reason: collision with root package name */
    public b f10483d;

    /* renamed from: e  reason: collision with root package name */
    public int f10484e;

    /* renamed from: f  reason: collision with root package name */
    public int f10485f;

    /* renamed from: g  reason: collision with root package name */
    public long f10486g;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f10487a;

        /* renamed from: b  reason: collision with root package name */
        public final long f10488b;

        public b(int i10, long j10) {
            this.f10487a = i10;
            this.f10488b = j10;
        }
    }

    public boolean a(j jVar) throws IOException, InterruptedException {
        w7.a.g(this.f10483d);
        while (true) {
            if (this.f10481b.isEmpty() || jVar.getPosition() < this.f10481b.peek().f10488b) {
                if (this.f10484e == 0) {
                    long d10 = this.f10482c.d(jVar, true, false, 4);
                    if (d10 == -2) {
                        d10 = c(jVar);
                    }
                    if (d10 == -1) {
                        return false;
                    }
                    this.f10485f = (int) d10;
                    this.f10484e = 1;
                }
                if (this.f10484e == 1) {
                    this.f10486g = this.f10482c.d(jVar, false, true, 8);
                    this.f10484e = 2;
                }
                int b10 = this.f10483d.b(this.f10485f);
                if (b10 == 0) {
                    jVar.i((int) this.f10486g);
                    this.f10484e = 0;
                } else if (b10 == 1) {
                    long position = jVar.getPosition();
                    this.f10481b.push(new b(this.f10485f, this.f10486g + position));
                    this.f10483d.f(this.f10485f, position, this.f10486g);
                    this.f10484e = 0;
                    return true;
                } else if (b10 == 2) {
                    long j10 = this.f10486g;
                    if (j10 <= 8) {
                        this.f10483d.g(this.f10485f, e(jVar, (int) j10));
                        this.f10484e = 0;
                        return true;
                    }
                    throw new j0("Invalid integer size: " + this.f10486g);
                } else if (b10 == 3) {
                    long j11 = this.f10486g;
                    if (j11 <= c.M0) {
                        this.f10483d.d(this.f10485f, f(jVar, (int) j11));
                        this.f10484e = 0;
                        return true;
                    }
                    throw new j0("String element size: " + this.f10486g);
                } else if (b10 == 4) {
                    this.f10483d.h(this.f10485f, (int) this.f10486g, jVar);
                    this.f10484e = 0;
                    return true;
                } else if (b10 == 5) {
                    long j12 = this.f10486g;
                    if (j12 == 4 || j12 == 8) {
                        this.f10483d.e(this.f10485f, d(jVar, (int) j12));
                        this.f10484e = 0;
                        return true;
                    }
                    throw new j0("Invalid float size: " + this.f10486g);
                } else {
                    throw new j0("Invalid element type " + b10);
                }
            } else {
                this.f10483d.a(this.f10481b.pop().f10487a);
                return true;
            }
        }
    }

    public void b(b bVar) {
        this.f10483d = bVar;
    }

    public final long c(j jVar) throws IOException, InterruptedException {
        jVar.h();
        while (true) {
            jVar.k(this.f10480a, 0, 4);
            int c10 = g.c(this.f10480a[0]);
            if (c10 != -1 && c10 <= 4) {
                int a10 = (int) g.a(this.f10480a, c10, false);
                if (this.f10483d.c(a10)) {
                    jVar.i(c10);
                    return (long) a10;
                }
            }
            jVar.i(1);
        }
    }

    public final double d(j jVar, int i10) throws IOException, InterruptedException {
        long e10 = e(jVar, i10);
        return i10 == 4 ? (double) Float.intBitsToFloat((int) e10) : Double.longBitsToDouble(e10);
    }

    public final long e(j jVar, int i10) throws IOException, InterruptedException {
        jVar.readFully(this.f10480a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f10480a[i11] & 255));
        }
        return j10;
    }

    public final String f(j jVar, int i10) throws IOException, InterruptedException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        jVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    public void reset() {
        this.f10484e = 0;
        this.f10481b.clear();
        this.f10482c.e();
    }
}
