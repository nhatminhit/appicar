package pf;

import fh.g;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import p000if.s;
import p000if.u;
import zd.d1;
import zd.e1;
import zd.p;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"Lie/g;", "context", "", "exception", "Lzd/u2;", "a", "", "Lpf/p0;", "Ljava/util/List;", "handlers", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class q0 {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final List<p0> f22020a;

    static {
        Class<p0> cls = p0.class;
        f22020a = u.c3(s.e(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    public static final void a(@g ie.g gVar, @g Throwable th2) {
        for (p0 T0 : f22020a) {
            try {
                T0.T0(gVar, th2);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, r0.c(th2, th3));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            d1.a aVar = d1.P;
            p.a(th2, new h1(gVar));
            d1.b(u2.f25116a);
        } catch (Throwable th4) {
            d1.a aVar2 = d1.P;
            d1.b(e1.a(th4));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }
}
