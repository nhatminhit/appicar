package eightbitlab.com.blurview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import d.l;
import d.m0;
import d.t0;
import eightbitlab.com.blurview.a;
import md.a;
import md.b;
import md.d;
import md.f;
import md.g;
import md.j;
import md.k;

public class BlurView extends FrameLayout {
    public static final String Q = BlurView.class.getSimpleName();
    public b O = new f();
    @l
    public int P;

    public BlurView(Context context) {
        super(context);
        a((AttributeSet) null, 0);
    }

    public BlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 0);
    }

    public BlurView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(attributeSet, i10);
    }

    @t0(api = 17)
    @m0
    private a getBlurAlgorithm() {
        return Build.VERSION.SDK_INT >= 31 ? new j() : new k(getContext());
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.b.BlurView, i10, 0);
        this.P = obtainStyledAttributes.getColor(a.b.BlurView_blurOverlayColor, 0);
        obtainStyledAttributes.recycle();
    }

    public d b(boolean z10) {
        return this.O.a(z10);
    }

    public d c(boolean z10) {
        return this.O.e(z10);
    }

    public d d(float f10) {
        return this.O.f(f10);
    }

    public void draw(Canvas canvas) {
        if (this.O.draw(canvas)) {
            super.draw(canvas);
        }
    }

    public d e(@l int i10) {
        this.P = i10;
        return this.O.b(i10);
    }

    @t0(api = 17)
    public d f(@m0 ViewGroup viewGroup) {
        this.O.destroy();
        g gVar = new g(this, viewGroup, this.P, getBlurAlgorithm());
        this.O = gVar;
        return gVar;
    }

    public d g(@m0 ViewGroup viewGroup, md.a aVar) {
        this.O.destroy();
        g gVar = new g(this, viewGroup, this.P, aVar);
        this.O = gVar;
        return gVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isHardwareAccelerated()) {
            this.O.a(true);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.O.a(false);
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.O.d();
    }
}
