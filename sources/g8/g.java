package g8;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import d.m0;
import e8.a;
import j8.s;

@a
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8212a;

    public g(@m0 Activity activity) {
        s.m(activity, "Activity must not be null");
        this.f8212a = activity;
    }

    @a
    public g(@m0 ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @m0
    public final Activity a() {
        return (Activity) this.f8212a;
    }

    @m0
    public final FragmentActivity b() {
        return (FragmentActivity) this.f8212a;
    }

    public final boolean c() {
        return this.f8212a instanceof Activity;
    }

    public final boolean d() {
        return this.f8212a instanceof FragmentActivity;
    }
}
