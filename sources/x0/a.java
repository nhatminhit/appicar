package x0;

import android.os.Build;
import d.k;
import d.m0;
import d.v0;
import d.x0;

public class a {

    @v0
    /* renamed from: x0.a$a  reason: collision with other inner class name */
    public @interface C0238a {
    }

    @k(api = 24)
    @Deprecated
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @k(api = 25)
    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @k(api = 26)
    @Deprecated
    public static boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @k(api = 27)
    @Deprecated
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @k(api = 28)
    @Deprecated
    public static boolean e() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @x0({x0.a.TESTS})
    public static boolean f(@m0 String str, @m0 String str2) {
        return !"REL".equals(str2) && str2.compareTo(str) >= 0;
    }

    @k(api = 29)
    @Deprecated
    public static boolean g() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @k(api = 30)
    @Deprecated
    public static boolean h() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @k(api = 31, codename = "S")
    public static boolean i() {
        return Build.VERSION.SDK_INT >= 31 || f(w1.a.L4, Build.VERSION.CODENAME);
    }

    @k(codename = "T")
    @C0238a
    public static boolean j() {
        return f(w1.a.X4, Build.VERSION.CODENAME);
    }
}
