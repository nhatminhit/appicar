package y5;

import com.fasterxml.jackson.databind.ser.j;
import i5.d;
import i5.e0;
import i5.l;
import i5.m;
import i5.o;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import s5.g;
import v4.n;
import w4.i;
import w4.l;

@j5.a
public class x extends l0<Number> implements j {
    public static final x S = new x(Number.class);
    public static final int T = 9999;
    public final boolean R;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15535a;

        static {
            int[] iArr = new int[n.c.values().length];
            f15535a = iArr;
            try {
                iArr[n.c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static final class b extends q0 {
        public static final b R = new b();

        public b() {
            super(BigDecimal.class);
        }

        public String M(Object obj) {
            throw new IllegalStateException();
        }

        public boolean N(i iVar, BigDecimal bigDecimal) throws IOException {
            int scale = bigDecimal.scale();
            return scale >= -9999 && scale <= 9999;
        }

        public boolean h(e0 e0Var, Object obj) {
            return false;
        }

        public void m(Object obj, i iVar, e0 e0Var) throws IOException {
            String str;
            if (iVar.f1(i.b.WRITE_BIGDECIMAL_AS_PLAIN)) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                if (!N(iVar, bigDecimal)) {
                    e0Var.E0(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[]{Integer.valueOf(bigDecimal.scale()), 9999, 9999}), new Object[0]);
                }
                str = bigDecimal.toPlainString();
            } else {
                str = obj.toString();
            }
            iVar.Z2(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(Class<? extends Number> cls) {
        super(cls, false);
        boolean z10 = false;
        this.R = cls == BigInteger.class ? true : z10;
    }

    public static o<?> M() {
        return b.R;
    }

    /* renamed from: N */
    public void m(Number number, i iVar, e0 e0Var) throws IOException {
        if (number instanceof BigDecimal) {
            iVar.r2((BigDecimal) number);
        } else if (number instanceof BigInteger) {
            iVar.s2((BigInteger) number);
        } else if (number instanceof Long) {
            iVar.p2(number.longValue());
        } else if (number instanceof Double) {
            iVar.m2(number.doubleValue());
        } else if (number instanceof Float) {
            iVar.n2(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            iVar.o2(number.intValue());
        } else {
            iVar.q2(number.toString());
        }
    }

    public m a(e0 e0Var, Type type) {
        return u(this.R ? "integer" : "number", true);
    }

    public o<?> d(e0 e0Var, d dVar) throws l {
        n.d z10 = z(e0Var, dVar, g());
        return (z10 == null || a.f15535a[z10.m().ordinal()] != 1) ? this : g() == BigDecimal.class ? M() : p0.R;
    }

    public void e(g gVar, i5.j jVar) throws l {
        if (this.R) {
            G(gVar, jVar, l.b.BIG_INTEGER);
        } else if (g() == BigDecimal.class) {
            F(gVar, jVar, l.b.BIG_DECIMAL);
        } else {
            gVar.r(jVar);
        }
    }
}
