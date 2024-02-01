package pf;

import fh.h;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import oe.f;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\t\u0010\u0001\u001a\u00020\u0000H\b\u001a\t\u0010\u0002\u001a\u00020\u0000H\b\u001a\u0019\u0010\u0006\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\b\u001a\t\u0010\b\u001a\u00020\u0007H\b\u001a\t\u0010\t\u001a\u00020\u0007H\b\u001a\t\u0010\n\u001a\u00020\u0007H\b\u001a\t\u0010\u000b\u001a\u00020\u0007H\b\u001a\u0019\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0000H\b\u001a\u0011\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\b\"$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0001\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"", "a", "c", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "k", "Lzd/u2;", "g", "h", "e", "j", "", "blocker", "nanos", "d", "Ljava/lang/Thread;", "thread", "i", "Lpf/b;", "Lpf/b;", "b", "()Lpf/b;", "f", "(Lpf/b;)V", "timeSource", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class c {
    @h

    /* renamed from: a  reason: collision with root package name */
    public static b f21989a;

    @f
    public static final long a() {
        b b10 = b();
        return b10 != null ? b10.a() : System.currentTimeMillis();
    }

    @h
    public static final b b() {
        return f21989a;
    }

    @f
    public static final long c() {
        b b10 = b();
        return b10 != null ? b10.b() : System.nanoTime();
    }

    @f
    public static final void d(Object obj, long j10) {
        u2 u2Var;
        b b10 = b();
        if (b10 != null) {
            b10.c(obj, j10);
            u2Var = u2.f25116a;
        } else {
            u2Var = null;
        }
        if (u2Var == null) {
            LockSupport.parkNanos(obj, j10);
        }
    }

    @f
    public static final void e() {
        b b10 = b();
        if (b10 != null) {
            b10.d();
        }
    }

    public static final void f(@h b bVar) {
        f21989a = bVar;
    }

    @f
    public static final void g() {
        b b10 = b();
        if (b10 != null) {
            b10.e();
        }
    }

    @f
    public static final void h() {
        b b10 = b();
        if (b10 != null) {
            b10.f();
        }
    }

    @f
    public static final void i(Thread thread) {
        u2 u2Var;
        b b10 = b();
        if (b10 != null) {
            b10.g(thread);
            u2Var = u2.f25116a;
        } else {
            u2Var = null;
        }
        if (u2Var == null) {
            LockSupport.unpark(thread);
        }
    }

    @f
    public static final void j() {
        b b10 = b();
        if (b10 != null) {
            b10.h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.i(r1);
     */
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Runnable k(java.lang.Runnable r1) {
        /*
            pf.b r0 = b()
            if (r0 == 0) goto L_0x000e
            java.lang.Runnable r0 = r0.i(r1)
            if (r0 != 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r1 = r0
        L_0x000e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.c.k(java.lang.Runnable):java.lang.Runnable");
    }
}
