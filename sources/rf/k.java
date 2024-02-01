package rf;

import fh.g;
import fh.h;
import ie.d;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import pf.a;
import pf.c2;
import pf.n2;
import pf.o2;
import pf.r0;
import pf.v2;
import rf.m0;
import we.l;
import zd.b1;
import zd.m;
import zd.u2;
import zf.e;

@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B%\u0012\u0006\u00105\u001a\u000204\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u00106\u001a\u00020\u000e¢\u0006\u0004\b7\u00108J.\u0010\f\u001a\u00020\u00032#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0006H\u0001J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0001J\u001b\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\r\u001a\u00028\u0000H\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007J\u0016\u0010\u001b\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aJ\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u000eH\u0014J\u0012\u0010\"\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016R \u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u000e8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R&\u0010.\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0+8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0001\u0010-R\u0014\u00100\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b/\u0010)R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000,8VX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Lrf/k;", "E", "Lpf/a;", "Lzd/u2;", "Lrf/g0;", "Lrf/i;", "Lkotlin/Function1;", "", "Lzd/v0;", "name", "cause", "handler", "n", "element", "", "offer", "(Ljava/lang/Object;)Z", "Lrf/i0;", "I", "C", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "Lrf/r;", "K", "(Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "h", "l0", "value", "K1", "(Lzd/u2;)V", "handled", "G1", "G", "Q", "Lrf/i;", "J1", "()Lrf/i;", "_channel", "L", "()Z", "isClosedForSend", "Lzf/e;", "Lrf/m0;", "()Lzf/e;", "onSend", "c", "isActive", "a", "()Lrf/m0;", "channel", "Lie/g;", "parentContext", "active", "<init>", "(Lie/g;Lrf/i;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class k<E> extends a<u2> implements g0<E>, i<E> {
    @g
    public final i<E> Q;

    public k(@g ie.g gVar, @g i<E> iVar, boolean z10) {
        super(gVar, false, z10);
        this.Q = iVar;
        M0((n2) gVar.g(n2.D));
    }

    @h
    public Object C(E e10, @g d<? super u2> dVar) {
        return this.Q.C(e10, dVar);
    }

    @g
    public e<E, m0<E>> E() {
        return this.Q.E();
    }

    public boolean G(@h Throwable th2) {
        boolean G = this.Q.G(th2);
        start();
        return G;
    }

    public void G1(@g Throwable th2, boolean z10) {
        if (!this.Q.G(th2) && !z10) {
            r0.b(e(), th2);
        }
    }

    @g
    public i0<E> I() {
        return this.Q.I();
    }

    @g
    public final i<E> J1() {
        return this.Q;
    }

    @g
    public Object K(E e10) {
        return this.Q.K(e10);
    }

    /* renamed from: K1 */
    public void H1(@g u2 u2Var) {
        m0.a.a(this.Q, (Throwable) null, 1, (Object) null);
    }

    public boolean L() {
        return this.Q.L();
    }

    @g
    public m0<E> a() {
        return this;
    }

    public boolean c() {
        return super.c();
    }

    @zd.k(level = m.Q, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean f(Throwable th2) {
        if (th2 == null) {
            th2 = new o2(p0(), (Throwable) null, this);
        }
        l0(th2);
        return true;
    }

    public final void h(@h CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new o2(p0(), (Throwable) null, this);
        }
        l0(cancellationException);
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

    @zd.k(level = m.P, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e10) {
        return this.Q.offer(e10);
    }
}
