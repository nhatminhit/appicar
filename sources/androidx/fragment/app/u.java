package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.p;
import d.a1;
import d.b;
import d.b0;
import d.b1;
import d.m0;
import d.o0;
import f1.w1;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class u {
    public static final int A = 7;
    public static final int B = 8;
    public static final int C = 9;
    public static final int D = 10;
    public static final int E = 4096;
    public static final int F = 8192;
    public static final int G = -1;
    public static final int H = 0;
    public static final int I = 4097;
    public static final int J = 8194;
    public static final int K = 4099;

    /* renamed from: t  reason: collision with root package name */
    public static final int f2681t = 0;

    /* renamed from: u  reason: collision with root package name */
    public static final int f2682u = 1;

    /* renamed from: v  reason: collision with root package name */
    public static final int f2683v = 2;

    /* renamed from: w  reason: collision with root package name */
    public static final int f2684w = 3;

    /* renamed from: x  reason: collision with root package name */
    public static final int f2685x = 4;

    /* renamed from: y  reason: collision with root package name */
    public static final int f2686y = 5;

    /* renamed from: z  reason: collision with root package name */
    public static final int f2687z = 6;

    /* renamed from: a  reason: collision with root package name */
    public final f f2688a;

    /* renamed from: b  reason: collision with root package name */
    public final ClassLoader f2689b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<a> f2690c;

    /* renamed from: d  reason: collision with root package name */
    public int f2691d;

    /* renamed from: e  reason: collision with root package name */
    public int f2692e;

    /* renamed from: f  reason: collision with root package name */
    public int f2693f;

    /* renamed from: g  reason: collision with root package name */
    public int f2694g;

    /* renamed from: h  reason: collision with root package name */
    public int f2695h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2696i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2697j;
    @o0

    /* renamed from: k  reason: collision with root package name */
    public String f2698k;

    /* renamed from: l  reason: collision with root package name */
    public int f2699l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f2700m;

    /* renamed from: n  reason: collision with root package name */
    public int f2701n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f2702o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<String> f2703p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<String> f2704q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2705r;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList<Runnable> f2706s;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2707a;

        /* renamed from: b  reason: collision with root package name */
        public Fragment f2708b;

        /* renamed from: c  reason: collision with root package name */
        public int f2709c;

        /* renamed from: d  reason: collision with root package name */
        public int f2710d;

        /* renamed from: e  reason: collision with root package name */
        public int f2711e;

        /* renamed from: f  reason: collision with root package name */
        public int f2712f;

        /* renamed from: g  reason: collision with root package name */
        public p.b f2713g;

        /* renamed from: h  reason: collision with root package name */
        public p.b f2714h;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f2707a = i10;
            this.f2708b = fragment;
            p.b bVar = p.b.RESUMED;
            this.f2713g = bVar;
            this.f2714h = bVar;
        }

        public a(int i10, @m0 Fragment fragment, p.b bVar) {
            this.f2707a = i10;
            this.f2708b = fragment;
            this.f2713g = fragment.F0;
            this.f2714h = bVar;
        }
    }

    @Deprecated
    public u() {
        this.f2690c = new ArrayList<>();
        this.f2697j = true;
        this.f2705r = false;
        this.f2688a = null;
        this.f2689b = null;
    }

    public u(@m0 f fVar, @o0 ClassLoader classLoader) {
        this.f2690c = new ArrayList<>();
        this.f2697j = true;
        this.f2705r = false;
        this.f2688a = fVar;
        this.f2689b = classLoader;
    }

    @m0
    public final u A(@b0 int i10, @m0 Class<? extends Fragment> cls, @o0 Bundle bundle) {
        return B(i10, cls, bundle, (String) null);
    }

    @m0
    public final u B(@b0 int i10, @m0 Class<? extends Fragment> cls, @o0 Bundle bundle, @o0 String str) {
        return z(i10, q(cls, bundle), str);
    }

    @m0
    public u C(@m0 Runnable runnable) {
        s();
        if (this.f2706s == null) {
            this.f2706s = new ArrayList<>();
        }
        this.f2706s.add(runnable);
        return this;
    }

    @Deprecated
    @m0
    public u D(boolean z10) {
        return M(z10);
    }

    @Deprecated
    @m0
    public u E(@a1 int i10) {
        this.f2701n = i10;
        this.f2702o = null;
        return this;
    }

    @Deprecated
    @m0
    public u F(@o0 CharSequence charSequence) {
        this.f2701n = 0;
        this.f2702o = charSequence;
        return this;
    }

    @Deprecated
    @m0
    public u G(@a1 int i10) {
        this.f2699l = i10;
        this.f2700m = null;
        return this;
    }

    @Deprecated
    @m0
    public u H(@o0 CharSequence charSequence) {
        this.f2699l = 0;
        this.f2700m = charSequence;
        return this;
    }

    @m0
    public u I(@b @d.a int i10, @b @d.a int i11) {
        return J(i10, i11, 0, 0);
    }

    @m0
    public u J(@b @d.a int i10, @b @d.a int i11, @b @d.a int i12, @b @d.a int i13) {
        this.f2691d = i10;
        this.f2692e = i11;
        this.f2693f = i12;
        this.f2694g = i13;
        return this;
    }

    @m0
    public u K(@m0 Fragment fragment, @m0 p.b bVar) {
        i(new a(10, fragment, bVar));
        return this;
    }

    @m0
    public u L(@o0 Fragment fragment) {
        i(new a(8, fragment));
        return this;
    }

    @m0
    public u M(boolean z10) {
        this.f2705r = z10;
        return this;
    }

    @m0
    public u N(int i10) {
        this.f2695h = i10;
        return this;
    }

    @Deprecated
    @m0
    public u O(@b1 int i10) {
        return this;
    }

    @m0
    public u P(@m0 Fragment fragment) {
        i(new a(5, fragment));
        return this;
    }

    @m0
    public u b(@b0 int i10, @m0 Fragment fragment) {
        t(i10, fragment, (String) null, 1);
        return this;
    }

    @m0
    public u c(@b0 int i10, @m0 Fragment fragment, @o0 String str) {
        t(i10, fragment, str, 1);
        return this;
    }

    @m0
    public final u d(@b0 int i10, @m0 Class<? extends Fragment> cls, @o0 Bundle bundle) {
        return b(i10, q(cls, bundle));
    }

    @m0
    public final u e(@b0 int i10, @m0 Class<? extends Fragment> cls, @o0 Bundle bundle, @o0 String str) {
        return c(i10, q(cls, bundle), str);
    }

    public u f(@m0 ViewGroup viewGroup, @m0 Fragment fragment, @o0 String str) {
        fragment.f2460u0 = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    @m0
    public u g(@m0 Fragment fragment, @o0 String str) {
        t(0, fragment, str, 1);
        return this;
    }

    @m0
    public final u h(@m0 Class<? extends Fragment> cls, @o0 Bundle bundle, @o0 String str) {
        return g(q(cls, bundle), str);
    }

    public void i(a aVar) {
        this.f2690c.add(aVar);
        aVar.f2709c = this.f2691d;
        aVar.f2710d = this.f2692e;
        aVar.f2711e = this.f2693f;
        aVar.f2712f = this.f2694g;
    }

    @m0
    public u j(@m0 View view, @m0 String str) {
        if (v.D()) {
            String w02 = w1.w0(view);
            if (w02 != null) {
                if (this.f2703p == null) {
                    this.f2703p = new ArrayList<>();
                    this.f2704q = new ArrayList<>();
                } else if (this.f2704q.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                } else if (this.f2703p.contains(w02)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + w02 + "' has already been added to the transaction.");
                }
                this.f2703p.add(w02);
                this.f2704q.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    @m0
    public u k(@o0 String str) {
        if (this.f2697j) {
            this.f2696i = true;
            this.f2698k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    @m0
    public u l(@m0 Fragment fragment) {
        i(new a(7, fragment));
        return this;
    }

    public abstract int m();

    public abstract int n();

    public abstract void o();

    public abstract void p();

    @m0
    public final Fragment q(@m0 Class<? extends Fragment> cls, @o0 Bundle bundle) {
        f fVar = this.f2688a;
        if (fVar != null) {
            ClassLoader classLoader = this.f2689b;
            if (classLoader != null) {
                Fragment a10 = fVar.a(classLoader, cls.getName());
                if (bundle != null) {
                    a10.setArguments(bundle);
                }
                return a10;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    @m0
    public u r(@m0 Fragment fragment) {
        i(new a(6, fragment));
        return this;
    }

    @m0
    public u s() {
        if (!this.f2696i) {
            this.f2697j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void t(int i10, Fragment fragment, @o0 String str, int i11) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f2452m0;
            if (str2 == null || str.equals(str2)) {
                fragment.f2452m0 = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f2452m0 + " now " + str);
            }
        }
        if (i10 != 0) {
            if (i10 != -1) {
                int i12 = fragment.f2450k0;
                if (i12 == 0 || i12 == i10) {
                    fragment.f2450k0 = i10;
                    fragment.f2451l0 = i10;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f2450k0 + " now " + i10);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        i(new a(i11, fragment));
    }

    @m0
    public u u(@m0 Fragment fragment) {
        i(new a(4, fragment));
        return this;
    }

    public boolean v() {
        return this.f2697j;
    }

    public boolean w() {
        return this.f2690c.isEmpty();
    }

    @m0
    public u x(@m0 Fragment fragment) {
        i(new a(3, fragment));
        return this;
    }

    @m0
    public u y(@b0 int i10, @m0 Fragment fragment) {
        return z(i10, fragment, (String) null);
    }

    @m0
    public u z(@b0 int i10, @m0 Fragment fragment, @o0 String str) {
        if (i10 != 0) {
            t(i10, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
}
