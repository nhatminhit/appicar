package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.d;
import d.o0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class AspectRatioFrameLayout extends FrameLayout {
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 2;
    public static final int V = 3;
    public static final int W = 4;

    /* renamed from: a0  reason: collision with root package name */
    public static final float f5446a0 = 0.01f;
    public final c O;
    @o0
    public b P;
    public float Q;
    public int R;

    public interface b {
        void a(float f10, float f11, boolean z10);
    }

    public final class c implements Runnable {
        public float O;
        public float P;
        public boolean Q;
        public boolean R;

        public c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.O = f10;
            this.P = f11;
            this.Q = z10;
            if (!this.R) {
                this.R = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        public void run() {
            this.R = false;
            if (AspectRatioFrameLayout.this.P != null) {
                AspectRatioFrameLayout.this.P.a(this.O, this.P, this.Q);
            }
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AspectRatioFrameLayout(Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d.j.AspectRatioFrameLayout, 0, 0);
            try {
                this.R = obtainStyledAttributes.getInt(d.j.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.O = new c();
    }

    public int getResizeMode() {
        return this.R;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r4 > 0.0f) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r4 > 0.0f) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.Q
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto L_0x000b
            return
        L_0x000b:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.Q
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x0031
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r9 = r8.O
            float r10 = r8.Q
            r0 = 0
            r9.a(r10, r3, r0)
            return
        L_0x0031:
            int r5 = r8.R
            r6 = 1
            if (r5 == 0) goto L_0x004d
            if (r5 == r6) goto L_0x0048
            r7 = 2
            if (r5 == r7) goto L_0x0043
            r7 = 4
            if (r5 == r7) goto L_0x003f
            goto L_0x0052
        L_0x003f:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0048
        L_0x0043:
            float r9 = r8.Q
            float r2 = r2 * r9
            int r9 = (int) r2
            goto L_0x0052
        L_0x0048:
            float r10 = r8.Q
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L_0x0052
        L_0x004d:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0043
            goto L_0x0048
        L_0x0052:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r10 = r8.O
            float r1 = r8.Q
            r10.a(r1, r3, r6)
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@o0 b bVar) {
        this.P = bVar;
    }

    public void setResizeMode(int i10) {
        if (this.R != i10) {
            this.R = i10;
            requestLayout();
        }
    }
}
