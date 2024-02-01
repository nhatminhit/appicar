package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import d.m0;
import d.o0;
import d.x0;
import f.a;
import java.lang.ref.WeakReference;

@x0({x0.a.Q})
public final class ViewStubCompat extends View {
    public int O;
    public int P;
    public WeakReference<View> Q;
    public LayoutInflater R;
    public a S;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.O = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.ViewStubCompat, i10, 0);
        this.P = obtainStyledAttributes.getResourceId(a.n.ViewStubCompat_android_inflatedId, -1);
        this.O = obtainStyledAttributes.getResourceId(a.n.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(a.n.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.O != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.R;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.O, viewGroup, false);
            int i10 = this.P;
            if (i10 != -1) {
                inflate.setId(i10);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.Q = new WeakReference<>(inflate);
            a aVar = this.S;
            if (aVar != null) {
                aVar.a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.P;
    }

    public LayoutInflater getLayoutInflater() {
        return this.R;
    }

    public int getLayoutResource() {
        return this.O;
    }

    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.P = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.R = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.O = i10;
    }

    public void setOnInflateListener(a aVar) {
        this.S = aVar;
    }

    public void setVisibility(int i10) {
        WeakReference<View> weakReference = this.Q;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i10);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            a();
        }
    }
}
