package e1;

import android.util.Size;
import android.util.SizeF;
import d.t0;
import fh.g;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\n\u001a\r\u0010\u0007\u001a\u00020\u0005*\u00020\u0004H\n¨\u0006\b"}, d2 = {"Landroid/util/Size;", "", "b", "d", "Landroid/util/SizeF;", "", "a", "c", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class q {
    @t0(21)
    public static final float a(@g SizeF sizeF) {
        l0.p(sizeF, "<this>");
        return sizeF.getWidth();
    }

    @t0(21)
    public static final int b(@g Size size) {
        l0.p(size, "<this>");
        return size.getWidth();
    }

    @t0(21)
    public static final float c(@g SizeF sizeF) {
        l0.p(sizeF, "<this>");
        return sizeF.getHeight();
    }

    @t0(21)
    public static final int d(@g Size size) {
        l0.p(size, "<this>");
        return size.getHeight();
    }
}
