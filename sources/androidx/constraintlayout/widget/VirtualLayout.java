package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.e;
import z.m;

public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1885a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f1886b0;

    public VirtualLayout(Context context) {
        super(context);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == e.m.ConstraintLayout_Layout_android_visibility) {
                    this.f1885a0 = true;
                } else if (index == e.m.ConstraintLayout_Layout_android_elevation) {
                    this.f1886b0 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f1885a0 || this.f1886b0) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.P; i10++) {
                View o10 = constraintLayout.o(this.O[i10]);
                if (o10 != null) {
                    if (this.f1885a0) {
                        o10.setVisibility(visibility);
                    }
                    if (this.f1886b0 && elevation > 0.0f) {
                        o10.setTranslationZ(o10.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        i();
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        i();
    }

    public void z(m mVar, int i10, int i11) {
    }
}
