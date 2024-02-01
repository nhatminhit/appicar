package j6;

import com.google.android.exoplayer2.Format;
import d.o0;
import j6.s;
import java.io.EOFException;
import java.io.IOException;
import w7.w;

public final class h implements s {
    public void a(w wVar, int i10) {
        wVar.R(i10);
    }

    public int b(j jVar, int i10, boolean z10) throws IOException, InterruptedException {
        int f10 = jVar.f(i10);
        if (f10 != -1) {
            return f10;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void c(long j10, int i10, int i11, int i12, @o0 s.a aVar) {
    }

    public void d(Format format) {
    }
}
