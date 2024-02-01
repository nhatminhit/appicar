package l6;

import b6.j0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import j6.s;
import l6.e;
import w7.t;
import w7.w;
import x7.a;

public final class f extends e {

    /* renamed from: h  reason: collision with root package name */
    public static final int f10243h = 7;

    /* renamed from: i  reason: collision with root package name */
    public static final int f10244i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f10245j = 5;

    /* renamed from: k  reason: collision with root package name */
    public static final int f10246k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final int f10247l = 1;

    /* renamed from: b  reason: collision with root package name */
    public final w f10248b = new w(t.f14846b);

    /* renamed from: c  reason: collision with root package name */
    public final w f10249c = new w(4);

    /* renamed from: d  reason: collision with root package name */
    public int f10250d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10251e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10252f;

    /* renamed from: g  reason: collision with root package name */
    public int f10253g;

    public f(s sVar) {
        super(sVar);
    }

    public boolean b(w wVar) throws e.a {
        int D = wVar.D();
        int i10 = (D >> 4) & 15;
        int i11 = D & 15;
        if (i11 == 7) {
            this.f10253g = i10;
            return i10 != 5;
        }
        throw new e.a("Video format not supported: " + i11);
    }

    public boolean c(w wVar, long j10) throws j0 {
        w wVar2 = wVar;
        int D = wVar.D();
        long m10 = j10 + (((long) wVar.m()) * 1000);
        if (D == 0 && !this.f10251e) {
            w wVar3 = new w(new byte[wVar.a()]);
            wVar2.i(wVar3.f14880a, 0, wVar.a());
            a b10 = a.b(wVar3);
            this.f10250d = b10.f15148b;
            this.f10242a.d(Format.G((String) null, w7.s.f14813h, (String) null, -1, -1, b10.f15149c, b10.f15150d, -1.0f, b10.f15147a, -1, b10.f15151e, (DrmInitData) null));
            this.f10251e = true;
            return false;
        } else if (D != 1 || !this.f10251e) {
            return false;
        } else {
            int i10 = this.f10253g == 1 ? 1 : 0;
            if (!this.f10252f && i10 == 0) {
                return false;
            }
            byte[] bArr = this.f10249c.f14880a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i11 = 4 - this.f10250d;
            int i12 = 0;
            while (wVar.a() > 0) {
                wVar2.i(this.f10249c.f14880a, i11, this.f10250d);
                this.f10249c.Q(0);
                int H = this.f10249c.H();
                this.f10248b.Q(0);
                this.f10242a.a(this.f10248b, 4);
                this.f10242a.a(wVar2, H);
                i12 = i12 + 4 + H;
            }
            this.f10242a.c(m10, i10, i12, 0, (s.a) null);
            this.f10252f = true;
            return true;
        }
    }

    public void d() {
        this.f10252f = false;
    }
}
