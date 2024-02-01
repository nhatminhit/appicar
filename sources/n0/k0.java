package n0;

import android.graphics.Paint;
import android.graphics.Rect;
import d.m0;
import e1.j;

public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f10726a = "󟿽";

    /* renamed from: b  reason: collision with root package name */
    public static final String f10727b = "m";

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal<j<Rect, Rect>> f10728c = new ThreadLocal<>();

    public static boolean a(@m0 Paint paint, @m0 String str) {
        return paint.hasGlyph(str);
    }

    public static j<Rect, Rect> b() {
        ThreadLocal<j<Rect, Rect>> threadLocal = f10728c;
        j<Rect, Rect> jVar = threadLocal.get();
        if (jVar == null) {
            j<Rect, Rect> jVar2 = new j<>(new Rect(), new Rect());
            threadLocal.set(jVar2);
            return jVar2;
        }
        ((Rect) jVar.f6732a).setEmpty();
        ((Rect) jVar.f6733b).setEmpty();
        return jVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.graphics.BlendMode} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.graphics.Xfermode] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(@d.m0 android.graphics.Paint r4, @d.o0 n0.e r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 29
            if (r0 < r3) goto L_0x0012
            if (r5 == 0) goto L_0x000e
            android.graphics.BlendMode r2 = n0.f.a(r5)
        L_0x000e:
            r4.setBlendMode(r2)
            return r1
        L_0x0012:
            if (r5 == 0) goto L_0x0027
            android.graphics.PorterDuff$Mode r5 = n0.f.b(r5)
            if (r5 == 0) goto L_0x001f
            android.graphics.PorterDuffXfermode r2 = new android.graphics.PorterDuffXfermode
            r2.<init>(r5)
        L_0x001f:
            r4.setXfermode(r2)
            if (r5 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            return r1
        L_0x0027:
            r4.setXfermode(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.k0.c(android.graphics.Paint, n0.e):boolean");
    }
}
