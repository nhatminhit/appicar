package rf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import rf.r;
import we.l;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\u0007\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00000\u0002H\bø\u0001\u0000ø\u0001\u0001\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\b\u0010\t\u001a\\\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0002H\bø\u0001\u0000ø\u0001\u0001\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\r\u0010\t\u001a^\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\u0002H\bø\u0001\u0000ø\u0001\u0001\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u000e\u0010\t\u001a^\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\u0002H\bø\u0001\u0000ø\u0001\u0001\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u000f\u0010\t\u001a>\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u001a\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"T", "Lrf/r;", "Lkotlin/Function1;", "", "Lzd/v0;", "name", "exception", "onFailure", "e", "(Ljava/lang/Object;Lwe/l;)Ljava/lang/Object;", "value", "Lzd/u2;", "action", "h", "g", "f", "E", "", "capacity", "Lrf/m;", "onBufferOverflow", "onUndeliveredElement", "Lrf/n;", "b", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class q {
    @g
    public static final <E> n<E> b(int i10, @g m mVar, @h l<? super E, u2> lVar) {
        int i11 = 1;
        if (i10 == -2) {
            if (mVar == m.SUSPEND) {
                i11 = n.F.a();
            }
            return new h(i11, mVar, lVar);
        } else if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? (i10 == 1 && mVar == m.DROP_OLDEST) ? new a0(lVar) : new h(i10, mVar, lVar) : new d0(lVar) : mVar == m.SUSPEND ? new k0(lVar) : new h(1, mVar, lVar);
        } else {
            if (mVar != m.SUSPEND) {
                i11 = 0;
            }
            if (i11 != 0) {
                return new a0(lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
    }

    public static /* synthetic */ n c(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return d(i10, (m) null, (l) null, 6, (Object) null);
    }

    public static /* synthetic */ n d(int i10, m mVar, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            mVar = m.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return b(i10, mVar, lVar);
    }

    public static final <T> T e(@g Object obj, @g l<? super Throwable, ? extends T> lVar) {
        return obj instanceof r.c ? lVar.A(r.f(obj)) : obj;
    }

    @g
    public static final <T> Object f(@g Object obj, @g l<? super Throwable, u2> lVar) {
        if (obj instanceof r.a) {
            lVar.A(r.f(obj));
        }
        return obj;
    }

    @g
    public static final <T> Object g(@g Object obj, @g l<? super Throwable, u2> lVar) {
        if (obj instanceof r.c) {
            lVar.A(r.f(obj));
        }
        return obj;
    }

    @g
    public static final <T> Object h(@g Object obj, @g l<? super T, u2> lVar) {
        if (!(obj instanceof r.c)) {
            lVar.A(obj);
        }
        return obj;
    }
}
