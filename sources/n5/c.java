package n5;

import i5.g;
import i5.j;
import i5.k;
import i5.l;
import java.util.concurrent.atomic.AtomicReference;
import l5.y;
import u5.f;

public class c extends x<AtomicReference<Object>> {
    public static final long Y = 1;

    public c(j jVar, y yVar, f fVar, k<?> kVar) {
        super(jVar, yVar, fVar, kVar);
    }

    /* renamed from: I0 */
    public AtomicReference<Object> d(g gVar) throws l {
        return new AtomicReference<>(this.W.d(gVar));
    }

    /* renamed from: J0 */
    public Object E0(AtomicReference<Object> atomicReference) {
        return atomicReference.get();
    }

    /* renamed from: K0 */
    public AtomicReference<Object> F0(Object obj) {
        return new AtomicReference<>(obj);
    }

    /* renamed from: L0 */
    public AtomicReference<Object> G0(AtomicReference<Object> atomicReference, Object obj) {
        atomicReference.set(obj);
        return atomicReference;
    }

    /* renamed from: M0 */
    public c H0(f fVar, k<?> kVar) {
        return new c(this.T, this.U, fVar, kVar);
    }

    public Object n(g gVar) throws l {
        return d(gVar);
    }

    public Boolean u(i5.f fVar) {
        return Boolean.TRUE;
    }
}
