package d4;

import android.text.TextUtils;
import d.g1;
import d.m0;
import d.o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class j implements h {

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, List<i>> f6034c;

    /* renamed from: d  reason: collision with root package name */
    public volatile Map<String, String> f6035d;

    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static final String f6036d = "User-Agent";

        /* renamed from: e  reason: collision with root package name */
        public static final String f6037e;

        /* renamed from: f  reason: collision with root package name */
        public static final Map<String, List<i>> f6038f;

        /* renamed from: a  reason: collision with root package name */
        public boolean f6039a = true;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, List<i>> f6040b = f6038f;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6041c = true;

        static {
            String g10 = g();
            f6037e = g10;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(g10)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(g10)));
            }
            f6038f = Collections.unmodifiableMap(hashMap);
        }

        @g1
        public static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = property.charAt(i10);
                if ((charAt <= 31 && charAt != 9) || charAt >= 127) {
                    charAt = '?';
                }
                sb2.append(charAt);
            }
            return sb2.toString();
        }

        public a a(@m0 String str, @m0 i iVar) {
            if (this.f6041c && "User-Agent".equalsIgnoreCase(str)) {
                return h(str, iVar);
            }
            e();
            f(str).add(iVar);
            return this;
        }

        public a b(@m0 String str, @m0 String str2) {
            return a(str, new b(str2));
        }

        public j c() {
            this.f6039a = true;
            return new j(this.f6040b);
        }

        public final Map<String, List<i>> d() {
            HashMap hashMap = new HashMap(this.f6040b.size());
            for (Map.Entry next : this.f6040b.entrySet()) {
                hashMap.put(next.getKey(), new ArrayList((Collection) next.getValue()));
            }
            return hashMap;
        }

        public final void e() {
            if (this.f6039a) {
                this.f6039a = false;
                this.f6040b = d();
            }
        }

        public final List<i> f(String str) {
            List<i> list = this.f6040b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f6040b.put(str, arrayList);
            return arrayList;
        }

        public a h(@m0 String str, @o0 i iVar) {
            e();
            if (iVar == null) {
                this.f6040b.remove(str);
            } else {
                List<i> f10 = f(str);
                f10.clear();
                f10.add(iVar);
            }
            if (this.f6041c && "User-Agent".equalsIgnoreCase(str)) {
                this.f6041c = false;
            }
            return this;
        }

        public a i(@m0 String str, @o0 String str2) {
            return h(str, str2 == null ? null : new b(str2));
        }
    }

    public static final class b implements i {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final String f6042a;

        public b(@m0 String str) {
            this.f6042a = str;
        }

        public String a() {
            return this.f6042a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f6042a.equals(((b) obj).f6042a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6042a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f6042a + '\'' + '}';
        }
    }

    public j(Map<String, List<i>> map) {
        this.f6034c = Collections.unmodifiableMap(map);
    }

    public Map<String, String> a() {
        if (this.f6035d == null) {
            synchronized (this) {
                if (this.f6035d == null) {
                    this.f6035d = Collections.unmodifiableMap(c());
                }
            }
        }
        return this.f6035d;
    }

    @m0
    public final String b(@m0 List<i> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String a10 = list.get(i10).a();
            if (!TextUtils.isEmpty(a10)) {
                sb2.append(a10);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f6034c.entrySet()) {
            String b10 = b((List) next.getValue());
            if (!TextUtils.isEmpty(b10)) {
                hashMap.put(next.getKey(), b10);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f6034c.equals(((j) obj).f6034c);
        }
        return false;
    }

    public int hashCode() {
        return this.f6034c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f6034c + '}';
    }
}
