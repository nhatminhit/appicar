package t9;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import d.i;
import d.m0;
import d.o0;
import e1.n;
import j9.h;
import java.util.ArrayList;
import java.util.List;

public abstract class b implements com.google.android.material.floatingactionbutton.b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23095a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final ExtendedFloatingActionButton f23096b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<Animator.AnimatorListener> f23097c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final a f23098d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public h f23099e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public h f23100f;

    public class a extends Property<ExtendedFloatingActionButton, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(j9.a.a(0.0f, 1.0f, (((float) Color.alpha(extendedFloatingActionButton.getCurrentTextColor())) / 255.0f) / ((float) Color.alpha(extendedFloatingActionButton.D0.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f23096b.D0.getDefaultColor())))));
        }

        /* renamed from: b */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f10) {
            int colorForState = extendedFloatingActionButton.D0.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f23096b.D0.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (j9.a.a(0.0f, ((float) Color.alpha(colorForState)) / 255.0f, f10.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f10.floatValue() == 1.0f) {
                extendedFloatingActionButton.V(extendedFloatingActionButton.D0);
            } else {
                extendedFloatingActionButton.V(valueOf);
            }
        }
    }

    public b(@m0 ExtendedFloatingActionButton extendedFloatingActionButton, a aVar) {
        this.f23096b = extendedFloatingActionButton;
        this.f23095a = extendedFloatingActionButton.getContext();
        this.f23098d = aVar;
    }

    @i
    public void a() {
        this.f23098d.b();
    }

    public final h b() {
        h hVar = this.f23100f;
        if (hVar != null) {
            return hVar;
        }
        if (this.f23099e == null) {
            this.f23099e = h.d(this.f23095a, c());
        }
        return (h) n.g(this.f23099e);
    }

    @o0
    public h e() {
        return this.f23100f;
    }

    public final void g(@m0 Animator.AnimatorListener animatorListener) {
        this.f23097c.remove(animatorListener);
    }

    @m0
    public final List<Animator.AnimatorListener> getListeners() {
        return this.f23097c;
    }

    public final void h(@m0 Animator.AnimatorListener animatorListener) {
        this.f23097c.add(animatorListener);
    }

    public final void i(@o0 h hVar) {
        this.f23100f = hVar;
    }

    @i
    public void j() {
        this.f23098d.b();
    }

    public AnimatorSet k() {
        return n(b());
    }

    @m0
    public AnimatorSet n(@m0 h hVar) {
        ArrayList arrayList = new ArrayList();
        if (hVar.j("opacity")) {
            arrayList.add(hVar.f("opacity", this.f23096b, View.ALPHA));
        }
        if (hVar.j("scale")) {
            arrayList.add(hVar.f("scale", this.f23096b, View.SCALE_Y));
            arrayList.add(hVar.f("scale", this.f23096b, View.SCALE_X));
        }
        if (hVar.j("width")) {
            arrayList.add(hVar.f("width", this.f23096b, ExtendedFloatingActionButton.I0));
        }
        if (hVar.j("height")) {
            arrayList.add(hVar.f("height", this.f23096b, ExtendedFloatingActionButton.J0));
        }
        if (hVar.j("paddingStart")) {
            arrayList.add(hVar.f("paddingStart", this.f23096b, ExtendedFloatingActionButton.K0));
        }
        if (hVar.j("paddingEnd")) {
            arrayList.add(hVar.f("paddingEnd", this.f23096b, ExtendedFloatingActionButton.L0));
        }
        if (hVar.j("labelOpacity")) {
            arrayList.add(hVar.f("labelOpacity", this.f23096b, new a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        j9.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    @i
    public void onAnimationStart(Animator animator) {
        this.f23098d.c(animator);
    }
}
