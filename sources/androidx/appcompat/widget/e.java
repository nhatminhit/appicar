package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.widget.d;
import d.m0;
import d.o0;

public class e {
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f1290a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f1291b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f1292c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1293d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1294e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1295f;

    public e(@m0 CompoundButton compoundButton) {
        this.f1290a = compoundButton;
    }

    public void a() {
        Drawable a10 = d.a(this.f1290a);
        if (a10 == null) {
            return;
        }
        if (this.f1293d || this.f1294e) {
            Drawable mutate = o0.d.r(a10).mutate();
            if (this.f1293d) {
                o0.d.o(mutate, this.f1291b);
            }
            if (this.f1294e) {
                o0.d.p(mutate, this.f1292c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1290a.getDrawableState());
            }
            this.f1290a.setButtonDrawable(mutate);
        }
    }

    public int b(int i10) {
        return i10;
    }

    public ColorStateList c() {
        return this.f1291b;
    }

    public PorterDuff.Mode d() {
        return this.f1292c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(@d.o0 android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1290a
            android.content.Context r0 = r0.getContext()
            int[] r3 = f.a.n.CompoundButton
            r8 = 0
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.w0.G(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1290a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.B()
            r7 = 0
            r4 = r10
            r6 = r11
            f1.w1.x1(r1, r2, r3, r4, r5, r6, r7)
            int r10 = f.a.n.CompoundButton_buttonCompat     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.u(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CompoundButton r11 = r9.f1290a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = g.a.d(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = r8
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = f.a.n.CompoundButton_android_button     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.u(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CompoundButton r11 = r9.f1290a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = g.a.d(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = f.a.n.CompoundButton_buttonTint     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CompoundButton r11 = r9.f1290a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.d(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.d.d(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = f.a.n.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CompoundButton r11 = r9.f1290a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.o(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.b0.e(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.d.e(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.I()
            return
        L_0x0084:
            r10 = move-exception
            r0.I()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e.e(android.util.AttributeSet, int):void");
    }

    public void f() {
        if (this.f1295f) {
            this.f1295f = false;
            return;
        }
        this.f1295f = true;
        a();
    }

    public void g(ColorStateList colorStateList) {
        this.f1291b = colorStateList;
        this.f1293d = true;
        a();
    }

    public void h(@o0 PorterDuff.Mode mode) {
        this.f1292c = mode;
        this.f1294e = true;
        a();
    }
}
