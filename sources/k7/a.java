package k7;

import android.graphics.Bitmap;
import d.o0;
import h7.b;
import h7.c;
import h7.e;
import h7.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import w4.l;
import w7.q0;
import w7.w;

public final class a extends c {

    /* renamed from: s  reason: collision with root package name */
    public static final int f10043s = 20;

    /* renamed from: t  reason: collision with root package name */
    public static final int f10044t = 21;

    /* renamed from: u  reason: collision with root package name */
    public static final int f10045u = 22;

    /* renamed from: v  reason: collision with root package name */
    public static final int f10046v = 128;

    /* renamed from: w  reason: collision with root package name */
    public static final byte f10047w = 120;

    /* renamed from: o  reason: collision with root package name */
    public final w f10048o = new w();

    /* renamed from: p  reason: collision with root package name */
    public final w f10049p = new w();

    /* renamed from: q  reason: collision with root package name */
    public final C0169a f10050q = new C0169a();
    @o0

    /* renamed from: r  reason: collision with root package name */
    public Inflater f10051r;

    /* renamed from: k7.a$a  reason: collision with other inner class name */
    public static final class C0169a {

        /* renamed from: a  reason: collision with root package name */
        public final w f10052a = new w();

        /* renamed from: b  reason: collision with root package name */
        public final int[] f10053b = new int[256];

        /* renamed from: c  reason: collision with root package name */
        public boolean f10054c;

        /* renamed from: d  reason: collision with root package name */
        public int f10055d;

        /* renamed from: e  reason: collision with root package name */
        public int f10056e;

        /* renamed from: f  reason: collision with root package name */
        public int f10057f;

        /* renamed from: g  reason: collision with root package name */
        public int f10058g;

        /* renamed from: h  reason: collision with root package name */
        public int f10059h;

        /* renamed from: i  reason: collision with root package name */
        public int f10060i;

        @o0
        public b d() {
            int D;
            if (this.f10055d == 0 || this.f10056e == 0 || this.f10059h == 0 || this.f10060i == 0 || this.f10052a.d() == 0 || this.f10052a.c() != this.f10052a.d() || !this.f10054c) {
                return null;
            }
            this.f10052a.Q(0);
            int i10 = this.f10059h * this.f10060i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int D2 = this.f10052a.D();
                if (D2 != 0) {
                    D = i11 + 1;
                    iArr[i11] = this.f10053b[D2];
                } else {
                    int D3 = this.f10052a.D();
                    if (D3 != 0) {
                        D = ((D3 & 64) == 0 ? D3 & 63 : ((D3 & 63) << 8) | this.f10052a.D()) + i11;
                        Arrays.fill(iArr, i11, D, (D3 & 128) == 0 ? 0 : this.f10053b[this.f10052a.D()]);
                    }
                }
                i11 = D;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.f10059h, this.f10060i, Bitmap.Config.ARGB_8888);
            int i12 = this.f10055d;
            float f10 = ((float) this.f10057f) / ((float) i12);
            int i13 = this.f10056e;
            return new b(createBitmap, f10, 0, ((float) this.f10058g) / ((float) i13), 0, ((float) this.f10059h) / ((float) i12), ((float) this.f10060i) / ((float) i13));
        }

        public final void e(w wVar, int i10) {
            int G;
            if (i10 >= 4) {
                wVar.R(3);
                int i11 = i10 - 4;
                if ((wVar.D() & 128) != 0) {
                    if (i11 >= 7 && (G = wVar.G()) >= 4) {
                        this.f10059h = wVar.J();
                        this.f10060i = wVar.J();
                        this.f10052a.M(G - 4);
                        i11 -= 7;
                    } else {
                        return;
                    }
                }
                int c10 = this.f10052a.c();
                int d10 = this.f10052a.d();
                if (c10 < d10 && i11 > 0) {
                    int min = Math.min(i11, d10 - c10);
                    wVar.i(this.f10052a.f14880a, c10, min);
                    this.f10052a.Q(c10 + min);
                }
            }
        }

        public final void f(w wVar, int i10) {
            if (i10 >= 19) {
                this.f10055d = wVar.J();
                this.f10056e = wVar.J();
                wVar.R(11);
                this.f10057f = wVar.J();
                this.f10058g = wVar.J();
            }
        }

        public final void g(w wVar, int i10) {
            if (i10 % 5 == 2) {
                wVar.R(2);
                Arrays.fill(this.f10053b, 0);
                int i11 = i10 / 5;
                int i12 = 0;
                while (i12 < i11) {
                    int D = wVar.D();
                    int D2 = wVar.D();
                    int D3 = wVar.D();
                    int D4 = wVar.D();
                    int D5 = wVar.D();
                    double d10 = (double) D2;
                    double d11 = (double) (D3 + l.Q);
                    int i13 = i12;
                    double d12 = (double) (D4 + l.Q);
                    this.f10053b[D] = q0.u((int) (d10 + (d12 * 1.772d)), 0, 255) | (q0.u((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (D5 << 24) | (q0.u((int) ((1.402d * d11) + d10), 0, 255) << 16);
                    i12 = i13 + 1;
                }
                this.f10054c = true;
            }
        }

        public void h() {
            this.f10055d = 0;
            this.f10056e = 0;
            this.f10057f = 0;
            this.f10058g = 0;
            this.f10059h = 0;
            this.f10060i = 0;
            this.f10052a.M(0);
            this.f10054c = false;
        }
    }

    public a() {
        super("PgsDecoder");
    }

    @o0
    public static b D(w wVar, C0169a aVar) {
        int d10 = wVar.d();
        int D = wVar.D();
        int J = wVar.J();
        int c10 = wVar.c() + J;
        b bVar = null;
        if (c10 > d10) {
            wVar.Q(d10);
            return null;
        }
        if (D != 128) {
            switch (D) {
                case 20:
                    aVar.g(wVar, J);
                    break;
                case 21:
                    aVar.e(wVar, J);
                    break;
                case 22:
                    aVar.f(wVar, J);
                    break;
            }
        } else {
            bVar = aVar.d();
            aVar.h();
        }
        wVar.Q(c10);
        return bVar;
    }

    public final void C(w wVar) {
        if (wVar.a() > 0 && wVar.f() == 120) {
            if (this.f10051r == null) {
                this.f10051r = new Inflater();
            }
            if (q0.q0(wVar, this.f10049p, this.f10051r)) {
                w wVar2 = this.f10049p;
                wVar.O(wVar2.f14880a, wVar2.d());
            }
        }
    }

    public e z(byte[] bArr, int i10, boolean z10) throws g {
        this.f10048o.O(bArr, i10);
        C(this.f10048o);
        this.f10050q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f10048o.a() >= 3) {
            b D = D(this.f10048o, this.f10050q);
            if (D != null) {
                arrayList.add(D);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
