package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import d.m0;
import d.o0;
import d.t0;
import f1.e3;
import f1.w1;
import java.util.ArrayList;
import x1.a;

public final class FragmentContainerView extends FrameLayout {
    public ArrayList<View> O;
    public ArrayList<View> P;
    public View.OnApplyWindowInsetsListener Q;
    public boolean R;

    public FragmentContainerView(@m0 Context context) {
        super(context);
        this.R = true;
    }

    public FragmentContainerView(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        String str;
        this.R = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.l.FragmentContainerView);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(a.l.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
            }
        }
    }

    public FragmentContainerView(@m0 Context context, @m0 AttributeSet attributeSet, @m0 FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        this.R = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.l.FragmentContainerView);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(a.l.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(a.l.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment p02 = fragmentManager.p0(id2);
        if (classAttribute != null && p02 == null) {
            if (id2 <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a10 = fragmentManager.E0().a(context.getClassLoader(), classAttribute);
            a10.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.r().M(true).f(this, a10, string).p();
        }
        fragmentManager.i1(this);
    }

    public final void a(@m0 View view) {
        ArrayList<View> arrayList = this.P;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.O == null) {
                this.O = new ArrayList<>();
            }
            this.O.add(view);
        }
    }

    public void addView(@m0 View view, int i10, @o0 ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.N0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public boolean addViewInLayout(@m0 View view, int i10, @o0 ViewGroup.LayoutParams layoutParams, boolean z10) {
        if (FragmentManager.N0(view) != null) {
            return super.addViewInLayout(view, i10, layoutParams, z10);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @t0(20)
    @m0
    public WindowInsets dispatchApplyWindowInsets(@m0 WindowInsets windowInsets) {
        e3 K = e3.K(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.Q;
        e3 K2 = onApplyWindowInsetsListener != null ? e3.K(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : w1.e1(this, K);
        if (!K2.A()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                w1.o(getChildAt(i10), K2);
            }
        }
        return windowInsets;
    }

    public void dispatchDraw(@m0 Canvas canvas) {
        if (this.R && this.O != null) {
            for (int i10 = 0; i10 < this.O.size(); i10++) {
                super.drawChild(canvas, this.O.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(@m0 Canvas canvas, @m0 View view, long j10) {
        ArrayList<View> arrayList;
        if (!this.R || (arrayList = this.O) == null || arrayList.size() <= 0 || !this.O.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    public void endViewTransition(@m0 View view) {
        ArrayList<View> arrayList = this.P;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.O;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.R = true;
            }
        }
        super.endViewTransition(view);
    }

    @t0(20)
    @m0
    public WindowInsets onApplyWindowInsets(@m0 WindowInsets windowInsets) {
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    public void removeDetachedView(@m0 View view, boolean z10) {
        if (z10) {
            a(view);
        }
        super.removeDetachedView(view, z10);
    }

    public void removeView(@m0 View view) {
        a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i10) {
        a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    public void removeViewInLayout(@m0 View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    public void setDrawDisappearingViewsLast(boolean z10) {
        this.R = z10;
    }

    public void setLayoutTransition(@o0 LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(@m0 View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.Q = onApplyWindowInsetsListener;
    }

    public void startViewTransition(@m0 View view) {
        if (view.getParent() == this) {
            if (this.P == null) {
                this.P = new ArrayList<>();
            }
            this.P.add(view);
        }
        super.startViewTransition(view);
    }
}
