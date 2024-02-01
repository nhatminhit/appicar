package p6;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import d5.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p6.i;
import w7.q0;
import w7.s;
import w7.w;

public final class h extends i {

    /* renamed from: s  reason: collision with root package name */
    public static final int f11571s = 3840;

    /* renamed from: t  reason: collision with root package name */
    public static final int f11572t = 48000;

    /* renamed from: u  reason: collision with root package name */
    public static final int f11573u = q0.T("Opus");

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f11574v = {79, 112, k.f6147x0, 115, 72, 101, 97, 100};

    /* renamed from: r  reason: collision with root package name */
    public boolean f11575r;

    public static boolean n(w wVar) {
        int a10 = wVar.a();
        byte[] bArr = f11574v;
        if (a10 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        wVar.i(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    public long e(w wVar) {
        return b(l(wVar.f14880a));
    }

    public boolean h(w wVar, long j10, i.b bVar) {
        boolean z10 = true;
        if (!this.f11575r) {
            byte[] copyOf = Arrays.copyOf(wVar.f14880a, wVar.d());
            byte b10 = copyOf[9] & 255;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            m(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
            m(arrayList, 3840);
            bVar.f11593a = Format.r((String) null, s.L, (String) null, -1, -1, b10, f11572t, arrayList, (DrmInitData) null, 0, (String) null);
            this.f11575r = true;
            return true;
        }
        if (wVar.l() != f11573u) {
            z10 = false;
        }
        wVar.Q(0);
        return z10;
    }

    public void j(boolean z10) {
        super.j(z10);
        if (z10) {
            this.f11575r = false;
        }
    }

    public final long l(byte[] bArr) {
        byte b10 = bArr[0] & 255;
        byte b11 = b10 & 3;
        byte b12 = 2;
        if (b11 == 0) {
            b12 = 1;
        } else if (!(b11 == 1 || b11 == 2)) {
            b12 = bArr[1] & 63;
        }
        int i10 = b10 >> 3;
        int i11 = i10 & 3;
        return ((long) b12) * ((long) (i10 >= 16 ? 2500 << i11 : i10 >= 12 ? 10000 << (i11 & 1) : i11 == 3 ? 60000 : 10000 << i11));
    }

    public final void m(List<byte[]> list, int i10) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i10) * 1000000000) / 48000).array());
    }
}
