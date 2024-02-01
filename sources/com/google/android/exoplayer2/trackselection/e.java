package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.f;
import d.o0;
import d7.m;
import java.util.List;
import java.util.Random;
import q7.l;
import t7.d;

public final class e extends q7.a {

    /* renamed from: g  reason: collision with root package name */
    public final Random f5439g;

    /* renamed from: h  reason: collision with root package name */
    public int f5440h;

    public static final class a implements f.b {

        /* renamed from: a  reason: collision with root package name */
        public final Random f5441a;

        public a() {
            this.f5441a = new Random();
        }

        public a(int i10) {
            this.f5441a = new Random((long) i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ f d(f.a aVar) {
            return new e(aVar.f5442a, aVar.f5443b, this.f5441a);
        }

        public f[] a(f.a[] aVarArr, d dVar) {
            return g.a(aVarArr, new q7.f(this));
        }

        public /* synthetic */ f b(TrackGroup trackGroup, d dVar, int... iArr) {
            return l.a(this, trackGroup, dVar, iArr);
        }
    }

    public e(TrackGroup trackGroup, int... iArr) {
        super(trackGroup, iArr);
        Random random = new Random();
        this.f5439g = random;
        this.f5440h = random.nextInt(this.f12019b);
    }

    public e(TrackGroup trackGroup, int[] iArr, long j10) {
        this(trackGroup, iArr, new Random(j10));
    }

    public e(TrackGroup trackGroup, int[] iArr, Random random) {
        super(trackGroup, iArr);
        this.f5439g = random;
        this.f5440h = random.nextInt(this.f12019b);
    }

    public int b() {
        return this.f5440h;
    }

    public void c(long j10, long j11, long j12, List<? extends d7.l> list, m[] mVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = 0;
        for (int i11 = 0; i11 < this.f12019b; i11++) {
            if (!s(i11, elapsedRealtime)) {
                i10++;
            }
        }
        this.f5440h = this.f5439g.nextInt(i10);
        if (i10 != this.f12019b) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.f12019b; i13++) {
                if (!s(i13, elapsedRealtime)) {
                    int i14 = i12 + 1;
                    if (this.f5440h == i12) {
                        this.f5440h = i13;
                        return;
                    }
                    i12 = i14;
                }
            }
        }
    }

    public int m() {
        return 3;
    }

    @o0
    public Object p() {
        return null;
    }
}
