package x5;

import g5.c;
import i5.d;
import i5.d0;
import i5.e0;
import i5.l;
import i5.m;
import i5.o;
import j5.a;
import java.io.IOException;
import java.util.List;
import s5.b;
import w4.i;
import w4.p;
import y5.f0;

@a
public final class f extends f0<List<String>> {
    public static final long S = 1;
    public static final f T = new f();

    public f() {
        super(List.class);
    }

    public f(f fVar, Boolean bool) {
        super(fVar, bool);
    }

    public o<?> M(d dVar, Boolean bool) {
        return new f(this, bool);
    }

    public void N(b bVar) throws l {
        bVar.i(s5.d.STRING);
    }

    public m O() {
        return u("string", true);
    }

    /* renamed from: R */
    public void m(List<String> list, i iVar, e0 e0Var) throws IOException {
        int size = list.size();
        if (size != 1 || ((this.R != null || !e0Var.w0(d0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.R != Boolean.TRUE)) {
            iVar.U2(list, size);
            S(list, iVar, e0Var, size);
            iVar.f2();
            return;
        }
        S(list, iVar, e0Var, 1);
    }

    public final void S(List<String> list, i iVar, e0 e0Var, int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            try {
                String str = list.get(i11);
                if (str == null) {
                    e0Var.R(iVar);
                } else {
                    iVar.Z2(str);
                }
                i11++;
            } catch (Exception e10) {
                K(e0Var, e10, list, i11);
                return;
            }
        }
    }

    /* renamed from: T */
    public void n(List<String> list, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        c o10 = iVar2.o(iVar, iVar2.g(list, p.START_ARRAY));
        iVar.A1(list);
        S(list, iVar, e0Var, list.size());
        iVar2.v(iVar, o10);
    }
}
