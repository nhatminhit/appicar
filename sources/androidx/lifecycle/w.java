package androidx.lifecycle;

import fh.g;
import pf.m1;
import pf.n2;
import pf.r3;
import xe.l0;

public final class w {
    @g
    public static final s a(@g p pVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        l0.p(pVar, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) pVar.c().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(pVar, r3.c((n2) null, 1, (Object) null).m1(m1.e().S1()));
        } while (!v.a(pVar.c(), (Object) null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.m();
        return lifecycleCoroutineScopeImpl;
    }
}
