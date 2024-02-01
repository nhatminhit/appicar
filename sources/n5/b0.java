package n5;

import a6.h;
import i5.g;
import i5.k;
import i5.p;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import q5.i;
import w4.l;
import w4.n;

@j5.a
public class b0 extends p implements Serializable {
    public static final long R = 1;
    public static final int S = 1;
    public static final int T = 2;
    public static final int U = 3;
    public static final int V = 4;
    public static final int W = 5;
    public static final int X = 6;
    public static final int Y = 7;
    public static final int Z = 8;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f10805a0 = 9;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f10806b0 = 10;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f10807c0 = 11;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f10808d0 = 12;

    /* renamed from: e0  reason: collision with root package name */
    public static final int f10809e0 = 13;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f10810f0 = 14;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f10811g0 = 15;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f10812h0 = 16;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f10813i0 = 17;
    public final int O;
    public final Class<?> P;
    public final n<?> Q;

    public static final class a extends p implements Serializable {
        public static final long Q = 1;
        public final Class<?> O;
        public final k<?> P;

        public a(Class<?> cls, k<?> kVar) {
            this.O = cls;
            this.P = kVar;
        }

        public final Object a(String str, g gVar) throws IOException {
            if (str == null) {
                return null;
            }
            a6.b0 b0Var = new a6.b0(gVar.Z(), gVar);
            b0Var.Z2(str);
            try {
                l t32 = b0Var.t3();
                t32.D2();
                Object f10 = this.P.f(t32, gVar);
                return f10 != null ? f10 : gVar.m0(this.O, str, "not a valid representation", new Object[0]);
            } catch (Exception e10) {
                return gVar.m0(this.O, str, "not a valid representation: %s", e10.getMessage());
            }
        }

        public Class<?> b() {
            return this.O;
        }
    }

    @j5.a
    public static final class b extends b0 {

        /* renamed from: n0  reason: collision with root package name */
        public static final long f10814n0 = 1;

        /* renamed from: j0  reason: collision with root package name */
        public final a6.k f10815j0;

        /* renamed from: k0  reason: collision with root package name */
        public final i f10816k0;

        /* renamed from: l0  reason: collision with root package name */
        public a6.k f10817l0;

        /* renamed from: m0  reason: collision with root package name */
        public final Enum<?> f10818m0;

        public b(a6.k kVar, i iVar) {
            super(-1, kVar.l());
            this.f10815j0 = kVar;
            this.f10816k0 = iVar;
            this.f10818m0 = kVar.j();
        }

        public Object b(String str, g gVar) throws IOException {
            i iVar = this.f10816k0;
            if (iVar != null) {
                try {
                    return iVar.x(str);
                } catch (Exception e10) {
                    h.s0(e10);
                }
            }
            a6.k i10 = gVar.v0(i5.h.READ_ENUMS_USING_TO_STRING) ? i(gVar) : this.f10815j0;
            Enum<?> i11 = i10.i(str);
            if (i11 != null) {
                return i11;
            }
            if (this.f10818m0 != null && gVar.v0(i5.h.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return this.f10818m0;
            }
            if (gVar.v0(i5.h.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return i11;
            }
            return gVar.m0(this.P, str, "not one of the values accepted for Enum class: %s", i10.m());
        }

        public final a6.k i(g gVar) {
            a6.k kVar = this.f10817l0;
            if (kVar == null) {
                synchronized (this) {
                    kVar = a6.k.e(this.f10815j0.l(), gVar.o());
                    this.f10817l0 = kVar;
                }
            }
            return kVar;
        }
    }

    public static final class c extends b0 {

        /* renamed from: k0  reason: collision with root package name */
        public static final long f10819k0 = 1;

        /* renamed from: j0  reason: collision with root package name */
        public final Constructor<?> f10820j0;

        public c(Constructor<?> constructor) {
            super(-1, constructor.getDeclaringClass());
            this.f10820j0 = constructor;
        }

        public Object b(String str, g gVar) throws Exception {
            return this.f10820j0.newInstance(new Object[]{str});
        }
    }

    public static final class d extends b0 {

        /* renamed from: k0  reason: collision with root package name */
        public static final long f10821k0 = 1;

        /* renamed from: j0  reason: collision with root package name */
        public final Method f10822j0;

        public d(Method method) {
            super(-1, method.getDeclaringClass());
            this.f10822j0 = method;
        }

        public Object b(String str, g gVar) throws Exception {
            return this.f10822j0.invoke((Object) null, new Object[]{str});
        }
    }

    @j5.a
    public static final class e extends b0 {

        /* renamed from: j0  reason: collision with root package name */
        public static final long f10823j0 = 1;

        /* renamed from: k0  reason: collision with root package name */
        public static final e f10824k0 = new e(String.class);

        /* renamed from: l0  reason: collision with root package name */
        public static final e f10825l0 = new e(Object.class);

        public e(Class<?> cls) {
            super(-1, cls);
        }

        public static e i(Class<?> cls) {
            return cls == String.class ? f10824k0 : cls == Object.class ? f10825l0 : new e(cls);
        }

        public Object a(String str, g gVar) throws IOException, n {
            return str;
        }
    }

    public b0(int i10, Class<?> cls) {
        this(i10, cls, (n<?>) null);
    }

    public b0(int i10, Class<?> cls, n<?> nVar) {
        this.O = i10;
        this.P = cls;
        this.Q = nVar;
    }

    public static b0 g(Class<?> cls) {
        int i10;
        if (cls == String.class || cls == Object.class || cls == CharSequence.class || cls == Serializable.class) {
            return e.i(cls);
        }
        if (cls == UUID.class) {
            i10 = 12;
        } else if (cls == Integer.class) {
            i10 = 5;
        } else if (cls == Long.class) {
            i10 = 6;
        } else if (cls == Date.class) {
            i10 = 10;
        } else if (cls == Calendar.class) {
            i10 = 11;
        } else if (cls == Boolean.class) {
            i10 = 1;
        } else if (cls == Byte.class) {
            i10 = 2;
        } else if (cls == Character.class) {
            i10 = 4;
        } else if (cls == Short.class) {
            i10 = 3;
        } else if (cls == Float.class) {
            i10 = 7;
        } else if (cls == Double.class) {
            i10 = 8;
        } else if (cls == URI.class) {
            i10 = 13;
        } else if (cls == URL.class) {
            i10 = 14;
        } else if (cls == Class.class) {
            i10 = 15;
        } else if (cls == Locale.class) {
            return new b0(9, cls, n.H0(Locale.class));
        } else {
            if (cls == Currency.class) {
                return new b0(16, cls, n.H0(Currency.class));
            }
            if (cls != byte[].class) {
                return null;
            }
            i10 = 17;
        }
        return new b0(i10, cls);
    }

    public Object a(String str, g gVar) throws IOException {
        if (str == null) {
            return null;
        }
        try {
            Object b10 = b(str, gVar);
            if (b10 != null) {
                return b10;
            }
            if (!h.V(this.P) || !gVar.q().S0(i5.h.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return gVar.m0(this.P, str, "not a valid representation", new Object[0]);
            }
            return null;
        } catch (Exception e10) {
            return gVar.m0(this.P, str, "not a valid representation, problem: (%s) %s", e10.getClass().getName(), h.o(e10));
        }
    }

    public Object b(String str, g gVar) throws Exception {
        switch (this.O) {
            case 1:
                return "true".equals(str) ? Boolean.TRUE : "false".equals(str) ? Boolean.FALSE : gVar.m0(this.P, str, "value not 'true' or 'false'", new Object[0]);
            case 2:
                int d10 = d(str);
                return (d10 < -128 || d10 > 255) ? gVar.m0(this.P, str, "overflow, value cannot be represented as 8-bit value", new Object[0]) : Byte.valueOf((byte) d10);
            case 3:
                int d11 = d(str);
                return (d11 < -32768 || d11 > 32767) ? gVar.m0(this.P, str, "overflow, value cannot be represented as 16-bit value", new Object[0]) : Short.valueOf((short) d11);
            case 4:
                return str.length() == 1 ? Character.valueOf(str.charAt(0)) : gVar.m0(this.P, str, "can only convert 1-character Strings", new Object[0]);
            case 5:
                return Integer.valueOf(d(str));
            case 6:
                return Long.valueOf(e(str));
            case 7:
                return Float.valueOf((float) c(str));
            case 8:
                return Double.valueOf(c(str));
            case 9:
                try {
                    return this.Q.E0(str, gVar);
                } catch (IllegalArgumentException e10) {
                    return f(gVar, str, e10);
                }
            case 10:
                return gVar.D0(str);
            case 11:
                return gVar.G(gVar.D0(str));
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e11) {
                    return f(gVar, str, e11);
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e12) {
                    return f(gVar, str, e12);
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e13) {
                    return f(gVar, str, e13);
                }
            case 15:
                try {
                    return gVar.K(str);
                } catch (Exception unused) {
                    return gVar.m0(this.P, str, "unable to parse key as Class", new Object[0]);
                }
            case 16:
                try {
                    return this.Q.E0(str, gVar);
                } catch (IllegalArgumentException e14) {
                    return f(gVar, str, e14);
                }
            case 17:
                try {
                    return gVar.q().o().d(str);
                } catch (IllegalArgumentException e15) {
                    return f(gVar, str, e15);
                }
            default:
                throw new IllegalStateException("Internal error: unknown key type " + this.P);
        }
    }

    public double c(String str) throws IllegalArgumentException {
        return c5.i.j(str);
    }

    public int d(String str) throws IllegalArgumentException {
        return Integer.parseInt(str);
    }

    public long e(String str) throws IllegalArgumentException {
        return Long.parseLong(str);
    }

    public Object f(g gVar, String str, Exception exc) throws IOException {
        return gVar.m0(this.P, str, "problem: %s", h.o(exc));
    }

    public Class<?> h() {
        return this.P;
    }
}
