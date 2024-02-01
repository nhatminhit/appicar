package pf;

import fh.g;
import ie.d;
import kotlin.Metadata;
import wf.l;
import zd.d1;
import zd.e1;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00038@X\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00038@X\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lie/d;", "", "c", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "a", "classSimpleName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class z0 {
    @g
    public static final String a(@g Object obj) {
        return obj.getClass().getSimpleName();
    }

    @g
    public static final String b(@g Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @g
    public static final String c(@g d<?> dVar) {
        Object obj;
        if (dVar instanceof l) {
            return dVar.toString();
        }
        try {
            d1.a aVar = d1.P;
            obj = d1.b(dVar + '@' + b(dVar));
        } catch (Throwable th2) {
            d1.a aVar2 = d1.P;
            obj = d1.b(e1.a(th2));
        }
        Throwable e10 = d1.e(obj);
        String str = obj;
        if (e10 != null) {
            str = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) str;
    }
}
