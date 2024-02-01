package rf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import pf.q;
import pf.s;
import pf.z0;
import ve.e;
import wf.r0;
import wf.y;
import zd.d1;
import zd.e1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0012\u001a\u00028\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lrf/n0;", "E", "Lrf/l0;", "Lwf/y$d;", "otherOp", "Lwf/r0;", "a1", "Lzd/u2;", "X0", "Lrf/w;", "closed", "Z0", "", "toString", "R", "Ljava/lang/Object;", "Y0", "()Ljava/lang/Object;", "pollResult", "Lpf/q;", "S", "Lpf/q;", "cont", "<init>", "(Ljava/lang/Object;Lpf/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class n0<E> extends l0 {
    public final E R;
    @g
    @e
    public final q<u2> S;

    public n0(E e10, @g q<? super u2> qVar) {
        this.R = e10;
        this.S = qVar;
    }

    public void X0() {
        this.S.t0(s.f22024d);
    }

    public E Y0() {
        return this.R;
    }

    public void Z0(@g w<?> wVar) {
        q<u2> qVar = this.S;
        d1.a aVar = d1.P;
        qVar.x(d1.b(e1.a(wVar.f1())));
    }

    @h
    public r0 a1(@h y.d dVar) {
        if (this.S.r(u2.f25116a, dVar != null ? dVar.f24139c : null) == null) {
            return null;
        }
        if (dVar != null) {
            dVar.d();
        }
        return s.f22024d;
    }

    @g
    public String toString() {
        return z0.a(this) + '@' + z0.b(this) + '(' + Y0() + ')';
    }
}
