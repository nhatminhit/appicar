package g3;

import android.graphics.Matrix;
import android.view.View;
import d.m0;
import d.o0;
import d.t0;

@t0(29)
public class q1 extends p1 {
    public float c(@m0 View view) {
        return view.getTransitionAlpha();
    }

    public void e(@m0 View view, @o0 Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    public void f(@m0 View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    public void g(@m0 View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    public void h(@m0 View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    public void i(@m0 View view, @m0 Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public void j(@m0 View view, @m0 Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
