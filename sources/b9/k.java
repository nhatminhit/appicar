package b9;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.o0;

public final class k extends Drawable implements Drawable.Callback {
    public int O;
    public long P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public j W;
    public Drawable X;
    public Drawable Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f4751a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f4752b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f4753c0;

    public k(@o0 Drawable drawable, @o0 Drawable drawable2) {
        this((j) null);
        drawable = drawable == null ? i.f4747a : drawable;
        this.X = drawable;
        drawable.setCallback(this);
        j jVar = this.W;
        jVar.f4750b = drawable.getChangingConfigurations() | jVar.f4750b;
        drawable2 = drawable2 == null ? i.f4747a : drawable2;
        this.Y = drawable2;
        drawable2.setCallback(this);
        j jVar2 = this.W;
        jVar2.f4750b = drawable2.getChangingConfigurations() | jVar2.f4750b;
    }

    public k(@o0 j jVar) {
        this.O = 0;
        this.R = 255;
        this.T = 0;
        this.U = true;
        this.W = new j(jVar);
    }

    public final Drawable a() {
        return this.Y;
    }

    public final void b(int i10) {
        this.Q = this.R;
        this.T = 0;
        this.S = 250;
        this.O = 1;
        invalidateSelf();
    }

    public final boolean c() {
        if (!this.Z) {
            boolean z10 = false;
            if (!(this.X.getConstantState() == null || this.Y.getConstantState() == null)) {
                z10 = true;
            }
            this.f4751a0 = z10;
            this.Z = true;
        }
        return this.f4751a0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r0 == 0) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            int r0 = r6.O
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L_0x0038
            if (r0 == r1) goto L_0x000a
            goto L_0x0041
        L_0x000a:
            long r0 = r6.P
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0041
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r6.P
            long r0 = r0 - r4
            float r0 = (float) r0
            int r1 = r6.S
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r3 = r2
        L_0x0026:
            if (r3 == 0) goto L_0x002a
            r6.O = r2
        L_0x002a:
            float r0 = java.lang.Math.min(r0, r1)
            int r1 = r6.Q
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 0
            float r1 = r1 + r0
            int r0 = (int) r1
            r6.T = r0
            goto L_0x0041
        L_0x0038:
            long r3 = android.os.SystemClock.uptimeMillis()
            r6.P = r3
            r6.O = r1
            r3 = r2
        L_0x0041:
            int r0 = r6.T
            boolean r1 = r6.U
            android.graphics.drawable.Drawable r4 = r6.X
            android.graphics.drawable.Drawable r5 = r6.Y
            if (r3 == 0) goto L_0x0060
            if (r1 == 0) goto L_0x0050
            if (r0 != 0) goto L_0x0055
            goto L_0x0051
        L_0x0050:
            r2 = r0
        L_0x0051:
            r4.draw(r7)
            r0 = r2
        L_0x0055:
            int r1 = r6.R
            if (r0 != r1) goto L_0x005f
            r5.setAlpha(r1)
            r5.draw(r7)
        L_0x005f:
            return
        L_0x0060:
            if (r1 == 0) goto L_0x0068
            int r2 = r6.R
            int r2 = r2 - r0
            r4.setAlpha(r2)
        L_0x0068:
            r4.draw(r7)
            if (r1 == 0) goto L_0x0072
            int r1 = r6.R
            r4.setAlpha(r1)
        L_0x0072:
            if (r0 <= 0) goto L_0x007f
            r5.setAlpha(r0)
            r5.draw(r7)
            int r7 = r6.R
            r5.setAlpha(r7)
        L_0x007f:
            r6.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.k.draw(android.graphics.Canvas):void");
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        j jVar = this.W;
        return changingConfigurations | jVar.f4749a | jVar.f4750b;
    }

    @o0
    public final Drawable.ConstantState getConstantState() {
        if (!c()) {
            return null;
        }
        this.W.f4749a = getChangingConfigurations();
        return this.W;
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.X.getIntrinsicHeight(), this.Y.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.X.getIntrinsicWidth(), this.Y.getIntrinsicWidth());
    }

    public final int getOpacity() {
        if (!this.f4752b0) {
            this.f4753c0 = Drawable.resolveOpacity(this.X.getOpacity(), this.Y.getOpacity());
            this.f4752b0 = true;
        }
        return this.f4753c0;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @CanIgnoreReturnValue
    public final Drawable mutate() {
        if (!this.V && super.mutate() == this) {
            if (c()) {
                this.X.mutate();
                this.Y.mutate();
                this.V = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        this.X.setBounds(rect);
        this.Y.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    public final void setAlpha(int i10) {
        if (this.T == this.R) {
            this.T = i10;
        }
        this.R = i10;
        invalidateSelf();
    }

    public final void setColorFilter(@o0 ColorFilter colorFilter) {
        this.X.setColorFilter(colorFilter);
        this.Y.setColorFilter(colorFilter);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
