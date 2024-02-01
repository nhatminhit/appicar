package v5;

import a6.b0;
import i5.d;
import i5.h;
import i5.j;
import i5.k;
import i5.q;
import java.io.IOException;
import u5.g;
import v4.f0;
import w4.l;
import w4.p;

public class f extends a {
    public static final long Z = 1;
    public final f0.a Y;

    public f(j jVar, g gVar, String str, boolean z10, j jVar2) {
        this(jVar, gVar, str, z10, jVar2, f0.a.PROPERTY);
    }

    public f(j jVar, g gVar, String str, boolean z10, j jVar2, f0.a aVar) {
        super(jVar, gVar, str, z10, jVar2);
        this.Y = aVar;
    }

    public f(f fVar, d dVar) {
        super(fVar, dVar);
        this.Y = fVar.Y;
    }

    public Object c(l lVar, i5.g gVar) throws IOException {
        return lVar.q2(p.START_ARRAY) ? super.d(lVar, gVar) : e(lVar, gVar);
    }

    public Object e(l lVar, i5.g gVar) throws IOException {
        Object d22;
        if (lVar.q() && (d22 = lVar.d2()) != null) {
            return m(lVar, gVar, d22);
        }
        p P = lVar.P();
        b0 b0Var = null;
        if (P == p.START_OBJECT) {
            P = lVar.D2();
        } else if (P != p.FIELD_NAME) {
            return x(lVar, gVar, (b0) null);
        }
        boolean w10 = gVar.w(q.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (P == p.FIELD_NAME) {
            String X0 = lVar.X0();
            lVar.D2();
            if (X0.equals(this.S) || (w10 && X0.equalsIgnoreCase(this.S))) {
                return w(lVar, gVar, b0Var);
            }
            if (b0Var == null) {
                b0Var = new b0(lVar, gVar);
            }
            b0Var.i2(X0);
            b0Var.P(lVar);
            P = lVar.D2();
        }
        return x(lVar, gVar, b0Var);
    }

    public u5.f g(d dVar) {
        return dVar == this.Q ? this : new f(this, dVar);
    }

    public f0.a k() {
        return this.Y;
    }

    public Object w(l lVar, i5.g gVar, b0 b0Var) throws IOException {
        String Y1 = lVar.Y1();
        k<Object> o10 = o(gVar, Y1);
        if (this.T) {
            if (b0Var == null) {
                b0Var = new b0(lVar, gVar);
            }
            b0Var.i2(lVar.X0());
            b0Var.Z2(Y1);
        }
        if (b0Var != null) {
            lVar.w();
            lVar = h5.j.e3(false, b0Var.u3(lVar), lVar);
        }
        lVar.D2();
        return o10.f(lVar, gVar);
    }

    public Object x(l lVar, i5.g gVar, b0 b0Var) throws IOException {
        k<Object> n10 = n(gVar);
        if (n10 == null) {
            Object a10 = u5.f.a(lVar, gVar, this.P);
            if (a10 != null) {
                return a10;
            }
            if (lVar.u2()) {
                return super.c(lVar, gVar);
            }
            if (lVar.q2(p.VALUE_STRING) && gVar.v0(h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && lVar.Y1().trim().isEmpty()) {
                return null;
            }
            String format = String.format("missing type id property '%s'", new Object[]{this.S});
            d dVar = this.Q;
            if (dVar != null) {
                format = String.format("%s (for POJO property '%s')", new Object[]{format, dVar.getName()});
            }
            j p10 = p(gVar, format);
            if (p10 == null) {
                return null;
            }
            n10 = gVar.L(p10, this.Q);
        }
        if (b0Var != null) {
            b0Var.g2();
            lVar = b0Var.u3(lVar);
            lVar.D2();
        }
        return n10.f(lVar, gVar);
    }
}
