package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.S = false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        i();
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        i();
    }

    public void t(ConstraintLayout constraintLayout) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f1836n0.H1(0);
        bVar.f1836n0.d1(0);
    }
}
