package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import d.o0;

public final class zaaa extends Button {
    public zaaa(Context context, @o0 AttributeSet attributeSet) {
        super(context, (AttributeSet) null, 16842824);
    }

    public static final int b(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return i11;
        }
        if (i10 == 1) {
            return i12;
        }
        if (i10 == 2) {
            return i13;
        }
        throw new IllegalStateException("Unknown color scheme: " + i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.res.Resources r6, int r7, int r8) {
        /*
            r5 = this;
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r5.setTypeface(r0)
            r0 = 1096810496(0x41600000, float:14.0)
            r5.setTextSize(r0)
            android.util.DisplayMetrics r0 = r6.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1111490560(0x42400000, float:48.0)
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r5.setMinHeight(r0)
            r5.setMinWidth(r0)
            int r0 = c8.a.c.common_google_signin_btn_icon_dark
            int r1 = c8.a.c.common_google_signin_btn_icon_light
            int r0 = b(r8, r0, r1, r1)
            int r1 = c8.a.c.common_google_signin_btn_text_dark
            int r2 = c8.a.c.common_google_signin_btn_text_light
            int r1 = b(r8, r1, r2, r2)
            java.lang.String r2 = "Unknown button size: "
            r3 = 2
            r4 = 1
            if (r7 == 0) goto L_0x004d
            if (r7 == r4) goto L_0x004d
            if (r7 != r3) goto L_0x0038
            goto L_0x004e
        L_0x0038:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L_0x004d:
            r0 = r1
        L_0x004e:
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
            android.graphics.drawable.Drawable r0 = o0.d.r(r0)
            int r1 = c8.a.b.common_google_signin_btn_tint
            android.content.res.ColorStateList r1 = r6.getColorStateList(r1)
            o0.d.o(r0, r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            o0.d.p(r0, r1)
            r5.setBackgroundDrawable(r0)
            int r0 = c8.a.b.common_google_signin_btn_text_dark
            int r1 = c8.a.b.common_google_signin_btn_text_light
            int r8 = b(r8, r0, r1, r1)
            android.content.res.ColorStateList r8 = r6.getColorStateList(r8)
            java.lang.Object r8 = j8.s.l(r8)
            android.content.res.ColorStateList r8 = (android.content.res.ColorStateList) r8
            r5.setTextColor(r8)
            r8 = 0
            if (r7 == 0) goto L_0x009f
            if (r7 == r4) goto L_0x009c
            if (r7 != r3) goto L_0x0087
            r5.setText(r8)
            goto L_0x00a8
        L_0x0087:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L_0x009c:
            int r7 = c8.a.e.common_signin_button_text_long
            goto L_0x00a1
        L_0x009f:
            int r7 = c8.a.e.common_signin_button_text
        L_0x00a1:
            java.lang.String r6 = r6.getString(r7)
            r5.setText(r6)
        L_0x00a8:
            r5.setTransformationMethod(r8)
            android.content.Context r6 = r5.getContext()
            boolean r6 = w8.l.k(r6)
            if (r6 == 0) goto L_0x00ba
            r6 = 19
            r5.setGravity(r6)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zaaa.a(android.content.res.Resources, int, int):void");
    }
}
