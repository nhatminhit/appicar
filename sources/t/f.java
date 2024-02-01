package t;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import d.o0;
import d.t0;

@t0(21)
public class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f12730a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f12731b;

    /* renamed from: c  reason: collision with root package name */
    public final RectF f12732c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f12733d;

    /* renamed from: e  reason: collision with root package name */
    public float f12734e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12735f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12736g = true;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f12737h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuffColorFilter f12738i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f12739j;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f12740k = PorterDuff.Mode.SRC_IN;

    public f(ColorStateList colorStateList, float f10) {
        this.f12730a = f10;
        this.f12731b = new Paint(5);
        e(colorStateList);
        this.f12732c = new RectF();
        this.f12733d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public ColorStateList b() {
        return this.f12737h;
    }

    public float c() {
        return this.f12734e;
    }

    public float d() {
        return this.f12730a;
    }

    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f12731b;
        if (this.f12738i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f12738i);
            z10 = true;
        }
        RectF rectF = this.f12732c;
        float f10 = this.f12730a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public final void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f12737h = colorStateList;
        this.f12731b.setColor(colorStateList.getColorForState(getState(), this.f12737h.getDefaultColor()));
    }

    public void f(@o0 ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    public void g(float f10, boolean z10, boolean z11) {
        if (f10 != this.f12734e || this.f12735f != z10 || this.f12736g != z11) {
            this.f12734e = f10;
            this.f12735f = z10;
            this.f12736g = z11;
            i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f12733d, this.f12730a);
    }

    public void h(float f10) {
        if (f10 != this.f12730a) {
            this.f12730a = f10;
            i((Rect) null);
            invalidateSelf();
        }
    }

    public final void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f12732c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f12733d.set(rect);
        if (this.f12735f) {
            float d10 = g.d(this.f12734e, this.f12730a, this.f12736g);
            this.f12733d.inset((int) Math.ceil((double) g.c(this.f12734e, this.f12730a, this.f12736g)), (int) Math.ceil((double) d10));
            this.f12732c.set(this.f12733d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f12737h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f12739j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f12737h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.f.isStateful():boolean");
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f12737h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f12731b.getColor();
        if (z10) {
            this.f12731b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f12739j;
        if (colorStateList2 == null || (mode = this.f12740k) == null) {
            return z10;
        }
        this.f12738i = a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i10) {
        this.f12731b.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f12731b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f12739j = colorStateList;
        this.f12738i = a(colorStateList, this.f12740k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f12740k = mode;
        this.f12738i = a(this.f12739j, mode);
        invalidateSelf();
    }
}
