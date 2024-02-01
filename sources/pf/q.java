package pf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import we.l;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\tH'J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0004H'J\b\u0010\u0015\u001a\u00020\rH'J\u0014\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tH&J1\u0010\u0001\u001a\u00020\r2'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u0018H&J\u001b\u0010\u001b\u001a\u00020\r*\u00020\u001a2\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\r*\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\tH'J<\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00028\u00002#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0014\u0010%\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!¨\u0006&"}, d2 = {"Lpf/q;", "T", "Lie/d;", "value", "", "idempotent", "r", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lzd/v0;", "name", "cause", "Lzd/u2;", "onCancellation", "p", "(Ljava/lang/Object;Ljava/lang/Object;Lwe/l;)Ljava/lang/Object;", "exception", "S", "token", "t0", "Z", "", "f", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lpf/o0;", "W", "(Lpf/o0;Ljava/lang/Object;)V", "U", "B", "(Ljava/lang/Object;Lwe/l;)V", "c", "()Z", "isActive", "m", "isCompleted", "isCancelled", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface q<T> extends d<T> {

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ boolean a(q qVar, Throwable th2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th2 = null;
                }
                return qVar.f(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ Object b(q qVar, Object obj, Object obj2, int i10, Object obj3) {
            if (obj3 == null) {
                if ((i10 & 2) != 0) {
                    obj2 = null;
                }
                return qVar.r(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    @c2
    void B(T t10, @h l<? super Throwable, u2> lVar);

    @i2
    @h
    Object S(@g Throwable th2);

    void T(@g l<? super Throwable, u2> lVar);

    @c2
    void U(@g o0 o0Var, @g Throwable th2);

    @c2
    void W(@g o0 o0Var, T t10);

    @i2
    void Z();

    boolean c();

    boolean f(@h Throwable th2);

    boolean isCancelled();

    boolean m();

    @i2
    @h
    Object p(T t10, @h Object obj, @h l<? super Throwable, u2> lVar);

    @i2
    @h
    Object r(T t10, @h Object obj);

    @i2
    void t0(@g Object obj);
}
