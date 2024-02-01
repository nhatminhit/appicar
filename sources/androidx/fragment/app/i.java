package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import d.m0;
import d.o0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class i {
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f2629a = new CopyOnWriteArrayList<>();
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final FragmentManager f2630b;

    public static final class a {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final FragmentManager.m f2631a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2632b;

        public a(@m0 FragmentManager.m mVar, boolean z10) {
            this.f2631a = mVar;
            this.f2632b = z10;
        }
    }

    public i(@m0 FragmentManager fragmentManager) {
        this.f2630b = fragmentManager;
    }

    public void a(@m0 Fragment fragment, @o0 Bundle bundle, boolean z10) {
        Fragment K0 = this.f2630b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.f2629a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2632b) {
                next.f2631a.a(this.f2630b, fragment, bundle);
            }
        }
    }

    public void b(@m0 Fragment fragment, boolean z10) {
        Context f10 = this.f2630b.H0().f();
        Fragment K0 = this.f2630b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().b(fragment, true);
        }
        Iterator<a> it = this.f2629a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2632b) {
                next.f2631a.b(this.f2630b, fragment, f10);
            }
        }
    }

    public void c(@m0 Fragment fragment, @o0 Bundle bundle, boolean z10) {
        Fragment K0 = this.f2630b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.f2629a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2632b) {
                next.f2631a.c(this.f2630b, fragment, bundle);
            }
        }
    }

    public void d(@m0 Fragment fragment, boolean z10) {
        Fragment K0 = this.f2630b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().d(fragment, true);
        }
        Iterator<a> it = this.f2629a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2632b) {
                next.f2631a.d(this.f2630b, fragment);
            }
        }
    }

    public void e(@m0 Fragment fragment, boolean z10) {
        Fragment K0 = this.f2630b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().e(fragment, true);
        }
        Iterator<a> it = this.f2629a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2632b) {
                next.f2631a.e(this.f2630b, fragment);
            }
        }
    }

    public void f(@m0 Fragment fragment, boolean z10) {
        Fragment K0 = this.f2630b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().f(fragment, true);
        }
        Iterator<a> it = this.f2629a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2632b) {
                next.f2631a.f(this.f2630b, fragment);
            }
        }
    }

    public void g(@m0 Fragment fragment, boolean z10) {
        Context f10 = this.f2630b.H0().f();
        Fragment K0 = this.f2630b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().g(fragment, true);
        }
        Iterator<a> it = this.f2629a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2632b) {
                next.f2631a.g(this.f2630b, fragment, f10);
            }
        }
    }

    public void h(@m0 Fragment fragment, @o0 Bundle bundle, boolean z10) {
        Fragment K0 = this.f2630b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.f2629a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2632b) {
                next.f2631a.h(this.f2630b, fragment, bundle);
            }
        }
    }

    public void i(@m0 Fragment fragment, boolean z10) {
        Fragment K0 = this.f2630b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().i(fragment, true);
        }
        Iterator<a> it = this.f2629a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2632b) {
                next.f2631a.i(this.f2630b, fragment);
            }
        }
    }

    public void j(@m0 Fragment fragment, @m0 Bundle bundle, boolean z10) {
        Fragment K0 = this.f2630b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.f2629a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2632b) {
                next.f2631a.j(this.f2630b, fragment, bundle);
            }
        }
    }

    public void k(@m0 Fragment fragment, boolean z10) {
        Fragment K0 = this.f2630b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().k(fragment, true);
        }
        Iterator<a> it = this.f2629a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2632b) {
                next.f2631a.k(this.f2630b, fragment);
            }
        }
    }

    public void l(@m0 Fragment fragment, boolean z10) {
        Fragment K0 = this.f2630b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().l(fragment, true);
        }
        Iterator<a> it = this.f2629a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2632b) {
                next.f2631a.l(this.f2630b, fragment);
            }
        }
    }

    public void m(@m0 Fragment fragment, @m0 View view, @o0 Bundle bundle, boolean z10) {
        Fragment K0 = this.f2630b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f2629a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2632b) {
                next.f2631a.m(this.f2630b, fragment, view, bundle);
            }
        }
    }

    public void n(@m0 Fragment fragment, boolean z10) {
        Fragment K0 = this.f2630b.K0();
        if (K0 != null) {
            K0.getParentFragmentManager().J0().n(fragment, true);
        }
        Iterator<a> it = this.f2629a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2632b) {
                next.f2631a.n(this.f2630b, fragment);
            }
        }
    }

    public void o(@m0 FragmentManager.m mVar, boolean z10) {
        this.f2629a.add(new a(mVar, z10));
    }

    public void p(@m0 FragmentManager.m mVar) {
        synchronized (this.f2629a) {
            int i10 = 0;
            int size = this.f2629a.size();
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (this.f2629a.get(i10).f2631a == mVar) {
                    this.f2629a.remove(i10);
                    break;
                } else {
                    i10++;
                }
            }
        }
    }
}
