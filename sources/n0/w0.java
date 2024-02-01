package n0;

import android.graphics.Matrix;
import android.graphics.Shader;
import fh.g;
import kotlin.Metadata;
import we.l;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0007"}, d2 = {"Landroid/graphics/Shader;", "Lkotlin/Function1;", "Landroid/graphics/Matrix;", "Lzd/u2;", "Lzd/u;", "block", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class w0 {
    public static final void a(@g Shader shader, @g l<? super Matrix, u2> lVar) {
        l0.p(shader, "<this>");
        l0.p(lVar, "block");
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        lVar.A(matrix);
        shader.setLocalMatrix(matrix);
    }
}
