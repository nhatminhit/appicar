package g3;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;

public class u {
    @o0
    public static q a(@m0 View view, @m0 ViewGroup viewGroup, @o0 Matrix matrix) {
        return Build.VERSION.SDK_INT == 28 ? s.b(view, viewGroup, matrix) : t.b(view, viewGroup, matrix);
    }

    public static void b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            s.f(view);
        } else {
            t.f(view);
        }
    }
}
