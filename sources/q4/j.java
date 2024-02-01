package q4;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import d.m0;
import d.o0;
import r4.f;

public abstract class j<Z> extends r<ImageView, Z> implements f.a {
    @o0
    public Animatable X;

    public j(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public j(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }

    public void a() {
        Animatable animatable = this.X;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public void b() {
        Animatable animatable = this.X;
        if (animatable != null) {
            animatable.start();
        }
    }

    public void c(Drawable drawable) {
        ((ImageView) this.P).setImageDrawable(drawable);
    }

    public void f(@o0 Drawable drawable) {
        super.f(drawable);
        y((Object) null);
        c(drawable);
    }

    @o0
    public Drawable g() {
        return ((ImageView) this.P).getDrawable();
    }

    public void l(@o0 Drawable drawable) {
        super.l(drawable);
        y((Object) null);
        c(drawable);
    }

    public void r(@o0 Drawable drawable) {
        super.r(drawable);
        Animatable animatable = this.X;
        if (animatable != null) {
            animatable.stop();
        }
        y((Object) null);
        c(drawable);
    }

    public void s(@m0 Z z10, @o0 f<? super Z> fVar) {
        if (fVar == null || !fVar.a(z10, this)) {
            y(z10);
        } else {
            w(z10);
        }
    }

    public final void w(@o0 Z z10) {
        if (z10 instanceof Animatable) {
            Animatable animatable = (Animatable) z10;
            this.X = animatable;
            animatable.start();
            return;
        }
        this.X = null;
    }

    public abstract void x(@o0 Z z10);

    public final void y(@o0 Z z10) {
        x(z10);
        w(z10);
    }
}
