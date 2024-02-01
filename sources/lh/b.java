package lh;

import bc.p;
import dc.a;
import gc.t;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import jh.h;
import p7.f;
import zb.q;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public Set<d> f20954a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public Map<d, Set<a>> f20955b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public Map<d, Map<a, C0362b>> f20956c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public Map<d, Map<a, Set<c>>> f20957d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public boolean f20958e = false;

    public static class a extends e {
        public a(String str) {
            super(str);
        }

        public static a a(String str) {
            return new a(str);
        }
    }

    /* renamed from: lh.b$b  reason: collision with other inner class name */
    public static class C0362b extends e {
        public C0362b(String str) {
            super(str);
        }

        public static C0362b a(String str) {
            return new C0362b(str);
        }
    }

    public static class c extends e {
        public c(String str) {
            super(str);
        }

        public static c a(String str) {
            return new c(str);
        }
    }

    public static class d extends e {
        public d(String str) {
            super(str);
        }

        public static d a(String str) {
            return new d(str);
        }
    }

    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public String f20959a;

        public e(String str) {
            hh.d.j(str);
            this.f20959a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            String str = this.f20959a;
            String str2 = ((e) obj).f20959a;
            return str == null ? str2 == null : str.equals(str2);
        }

        public int hashCode() {
            String str = this.f20959a;
            return 31 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return this.f20959a;
        }
    }

    public static b e() {
        return new b().d("a", f.f11703n, "blockquote", n7.b.f10951s, "cite", "code", "dd", "dl", "dt", "em", "i", "li", "ol", "p", "pre", q.f25095b, p.f16191j, n7.b.f10950r, "strike", "strong", "sub", "sup", f.f11705p, "ul").a("a", "href").a("blockquote", "cite").a(q.f25095b, "cite").c("a", "href", "ftp", t.f19110d, t.f19111e, w0.d.f14358c).c("blockquote", "cite", t.f19110d, t.f19111e).c("cite", "cite", t.f19110d, t.f19111e).b("a", a.C0292a.f17816i, "nofollow");
    }

    public static b f() {
        return e().d("img").a("img", "align", "alt", "height", "src", "title", "width").c("img", "src", t.f19110d, t.f19111e);
    }

    public static b k() {
        return new b();
    }

    public static b m() {
        return new b().d("a", f.f11703n, "blockquote", n7.b.f10951s, "caption", "cite", "code", "col", "colgroup", "dd", n7.b.f10948p, "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", "i", "img", "li", "ol", "p", "pre", q.f25095b, p.f16191j, n7.b.f10950r, "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", f.f11705p, "ul").a("a", "href", "title").a("blockquote", "cite").a("col", n7.b.f10950r, "width").a("colgroup", n7.b.f10950r, "width").a("img", "align", "alt", "height", "src", "title", "width").a("ol", n7.b.X, "type").a(q.f25095b, "cite").a("table", "summary", "width").a("td", "abbr", "axis", "colspan", "rowspan", "width").a("th", "abbr", "axis", "colspan", "rowspan", "scope", "width").a("ul", "type").c("a", "href", "ftp", t.f19110d, t.f19111e, w0.d.f14358c).c("blockquote", "cite", t.f19110d, t.f19111e).c("cite", "cite", t.f19110d, t.f19111e).c("img", "src", t.f19110d, t.f19111e).c(q.f25095b, "cite", t.f19110d, t.f19111e);
    }

    public static b r() {
        return new b().d(f.f11703n, "em", "i", "strong", f.f11705p);
    }

    public b a(String str, String... strArr) {
        hh.d.h(str);
        hh.d.j(strArr);
        hh.d.e(strArr.length > 0, "No attribute names supplied.");
        d a10 = d.a(str);
        this.f20954a.add(a10);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            hh.d.h(str2);
            hashSet.add(a.a(str2));
        }
        if (this.f20955b.containsKey(a10)) {
            this.f20955b.get(a10).addAll(hashSet);
        } else {
            this.f20955b.put(a10, hashSet);
        }
        return this;
    }

    public b b(String str, String str2, String str3) {
        hh.d.h(str);
        hh.d.h(str2);
        hh.d.h(str3);
        d a10 = d.a(str);
        this.f20954a.add(a10);
        a a11 = a.a(str2);
        C0362b a12 = C0362b.a(str3);
        if (this.f20956c.containsKey(a10)) {
            this.f20956c.get(a10).put(a11, a12);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(a11, a12);
            this.f20956c.put(a10, hashMap);
        }
        return this;
    }

    public b c(String str, String str2, String... strArr) {
        Map map;
        Set set;
        hh.d.h(str);
        hh.d.h(str2);
        hh.d.j(strArr);
        d a10 = d.a(str);
        a a11 = a.a(str2);
        if (this.f20957d.containsKey(a10)) {
            map = this.f20957d.get(a10);
        } else {
            HashMap hashMap = new HashMap();
            this.f20957d.put(a10, hashMap);
            map = hashMap;
        }
        if (map.containsKey(a11)) {
            set = (Set) map.get(a11);
        } else {
            HashSet hashSet = new HashSet();
            map.put(a11, hashSet);
            set = hashSet;
        }
        for (String str3 : strArr) {
            hh.d.h(str3);
            set.add(c.a(str3));
        }
        return this;
    }

    public b d(String... strArr) {
        hh.d.j(strArr);
        for (String str : strArr) {
            hh.d.h(str);
            this.f20954a.add(d.a(str));
        }
        return this;
    }

    public jh.b g(String str) {
        jh.b bVar = new jh.b();
        d a10 = d.a(str);
        if (this.f20956c.containsKey(a10)) {
            for (Map.Entry entry : this.f20956c.get(a10).entrySet()) {
                bVar.M(((a) entry.getKey()).toString(), ((C0362b) entry.getValue()).toString());
            }
        }
        return bVar;
    }

    public boolean h(String str, h hVar, jh.a aVar) {
        d a10 = d.a(str);
        a a11 = a.a(aVar.getKey());
        Set set = this.f20955b.get(a10);
        if (set == null || !set.contains(a11)) {
            if (this.f20956c.get(a10) != null) {
                jh.b g10 = g(str);
                String g11 = aVar.getKey();
                if (g10.E(g11)) {
                    return g10.A(g11).equals(aVar.getValue());
                }
            }
            return !str.equals(":all") && h(":all", hVar, aVar);
        } else if (!this.f20957d.containsKey(a10)) {
            return true;
        } else {
            Map map = this.f20957d.get(a10);
            return !map.containsKey(a11) || s(hVar, aVar, (Set) map.get(a11));
        }
    }

    public boolean i(String str) {
        return this.f20954a.contains(d.a(str));
    }

    public final boolean j(String str) {
        return str.startsWith("#") && !str.matches(".*\\s.*");
    }

    public b l(boolean z10) {
        this.f20958e = z10;
        return this;
    }

    public b n(String str, String... strArr) {
        hh.d.h(str);
        hh.d.j(strArr);
        hh.d.e(strArr.length > 0, "No attribute names supplied.");
        d a10 = d.a(str);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            hh.d.h(str2);
            hashSet.add(a.a(str2));
        }
        if (this.f20954a.contains(a10) && this.f20955b.containsKey(a10)) {
            Set set = this.f20955b.get(a10);
            set.removeAll(hashSet);
            if (set.isEmpty()) {
                this.f20955b.remove(a10);
            }
        }
        if (str.equals(":all")) {
            for (d next : this.f20955b.keySet()) {
                Set set2 = this.f20955b.get(next);
                set2.removeAll(hashSet);
                if (set2.isEmpty()) {
                    this.f20955b.remove(next);
                }
            }
        }
        return this;
    }

    public b o(String str, String str2) {
        hh.d.h(str);
        hh.d.h(str2);
        d a10 = d.a(str);
        if (this.f20954a.contains(a10) && this.f20956c.containsKey(a10)) {
            a a11 = a.a(str2);
            Map map = this.f20956c.get(a10);
            map.remove(a11);
            if (map.isEmpty()) {
                this.f20956c.remove(a10);
            }
        }
        return this;
    }

    public b p(String str, String str2, String... strArr) {
        hh.d.h(str);
        hh.d.h(str2);
        hh.d.j(strArr);
        d a10 = d.a(str);
        a a11 = a.a(str2);
        hh.d.e(this.f20957d.containsKey(a10), "Cannot remove a protocol that is not set.");
        Map map = this.f20957d.get(a10);
        hh.d.e(map.containsKey(a11), "Cannot remove a protocol that is not set.");
        Set set = (Set) map.get(a11);
        for (String str3 : strArr) {
            hh.d.h(str3);
            set.remove(c.a(str3));
        }
        if (set.isEmpty()) {
            map.remove(a11);
            if (map.isEmpty()) {
                this.f20957d.remove(a10);
            }
        }
        return this;
    }

    public b q(String... strArr) {
        hh.d.j(strArr);
        for (String str : strArr) {
            hh.d.h(str);
            d a10 = d.a(str);
            if (this.f20954a.remove(a10)) {
                this.f20955b.remove(a10);
                this.f20956c.remove(a10);
                this.f20957d.remove(a10);
            }
        }
        return this;
    }

    public final boolean s(h hVar, jh.a aVar, Set<c> set) {
        String a10 = hVar.a(aVar.getKey());
        if (a10.length() == 0) {
            a10 = aVar.getValue();
        }
        if (!this.f20958e) {
            aVar.setValue(a10);
        }
        for (c eVar : set) {
            String eVar2 = eVar.toString();
            if (!eVar2.equals("#")) {
                if (ih.b.a(a10).startsWith(eVar2 + ":")) {
                    return true;
                }
            } else if (j(a10)) {
                return true;
            }
        }
        return false;
    }
}
