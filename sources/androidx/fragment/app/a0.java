package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import d.i;
import d.m0;
import d.o0;
import f1.w1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import x0.c;
import x1.a;

public abstract class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f2574a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<e> f2575b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<e> f2576c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f2577d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2578e = false;

    public class a implements Runnable {
        public final /* synthetic */ d O;

        public a(d dVar) {
            this.O = dVar;
        }

        public void run() {
            if (a0.this.f2575b.contains(this.O)) {
                this.O.e().a(this.O.f().f2461v0);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ d O;

        public b(d dVar) {
            this.O = dVar;
        }

        public void run() {
            a0.this.f2575b.remove(this.O);
            a0.this.f2576c.remove(this.O);
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2579a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f2580b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.a0$e$b[] r0 = androidx.fragment.app.a0.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2580b = r0
                r1 = 1
                androidx.fragment.app.a0$e$b r2 = androidx.fragment.app.a0.e.b.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2580b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.a0$e$b r3 = androidx.fragment.app.a0.e.b.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f2580b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.a0$e$b r4 = androidx.fragment.app.a0.e.b.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.a0$e$c[] r3 = androidx.fragment.app.a0.e.c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f2579a = r3
                androidx.fragment.app.a0$e$c r4 = androidx.fragment.app.a0.e.c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f2579a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.a0$e$c r3 = androidx.fragment.app.a0.e.c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f2579a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.a0$e$c r1 = androidx.fragment.app.a0.e.c.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f2579a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.a0$e$c r1 = androidx.fragment.app.a0.e.c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a0.c.<clinit>():void");
        }
    }

    public static class d extends e {
        @m0

        /* renamed from: h  reason: collision with root package name */
        public final q f2581h;

        public d(@m0 e.c cVar, @m0 e.b bVar, @m0 q qVar, @m0 x0.c cVar2) {
            super(cVar, bVar, qVar.k(), cVar2);
            this.f2581h = qVar;
        }

        public void c() {
            super.c();
            this.f2581h.m();
        }

        public void l() {
            if (g() == e.b.ADDING) {
                Fragment k10 = this.f2581h.k();
                View findFocus = k10.f2461v0.findFocus();
                if (findFocus != null) {
                    k10.C0(findFocus);
                    if (FragmentManager.T0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("requestFocus: Saved focused view ");
                        sb2.append(findFocus);
                        sb2.append(" for Fragment ");
                        sb2.append(k10);
                    }
                }
                View requireView = f().requireView();
                if (requireView.getParent() == null) {
                    this.f2581h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k10.M());
            }
        }
    }

    public static class e {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public c f2582a;
        @m0

        /* renamed from: b  reason: collision with root package name */
        public b f2583b;
        @m0

        /* renamed from: c  reason: collision with root package name */
        public final Fragment f2584c;
        @m0

        /* renamed from: d  reason: collision with root package name */
        public final List<Runnable> f2585d = new ArrayList();
        @m0

        /* renamed from: e  reason: collision with root package name */
        public final HashSet<x0.c> f2586e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        public boolean f2587f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2588g = false;

        public class a implements c.a {
            public a() {
            }

            public void onCancel() {
                e.this.b();
            }
        }

        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            @m0
            public static c b(int i10) {
                if (i10 == 0) {
                    return VISIBLE;
                }
                if (i10 == 4) {
                    return INVISIBLE;
                }
                if (i10 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i10);
            }

            @m0
            public static c d(@m0 View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
            }

            public void a(@m0 View view) {
                int i10;
                int i11 = c.f2579a[ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        if (FragmentManager.T0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("SpecialEffectsController: Setting view ");
                            sb2.append(view);
                            sb2.append(" to VISIBLE");
                        }
                        i10 = 0;
                    } else if (i11 == 3) {
                        if (FragmentManager.T0(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("SpecialEffectsController: Setting view ");
                            sb3.append(view);
                            sb3.append(" to GONE");
                        }
                        i10 = 8;
                    } else if (i11 == 4) {
                        if (FragmentManager.T0(2)) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("SpecialEffectsController: Setting view ");
                            sb4.append(view);
                            sb4.append(" to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    } else {
                        return;
                    }
                    view.setVisibility(i10);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (FragmentManager.T0(2)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("SpecialEffectsController: Removing view ");
                        sb5.append(view);
                        sb5.append(" from container ");
                        sb5.append(viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        public e(@m0 c cVar, @m0 b bVar, @m0 Fragment fragment, @m0 x0.c cVar2) {
            this.f2582a = cVar;
            this.f2583b = bVar;
            this.f2584c = fragment;
            cVar2.d(new a());
        }

        public final void a(@m0 Runnable runnable) {
            this.f2585d.add(runnable);
        }

        public final void b() {
            if (!h()) {
                this.f2587f = true;
                if (this.f2586e.isEmpty()) {
                    c();
                    return;
                }
                Iterator it = new ArrayList(this.f2586e).iterator();
                while (it.hasNext()) {
                    ((x0.c) it.next()).a();
                }
            }
        }

        @i
        public void c() {
            if (!this.f2588g) {
                if (FragmentManager.T0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(this);
                    sb2.append(" has called complete.");
                }
                this.f2588g = true;
                for (Runnable run : this.f2585d) {
                    run.run();
                }
            }
        }

        public final void d(@m0 x0.c cVar) {
            if (this.f2586e.remove(cVar) && this.f2586e.isEmpty()) {
                c();
            }
        }

        @m0
        public c e() {
            return this.f2582a;
        }

        @m0
        public final Fragment f() {
            return this.f2584c;
        }

        @m0
        public b g() {
            return this.f2583b;
        }

        public final boolean h() {
            return this.f2587f;
        }

        public final boolean i() {
            return this.f2588g;
        }

        public final void j(@m0 x0.c cVar) {
            l();
            this.f2586e.add(cVar);
        }

        public final void k(@m0 c cVar, @m0 b bVar) {
            b bVar2;
            int i10 = c.f2580b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    if (FragmentManager.T0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: For fragment ");
                        sb2.append(this.f2584c);
                        sb2.append(" mFinalState = ");
                        sb2.append(this.f2582a);
                        sb2.append(" -> REMOVED. mLifecycleImpact  = ");
                        sb2.append(this.f2583b);
                        sb2.append(" to REMOVING.");
                    }
                    this.f2582a = c.REMOVED;
                    bVar2 = b.REMOVING;
                } else if (i10 == 3 && this.f2582a != c.REMOVED) {
                    if (FragmentManager.T0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: For fragment ");
                        sb3.append(this.f2584c);
                        sb3.append(" mFinalState = ");
                        sb3.append(this.f2582a);
                        sb3.append(" -> ");
                        sb3.append(cVar);
                        sb3.append(". ");
                    }
                    this.f2582a = cVar;
                    return;
                } else {
                    return;
                }
            } else if (this.f2582a == c.REMOVED) {
                if (FragmentManager.T0(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("SpecialEffectsController: For fragment ");
                    sb4.append(this.f2584c);
                    sb4.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    sb4.append(this.f2583b);
                    sb4.append(" to ADDING.");
                }
                this.f2582a = c.VISIBLE;
                bVar2 = b.ADDING;
            } else {
                return;
            }
            this.f2583b = bVar2;
        }

        public void l() {
        }

        @m0
        public String toString() {
            return "Operation " + p7.a.f11638i + Integer.toHexString(System.identityHashCode(this)) + "} " + p7.a.f11638i + "mFinalState = " + this.f2582a + "} " + p7.a.f11638i + "mLifecycleImpact = " + this.f2583b + "} " + p7.a.f11638i + "mFragment = " + this.f2584c + p7.a.f11639j;
        }
    }

    public a0(@m0 ViewGroup viewGroup) {
        this.f2574a = viewGroup;
    }

    @m0
    public static a0 n(@m0 ViewGroup viewGroup, @m0 FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.M0());
    }

    @m0
    public static a0 o(@m0 ViewGroup viewGroup, @m0 b0 b0Var) {
        int i10 = a.g.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof a0) {
            return (a0) tag;
        }
        a0 a10 = b0Var.a(viewGroup);
        viewGroup.setTag(i10, a10);
        return a10;
    }

    public final void a(@m0 e.c cVar, @m0 e.b bVar, @m0 q qVar) {
        synchronized (this.f2575b) {
            x0.c cVar2 = new x0.c();
            e h10 = h(qVar.k());
            if (h10 != null) {
                h10.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, qVar, cVar2);
            this.f2575b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    public void b(@m0 e.c cVar, @m0 q qVar) {
        if (FragmentManager.T0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb2.append(qVar.k());
        }
        a(cVar, e.b.ADDING, qVar);
    }

    public void c(@m0 q qVar) {
        if (FragmentManager.T0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb2.append(qVar.k());
        }
        a(e.c.GONE, e.b.NONE, qVar);
    }

    public void d(@m0 q qVar) {
        if (FragmentManager.T0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb2.append(qVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, qVar);
    }

    public void e(@m0 q qVar) {
        if (FragmentManager.T0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb2.append(qVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, qVar);
    }

    public abstract void f(@m0 List<e> list, boolean z10);

    public void g() {
        if (!this.f2578e) {
            if (!w1.N0(this.f2574a)) {
                j();
                this.f2577d = false;
                return;
            }
            synchronized (this.f2575b) {
                if (!this.f2575b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f2576c);
                    this.f2576c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (FragmentManager.T0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("SpecialEffectsController: Cancelling operation ");
                            sb2.append(eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.f2576c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f2575b);
                    this.f2575b.clear();
                    this.f2576c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).l();
                    }
                    f(arrayList2, this.f2577d);
                    this.f2577d = false;
                }
            }
        }
    }

    @o0
    public final e h(@m0 Fragment fragment) {
        Iterator<e> it = this.f2575b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    @o0
    public final e i(@m0 Fragment fragment) {
        Iterator<e> it = this.f2576c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    public void j() {
        String str;
        String str2;
        boolean N0 = w1.N0(this.f2574a);
        synchronized (this.f2575b) {
            q();
            Iterator<e> it = this.f2575b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            Iterator it2 = new ArrayList(this.f2576c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (FragmentManager.T0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (N0) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f2574a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(eVar);
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.f2575b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (FragmentManager.T0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (N0) {
                        str = "";
                    } else {
                        str = "Container " + this.f2574a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                }
                eVar2.b();
            }
        }
    }

    public void k() {
        if (this.f2578e) {
            this.f2578e = false;
            g();
        }
    }

    @o0
    public e.b l(@m0 q qVar) {
        e h10 = h(qVar.k());
        if (h10 != null) {
            return h10.g();
        }
        e i10 = i(qVar.k());
        if (i10 != null) {
            return i10.g();
        }
        return null;
    }

    @m0
    public ViewGroup m() {
        return this.f2574a;
    }

    public void p() {
        synchronized (this.f2575b) {
            q();
            this.f2578e = false;
            int size = this.f2575b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f2575b.get(size);
                e.c d10 = e.c.d(eVar.f().f2461v0);
                e.c e10 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e10 == cVar && d10 != cVar) {
                    this.f2578e = eVar.f().T();
                    break;
                }
                size--;
            }
        }
    }

    public final void q() {
        Iterator<e> it = this.f2575b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.b(next.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    public void r(boolean z10) {
        this.f2577d = z10;
    }
}
