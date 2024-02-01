package o0;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import d.l;
import d.t0;
import fh.g;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\b¨\u0006\u0005"}, d2 = {"", "Landroid/graphics/drawable/ColorDrawable;", "a", "Landroid/graphics/Color;", "b", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class c {
    @g
    public static final ColorDrawable a(@l int i10) {
        return new ColorDrawable(i10);
    }

    @t0(26)
    @g
    public static final ColorDrawable b(@g Color color) {
        l0.p(color, "<this>");
        return new ColorDrawable(color.toArgb());
    }
}
