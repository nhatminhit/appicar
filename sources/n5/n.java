package n5;

import a6.h;
import h5.p;
import i5.g;
import i5.j;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import o5.c;
import w4.l;

public abstract class n<T> extends e0<T> {

    public static class a extends n<Object> {
        public static final long V = 1;
        public static final int W = 1;
        public static final int X = 2;
        public static final int Y = 3;
        public static final int Z = 4;

        /* renamed from: a0  reason: collision with root package name */
        public static final int f10851a0 = 5;

        /* renamed from: b0  reason: collision with root package name */
        public static final int f10852b0 = 6;

        /* renamed from: c0  reason: collision with root package name */
        public static final int f10853c0 = 7;

        /* renamed from: d0  reason: collision with root package name */
        public static final int f10854d0 = 8;

        /* renamed from: e0  reason: collision with root package name */
        public static final int f10855e0 = 9;

        /* renamed from: f0  reason: collision with root package name */
        public static final int f10856f0 = 10;

        /* renamed from: g0  reason: collision with root package name */
        public static final int f10857g0 = 11;

        /* renamed from: h0  reason: collision with root package name */
        public static final int f10858h0 = 12;

        /* renamed from: i0  reason: collision with root package name */
        public static final int f10859i0 = 13;
        public final int U;

        public a(Class<?> cls, int i10) {
            super(cls);
            this.U = i10;
        }

        public Object E0(String str, g gVar) throws IOException {
            switch (this.U) {
                case 1:
                    return new File(str);
                case 2:
                    return new URL(str);
                case 3:
                    return URI.create(str);
                case 4:
                    try {
                        return gVar.K(str);
                    } catch (Exception e10) {
                        return gVar.b0(this.O, str, h.M(e10));
                    }
                case 5:
                    return gVar.u().E(str);
                case 6:
                    return Currency.getInstance(str);
                case 7:
                    return Pattern.compile(str);
                case 8:
                    int J0 = J0(str);
                    if (J0 < 0) {
                        return new Locale(str);
                    }
                    String substring = str.substring(0, J0);
                    String substring2 = str.substring(J0 + 1);
                    int J02 = J0(substring2);
                    return J02 < 0 ? new Locale(substring, substring2) : new Locale(substring, substring2.substring(0, J02), substring2.substring(J02 + 1));
                case 9:
                    return Charset.forName(str);
                case 10:
                    return TimeZone.getTimeZone(str);
                case 11:
                    return InetAddress.getByName(str);
                case 12:
                    if (str.startsWith("[")) {
                        int lastIndexOf = str.lastIndexOf(93);
                        if (lastIndexOf != -1) {
                            int indexOf = str.indexOf(58, lastIndexOf);
                            return new InetSocketAddress(str.substring(0, lastIndexOf + 1), indexOf > -1 ? Integer.parseInt(str.substring(indexOf + 1)) : 0);
                        }
                        throw new c(gVar.Z(), "Bracketed IPv6 address must contain closing bracket", (Object) str, (Class<?>) InetSocketAddress.class);
                    }
                    int indexOf2 = str.indexOf(58);
                    if (indexOf2 >= 0) {
                        int i10 = indexOf2 + 1;
                        if (str.indexOf(58, i10) < 0) {
                            return new InetSocketAddress(str.substring(0, indexOf2), Integer.parseInt(str.substring(i10)));
                        }
                    }
                    return new InetSocketAddress(str, 0);
                case 13:
                    return new StringBuilder(str);
                default:
                    p.f();
                    return null;
            }
        }

        public Object G0() throws IOException {
            int i10 = this.U;
            return i10 == 3 ? URI.create("") : i10 == 8 ? Locale.ROOT : i10 == 13 ? new StringBuilder() : n.super.G0();
        }

        public int J0(String str) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (charAt == '_' || charAt == '-') {
                    return i10;
                }
            }
            return -1;
        }
    }

    public n(Class<?> cls) {
        super(cls);
    }

    public static a H0(Class<?> cls) {
        int i10;
        if (cls == File.class) {
            i10 = 1;
        } else if (cls == URL.class) {
            i10 = 2;
        } else if (cls == URI.class) {
            i10 = 3;
        } else if (cls == Class.class) {
            i10 = 4;
        } else if (cls == j.class) {
            i10 = 5;
        } else if (cls == Currency.class) {
            i10 = 6;
        } else if (cls == Pattern.class) {
            i10 = 7;
        } else if (cls == Locale.class) {
            i10 = 8;
        } else if (cls == Charset.class) {
            i10 = 9;
        } else if (cls == TimeZone.class) {
            i10 = 10;
        } else if (cls == InetAddress.class) {
            i10 = 11;
        } else if (cls == InetSocketAddress.class) {
            i10 = 12;
        } else if (cls != StringBuilder.class) {
            return null;
        } else {
            i10 = 13;
        }
        return new a(cls, i10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class<?>[] I0() {
        /*
            r0 = 13
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<java.io.File> r2 = java.io.File.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<java.net.URL> r2 = java.net.URL.class
            r0[r1] = r2
            r1 = 2
            java.lang.Class<java.net.URI> r2 = java.net.URI.class
            r0[r1] = r2
            r1 = 3
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r0[r1] = r2
            r1 = 4
            java.lang.Class<i5.j> r2 = i5.j.class
            r0[r1] = r2
            r1 = 5
            java.lang.Class<java.util.Currency> r2 = java.util.Currency.class
            r0[r1] = r2
            r1 = 6
            java.lang.Class<java.util.regex.Pattern> r2 = java.util.regex.Pattern.class
            r0[r1] = r2
            r1 = 7
            java.lang.Class<java.util.Locale> r2 = java.util.Locale.class
            r0[r1] = r2
            r1 = 8
            java.lang.Class<java.nio.charset.Charset> r2 = java.nio.charset.Charset.class
            r0[r1] = r2
            r1 = 9
            java.lang.Class<java.util.TimeZone> r2 = java.util.TimeZone.class
            r0[r1] = r2
            r1 = 10
            java.lang.Class<java.net.InetAddress> r2 = java.net.InetAddress.class
            r0[r1] = r2
            r1 = 11
            java.lang.Class<java.net.InetSocketAddress> r2 = java.net.InetSocketAddress.class
            r0[r1] = r2
            r1 = 12
            java.lang.Class<java.lang.StringBuilder> r2 = java.lang.StringBuilder.class
            r0[r1] = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.n.I0():java.lang.Class[]");
    }

    public abstract T E0(String str, g gVar) throws IOException;

    public T F0(Object obj, g gVar) throws IOException {
        gVar.O0(this, "Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this.O.getName());
        return null;
    }

    public T G0() throws IOException {
        return null;
    }

    public T f(l lVar, g gVar) throws IOException {
        String m22 = lVar.m2();
        if (m22 != null) {
            if (m22.length() != 0) {
                String trim = m22.trim();
                if (trim.length() != 0) {
                    try {
                        return E0(trim, gVar);
                    } catch (IllegalArgumentException | MalformedURLException e10) {
                        String str = "not a valid textual representation";
                        String message = e10.getMessage();
                        if (message != null) {
                            str = str + ", problem: " + message;
                        }
                        i5.l h12 = gVar.h1(trim, this.O, str);
                        h12.initCause(e10);
                        throw h12;
                    }
                }
            }
            return G0();
        }
        w4.p P = lVar.P();
        if (P == w4.p.START_ARRAY) {
            return C(lVar, gVar);
        }
        if (P != w4.p.VALUE_EMBEDDED_OBJECT) {
            return gVar.i0(this.O, lVar);
        }
        T p12 = lVar.p1();
        if (p12 == null) {
            return null;
        }
        return this.O.isAssignableFrom(p12.getClass()) ? p12 : F0(p12, gVar);
    }
}
