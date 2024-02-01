package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.p;
import d.m0;
import d.o0;
import n3.a;

@Deprecated
public abstract class n extends a {

    /* renamed from: j  reason: collision with root package name */
    public static final String f2645j = "FragmentPagerAdapter";

    /* renamed from: k  reason: collision with root package name */
    public static final boolean f2646k = false;
    @Deprecated

    /* renamed from: l  reason: collision with root package name */
    public static final int f2647l = 0;

    /* renamed from: m  reason: collision with root package name */
    public static final int f2648m = 1;

    /* renamed from: e  reason: collision with root package name */
    public final FragmentManager f2649e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2650f;

    /* renamed from: g  reason: collision with root package name */
    public u f2651g;

    /* renamed from: h  reason: collision with root package name */
    public Fragment f2652h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2653i;

    @Deprecated
    public n(@m0 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public n(@m0 FragmentManager fragmentManager, int i10) {
        this.f2651g = null;
        this.f2652h = null;
        this.f2649e = fragmentManager;
        this.f2650f = i10;
    }

    public static String x(int i10, long j10) {
        return "android:switcher:" + i10 + ":" + j10;
    }

    public void b(@m0 ViewGroup viewGroup, int i10, @m0 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f2651g == null) {
            this.f2651g = this.f2649e.r();
        }
        this.f2651g.r(fragment);
        if (fragment.equals(this.f2652h)) {
            this.f2652h = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void d(@m0 ViewGroup viewGroup) {
        u uVar = this.f2651g;
        if (uVar != null) {
            if (!this.f2653i) {
                try {
                    this.f2653i = true;
                    uVar.p();
                    this.f2653i = false;
                } catch (Throwable th2) {
                    this.f2653i = false;
                    throw th2;
                }
            }
            this.f2651g = null;
        }
    }

    @m0
    public Object j(@m0 ViewGroup viewGroup, int i10) {
        if (this.f2651g == null) {
            this.f2651g = this.f2649e.r();
        }
        long w10 = w(i10);
        Fragment q02 = this.f2649e.q0(x(viewGroup.getId(), w10));
        if (q02 != null) {
            this.f2651g.l(q02);
        } else {
            q02 = v(i10);
            this.f2651g.c(viewGroup.getId(), q02, x(viewGroup.getId(), w10));
        }
        if (q02 != this.f2652h) {
            q02.setMenuVisibility(false);
            if (this.f2650f == 1) {
                this.f2651g.K(q02, p.b.STARTED);
            } else {
                q02.setUserVisibleHint(false);
            }
        }
        return q02;
    }

    public boolean k(@m0 View view, @m0 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public void n(@o0 Parcelable parcelable, @o0 ClassLoader classLoader) {
    }

    @o0
    public Parcelable o() {
        return null;
    }

    public void q(@m0 ViewGroup viewGroup, int i10, @m0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f2652h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f2650f == 1) {
                    if (this.f2651g == null) {
                        this.f2651g = this.f2649e.r();
                    }
                    this.f2651g.K(this.f2652h, p.b.STARTED);
                } else {
                    this.f2652h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f2650f == 1) {
                if (this.f2651g == null) {
                    this.f2651g = this.f2649e.r();
                }
                this.f2651g.K(fragment, p.b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f2652h = fragment;
        }
    }

    public void t(@m0 ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @m0
    public abstract Fragment v(int i10);

    public long w(int i10) {
        return (long) i10;
    }
}
