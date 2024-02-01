package x2;

import android.database.Cursor;
import d.m0;
import d.o0;
import d.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p7.f;
import u2.k0;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final int f15036e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f15037f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f15038g = 2;

    /* renamed from: a  reason: collision with root package name */
    public final String f15039a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f15040b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f15041c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f15042d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f15043a;

        /* renamed from: b  reason: collision with root package name */
        public final String f15044b;
        @k0.b

        /* renamed from: c  reason: collision with root package name */
        public final int f15045c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f15046d;

        /* renamed from: e  reason: collision with root package name */
        public final int f15047e;

        /* renamed from: f  reason: collision with root package name */
        public final String f15048f;

        /* renamed from: g  reason: collision with root package name */
        public final int f15049g;

        @Deprecated
        public a(String str, String str2, boolean z10, int i10) {
            this(str, str2, z10, i10, (String) null, 0);
        }

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            this.f15043a = str;
            this.f15044b = str2;
            this.f15046d = z10;
            this.f15047e = i10;
            this.f15045c = a(str2);
            this.f15048f = str3;
            this.f15049g = i11;
        }

        @k0.b
        public static int a(@o0 String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean b() {
            return this.f15047e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f15047e != aVar.f15047e || !this.f15043a.equals(aVar.f15043a) || this.f15046d != aVar.f15046d) {
                return false;
            }
            if (this.f15049g == 1 && aVar.f15049g == 2 && (str3 = this.f15048f) != null && !str3.equals(aVar.f15048f)) {
                return false;
            }
            if (this.f15049g == 2 && aVar.f15049g == 1 && (str2 = aVar.f15048f) != null && !str2.equals(this.f15048f)) {
                return false;
            }
            int i10 = this.f15049g;
            if (i10 == 0 || i10 != aVar.f15049g || ((str = this.f15048f) == null ? aVar.f15048f == null : str.equals(aVar.f15048f))) {
                return this.f15045c == aVar.f15045c;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f15043a.hashCode() * 31) + this.f15045c) * 31) + (this.f15046d ? 1231 : 1237)) * 31) + this.f15047e;
        }

        public String toString() {
            return "Column{name='" + this.f15043a + '\'' + ", type='" + this.f15044b + '\'' + ", affinity='" + this.f15045c + '\'' + ", notNull=" + this.f15046d + ", primaryKeyPosition=" + this.f15047e + ", defaultValue='" + this.f15048f + '\'' + '}';
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static final class b {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final String f15050a;
        @m0

        /* renamed from: b  reason: collision with root package name */
        public final String f15051b;
        @m0

        /* renamed from: c  reason: collision with root package name */
        public final String f15052c;
        @m0

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f15053d;
        @m0

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f15054e;

        public b(@m0 String str, @m0 String str2, @m0 String str3, @m0 List<String> list, @m0 List<String> list2) {
            this.f15050a = str;
            this.f15051b = str2;
            this.f15052c = str3;
            this.f15053d = Collections.unmodifiableList(list);
            this.f15054e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f15050a.equals(bVar.f15050a) && this.f15051b.equals(bVar.f15051b) && this.f15052c.equals(bVar.f15052c) && this.f15053d.equals(bVar.f15053d)) {
                return this.f15054e.equals(bVar.f15054e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f15050a.hashCode() * 31) + this.f15051b.hashCode()) * 31) + this.f15052c.hashCode()) * 31) + this.f15053d.hashCode()) * 31) + this.f15054e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f15050a + '\'' + ", onDelete='" + this.f15051b + '\'' + ", onUpdate='" + this.f15052c + '\'' + ", columnNames=" + this.f15053d + ", referenceColumnNames=" + this.f15054e + '}';
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static class c implements Comparable<c> {
        public final int O;
        public final int P;
        public final String Q;
        public final String R;

        public c(int i10, int i11, String str, String str2) {
            this.O = i10;
            this.P = i11;
            this.Q = str;
            this.R = str2;
        }

        /* renamed from: a */
        public int compareTo(@m0 c cVar) {
            int i10 = this.O - cVar.O;
            return i10 == 0 ? this.P - cVar.P : i10;
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static final class d {

        /* renamed from: d  reason: collision with root package name */
        public static final String f15055d = "index_";

        /* renamed from: a  reason: collision with root package name */
        public final String f15056a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f15057b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f15058c;

        public d(String str, boolean z10, List<String> list) {
            this.f15056a = str;
            this.f15057b = z10;
            this.f15058c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f15057b == dVar.f15057b && this.f15058c.equals(dVar.f15058c)) {
                return this.f15056a.startsWith(f15055d) ? dVar.f15056a.startsWith(f15055d) : this.f15056a.equals(dVar.f15056a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f15056a.startsWith(f15055d) ? -1184239155 : this.f15056a.hashCode()) * 31) + (this.f15057b ? 1 : 0)) * 31) + this.f15058c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f15056a + '\'' + ", unique=" + this.f15057b + ", columns=" + this.f15058c + '}';
        }
    }

    public h(String str, Map<String, a> map, Set<b> set) {
        this(str, map, set, Collections.emptySet());
    }

    public h(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.f15039a = str;
        this.f15040b = Collections.unmodifiableMap(map);
        this.f15041c = Collections.unmodifiableSet(set);
        this.f15042d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static h a(a3.c cVar, String str) {
        return new h(str, b(cVar, str), d(cVar, str), f(cVar, str));
    }

    public static Map<String, a> b(a3.c cVar, String str) {
        Cursor G0 = cVar.G0("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (G0.getColumnCount() > 0) {
                int columnIndex = G0.getColumnIndex("name");
                int columnIndex2 = G0.getColumnIndex("type");
                int columnIndex3 = G0.getColumnIndex("notnull");
                int columnIndex4 = G0.getColumnIndex("pk");
                int columnIndex5 = G0.getColumnIndex("dflt_value");
                while (G0.moveToNext()) {
                    String string = G0.getString(columnIndex);
                    hashMap.put(string, new a(string, G0.getString(columnIndex2), G0.getInt(columnIndex3) != 0, G0.getInt(columnIndex4), G0.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            G0.close();
        }
    }

    public static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex(w0.d.f14359d);
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static Set<b> d(a3.c cVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor G0 = cVar.G0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = G0.getColumnIndex("id");
            int columnIndex2 = G0.getColumnIndex("seq");
            int columnIndex3 = G0.getColumnIndex("table");
            int columnIndex4 = G0.getColumnIndex("on_delete");
            int columnIndex5 = G0.getColumnIndex("on_update");
            List<c> c10 = c(G0);
            int count = G0.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                G0.moveToPosition(i10);
                if (G0.getInt(columnIndex2) == 0) {
                    int i11 = G0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c next : c10) {
                        if (next.O == i11) {
                            arrayList.add(next.Q);
                            arrayList2.add(next.R);
                        }
                    }
                    hashSet.add(new b(G0.getString(columnIndex3), G0.getString(columnIndex4), G0.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            G0.close();
        }
    }

    @o0
    public static d e(a3.c cVar, String str, boolean z10) {
        Cursor G0 = cVar.G0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = G0.getColumnIndex("seqno");
            int columnIndex2 = G0.getColumnIndex("cid");
            int columnIndex3 = G0.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (G0.moveToNext()) {
                        if (G0.getInt(columnIndex2) >= 0) {
                            int i10 = G0.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i10), G0.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    d dVar = new d(str, z10, arrayList);
                    G0.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            G0.close();
        }
    }

    @o0
    public static Set<d> f(a3.c cVar, String str) {
        Cursor G0 = cVar.G0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = G0.getColumnIndex("name");
            int columnIndex2 = G0.getColumnIndex("origin");
            int columnIndex3 = G0.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (G0.moveToNext()) {
                        if (f.f11706q.equals(G0.getString(columnIndex2))) {
                            String string = G0.getString(columnIndex);
                            boolean z10 = true;
                            if (G0.getInt(columnIndex3) != 1) {
                                z10 = false;
                            }
                            d e10 = e(cVar, string, z10);
                            if (e10 == null) {
                                G0.close();
                                return null;
                            }
                            hashSet.add(e10);
                        }
                    }
                    G0.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            G0.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f15039a;
        if (str == null ? hVar.f15039a != null : !str.equals(hVar.f15039a)) {
            return false;
        }
        Map<String, a> map = this.f15040b;
        if (map == null ? hVar.f15040b != null : !map.equals(hVar.f15040b)) {
            return false;
        }
        Set<b> set2 = this.f15041c;
        if (set2 == null ? hVar.f15041c != null : !set2.equals(hVar.f15041c)) {
            return false;
        }
        Set<d> set3 = this.f15042d;
        if (set3 == null || (set = hVar.f15042d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f15039a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f15040b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f15041c;
        if (set != null) {
            i10 = set.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "TableInfo{name='" + this.f15039a + '\'' + ", columns=" + this.f15040b + ", foreignKeys=" + this.f15041c + ", indices=" + this.f15042d + '}';
    }
}
