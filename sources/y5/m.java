package y5;

import a6.l;
import com.fasterxml.jackson.databind.node.u;
import com.fasterxml.jackson.databind.ser.j;
import i5.c;
import i5.c0;
import i5.d0;
import i5.e0;
import j5.a;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import s5.g;
import v4.n;
import w4.i;
import w4.l;

@a
public class m extends l0<Enum<?>> implements j {
    public static final long T = 1;
    public final l R;
    public final Boolean S;

    public m(l lVar, Boolean bool) {
        super(lVar.g(), false);
        this.R = lVar;
        this.S = bool;
    }

    public static Boolean M(Class<?> cls, n.d dVar, boolean z10, Boolean bool) {
        n.c m10 = dVar == null ? null : dVar.m();
        if (m10 == null || m10 == n.c.ANY || m10 == n.c.SCALAR) {
            return bool;
        }
        if (m10 == n.c.STRING || m10 == n.c.NATURAL) {
            return Boolean.FALSE;
        }
        if (m10.a() || m10 == n.c.ARRAY) {
            return Boolean.TRUE;
        }
        Object[] objArr = new Object[3];
        objArr[0] = m10;
        objArr[1] = cls.getName();
        objArr[2] = z10 ? "class" : "property";
        throw new IllegalArgumentException(String.format("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", objArr));
    }

    public static m O(Class<?> cls, c0 c0Var, c cVar, n.d dVar) {
        return new m(l.d(c0Var, cls), M(cls, dVar, true, (Boolean) null));
    }

    public final boolean N(e0 e0Var) {
        Boolean bool = this.S;
        return bool != null ? bool.booleanValue() : e0Var.w0(d0.WRITE_ENUMS_USING_INDEX);
    }

    public l P() {
        return this.R;
    }

    /* renamed from: Q */
    public final void m(Enum<?> enumR, i iVar, e0 e0Var) throws IOException {
        if (N(e0Var)) {
            iVar.o2(enumR.ordinal());
        } else if (e0Var.w0(d0.WRITE_ENUMS_USING_TO_STRING)) {
            iVar.Z2(enumR.toString());
        } else {
            iVar.a3(this.R.i(enumR));
        }
    }

    public i5.m a(e0 e0Var, Type type) {
        if (N(e0Var)) {
            return u("integer", true);
        }
        u u10 = u("string", true);
        if (type != null && e0Var.l(type).p()) {
            com.fasterxml.jackson.databind.node.a c22 = u10.c2("enum");
            for (w4.u value : this.R.j()) {
                c22.S1(value.getValue());
            }
        }
        return u10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = M(g(), r3, false, r2.S);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<?> d(i5.e0 r3, i5.d r4) throws i5.l {
        /*
            r2 = this;
            java.lang.Class r0 = r2.g()
            v4.n$d r3 = r2.z(r3, r4, r0)
            if (r3 == 0) goto L_0x0021
            java.lang.Class r4 = r2.g()
            r0 = 0
            java.lang.Boolean r1 = r2.S
            java.lang.Boolean r3 = M(r4, r3, r0, r1)
            java.lang.Boolean r4 = r2.S
            if (r3 == r4) goto L_0x0021
            y5.m r4 = new y5.m
            a6.l r0 = r2.R
            r4.<init>(r0, r3)
            return r4
        L_0x0021:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.m.d(i5.e0, i5.d):i5.o");
    }

    public void e(g gVar, i5.j jVar) throws i5.l {
        e0 c10 = gVar.c();
        if (N(c10)) {
            G(gVar, jVar, l.b.INT);
            return;
        }
        s5.m e10 = gVar.e(jVar);
        if (e10 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (c10 == null || !c10.w0(d0.WRITE_ENUMS_USING_TO_STRING)) {
                for (w4.u value : this.R.j()) {
                    linkedHashSet.add(value.getValue());
                }
            } else {
                for (Enum<?> enumR : this.R.f()) {
                    linkedHashSet.add(enumR.toString());
                }
            }
            e10.b(linkedHashSet);
        }
    }
}
