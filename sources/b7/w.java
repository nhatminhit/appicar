package b7;

import b6.v0;
import b7.s0;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.f;
import java.io.IOException;
import java.util.List;

public interface w extends s0 {

    public interface a extends s0.a<w> {
        void i(w wVar);
    }

    long b();

    long c(long j10, v0 v0Var);

    boolean d(long j10);

    long e();

    void f(long j10);

    long h(f[] fVarArr, boolean[] zArr, r0[] r0VarArr, boolean[] zArr2, long j10);

    List<StreamKey> m(List<f> list);

    void n(a aVar, long j10);

    void o() throws IOException;

    long p(long j10);

    long s();

    TrackGroupArray t();

    void u(long j10, boolean z10);
}
