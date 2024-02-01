package t2;

import android.view.MotionEvent;
import d.m0;
import d.o0;
import e1.n;
import java.util.Arrays;
import java.util.List;

public final class i0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final List<T> f12840a = Arrays.asList(new Object[]{null, null, null, null, null});

    /* renamed from: b  reason: collision with root package name */
    public final T f12841b;

    public i0(@m0 T t10) {
        boolean z10 = false;
        n.a(t10 != null ? true : z10);
        this.f12841b = t10;
    }

    public T a(@m0 MotionEvent motionEvent) {
        T t10 = this.f12840a.get(motionEvent.getToolType(0));
        return t10 != null ? t10 : this.f12841b;
    }

    public void b(int i10, @o0 T t10) {
        boolean z10 = true;
        n.a(i10 >= 0 && i10 <= 4);
        if (this.f12840a.get(i10) != null) {
            z10 = false;
        }
        n.i(z10);
        this.f12840a.set(i10, t10);
    }
}
