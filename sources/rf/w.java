package rf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import pf.s;
import pf.z0;
import ve.e;
import wf.r0;
import wf.y;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006#"}, d2 = {"Lrf/w;", "E", "Lrf/l0;", "Lrf/j0;", "Lwf/y$d;", "otherOp", "Lwf/r0;", "a1", "Lzd/u2;", "X0", "value", "k", "(Ljava/lang/Object;Lwf/y$d;)Lwf/r0;", "f0", "(Ljava/lang/Object;)V", "closed", "Z0", "", "toString", "", "R", "Ljava/lang/Throwable;", "closeCause", "f1", "()Ljava/lang/Throwable;", "sendException", "e1", "receiveException", "c1", "()Lrf/w;", "offerResult", "d1", "pollResult", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class w<E> extends l0 implements j0<E> {
    @e
    @h
    public final Throwable R;

    public w(@h Throwable th2) {
        this.R = th2;
    }

    public void X0() {
    }

    public void Z0(@g w<?> wVar) {
    }

    @g
    public r0 a1(@h y.d dVar) {
        r0 r0Var = s.f22024d;
        if (dVar != null) {
            dVar.d();
        }
        return r0Var;
    }

    @g
    /* renamed from: c1 */
    public w<E> w() {
        return this;
    }

    @g
    /* renamed from: d1 */
    public w<E> Y0() {
        return this;
    }

    @g
    public final Throwable e1() {
        Throwable th2 = this.R;
        return th2 == null ? new x(s.f22544a) : th2;
    }

    public void f0(E e10) {
    }

    @g
    public final Throwable f1() {
        Throwable th2 = this.R;
        return th2 == null ? new y(s.f22544a) : th2;
    }

    @g
    public r0 k(E e10, @h y.d dVar) {
        r0 r0Var = s.f22024d;
        if (dVar != null) {
            dVar.d();
        }
        return r0Var;
    }

    @g
    public String toString() {
        return "Closed@" + z0.b(this) + '[' + this.R + ']';
    }
}
