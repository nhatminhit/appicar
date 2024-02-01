package y5;

import com.fasterxml.jackson.databind.ser.j;
import i5.e0;
import i5.m;
import i5.o;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Map;
import v4.n;
import w4.i;
import w4.l;
import w4.p;

public class y {

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15536a;

        static {
            int[] iArr = new int[n.c.values().length];
            f15536a = iArr;
            try {
                iArr[n.c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static abstract class b<T> extends l0<T> implements j {
        public final l.b R;
        public final String S;
        public final boolean T;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Class<?> cls, l.b bVar, String str) {
            super(cls, false);
            boolean z10 = false;
            this.R = bVar;
            this.S = str;
            this.T = (bVar == l.b.INT || bVar == l.b.LONG || bVar == l.b.BIG_INTEGER) ? true : z10;
        }

        public m a(e0 e0Var, Type type) {
            return u(this.S, true);
        }

        public o<?> d(e0 e0Var, i5.d dVar) throws i5.l {
            n.d z10 = z(e0Var, dVar, g());
            return (z10 == null || a.f15536a[z10.m().ordinal()] != 1) ? this : g() == BigDecimal.class ? x.M() : p0.R;
        }

        public void e(s5.g gVar, i5.j jVar) throws i5.l {
            if (this.T) {
                G(gVar, jVar, this.R);
            } else {
                F(gVar, jVar, this.R);
            }
        }
    }

    @j5.a
    public static class c extends b<Object> {
        public c(Class<?> cls) {
            super(cls, l.b.DOUBLE, "number");
        }

        public static boolean M(double d10) {
            return Double.isNaN(d10) || Double.isInfinite(d10);
        }

        public void m(Object obj, i iVar, e0 e0Var) throws IOException {
            iVar.m2(((Double) obj).doubleValue());
        }

        public void n(Object obj, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
            Double d10 = (Double) obj;
            if (M(d10.doubleValue())) {
                g5.c o10 = iVar2.o(iVar, iVar2.g(obj, p.VALUE_NUMBER_FLOAT));
                iVar.m2(d10.doubleValue());
                iVar2.v(iVar, o10);
                return;
            }
            iVar.m2(d10.doubleValue());
        }
    }

    @j5.a
    public static class d extends b<Object> {
        public static final d U = new d();

        public d() {
            super(Float.class, l.b.FLOAT, "number");
        }

        public void m(Object obj, i iVar, e0 e0Var) throws IOException {
            iVar.n2(((Float) obj).floatValue());
        }
    }

    @j5.a
    public static class e extends b<Object> {
        public static final e U = new e();

        public e() {
            super(Number.class, l.b.INT, "integer");
        }

        public void m(Object obj, i iVar, e0 e0Var) throws IOException {
            iVar.o2(((Number) obj).intValue());
        }
    }

    @j5.a
    public static class f extends b<Object> {
        public f(Class<?> cls) {
            super(cls, l.b.INT, "integer");
        }

        public void m(Object obj, i iVar, e0 e0Var) throws IOException {
            iVar.o2(((Integer) obj).intValue());
        }

        public void n(Object obj, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
            m(obj, iVar, e0Var);
        }
    }

    @j5.a
    public static class g extends b<Object> {
        public g(Class<?> cls) {
            super(cls, l.b.LONG, "number");
        }

        public void m(Object obj, i iVar, e0 e0Var) throws IOException {
            iVar.p2(((Long) obj).longValue());
        }
    }

    @j5.a
    public static class h extends b<Object> {
        public static final h U = new h();

        public h() {
            super(Short.class, l.b.INT, "number");
        }

        public void m(Object obj, i iVar, e0 e0Var) throws IOException {
            iVar.t2(((Short) obj).shortValue());
        }
    }

    public static void a(Map<String, o<?>> map) {
        Class<Double> cls = Double.class;
        Class<Long> cls2 = Long.class;
        Class<Integer> cls3 = Integer.class;
        map.put(cls3.getName(), new f(cls3));
        Class cls4 = Integer.TYPE;
        map.put(cls4.getName(), new f(cls4));
        map.put(cls2.getName(), new g(cls2));
        Class cls5 = Long.TYPE;
        map.put(cls5.getName(), new g(cls5));
        String name = Byte.class.getName();
        e eVar = e.U;
        map.put(name, eVar);
        map.put(Byte.TYPE.getName(), eVar);
        String name2 = Short.class.getName();
        h hVar = h.U;
        map.put(name2, hVar);
        map.put(Short.TYPE.getName(), hVar);
        map.put(cls.getName(), new c(cls));
        map.put(Double.TYPE.getName(), new c(Double.TYPE));
        String name3 = Float.class.getName();
        d dVar = d.U;
        map.put(name3, dVar);
        map.put(Float.TYPE.getName(), dVar);
    }
}
