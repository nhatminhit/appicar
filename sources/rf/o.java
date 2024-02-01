package rf;

import fh.g;
import fh.h;
import ie.d;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import pf.a;
import pf.c2;
import pf.o2;
import pf.v2;
import we.l;
import zd.b1;
import zd.k;
import zd.m;
import zd.u2;
import zf.e;

@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010?\u001a\u00020>\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010@\u001a\u00020\u0007\u0012\u0006\u0010A\u001a\u00020\u0007¢\u0006\u0004\bB\u0010CJ\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001J.\u0010\r\u001a\u00020\u00032#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\tH\u0001J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0003J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017HAø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\u0004\u0018\u00018\u0000HAø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u0014J'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0010\u001a\u00028\u0000H\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0012\u0010 \u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u0016\u0010#\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00078\u0016X\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00078\u0016X\u0005¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0014\u0010/\u001a\u00020\u00078\u0016X\u0005¢\u0006\u0006\u001a\u0004\b/\u0010+R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00028\u0000008\u0016X\u0005¢\u0006\u0006\u001a\u0004\b1\u00102R#\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017008\u0016X\u0005ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b4\u00102R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000008VX\u0005¢\u0006\u0006\u001a\u0004\b6\u00102R&\u0010;\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000009088\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0001\u0010:R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b<\u0010(\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Lrf/o;", "E", "Lpf/a;", "Lzd/u2;", "Lrf/n;", "", "cause", "", "G", "Lkotlin/Function1;", "Lzd/v0;", "name", "handler", "n", "Lrf/p;", "iterator", "element", "offer", "(Ljava/lang/Object;)Z", "poll", "()Ljava/lang/Object;", "D", "(Lie/d;)Ljava/lang/Object;", "Lrf/r;", "v", "J", "C", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "z", "K", "(Ljava/lang/Object;)Ljava/lang/Object;", "cancel", "f", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "h", "l0", "Q", "Lrf/n;", "J1", "()Lrf/n;", "_channel", "b", "()Z", "isClosedForReceive", "L", "isClosedForSend", "isEmpty", "Lzf/d;", "d", "()Lzf/d;", "onReceive", "j", "onReceiveCatching", "s", "onReceiveOrNull", "Lzf/e;", "Lrf/m0;", "()Lzf/e;", "onSend", "a", "channel", "Lie/g;", "parentContext", "initParentJob", "active", "<init>", "(Lie/g;Lrf/n;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class o<E> extends a<u2> implements n<E> {
    @g
    public final n<E> Q;

    public o(@g ie.g gVar, @g n<E> nVar, boolean z10, boolean z11) {
        super(gVar, z10, z11);
        this.Q = nVar;
    }

    @h
    public Object C(E e10, @g d<? super u2> dVar) {
        return this.Q.C(e10, dVar);
    }

    @h
    public Object D(@g d<? super E> dVar) {
        return this.Q.D(dVar);
    }

    @g
    public e<E, m0<E>> E() {
        return this.Q.E();
    }

    public boolean G(@h Throwable th2) {
        return this.Q.G(th2);
    }

    @h
    @oe.h
    @k(level = m.P, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    public Object J(@g d<? super E> dVar) {
        return this.Q.J(dVar);
    }

    @g
    public final n<E> J1() {
        return this.Q;
    }

    @g
    public Object K(E e10) {
        return this.Q.K(e10);
    }

    public boolean L() {
        return this.Q.L();
    }

    @g
    public final n<E> a() {
        return this;
    }

    public boolean b() {
        return this.Q.b();
    }

    public /* synthetic */ void cancel() {
        l0(new o2(p0(), (Throwable) null, this));
    }

    @g
    public zf.d<E> d() {
        return this.Q.d();
    }

    @k(level = m.Q, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean f(Throwable th2) {
        l0(new o2(p0(), (Throwable) null, this));
        return true;
    }

    public final void h(@h CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new o2(p0(), (Throwable) null, this);
            }
            l0(cancellationException);
        }
    }

    public boolean isEmpty() {
        return this.Q.isEmpty();
    }

    @g
    public p<E> iterator() {
        return this.Q.iterator();
    }

    @g
    public zf.d<r<E>> j() {
        return this.Q.j();
    }

    public void l0(@g Throwable th2) {
        CancellationException w12 = v2.w1(this, th2, (String) null, 1, (Object) null);
        this.Q.h(w12);
        i0(w12);
    }

    @c2
    public void n(@g l<? super Throwable, u2> lVar) {
        this.Q.n(lVar);
    }

    @k(level = m.P, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e10) {
        return this.Q.offer(e10);
    }

    @h
    @k(level = m.P, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return this.Q.poll();
    }

    @g
    public zf.d<E> s() {
        return this.Q.s();
    }

    @h
    public Object v(@g d<? super r<? extends E>> dVar) {
        Object v10 = this.Q.v(dVar);
        ke.d.h();
        return v10;
    }

    @g
    public Object z() {
        return this.Q.z();
    }
}
