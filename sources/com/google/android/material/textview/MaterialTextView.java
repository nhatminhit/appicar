package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import ca.a;
import d.c1;
import d.m0;
import d.o0;
import i9.a;
import w9.b;
import w9.c;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialTextView(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MaterialTextView(@m0 Context context, @o0 AttributeSet attributeSet, int i10, int i11) {
        super(a.c(context, attributeSet, i10, i11), attributeSet, i10);
        int j10;
        Context context2 = getContext();
        if (i(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (!l(context2, theme, attributeSet, i10, i11) && (j10 = j(theme, attributeSet, i10, i11)) != -1) {
                h(theme, j10);
            }
        }
    }

    public static boolean i(Context context) {
        return b.b(context, a.c.textAppearanceLineHeightEnabled, true);
    }

    public static int j(@m0 Resources.Theme theme, @o0 AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, a.o.MaterialTextView, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(a.o.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int k(@m0 Context context, @m0 TypedArray typedArray, @c1 @m0 int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            i10 = c.c(context, typedArray, iArr[i11], -1);
        }
        return i10;
    }

    public static boolean l(@m0 Context context, @m0 Resources.Theme theme, @o0 AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, a.o.MaterialTextView, i10, i11);
        int k10 = k(context, obtainStyledAttributes, a.o.MaterialTextView_android_lineHeight, a.o.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        return k10 != -1;
    }

    public final void h(@m0 Resources.Theme theme, int i10) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, a.o.MaterialTextAppearance);
        int k10 = k(getContext(), obtainStyledAttributes, a.o.MaterialTextAppearance_android_lineHeight, a.o.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (k10 >= 0) {
            setLineHeight(k10);
        }
    }

    public void setTextAppearance(@m0 Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (i(context)) {
            h(context.getTheme(), i10);
        }
    }
}
