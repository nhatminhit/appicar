package pf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import zd.d1;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"T", "Lpf/z;", "Lzd/d1;", "result", "", "d", "(Lpf/z;Ljava/lang/Object;)Z", "Lpf/n2;", "parent", "b", "value", "a", "(Ljava/lang/Object;)Lpf/z;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class b0 {
    @g
    public static final <T> z<T> a(T t10) {
        a0 a0Var = new a0((n2) null);
        a0Var.h1(t10);
        return a0Var;
    }

    @g
    public static final <T> z<T> b(@h n2 n2Var) {
        return new a0(n2Var);
    }

    public static /* synthetic */ z c(n2 n2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n2Var = null;
        }
        return b(n2Var);
    }

    public static final <T> boolean d(@g z<T> zVar, @g Object obj) {
        Throwable e10 = d1.e(obj);
        return e10 == null ? zVar.h1(obj) : zVar.l(e10);
    }
}
