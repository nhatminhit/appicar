package g3;

import android.view.View;
import android.view.WindowId;
import d.m0;
import d.t0;

@t0(18)
public class v1 implements w1 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f7891a;

    public v1(@m0 View view) {
        this.f7891a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof v1) && ((v1) obj).f7891a.equals(this.f7891a);
    }

    public int hashCode() {
        return this.f7891a.hashCode();
    }
}
