package f1;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import b1.a;
import d.b0;
import d.m0;
import d.o0;
import d.t0;

public final class x2 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f7319a = 8;

    /* renamed from: b  reason: collision with root package name */
    public static final int f7320b = 9;

    /* renamed from: c  reason: collision with root package name */
    public static final int f7321c = 10;

    @t0(16)
    public static class a {
        public static void a(@m0 Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & -1793 : systemUiVisibility | a.b.f4057f);
        }
    }

    @t0(30)
    public static class b {
        public static r3 a(@m0 Window window) {
            WindowInsetsController a10 = window.getInsetsController();
            if (a10 != null) {
                return r3.l(a10);
            }
            return null;
        }

        public static void b(@m0 Window window, boolean z10) {
            window.setDecorFitsSystemWindows(z10);
        }
    }

    @o0
    public static r3 a(@m0 Window window, @m0 View view) {
        return Build.VERSION.SDK_INT >= 30 ? b.a(window) : new r3(window, view);
    }

    @m0
    public static <T extends View> T b(@m0 Window window, @b0 int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return window.requireViewById(i10);
        }
        T findViewById = window.findViewById(i10);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void c(@m0 Window window, boolean z10) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(window, z10);
        } else {
            a.a(window, z10);
        }
    }
}
