package x0;

import d.e0;
import d.g1;
import d.m0;
import d.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

public final class m implements n {

    /* renamed from: c  reason: collision with root package name */
    public static final Locale[] f15010c = new Locale[0];

    /* renamed from: d  reason: collision with root package name */
    public static final Locale f15011d = new Locale("en", "XA");

    /* renamed from: e  reason: collision with root package name */
    public static final Locale f15012e = new Locale("ar", "XB");

    /* renamed from: f  reason: collision with root package name */
    public static final Locale f15013f = l.b("en-Latn");

    /* renamed from: a  reason: collision with root package name */
    public final Locale[] f15014a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final String f15015b;

    public m(@m0 Locale... localeArr) {
        String sb2;
        if (localeArr.length == 0) {
            this.f15014a = f15010c;
            sb2 = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb3 = new StringBuilder();
            int i10 = 0;
            while (i10 < localeArr.length) {
                Locale locale = localeArr[i10];
                if (locale != null) {
                    if (!hashSet.contains(locale)) {
                        Locale locale2 = (Locale) locale.clone();
                        arrayList.add(locale2);
                        k(sb3, locale2);
                        if (i10 < localeArr.length - 1) {
                            sb3.append(',');
                        }
                        hashSet.add(locale2);
                    }
                    i10++;
                } else {
                    throw new NullPointerException("list[" + i10 + "] is null");
                }
            }
            this.f15014a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
            sb2 = sb3.toString();
        }
        this.f15015b = sb2;
    }

    public static String h(Locale locale) {
        String script = locale.getScript();
        return !script.isEmpty() ? script : "";
    }

    public static boolean i(Locale locale) {
        return f15011d.equals(locale) || f15012e.equals(locale);
    }

    @e0(from = 0, to = 1)
    public static int j(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || i(locale) || i(locale2)) {
            return 0;
        }
        String h10 = h(locale);
        if (!h10.isEmpty()) {
            return h10.equals(h(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
    }

    @g1
    public static void k(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb2.append('-');
            sb2.append(locale.getCountry());
        }
    }

    public int a(Locale locale) {
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f15014a;
            if (i10 >= localeArr.length) {
                return -1;
            }
            if (localeArr[i10].equals(locale)) {
                return i10;
            }
            i10++;
        }
    }

    public String b() {
        return this.f15015b;
    }

    @o0
    public Object c() {
        return null;
    }

    public Locale d(@m0 String[] strArr) {
        return e(Arrays.asList(strArr), false);
    }

    public final Locale e(Collection<String> collection, boolean z10) {
        int f10 = f(collection, z10);
        if (f10 == -1) {
            return null;
        }
        return this.f15014a[f10];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        Locale[] localeArr = ((m) obj).f15014a;
        if (this.f15014a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f15014a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r6 < Integer.MAX_VALUE) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int f(java.util.Collection<java.lang.String> r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.f15014a
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x0008
            return r2
        L_0x0008:
            int r0 = r0.length
            if (r0 != 0) goto L_0x000d
            r5 = -1
            return r5
        L_0x000d:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L_0x001e
            java.util.Locale r6 = f15013f
            int r6 = r4.g(r6)
            if (r6 != 0) goto L_0x001b
            return r2
        L_0x001b:
            if (r6 >= r0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r6 = r0
        L_0x001f:
            java.util.Iterator r5 = r5.iterator()
        L_0x0023:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x003e
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = x0.l.b(r1)
            int r1 = r4.g(r1)
            if (r1 != 0) goto L_0x003a
            return r2
        L_0x003a:
            if (r1 >= r6) goto L_0x0023
            r6 = r1
            goto L_0x0023
        L_0x003e:
            if (r6 != r0) goto L_0x0041
            return r2
        L_0x0041:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.m.f(java.util.Collection, boolean):int");
    }

    public final int g(Locale locale) {
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f15014a;
            if (i10 >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (j(locale, localeArr[i10]) > 0) {
                return i10;
            }
            i10++;
        }
    }

    public Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f15014a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public int hashCode() {
        int i10 = 1;
        int i11 = 0;
        while (true) {
            Locale[] localeArr = this.f15014a;
            if (i11 >= localeArr.length) {
                return i10;
            }
            i10 = (i10 * 31) + localeArr[i11].hashCode();
            i11++;
        }
    }

    public boolean isEmpty() {
        return this.f15014a.length == 0;
    }

    public int size() {
        return this.f15014a.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f15014a;
            if (i10 < localeArr.length) {
                sb2.append(localeArr[i10]);
                if (i10 < this.f15014a.length - 1) {
                    sb2.append(',');
                }
                i10++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
