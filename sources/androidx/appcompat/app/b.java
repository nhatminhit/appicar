package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import d.a1;
import d.m0;
import d.o0;
import f1.j;

public class b implements DrawerLayout.d {

    /* renamed from: a  reason: collision with root package name */
    public final C0020b f804a;

    /* renamed from: b  reason: collision with root package name */
    public final DrawerLayout f805b;

    /* renamed from: c  reason: collision with root package name */
    public h.d f806c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f807d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f808e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f809f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f810g;

    /* renamed from: h  reason: collision with root package name */
    public final int f811h;

    /* renamed from: i  reason: collision with root package name */
    public final int f812i;

    /* renamed from: j  reason: collision with root package name */
    public View.OnClickListener f813j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f814k;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            b bVar = b.this;
            if (bVar.f809f) {
                bVar.v();
                return;
            }
            View.OnClickListener onClickListener = bVar.f813j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.b$b  reason: collision with other inner class name */
    public interface C0020b {
        void a(Drawable drawable, @a1 int i10);

        Drawable b();

        void c(@a1 int i10);

        boolean d();

        Context e();
    }

    public interface c {
        @o0
        C0020b c();
    }

    public static class d implements C0020b {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f815a;

        /* renamed from: b  reason: collision with root package name */
        public c.a f816b;

        public d(Activity activity) {
            this.f815a = activity;
        }

        public void a(Drawable drawable, int i10) {
            ActionBar actionBar = this.f815a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i10);
            }
        }

        public Drawable b() {
            TypedArray obtainStyledAttributes = e().obtainStyledAttributes((AttributeSet) null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        public void c(int i10) {
            ActionBar actionBar = this.f815a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i10);
            }
        }

        public boolean d() {
            ActionBar actionBar = this.f815a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        public Context e() {
            ActionBar actionBar = this.f815a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f815a;
        }
    }

    public static class e implements C0020b {

        /* renamed from: a  reason: collision with root package name */
        public final Toolbar f817a;

        /* renamed from: b  reason: collision with root package name */
        public final Drawable f818b;

        /* renamed from: c  reason: collision with root package name */
        public final CharSequence f819c;

        public e(Toolbar toolbar) {
            this.f817a = toolbar;
            this.f818b = toolbar.getNavigationIcon();
            this.f819c = toolbar.getNavigationContentDescription();
        }

        public void a(Drawable drawable, @a1 int i10) {
            this.f817a.setNavigationIcon(drawable);
            c(i10);
        }

        public Drawable b() {
            return this.f818b;
        }

        public void c(@a1 int i10) {
            if (i10 == 0) {
                this.f817a.setNavigationContentDescription(this.f819c);
            } else {
                this.f817a.setNavigationContentDescription(i10);
            }
        }

        public boolean d() {
            return true;
        }

        public Context e() {
            return this.f817a.getContext();
        }
    }

    public b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, h.d dVar, @a1 int i10, @a1 int i11) {
        this.f807d = true;
        this.f809f = true;
        this.f814k = false;
        if (toolbar != null) {
            this.f804a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.f804a = ((c) activity).c();
        } else {
            this.f804a = new d(activity);
        }
        this.f805b = drawerLayout;
        this.f811h = i10;
        this.f812i = i11;
        if (dVar == null) {
            this.f806c = new h.d(this.f804a.e());
        } else {
            this.f806c = dVar;
        }
        this.f808e = f();
    }

    public b(Activity activity, DrawerLayout drawerLayout, @a1 int i10, @a1 int i11) {
        this(activity, (Toolbar) null, drawerLayout, (h.d) null, i10, i11);
    }

    public b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, @a1 int i10, @a1 int i11) {
        this(activity, toolbar, drawerLayout, (h.d) null, i10, i11);
    }

    public void a(View view) {
        s(1.0f);
        if (this.f809f) {
            l(this.f812i);
        }
    }

    public void b(View view) {
        s(0.0f);
        if (this.f809f) {
            l(this.f811h);
        }
    }

    public void c(int i10) {
    }

    public void d(View view, float f10) {
        if (this.f807d) {
            s(Math.min(1.0f, Math.max(0.0f, f10)));
        } else {
            s(0.0f);
        }
    }

    @m0
    public h.d e() {
        return this.f806c;
    }

    public Drawable f() {
        return this.f804a.b();
    }

    public View.OnClickListener g() {
        return this.f813j;
    }

    public boolean h() {
        return this.f809f;
    }

    public boolean i() {
        return this.f807d;
    }

    public void j(Configuration configuration) {
        if (!this.f810g) {
            this.f808e = f();
        }
        u();
    }

    public boolean k(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f809f) {
            return false;
        }
        v();
        return true;
    }

    public void l(int i10) {
        this.f804a.c(i10);
    }

    public void m(Drawable drawable, int i10) {
        if (!this.f814k && !this.f804a.d()) {
            this.f814k = true;
        }
        this.f804a.a(drawable, i10);
    }

    public void n(@m0 h.d dVar) {
        this.f806c = dVar;
        u();
    }

    public void o(boolean z10) {
        int i10;
        Drawable drawable;
        if (z10 != this.f809f) {
            if (z10) {
                drawable = this.f806c;
                i10 = this.f805b.C(j.f7185b) ? this.f812i : this.f811h;
            } else {
                drawable = this.f808e;
                i10 = 0;
            }
            m(drawable, i10);
            this.f809f = z10;
        }
    }

    public void p(boolean z10) {
        this.f807d = z10;
        if (!z10) {
            s(0.0f);
        }
    }

    public void q(int i10) {
        r(i10 != 0 ? this.f805b.getResources().getDrawable(i10) : null);
    }

    public void r(Drawable drawable) {
        if (drawable == null) {
            this.f808e = f();
            this.f810g = false;
        } else {
            this.f808e = drawable;
            this.f810g = true;
        }
        if (!this.f809f) {
            m(this.f808e, 0);
        }
    }

    public final void s(float f10) {
        h.d dVar;
        boolean z10;
        if (f10 == 1.0f) {
            dVar = this.f806c;
            z10 = true;
        } else {
            if (f10 == 0.0f) {
                dVar = this.f806c;
                z10 = false;
            }
            this.f806c.s(f10);
        }
        dVar.u(z10);
        this.f806c.s(f10);
    }

    public void t(View.OnClickListener onClickListener) {
        this.f813j = onClickListener;
    }

    public void u() {
        s(this.f805b.C(j.f7185b) ? 1.0f : 0.0f);
        if (this.f809f) {
            m(this.f806c, this.f805b.C(j.f7185b) ? this.f812i : this.f811h);
        }
    }

    public void v() {
        int q10 = this.f805b.q(j.f7185b);
        if (this.f805b.F(j.f7185b) && q10 != 2) {
            this.f805b.d(j.f7185b);
        } else if (q10 != 1) {
            this.f805b.K(j.f7185b);
        }
    }
}
