package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.f;
import d.o0;
import d7.m;
import java.util.List;
import q7.e;
import q7.l;
import t7.d;

public final class c extends q7.a {

    /* renamed from: g  reason: collision with root package name */
    public final int f5423g;
    @o0

    /* renamed from: h  reason: collision with root package name */
    public final Object f5424h;

    @Deprecated
    public static final class a implements f.b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5425a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public final Object f5426b;

        public a() {
            this.f5425a = 0;
            this.f5426b = null;
        }

        public a(int i10, @o0 Object obj) {
            this.f5425a = i10;
            this.f5426b = obj;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ f d(f.a aVar) {
            return new c(aVar.f5442a, aVar.f5443b[0], this.f5425a, this.f5426b);
        }

        public f[] a(f.a[] aVarArr, d dVar) {
            return g.a(aVarArr, new e(this));
        }

        public /* synthetic */ f b(TrackGroup trackGroup, d dVar, int... iArr) {
            return l.a(this, trackGroup, dVar, iArr);
        }
    }

    public c(TrackGroup trackGroup, int i10) {
        this(trackGroup, i10, 0, (Object) null);
    }

    public c(TrackGroup trackGroup, int i10, int i11, @o0 Object obj) {
        super(trackGroup, i10);
        this.f5423g = i11;
        this.f5424h = obj;
    }

    public int b() {
        return 0;
    }

    public void c(long j10, long j11, long j12, List<? extends d7.l> list, m[] mVarArr) {
    }

    public int m() {
        return this.f5423g;
    }

    @o0
    public Object p() {
        return this.f5424h;
    }
}
