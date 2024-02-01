package q7;

import b6.c;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.g;
import d.o0;
import d7.l;
import d7.m;
import java.util.List;

public final class p implements i {

    /* renamed from: b  reason: collision with root package name */
    public final long f12040b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12041c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f12042d;

    public p(long j10, long j11, boolean z10) {
        this.f12040b = c.b(j10);
        this.f12041c = c.b(j11);
        this.f12042d = z10;
    }

    public int[] a(Format[] formatArr, List<? extends l> list, m[] mVarArr, @o0 int[] iArr) {
        long j10 = this.f12041c;
        if (j10 <= 0 && this.f12040b <= 0) {
            return g.i(formatArr, iArr);
        }
        return g.f(formatArr, list, this.f12040b, mVarArr, j10, this.f12042d, iArr);
    }
}
