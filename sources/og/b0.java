package og;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import pg.e;
import ug.d;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f21468a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f21469a = new ArrayList(20);

        public a a(String str) {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                return b(str.substring(0, indexOf).trim(), str.substring(indexOf + 1));
            }
            throw new IllegalArgumentException("Unexpected header: " + str);
        }

        public a b(String str, String str2) {
            b0.b(str);
            b0.c(str2, str);
            return g(str, str2);
        }

        @IgnoreJRERequirement
        public a c(String str, Instant instant) {
            if (instant != null) {
                return d(str, new Date(instant.toEpochMilli()));
            }
            throw new NullPointerException("value for name " + str + " == null");
        }

        public a d(String str, Date date) {
            if (date != null) {
                b(str, d.a(date));
                return this;
            }
            throw new NullPointerException("value for name " + str + " == null");
        }

        public a e(b0 b0Var) {
            int m10 = b0Var.m();
            for (int i10 = 0; i10 < m10; i10++) {
                g(b0Var.h(i10), b0Var.o(i10));
            }
            return this;
        }

        public a f(String str) {
            int indexOf = str.indexOf(":", 1);
            return indexOf != -1 ? g(str.substring(0, indexOf), str.substring(indexOf + 1)) : str.startsWith(":") ? g("", str.substring(1)) : g("", str);
        }

        public a g(String str, String str2) {
            this.f21469a.add(str);
            this.f21469a.add(str2.trim());
            return this;
        }

        public a h(String str, String str2) {
            b0.b(str);
            return g(str, str2);
        }

        public b0 i() {
            return new b0(this);
        }

        @Nullable
        public String j(String str) {
            for (int size = this.f21469a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.f21469a.get(size))) {
                    return this.f21469a.get(size + 1);
                }
            }
            return null;
        }

        public a k(String str) {
            int i10 = 0;
            while (i10 < this.f21469a.size()) {
                if (str.equalsIgnoreCase(this.f21469a.get(i10))) {
                    this.f21469a.remove(i10);
                    this.f21469a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public a l(String str, String str2) {
            b0.b(str);
            b0.c(str2, str);
            k(str);
            g(str, str2);
            return this;
        }

        @IgnoreJRERequirement
        public a m(String str, Instant instant) {
            if (instant != null) {
                return n(str, new Date(instant.toEpochMilli()));
            }
            throw new NullPointerException("value for name " + str + " == null");
        }

        public a n(String str, Date date) {
            if (date != null) {
                l(str, d.a(date));
                return this;
            }
            throw new NullPointerException("value for name " + str + " == null");
        }
    }

    public b0(a aVar) {
        List<String> list = aVar.f21469a;
        this.f21468a = (String[]) list.toArray(new String[list.size()]);
    }

    public b0(String[] strArr) {
        this.f21468a = strArr;
    }

    public static void b(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(e.r("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    public static void c(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                char charAt = str.charAt(i10);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i10++;
                } else {
                    throw new IllegalArgumentException(e.r("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }

    @Nullable
    public static String e(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static b0 k(Map<String, String> map) {
        if (map != null) {
            String[] strArr = new String[(map.size() * 2)];
            int i10 = 0;
            for (Map.Entry next : map.entrySet()) {
                if (next.getKey() == null || next.getValue() == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                String trim = ((String) next.getKey()).trim();
                String trim2 = ((String) next.getValue()).trim();
                b(trim);
                c(trim2, trim);
                strArr[i10] = trim;
                strArr[i10 + 1] = trim2;
                i10 += 2;
            }
            return new b0(strArr);
        }
        throw new NullPointerException("headers == null");
    }

    public static b0 l(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        } else if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int i10 = 0;
            while (i10 < strArr2.length) {
                String str = strArr2[i10];
                if (str != null) {
                    strArr2[i10] = str.trim();
                    i10++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i11 = 0; i11 < strArr2.length; i11 += 2) {
                String str2 = strArr2[i11];
                String str3 = strArr2[i11 + 1];
                b(str2);
                c(str3, str2);
            }
            return new b0(strArr2);
        } else {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
    }

    public long a() {
        String[] strArr = this.f21468a;
        long length = (long) (strArr.length * 2);
        int length2 = strArr.length;
        for (int i10 = 0; i10 < length2; i10++) {
            length += (long) this.f21468a[i10].length();
        }
        return length;
    }

    @Nullable
    public String d(String str) {
        return e(this.f21468a, str);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof b0) && Arrays.equals(((b0) obj).f21468a, this.f21468a);
    }

    @Nullable
    public Date f(String str) {
        String d10 = d(str);
        if (d10 != null) {
            return d.b(d10);
        }
        return null;
    }

    @Nullable
    @IgnoreJRERequirement
    public Instant g(String str) {
        Date f10 = f(str);
        if (f10 != null) {
            return f10.toInstant();
        }
        return null;
    }

    public String h(int i10) {
        return this.f21468a[i10 * 2];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f21468a);
    }

    public Set<String> i() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int m10 = m();
        for (int i10 = 0; i10 < m10; i10++) {
            treeSet.add(h(i10));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public a j() {
        a aVar = new a();
        Collections.addAll(aVar.f21469a, this.f21468a);
        return aVar;
    }

    public int m() {
        return this.f21468a.length / 2;
    }

    public Map<String, List<String>> n() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int m10 = m();
        for (int i10 = 0; i10 < m10; i10++) {
            String lowerCase = h(i10).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(o(i10));
        }
        return treeMap;
    }

    public String o(int i10) {
        return this.f21468a[(i10 * 2) + 1];
    }

    public List<String> p(String str) {
        int m10 = m();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < m10; i10++) {
            if (str.equalsIgnoreCase(h(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(o(i10));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int m10 = m();
        for (int i10 = 0; i10 < m10; i10++) {
            sb2.append(h(i10));
            sb2.append(": ");
            sb2.append(o(i10));
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
