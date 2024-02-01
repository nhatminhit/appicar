package o0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d.r0;
import fh.g;
import fh.h;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a2\u0010\r\u001a\u00020\f*\u00020\u00002\b\b\u0003\u0010\b\u001a\u00020\u00012\b\b\u0003\u0010\t\u001a\u00020\u00012\b\b\u0003\u0010\n\u001a\u00020\u00012\b\b\u0003\u0010\u000b\u001a\u00020\u0001¨\u0006\u000e"}, d2 = {"Landroid/graphics/drawable/Drawable;", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "a", "left", "top", "right", "bottom", "Lzd/u2;", "c", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class e {
    @g
    public static final Bitmap a(@g Drawable drawable, @r0 int i10, @r0 int i11, @h Bitmap.Config config) {
        l0.p(drawable, "<this>");
        if (!(drawable instanceof BitmapDrawable) || !(config == null || ((BitmapDrawable) drawable).getBitmap().getConfig() == config)) {
            Rect bounds = drawable.getBounds();
            l0.o(bounds, "bounds");
            int i12 = bounds.left;
            int i13 = bounds.top;
            int i14 = bounds.right;
            int i15 = bounds.bottom;
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, config);
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(new Canvas(createBitmap));
            drawable.setBounds(i12, i13, i14, i15);
            l0.o(createBitmap, "bitmap");
            return createBitmap;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        if (i10 == bitmapDrawable.getIntrinsicWidth() && i11 == bitmapDrawable.getIntrinsicHeight()) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            l0.o(bitmap, "bitmap");
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i10, i11, true);
        l0.o(createScaledBitmap, "createScaledBitmap(bitmap, width, height, true)");
        return createScaledBitmap;
    }

    public static /* synthetic */ Bitmap b(Drawable drawable, int i10, int i11, Bitmap.Config config, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = drawable.getIntrinsicWidth();
        }
        if ((i12 & 2) != 0) {
            i11 = drawable.getIntrinsicHeight();
        }
        if ((i12 & 4) != 0) {
            config = null;
        }
        return a(drawable, i10, i11, config);
    }

    public static final void c(@g Drawable drawable, @r0 int i10, @r0 int i11, @r0 int i12, @r0 int i13) {
        l0.p(drawable, "<this>");
        drawable.setBounds(i10, i11, i12, i13);
    }

    public static /* synthetic */ void d(Drawable drawable, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = drawable.getBounds().left;
        }
        if ((i14 & 2) != 0) {
            i11 = drawable.getBounds().top;
        }
        if ((i14 & 4) != 0) {
            i12 = drawable.getBounds().right;
        }
        if ((i14 & 8) != 0) {
            i13 = drawable.getBounds().bottom;
        }
        c(drawable, i10, i11, i12, i13);
    }
}
