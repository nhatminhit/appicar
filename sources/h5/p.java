package h5;

import f6.e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.regex.Pattern;
import w4.b0;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f8855a = Pattern.compile("[-_./;:]");

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @Deprecated
    public static b0 b(ClassLoader classLoader, String str, String str2) {
        InputStream resourceAsStream = classLoader.getResourceAsStream("META-INF/maven/" + str.replaceAll("\\.", "/") + "/" + str2 + "/pom.properties");
        if (resourceAsStream != null) {
            try {
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                return d(properties.getProperty(e.f7416h), properties.getProperty("groupId"), properties.getProperty("artifactId"));
            } catch (IOException unused) {
            } finally {
                a(resourceAsStream);
            }
        }
        return b0.o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004c, code lost:
        throw new java.lang.IllegalArgumentException("Failed to get Versioned out of " + r3);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static w4.b0 c(java.lang.Class<?> r3) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004d }
            r0.<init>()     // Catch:{ Exception -> 0x004d }
            java.lang.Package r1 = r3.getPackage()     // Catch:{ Exception -> 0x004d }
            java.lang.String r1 = r1.getName()     // Catch:{ Exception -> 0x004d }
            r0.append(r1)     // Catch:{ Exception -> 0x004d }
            java.lang.String r1 = ".PackageVersion"
            r0.append(r1)     // Catch:{ Exception -> 0x004d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x004d }
            r1 = 1
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ Exception -> 0x004d }
            java.lang.Class r3 = java.lang.Class.forName(r0, r1, r3)     // Catch:{ Exception -> 0x004d }
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0036 }
            java.lang.reflect.Constructor r1 = r3.getDeclaredConstructor(r1)     // Catch:{ Exception -> 0x0036 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0036 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ Exception -> 0x0036 }
            w4.c0 r0 = (w4.c0) r0     // Catch:{ Exception -> 0x0036 }
            w4.b0 r3 = r0.version()     // Catch:{ Exception -> 0x0036 }
            goto L_0x004e
        L_0x0036:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x004d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004d }
            r1.<init>()     // Catch:{ Exception -> 0x004d }
            java.lang.String r2 = "Failed to get Versioned out of "
            r1.append(r2)     // Catch:{ Exception -> 0x004d }
            r1.append(r3)     // Catch:{ Exception -> 0x004d }
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x004d }
            r0.<init>(r3)     // Catch:{ Exception -> 0x004d }
            throw r0     // Catch:{ Exception -> 0x004d }
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 != 0) goto L_0x0054
            w4.b0 r3 = w4.b0.o()
        L_0x0054:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.p.c(java.lang.Class):w4.b0");
    }

    public static b0 d(String str, String str2, String str3) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > 0) {
                String[] split = f8855a.split(trim);
                int i10 = 0;
                int e10 = e(split[0]);
                int e11 = split.length > 1 ? e(split[1]) : 0;
                if (split.length > 2) {
                    i10 = e(split[2]);
                }
                return new b0(e10, e11, i10, split.length > 3 ? split[3] : null, str2, str3);
            }
        }
        return b0.o();
    }

    public static int e(String str) {
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt > '9' || charAt < '0') {
                break;
            }
            i10 = (i10 * 10) + (charAt - '0');
        }
        return i10;
    }

    public static final void f() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    public static b0 h(Class<?> cls) {
        b0 c10 = c(cls);
        return c10 == null ? b0.o() : c10;
    }

    @Deprecated
    public b0 g() {
        return b0.o();
    }
}
