package com.google.android.exoplayer2.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import d.o0;
import h7.a;
import h7.b;
import h7.k;
import java.util.ArrayList;
import java.util.List;
import r7.j;
import w7.q0;

public final class SubtitleView extends View implements k {
    public static final float W = 0.0533f;

    /* renamed from: a0  reason: collision with root package name */
    public static final float f5524a0 = 0.08f;
    public final List<j> O;
    @o0
    public List<b> P;
    public int Q;
    public float R;
    public boolean S;
    public boolean T;
    public a U;
    public float V;

    public SubtitleView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SubtitleView(Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.O = new ArrayList();
        this.Q = 0;
        this.R = 0.0533f;
        this.S = true;
        this.T = true;
        this.U = a.f8876m;
        this.V = 0.08f;
    }

    @TargetApi(19)
    private float getUserCaptionFontScaleV19() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).getFontScale();
    }

    @TargetApi(19)
    private a getUserCaptionStyleV19() {
        return a.a(((CaptioningManager) getContext().getSystemService("captioning")).getUserStyle());
    }

    @TargetApi(19)
    public final boolean a() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).isEnabled();
    }

    public final float b(b bVar, int i10, int i11) {
        int i12 = bVar.f8894a0;
        if (i12 != Integer.MIN_VALUE) {
            float f10 = bVar.f8895b0;
            if (f10 != Float.MIN_VALUE) {
                return Math.max(c(i12, f10, i10, i11), 0.0f);
            }
        }
        return 0.0f;
    }

    public final float c(int i10, float f10, int i11, int i12) {
        float f11;
        if (i10 == 0) {
            f11 = (float) i12;
        } else if (i10 == 1) {
            f11 = (float) i11;
        } else if (i10 != 2) {
            return Float.MIN_VALUE;
        } else {
            return f10;
        }
        return f10 * f11;
    }

    public void d(int i10, float f10) {
        Context context = getContext();
        f(2, TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void dispatchDraw(Canvas canvas) {
        List<b> list = this.P;
        if (list != null && !list.isEmpty()) {
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int paddingBottom = height - getPaddingBottom();
            if (paddingBottom > paddingTop && width > paddingLeft) {
                int i10 = paddingBottom - paddingTop;
                float c10 = c(this.Q, this.R, height, i10);
                if (c10 > 0.0f) {
                    int size = list.size();
                    int i11 = 0;
                    while (i11 < size) {
                        b bVar = list.get(i11);
                        float b10 = b(bVar, height, i10);
                        int i12 = i11;
                        float f10 = b10;
                        int i13 = size;
                        int i14 = paddingBottom;
                        int i15 = width;
                        this.O.get(i11).b(bVar, this.S, this.T, this.U, c10, f10, this.V, canvas, paddingLeft, paddingTop, i15, i14);
                        i11 = i12 + 1;
                        size = i13;
                        i10 = i10;
                        paddingBottom = i14;
                        width = i15;
                        paddingTop = paddingTop;
                        paddingLeft = paddingLeft;
                    }
                }
            }
        }
    }

    public void e(float f10, boolean z10) {
        f(z10 ? 1 : 0, f10);
    }

    public final void f(int i10, float f10) {
        if (this.Q != i10 || this.R != f10) {
            this.Q = i10;
            this.R = f10;
            invalidate();
        }
    }

    public void g() {
        setStyle((q0.f14786a < 19 || !a() || isInEditMode()) ? a.f8876m : getUserCaptionStyleV19());
    }

    public void h() {
        setFractionalTextSize(((q0.f14786a < 19 || isInEditMode()) ? 1.0f : getUserCaptionFontScaleV19()) * 0.0533f);
    }

    public void j(List<b> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            invalidate();
        }
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        if (this.S != z10 || this.T != z10) {
            this.S = z10;
            this.T = z10;
            invalidate();
        }
    }

    public void setBottomPaddingFraction(float f10) {
        if (this.V != f10) {
            this.V = f10;
            invalidate();
        }
    }

    public void setCues(@o0 List<b> list) {
        if (this.P != list) {
            this.P = list;
            int size = list == null ? 0 : list.size();
            while (this.O.size() < size) {
                this.O.add(new j(getContext()));
            }
            invalidate();
        }
    }

    public void setFractionalTextSize(float f10) {
        e(f10, false);
    }

    public void setStyle(a aVar) {
        if (this.U != aVar) {
            this.U = aVar;
            invalidate();
        }
    }
}
