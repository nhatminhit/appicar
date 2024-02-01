package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import d.m0;
import d.r0;
import e1.n;

public final class e implements ViewPager2.m {

    /* renamed from: a  reason: collision with root package name */
    public final int f4008a;

    public e(@r0 int i10) {
        n.e(i10, "Margin must be non-negative");
        this.f4008a = i10;
    }

    public void a(@m0 View view, float f10) {
        ViewPager2 b10 = b(view);
        float f11 = ((float) this.f4008a) * f10;
        if (b10.getOrientation() == 0) {
            if (b10.k()) {
                f11 = -f11;
            }
            view.setTranslationX(f11);
            return;
        }
        view.setTranslationY(f11);
    }

    public final ViewPager2 b(@m0 View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
}
