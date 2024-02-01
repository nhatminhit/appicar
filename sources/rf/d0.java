package rf;

import fh.g;
import fh.h;
import java.util.ArrayList;
import kotlin.Metadata;
import rf.c;
import we.l;
import wf.c;
import wf.d1;
import wf.i0;
import wf.r0;
import zd.u2;
import zf.f;

@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u001f\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001dj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138DX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138DX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138DX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138DX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lrf/d0;", "E", "Lrf/a;", "element", "", "N", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lzf/f;", "select", "O", "(Ljava/lang/Object;Lzf/f;)Ljava/lang/Object;", "Lwf/q;", "Lrf/l0;", "list", "Lrf/w;", "closed", "Lzd/u2;", "j0", "(Ljava/lang/Object;Lrf/w;)V", "", "f0", "()Z", "isBufferAlwaysEmpty", "g0", "isBufferEmpty", "F", "isBufferAlwaysFull", "H", "isBufferFull", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lwe/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class d0<E> extends a<E> {
    public d0(@h l<? super E, u2> lVar) {
        super(lVar);
    }

    public final boolean F() {
        return false;
    }

    public final boolean H() {
        return false;
    }

    @g
    public Object N(E e10) {
        j0<?> R;
        do {
            Object N = super.N(e10);
            r0 r0Var = b.f22523d;
            if (N == r0Var) {
                return r0Var;
            }
            if (N == b.f22524e) {
                R = R(e10);
                if (R == null) {
                    return r0Var;
                }
            } else if (N instanceof w) {
                return N;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + N).toString());
            }
        } while (!(R instanceof w));
        return R;
    }

    @g
    public Object O(E e10, @g f<?> fVar) {
        Object obj;
        while (true) {
            if (e0()) {
                obj = super.O(e10, fVar);
            } else {
                obj = fVar.q0(l(e10));
                if (obj == null) {
                    obj = b.f22523d;
                }
            }
            if (obj == zf.g.d()) {
                return zf.g.d();
            }
            r0 r0Var = b.f22523d;
            if (obj == r0Var) {
                return r0Var;
            }
            if (obj != b.f22524e && obj != c.f24083b) {
                if (obj instanceof w) {
                    return obj;
                }
                throw new IllegalStateException(("Invalid result " + obj).toString());
            }
        }
    }

    public final boolean f0() {
        return true;
    }

    public final boolean g0() {
        return true;
    }

    public void j0(@g Object obj, @g w<?> wVar) {
        d1 d1Var = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                l0 l0Var = (l0) obj;
                if (l0Var instanceof c.a) {
                    l<E, u2> lVar = this.O;
                    if (lVar != null) {
                        d1Var = i0.c(lVar, ((c.a) l0Var).R, (d1) null);
                    }
                } else {
                    l0Var.Z0(wVar);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                d1 d1Var2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    l0 l0Var2 = (l0) arrayList.get(size);
                    if (l0Var2 instanceof c.a) {
                        l<E, u2> lVar2 = this.O;
                        d1Var2 = lVar2 != null ? i0.c(lVar2, ((c.a) l0Var2).R, d1Var2) : null;
                    } else {
                        l0Var2.Z0(wVar);
                    }
                }
                d1Var = d1Var2;
            }
        }
        if (d1Var != null) {
            throw d1Var;
        }
    }
}
