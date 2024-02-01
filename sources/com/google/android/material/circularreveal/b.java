package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.c;
import d.l;
import d.m0;
import d.o0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class b {

    /* renamed from: k  reason: collision with root package name */
    public static final boolean f16927k = false;

    /* renamed from: l  reason: collision with root package name */
    public static final int f16928l = 0;

    /* renamed from: m  reason: collision with root package name */
    public static final int f16929m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f16930n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f16931o = 2;

    /* renamed from: a  reason: collision with root package name */
    public final a f16932a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final View f16933b;
    @m0

    /* renamed from: c  reason: collision with root package name */
    public final Path f16934c = new Path();
    @m0

    /* renamed from: d  reason: collision with root package name */
    public final Paint f16935d = new Paint(7);
    @m0

    /* renamed from: e  reason: collision with root package name */
    public final Paint f16936e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public c.e f16937f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public Drawable f16938g;

    /* renamed from: h  reason: collision with root package name */
    public Paint f16939h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f16940i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f16941j;

    public interface a {
        void c(Canvas canvas);

        boolean d();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.circularreveal.b$b  reason: collision with other inner class name */
    public @interface C0277b {
    }

    public b(a aVar) {
        this.f16932a = aVar;
        View view = (View) aVar;
        this.f16933b = view;
        view.setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f16936e = paint;
        paint.setColor(0);
    }

    public void a() {
        if (f16931o == 0) {
            this.f16940i = true;
            this.f16941j = false;
            this.f16933b.buildDrawingCache();
            Bitmap drawingCache = this.f16933b.getDrawingCache();
            if (!(drawingCache != null || this.f16933b.getWidth() == 0 || this.f16933b.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.f16933b.getWidth(), this.f16933b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f16933b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f16935d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f16940i = false;
            this.f16941j = true;
        }
    }

    public void b() {
        if (f16931o == 0) {
            this.f16941j = false;
            this.f16933b.destroyDrawingCache();
            this.f16935d.setShader((Shader) null);
            this.f16933b.invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
        if (r() != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r() != false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(@d.m0 android.graphics.Canvas r9) {
        /*
            r8 = this;
            boolean r0 = r8.p()
            if (r0 == 0) goto L_0x0082
            int r0 = f16931o
            if (r0 == 0) goto L_0x0061
            r1 = 1
            if (r0 == r1) goto L_0x0033
            r1 = 2
            if (r0 != r1) goto L_0x001c
            com.google.android.material.circularreveal.b$a r0 = r8.f16932a
            r0.c(r9)
            boolean r0 = r8.r()
            if (r0 == 0) goto L_0x00a3
            goto L_0x008d
        L_0x001c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported strategy "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L_0x0033:
            int r0 = r9.save()
            android.graphics.Path r1 = r8.f16934c
            r9.clipPath(r1)
            com.google.android.material.circularreveal.b$a r1 = r8.f16932a
            r1.c(r9)
            boolean r1 = r8.r()
            if (r1 == 0) goto L_0x005d
            r3 = 0
            r4 = 0
            android.view.View r1 = r8.f16933b
            int r1 = r1.getWidth()
            float r5 = (float) r1
            android.view.View r1 = r8.f16933b
            int r1 = r1.getHeight()
            float r6 = (float) r1
            android.graphics.Paint r7 = r8.f16936e
            r2 = r9
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x005d:
            r9.restoreToCount(r0)
            goto L_0x00a3
        L_0x0061:
            com.google.android.material.circularreveal.c$e r0 = r8.f16937f
            float r1 = r0.f16947a
            float r2 = r0.f16948b
            float r0 = r0.f16949c
            android.graphics.Paint r3 = r8.f16935d
            r9.drawCircle(r1, r2, r0, r3)
            boolean r0 = r8.r()
            if (r0 == 0) goto L_0x00a3
            com.google.android.material.circularreveal.c$e r0 = r8.f16937f
            float r1 = r0.f16947a
            float r2 = r0.f16948b
            float r0 = r0.f16949c
            android.graphics.Paint r3 = r8.f16936e
            r9.drawCircle(r1, r2, r0, r3)
            goto L_0x00a3
        L_0x0082:
            com.google.android.material.circularreveal.b$a r0 = r8.f16932a
            r0.c(r9)
            boolean r0 = r8.r()
            if (r0 == 0) goto L_0x00a3
        L_0x008d:
            r2 = 0
            r3 = 0
            android.view.View r0 = r8.f16933b
            int r0 = r0.getWidth()
            float r4 = (float) r0
            android.view.View r0 = r8.f16933b
            int r0 = r0.getHeight()
            float r5 = (float) r0
            android.graphics.Paint r6 = r8.f16936e
            r1 = r9
            r1.drawRect(r2, r3, r4, r5, r6)
        L_0x00a3:
            r8.f(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.b.c(android.graphics.Canvas):void");
    }

    public final void d(@m0 Canvas canvas, int i10, float f10) {
        this.f16939h.setColor(i10);
        this.f16939h.setStrokeWidth(f10);
        c.e eVar = this.f16937f;
        canvas.drawCircle(eVar.f16947a, eVar.f16948b, eVar.f16949c - (f10 / 2.0f), this.f16939h);
    }

    public final void e(@m0 Canvas canvas) {
        this.f16932a.c(canvas);
        if (r()) {
            c.e eVar = this.f16937f;
            canvas.drawCircle(eVar.f16947a, eVar.f16948b, eVar.f16949c, this.f16936e);
        }
        if (p()) {
            d(canvas, -16777216, 10.0f);
            d(canvas, s0.a.f12612c, 5.0f);
        }
        f(canvas);
    }

    public final void f(@m0 Canvas canvas) {
        if (q()) {
            Rect bounds = this.f16938g.getBounds();
            float width = this.f16937f.f16947a - (((float) bounds.width()) / 2.0f);
            float height = this.f16937f.f16948b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.f16938g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    @o0
    public Drawable g() {
        return this.f16938g;
    }

    @l
    public int h() {
        return this.f16936e.getColor();
    }

    public final float i(@m0 c.e eVar) {
        return u9.a.b(eVar.f16947a, eVar.f16948b, 0.0f, 0.0f, (float) this.f16933b.getWidth(), (float) this.f16933b.getHeight());
    }

    @o0
    public c.e j() {
        c.e eVar = this.f16937f;
        if (eVar == null) {
            return null;
        }
        c.e eVar2 = new c.e(eVar);
        if (eVar2.a()) {
            eVar2.f16949c = i(eVar2);
        }
        return eVar2;
    }

    public final void k() {
        if (f16931o == 1) {
            this.f16934c.rewind();
            c.e eVar = this.f16937f;
            if (eVar != null) {
                this.f16934c.addCircle(eVar.f16947a, eVar.f16948b, eVar.f16949c, Path.Direction.CW);
            }
        }
        this.f16933b.invalidate();
    }

    public boolean l() {
        return this.f16932a.d() && !p();
    }

    public void m(@o0 Drawable drawable) {
        this.f16938g = drawable;
        this.f16933b.invalidate();
    }

    public void n(@l int i10) {
        this.f16936e.setColor(i10);
        this.f16933b.invalidate();
    }

    public void o(@o0 c.e eVar) {
        if (eVar == null) {
            this.f16937f = null;
        } else {
            c.e eVar2 = this.f16937f;
            if (eVar2 == null) {
                this.f16937f = new c.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (u9.a.e(eVar.f16949c, i(eVar), 1.0E-4f)) {
                this.f16937f.f16949c = Float.MAX_VALUE;
            }
        }
        k();
    }

    public final boolean p() {
        c.e eVar = this.f16937f;
        boolean z10 = eVar == null || eVar.a();
        return f16931o == 0 ? !z10 && this.f16941j : !z10;
    }

    public final boolean q() {
        return (this.f16940i || this.f16938g == null || this.f16937f == null) ? false : true;
    }

    public final boolean r() {
        return !this.f16940i && Color.alpha(this.f16936e.getColor()) != 0;
    }
}
