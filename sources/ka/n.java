package ka;

import com.google.android.material.badge.BadgeDrawable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class n {
    public static final ha.y<BigInteger> A = new h();
    public static final ha.z B;
    public static final ha.y<StringBuilder> C;
    public static final ha.z D;
    public static final ha.y<StringBuffer> E;
    public static final ha.z F;
    public static final ha.y<URL> G;
    public static final ha.z H;
    public static final ha.y<URI> I;
    public static final ha.z J;
    public static final ha.y<InetAddress> K;
    public static final ha.z L;
    public static final ha.y<UUID> M;
    public static final ha.z N;
    public static final ha.y<Currency> O;
    public static final ha.z P;
    public static final ha.y<Calendar> Q;
    public static final ha.z R;
    public static final ha.y<Locale> S;
    public static final ha.z T;
    public static final ha.y<ha.k> U;
    public static final ha.z V;
    public static final ha.z W = new t();

    /* renamed from: a  reason: collision with root package name */
    public static final ha.y<Class> f20053a;

    /* renamed from: b  reason: collision with root package name */
    public static final ha.z f20054b;

    /* renamed from: c  reason: collision with root package name */
    public static final ha.y<BitSet> f20055c;

    /* renamed from: d  reason: collision with root package name */
    public static final ha.z f20056d;

    /* renamed from: e  reason: collision with root package name */
    public static final ha.y<Boolean> f20057e;

    /* renamed from: f  reason: collision with root package name */
    public static final ha.y<Boolean> f20058f = new c0();

    /* renamed from: g  reason: collision with root package name */
    public static final ha.z f20059g;

    /* renamed from: h  reason: collision with root package name */
    public static final ha.y<Number> f20060h;

    /* renamed from: i  reason: collision with root package name */
    public static final ha.z f20061i;

    /* renamed from: j  reason: collision with root package name */
    public static final ha.y<Number> f20062j;

    /* renamed from: k  reason: collision with root package name */
    public static final ha.z f20063k;

    /* renamed from: l  reason: collision with root package name */
    public static final ha.y<Number> f20064l;

    /* renamed from: m  reason: collision with root package name */
    public static final ha.z f20065m;

    /* renamed from: n  reason: collision with root package name */
    public static final ha.y<AtomicInteger> f20066n;

    /* renamed from: o  reason: collision with root package name */
    public static final ha.z f20067o;

    /* renamed from: p  reason: collision with root package name */
    public static final ha.y<AtomicBoolean> f20068p;

    /* renamed from: q  reason: collision with root package name */
    public static final ha.z f20069q;

    /* renamed from: r  reason: collision with root package name */
    public static final ha.y<AtomicIntegerArray> f20070r;

    /* renamed from: s  reason: collision with root package name */
    public static final ha.z f20071s;

    /* renamed from: t  reason: collision with root package name */
    public static final ha.y<Number> f20072t = new b();

    /* renamed from: u  reason: collision with root package name */
    public static final ha.y<Number> f20073u = new c();

    /* renamed from: v  reason: collision with root package name */
    public static final ha.y<Number> f20074v = new d();

    /* renamed from: w  reason: collision with root package name */
    public static final ha.y<Character> f20075w;

    /* renamed from: x  reason: collision with root package name */
    public static final ha.z f20076x;

    /* renamed from: y  reason: collision with root package name */
    public static final ha.y<String> f20077y;

    /* renamed from: z  reason: collision with root package name */
    public static final ha.y<BigDecimal> f20078z = new g();

    public class a extends ha.y<AtomicIntegerArray> {
        /* renamed from: j */
        public AtomicIntegerArray e(pa.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.c();
            while (aVar.o()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.P()));
                } catch (NumberFormatException e10) {
                    throw new ha.u((Throwable) e10);
                }
            }
            aVar.k();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: k */
        public void i(pa.d dVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            dVar.g();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                dVar.T0((long) atomicIntegerArray.get(i10));
            }
            dVar.k();
        }
    }

    public static /* synthetic */ class a0 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20079a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                pa.c[] r0 = pa.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20079a = r0
                pa.c r1 = pa.c.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20079a     // Catch:{ NoSuchFieldError -> 0x001d }
                pa.c r1 = pa.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20079a     // Catch:{ NoSuchFieldError -> 0x0028 }
                pa.c r1 = pa.c.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20079a     // Catch:{ NoSuchFieldError -> 0x0033 }
                pa.c r1 = pa.c.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f20079a     // Catch:{ NoSuchFieldError -> 0x003e }
                pa.c r1 = pa.c.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f20079a     // Catch:{ NoSuchFieldError -> 0x0049 }
                pa.c r1 = pa.c.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f20079a     // Catch:{ NoSuchFieldError -> 0x0054 }
                pa.c r1 = pa.c.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f20079a     // Catch:{ NoSuchFieldError -> 0x0060 }
                pa.c r1 = pa.c.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f20079a     // Catch:{ NoSuchFieldError -> 0x006c }
                pa.c r1 = pa.c.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f20079a     // Catch:{ NoSuchFieldError -> 0x0078 }
                pa.c r1 = pa.c.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ka.n.a0.<clinit>():void");
        }
    }

    public class b extends ha.y<Number> {
        /* renamed from: j */
        public Number e(pa.a aVar) throws IOException {
            if (aVar.z0() == pa.c.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return Long.valueOf(aVar.Q());
            } catch (NumberFormatException e10) {
                throw new ha.u((Throwable) e10);
            }
        }

        /* renamed from: k */
        public void i(pa.d dVar, Number number) throws IOException {
            dVar.X0(number);
        }
    }

    public class b0 extends ha.y<Boolean> {
        /* renamed from: j */
        public Boolean e(pa.a aVar) throws IOException {
            pa.c z02 = aVar.z0();
            if (z02 != pa.c.NULL) {
                return z02 == pa.c.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.k0())) : Boolean.valueOf(aVar.A());
            }
            aVar.c0();
            return null;
        }

        /* renamed from: k */
        public void i(pa.d dVar, Boolean bool) throws IOException {
            dVar.W0(bool);
        }
    }

    public class c extends ha.y<Number> {
        /* renamed from: j */
        public Number e(pa.a aVar) throws IOException {
            if (aVar.z0() != pa.c.NULL) {
                return Float.valueOf((float) aVar.N());
            }
            aVar.c0();
            return null;
        }

        /* renamed from: k */
        public void i(pa.d dVar, Number number) throws IOException {
            dVar.X0(number);
        }
    }

    public class c0 extends ha.y<Boolean> {
        /* renamed from: j */
        public Boolean e(pa.a aVar) throws IOException {
            if (aVar.z0() != pa.c.NULL) {
                return Boolean.valueOf(aVar.k0());
            }
            aVar.c0();
            return null;
        }

        /* renamed from: k */
        public void i(pa.d dVar, Boolean bool) throws IOException {
            dVar.Z0(bool == null ? "null" : bool.toString());
        }
    }

    public class d extends ha.y<Number> {
        /* renamed from: j */
        public Number e(pa.a aVar) throws IOException {
            if (aVar.z0() != pa.c.NULL) {
                return Double.valueOf(aVar.N());
            }
            aVar.c0();
            return null;
        }

        /* renamed from: k */
        public void i(pa.d dVar, Number number) throws IOException {
            dVar.X0(number);
        }
    }

    public class d0 extends ha.y<Number> {
        /* renamed from: j */
        public Number e(pa.a aVar) throws IOException {
            if (aVar.z0() == pa.c.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.P());
            } catch (NumberFormatException e10) {
                throw new ha.u((Throwable) e10);
            }
        }

        /* renamed from: k */
        public void i(pa.d dVar, Number number) throws IOException {
            dVar.X0(number);
        }
    }

    public class e extends ha.y<Character> {
        /* renamed from: j */
        public Character e(pa.a aVar) throws IOException {
            if (aVar.z0() == pa.c.NULL) {
                aVar.c0();
                return null;
            }
            String k02 = aVar.k0();
            if (k02.length() == 1) {
                return Character.valueOf(k02.charAt(0));
            }
            throw new ha.u("Expecting character, got: " + k02);
        }

        /* renamed from: k */
        public void i(pa.d dVar, Character ch2) throws IOException {
            dVar.Z0(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    public class e0 extends ha.y<Number> {
        /* renamed from: j */
        public Number e(pa.a aVar) throws IOException {
            if (aVar.z0() == pa.c.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.P());
            } catch (NumberFormatException e10) {
                throw new ha.u((Throwable) e10);
            }
        }

        /* renamed from: k */
        public void i(pa.d dVar, Number number) throws IOException {
            dVar.X0(number);
        }
    }

    public class f extends ha.y<String> {
        /* renamed from: j */
        public String e(pa.a aVar) throws IOException {
            pa.c z02 = aVar.z0();
            if (z02 != pa.c.NULL) {
                return z02 == pa.c.BOOLEAN ? Boolean.toString(aVar.A()) : aVar.k0();
            }
            aVar.c0();
            return null;
        }

        /* renamed from: k */
        public void i(pa.d dVar, String str) throws IOException {
            dVar.Z0(str);
        }
    }

    public class f0 extends ha.y<Number> {
        /* renamed from: j */
        public Number e(pa.a aVar) throws IOException {
            if (aVar.z0() == pa.c.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.P());
            } catch (NumberFormatException e10) {
                throw new ha.u((Throwable) e10);
            }
        }

        /* renamed from: k */
        public void i(pa.d dVar, Number number) throws IOException {
            dVar.X0(number);
        }
    }

    public class g extends ha.y<BigDecimal> {
        /* renamed from: j */
        public BigDecimal e(pa.a aVar) throws IOException {
            if (aVar.z0() == pa.c.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return new BigDecimal(aVar.k0());
            } catch (NumberFormatException e10) {
                throw new ha.u((Throwable) e10);
            }
        }

        /* renamed from: k */
        public void i(pa.d dVar, BigDecimal bigDecimal) throws IOException {
            dVar.X0(bigDecimal);
        }
    }

    public class g0 extends ha.y<AtomicInteger> {
        /* renamed from: j */
        public AtomicInteger e(pa.a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.P());
            } catch (NumberFormatException e10) {
                throw new ha.u((Throwable) e10);
            }
        }

        /* renamed from: k */
        public void i(pa.d dVar, AtomicInteger atomicInteger) throws IOException {
            dVar.T0((long) atomicInteger.get());
        }
    }

    public class h extends ha.y<BigInteger> {
        /* renamed from: j */
        public BigInteger e(pa.a aVar) throws IOException {
            if (aVar.z0() == pa.c.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return new BigInteger(aVar.k0());
            } catch (NumberFormatException e10) {
                throw new ha.u((Throwable) e10);
            }
        }

        /* renamed from: k */
        public void i(pa.d dVar, BigInteger bigInteger) throws IOException {
            dVar.X0(bigInteger);
        }
    }

    public class h0 extends ha.y<AtomicBoolean> {
        /* renamed from: j */
        public AtomicBoolean e(pa.a aVar) throws IOException {
            return new AtomicBoolean(aVar.A());
        }

        /* renamed from: k */
        public void i(pa.d dVar, AtomicBoolean atomicBoolean) throws IOException {
            dVar.f1(atomicBoolean.get());
        }
    }

    public class i extends ha.y<StringBuilder> {
        /* renamed from: j */
        public StringBuilder e(pa.a aVar) throws IOException {
            if (aVar.z0() != pa.c.NULL) {
                return new StringBuilder(aVar.k0());
            }
            aVar.c0();
            return null;
        }

        /* renamed from: k */
        public void i(pa.d dVar, StringBuilder sb2) throws IOException {
            dVar.Z0(sb2 == null ? null : sb2.toString());
        }
    }

    public static final class i0<T extends Enum<T>> extends ha.y<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, T> f20080a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<T, String> f20081b = new HashMap();

        public class a implements PrivilegedAction<Void> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Field f20082a;

            public a(Field field) {
                this.f20082a = field;
            }

            /* renamed from: a */
            public Void run() {
                this.f20082a.setAccessible(true);
                return null;
            }
        }

        public i0(Class<T> cls) {
            try {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new a(field));
                        Enum enumR = (Enum) field.get((Object) null);
                        String name = enumR.name();
                        ia.c cVar = (ia.c) field.getAnnotation(ia.c.class);
                        if (cVar != null) {
                            name = cVar.value();
                            for (String put : cVar.alternate()) {
                                this.f20080a.put(put, enumR);
                            }
                        }
                        this.f20080a.put(name, enumR);
                        this.f20081b.put(enumR, name);
                    }
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        /* renamed from: j */
        public T e(pa.a aVar) throws IOException {
            if (aVar.z0() != pa.c.NULL) {
                return (Enum) this.f20080a.get(aVar.k0());
            }
            aVar.c0();
            return null;
        }

        /* renamed from: k */
        public void i(pa.d dVar, T t10) throws IOException {
            dVar.Z0(t10 == null ? null : this.f20081b.get(t10));
        }
    }

    public class j extends ha.y<StringBuffer> {
        /* renamed from: j */
        public StringBuffer e(pa.a aVar) throws IOException {
            if (aVar.z0() != pa.c.NULL) {
                return new StringBuffer(aVar.k0());
            }
            aVar.c0();
            return null;
        }

        /* renamed from: k */
        public void i(pa.d dVar, StringBuffer stringBuffer) throws IOException {
            dVar.Z0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    public class k extends ha.y<Class> {
        /* renamed from: j */
        public Class e(pa.a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        /* renamed from: k */
        public void i(pa.d dVar, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    public class l extends ha.y<URL> {
        /* renamed from: j */
        public URL e(pa.a aVar) throws IOException {
            if (aVar.z0() == pa.c.NULL) {
                aVar.c0();
                return null;
            }
            String k02 = aVar.k0();
            if ("null".equals(k02)) {
                return null;
            }
            return new URL(k02);
        }

        /* renamed from: k */
        public void i(pa.d dVar, URL url) throws IOException {
            dVar.Z0(url == null ? null : url.toExternalForm());
        }
    }

    public class m extends ha.y<URI> {
        /* renamed from: j */
        public URI e(pa.a aVar) throws IOException {
            if (aVar.z0() == pa.c.NULL) {
                aVar.c0();
                return null;
            }
            try {
                String k02 = aVar.k0();
                if ("null".equals(k02)) {
                    return null;
                }
                return new URI(k02);
            } catch (URISyntaxException e10) {
                throw new ha.l((Throwable) e10);
            }
        }

        /* renamed from: k */
        public void i(pa.d dVar, URI uri) throws IOException {
            dVar.Z0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: ka.n$n  reason: collision with other inner class name */
    public class C0343n extends ha.y<InetAddress> {
        /* renamed from: j */
        public InetAddress e(pa.a aVar) throws IOException {
            if (aVar.z0() != pa.c.NULL) {
                return InetAddress.getByName(aVar.k0());
            }
            aVar.c0();
            return null;
        }

        /* renamed from: k */
        public void i(pa.d dVar, InetAddress inetAddress) throws IOException {
            dVar.Z0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    public class o extends ha.y<UUID> {
        /* renamed from: j */
        public UUID e(pa.a aVar) throws IOException {
            if (aVar.z0() != pa.c.NULL) {
                return UUID.fromString(aVar.k0());
            }
            aVar.c0();
            return null;
        }

        /* renamed from: k */
        public void i(pa.d dVar, UUID uuid) throws IOException {
            dVar.Z0(uuid == null ? null : uuid.toString());
        }
    }

    public class p extends ha.y<Currency> {
        /* renamed from: j */
        public Currency e(pa.a aVar) throws IOException {
            return Currency.getInstance(aVar.k0());
        }

        /* renamed from: k */
        public void i(pa.d dVar, Currency currency) throws IOException {
            dVar.Z0(currency.getCurrencyCode());
        }
    }

    public class q extends ha.y<Calendar> {

        /* renamed from: a  reason: collision with root package name */
        public static final String f20084a = "year";

        /* renamed from: b  reason: collision with root package name */
        public static final String f20085b = "month";

        /* renamed from: c  reason: collision with root package name */
        public static final String f20086c = "dayOfMonth";

        /* renamed from: d  reason: collision with root package name */
        public static final String f20087d = "hourOfDay";

        /* renamed from: e  reason: collision with root package name */
        public static final String f20088e = "minute";

        /* renamed from: f  reason: collision with root package name */
        public static final String f20089f = "second";

        /* renamed from: j */
        public Calendar e(pa.a aVar) throws IOException {
            if (aVar.z0() == pa.c.NULL) {
                aVar.c0();
                return null;
            }
            aVar.f();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.z0() != pa.c.END_OBJECT) {
                String Y = aVar.Y();
                int P = aVar.P();
                if (f20084a.equals(Y)) {
                    i10 = P;
                } else if (f20085b.equals(Y)) {
                    i11 = P;
                } else if (f20086c.equals(Y)) {
                    i12 = P;
                } else if (f20087d.equals(Y)) {
                    i13 = P;
                } else if (f20088e.equals(Y)) {
                    i14 = P;
                } else if (f20089f.equals(Y)) {
                    i15 = P;
                }
            }
            aVar.l();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        /* renamed from: k */
        public void i(pa.d dVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                dVar.N();
                return;
            }
            dVar.h();
            dVar.w(f20084a);
            dVar.T0((long) calendar.get(1));
            dVar.w(f20085b);
            dVar.T0((long) calendar.get(2));
            dVar.w(f20086c);
            dVar.T0((long) calendar.get(5));
            dVar.w(f20087d);
            dVar.T0((long) calendar.get(11));
            dVar.w(f20088e);
            dVar.T0((long) calendar.get(12));
            dVar.w(f20089f);
            dVar.T0((long) calendar.get(13));
            dVar.l();
        }
    }

    public class r extends ha.y<Locale> {
        /* renamed from: j */
        public Locale e(pa.a aVar) throws IOException {
            Locale locale;
            String str = null;
            if (aVar.z0() == pa.c.NULL) {
                aVar.c0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.k0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str == null) {
                return locale;
            }
            locale = new Locale(nextToken, nextToken2, str);
            return locale;
        }

        /* renamed from: k */
        public void i(pa.d dVar, Locale locale) throws IOException {
            dVar.Z0(locale == null ? null : locale.toString());
        }
    }

    public class s extends ha.y<ha.k> {
        /* renamed from: j */
        public ha.k e(pa.a aVar) throws IOException {
            if (aVar instanceof f) {
                return ((f) aVar).F1();
            }
            switch (a0.f20079a[aVar.z0().ordinal()]) {
                case 1:
                    return new ha.q((Number) new ja.h(aVar.k0()));
                case 2:
                    return new ha.q(Boolean.valueOf(aVar.A()));
                case 3:
                    return new ha.q(aVar.k0());
                case 4:
                    aVar.c0();
                    return ha.m.O;
                case 5:
                    ha.h hVar = new ha.h();
                    aVar.c();
                    while (aVar.o()) {
                        hVar.z(e(aVar));
                    }
                    aVar.k();
                    return hVar;
                case 6:
                    ha.n nVar = new ha.n();
                    aVar.f();
                    while (aVar.o()) {
                        nVar.z(aVar.Y(), e(aVar));
                    }
                    aVar.l();
                    return nVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: k */
        public void i(pa.d dVar, ha.k kVar) throws IOException {
            if (kVar == null || kVar.w()) {
                dVar.N();
            } else if (kVar.y()) {
                ha.q q10 = kVar.q();
                if (q10.C()) {
                    dVar.X0(q10.s());
                } else if (q10.A()) {
                    dVar.f1(q10.f());
                } else {
                    dVar.Z0(q10.u());
                }
            } else if (kVar.v()) {
                dVar.g();
                Iterator<ha.k> it = kVar.n().iterator();
                while (it.hasNext()) {
                    i(dVar, it.next());
                }
                dVar.k();
            } else if (kVar.x()) {
                dVar.h();
                for (Map.Entry next : kVar.p().F()) {
                    dVar.w((String) next.getKey());
                    i(dVar, (ha.k) next.getValue());
                }
                dVar.l();
            } else {
                throw new IllegalArgumentException("Couldn't write " + kVar.getClass());
            }
        }
    }

    public class t implements ha.z {
        /* JADX WARNING: type inference failed for: r3v0, types: [oa.a<T>, oa.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> ha.y<T> a(ha.e r2, oa.a<T> r3) {
            /*
                r1 = this;
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                java.lang.Class r3 = r3.f()
                boolean r0 = r2.isAssignableFrom(r3)
                if (r0 == 0) goto L_0x001f
                if (r3 != r2) goto L_0x000f
                goto L_0x001f
            L_0x000f:
                boolean r2 = r3.isEnum()
                if (r2 != 0) goto L_0x0019
                java.lang.Class r3 = r3.getSuperclass()
            L_0x0019:
                ka.n$i0 r2 = new ka.n$i0
                r2.<init>(r3)
                return r2
            L_0x001f:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ka.n.t.a(ha.e, oa.a):ha.y");
        }
    }

    public class u implements ha.z {
        public final /* synthetic */ oa.a O;
        public final /* synthetic */ ha.y P;

        public u(oa.a aVar, ha.y yVar) {
            this.O = aVar;
            this.P = yVar;
        }

        public <T> ha.y<T> a(ha.e eVar, oa.a<T> aVar) {
            if (aVar.equals(this.O)) {
                return this.P;
            }
            return null;
        }
    }

    public class v extends ha.y<BitSet> {
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
            if (r8.P() != 0) goto L_0x0069;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.BitSet e(pa.a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.c()
                pa.c r1 = r8.z0()
                r2 = 0
                r3 = r2
            L_0x000e:
                pa.c r4 = pa.c.END_ARRAY
                if (r1 == r4) goto L_0x0075
                int[] r4 = ka.n.a0.f20079a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L_0x0063
                r6 = 2
                if (r4 == r6) goto L_0x005e
                r6 = 3
                if (r4 != r6) goto L_0x0047
                java.lang.String r1 = r8.k0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0030 }
                if (r1 == 0) goto L_0x002e
                goto L_0x0069
            L_0x002e:
                r5 = r2
                goto L_0x0069
            L_0x0030:
                ha.u r8 = new ha.u
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x0047:
                ha.u r8 = new ha.u
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x005e:
                boolean r5 = r8.A()
                goto L_0x0069
            L_0x0063:
                int r1 = r8.P()
                if (r1 == 0) goto L_0x002e
            L_0x0069:
                if (r5 == 0) goto L_0x006e
                r0.set(r3)
            L_0x006e:
                int r3 = r3 + 1
                pa.c r1 = r8.z0()
                goto L_0x000e
            L_0x0075:
                r8.k()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ka.n.v.e(pa.a):java.util.BitSet");
        }

        /* renamed from: k */
        public void i(pa.d dVar, BitSet bitSet) throws IOException {
            dVar.g();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                dVar.T0(bitSet.get(i10) ? 1 : 0);
            }
            dVar.k();
        }
    }

    public class w implements ha.z {
        public final /* synthetic */ Class O;
        public final /* synthetic */ ha.y P;

        public w(Class cls, ha.y yVar) {
            this.O = cls;
            this.P = yVar;
        }

        public <T> ha.y<T> a(ha.e eVar, oa.a<T> aVar) {
            if (aVar.f() == this.O) {
                return this.P;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.O.getName() + ",adapter=" + this.P + "]";
        }
    }

    public class x implements ha.z {
        public final /* synthetic */ Class O;
        public final /* synthetic */ Class P;
        public final /* synthetic */ ha.y Q;

        public x(Class cls, Class cls2, ha.y yVar) {
            this.O = cls;
            this.P = cls2;
            this.Q = yVar;
        }

        public <T> ha.y<T> a(ha.e eVar, oa.a<T> aVar) {
            Class<? super T> f10 = aVar.f();
            if (f10 == this.O || f10 == this.P) {
                return this.Q;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.P.getName() + BadgeDrawable.f16655n0 + this.O.getName() + ",adapter=" + this.Q + "]";
        }
    }

    public class y implements ha.z {
        public final /* synthetic */ Class O;
        public final /* synthetic */ Class P;
        public final /* synthetic */ ha.y Q;

        public y(Class cls, Class cls2, ha.y yVar) {
            this.O = cls;
            this.P = cls2;
            this.Q = yVar;
        }

        public <T> ha.y<T> a(ha.e eVar, oa.a<T> aVar) {
            Class<? super T> f10 = aVar.f();
            if (f10 == this.O || f10 == this.P) {
                return this.Q;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.O.getName() + BadgeDrawable.f16655n0 + this.P.getName() + ",adapter=" + this.Q + "]";
        }
    }

    public class z implements ha.z {
        public final /* synthetic */ Class O;
        public final /* synthetic */ ha.y P;

        public class a extends ha.y<T1> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Class f20090a;

            public a(Class cls) {
                this.f20090a = cls;
            }

            public T1 e(pa.a aVar) throws IOException {
                T1 e10 = z.this.P.e(aVar);
                if (e10 == null || this.f20090a.isInstance(e10)) {
                    return e10;
                }
                throw new ha.u("Expected a " + this.f20090a.getName() + " but was " + e10.getClass().getName());
            }

            public void i(pa.d dVar, T1 t12) throws IOException {
                z.this.P.i(dVar, t12);
            }
        }

        public z(Class cls, ha.y yVar) {
            this.O = cls;
            this.P = yVar;
        }

        public <T2> ha.y<T2> a(ha.e eVar, oa.a<T2> aVar) {
            Class<? super T2> f10 = aVar.f();
            if (!this.O.isAssignableFrom(f10)) {
                return null;
            }
            return new a(f10);
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.O.getName() + ",adapter=" + this.P + "]";
        }
    }

    static {
        ha.y<Class> d10 = new k().d();
        f20053a = d10;
        f20054b = a(Class.class, d10);
        ha.y<BitSet> d11 = new v().d();
        f20055c = d11;
        f20056d = a(BitSet.class, d11);
        b0 b0Var = new b0();
        f20057e = b0Var;
        f20059g = b(Boolean.TYPE, Boolean.class, b0Var);
        d0 d0Var = new d0();
        f20060h = d0Var;
        f20061i = b(Byte.TYPE, Byte.class, d0Var);
        e0 e0Var = new e0();
        f20062j = e0Var;
        f20063k = b(Short.TYPE, Short.class, e0Var);
        f0 f0Var = new f0();
        f20064l = f0Var;
        f20065m = b(Integer.TYPE, Integer.class, f0Var);
        ha.y<AtomicInteger> d12 = new g0().d();
        f20066n = d12;
        f20067o = a(AtomicInteger.class, d12);
        ha.y<AtomicBoolean> d13 = new h0().d();
        f20068p = d13;
        f20069q = a(AtomicBoolean.class, d13);
        ha.y<AtomicIntegerArray> d14 = new a().d();
        f20070r = d14;
        f20071s = a(AtomicIntegerArray.class, d14);
        e eVar = new e();
        f20075w = eVar;
        f20076x = b(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        f20077y = fVar;
        B = a(String.class, fVar);
        i iVar = new i();
        C = iVar;
        D = a(StringBuilder.class, iVar);
        j jVar = new j();
        E = jVar;
        F = a(StringBuffer.class, jVar);
        l lVar = new l();
        G = lVar;
        H = a(URL.class, lVar);
        m mVar = new m();
        I = mVar;
        J = a(URI.class, mVar);
        C0343n nVar = new C0343n();
        K = nVar;
        L = e(InetAddress.class, nVar);
        o oVar = new o();
        M = oVar;
        N = a(UUID.class, oVar);
        ha.y<Currency> d15 = new p().d();
        O = d15;
        P = a(Currency.class, d15);
        q qVar = new q();
        Q = qVar;
        R = d(Calendar.class, GregorianCalendar.class, qVar);
        r rVar = new r();
        S = rVar;
        T = a(Locale.class, rVar);
        s sVar = new s();
        U = sVar;
        V = e(ha.k.class, sVar);
    }

    public n() {
        throw new UnsupportedOperationException();
    }

    public static <TT> ha.z a(Class<TT> cls, ha.y<TT> yVar) {
        return new w(cls, yVar);
    }

    public static <TT> ha.z b(Class<TT> cls, Class<TT> cls2, ha.y<? super TT> yVar) {
        return new x(cls, cls2, yVar);
    }

    public static <TT> ha.z c(oa.a<TT> aVar, ha.y<TT> yVar) {
        return new u(aVar, yVar);
    }

    public static <TT> ha.z d(Class<TT> cls, Class<? extends TT> cls2, ha.y<? super TT> yVar) {
        return new y(cls, cls2, yVar);
    }

    public static <T1> ha.z e(Class<T1> cls, ha.y<T1> yVar) {
        return new z(cls, yVar);
    }
}
