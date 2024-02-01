package y5;

import a6.s;
import i5.d;
import i5.o;
import java.util.concurrent.atomic.AtomicReference;
import u5.i;

public class c extends b0<AtomicReference<?>> {

    /* renamed from: b0  reason: collision with root package name */
    public static final long f15519b0 = 1;

    public c(c cVar, d dVar, i iVar, o<?> oVar, s sVar, Object obj, boolean z10) {
        super(cVar, dVar, iVar, oVar, sVar, obj, z10);
    }

    public c(z5.i iVar, boolean z10, i iVar2, o<Object> oVar) {
        super(iVar, z10, iVar2, oVar);
    }

    public b0<AtomicReference<?>> T(Object obj, boolean z10) {
        return new c(this, this.S, this.T, this.U, this.V, obj, z10);
    }

    public b0<AtomicReference<?>> U(d dVar, i iVar, o<?> oVar, s sVar) {
        return new c(this, dVar, iVar, oVar, sVar, this.X, this.Y);
    }

    /* renamed from: V */
    public Object O(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }

    /* renamed from: W */
    public Object P(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }

    /* renamed from: X */
    public boolean Q(AtomicReference<?> atomicReference) {
        return atomicReference.get() != null;
    }
}
