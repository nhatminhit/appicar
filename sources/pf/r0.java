package pf;

import ie.g;
import kotlin.Metadata;
import pf.p0;
import we.p;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a%\u0010\f\u001a\u00020\u000b2\u001a\b\u0004\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\tH\b¨\u0006\r"}, d2 = {"Lie/g;", "context", "", "exception", "Lzd/u2;", "b", "originalException", "thrownException", "c", "Lkotlin/Function2;", "handler", "Lpf/p0;", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class r0 {

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"pf/r0$a", "Lie/a;", "Lpf/p0;", "Lie/g;", "context", "", "exception", "Lzd/u2;", "T0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a extends ie.a implements p0 {
        public final /* synthetic */ p<g, Throwable, u2> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p<? super g, ? super Throwable, u2> pVar, p0.b bVar) {
            super(bVar);
            this.P = pVar;
        }

        public void T0(@fh.g g gVar, @fh.g Throwable th2) {
            this.P.g0(gVar, th2);
        }
    }

    @fh.g
    public static final p0 a(@fh.g p<? super g, ? super Throwable, u2> pVar) {
        return new a(pVar, p0.C);
    }

    @i2
    public static final void b(@fh.g g gVar, @fh.g Throwable th2) {
        try {
            p0 p0Var = (p0) gVar.g(p0.C);
            if (p0Var != null) {
                p0Var.T0(gVar, th2);
            } else {
                q0.a(gVar, th2);
            }
        } catch (Throwable th3) {
            q0.a(gVar, c(th2, th3));
        }
    }

    @fh.g
    public static final Throwable c(@fh.g Throwable th2, @fh.g Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        zd.p.a(runtimeException, th2);
        return runtimeException;
    }
}
