package n0;

import android.graphics.Bitmap;
import d.m0;

public final class a {
    public static int a(@m0 Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    public static boolean b(@m0 Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    public static void c(@m0 Bitmap bitmap, boolean z10) {
        bitmap.setHasMipMap(z10);
    }
}
