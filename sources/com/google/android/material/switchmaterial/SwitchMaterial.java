package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.internal.v;
import d.m0;
import d.o0;
import i9.a;

public class SwitchMaterial extends SwitchCompat {
    public static final int S0 = a.n.Widget_MaterialComponents_CompoundButton_Switch;
    public static final int[][] T0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @m0
    public final r9.a O0;
    @o0
    public ColorStateList P0;
    @o0
    public ColorStateList Q0;
    public boolean R0;

    public SwitchMaterial(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public SwitchMaterial(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.switchStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchMaterial(@d.m0 android.content.Context r7, @d.o0 android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = S0
            android.content.Context r7 = ca.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            r9.a r7 = new r9.a
            r7.<init>(r0)
            r6.O0 = r7
            int[] r2 = i9.a.o.SwitchMaterial
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r9 = i9.a.o.SwitchMaterial_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r9, r7)
            r6.R0 = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.P0 == null) {
            int d10 = o9.a.d(this, a.c.colorSurface);
            int d11 = o9.a.d(this, a.c.colorControlActivated);
            float dimension = getResources().getDimension(a.f.mtrl_switch_thumb_elevation);
            if (this.O0.l()) {
                dimension += v.i(this);
            }
            int e10 = this.O0.e(d10, dimension);
            int[][] iArr = T0;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = o9.a.g(d10, d11, 1.0f);
            iArr2[1] = e10;
            iArr2[2] = o9.a.g(d10, d11, 0.38f);
            iArr2[3] = e10;
            this.P0 = new ColorStateList(iArr, iArr2);
        }
        return this.P0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.Q0 == null) {
            int[][] iArr = T0;
            int[] iArr2 = new int[iArr.length];
            int d10 = o9.a.d(this, a.c.colorSurface);
            int d11 = o9.a.d(this, a.c.colorControlActivated);
            int d12 = o9.a.d(this, a.c.colorOnSurface);
            iArr2[0] = o9.a.g(d10, d11, 0.54f);
            iArr2[1] = o9.a.g(d10, d12, 0.32f);
            iArr2[2] = o9.a.g(d10, d11, 0.12f);
            iArr2[3] = o9.a.g(d10, d12, 0.12f);
            this.Q0 = new ColorStateList(iArr, iArr2);
        }
        return this.Q0;
    }

    public boolean o() {
        return this.R0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.R0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.R0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        ColorStateList colorStateList;
        this.R0 = z10;
        if (z10) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            colorStateList = getMaterialThemeColorsTrackTintList();
        } else {
            colorStateList = null;
            setThumbTintList((ColorStateList) null);
        }
        setTrackTintList(colorStateList);
    }
}
