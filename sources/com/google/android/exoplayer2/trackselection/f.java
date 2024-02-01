package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import d.o0;
import d7.l;
import d7.m;
import java.util.List;
import t7.d;

public interface f {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TrackGroup f5442a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f5443b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5444c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public final Object f5445d;

        public a(TrackGroup trackGroup, int... iArr) {
            this(trackGroup, iArr, 0, (Object) null);
        }

        public a(TrackGroup trackGroup, int[] iArr, int i10, @o0 Object obj) {
            this.f5442a = trackGroup;
            this.f5443b = iArr;
            this.f5444c = i10;
            this.f5445d = obj;
        }
    }

    public interface b {
        f[] a(a[] aVarArr, d dVar);

        @Deprecated
        f b(TrackGroup trackGroup, d dVar, int... iArr);
    }

    TrackGroup a();

    int b();

    void c(long j10, long j11, long j12, List<? extends l> list, m[] mVarArr);

    boolean d(int i10, long j10);

    void e();

    Format f(int i10);

    void g();

    int h(int i10);

    int i(long j10, List<? extends l> list);

    int j(Format format);

    int k();

    Format l();

    int length();

    int m();

    void n(float f10);

    @Deprecated
    void o(long j10, long j11, long j12);

    @o0
    Object p();

    void q();

    int r(int i10);
}
