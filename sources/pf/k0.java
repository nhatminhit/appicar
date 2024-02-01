package pf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import we.l;
import xe.w;
import zd.d1;
import zd.e1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\n\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a0\u0010\u000e\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"T", "Lzd/d1;", "Lkotlin/Function1;", "", "Lzd/v0;", "name", "cause", "Lzd/u2;", "onCancellation", "", "c", "(Ljava/lang/Object;Lwe/l;)Ljava/lang/Object;", "Lpf/q;", "caller", "b", "(Ljava/lang/Object;Lpf/q;)Ljava/lang/Object;", "state", "Lie/d;", "uCont", "a", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class k0 {
    @g
    public static final <T> Object a(@h Object obj, @g d<? super T> dVar) {
        if (obj instanceof e0) {
            d1.a aVar = d1.P;
            obj = e1.a(((e0) obj).f21998a);
        } else {
            d1.a aVar2 = d1.P;
        }
        return d1.b(obj);
    }

    @h
    public static final <T> Object b(@g Object obj, @g q<?> qVar) {
        Throwable e10 = d1.e(obj);
        return e10 == null ? obj : new e0(e10, false, 2, (w) null);
    }

    @h
    public static final <T> Object c(@g Object obj, @h l<? super Throwable, u2> lVar) {
        Throwable e10 = d1.e(obj);
        return e10 == null ? lVar != null ? new f0(obj, lVar) : obj : new e0(e10, false, 2, (w) null);
    }

    public static /* synthetic */ Object d(Object obj, l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}
