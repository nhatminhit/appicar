package y5;

import com.fasterxml.jackson.databind.node.u;
import com.fasterxml.jackson.databind.ser.i;
import i5.d0;
import i5.e0;
import i5.j;
import i5.l;
import i5.m;
import i5.o;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import w4.p;
import z5.n;

public class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, o<?>> f15522a;

    @j5.a
    public static class a extends a<boolean[]> {
        public static final j T = n.c0().k0(Boolean.class);

        public a() {
            super(boolean[].class);
        }

        public a(a aVar, i5.d dVar, Boolean bool) {
            super(aVar, dVar, bool);
        }

        public i<?> M(u5.i iVar) {
            return this;
        }

        public o<?> N() {
            return null;
        }

        public j O() {
            return T;
        }

        public o<?> T(i5.d dVar, Boolean bool) {
            return new a(this, dVar, bool);
        }

        /* renamed from: V */
        public boolean Q(boolean[] zArr) {
            return zArr.length == 1;
        }

        /* renamed from: W */
        public boolean h(e0 e0Var, boolean[] zArr) {
            return zArr.length == 0;
        }

        /* renamed from: X */
        public final void m(boolean[] zArr, w4.i iVar, e0 e0Var) throws IOException {
            int length = zArr.length;
            if (length != 1 || !S(e0Var)) {
                iVar.U2(zArr, length);
                U(zArr, iVar, e0Var);
                iVar.f2();
                return;
            }
            U(zArr, iVar, e0Var);
        }

        /* renamed from: Y */
        public void U(boolean[] zArr, w4.i iVar, e0 e0Var) throws IOException {
            for (boolean c22 : zArr) {
                iVar.c2(c22);
            }
        }

        public m a(e0 e0Var, Type type) {
            u u10 = u("array", true);
            u10.n2("items", t("boolean"));
            return u10;
        }

        public void e(s5.g gVar, j jVar) throws l {
            E(gVar, jVar, s5.d.BOOLEAN);
        }
    }

    @j5.a
    public static class b extends m0<char[]> {
        public b() {
            super(char[].class);
        }

        public final void M(w4.i iVar, char[] cArr) throws IOException {
            int length = cArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                iVar.b3(cArr, i10, 1);
            }
        }

        /* renamed from: N */
        public boolean h(e0 e0Var, char[] cArr) {
            return cArr.length == 0;
        }

        /* renamed from: O */
        public void m(char[] cArr, w4.i iVar, e0 e0Var) throws IOException {
            if (e0Var.w0(d0.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                iVar.U2(cArr, cArr.length);
                M(iVar, cArr);
                iVar.f2();
                return;
            }
            iVar.b3(cArr, 0, cArr.length);
        }

        /* renamed from: P */
        public void n(char[] cArr, w4.i iVar, e0 e0Var, u5.i iVar2) throws IOException {
            g5.c cVar;
            if (e0Var.w0(d0.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                cVar = iVar2.o(iVar, iVar2.g(cArr, p.START_ARRAY));
                M(iVar, cArr);
            } else {
                cVar = iVar2.o(iVar, iVar2.g(cArr, p.VALUE_STRING));
                iVar.b3(cArr, 0, cArr.length);
            }
            iVar2.v(iVar, cVar);
        }

        public m a(e0 e0Var, Type type) {
            u u10 = u("array", true);
            u t10 = t("string");
            t10.T1("type", "string");
            return u10.n2("items", t10);
        }

        public void e(s5.g gVar, j jVar) throws l {
            E(gVar, jVar, s5.d.STRING);
        }
    }

    @j5.a
    public static class c extends a<double[]> {
        public static final j T = n.c0().k0(Double.TYPE);

        public c() {
            super(double[].class);
        }

        public c(c cVar, i5.d dVar, Boolean bool) {
            super(cVar, dVar, bool);
        }

        public i<?> M(u5.i iVar) {
            return this;
        }

        public o<?> N() {
            return null;
        }

        public j O() {
            return T;
        }

        public o<?> T(i5.d dVar, Boolean bool) {
            return new c(this, dVar, bool);
        }

        /* renamed from: V */
        public boolean Q(double[] dArr) {
            return dArr.length == 1;
        }

        /* renamed from: W */
        public boolean h(e0 e0Var, double[] dArr) {
            return dArr.length == 0;
        }

        /* renamed from: X */
        public final void m(double[] dArr, w4.i iVar, e0 e0Var) throws IOException {
            if (dArr.length != 1 || !S(e0Var)) {
                iVar.R1(dArr, 0, dArr.length);
            } else {
                U(dArr, iVar, e0Var);
            }
        }

        /* renamed from: Y */
        public void U(double[] dArr, w4.i iVar, e0 e0Var) throws IOException {
            for (double m22 : dArr) {
                iVar.m2(m22);
            }
        }

        public m a(e0 e0Var, Type type) {
            return u("array", true).n2("items", t("number"));
        }

        public void e(s5.g gVar, j jVar) throws l {
            E(gVar, jVar, s5.d.NUMBER);
        }
    }

    @j5.a
    public static class d extends h<float[]> {
        public static final j T = n.c0().k0(Float.TYPE);

        public d() {
            super(float[].class);
        }

        public d(d dVar, i5.d dVar2, Boolean bool) {
            super(dVar, dVar2, bool);
        }

        public o<?> N() {
            return null;
        }

        public j O() {
            return T;
        }

        public o<?> T(i5.d dVar, Boolean bool) {
            return new d(this, dVar, bool);
        }

        /* renamed from: V */
        public boolean Q(float[] fArr) {
            return fArr.length == 1;
        }

        /* renamed from: W */
        public boolean h(e0 e0Var, float[] fArr) {
            return fArr.length == 0;
        }

        /* renamed from: X */
        public final void m(float[] fArr, w4.i iVar, e0 e0Var) throws IOException {
            int length = fArr.length;
            if (length != 1 || !S(e0Var)) {
                iVar.U2(fArr, length);
                U(fArr, iVar, e0Var);
                iVar.f2();
                return;
            }
            U(fArr, iVar, e0Var);
        }

        /* renamed from: Y */
        public void U(float[] fArr, w4.i iVar, e0 e0Var) throws IOException {
            for (float n22 : fArr) {
                iVar.n2(n22);
            }
        }

        public m a(e0 e0Var, Type type) {
            return u("array", true).n2("items", t("number"));
        }

        public void e(s5.g gVar, j jVar) throws l {
            E(gVar, jVar, s5.d.NUMBER);
        }
    }

    @j5.a
    public static class e extends a<int[]> {
        public static final j T = n.c0().k0(Integer.TYPE);

        public e() {
            super(int[].class);
        }

        public e(e eVar, i5.d dVar, Boolean bool) {
            super(eVar, dVar, bool);
        }

        public i<?> M(u5.i iVar) {
            return this;
        }

        public o<?> N() {
            return null;
        }

        public j O() {
            return T;
        }

        public o<?> T(i5.d dVar, Boolean bool) {
            return new e(this, dVar, bool);
        }

        /* renamed from: V */
        public boolean Q(int[] iArr) {
            return iArr.length == 1;
        }

        /* renamed from: W */
        public boolean h(e0 e0Var, int[] iArr) {
            return iArr.length == 0;
        }

        /* renamed from: X */
        public final void m(int[] iArr, w4.i iVar, e0 e0Var) throws IOException {
            if (iArr.length != 1 || !S(e0Var)) {
                iVar.S1(iArr, 0, iArr.length);
            } else {
                U(iArr, iVar, e0Var);
            }
        }

        /* renamed from: Y */
        public void U(int[] iArr, w4.i iVar, e0 e0Var) throws IOException {
            for (int o22 : iArr) {
                iVar.o2(o22);
            }
        }

        public m a(e0 e0Var, Type type) {
            return u("array", true).n2("items", t("integer"));
        }

        public void e(s5.g gVar, j jVar) throws l {
            E(gVar, jVar, s5.d.INTEGER);
        }
    }

    @j5.a
    public static class f extends h<long[]> {
        public static final j T = n.c0().k0(Long.TYPE);

        public f() {
            super(long[].class);
        }

        public f(f fVar, i5.d dVar, Boolean bool) {
            super(fVar, dVar, bool);
        }

        public o<?> N() {
            return null;
        }

        public j O() {
            return T;
        }

        public o<?> T(i5.d dVar, Boolean bool) {
            return new f(this, dVar, bool);
        }

        /* renamed from: V */
        public boolean Q(long[] jArr) {
            return jArr.length == 1;
        }

        /* renamed from: W */
        public boolean h(e0 e0Var, long[] jArr) {
            return jArr.length == 0;
        }

        /* renamed from: X */
        public final void m(long[] jArr, w4.i iVar, e0 e0Var) throws IOException {
            if (jArr.length != 1 || !S(e0Var)) {
                iVar.T1(jArr, 0, jArr.length);
            } else {
                U(jArr, iVar, e0Var);
            }
        }

        /* renamed from: Y */
        public void U(long[] jArr, w4.i iVar, e0 e0Var) throws IOException {
            for (long p22 : jArr) {
                iVar.p2(p22);
            }
        }

        public m a(e0 e0Var, Type type) {
            return u("array", true).n2("items", u("number", true));
        }

        public void e(s5.g gVar, j jVar) throws l {
            E(gVar, jVar, s5.d.NUMBER);
        }
    }

    @j5.a
    public static class g extends h<short[]> {
        public static final j T = n.c0().k0(Short.TYPE);

        public g() {
            super(short[].class);
        }

        public g(g gVar, i5.d dVar, Boolean bool) {
            super(gVar, dVar, bool);
        }

        public o<?> N() {
            return null;
        }

        public j O() {
            return T;
        }

        public o<?> T(i5.d dVar, Boolean bool) {
            return new g(this, dVar, bool);
        }

        /* renamed from: V */
        public boolean Q(short[] sArr) {
            return sArr.length == 1;
        }

        /* renamed from: W */
        public boolean h(e0 e0Var, short[] sArr) {
            return sArr.length == 0;
        }

        /* renamed from: X */
        public final void m(short[] sArr, w4.i iVar, e0 e0Var) throws IOException {
            int length = sArr.length;
            if (length != 1 || !S(e0Var)) {
                iVar.U2(sArr, length);
                U(sArr, iVar, e0Var);
                iVar.f2();
                return;
            }
            U(sArr, iVar, e0Var);
        }

        /* renamed from: Y */
        public void U(short[] sArr, w4.i iVar, e0 e0Var) throws IOException {
            for (short o22 : sArr) {
                iVar.o2(o22);
            }
        }

        public m a(e0 e0Var, Type type) {
            return u("array", true).n2("items", t("integer"));
        }

        public void e(s5.g gVar, j jVar) throws l {
            E(gVar, jVar, s5.d.INTEGER);
        }
    }

    public static abstract class h<T> extends a<T> {
        public h(Class<T> cls) {
            super(cls);
        }

        public h(h<T> hVar, i5.d dVar, Boolean bool) {
            super(hVar, dVar, bool);
        }

        public final i<?> M(u5.i iVar) {
            return this;
        }
    }

    static {
        HashMap<String, o<?>> hashMap = new HashMap<>();
        f15522a = hashMap;
        hashMap.put(boolean[].class.getName(), new a());
        hashMap.put(byte[].class.getName(), new f());
        hashMap.put(char[].class.getName(), new b());
        hashMap.put(short[].class.getName(), new g());
        hashMap.put(int[].class.getName(), new e());
        hashMap.put(long[].class.getName(), new f());
        hashMap.put(float[].class.getName(), new d());
        hashMap.put(double[].class.getName(), new c());
    }

    public static o<?> a(Class<?> cls) {
        return f15522a.get(cls.getName());
    }
}
