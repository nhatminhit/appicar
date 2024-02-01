package pg;

import ch.a0;
import ch.c;
import ch.f;
import ch.q;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import og.b0;
import og.c0;
import og.e0;
import og.k0;
import og.m0;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f22065a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f22066b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public static final b0 f22067c = b0.l(new String[0]);

    /* renamed from: d  reason: collision with root package name */
    public static final m0 f22068d;

    /* renamed from: e  reason: collision with root package name */
    public static final k0 f22069e;

    /* renamed from: f  reason: collision with root package name */
    public static final q f22070f = q.f(f.k("efbbbf"), f.k("feff"), f.k("fffe"), f.k("0000ffff"), f.k("ffff0000"));

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f22071g = Charset.forName("UTF-32BE");

    /* renamed from: h  reason: collision with root package name */
    public static final Charset f22072h = Charset.forName("UTF-32LE");

    /* renamed from: i  reason: collision with root package name */
    public static final TimeZone f22073i = TimeZone.getTimeZone("GMT");

    /* renamed from: j  reason: collision with root package name */
    public static final Comparator<String> f22074j = new d();

    /* renamed from: k  reason: collision with root package name */
    public static final Method f22075k;

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f22076l = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    static {
        byte[] bArr = new byte[0];
        f22065a = bArr;
        Method method = null;
        f22068d = m0.t((e0) null, bArr);
        f22069e = k0.f((e0) null, bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        f22075k = method;
    }

    public static String[] A(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i10++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean B(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static /* synthetic */ Thread C(String str, boolean z10, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }

    public static boolean D(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static X509TrustManager E() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS", e10);
        }
    }

    public static boolean F(c0 c0Var, c0 c0Var2) {
        return c0Var.p().equals(c0Var2.p()) && c0Var.E() == c0Var2.E() && c0Var.P().equals(c0Var2.P());
    }

    public static boolean G(a0 a0Var, int i10, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long d10 = a0Var.b().f() ? a0Var.b().d() - nanoTime : Long.MAX_VALUE;
        a0Var.b().e(Math.min(d10, timeUnit.toNanos((long) i10)) + nanoTime);
        try {
            c cVar = new c();
            while (a0Var.C0(cVar, 8192) != -1) {
                cVar.g();
            }
            int i11 = (d10 > Long.MAX_VALUE ? 1 : (d10 == Long.MAX_VALUE ? 0 : -1));
            ch.b0 b10 = a0Var.b();
            if (i11 == 0) {
                b10.a();
            } else {
                b10.e(nanoTime + d10);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i12 = (d10 > Long.MAX_VALUE ? 1 : (d10 == Long.MAX_VALUE ? 0 : -1));
            ch.b0 b11 = a0Var.b();
            if (i12 == 0) {
                b11.a();
            } else {
                b11.e(nanoTime + d10);
            }
            return false;
        } catch (Throwable th2) {
            int i13 = (d10 > Long.MAX_VALUE ? 1 : (d10 == Long.MAX_VALUE ? 0 : -1));
            ch.b0 b12 = a0Var.b();
            if (i13 == 0) {
                b12.a();
            } else {
                b12.e(nanoTime + d10);
            }
            throw th2;
        }
    }

    public static int H(String str, int i10, int i11) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int I(String str, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            char charAt = str.charAt(i12);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i12 + 1;
            }
        }
        return i10;
    }

    public static ThreadFactory J(String str, boolean z10) {
        return new c(str, z10);
    }

    public static List<wg.c> K(b0 b0Var) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b0Var.m(); i10++) {
            arrayList.add(new wg.c(b0Var.h(i10), b0Var.o(i10)));
        }
        return arrayList;
    }

    public static b0 L(List<wg.c> list) {
        b0.a aVar = new b0.a();
        for (wg.c next : list) {
            a.f22062a.b(aVar, next.f24157a.a0(), next.f24158b.a0());
        }
        return aVar.i();
    }

    public static String M(String str, int i10, int i11) {
        int H = H(str, i10, i11);
        return str.substring(H, I(str, H, i11));
    }

    public static boolean N(String str) {
        return f22076l.matcher(str).matches();
    }

    public static void b(Throwable th2, Throwable th3) {
        Method method = f22075k;
        if (method != null) {
            try {
                method.invoke(th2, new Object[]{th3});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static Charset c(ch.e eVar, Charset charset) throws IOException {
        int Z = eVar.Z(f22070f);
        if (Z == -1) {
            return charset;
        }
        if (Z == 0) {
            return StandardCharsets.UTF_8;
        }
        if (Z == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (Z == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (Z == 3) {
            return f22071g;
        }
        if (Z == 4) {
            return f22072h;
        }
        throw new AssertionError();
    }

    public static String d(String str) {
        if (str.contains(":")) {
            InetAddress n10 = (!str.startsWith("[") || !str.endsWith("]")) ? n(str, 0, str.length()) : n(str, 1, str.length() - 1);
            if (n10 == null) {
                return null;
            }
            byte[] address = n10.getAddress();
            if (address.length == 16) {
                return z(address);
            }
            if (address.length == 4) {
                return n10.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !k(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int e(String str, long j10, TimeUnit timeUnit) {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalArgumentException(str + " < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j10);
            if (millis > y4.c.M0) {
                throw new IllegalArgumentException(str + " too large.");
            } else if (millis != 0 || i10 <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(str + " too small.");
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public static void f(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static void h(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static void i(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e10) {
                if (!B(e10)) {
                    throw e10;
                }
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    public static String[] j(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    public static boolean k(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int l(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static boolean m(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char charAt = str.charAt(i14);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i14++;
                }
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    @Nullable
    public static InetAddress n(String str, int i10, int i11) {
        byte[] bArr = new byte[16];
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            } else if (i14 == 16) {
                return null;
            } else {
                int i15 = i10 + 2;
                if (i15 > i11 || !str.regionMatches(i10, "::", 0, 2)) {
                    if (i14 != 0) {
                        if (str.regionMatches(i10, ":", 0, 1)) {
                            i10++;
                        } else if (!str.regionMatches(i10, ".", 0, 1) || !m(str, i13, i11, bArr, i14 - 2)) {
                            return null;
                        } else {
                            i14 += 2;
                        }
                    }
                    i13 = i10;
                } else if (i12 != -1) {
                    return null;
                } else {
                    i14 += 2;
                    i12 = i14;
                    if (i15 == i11) {
                        break;
                    }
                    i13 = i15;
                }
                int i16 = 0;
                i10 = i13;
                while (i10 < i11) {
                    int l10 = l(str.charAt(i10));
                    if (l10 == -1) {
                        break;
                    }
                    i16 = (i16 << 4) + l10;
                    i10++;
                }
                int i17 = i10 - i13;
                if (i17 == 0 || i17 > 4) {
                    return null;
                }
                int i18 = i14 + 1;
                bArr[i14] = (byte) ((i16 >>> 8) & 255);
                i14 = i18 + 1;
                bArr[i18] = (byte) (i16 & 255);
            }
        }
        if (i14 != 16) {
            if (i12 == -1) {
                return null;
            }
            int i19 = i14 - i12;
            System.arraycopy(bArr, i12, bArr, 16 - i19, i19);
            Arrays.fill(bArr, i12, (16 - i14) + i12, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public static int o(String str, int i10, int i11, char c10) {
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int p(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static boolean q(a0 a0Var, int i10, TimeUnit timeUnit) {
        try {
            return G(a0Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static String r(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String s(String str, @Nullable String str2) {
        try {
            String property = System.getProperty(str);
            return property != null ? property : str2;
        } catch (AccessControlException unused) {
            return str2;
        }
    }

    public static String t(c0 c0Var, boolean z10) {
        String str;
        if (c0Var.p().contains(":")) {
            str = "[" + c0Var.p() + "]";
        } else {
            str = c0Var.p();
        }
        if (!z10 && c0Var.E() == c0.e(c0Var.P())) {
            return str;
        }
        return str + ":" + c0Var.E();
    }

    public static <T> List<T> u(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    @SafeVarargs
    public static <T> List<T> v(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static <K, V> Map<K, V> w(Map<K, V> map) {
        return map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static int x(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static int y(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt >= 127) {
                return i10;
            }
        }
        return -1;
    }

    public static String z(byte[] bArr) {
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i11 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        c cVar = new c();
        while (i10 < bArr.length) {
            if (i10 == i11) {
                cVar.writeByte(58);
                i10 += i13;
                if (i10 == 16) {
                    cVar.writeByte(58);
                }
            } else {
                if (i10 > 0) {
                    cVar.writeByte(58);
                }
                cVar.P0((long) (((bArr[i10] & 255) << 8) | (bArr[i10 + 1] & 255)));
                i10 += 2;
            }
        }
        return cVar.o1();
    }
}
