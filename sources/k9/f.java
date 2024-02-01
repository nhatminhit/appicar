package k9;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.badge.BadgeDrawable;
import d.m0;
import d.o0;
import f1.e3;
import f1.j;
import f1.w1;
import java.util.List;
import v0.a;

public abstract class f extends g<View> {

    /* renamed from: d  reason: collision with root package name */
    public final Rect f19988d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f19989e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public int f19990f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f19991g;

    public f() {
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int V(int i10) {
        return i10 == 0 ? BadgeDrawable.f16647f0 : i10;
    }

    public void K(@m0 CoordinatorLayout coordinatorLayout, @m0 View view, int i10) {
        int i11;
        View P = P(coordinatorLayout.w(view));
        if (P != null) {
            CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
            Rect rect = this.f19988d;
            rect.set(coordinatorLayout.getPaddingLeft() + gVar.leftMargin, P.getBottom() + gVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - gVar.rightMargin, ((coordinatorLayout.getHeight() + P.getBottom()) - coordinatorLayout.getPaddingBottom()) - gVar.bottomMargin);
            e3 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && w1.S(coordinatorLayout) && !w1.S(view)) {
                rect.left += lastWindowInsets.p();
                rect.right -= lastWindowInsets.q();
            }
            Rect rect2 = this.f19989e;
            j.b(V(gVar.f2154c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int Q = Q(P);
            view.layout(rect2.left, rect2.top - Q, rect2.right, rect2.bottom - Q);
            i11 = rect2.top - P.getBottom();
        } else {
            super.K(coordinatorLayout, view, i10);
            i11 = 0;
        }
        this.f19990f = i11;
    }

    @o0
    public abstract View P(List<View> list);

    public final int Q(View view) {
        if (this.f19991g == 0) {
            return 0;
        }
        float R = R(view);
        int i10 = this.f19991g;
        return a.c((int) (R * ((float) i10)), 0, i10);
    }

    public float R(View view) {
        return 1.0f;
    }

    public final int S() {
        return this.f19991g;
    }

    public int T(@m0 View view) {
        return view.getMeasuredHeight();
    }

    public final int U() {
        return this.f19990f;
    }

    public final void W(int i10) {
        this.f19991g = i10;
    }

    public boolean X() {
        return false;
    }

    public boolean n(@m0 CoordinatorLayout coordinatorLayout, @m0 View view, int i10, int i11, int i12, int i13) {
        View P;
        e3 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (P = P(coordinatorLayout.w(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (w1.S(P) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.r() + lastWindowInsets.o();
        }
        int T = size + T(P);
        int measuredHeight = P.getMeasuredHeight();
        if (X()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            T -= measuredHeight;
        }
        coordinatorLayout.O(view, i10, i11, View.MeasureSpec.makeMeasureSpec(T, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }
}
