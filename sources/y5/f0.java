package y5;

import com.fasterxml.jackson.databind.ser.j;
import i5.d;
import i5.e0;
import i5.l;
import i5.m;
import i5.o;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import s5.b;
import s5.g;
import w4.i;

public abstract class f0<T extends Collection<?>> extends m0<T> implements j {
    public final Boolean R;

    public f0(Class<?> cls) {
        super(cls, false);
        this.R = null;
    }

    public f0(f0<?> f0Var, Boolean bool) {
        super((m0<?>) f0Var);
        this.R = bool;
    }

    public abstract o<?> M(d dVar, Boolean bool);

    public abstract void N(b bVar) throws l;

    public abstract m O();

    /* renamed from: P */
    public boolean h(e0 e0Var, T t10) {
        return t10 == null || t10.size() == 0;
    }

    /* renamed from: Q */
    public abstract void n(T t10, i iVar, e0 e0Var, u5.i iVar2) throws IOException;

    public m a(e0 e0Var, Type type) {
        return u("array", true).n2("items", O());
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<?> d(i5.e0 r6, i5.d r7) throws i5.l {
        /*
            r5 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 0
            if (r7 == 0) goto L_0x001a
            i5.b r2 = r6.o()
            q5.h r3 = r7.i()
            if (r3 == 0) goto L_0x001a
            java.lang.Object r2 = r2.j(r3)
            if (r2 == 0) goto L_0x001a
            i5.o r2 = r6.G0(r3, r2)
            goto L_0x001b
        L_0x001a:
            r2 = r1
        L_0x001b:
            java.lang.Class r3 = r5.g()
            v4.n$d r3 = r5.z(r6, r7, r3)
            if (r3 == 0) goto L_0x002c
            v4.n$a r4 = v4.n.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r3 = r3.h(r4)
            goto L_0x002d
        L_0x002c:
            r3 = r1
        L_0x002d:
            i5.o r2 = r5.w(r6, r7, r2)
            if (r2 != 0) goto L_0x0037
            i5.o r2 = r6.U(r0, r7)
        L_0x0037:
            boolean r4 = r5.C(r2)
            if (r4 == 0) goto L_0x0047
            java.lang.Boolean r6 = r5.R
            if (r3 != r6) goto L_0x0042
            return r5
        L_0x0042:
            i5.o r6 = r5.M(r7, r3)
            return r6
        L_0x0047:
            y5.j r7 = new y5.j
            i5.j r6 = r6.l(r0)
            r0 = 1
            r7.<init>(r6, r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.f0.d(i5.e0, i5.d):i5.o");
    }

    public void e(g gVar, i5.j jVar) throws l {
        b m10 = gVar.m(jVar);
        if (m10 != null) {
            N(m10);
        }
    }
}
