package vf;

import ie.g;
import kotlin.Metadata;
import pf.i2;
import rf.m;
import uf.i;
import zd.i0;

@i2
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J,\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lvf/r;", "T", "Luf/i;", "Lie/g;", "context", "", "capacity", "Lrf/m;", "onBufferOverflow", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface r<T> extends i<T> {

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ i a(r rVar, g gVar, int i10, m mVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    gVar = ie.i.O;
                }
                if ((i11 & 2) != 0) {
                    i10 = -3;
                }
                if ((i11 & 4) != 0) {
                    mVar = m.SUSPEND;
                }
                return rVar.c(gVar, i10, mVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    @fh.g
    i<T> c(@fh.g g gVar, int i10, @fh.g m mVar);
}
