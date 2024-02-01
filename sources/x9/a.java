package x9;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import d.l;
import d.m0;
import d.o0;
import d.x0;
import o0.p;
import z9.j;
import z9.o;
import z9.s;

@x0({x0.a.LIBRARY_GROUP})
public class a extends Drawable implements s, p {
    public b O;

    public static final class b extends Drawable.ConstantState {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public j f24355a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f24356b;

        public b(@m0 b bVar) {
            this.f24355a = (j) bVar.f24355a.getConstantState().newDrawable();
            this.f24356b = bVar.f24356b;
        }

        public b(j jVar) {
            this.f24355a = jVar;
            this.f24356b = false;
        }

        @m0
        /* renamed from: a */
        public a newDrawable() {
            return new a(new b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }
    }

    public a(b bVar) {
        this.O = bVar;
    }

    public a(o oVar) {
        this(new b(new j(oVar)));
    }

    @m0
    /* renamed from: a */
    public a mutate() {
        this.O = new b(this.O);
        return this;
    }

    public void draw(Canvas canvas) {
        b bVar = this.O;
        if (bVar.f24356b) {
            bVar.f24355a.draw(canvas);
        }
    }

    @o0
    public Drawable.ConstantState getConstantState() {
        return this.O;
    }

    public int getOpacity() {
        return this.O.f24355a.getOpacity();
    }

    @m0
    public o getShapeAppearanceModel() {
        return this.O.f24355a.getShapeAppearanceModel();
    }

    public boolean isStateful() {
        return true;
    }

    public void onBoundsChange(@m0 Rect rect) {
        super.onBoundsChange(rect);
        this.O.f24355a.setBounds(rect);
    }

    public boolean onStateChange(@m0 int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.O.f24355a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e10 = b.e(iArr);
        b bVar = this.O;
        if (bVar.f24356b == e10) {
            return onStateChange;
        }
        bVar.f24356b = e10;
        return true;
    }

    public void setAlpha(int i10) {
        this.O.f24355a.setAlpha(i10);
    }

    public void setColorFilter(@o0 ColorFilter colorFilter) {
        this.O.f24355a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(@m0 o oVar) {
        this.O.f24355a.setShapeAppearanceModel(oVar);
    }

    public void setTint(@l int i10) {
        this.O.f24355a.setTint(i10);
    }

    public void setTintList(@o0 ColorStateList colorStateList) {
        this.O.f24355a.setTintList(colorStateList);
    }

    public void setTintMode(@o0 PorterDuff.Mode mode) {
        this.O.f24355a.setTintMode(mode);
    }
}
