package p6;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import j6.j;
import j6.q;
import j6.r;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p6.i;
import w7.l;
import w7.q0;
import w7.s;
import w7.w;
import xe.o;

public final class b extends i {

    /* renamed from: t  reason: collision with root package name */
    public static final byte f11533t = -1;

    /* renamed from: u  reason: collision with root package name */
    public static final byte f11534u = 3;

    /* renamed from: v  reason: collision with root package name */
    public static final int f11535v = 4;

    /* renamed from: r  reason: collision with root package name */
    public l f11536r;

    /* renamed from: s  reason: collision with root package name */
    public a f11537s;

    public class a implements g, q {

        /* renamed from: i  reason: collision with root package name */
        public static final int f11538i = 1;

        /* renamed from: j  reason: collision with root package name */
        public static final int f11539j = 18;

        /* renamed from: d  reason: collision with root package name */
        public long[] f11540d;

        /* renamed from: e  reason: collision with root package name */
        public long[] f11541e;

        /* renamed from: f  reason: collision with root package name */
        public long f11542f = -1;

        /* renamed from: g  reason: collision with root package name */
        public long f11543g = -1;

        public a() {
        }

        public long a(j jVar) throws IOException, InterruptedException {
            long j10 = this.f11543g;
            if (j10 < 0) {
                return -1;
            }
            long j11 = -(j10 + 2);
            this.f11543g = -1;
            return j11;
        }

        public q c() {
            return this;
        }

        public boolean d() {
            return true;
        }

        public void f(long j10) {
            this.f11543g = this.f11540d[q0.k(this.f11540d, j10, true, true)];
        }

        public void g(w wVar) {
            wVar.R(1);
            int G = wVar.G() / 18;
            this.f11540d = new long[G];
            this.f11541e = new long[G];
            for (int i10 = 0; i10 < G; i10++) {
                this.f11540d[i10] = wVar.w();
                this.f11541e[i10] = wVar.w();
                wVar.R(2);
            }
        }

        public void h(long j10) {
            this.f11542f = j10;
        }

        public q.a i(long j10) {
            int k10 = q0.k(this.f11540d, b.this.b(j10), true, true);
            long a10 = b.this.a(this.f11540d[k10]);
            r rVar = new r(a10, this.f11542f + this.f11541e[k10]);
            if (a10 < j10) {
                long[] jArr = this.f11540d;
                if (k10 != jArr.length - 1) {
                    int i10 = k10 + 1;
                    return new q.a(rVar, new r(b.this.a(jArr[i10]), this.f11542f + this.f11541e[i10]));
                }
            }
            return new q.a(rVar);
        }

        public long j() {
            return b.this.f11536r.c();
        }
    }

    public static boolean n(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean o(w wVar) {
        return wVar.a() >= 5 && wVar.D() == 127 && wVar.F() == 1179402563;
    }

    public long e(w wVar) {
        if (!n(wVar.f14880a)) {
            return -1;
        }
        return (long) m(wVar);
    }

    public boolean h(w wVar, long j10, i.b bVar) throws IOException, InterruptedException {
        byte[] bArr = wVar.f14880a;
        if (this.f11536r == null) {
            this.f11536r = new l(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, wVar.d());
            copyOfRange[4] = o.f24535b;
            List singletonList = Collections.singletonList(copyOfRange);
            int a10 = this.f11536r.a();
            l lVar = this.f11536r;
            bVar.f11593a = Format.r((String) null, s.O, (String) null, -1, a10, lVar.f14761f, lVar.f14760e, singletonList, (DrmInitData) null, 0, (String) null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            a aVar = new a();
            this.f11537s = aVar;
            aVar.g(wVar);
            return true;
        } else if (!n(bArr)) {
            return true;
        } else {
            a aVar2 = this.f11537s;
            if (aVar2 != null) {
                aVar2.h(j10);
                bVar.f11594b = this.f11537s;
            }
            return false;
        }
    }

    public void j(boolean z10) {
        super.j(z10);
        if (z10) {
            this.f11536r = null;
            this.f11537s = null;
        }
    }

    public final int m(w wVar) {
        int i10;
        int i11;
        int i12 = (wVar.f14880a[2] & 255) >> 4;
        switch (i12) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                i10 = p3.a.f11391i1;
                i11 = i12 - 2;
                break;
            case 6:
            case 7:
                wVar.R(4);
                wVar.K();
                int D = i12 == 6 ? wVar.D() : wVar.J();
                wVar.Q(0);
                return D + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i10 = 256;
                i11 = i12 - 8;
                break;
            default:
                return -1;
        }
        return i10 << i11;
    }
}
