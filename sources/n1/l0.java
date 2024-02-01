package n1;

import android.view.ViewStub;
import androidx.databinding.d;
import androidx.databinding.d0;
import androidx.databinding.e0;
import androidx.databinding.g;
import androidx.databinding.h;
import d.x0;

@x0({x0.a.LIBRARY})
@d0({"android.view.ViewStub"})
@h({@g(attribute = "android:layout", method = "setLayoutResource", type = ViewStub.class)})
public class l0 {
    @d({"android:onInflate"})
    public static void a(e0 e0Var, ViewStub.OnInflateListener onInflateListener) {
        e0Var.l(onInflateListener);
    }
}
