package jh;

import gh.d;
import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;
import jh.f;
import kh.g;
import p7.f;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final int f19961a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static final String f19962b = "";

    /* renamed from: c  reason: collision with root package name */
    public static final int f19963c = 36;

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f19964d = {',', f.f11697h};

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap<String, String> f19965e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public static final f.a f19966f = new f.a();

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19967a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                jh.i$b[] r0 = jh.i.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19967a = r0
                jh.i$b r1 = jh.i.b.ascii     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19967a     // Catch:{ NoSuchFieldError -> 0x001d }
                jh.i$b r1 = jh.i.b.utf     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jh.i.a.<clinit>():void");
        }
    }

    public enum b {
        ascii,
        utf,
        fallback;

        public static b a(String str) {
            return str.equals(b6.c.f4237k) ? ascii : str.startsWith("UTF-") ? utf : fallback;
        }
    }

    public enum c {
        xhtml(j.f19968a, 4),
        base(j.f19969b, 106),
        extended(j.f19970c, 2125);
        
        public String[] O;
        public int[] P;
        public int[] Q;
        public String[] R;

        /* access modifiers changed from: public */
        c(String str, int i10) {
            i.k(this, str, i10);
        }

        public int m(String str) {
            int binarySearch = Arrays.binarySearch(this.O, str);
            if (binarySearch >= 0) {
                return this.P[binarySearch];
            }
            return -1;
        }

        public String n(int i10) {
            int binarySearch = Arrays.binarySearch(this.Q, i10);
            if (binarySearch < 0) {
                return "";
            }
            String[] strArr = this.R;
            if (binarySearch < strArr.length - 1) {
                int i11 = binarySearch + 1;
                if (this.Q[i11] == i10) {
                    return strArr[i11];
                }
            }
            return strArr[binarySearch];
        }

        public final int o() {
            return this.O.length;
        }
    }

    public static void b(Appendable appendable, c cVar, int i10) throws IOException {
        Appendable appendable2;
        String n10 = cVar.n(i10);
        if (!"".equals(n10)) {
            appendable2 = appendable.append('&');
        } else {
            appendable2 = appendable.append("&#x");
            n10 = Integer.toHexString(i10);
        }
        appendable2.append(n10).append(p7.f.f11697h);
    }

    public static boolean c(b bVar, char c10, CharsetEncoder charsetEncoder) {
        int i10 = a.f19967a[bVar.ordinal()];
        if (i10 == 1) {
            return c10 < 128;
        }
        if (i10 != 2) {
            return charsetEncoder.canEncode(c10);
        }
        return true;
    }

    public static int d(String str, int[] iArr) {
        String str2 = f19965e.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int m10 = c.extended.m(str);
        if (m10 == -1) {
            return 0;
        }
        iArr[0] = m10;
        return 1;
    }

    public static String e(String str) {
        return f(str, f19966f);
    }

    public static String f(String str, f.a aVar) {
        if (str == null) {
            return "";
        }
        StringBuilder b10 = ih.c.b();
        try {
            g(b10, str, aVar, false, false, false);
            return ih.c.o(b10);
        } catch (IOException e10) {
            throw new d((Throwable) e10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (c(r12, r8, r1) != false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008b, code lost:
        if (r1.canEncode(r8) != false) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(java.lang.Appendable r10, java.lang.String r11, jh.f.a r12, boolean r13, boolean r14, boolean r15) throws java.io.IOException {
        /*
            jh.i$c r0 = r12.m()
            java.nio.charset.CharsetEncoder r1 = r12.j()
            jh.i$b r12 = r12.R
            int r2 = r11.length()
            r3 = 0
            r4 = r3
            r5 = r4
            r6 = r5
        L_0x0012:
            if (r4 >= r2) goto L_0x0095
            int r7 = r11.codePointAt(r4)
            r8 = 1
            if (r14 == 0) goto L_0x0033
            boolean r9 = ih.c.i(r7)
            if (r9 == 0) goto L_0x0031
            if (r15 == 0) goto L_0x0025
            if (r5 == 0) goto L_0x008e
        L_0x0025:
            if (r6 == 0) goto L_0x0029
            goto L_0x008e
        L_0x0029:
            r6 = 32
            r10.append(r6)
            r6 = r8
            goto L_0x008e
        L_0x0031:
            r6 = r3
            r5 = r8
        L_0x0033:
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r8) goto L_0x007e
            char r8 = (char) r7
            r9 = 34
            if (r8 == r9) goto L_0x0075
            r9 = 38
            if (r8 == r9) goto L_0x006f
            r9 = 60
            if (r8 == r9) goto L_0x0066
            r9 = 62
            if (r8 == r9) goto L_0x0061
            r9 = 160(0xa0, float:2.24E-43)
            if (r8 == r9) goto L_0x0057
            boolean r9 = c(r12, r8, r1)
            if (r9 == 0) goto L_0x0053
            goto L_0x007a
        L_0x0053:
            b(r10, r0, r7)
            goto L_0x008e
        L_0x0057:
            jh.i$c r8 = jh.i.c.xhtml
            if (r0 == r8) goto L_0x005e
            java.lang.String r8 = "&nbsp;"
            goto L_0x0071
        L_0x005e:
            java.lang.String r8 = "&#xa0;"
            goto L_0x0071
        L_0x0061:
            if (r13 != 0) goto L_0x007a
            java.lang.String r8 = "&gt;"
            goto L_0x0071
        L_0x0066:
            if (r13 == 0) goto L_0x006c
            jh.i$c r9 = jh.i.c.xhtml
            if (r0 != r9) goto L_0x007a
        L_0x006c:
            java.lang.String r8 = "&lt;"
            goto L_0x0071
        L_0x006f:
            java.lang.String r8 = "&amp;"
        L_0x0071:
            r10.append(r8)
            goto L_0x008e
        L_0x0075:
            if (r13 == 0) goto L_0x007a
            java.lang.String r8 = "&quot;"
            goto L_0x0071
        L_0x007a:
            r10.append(r8)
            goto L_0x008e
        L_0x007e:
            java.lang.String r8 = new java.lang.String
            char[] r9 = java.lang.Character.toChars(r7)
            r8.<init>(r9)
            boolean r9 = r1.canEncode(r8)
            if (r9 == 0) goto L_0x0053
            goto L_0x0071
        L_0x008e:
            int r7 = java.lang.Character.charCount(r7)
            int r4 = r4 + r7
            goto L_0x0012
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.i.g(java.lang.Appendable, java.lang.String, jh.f$a, boolean, boolean, boolean):void");
    }

    public static String h(String str) {
        String str2 = f19965e.get(str);
        if (str2 != null) {
            return str2;
        }
        int m10 = c.extended.m(str);
        if (m10 == -1) {
            return "";
        }
        return new String(new int[]{m10}, 0, 1);
    }

    public static boolean i(String str) {
        return c.base.m(str) != -1;
    }

    public static boolean j(String str) {
        return c.extended.m(str) != -1;
    }

    public static void k(c cVar, String str, int i10) {
        int i11;
        String[] unused = cVar.O = new String[i10];
        int[] unused2 = cVar.P = new int[i10];
        int[] unused3 = cVar.Q = new int[i10];
        String[] unused4 = cVar.R = new String[i10];
        kh.a aVar = new kh.a(str);
        boolean z10 = false;
        int i12 = 0;
        while (!aVar.t()) {
            String m10 = aVar.m('=');
            aVar.a();
            int parseInt = Integer.parseInt(aVar.o(f19964d), 36);
            char s10 = aVar.s();
            aVar.a();
            if (s10 == ',') {
                i11 = Integer.parseInt(aVar.m(p7.f.f11697h), 36);
                aVar.a();
            } else {
                i11 = -1;
            }
            int parseInt2 = Integer.parseInt(aVar.m('&'), 36);
            aVar.a();
            cVar.O[i12] = m10;
            cVar.P[i12] = parseInt;
            cVar.Q[parseInt2] = parseInt;
            cVar.R[parseInt2] = m10;
            if (i11 != -1) {
                f19965e.put(m10, new String(new int[]{parseInt, i11}, 0, 2));
            }
            i12++;
        }
        if (i12 == i10) {
            z10 = true;
        }
        hh.d.e(z10, "Unexpected count of entities loaded");
    }

    public static String l(String str) {
        return m(str, false);
    }

    public static String m(String str, boolean z10) {
        return g.q(str, z10);
    }
}
