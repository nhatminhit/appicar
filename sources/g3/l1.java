package g3;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import d.m0;
import d.o0;
import d.t0;

@t0(21)
public class l1 extends h1 {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f7805i = true;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f7806j = true;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f7807k = true;

    @SuppressLint({"NewApi"})
    public void e(@m0 View view, @o0 Matrix matrix) {
        if (f7805i) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f7805i = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void i(@m0 View view, @m0 Matrix matrix) {
        if (f7806j) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f7806j = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void j(@m0 View view, @m0 Matrix matrix) {
        if (f7807k) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f7807k = false;
            }
        }
    }
}
