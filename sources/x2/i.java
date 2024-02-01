package x2;

import a3.c;
import android.database.Cursor;
import d.x0;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f15059a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15060b;

    public i(String str, String str2) {
        this.f15059a = str;
        this.f15060b = str2;
    }

    public static i a(c cVar, String str) {
        Cursor G0 = cVar.G0("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + str + "'");
        try {
            if (G0.moveToFirst()) {
                return new i(G0.getString(0), G0.getString(1));
            }
            i iVar = new i(str, (String) null);
            G0.close();
            return iVar;
        } finally {
            G0.close();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        String str = this.f15059a;
        if (str == null ? iVar.f15059a == null : str.equals(iVar.f15059a)) {
            String str2 = this.f15060b;
            String str3 = iVar.f15060b;
            if (str2 != null) {
                if (str2.equals(str3)) {
                    return true;
                }
            } else if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f15059a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f15060b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ViewInfo{name='" + this.f15059a + '\'' + ", sql='" + this.f15060b + '\'' + '}';
    }
}
