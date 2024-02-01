package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.d;
import d.m0;
import d.o0;
import i9.a;

public class MaterialRadioButton extends AppCompatRadioButton {
    public static final int T = a.n.Widget_MaterialComponents_CompoundButton_RadioButton;
    public static final int[][] U = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @o0
    public ColorStateList R;
    public boolean S;

    public MaterialRadioButton(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialRadioButton(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.radioButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialRadioButton(@d.m0 android.content.Context r8, @d.o0 android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = T
            android.content.Context r8 = ca.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = i9.a.o.MaterialRadioButton
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r10 = i9.a.o.MaterialRadioButton_buttonTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = w9.c.a(r8, r9, r10)
            androidx.core.widget.d.d(r7, r8)
        L_0x0028:
            int r8 = i9.a.o.MaterialRadioButton_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.S = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.radiobutton.MaterialRadioButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.R == null) {
            int d10 = o9.a.d(this, a.c.colorControlActivated);
            int d11 = o9.a.d(this, a.c.colorOnSurface);
            int d12 = o9.a.d(this, a.c.colorSurface);
            int[][] iArr = U;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = o9.a.g(d12, d10, 1.0f);
            iArr2[1] = o9.a.g(d12, d11, 0.54f);
            iArr2[2] = o9.a.g(d12, d11, 0.38f);
            iArr2[3] = o9.a.g(d12, d11, 0.38f);
            this.R = new ColorStateList(iArr, iArr2);
        }
        return this.R;
    }

    public boolean a() {
        return this.S;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.S && d.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.S = z10;
        d.d(this, z10 ? getMaterialThemeColorsTintList() : null);
    }
}
