package ge;

import bc.p;
import fh.g;
import oe.f;
import ve.h;
import xe.l0;
import zd.u2;

@h(name = "ThreadsKt")
public final class b {

    public static final class a extends Thread {
        public final /* synthetic */ we.a<u2> O;

        public a(we.a<u2> aVar) {
            this.O = aVar;
        }

        public void run() {
            this.O.n();
        }
    }

    @f
    public static final <T> T a(ThreadLocal<T> threadLocal, we.a<? extends T> aVar) {
        l0.p(threadLocal, "<this>");
        l0.p(aVar, p.f16197p);
        T t10 = threadLocal.get();
        if (t10 != null) {
            return t10;
        }
        T n10 = aVar.n();
        threadLocal.set(n10);
        return n10;
    }

    @g
    public static final Thread b(boolean z10, boolean z11, @fh.h ClassLoader classLoader, @fh.h String str, int i10, @g we.a<u2> aVar) {
        l0.p(aVar, "block");
        a aVar2 = new a(aVar);
        if (z11) {
            aVar2.setDaemon(true);
        }
        if (i10 > 0) {
            aVar2.setPriority(i10);
        }
        if (str != null) {
            aVar2.setName(str);
        }
        if (classLoader != null) {
            aVar2.setContextClassLoader(classLoader);
        }
        if (z10) {
            aVar2.start();
        }
        return aVar2;
    }

    public static /* synthetic */ Thread c(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, we.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        ClassLoader classLoader2 = (i11 & 4) != 0 ? null : classLoader;
        String str2 = (i11 & 8) != 0 ? null : str;
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        return b(z12, z13, classLoader2, str2, i10, aVar);
    }
}
