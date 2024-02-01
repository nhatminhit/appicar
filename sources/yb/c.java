package yb;

import android.graphics.Bitmap;
import java.util.Map;
import qa.a;
import qa.g;
import qa.l;
import qa.w;
import ya.b;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f24697a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f24698b = -16777216;

    public Bitmap a(b bVar) {
        int s10 = bVar.s();
        int n10 = bVar.n();
        int[] iArr = new int[(s10 * n10)];
        for (int i10 = 0; i10 < n10; i10++) {
            int i11 = i10 * s10;
            for (int i12 = 0; i12 < s10; i12++) {
                iArr[i11 + i12] = bVar.j(i12, i10) ? -16777216 : -1;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(s10, n10, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, s10, 0, 0, s10, n10);
        return createBitmap;
    }

    public b b(String str, a aVar, int i10, int i11) throws w {
        try {
            return new l().a(str, aVar, i10, i11);
        } catch (w e10) {
            throw e10;
        } catch (Exception e11) {
            throw new w((Throwable) e11);
        }
    }

    public b c(String str, a aVar, int i10, int i11, Map<g, ?> map) throws w {
        try {
            return new l().b(str, aVar, i10, i11, map);
        } catch (w e10) {
            throw e10;
        } catch (Exception e11) {
            throw new w((Throwable) e11);
        }
    }

    public Bitmap d(String str, a aVar, int i10, int i11) throws w {
        return a(b(str, aVar, i10, i11));
    }

    public Bitmap e(String str, a aVar, int i10, int i11, Map<g, ?> map) throws w {
        return a(c(str, aVar, i10, i11, map));
    }
}
