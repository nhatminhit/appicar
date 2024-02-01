package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastJsonResponse;
import d.m0;
import d.o0;
import j8.w;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import w8.c;
import w8.r;

@e8.a
@w
public class a<T extends FastJsonResponse> {

    /* renamed from: g  reason: collision with root package name */
    public static final char[] f5781g = {'u', 'l', 'l'};

    /* renamed from: h  reason: collision with root package name */
    public static final char[] f5782h = {'r', 'u', 'e'};

    /* renamed from: i  reason: collision with root package name */
    public static final char[] f5783i = {'r', 'u', 'e', '\"'};

    /* renamed from: j  reason: collision with root package name */
    public static final char[] f5784j = {'a', 'l', 's', 'e'};

    /* renamed from: k  reason: collision with root package name */
    public static final char[] f5785k = {'a', 'l', 's', 'e', '\"'};

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f5786l = {10};

    /* renamed from: m  reason: collision with root package name */
    public static final j f5787m = new b();

    /* renamed from: n  reason: collision with root package name */
    public static final j f5788n = new c();

    /* renamed from: o  reason: collision with root package name */
    public static final j f5789o = new d();

    /* renamed from: p  reason: collision with root package name */
    public static final j f5790p = new e();

    /* renamed from: q  reason: collision with root package name */
    public static final j f5791q = new f();

    /* renamed from: r  reason: collision with root package name */
    public static final j f5792r = new g();

    /* renamed from: s  reason: collision with root package name */
    public static final j f5793s = new h();

    /* renamed from: t  reason: collision with root package name */
    public static final j f5794t = new i();

    /* renamed from: a  reason: collision with root package name */
    public final char[] f5795a = new char[1];

    /* renamed from: b  reason: collision with root package name */
    public final char[] f5796b = new char[32];

    /* renamed from: c  reason: collision with root package name */
    public final char[] f5797c = new char[1024];

    /* renamed from: d  reason: collision with root package name */
    public final StringBuilder f5798d = new StringBuilder(32);

    /* renamed from: e  reason: collision with root package name */
    public final StringBuilder f5799e = new StringBuilder(1024);

    /* renamed from: f  reason: collision with root package name */
    public final Stack f5800f = new Stack();

    @e8.a
    @w
    /* renamed from: com.google.android.gms.common.server.response.a$a  reason: collision with other inner class name */
    public static class C0095a extends Exception {
        public C0095a(@m0 String str) {
            super(str);
        }

        public C0095a(@m0 String str, @m0 Throwable th2) {
            super("Error instantiating inner object", th2);
        }

        public C0095a(@m0 Throwable th2) {
            super(th2);
        }
    }

    public static final String b(BufferedReader bufferedReader, char[] cArr, StringBuilder sb2, @o0 char[] cArr2) throws C0095a, IOException {
        sb2.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z10 = false;
        boolean z11 = false;
        loop0:
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                for (int i10 = 0; i10 < read; i10++) {
                    char c10 = cArr[i10];
                    if (Character.isISOControl(c10)) {
                        if (cArr2 == null) {
                            break loop0;
                        }
                        int i11 = 0;
                        while (i11 <= 0) {
                            if (cArr2[i11] != c10) {
                                i11++;
                            }
                        }
                        break loop0;
                    }
                    if (c10 == '\"') {
                        if (!z11) {
                            sb2.append(cArr, 0, i10);
                            bufferedReader.reset();
                            bufferedReader.skip((long) (i10 + 1));
                            String sb3 = sb2.toString();
                            return z10 ? r.c(sb3) : sb3;
                        }
                    } else if (c10 == '\\') {
                        z11 = !z11;
                        z10 = true;
                    }
                    z11 = false;
                }
                sb2.append(cArr, 0, read);
                bufferedReader.mark(cArr.length);
            } else {
                throw new C0095a("Unexpected EOF while parsing string");
            }
        }
        throw new C0095a("Unexpected control character while reading string");
    }

    public final boolean A(BufferedReader bufferedReader, boolean z10) throws C0095a, IOException {
        char k10 = k(bufferedReader);
        if (k10 != '\"') {
            if (k10 == 'f') {
                z(bufferedReader, z10 ? f5785k : f5784j);
                return false;
            } else if (k10 == 'n') {
                z(bufferedReader, f5781g);
                return false;
            } else if (k10 == 't') {
                z(bufferedReader, z10 ? f5783i : f5782h);
                return true;
            } else {
                throw new C0095a("Unexpected token: " + k10);
            }
        } else if (!z10) {
            return A(bufferedReader, true);
        } else {
            throw new C0095a("No boolean value found in string");
        }
    }

    public final boolean B(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) throws C0095a, IOException {
        int i10;
        HashMap hashMap;
        BufferedReader bufferedReader2 = bufferedReader;
        FastJsonResponse fastJsonResponse2 = fastJsonResponse;
        Map<String, FastJsonResponse.Field<?, ?>> c10 = fastJsonResponse.c();
        String s10 = s(bufferedReader);
        if (s10 != null) {
            while (s10 != null) {
                FastJsonResponse.Field field = c10.get(s10);
                if (field == null) {
                    s10 = t(bufferedReader);
                } else {
                    this.f5800f.push(4);
                    int i11 = field.P;
                    switch (i11) {
                        case 0:
                            if (!field.Q) {
                                fastJsonResponse2.U(field, n(bufferedReader));
                                break;
                            } else {
                                fastJsonResponse2.V(field, w(bufferedReader2, f5787m));
                                break;
                            }
                        case 1:
                            if (!field.Q) {
                                fastJsonResponse2.C(field, v(bufferedReader));
                                break;
                            } else {
                                fastJsonResponse2.E(field, w(bufferedReader2, f5793s));
                                break;
                            }
                        case 2:
                            if (!field.Q) {
                                fastJsonResponse2.X(field, p(bufferedReader));
                                break;
                            } else {
                                fastJsonResponse2.Y(field, w(bufferedReader2, f5788n));
                                break;
                            }
                        case 3:
                            if (!field.Q) {
                                fastJsonResponse2.Q(field, m(bufferedReader));
                                break;
                            } else {
                                fastJsonResponse2.S(field, w(bufferedReader2, f5789o));
                                break;
                            }
                        case 4:
                            if (!field.Q) {
                                fastJsonResponse2.K(field, l(bufferedReader));
                                break;
                            } else {
                                fastJsonResponse2.M(field, w(bufferedReader2, f5790p));
                                break;
                            }
                        case 5:
                            if (!field.Q) {
                                fastJsonResponse2.y(field, u(bufferedReader));
                                break;
                            } else {
                                fastJsonResponse2.A(field, w(bufferedReader2, f5794t));
                                break;
                            }
                        case 6:
                            if (!field.Q) {
                                fastJsonResponse2.G(field, A(bufferedReader2, false));
                                break;
                            } else {
                                fastJsonResponse2.H(field, w(bufferedReader2, f5791q));
                                break;
                            }
                        case 7:
                            if (!field.Q) {
                                fastJsonResponse2.r(field, q(bufferedReader));
                                break;
                            } else {
                                fastJsonResponse2.t(field, w(bufferedReader2, f5792r));
                                break;
                            }
                        case 8:
                            fastJsonResponse2.J(field, c.a(r(bufferedReader2, this.f5797c, this.f5799e, f5786l)));
                            break;
                        case 9:
                            fastJsonResponse2.J(field, c.b(r(bufferedReader2, this.f5797c, this.f5799e, f5786l)));
                            break;
                        case 10:
                            char k10 = k(bufferedReader);
                            if (k10 == 'n') {
                                z(bufferedReader2, f5781g);
                                hashMap = null;
                            } else if (k10 == '{') {
                                this.f5800f.push(1);
                                hashMap = new HashMap();
                                while (true) {
                                    char k11 = k(bufferedReader);
                                    if (k11 == 0) {
                                        throw new C0095a("Unexpected EOF");
                                    } else if (k11 == '\"') {
                                        String b10 = b(bufferedReader2, this.f5796b, this.f5798d, (char[]) null);
                                        if (k(bufferedReader) != ':') {
                                            throw new C0095a("No map value found for key ".concat(String.valueOf(b10)));
                                        } else if (k(bufferedReader) == '\"') {
                                            hashMap.put(b10, b(bufferedReader2, this.f5796b, this.f5798d, (char[]) null));
                                            char k12 = k(bufferedReader);
                                            if (k12 != ',') {
                                                if (k12 != '}') {
                                                    throw new C0095a("Unexpected character while parsing string map: " + k12);
                                                }
                                            }
                                        } else {
                                            throw new C0095a("Expected String value for key ".concat(String.valueOf(b10)));
                                        }
                                    } else if (k11 != '}') {
                                    }
                                }
                                y(1);
                            } else {
                                throw new C0095a("Expected start of a map object");
                            }
                            fastJsonResponse2.s(field, hashMap);
                            break;
                        case 11:
                            if (field.Q) {
                                char k13 = k(bufferedReader);
                                if (k13 == 'n') {
                                    z(bufferedReader2, f5781g);
                                    fastJsonResponse2.a(field, field.T, (ArrayList) null);
                                } else {
                                    this.f5800f.push(5);
                                    if (k13 == '[') {
                                        fastJsonResponse2.a(field, field.T, x(bufferedReader2, field));
                                    } else {
                                        throw new C0095a("Expected array start");
                                    }
                                }
                            } else {
                                char k14 = k(bufferedReader);
                                if (k14 == 'n') {
                                    z(bufferedReader2, f5781g);
                                    fastJsonResponse2.b(field, field.T, null);
                                } else {
                                    this.f5800f.push(1);
                                    if (k14 == '{') {
                                        try {
                                            FastJsonResponse S1 = field.S1();
                                            B(bufferedReader2, S1);
                                            fastJsonResponse2.b(field, field.T, S1);
                                        } catch (InstantiationException e10) {
                                            throw new C0095a("Error instantiating inner object", e10);
                                        } catch (IllegalAccessException e11) {
                                            throw new C0095a("Error instantiating inner object", e11);
                                        }
                                    } else {
                                        throw new C0095a("Expected start of object");
                                    }
                                }
                            }
                            i10 = 4;
                            break;
                        default:
                            throw new C0095a("Invalid field type " + i11);
                    }
                    i10 = 4;
                    y(i10);
                    y(2);
                    char k15 = k(bufferedReader);
                    if (k15 == ',') {
                        s10 = s(bufferedReader);
                    } else if (k15 == '}') {
                        s10 = null;
                    } else {
                        throw new C0095a("Expected end of object or field separator, but found: " + k15);
                    }
                }
            }
            y(1);
            return true;
        }
        y(1);
        return false;
    }

    @e8.a
    public void a(@m0 InputStream inputStream, @m0 T t10) throws C0095a {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            this.f5800f.push(0);
            char k10 = k(bufferedReader);
            if (k10 != 0) {
                if (k10 == '[') {
                    this.f5800f.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> c10 = t10.c();
                    if (c10.size() == 1) {
                        FastJsonResponse.Field field = (FastJsonResponse.Field) c10.entrySet().iterator().next().getValue();
                        t10.a(field, field.T, x(bufferedReader, field));
                    } else {
                        throw new C0095a("Object array response class must have a single Field");
                    }
                } else if (k10 == '{') {
                    this.f5800f.push(1);
                    B(bufferedReader, t10);
                } else {
                    throw new C0095a("Unexpected token: " + k10);
                }
                y(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
            } else {
                throw new C0095a("No data to parse");
            }
        } catch (IOException e10) {
            throw new C0095a((Throwable) e10);
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    public final char k(BufferedReader bufferedReader) throws C0095a, IOException {
        if (bufferedReader.read(this.f5795a) == -1) {
            return 0;
        }
        while (Character.isWhitespace(this.f5795a[0])) {
            if (bufferedReader.read(this.f5795a) == -1) {
                return 0;
            }
        }
        return this.f5795a[0];
    }

    public final double l(BufferedReader bufferedReader) throws C0095a, IOException {
        int o10 = o(bufferedReader, this.f5797c);
        if (o10 == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.f5797c, 0, o10));
    }

    public final float m(BufferedReader bufferedReader) throws C0095a, IOException {
        int o10 = o(bufferedReader, this.f5797c);
        if (o10 == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.f5797c, 0, o10));
    }

    public final int n(BufferedReader bufferedReader) throws C0095a, IOException {
        int i10;
        int i11;
        int o10 = o(bufferedReader, this.f5797c);
        if (o10 == 0) {
            return 0;
        }
        char[] cArr = this.f5797c;
        if (o10 > 0) {
            char c10 = cArr[0];
            int i12 = c10 == '-' ? Integer.MIN_VALUE : -2147483647;
            int i13 = c10 == '-' ? 1 : 0;
            if (i13 < o10) {
                i11 = i13 + 1;
                int digit = Character.digit(cArr[i13], 10);
                if (digit >= 0) {
                    i10 = -digit;
                } else {
                    throw new C0095a("Unexpected non-digit character");
                }
            } else {
                i10 = 0;
                i11 = i13;
            }
            while (i11 < o10) {
                int i14 = i11 + 1;
                int digit2 = Character.digit(cArr[i11], 10);
                if (digit2 < 0) {
                    throw new C0095a("Unexpected non-digit character");
                } else if (i10 >= -214748364) {
                    int i15 = i10 * 10;
                    if (i15 >= i12 + digit2) {
                        i10 = i15 - digit2;
                        i11 = i14;
                    } else {
                        throw new C0095a("Number too large");
                    }
                } else {
                    throw new C0095a("Number too large");
                }
            }
            if (i13 == 0) {
                return -i10;
            }
            if (i11 > 1) {
                return i10;
            }
            throw new C0095a("No digits to parse");
        }
        throw new C0095a("No number to parse");
    }

    public final int o(BufferedReader bufferedReader, char[] cArr) throws C0095a, IOException {
        int i10;
        C0095a aVar;
        char k10 = k(bufferedReader);
        if (k10 == 0) {
            throw new C0095a("Unexpected EOF");
        } else if (k10 == ',') {
            throw new C0095a("Missing value");
        } else if (k10 == 'n') {
            z(bufferedReader, f5781g);
            return 0;
        } else {
            bufferedReader.mark(1024);
            if (k10 == '\"') {
                i10 = 0;
                boolean z10 = false;
                while (i10 < 1024 && bufferedReader.read(cArr, i10, 1) != -1) {
                    char c10 = cArr[i10];
                    if (!Character.isISOControl(c10)) {
                        if (c10 == '\"') {
                            if (!z10) {
                                bufferedReader.reset();
                                bufferedReader.skip((long) (i10 + 1));
                                return i10;
                            }
                        } else if (c10 == '\\') {
                            z10 = !z10;
                            i10++;
                        }
                        z10 = false;
                        i10++;
                    } else {
                        throw new C0095a("Unexpected control character while reading string");
                    }
                }
            } else {
                cArr[0] = k10;
                int i11 = 1;
                while (i10 < 1024 && bufferedReader.read(cArr, i10, 1) != -1) {
                    char c11 = cArr[i10];
                    if (c11 == '}' || c11 == ',' || Character.isWhitespace(c11) || cArr[i10] == ']') {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i10 - 1));
                        cArr[i10] = 0;
                        return i10;
                    }
                    i11 = i10 + 1;
                }
            }
            if (i10 == 1024) {
                throw aVar;
            }
            aVar = new C0095a("Unexpected EOF");
            throw aVar;
        }
    }

    public final long p(BufferedReader bufferedReader) throws C0095a, IOException {
        long j10;
        int i10;
        int o10 = o(bufferedReader, this.f5797c);
        if (o10 == 0) {
            return 0;
        }
        char[] cArr = this.f5797c;
        if (o10 > 0) {
            int i11 = 0;
            char c10 = cArr[0];
            long j11 = c10 == '-' ? Long.MIN_VALUE : b6.c.f4201b;
            if (c10 == '-') {
                i11 = 1;
            }
            if (i11 < o10) {
                i10 = i11 + 1;
                int digit = Character.digit(cArr[i11], 10);
                if (digit >= 0) {
                    j10 = (long) (-digit);
                } else {
                    throw new C0095a("Unexpected non-digit character");
                }
            } else {
                j10 = 0;
                i10 = i11;
            }
            while (i10 < o10) {
                int i12 = i10 + 1;
                int digit2 = Character.digit(cArr[i10], 10);
                if (digit2 < 0) {
                    throw new C0095a("Unexpected non-digit character");
                } else if (j10 >= pa.a.f21919d0) {
                    long j12 = j10 * 10;
                    int i13 = o10;
                    long j13 = (long) digit2;
                    if (j12 >= j11 + j13) {
                        j10 = j12 - j13;
                        o10 = i13;
                        i10 = i12;
                    } else {
                        throw new C0095a("Number too large");
                    }
                } else {
                    throw new C0095a("Number too large");
                }
            }
            if (i11 == 0) {
                return -j10;
            }
            if (i10 > 1) {
                return j10;
            }
            throw new C0095a("No digits to parse");
        }
        throw new C0095a("No number to parse");
    }

    @o0
    public final String q(BufferedReader bufferedReader) throws C0095a, IOException {
        return r(bufferedReader, this.f5796b, this.f5798d, (char[]) null);
    }

    @o0
    public final String r(BufferedReader bufferedReader, char[] cArr, StringBuilder sb2, @o0 char[] cArr2) throws C0095a, IOException {
        char k10 = k(bufferedReader);
        if (k10 == '\"') {
            return b(bufferedReader, cArr, sb2, cArr2);
        }
        if (k10 == 'n') {
            z(bufferedReader, f5781g);
            return null;
        }
        throw new C0095a("Expected string");
    }

    @o0
    public final String s(BufferedReader bufferedReader) throws C0095a, IOException {
        this.f5800f.push(2);
        char k10 = k(bufferedReader);
        if (k10 == '\"') {
            this.f5800f.push(3);
            String b10 = b(bufferedReader, this.f5796b, this.f5798d, (char[]) null);
            y(3);
            if (k(bufferedReader) == ':') {
                return b10;
            }
            throw new C0095a("Expected key/value separator");
        } else if (k10 == ']') {
            y(2);
            y(1);
            y(5);
            return null;
        } else if (k10 == '}') {
            y(2);
            return null;
        } else {
            throw new C0095a("Unexpected token: " + k10);
        }
    }

    @o0
    public final String t(BufferedReader bufferedReader) throws C0095a, IOException {
        bufferedReader.mark(1024);
        char k10 = k(bufferedReader);
        int i10 = 1;
        if (k10 != '\"') {
            if (k10 == ',') {
                throw new C0095a("Missing value");
            } else if (k10 == '[') {
                this.f5800f.push(5);
                bufferedReader.mark(32);
                if (k(bufferedReader) != ']') {
                    bufferedReader.reset();
                    boolean z10 = false;
                    boolean z11 = false;
                    while (i10 > 0) {
                        char k11 = k(bufferedReader);
                        if (k11 == 0) {
                            throw new C0095a("Unexpected EOF while parsing array");
                        } else if (!Character.isISOControl(k11)) {
                            if (k11 == '\"') {
                                if (!z11) {
                                    z10 = !z10;
                                }
                                k11 = '\"';
                            }
                            if (k11 == '[') {
                                if (!z10) {
                                    i10++;
                                }
                                k11 = '[';
                            }
                            if (k11 == ']' && !z10) {
                                i10--;
                            }
                            z11 = (k11 != '\\' || !z10) ? false : !z11;
                        } else {
                            throw new C0095a("Unexpected control character while reading array");
                        }
                    }
                }
                y(5);
            } else if (k10 != '{') {
                bufferedReader.reset();
                o(bufferedReader, this.f5797c);
            } else {
                this.f5800f.push(1);
                bufferedReader.mark(32);
                char k12 = k(bufferedReader);
                if (k12 != '}') {
                    if (k12 == '\"') {
                        bufferedReader.reset();
                        s(bufferedReader);
                        do {
                        } while (t(bufferedReader) != null);
                    } else {
                        throw new C0095a("Unexpected token " + k12);
                    }
                }
                y(1);
            }
        } else if (bufferedReader.read(this.f5795a) != -1) {
            char c10 = this.f5795a[0];
            boolean z12 = false;
            do {
                if (c10 == '\"') {
                    if (z12) {
                        c10 = '\"';
                        z12 = true;
                    }
                }
                z12 = c10 == '\\' ? !z12 : false;
                if (bufferedReader.read(this.f5795a) != -1) {
                    c10 = this.f5795a[0];
                } else {
                    throw new C0095a("Unexpected EOF while parsing string");
                }
            } while (!Character.isISOControl(c10));
            throw new C0095a("Unexpected control character while reading string");
        } else {
            throw new C0095a("Unexpected EOF while parsing string");
        }
        char k13 = k(bufferedReader);
        if (k13 == ',') {
            y(2);
            return s(bufferedReader);
        } else if (k13 == '}') {
            y(2);
            return null;
        } else {
            throw new C0095a("Unexpected token " + k13);
        }
    }

    @o0
    public final BigDecimal u(BufferedReader bufferedReader) throws C0095a, IOException {
        int o10 = o(bufferedReader, this.f5797c);
        if (o10 == 0) {
            return null;
        }
        return new BigDecimal(new String(this.f5797c, 0, o10));
    }

    @o0
    public final BigInteger v(BufferedReader bufferedReader) throws C0095a, IOException {
        int o10 = o(bufferedReader, this.f5797c);
        if (o10 == 0) {
            return null;
        }
        return new BigInteger(new String(this.f5797c, 0, o10));
    }

    @o0
    public final ArrayList w(BufferedReader bufferedReader, j jVar) throws C0095a, IOException {
        char k10 = k(bufferedReader);
        if (k10 == 'n') {
            z(bufferedReader, f5781g);
            return null;
        } else if (k10 == '[') {
            this.f5800f.push(5);
            ArrayList arrayList = new ArrayList();
            while (true) {
                bufferedReader.mark(1024);
                char k11 = k(bufferedReader);
                if (k11 == 0) {
                    throw new C0095a("Unexpected EOF");
                } else if (k11 != ',') {
                    if (k11 != ']') {
                        bufferedReader.reset();
                        arrayList.add(jVar.a(this, bufferedReader));
                    } else {
                        y(5);
                        return arrayList;
                    }
                }
            }
        } else {
            throw new C0095a("Expected start of array");
        }
    }

    @o0
    public final ArrayList x(BufferedReader bufferedReader, FastJsonResponse.Field field) throws C0095a, IOException {
        ArrayList arrayList = new ArrayList();
        char k10 = k(bufferedReader);
        if (k10 == ']') {
            y(5);
            return arrayList;
        } else if (k10 == 'n') {
            z(bufferedReader, f5781g);
            y(5);
            return null;
        } else if (k10 == '{') {
            Stack stack = this.f5800f;
            while (true) {
                stack.push(1);
                try {
                    FastJsonResponse S1 = field.S1();
                    if (!B(bufferedReader, S1)) {
                        return arrayList;
                    }
                    arrayList.add(S1);
                    char k11 = k(bufferedReader);
                    if (k11 != ',') {
                        if (k11 == ']') {
                            y(5);
                            return arrayList;
                        }
                        throw new C0095a("Unexpected token: " + k11);
                    } else if (k(bufferedReader) == '{') {
                        stack = this.f5800f;
                    } else {
                        throw new C0095a("Expected start of next object in array");
                    }
                } catch (InstantiationException e10) {
                    throw new C0095a("Error instantiating inner object", e10);
                } catch (IllegalAccessException e11) {
                    throw new C0095a("Error instantiating inner object", e11);
                }
            }
        } else {
            throw new C0095a("Unexpected token: " + k10);
        }
    }

    public final void y(int i10) throws C0095a {
        if (!this.f5800f.isEmpty()) {
            int intValue = ((Integer) this.f5800f.pop()).intValue();
            if (intValue != i10) {
                throw new C0095a("Expected state " + i10 + " but had " + intValue);
            }
            return;
        }
        throw new C0095a("Expected state " + i10 + " but had empty stack");
    }

    public final void z(BufferedReader bufferedReader, char[] cArr) throws C0095a, IOException {
        int i10 = 0;
        while (true) {
            int length = cArr.length;
            if (i10 < length) {
                int read = bufferedReader.read(this.f5796b, 0, length - i10);
                if (read != -1) {
                    int i11 = 0;
                    while (i11 < read) {
                        if (cArr[i11 + i10] == this.f5796b[i11]) {
                            i11++;
                        } else {
                            throw new C0095a("Unexpected character");
                        }
                    }
                    i10 += read;
                } else {
                    throw new C0095a("Unexpected EOF");
                }
            } else {
                return;
            }
        }
    }
}
