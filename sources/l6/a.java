package l6;

import android.util.Pair;
import b6.j0;
import b7.u0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import j6.s;
import java.util.Collections;
import java.util.List;
import l6.e;
import w7.d;
import w7.w;

public final class a extends e {

    /* renamed from: e  reason: collision with root package name */
    public static final int f10198e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final int f10199f = 7;

    /* renamed from: g  reason: collision with root package name */
    public static final int f10200g = 8;

    /* renamed from: h  reason: collision with root package name */
    public static final int f10201h = 10;

    /* renamed from: i  reason: collision with root package name */
    public static final int f10202i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static final int f10203j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f10204k = {5512, 11025, 22050, u0.U};

    /* renamed from: b  reason: collision with root package name */
    public boolean f10205b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10206c;

    /* renamed from: d  reason: collision with root package name */
    public int f10207d;

    public a(s sVar) {
        super(sVar);
    }

    public boolean b(w wVar) throws e.a {
        Format q10;
        if (!this.f10205b) {
            int D = wVar.D();
            int i10 = (D >> 4) & 15;
            this.f10207d = i10;
            if (i10 == 2) {
                q10 = Format.r((String) null, w7.s.f14838w, (String) null, -1, -1, 1, f10204k[(D >> 2) & 3], (List<byte[]>) null, (DrmInitData) null, 0, (String) null);
            } else if (i10 == 7 || i10 == 8) {
                q10 = Format.q((String) null, i10 == 7 ? w7.s.A : w7.s.B, (String) null, -1, -1, 1, 8000, (D & 1) == 1 ? 2 : 3, (List<byte[]>) null, (DrmInitData) null, 0, (String) null);
            } else {
                if (i10 != 10) {
                    throw new e.a("Audio format not supported: " + this.f10207d);
                }
                this.f10205b = true;
            }
            this.f10242a.d(q10);
            this.f10206c = true;
            this.f10205b = true;
        } else {
            wVar.R(1);
        }
        return true;
    }

    public boolean c(w wVar, long j10) throws j0 {
        w wVar2 = wVar;
        if (this.f10207d == 2) {
            int a10 = wVar.a();
            this.f10242a.a(wVar2, a10);
            this.f10242a.c(j10, 1, a10, 0, (s.a) null);
            return true;
        }
        int D = wVar.D();
        if (D == 0 && !this.f10206c) {
            int a11 = wVar.a();
            byte[] bArr = new byte[a11];
            wVar2.i(bArr, 0, a11);
            Pair<Integer, Integer> j11 = d.j(bArr);
            this.f10242a.d(Format.r((String) null, w7.s.f14836u, (String) null, -1, -1, ((Integer) j11.second).intValue(), ((Integer) j11.first).intValue(), Collections.singletonList(bArr), (DrmInitData) null, 0, (String) null));
            this.f10206c = true;
            return false;
        } else if (this.f10207d == 10 && D != 1) {
            return false;
        } else {
            int a12 = wVar.a();
            this.f10242a.a(wVar2, a12);
            this.f10242a.c(j10, 1, a12, 0, (s.a) null);
            return true;
        }
    }

    public void d() {
    }
}
