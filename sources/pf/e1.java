package pf;

import fh.g;
import fh.h;
import ie.d;
import ke.c;
import kotlin.Metadata;
import zd.i0;
import zd.k;
import zd.m;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH&J$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lpf/e1;", "", "", "time", "Lzd/u2;", "F1", "(JLie/d;)Ljava/lang/Object;", "timeMillis", "Lpf/q;", "continuation", "p1", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lie/g;", "context", "Lpf/p1;", "W0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@i2
public interface e1 {

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        @h
        @k(level = m.P, message = "Deprecated without replacement as an internal method never intended for public use")
        public static Object a(@g e1 e1Var, long j10, @g d<? super u2> dVar) {
            if (j10 <= 0) {
                return u2.f25116a;
            }
            r rVar = new r(c.d(dVar), 1);
            rVar.Z();
            e1Var.p1(j10, rVar);
            Object z10 = rVar.z();
            if (z10 == ke.d.h()) {
                le.h.c(dVar);
            }
            return z10 == ke.d.h() ? z10 : u2.f25116a;
        }

        @g
        public static p1 b(@g e1 e1Var, long j10, @g Runnable runnable, @g ie.g gVar) {
            return b1.a().W0(j10, runnable, gVar);
        }
    }

    @h
    @k(level = m.P, message = "Deprecated without replacement as an internal method never intended for public use")
    Object F1(long j10, @g d<? super u2> dVar);

    @g
    p1 W0(long j10, @g Runnable runnable, @g ie.g gVar);

    void p1(long j10, @g q<? super u2> qVar);
}
