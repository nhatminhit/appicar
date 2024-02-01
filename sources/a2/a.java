package a2;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import d.a1;
import d.m0;
import d.o0;
import d.u;
import f1.j;
import f1.w1;
import java.lang.reflect.Method;

@Deprecated
public class a implements DrawerLayout.d {

    /* renamed from: m  reason: collision with root package name */
    public static final String f99m = "ActionBarDrawerToggle";

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f100n = {16843531};

    /* renamed from: o  reason: collision with root package name */
    public static final float f101o = 0.33333334f;

    /* renamed from: p  reason: collision with root package name */
    public static final int f102p = 16908332;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f103a;

    /* renamed from: b  reason: collision with root package name */
    public final C0003a f104b;

    /* renamed from: c  reason: collision with root package name */
    public final DrawerLayout f105c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f106d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f107e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f108f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f109g;

    /* renamed from: h  reason: collision with root package name */
    public d f110h;

    /* renamed from: i  reason: collision with root package name */
    public final int f111i;

    /* renamed from: j  reason: collision with root package name */
    public final int f112j;

    /* renamed from: k  reason: collision with root package name */
    public final int f113k;

    /* renamed from: l  reason: collision with root package name */
    public c f114l;

    @Deprecated
    /* renamed from: a2.a$a  reason: collision with other inner class name */
    public interface C0003a {
        void a(Drawable drawable, @a1 int i10);

        @o0
        Drawable b();

        void c(@a1 int i10);
    }

    @Deprecated
    public interface b {
        @o0
        C0003a c();
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public Method f115a;

        /* renamed from: b  reason: collision with root package name */
        public Method f116b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f117c;

        public c(Activity activity) {
            try {
                this.f115a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f116b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(a.f102p);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                        if (childAt instanceof ImageView) {
                            this.f117c = (ImageView) childAt;
                        }
                    }
                }
            }
        }
    }

    public class d extends InsetDrawable implements Drawable.Callback {
        public final boolean O = true;
        public final Rect P = new Rect();
        public float Q;
        public float R;

        public d(Drawable drawable) {
            super(drawable, 0);
        }

        public float a() {
            return this.Q;
        }

        public void b(float f10) {
            this.R = f10;
            invalidateSelf();
        }

        public void c(float f10) {
            this.Q = f10;
            invalidateSelf();
        }

        public void draw(@m0 Canvas canvas) {
            copyBounds(this.P);
            canvas.save();
            int i10 = 1;
            boolean z10 = w1.X(a.this.f103a.getWindow().getDecorView()) == 1;
            if (z10) {
                i10 = -1;
            }
            float width = (float) this.P.width();
            canvas.translate((-this.R) * width * this.Q * ((float) i10), 0.0f);
            if (z10 && !this.O) {
                canvas.translate(width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }

    public a(Activity activity, DrawerLayout drawerLayout, @u int i10, @a1 int i11, @a1 int i12) {
        this(activity, drawerLayout, !e(activity), i10, i11, i12);
    }

    public a(Activity activity, DrawerLayout drawerLayout, boolean z10, @u int i10, @a1 int i11, @a1 int i12) {
        this.f106d = true;
        this.f103a = activity;
        this.f104b = activity instanceof b ? ((b) activity).c() : null;
        this.f105c = drawerLayout;
        this.f111i = i10;
        this.f112j = i11;
        this.f113k = i12;
        this.f108f = f();
        this.f109g = i0.d.i(activity, i10);
        d dVar = new d(this.f109g);
        this.f110h = dVar;
        dVar.b(z10 ? 0.33333334f : 0.0f);
    }

    public static boolean e(Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 21;
    }

    public void a(View view) {
        this.f110h.c(1.0f);
        if (this.f106d) {
            j(this.f113k);
        }
    }

    public void b(View view) {
        this.f110h.c(0.0f);
        if (this.f106d) {
            j(this.f112j);
        }
    }

    public void c(int i10) {
    }

    public void d(View view, float f10) {
        float a10 = this.f110h.a();
        this.f110h.c(f10 > 0.5f ? Math.max(a10, Math.max(0.0f, f10 - 0.5f) * 2.0f) : Math.min(a10, f10 * 2.0f));
    }

    public final Drawable f() {
        C0003a aVar = this.f104b;
        if (aVar != null) {
            return aVar.b();
        }
        ActionBar actionBar = this.f103a.getActionBar();
        TypedArray obtainStyledAttributes = (actionBar != null ? actionBar.getThemedContext() : this.f103a).obtainStyledAttributes((AttributeSet) null, f100n, 16843470, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public boolean g() {
        return this.f106d;
    }

    public void h(Configuration configuration) {
        if (!this.f107e) {
            this.f108f = f();
        }
        this.f109g = i0.d.i(this.f103a, this.f111i);
        o();
    }

    public boolean i(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f106d) {
            return false;
        }
        if (this.f105c.F(j.f7185b)) {
            this.f105c.d(j.f7185b);
            return true;
        }
        this.f105c.K(j.f7185b);
        return true;
    }

    public final void j(int i10) {
        C0003a aVar = this.f104b;
        if (aVar != null) {
            aVar.c(i10);
            return;
        }
        ActionBar actionBar = this.f103a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i10);
        }
    }

    public final void k(Drawable drawable, int i10) {
        C0003a aVar = this.f104b;
        if (aVar != null) {
            aVar.a(drawable, i10);
            return;
        }
        ActionBar actionBar = this.f103a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i10);
        }
    }

    public void l(boolean z10) {
        int i10;
        Drawable drawable;
        if (z10 != this.f106d) {
            if (z10) {
                drawable = this.f110h;
                i10 = this.f105c.C(j.f7185b) ? this.f113k : this.f112j;
            } else {
                drawable = this.f108f;
                i10 = 0;
            }
            k(drawable, i10);
            this.f106d = z10;
        }
    }

    public void m(int i10) {
        n(i10 != 0 ? i0.d.i(this.f103a, i10) : null);
    }

    public void n(Drawable drawable) {
        if (drawable == null) {
            this.f108f = f();
            this.f107e = false;
        } else {
            this.f108f = drawable;
            this.f107e = true;
        }
        if (!this.f106d) {
            k(this.f108f, 0);
        }
    }

    public void o() {
        float f10;
        d dVar;
        if (this.f105c.C(j.f7185b)) {
            dVar = this.f110h;
            f10 = 1.0f;
        } else {
            dVar = this.f110h;
            f10 = 0.0f;
        }
        dVar.c(f10);
        if (this.f106d) {
            k(this.f110h, this.f105c.C(j.f7185b) ? this.f113k : this.f112j);
        }
    }
}
