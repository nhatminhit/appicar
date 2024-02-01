package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import d.l;
import d.m0;
import d.o0;
import d.r0;
import s.a;
import t.b;
import t.d;
import t.e;

public class CardView extends FrameLayout {
    public static final int[] V = {16842801};
    public static final e W;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public final Rect S;
    public final Rect T;
    public final d U;

    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f1513a;

        public a() {
        }

        public void a(int i10, int i11, int i12, int i13) {
            CardView.this.T.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.S;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        public void b(int i10, int i11) {
            CardView cardView = CardView.this;
            if (i10 > cardView.Q) {
                CardView.super.setMinimumWidth(i10);
            }
            CardView cardView2 = CardView.this;
            if (i11 > cardView2.R) {
                CardView.super.setMinimumHeight(i11);
            }
        }

        public void c(Drawable drawable) {
            this.f1513a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        public boolean d() {
            return CardView.this.getPreventCornerOverlap();
        }

        public boolean e() {
            return CardView.this.getUseCompatPadding();
        }

        public Drawable f() {
            return this.f1513a;
        }

        public View g() {
            return CardView.this;
        }
    }

    static {
        b bVar = new b();
        W = bVar;
        bVar.k();
    }

    public CardView(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public CardView(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C0208a.cardViewStyle);
    }

    public CardView(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources;
        int i11;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.S = rect;
        this.T = new Rect();
        a aVar = new a();
        this.U = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.e.CardView, i10, a.d.CardView);
        int i12 = a.e.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i12)) {
            valueOf = obtainStyledAttributes.getColorStateList(i12);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(V);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i11 = a.b.cardview_light_background;
            } else {
                resources = getResources();
                i11 = a.b.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i11));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(a.e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(a.e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(a.e.CardView_cardMaxElevation, 0.0f);
        this.O = obtainStyledAttributes.getBoolean(a.e.CardView_cardUseCompatPadding, false);
        this.P = obtainStyledAttributes.getBoolean(a.e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.e.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(a.e.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(a.e.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(a.e.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(a.e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.Q = obtainStyledAttributes.getDimensionPixelSize(a.e.CardView_android_minWidth, 0);
        this.R = obtainStyledAttributes.getDimensionPixelSize(a.e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        W.h(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    @m0
    public ColorStateList getCardBackgroundColor() {
        return W.m(this.U);
    }

    public float getCardElevation() {
        return W.d(this.U);
    }

    @r0
    public int getContentPaddingBottom() {
        return this.S.bottom;
    }

    @r0
    public int getContentPaddingLeft() {
        return this.S.left;
    }

    @r0
    public int getContentPaddingRight() {
        return this.S.right;
    }

    @r0
    public int getContentPaddingTop() {
        return this.S.top;
    }

    public float getMaxCardElevation() {
        return W.g(this.U);
    }

    public boolean getPreventCornerOverlap() {
        return this.P;
    }

    public float getRadius() {
        return W.j(this.U);
    }

    public boolean getUseCompatPadding() {
        return this.O;
    }

    public void h(@r0 int i10, @r0 int i11, @r0 int i12, @r0 int i13) {
        this.S.set(i10, i11, i12, i13);
        W.n(this.U);
    }

    public void onMeasure(int i10, int i11) {
        e eVar = W;
        if (!(eVar instanceof b)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.i(this.U)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.b(this.U)), View.MeasureSpec.getSize(i11)), mode2);
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(@l int i10) {
        W.c(this.U, ColorStateList.valueOf(i10));
    }

    public void setCardBackgroundColor(@o0 ColorStateList colorStateList) {
        W.c(this.U, colorStateList);
    }

    public void setCardElevation(float f10) {
        W.l(this.U, f10);
    }

    public void setMaxCardElevation(float f10) {
        W.a(this.U, f10);
    }

    public void setMinimumHeight(int i10) {
        this.R = i10;
        super.setMinimumHeight(i10);
    }

    public void setMinimumWidth(int i10) {
        this.Q = i10;
        super.setMinimumWidth(i10);
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.P) {
            this.P = z10;
            W.e(this.U);
        }
    }

    public void setRadius(float f10) {
        W.f(this.U, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            W.o(this.U);
        }
    }
}
