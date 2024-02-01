package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import d.c1;
import d.o0;
import d.t0;
import d.x0;
import k0.g;

@x0({x0.a.Q})
public class w0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1486a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f1487b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f1488c;

    public w0(Context context, TypedArray typedArray) {
        this.f1486a = context;
        this.f1487b = typedArray;
    }

    public static w0 E(Context context, int i10, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static w0 F(Context context, AttributeSet attributeSet, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static w0 G(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean A(int i10, TypedValue typedValue) {
        return this.f1487b.getValue(i10, typedValue);
    }

    public TypedArray B() {
        return this.f1487b;
    }

    public boolean C(int i10) {
        return this.f1487b.hasValue(i10);
    }

    public int D() {
        return this.f1487b.length();
    }

    public TypedValue H(int i10) {
        return this.f1487b.peekValue(i10);
    }

    public void I() {
        this.f1487b.recycle();
    }

    public boolean a(int i10, boolean z10) {
        return this.f1487b.getBoolean(i10, z10);
    }

    @t0(21)
    public int b() {
        return this.f1487b.getChangingConfigurations();
    }

    public int c(int i10, int i11) {
        return this.f1487b.getColor(i10, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = g.a.c(r2.f1486a, (r0 = r2.f1487b.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList d(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1487b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f1487b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f1486a
            android.content.res.ColorStateList r0 = g.a.c(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f1487b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w0.d(int):android.content.res.ColorStateList");
    }

    public float e(int i10, float f10) {
        return this.f1487b.getDimension(i10, f10);
    }

    public int f(int i10, int i11) {
        return this.f1487b.getDimensionPixelOffset(i10, i11);
    }

    public int g(int i10, int i11) {
        return this.f1487b.getDimensionPixelSize(i10, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f1487b.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable h(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1487b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f1487b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f1486a
            android.graphics.drawable.Drawable r3 = g.a.d(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f1487b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w0.h(int):android.graphics.drawable.Drawable");
    }

    public Drawable i(int i10) {
        int resourceId;
        if (!this.f1487b.hasValue(i10) || (resourceId = this.f1487b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return f.b().d(this.f1486a, resourceId, true);
    }

    public float j(int i10, float f10) {
        return this.f1487b.getFloat(i10, f10);
    }

    @o0
    public Typeface k(@c1 int i10, int i11, @o0 g.c cVar) {
        int resourceId = this.f1487b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1488c == null) {
            this.f1488c = new TypedValue();
        }
        return g.j(this.f1486a, resourceId, this.f1488c, i11, cVar);
    }

    public float l(int i10, int i11, int i12, float f10) {
        return this.f1487b.getFraction(i10, i11, i12, f10);
    }

    public int m(int i10) {
        return this.f1487b.getIndex(i10);
    }

    public int n() {
        return this.f1487b.getIndexCount();
    }

    public int o(int i10, int i11) {
        return this.f1487b.getInt(i10, i11);
    }

    public int p(int i10, int i11) {
        return this.f1487b.getInteger(i10, i11);
    }

    public int q(int i10, int i11) {
        return this.f1487b.getLayoutDimension(i10, i11);
    }

    public int r(int i10, String str) {
        return this.f1487b.getLayoutDimension(i10, str);
    }

    public String s(int i10) {
        return this.f1487b.getNonResourceString(i10);
    }

    public String t() {
        return this.f1487b.getPositionDescription();
    }

    public int u(int i10, int i11) {
        return this.f1487b.getResourceId(i10, i11);
    }

    public Resources v() {
        return this.f1487b.getResources();
    }

    public String w(int i10) {
        return this.f1487b.getString(i10);
    }

    public CharSequence x(int i10) {
        return this.f1487b.getText(i10);
    }

    public CharSequence[] y(int i10) {
        return this.f1487b.getTextArray(i10);
    }

    public int z(int i10) {
        return this.f1487b.getType(i10);
    }
}
