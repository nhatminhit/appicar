package w9;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import d.c1;
import d.m0;
import d.o0;
import d.x0;

@x0({x0.a.LIBRARY_GROUP})
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final float f23969a = 1.3f;

    /* renamed from: b  reason: collision with root package name */
    public static final float f23970b = 2.0f;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = g.a.c(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(@d.m0 android.content.Context r1, @d.m0 android.content.res.TypedArray r2, @d.c1 int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = g.a.c(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.c.a(android.content.Context, android.content.res.TypedArray, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = g.a.c(r1, (r0 = r2.u(r3, 0)));
     */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(@d.m0 android.content.Context r1, @d.m0 androidx.appcompat.widget.w0 r2, @d.c1 int r3) {
        /*
            boolean r0 = r2.C(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.u(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = g.a.c(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.res.ColorStateList r1 = r2.d(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.c.b(android.content.Context, androidx.appcompat.widget.w0, int):android.content.res.ColorStateList");
    }

    public static int c(@m0 Context context, @m0 TypedArray typedArray, @c1 int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i10, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i10, i11);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i11);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = g.a.d(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable d(@d.m0 android.content.Context r1, @d.m0 android.content.res.TypedArray r2, @d.c1 int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = g.a.d(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.c.d(android.content.Context, android.content.res.TypedArray, int):android.graphics.drawable.Drawable");
    }

    @c1
    public static int e(@m0 TypedArray typedArray, @c1 int i10, @c1 int i11) {
        return typedArray.hasValue(i10) ? i10 : i11;
    }

    @o0
    public static d f(@m0 Context context, @m0 TypedArray typedArray, @c1 int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }

    public static boolean g(@m0 Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean h(@m0 Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
