package d7;

import com.google.android.exoplayer2.Format;
import t7.l;
import t7.o;

public abstract class a extends l {

    /* renamed from: j  reason: collision with root package name */
    public final long f6505j;

    /* renamed from: k  reason: collision with root package name */
    public final long f6506k;

    /* renamed from: l  reason: collision with root package name */
    public c f6507l;

    /* renamed from: m  reason: collision with root package name */
    public int[] f6508m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(l lVar, o oVar, Format format, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(lVar, oVar, format, i10, obj, j10, j11, j14);
        this.f6505j = j12;
        this.f6506k = j13;
    }

    public final int i(int i10) {
        return this.f6508m[i10];
    }

    public final c j() {
        return this.f6507l;
    }

    public void k(c cVar) {
        this.f6507l = cVar;
        this.f6508m = cVar.b();
    }
}
