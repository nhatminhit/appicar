package k9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d.m0;

public class g<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public h f19992a;

    /* renamed from: b  reason: collision with root package name */
    public int f19993b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f19994c = 0;

    public g() {
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int G() {
        h hVar = this.f19992a;
        if (hVar != null) {
            return hVar.d();
        }
        return 0;
    }

    public int H() {
        h hVar = this.f19992a;
        if (hVar != null) {
            return hVar.e();
        }
        return 0;
    }

    public boolean I() {
        h hVar = this.f19992a;
        return hVar != null && hVar.f();
    }

    public boolean J() {
        h hVar = this.f19992a;
        return hVar != null && hVar.g();
    }

    public void K(@m0 CoordinatorLayout coordinatorLayout, @m0 V v10, int i10) {
        coordinatorLayout.N(v10, i10);
    }

    public void L(boolean z10) {
        h hVar = this.f19992a;
        if (hVar != null) {
            hVar.i(z10);
        }
    }

    public boolean M(int i10) {
        h hVar = this.f19992a;
        if (hVar != null) {
            return hVar.j(i10);
        }
        this.f19994c = i10;
        return false;
    }

    public boolean N(int i10) {
        h hVar = this.f19992a;
        if (hVar != null) {
            return hVar.k(i10);
        }
        this.f19993b = i10;
        return false;
    }

    public void O(boolean z10) {
        h hVar = this.f19992a;
        if (hVar != null) {
            hVar.l(z10);
        }
    }

    public boolean m(@m0 CoordinatorLayout coordinatorLayout, @m0 V v10, int i10) {
        K(coordinatorLayout, v10, i10);
        if (this.f19992a == null) {
            this.f19992a = new h(v10);
        }
        this.f19992a.h();
        this.f19992a.a();
        int i11 = this.f19993b;
        if (i11 != 0) {
            this.f19992a.k(i11);
            this.f19993b = 0;
        }
        int i12 = this.f19994c;
        if (i12 == 0) {
            return true;
        }
        this.f19992a.j(i12);
        this.f19994c = 0;
        return true;
    }
}
