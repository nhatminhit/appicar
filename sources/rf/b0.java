package rf;

import fh.g;
import fh.h;
import ie.d;
import ke.c;
import kotlin.Metadata;
import we.p;
import xf.a;
import zd.u2;
import zf.e;
import zf.f;

@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003BO\u0012\u0006\u0010\"\u001a\u00020!\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\u0012-\u0010\u001a\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017¢\u0006\u0002\b&ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016JX\u0010\u001b\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0016\u001a\u00028\u00002(\u0010\u001a\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR&\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u001f\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Lrf/b0;", "E", "Lrf/d;", "Lzf/e;", "Lrf/m0;", "Lzd/u2;", "k1", "element", "C", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "", "offer", "(Ljava/lang/Object;)Z", "Lrf/r;", "K", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "G", "R", "Lzf/f;", "select", "param", "Lkotlin/Function2;", "Lie/d;", "", "block", "F", "(Lzf/f;Ljava/lang/Object;Lwe/p;)V", "Lie/d;", "continuation", "()Lzf/e;", "onSend", "Lie/g;", "parentContext", "Lrf/n;", "channel", "Lrf/f;", "Lzd/u;", "<init>", "(Lie/g;Lrf/n;Lwe/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class b0<E> extends d<E> implements e<E, m0<? super E>> {
    @g
    public d<? super u2> R;

    public b0(@g ie.g gVar, @g n<E> nVar, @g p<? super f<E>, ? super d<? super u2>, ? extends Object> pVar) {
        super(gVar, nVar, false);
        this.R = c.c(pVar, this, this);
    }

    @h
    public Object C(E e10, @g d<? super u2> dVar) {
        start();
        Object C = super.C(e10, dVar);
        return C == ke.d.h() ? C : u2.f25116a;
    }

    @g
    public e<E, m0<E>> E() {
        return this;
    }

    public <R> void F(@g f<? super R> fVar, E e10, @g p<? super m0<? super E>, ? super d<? super R>, ? extends Object> pVar) {
        start();
        super.E().F(fVar, e10, pVar);
    }

    public boolean G(@h Throwable th2) {
        boolean G = super.G(th2);
        start();
        return G;
    }

    @g
    public Object K(E e10) {
        start();
        return super.K(e10);
    }

    public void k1() {
        a.c(this.R, this);
    }

    public boolean offer(E e10) {
        start();
        return super.offer(e10);
    }
}
