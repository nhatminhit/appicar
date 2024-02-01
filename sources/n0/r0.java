package n0;

import android.graphics.Canvas;
import android.graphics.Picture;
import fh.g;
import kotlin.Metadata;
import we.l;
import xe.i0;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\n"}, d2 = {"Landroid/graphics/Picture;", "", "width", "height", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Lzd/u2;", "Lzd/u;", "block", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class r0 {
    @g
    public static final Picture a(@g Picture picture, int i10, int i11, @g l<? super Canvas, u2> lVar) {
        l0.p(picture, "<this>");
        l0.p(lVar, "block");
        Canvas beginRecording = picture.beginRecording(i10, i11);
        l0.o(beginRecording, "beginRecording(width, height)");
        try {
            lVar.A(beginRecording);
            return picture;
        } finally {
            i0.d(1);
            picture.endRecording();
            i0.c(1);
        }
    }
}
