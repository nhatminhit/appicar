package x2;

import a3.c;
import android.database.Cursor;
import d.g1;
import d.x0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f15031d = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    /* renamed from: a  reason: collision with root package name */
    public final String f15032a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<String> f15033b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<String> f15034c;

    public e(String str, Set<String> set, String str2) {
        this.f15032a = str;
        this.f15033b = set;
        this.f15034c = a(str2);
    }

    public e(String str, Set<String> set, Set<String> set2) {
        this.f15032a = str;
        this.f15033b = set;
        this.f15034c = set2;
    }

    @g1
    public static Set<String> a(String str) {
        if (str.isEmpty()) {
            return new HashSet();
        }
        String substring = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i10 = -1;
        for (int i11 = 0; i11 < substring.length(); i11++) {
            char charAt = substring.charAt(i11);
            if (!(charAt == '\"' || charAt == '\'')) {
                if (charAt != ',') {
                    if (charAt == '[') {
                        if (!arrayDeque.isEmpty()) {
                        }
                        arrayDeque.push(Character.valueOf(charAt));
                    } else if (charAt != ']') {
                        if (charAt != '`') {
                        }
                    } else if (!arrayDeque.isEmpty()) {
                        if (((Character) arrayDeque.peek()).charValue() != '[') {
                        }
                        arrayDeque.pop();
                    }
                } else if (arrayDeque.isEmpty()) {
                    arrayList.add(substring.substring(i10 + 1, i11).trim());
                    i10 = i11;
                }
            }
            if (!arrayDeque.isEmpty()) {
                if (((Character) arrayDeque.peek()).charValue() != charAt) {
                }
                arrayDeque.pop();
            }
            arrayDeque.push(Character.valueOf(charAt));
        }
        arrayList.add(substring.substring(i10 + 1).trim());
        HashSet hashSet = new HashSet();
        for (String str2 : arrayList) {
            for (String startsWith : f15031d) {
                if (str2.startsWith(startsWith)) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    public static e b(c cVar, String str) {
        return new e(str, c(cVar, str), d(cVar, str));
    }

    public static Set<String> c(c cVar, String str) {
        Cursor G0 = cVar.G0("PRAGMA table_info(`" + str + "`)");
        HashSet hashSet = new HashSet();
        try {
            if (G0.getColumnCount() > 0) {
                int columnIndex = G0.getColumnIndex("name");
                while (G0.moveToNext()) {
                    hashSet.add(G0.getString(columnIndex));
                }
            }
            return hashSet;
        } finally {
            G0.close();
        }
    }

    /* JADX INFO: finally extract failed */
    public static Set<String> d(c cVar, String str) {
        Cursor G0 = cVar.G0("SELECT * FROM sqlite_master WHERE `name` = '" + str + "'");
        try {
            String string = G0.moveToFirst() ? G0.getString(G0.getColumnIndexOrThrow("sql")) : "";
            G0.close();
            return a(string);
        } catch (Throwable th2) {
            G0.close();
            throw th2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.f15032a;
        if (str == null ? eVar.f15032a != null : !str.equals(eVar.f15032a)) {
            return false;
        }
        Set<String> set = this.f15033b;
        if (set == null ? eVar.f15033b != null : !set.equals(eVar.f15033b)) {
            return false;
        }
        Set<String> set2 = this.f15034c;
        Set<String> set3 = eVar.f15034c;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    public int hashCode() {
        String str = this.f15032a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Set<String> set = this.f15033b;
        int hashCode2 = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.f15034c;
        if (set2 != null) {
            i10 = set2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "FtsTableInfo{name='" + this.f15032a + '\'' + ", columns=" + this.f15033b + ", options=" + this.f15034c + '}';
    }
}
