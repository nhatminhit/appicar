package l5;

import i5.f;
import i5.g;
import i5.h;
import i5.j;
import java.io.IOException;
import java.io.Serializable;
import q5.l;
import q5.m;

public abstract class y {

    public static class a extends y implements Serializable {
        public static final long P = 1;
        public final Class<?> O;

        public a(j jVar) {
            this.O = jVar.g();
        }

        public a(Class<?> cls) {
            this.O = cls;
        }

        public Class<?> C() {
            return this.O;
        }

        public String D() {
            return this.O.getName();
        }
    }

    public interface b {
        y e();
    }

    public v[] A(f fVar) {
        return null;
    }

    public l B() {
        return null;
    }

    public Class<?> C() {
        return Object.class;
    }

    public String D() {
        Class<?> C = C();
        return C == null ? "UNKNOWN" : C.getName();
    }

    public m E() {
        return null;
    }

    public Object a(g gVar, String str) throws IOException {
        if (b()) {
            String trim = str.trim();
            if ("true".equals(trim)) {
                return l(gVar, true);
            }
            if ("false".equals(trim)) {
                return l(gVar, false);
            }
        }
        if (str.length() == 0 && gVar.v0(h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
            return null;
        }
        return gVar.c0(C(), this, gVar.Z(), "no String-argument constructor/factory method to deserialize from String value ('%s')", str);
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return x() != null;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return i() || j() || h() || f() || g() || d() || e() || c() || b();
    }

    public Object l(g gVar, boolean z10) throws IOException {
        return gVar.c0(C(), this, (w4.l) null, "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)", Boolean.valueOf(z10));
    }

    public Object m(g gVar, double d10) throws IOException {
        return gVar.c0(C(), this, (w4.l) null, "no double/Double-argument constructor/factory method to deserialize from Number value (%s)", Double.valueOf(d10));
    }

    public Object n(g gVar, int i10) throws IOException {
        return gVar.c0(C(), this, (w4.l) null, "no int/Int-argument constructor/factory method to deserialize from Number value (%s)", Integer.valueOf(i10));
    }

    public Object o(g gVar, long j10) throws IOException {
        return gVar.c0(C(), this, (w4.l) null, "no long/Long-argument constructor/factory method to deserialize from Number value (%s)", Long.valueOf(j10));
    }

    public Object p(g gVar, Object[] objArr) throws IOException {
        return gVar.c0(C(), this, (w4.l) null, "no creator with arguments specified", new Object[0]);
    }

    public Object q(g gVar, v[] vVarArr, m5.y yVar) throws IOException {
        return p(gVar, yVar.h(vVarArr));
    }

    public Object r(g gVar, String str) throws IOException {
        return a(gVar, str);
    }

    public Object s(g gVar, Object obj) throws IOException {
        return gVar.c0(C(), this, (w4.l) null, "no array delegate creator specified", new Object[0]);
    }

    public Object t(g gVar) throws IOException {
        return gVar.c0(C(), this, (w4.l) null, "no default no-arguments constructor found", new Object[0]);
    }

    public Object u(g gVar, Object obj) throws IOException {
        return gVar.c0(C(), this, (w4.l) null, "no delegate creator specified", new Object[0]);
    }

    public m v() {
        return null;
    }

    public j w(f fVar) {
        return null;
    }

    public m x() {
        return null;
    }

    public m y() {
        return null;
    }

    public j z(f fVar) {
        return null;
    }
}
