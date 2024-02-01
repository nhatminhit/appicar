package w4;

import com.google.android.material.badge.BadgeDrawable;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14613a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    /* renamed from: b  reason: collision with root package name */
    public static final a f14614b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f14615c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f14616d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f14617e;

    static {
        a aVar = new a("MIME", f14613a, true, '=', 76);
        f14614b = aVar;
        f14615c = new a(aVar, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        f14616d = new a(aVar, "PEM", true, '=', 64);
        StringBuilder sb2 = new StringBuilder(f14613a);
        sb2.setCharAt(sb2.indexOf(BadgeDrawable.f16655n0), '-');
        sb2.setCharAt(sb2.indexOf("/"), '_');
        f14617e = new a("MODIFIED-FOR-URL", sb2.toString(), false, 0, Integer.MAX_VALUE);
    }

    public static a a() {
        return f14615c;
    }

    public static a b(String str) throws IllegalArgumentException {
        String str2;
        a aVar = f14614b;
        if (aVar.R.equals(str)) {
            return aVar;
        }
        a aVar2 = f14615c;
        if (aVar2.R.equals(str)) {
            return aVar2;
        }
        a aVar3 = f14616d;
        if (aVar3.R.equals(str)) {
            return aVar3;
        }
        a aVar4 = f14617e;
        if (aVar4.R.equals(str)) {
            return aVar4;
        }
        if (str == null) {
            str2 = "<null>";
        } else {
            str2 = "'" + str + "'";
        }
        throw new IllegalArgumentException("No Base64Variant with name " + str2);
    }
}
