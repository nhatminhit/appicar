package k;

import android.view.View;
import android.view.animation.Interpolator;
import d.x0;
import f1.s2;
import f1.t2;
import f1.u2;
import java.util.ArrayList;
import java.util.Iterator;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<s2> f9873a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f9874b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f9875c;

    /* renamed from: d  reason: collision with root package name */
    public t2 f9876d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9877e;

    /* renamed from: f  reason: collision with root package name */
    public final u2 f9878f = new a();

    public class a extends u2 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f9879a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f9880b = 0;

        public a() {
        }

        public void b(View view) {
            int i10 = this.f9880b + 1;
            this.f9880b = i10;
            if (i10 == h.this.f9873a.size()) {
                t2 t2Var = h.this.f9876d;
                if (t2Var != null) {
                    t2Var.b((View) null);
                }
                d();
            }
        }

        public void c(View view) {
            if (!this.f9879a) {
                this.f9879a = true;
                t2 t2Var = h.this.f9876d;
                if (t2Var != null) {
                    t2Var.c((View) null);
                }
            }
        }

        public void d() {
            this.f9880b = 0;
            this.f9879a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f9877e) {
            Iterator<s2> it = this.f9873a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f9877e = false;
        }
    }

    public void b() {
        this.f9877e = false;
    }

    public h c(s2 s2Var) {
        if (!this.f9877e) {
            this.f9873a.add(s2Var);
        }
        return this;
    }

    public h d(s2 s2Var, s2 s2Var2) {
        this.f9873a.add(s2Var);
        s2Var2.u(s2Var.d());
        this.f9873a.add(s2Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f9877e) {
            this.f9874b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f9877e) {
            this.f9875c = interpolator;
        }
        return this;
    }

    public h g(t2 t2Var) {
        if (!this.f9877e) {
            this.f9876d = t2Var;
        }
        return this;
    }

    public void h() {
        if (!this.f9877e) {
            Iterator<s2> it = this.f9873a.iterator();
            while (it.hasNext()) {
                s2 next = it.next();
                long j10 = this.f9874b;
                if (j10 >= 0) {
                    next.q(j10);
                }
                Interpolator interpolator = this.f9875c;
                if (interpolator != null) {
                    next.r(interpolator);
                }
                if (this.f9876d != null) {
                    next.s(this.f9878f);
                }
                next.w();
            }
            this.f9877e = true;
        }
    }
}
