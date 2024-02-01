package s9;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d.b0;
import d.m0;

public final class c {
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final View f22866a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22867b = false;
    @b0

    /* renamed from: c  reason: collision with root package name */
    public int f22868c = 0;

    public c(b bVar) {
        this.f22866a = (View) bVar;
    }

    public final void a() {
        ViewParent parent = this.f22866a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).k(this.f22866a);
        }
    }

    @b0
    public int b() {
        return this.f22868c;
    }

    public boolean c() {
        return this.f22867b;
    }

    public void d(@m0 Bundle bundle) {
        this.f22867b = bundle.getBoolean("expanded", false);
        this.f22868c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f22867b) {
            a();
        }
    }

    @m0
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f22867b);
        bundle.putInt("expandedComponentIdHint", this.f22868c);
        return bundle;
    }

    public boolean f(boolean z10) {
        if (this.f22867b == z10) {
            return false;
        }
        this.f22867b = z10;
        a();
        return true;
    }

    public void g(@b0 int i10) {
        this.f22868c = i10;
    }
}
