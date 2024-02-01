package n6;

import android.util.Pair;
import b6.c;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import j6.q;
import j6.r;
import n6.e;
import w7.q0;

public final class b implements e.b {

    /* renamed from: d  reason: collision with root package name */
    public final long[] f10888d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f10889e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10890f;

    public b(long[] jArr, long[] jArr2) {
        this.f10888d = jArr;
        this.f10889e = jArr2;
        this.f10890f = c.b(jArr2[jArr2.length - 1]);
    }

    public static b a(long j10, MlltFrame mlltFrame) {
        int length = mlltFrame.S.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j11 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (mlltFrame.Q + mlltFrame.S[i12]);
            j11 += (long) (mlltFrame.R + mlltFrame.T[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j11;
        }
        return new b(jArr, jArr2);
    }

    public static Pair<Long, Long> c(long j10, long[] jArr, long[] jArr2) {
        Long valueOf;
        Long valueOf2;
        int k10 = q0.k(jArr, j10, true, true);
        long j11 = jArr[k10];
        long j12 = jArr2[k10];
        int i10 = k10 + 1;
        if (i10 == jArr.length) {
            valueOf = Long.valueOf(j11);
            valueOf2 = Long.valueOf(j12);
        } else {
            long j13 = jArr[i10];
            long j14 = jArr2[i10];
            double d10 = j13 == j11 ? 0.0d : (((double) j10) - ((double) j11)) / ((double) (j13 - j11));
            valueOf = Long.valueOf(j10);
            valueOf2 = Long.valueOf(((long) (d10 * ((double) (j14 - j12)))) + j12);
        }
        return Pair.create(valueOf, valueOf2);
    }

    public long b() {
        return -1;
    }

    public boolean d() {
        return true;
    }

    public long e(long j10) {
        return c.b(((Long) c(j10, this.f10888d, this.f10889e).second).longValue());
    }

    public q.a i(long j10) {
        Pair<Long, Long> c10 = c(c.c(q0.v(j10, 0, this.f10890f)), this.f10889e, this.f10888d);
        return new q.a(new r(c.b(((Long) c10.first).longValue()), ((Long) c10.second).longValue()));
    }

    public long j() {
        return this.f10890f;
    }
}
