package q7;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.f;
import d.o0;
import d7.l;
import d7.m;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import w7.q0;

public abstract class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final TrackGroup f12018a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12019b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f12020c;

    /* renamed from: d  reason: collision with root package name */
    public final Format[] f12021d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f12022e;

    /* renamed from: f  reason: collision with root package name */
    public int f12023f;

    public static final class b implements Comparator<Format> {
        public b() {
        }

        /* renamed from: a */
        public int compare(Format format, Format format2) {
            return format2.S - format.S;
        }
    }

    public a(TrackGroup trackGroup, int... iArr) {
        int i10 = 0;
        w7.a.i(iArr.length > 0);
        this.f12018a = (TrackGroup) w7.a.g(trackGroup);
        int length = iArr.length;
        this.f12019b = length;
        this.f12021d = new Format[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f12021d[i11] = trackGroup.a(iArr[i11]);
        }
        Arrays.sort(this.f12021d, new b());
        this.f12020c = new int[this.f12019b];
        while (true) {
            int i12 = this.f12019b;
            if (i10 < i12) {
                this.f12020c[i10] = trackGroup.b(this.f12021d[i10]);
                i10++;
            } else {
                this.f12022e = new long[i12];
                return;
            }
        }
    }

    public final TrackGroup a() {
        return this.f12018a;
    }

    public /* synthetic */ void c(long j10, long j11, long j12, List list, m[] mVarArr) {
        j.c(this, j10, j11, j12, list, mVarArr);
    }

    public final boolean d(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean s10 = s(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.f12019b && !s10) {
            s10 = i11 != i10 && !s(i11, elapsedRealtime);
            i11++;
        }
        if (!s10) {
            return false;
        }
        long[] jArr = this.f12022e;
        jArr[i10] = Math.max(jArr[i10], q0.d(elapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    public void e() {
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12018a == aVar.f12018a && Arrays.equals(this.f12020c, aVar.f12020c);
    }

    public final Format f(int i10) {
        return this.f12021d[i10];
    }

    public void g() {
    }

    public final int h(int i10) {
        return this.f12020c[i10];
    }

    public int hashCode() {
        if (this.f12023f == 0) {
            this.f12023f = (System.identityHashCode(this.f12018a) * 31) + Arrays.hashCode(this.f12020c);
        }
        return this.f12023f;
    }

    public int i(long j10, List<? extends l> list) {
        return list.size();
    }

    public final int j(Format format) {
        for (int i10 = 0; i10 < this.f12019b; i10++) {
            if (this.f12021d[i10] == format) {
                return i10;
            }
        }
        return -1;
    }

    public final int k() {
        return this.f12020c[b()];
    }

    public final Format l() {
        return this.f12021d[b()];
    }

    public final int length() {
        return this.f12020c.length;
    }

    public void n(float f10) {
    }

    public /* synthetic */ void o(long j10, long j11, long j12) {
        j.b(this, j10, j11, j12);
    }

    public /* synthetic */ void q() {
        j.a(this);
    }

    public final int r(int i10) {
        for (int i11 = 0; i11 < this.f12019b; i11++) {
            if (this.f12020c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean s(int i10, long j10) {
        return this.f12022e[i10] > j10;
    }
}
