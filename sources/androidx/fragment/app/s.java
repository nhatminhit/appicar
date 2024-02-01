package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.p;
import d.m0;
import d.o0;
import java.util.ArrayList;
import n3.a;
import u3.f;

@Deprecated
public abstract class s extends a {

    /* renamed from: l  reason: collision with root package name */
    public static final String f2666l = "FragmentStatePagerAdapt";

    /* renamed from: m  reason: collision with root package name */
    public static final boolean f2667m = false;
    @Deprecated

    /* renamed from: n  reason: collision with root package name */
    public static final int f2668n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f2669o = 1;

    /* renamed from: e  reason: collision with root package name */
    public final FragmentManager f2670e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2671f;

    /* renamed from: g  reason: collision with root package name */
    public u f2672g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<Fragment.SavedState> f2673h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<Fragment> f2674i;

    /* renamed from: j  reason: collision with root package name */
    public Fragment f2675j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2676k;

    @Deprecated
    public s(@m0 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public s(@m0 FragmentManager fragmentManager, int i10) {
        this.f2672g = null;
        this.f2673h = new ArrayList<>();
        this.f2674i = new ArrayList<>();
        this.f2675j = null;
        this.f2670e = fragmentManager;
        this.f2671f = i10;
    }

    public void b(@m0 ViewGroup viewGroup, int i10, @m0 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f2672g == null) {
            this.f2672g = this.f2670e.r();
        }
        while (this.f2673h.size() <= i10) {
            this.f2673h.add((Object) null);
        }
        this.f2673h.set(i10, fragment.isAdded() ? this.f2670e.I1(fragment) : null);
        this.f2674i.set(i10, (Object) null);
        this.f2672g.x(fragment);
        if (fragment.equals(this.f2675j)) {
            this.f2675j = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void d(@m0 ViewGroup viewGroup) {
        u uVar = this.f2672g;
        if (uVar != null) {
            if (!this.f2676k) {
                try {
                    this.f2676k = true;
                    uVar.p();
                    this.f2676k = false;
                } catch (Throwable th2) {
                    this.f2676k = false;
                    throw th2;
                }
            }
            this.f2672g = null;
        }
    }

    @m0
    public Object j(@m0 ViewGroup viewGroup, int i10) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f2674i.size() > i10 && (fragment = this.f2674i.get(i10)) != null) {
            return fragment;
        }
        if (this.f2672g == null) {
            this.f2672g = this.f2670e.r();
        }
        Fragment v10 = v(i10);
        if (this.f2673h.size() > i10 && (savedState = this.f2673h.get(i10)) != null) {
            v10.setInitialSavedState(savedState);
        }
        while (this.f2674i.size() <= i10) {
            this.f2674i.add((Object) null);
        }
        v10.setMenuVisibility(false);
        if (this.f2671f == 0) {
            v10.setUserVisibleHint(false);
        }
        this.f2674i.set(i10, v10);
        this.f2672g.b(viewGroup.getId(), v10);
        if (this.f2671f == 1) {
            this.f2672g.K(v10, p.b.STARTED);
        }
        return v10;
    }

    public boolean k(@m0 View view, @m0 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public void n(@o0 Parcelable parcelable, @o0 ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f2673h.clear();
            this.f2674i.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f2673h.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith(f.A)) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment C0 = this.f2670e.C0(bundle, str);
                    if (C0 != null) {
                        while (this.f2674i.size() <= parseInt) {
                            this.f2674i.add((Object) null);
                        }
                        C0.setMenuVisibility(false);
                        this.f2674i.set(parseInt, C0);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bad fragment at key ");
                        sb2.append(str);
                    }
                }
            }
        }
    }

    @o0
    public Parcelable o() {
        Bundle bundle;
        if (this.f2673h.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f2673h.size()];
            this.f2673h.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i10 = 0; i10 < this.f2674i.size(); i10++) {
            Fragment fragment = this.f2674i.get(i10);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f2670e.u1(bundle, f.A + i10, fragment);
            }
        }
        return bundle;
    }

    public void q(@m0 ViewGroup viewGroup, int i10, @m0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f2675j;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f2671f == 1) {
                    if (this.f2672g == null) {
                        this.f2672g = this.f2670e.r();
                    }
                    this.f2672g.K(this.f2675j, p.b.STARTED);
                } else {
                    this.f2675j.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f2671f == 1) {
                if (this.f2672g == null) {
                    this.f2672g = this.f2670e.r();
                }
                this.f2672g.K(fragment, p.b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f2675j = fragment;
        }
    }

    public void t(@m0 ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @m0
    public abstract Fragment v(int i10);
}
