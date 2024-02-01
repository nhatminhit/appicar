package p6;

import b6.j0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import d.g1;
import java.io.IOException;
import java.util.ArrayList;
import p6.i;
import p6.l;
import w7.s;
import w7.w;

public final class k extends i {

    /* renamed from: r  reason: collision with root package name */
    public a f11599r;

    /* renamed from: s  reason: collision with root package name */
    public int f11600s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f11601t;

    /* renamed from: u  reason: collision with root package name */
    public l.d f11602u;

    /* renamed from: v  reason: collision with root package name */
    public l.b f11603v;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final l.d f11604a;

        /* renamed from: b  reason: collision with root package name */
        public final l.b f11605b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f11606c;

        /* renamed from: d  reason: collision with root package name */
        public final l.c[] f11607d;

        /* renamed from: e  reason: collision with root package name */
        public final int f11608e;

        public a(l.d dVar, l.b bVar, byte[] bArr, l.c[] cVarArr, int i10) {
            this.f11604a = dVar;
            this.f11605b = bVar;
            this.f11606c = bArr;
            this.f11607d = cVarArr;
            this.f11608e = i10;
        }
    }

    @g1
    public static void l(w wVar, long j10) {
        wVar.P(wVar.d() + 4);
        wVar.f14880a[wVar.d() - 4] = (byte) ((int) (j10 & 255));
        wVar.f14880a[wVar.d() - 3] = (byte) ((int) ((j10 >>> 8) & 255));
        wVar.f14880a[wVar.d() - 2] = (byte) ((int) ((j10 >>> 16) & 255));
        wVar.f14880a[wVar.d() - 1] = (byte) ((int) ((j10 >>> 24) & 255));
    }

    public static int m(byte b10, a aVar) {
        return !aVar.f11607d[n(b10, aVar.f11608e, 1)].f11618a ? aVar.f11604a.f11628g : aVar.f11604a.f11629h;
    }

    @g1
    public static int n(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean p(w wVar) {
        try {
            return l.k(1, wVar, true);
        } catch (j0 unused) {
            return false;
        }
    }

    public void d(long j10) {
        super.d(j10);
        int i10 = 0;
        this.f11601t = j10 != 0;
        l.d dVar = this.f11602u;
        if (dVar != null) {
            i10 = dVar.f11628g;
        }
        this.f11600s = i10;
    }

    public long e(w wVar) {
        int i10 = 0;
        byte b10 = wVar.f14880a[0];
        if ((b10 & 1) == 1) {
            return -1;
        }
        int m10 = m(b10, this.f11599r);
        if (this.f11601t) {
            i10 = (this.f11600s + m10) / 4;
        }
        long j10 = (long) i10;
        l(wVar, j10);
        this.f11601t = true;
        this.f11600s = m10;
        return j10;
    }

    public boolean h(w wVar, long j10, i.b bVar) throws IOException, InterruptedException {
        if (this.f11599r != null) {
            return false;
        }
        a o10 = o(wVar);
        this.f11599r = o10;
        if (o10 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f11599r.f11604a.f11631j);
        arrayList.add(this.f11599r.f11606c);
        l.d dVar = this.f11599r.f11604a;
        bVar.f11593a = Format.r((String) null, s.K, (String) null, dVar.f11626e, -1, dVar.f11623b, (int) dVar.f11624c, arrayList, (DrmInitData) null, 0, (String) null);
        return true;
    }

    public void j(boolean z10) {
        super.j(z10);
        if (z10) {
            this.f11599r = null;
            this.f11602u = null;
            this.f11603v = null;
        }
        this.f11600s = 0;
        this.f11601t = false;
    }

    @g1
    public a o(w wVar) throws IOException {
        if (this.f11602u == null) {
            this.f11602u = l.i(wVar);
            return null;
        } else if (this.f11603v == null) {
            this.f11603v = l.h(wVar);
            return null;
        } else {
            byte[] bArr = new byte[wVar.d()];
            System.arraycopy(wVar.f14880a, 0, bArr, 0, wVar.d());
            l.c[] j10 = l.j(wVar, this.f11602u.f11623b);
            return new a(this.f11602u, this.f11603v, bArr, j10, l.a(j10.length - 1));
        }
    }
}
