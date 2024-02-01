package rf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import pf.c2;
import we.l;
import wf.q0;
import zd.b1;
import zd.i0;
import zd.k;
import zd.m;
import zd.u2;
import zf.e;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&J-\u0010\u0012\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u000eH'J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u001b\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lrf/m0;", "E", "", "element", "Lzd/u2;", "C", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "Lrf/r;", "K", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "", "G", "Lkotlin/Function1;", "Lzd/v0;", "name", "handler", "n", "offer", "(Ljava/lang/Object;)Z", "L", "()Z", "isClosedForSend$annotations", "()V", "isClosedForSend", "Lzf/e;", "()Lzf/e;", "onSend", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface m0<E> {

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ boolean a(m0 m0Var, Throwable th2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th2 = null;
                }
                return m0Var.G(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }

        @c2
        public static /* synthetic */ void b() {
        }

        @k(level = m.P, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@g m0<? super E> m0Var, E e10) {
            Object K = m0Var.K(e10);
            if (r.m(K)) {
                return true;
            }
            Throwable f10 = r.f(K);
            if (f10 == null) {
                return false;
            }
            throw q0.p(f10);
        }
    }

    @h
    Object C(E e10, @g d<? super u2> dVar);

    @g
    e<E, m0<E>> E();

    boolean G(@h Throwable th2);

    @g
    Object K(E e10);

    boolean L();

    @c2
    void n(@g l<? super Throwable, u2> lVar);

    @k(level = m.P, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E e10);
}
