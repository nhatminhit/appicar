package x3;

import android.net.Uri;
import t7.t;
import w7.s;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f15061a = 512;

    /* renamed from: b  reason: collision with root package name */
    public static final int f15062b = 384;

    public static boolean a(Uri uri) {
        return b(uri) && !e(uri);
    }

    public static boolean b(Uri uri) {
        return uri != null && t.f13205o.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean c(Uri uri) {
        return b(uri) && e(uri);
    }

    public static boolean d(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    public static boolean e(Uri uri) {
        return uri.getPathSegments().contains(s.f14799a);
    }
}
