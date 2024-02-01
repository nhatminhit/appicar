package uf;

import fh.g;
import kotlin.Metadata;
import nf.e;
import uf.o0;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"Luf/o0$a;", "Lnf/e;", "stopTimeout", "replayExpiration", "Luf/o0;", "a", "(Luf/o0$a;JJ)Luf/o0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class p0 {
    @g
    public static final o0 a(@g o0.a aVar, long j10, long j11) {
        return new s0(e.M(j10), e.M(j11));
    }

    public static /* synthetic */ o0 b(o0.a aVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = e.P.W();
        }
        if ((i10 & 2) != 0) {
            j11 = e.P.q();
        }
        return a(aVar, j10, j11);
    }
}
