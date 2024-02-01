package d7;

import com.google.android.exoplayer2.Format;
import t7.o;
import w7.a;

public abstract class l extends d {

    /* renamed from: i  reason: collision with root package name */
    public final long f6557i;

    public l(t7.l lVar, o oVar, Format format, int i10, Object obj, long j10, long j11, long j12) {
        super(lVar, oVar, 1, format, i10, obj, j10, j11);
        a.g(format);
        this.f6557i = j12;
    }

    public long g() {
        long j10 = this.f6557i;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1;
    }

    public abstract boolean h();
}
