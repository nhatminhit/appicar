package n0;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import fh.g;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\b¨\u0006\u0007"}, d2 = {"Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/PorterDuffXfermode;", "b", "", "color", "Landroid/graphics/PorterDuffColorFilter;", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class t0 {
    @g
    public static final PorterDuffColorFilter a(@g PorterDuff.Mode mode, int i10) {
        l0.p(mode, "<this>");
        return new PorterDuffColorFilter(i10, mode);
    }

    @g
    public static final PorterDuffXfermode b(@g PorterDuff.Mode mode) {
        l0.p(mode, "<this>");
        return new PorterDuffXfermode(mode);
    }
}
