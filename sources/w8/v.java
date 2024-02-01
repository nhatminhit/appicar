package w8;

import android.os.Build;
import d.k;
import e8.a;

@a
@d0
public final class v {
    @k(api = 11)
    @a
    public static boolean a() {
        return true;
    }

    @k(api = 12)
    @a
    public static boolean b() {
        return true;
    }

    @k(api = 14)
    @a
    public static boolean c() {
        return true;
    }

    @k(api = 15)
    @a
    public static boolean d() {
        return true;
    }

    @k(api = 16)
    @a
    public static boolean e() {
        return true;
    }

    @k(api = 17)
    @a
    public static boolean f() {
        return true;
    }

    @k(api = 18)
    @a
    public static boolean g() {
        return true;
    }

    @k(api = 19)
    @a
    public static boolean h() {
        return true;
    }

    @k(api = 20)
    @a
    public static boolean i() {
        return true;
    }

    @k(api = 21)
    @a
    public static boolean j() {
        return true;
    }

    @k(api = 22)
    @a
    public static boolean k() {
        return true;
    }

    @k(api = 23)
    @a
    public static boolean l() {
        return true;
    }

    @k(api = 24)
    @a
    public static boolean m() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @k(api = 26)
    @a
    public static boolean n() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @k(api = 28)
    @a
    public static boolean o() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @k(api = 29)
    @a
    public static boolean p() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @k(api = 30)
    @a
    public static boolean q() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @k(api = 31)
    @a
    public static boolean r() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @k(api = 32)
    @a
    public static boolean s() {
        return Build.VERSION.SDK_INT >= 32;
    }

    @k(api = 33)
    @a
    public static boolean t() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }

    @k(api = 33, codename = "UpsideDownCake")
    @a
    public static boolean u() {
        if (!t()) {
            return false;
        }
        return x0.a.isAtLeastU();
    }
}
