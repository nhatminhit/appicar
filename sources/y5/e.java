package y5;

import com.fasterxml.jackson.databind.ser.j;
import i5.d;
import i5.e0;
import i5.l;
import i5.m;
import i5.o;
import java.io.IOException;
import java.lang.reflect.Type;
import s5.g;
import v4.n;
import w4.i;
import w4.l;

@j5.a
public final class e extends l0<Object> implements j {
    public static final long S = 1;
    public final boolean R;

    public static final class a extends l0<Object> implements j {
        public static final long S = 1;
        public final boolean R;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(boolean z10) {
            super(z10 ? Boolean.TYPE : Boolean.class, false);
            this.R = z10;
        }

        public o<?> d(e0 e0Var, d dVar) throws l {
            n.d z10 = z(e0Var, dVar, Boolean.class);
            return (z10 == null || z10.m().a()) ? this : new e(this.R);
        }

        public void e(g gVar, i5.j jVar) throws l {
            G(gVar, jVar, l.b.INT);
        }

        public void m(Object obj, i iVar, e0 e0Var) throws IOException {
            iVar.o2(Boolean.FALSE.equals(obj) ^ true ? 1 : 0);
        }

        public final void n(Object obj, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
            iVar.c2(Boolean.TRUE.equals(obj));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(boolean z10) {
        super(z10 ? Boolean.TYPE : Boolean.class, false);
        this.R = z10;
    }

    public m a(e0 e0Var, Type type) {
        return u("boolean", !this.R);
    }

    public o<?> d(e0 e0Var, d dVar) throws i5.l {
        n.d z10 = z(e0Var, dVar, Boolean.class);
        return (z10 == null || !z10.m().a()) ? this : new a(this.R);
    }

    public void e(g gVar, i5.j jVar) throws i5.l {
        gVar.n(jVar);
    }

    public void m(Object obj, i iVar, e0 e0Var) throws IOException {
        iVar.c2(Boolean.TRUE.equals(obj));
    }

    public final void n(Object obj, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        iVar.c2(Boolean.TRUE.equals(obj));
    }
}
