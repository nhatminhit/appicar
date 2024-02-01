package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.a0;
import androidx.fragment.app.c;
import d.m0;
import d.o0;
import e1.n;
import f1.s0;
import f1.w1;
import h0.z2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x0.c;

public class b extends a0 {

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2590a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.a0$e$c[] r0 = androidx.fragment.app.a0.e.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2590a = r0
                androidx.fragment.app.a0$e$c r1 = androidx.fragment.app.a0.e.c.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2590a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.a0$e$c r1 = androidx.fragment.app.a0.e.c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2590a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.a0$e$c r1 = androidx.fragment.app.a0.e.c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2590a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.a0$e$c r1 = androidx.fragment.app.a0.e.c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b.a.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.b$b  reason: collision with other inner class name */
    public class C0034b implements Runnable {
        public final /* synthetic */ List O;
        public final /* synthetic */ a0.e P;

        public C0034b(List list, a0.e eVar) {
            this.O = list;
            this.P = eVar;
        }

        public void run() {
            if (this.O.contains(this.P)) {
                this.O.remove(this.P);
                b.this.s(this.P);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2591a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f2592b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f2593c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a0.e f2594d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ k f2595e;

        public c(ViewGroup viewGroup, View view, boolean z10, a0.e eVar, k kVar) {
            this.f2591a = viewGroup;
            this.f2592b = view;
            this.f2593c = z10;
            this.f2594d = eVar;
            this.f2595e = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2591a.endViewTransition(this.f2592b);
            if (this.f2593c) {
                this.f2594d.e().a(this.f2592b);
            }
            this.f2595e.a();
        }
    }

    public class d implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Animator f2597a;

        public d(Animator animator) {
            this.f2597a = animator;
        }

        public void onCancel() {
            this.f2597a.end();
        }
    }

    public class e implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2599a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f2600b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k f2601c;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                e eVar = e.this;
                eVar.f2599a.endViewTransition(eVar.f2600b);
                e.this.f2601c.a();
            }
        }

        public e(ViewGroup viewGroup, View view, k kVar) {
            this.f2599a = viewGroup;
            this.f2600b = view;
            this.f2601c = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f2599a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public class f implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f2603a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2604b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k f2605c;

        public f(View view, ViewGroup viewGroup, k kVar) {
            this.f2603a = view;
            this.f2604b = viewGroup;
            this.f2605c = kVar;
        }

        public void onCancel() {
            this.f2603a.clearAnimation();
            this.f2604b.endViewTransition(this.f2603a);
            this.f2605c.a();
        }
    }

    public class g implements Runnable {
        public final /* synthetic */ a0.e O;
        public final /* synthetic */ a0.e P;
        public final /* synthetic */ boolean Q;
        public final /* synthetic */ androidx.collection.a R;

        public g(a0.e eVar, a0.e eVar2, boolean z10, androidx.collection.a aVar) {
            this.O = eVar;
            this.P = eVar2;
            this.Q = z10;
            this.R = aVar;
        }

        public void run() {
            v.f(this.O.f(), this.P.f(), this.Q, this.R, false);
        }
    }

    public class h implements Runnable {
        public final /* synthetic */ x O;
        public final /* synthetic */ View P;
        public final /* synthetic */ Rect Q;

        public h(x xVar, View view, Rect rect) {
            this.O = xVar;
            this.P = view;
            this.Q = rect;
        }

        public void run() {
            this.O.k(this.P, this.Q);
        }
    }

    public class i implements Runnable {
        public final /* synthetic */ ArrayList O;

        public i(ArrayList arrayList) {
            this.O = arrayList;
        }

        public void run() {
            v.B(this.O, 4);
        }
    }

    public class j implements Runnable {
        public final /* synthetic */ m O;

        public j(m mVar) {
            this.O = mVar;
        }

        public void run() {
            this.O.a();
        }
    }

    public static class k extends l {

        /* renamed from: c  reason: collision with root package name */
        public boolean f2607c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2608d = false;
        @o0

        /* renamed from: e  reason: collision with root package name */
        public c.d f2609e;

        public k(@m0 a0.e eVar, @m0 x0.c cVar, boolean z10) {
            super(eVar, cVar);
            this.f2607c = z10;
        }

        @o0
        public c.d e(@m0 Context context) {
            if (this.f2608d) {
                return this.f2609e;
            }
            c.d c10 = c.c(context, b().f(), b().e() == a0.e.c.VISIBLE, this.f2607c);
            this.f2609e = c10;
            this.f2608d = true;
            return c10;
        }
    }

    public static class l {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final a0.e f2610a;
        @m0

        /* renamed from: b  reason: collision with root package name */
        public final x0.c f2611b;

        public l(@m0 a0.e eVar, @m0 x0.c cVar) {
            this.f2610a = eVar;
            this.f2611b = cVar;
        }

        public void a() {
            this.f2610a.d(this.f2611b);
        }

        @m0
        public a0.e b() {
            return this.f2610a;
        }

        @m0
        public x0.c c() {
            return this.f2611b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
            r2 = androidx.fragment.app.a0.e.c.VISIBLE;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean d() {
            /*
                r3 = this;
                androidx.fragment.app.a0$e r0 = r3.f2610a
                androidx.fragment.app.Fragment r0 = r0.f()
                android.view.View r0 = r0.f2461v0
                androidx.fragment.app.a0$e$c r0 = androidx.fragment.app.a0.e.c.d(r0)
                androidx.fragment.app.a0$e r1 = r3.f2610a
                androidx.fragment.app.a0$e$c r1 = r1.e()
                if (r0 == r1) goto L_0x001d
                androidx.fragment.app.a0$e$c r2 = androidx.fragment.app.a0.e.c.VISIBLE
                if (r0 == r2) goto L_0x001b
                if (r1 == r2) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r0 = 0
                goto L_0x001e
            L_0x001d:
                r0 = 1
            L_0x001e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b.l.d():boolean");
        }
    }

    public static class m extends l {
        @o0

        /* renamed from: c  reason: collision with root package name */
        public final Object f2612c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2613d;
        @o0

        /* renamed from: e  reason: collision with root package name */
        public final Object f2614e;

        public m(@m0 a0.e eVar, @m0 x0.c cVar, boolean z10, boolean z11) {
            super(eVar, cVar);
            boolean z12;
            Object obj;
            if (eVar.e() == a0.e.c.VISIBLE) {
                Fragment f10 = eVar.f();
                this.f2612c = z10 ? f10.getReenterTransition() : f10.getEnterTransition();
                Fragment f11 = eVar.f();
                z12 = z10 ? f11.getAllowReturnTransitionOverlap() : f11.getAllowEnterTransitionOverlap();
            } else {
                Fragment f12 = eVar.f();
                this.f2612c = z10 ? f12.getReturnTransition() : f12.getExitTransition();
                z12 = true;
            }
            this.f2613d = z12;
            if (z11) {
                Fragment f13 = eVar.f();
                obj = z10 ? f13.getSharedElementReturnTransition() : f13.getSharedElementEnterTransition();
            } else {
                obj = null;
            }
            this.f2614e = obj;
        }

        @o0
        public x e() {
            x f10 = f(this.f2612c);
            x f11 = f(this.f2614e);
            if (f10 == null || f11 == null || f10 == f11) {
                return f10 != null ? f10 : f11;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f2612c + " which uses a different Transition  type than its shared element transition " + this.f2614e);
        }

        @o0
        public final x f(Object obj) {
            if (obj == null) {
                return null;
            }
            x xVar = v.f2716b;
            if (xVar != null && xVar.e(obj)) {
                return xVar;
            }
            x xVar2 = v.f2717c;
            if (xVar2 != null && xVar2.e(obj)) {
                return xVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        @o0
        public Object g() {
            return this.f2614e;
        }

        @o0
        public Object h() {
            return this.f2612c;
        }

        public boolean i() {
            return this.f2614e != null;
        }

        public boolean j() {
            return this.f2613d;
        }
    }

    public b(@m0 ViewGroup viewGroup) {
        super(viewGroup);
    }

    public void f(@m0 List<a0.e> list, boolean z10) {
        a0.e eVar = null;
        a0.e eVar2 = null;
        for (a0.e next : list) {
            a0.e.c d10 = a0.e.c.d(next.f().f2461v0);
            int i10 = a.f2590a[next.e().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                if (d10 == a0.e.c.VISIBLE && eVar == null) {
                    eVar = next;
                }
            } else if (i10 == 4 && d10 != a0.e.c.VISIBLE) {
                eVar2 = next;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<a0.e> arrayList3 = new ArrayList<>(list);
        for (a0.e next2 : list) {
            x0.c cVar = new x0.c();
            next2.j(cVar);
            arrayList.add(new k(next2, cVar, z10));
            x0.c cVar2 = new x0.c();
            next2.j(cVar2);
            boolean z11 = false;
            if (z10) {
                if (next2 != eVar) {
                    arrayList2.add(new m(next2, cVar2, z10, z11));
                    next2.a(new C0034b(arrayList3, next2));
                }
            } else if (next2 != eVar2) {
                arrayList2.add(new m(next2, cVar2, z10, z11));
                next2.a(new C0034b(arrayList3, next2));
            }
            z11 = true;
            arrayList2.add(new m(next2, cVar2, z10, z11));
            next2.a(new C0034b(arrayList3, next2));
        }
        Map<a0.e, Boolean> x10 = x(arrayList2, arrayList3, z10, eVar, eVar2);
        w(arrayList, arrayList3, x10.containsValue(Boolean.TRUE), x10);
        for (a0.e s10 : arrayList3) {
            s(s10);
        }
        arrayList3.clear();
    }

    public void s(@m0 a0.e eVar) {
        eVar.e().a(eVar.f().f2461v0);
    }

    public void t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            if (!arrayList.contains(view) && w1.w0(view) != null) {
                arrayList.add(view);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    t(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void u(Map<String, View> map, @m0 View view) {
        String w02 = w1.w0(view);
        if (w02 != null) {
            map.put(w02, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    public void v(@m0 androidx.collection.a<String, View> aVar, @m0 Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(w1.w0((View) it.next().getValue()))) {
                it.remove();
            }
        }
    }

    public final void w(@m0 List<k> list, @m0 List<a0.e> list2, boolean z10, @m0 Map<a0.e, Boolean> map) {
        StringBuilder sb2;
        String str;
        c.d e10;
        ViewGroup m10 = m();
        Context context = m10.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (k next : list) {
            if (!next.d() && (e10 = next.e(context)) != null) {
                Animator animator = e10.f2626b;
                if (animator == null) {
                    arrayList.add(next);
                } else {
                    a0.e b10 = next.b();
                    Fragment f10 = b10.f();
                    if (Boolean.TRUE.equals(map.get(b10))) {
                        if (FragmentManager.T0(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Ignoring Animator set on ");
                            sb3.append(f10);
                            sb3.append(" as this Fragment was involved in a Transition.");
                        }
                        next.a();
                    } else {
                        boolean z12 = b10.e() == a0.e.c.GONE;
                        List<a0.e> list3 = list2;
                        if (z12) {
                            list3.remove(b10);
                        }
                        View view = f10.f2461v0;
                        m10.startViewTransition(view);
                        c cVar = r0;
                        View view2 = view;
                        c cVar2 = new c(m10, view2, z12, b10, next);
                        animator.addListener(cVar);
                        animator.setTarget(view2);
                        animator.start();
                        next.c().d(new d(animator));
                        z11 = true;
                    }
                }
            } else {
                next.a();
            }
            Map<a0.e, Boolean> map2 = map;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            a0.e b11 = kVar.b();
            Fragment f11 = b11.f();
            if (z10) {
                if (FragmentManager.T0(2)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(f11);
                    str = " as Animations cannot run alongside Transitions.";
                }
                kVar.a();
            } else if (z11) {
                if (FragmentManager.T0(2)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(f11);
                    str = " as Animations cannot run alongside Animators.";
                }
                kVar.a();
            } else {
                View view3 = f11.f2461v0;
                Animation animation = (Animation) n.g(((c.d) n.g(kVar.e(context))).f2625a);
                if (b11.e() != a0.e.c.REMOVED) {
                    view3.startAnimation(animation);
                    kVar.a();
                } else {
                    m10.startViewTransition(view3);
                    c.e eVar = new c.e(animation, m10, view3);
                    eVar.setAnimationListener(new e(m10, view3, kVar));
                    view3.startAnimation(eVar);
                }
                kVar.c().d(new f(view3, m10, kVar));
            }
            sb2.append(str);
            kVar.a();
        }
    }

    @m0
    public final Map<a0.e, Boolean> x(@m0 List<m> list, @m0 List<a0.e> list2, boolean z10, @o0 a0.e eVar, @o0 a0.e eVar2) {
        Iterator<m> it;
        ArrayList arrayList;
        ArrayList arrayList2;
        View view;
        Object obj;
        View view2;
        a0.e eVar3;
        a0.e eVar4;
        Object obj2;
        Object obj3;
        androidx.collection.a aVar;
        a0.e eVar5;
        x xVar;
        View view3;
        Rect rect;
        ArrayList arrayList3;
        ArrayList arrayList4;
        a0.e eVar6;
        z2 z2Var;
        z2 z2Var2;
        ArrayList<String> arrayList5;
        View view4;
        View view5;
        String q10;
        ArrayList<String> arrayList6;
        boolean z11 = z10;
        a0.e eVar7 = eVar;
        a0.e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        x xVar2 = null;
        for (m next : list) {
            if (!next.d()) {
                x e10 = next.e();
                if (xVar2 == null) {
                    xVar2 = e10;
                } else if (!(e10 == null || xVar2 == e10)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + next.b().f() + " returned Transition " + next.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (xVar2 == null) {
            for (m next2 : list) {
                hashMap.put(next2.b(), Boolean.FALSE);
                next2.a();
            }
            return hashMap;
        }
        View view6 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        androidx.collection.a aVar2 = new androidx.collection.a();
        Object obj4 = null;
        View view7 = null;
        boolean z12 = false;
        for (m next3 : list) {
            if (!next3.i() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                arrayList4 = arrayList8;
                eVar6 = eVar7;
                arrayList3 = arrayList7;
                rect = rect2;
                xVar = xVar2;
                eVar5 = eVar8;
                view3 = view6;
                view7 = view7;
            } else {
                Object B = xVar2.B(xVar2.g(next3.g()));
                ArrayList<String> N = eVar2.f().N();
                ArrayList<String> N2 = eVar.f().N();
                ArrayList<String> O = eVar.f().O();
                Object obj5 = B;
                View view8 = view7;
                int i10 = 0;
                while (i10 < O.size()) {
                    int indexOf = N.indexOf(O.get(i10));
                    ArrayList<String> arrayList9 = O;
                    if (indexOf != -1) {
                        N.set(indexOf, N2.get(i10));
                    }
                    i10++;
                    O = arrayList9;
                }
                ArrayList<String> O2 = eVar2.f().O();
                Fragment f10 = eVar.f();
                if (!z11) {
                    z2Var2 = f10.E();
                    z2Var = eVar2.f().C();
                } else {
                    z2Var2 = f10.C();
                    z2Var = eVar2.f().E();
                }
                int i11 = 0;
                for (int size = N.size(); i11 < size; size = size) {
                    aVar2.put(N.get(i11), O2.get(i11));
                    i11++;
                    a0.e eVar9 = eVar;
                }
                androidx.collection.a aVar3 = new androidx.collection.a();
                u(aVar3, eVar.f().f2461v0);
                aVar3.u(N);
                if (z2Var2 != null) {
                    z2Var2.d(N, aVar3);
                    int size2 = N.size() - 1;
                    while (size2 >= 0) {
                        String str = N.get(size2);
                        View view9 = (View) aVar3.get(str);
                        if (view9 == null) {
                            aVar2.remove(str);
                            arrayList6 = N;
                        } else {
                            arrayList6 = N;
                            if (!str.equals(w1.w0(view9))) {
                                aVar2.put(w1.w0(view9), (String) aVar2.remove(str));
                            }
                        }
                        size2--;
                        N = arrayList6;
                    }
                    arrayList5 = N;
                } else {
                    arrayList5 = N;
                    aVar2.u(aVar3.keySet());
                }
                androidx.collection.a aVar4 = new androidx.collection.a();
                u(aVar4, eVar2.f().f2461v0);
                aVar4.u(O2);
                aVar4.u(aVar2.values());
                if (z2Var != null) {
                    z2Var.d(O2, aVar4);
                    for (int size3 = O2.size() - 1; size3 >= 0; size3--) {
                        String str2 = O2.get(size3);
                        View view10 = (View) aVar4.get(str2);
                        if (view10 == null) {
                            String q11 = v.q(aVar2, str2);
                            if (q11 != null) {
                                aVar2.remove(q11);
                            }
                        } else if (!str2.equals(w1.w0(view10)) && (q10 = v.q(aVar2, str2)) != null) {
                            aVar2.put(q10, w1.w0(view10));
                        }
                    }
                } else {
                    v.y(aVar2, aVar4);
                }
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    eVar6 = eVar;
                    aVar = aVar2;
                    arrayList4 = arrayList8;
                    arrayList3 = arrayList7;
                    rect = rect2;
                    view3 = view6;
                    xVar = xVar2;
                    view7 = view8;
                    obj4 = null;
                    eVar5 = eVar2;
                } else {
                    v.f(eVar2.f(), eVar.f(), z11, aVar3, true);
                    ArrayList<String> arrayList10 = arrayList5;
                    HashMap hashMap2 = hashMap;
                    Object obj6 = obj5;
                    g gVar = r0;
                    View view11 = view6;
                    View view12 = view8;
                    ViewGroup m10 = m();
                    Rect rect3 = rect2;
                    aVar = aVar2;
                    ArrayList arrayList11 = arrayList8;
                    g gVar2 = new g(eVar2, eVar, z10, aVar4);
                    s0.a(m10, gVar);
                    for (View t10 : aVar3.values()) {
                        t(arrayList7, t10);
                    }
                    if (!arrayList10.isEmpty()) {
                        View view13 = (View) aVar3.get(arrayList10.get(0));
                        xVar2.v(obj6, view13);
                        view7 = view13;
                    } else {
                        view7 = view12;
                    }
                    for (View t11 : aVar4.values()) {
                        t(arrayList11, t11);
                    }
                    arrayList4 = arrayList11;
                    if (O2.isEmpty() || (view5 = (View) aVar4.get(O2.get(0))) == null) {
                        rect = rect3;
                        view4 = view11;
                    } else {
                        rect = rect3;
                        s0.a(m(), new h(xVar2, view5, rect));
                        view4 = view11;
                        z12 = true;
                    }
                    xVar2.z(obj6, view4, arrayList7);
                    arrayList3 = arrayList7;
                    view3 = view4;
                    xVar = xVar2;
                    xVar2.t(obj6, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, obj6, arrayList4);
                    Boolean bool = Boolean.TRUE;
                    eVar6 = eVar;
                    hashMap = hashMap2;
                    hashMap.put(eVar6, bool);
                    eVar5 = eVar2;
                    hashMap.put(eVar5, bool);
                    obj4 = obj6;
                }
            }
            z11 = z10;
            eVar7 = eVar6;
            arrayList7 = arrayList3;
            rect2 = rect;
            view6 = view3;
            eVar8 = eVar5;
            aVar2 = aVar;
            arrayList8 = arrayList4;
            xVar2 = xVar;
        }
        View view14 = view7;
        androidx.collection.a aVar5 = aVar2;
        ArrayList arrayList12 = arrayList8;
        a0.e eVar10 = eVar7;
        ArrayList arrayList13 = arrayList7;
        Rect rect4 = rect2;
        x xVar3 = xVar2;
        a0.e eVar11 = eVar8;
        View view15 = view6;
        ArrayList arrayList14 = new ArrayList();
        Iterator<m> it2 = list.iterator();
        Object obj7 = null;
        Object obj8 = null;
        while (it2.hasNext()) {
            m next4 = it2.next();
            if (next4.d()) {
                hashMap.put(next4.b(), Boolean.FALSE);
                next4.a();
            } else {
                Object g10 = xVar3.g(next4.h());
                a0.e b10 = next4.b();
                boolean z13 = obj4 != null && (b10 == eVar10 || b10 == eVar11);
                if (g10 == null) {
                    if (!z13) {
                        hashMap.put(b10, Boolean.FALSE);
                        next4.a();
                    }
                    List<a0.e> list3 = list2;
                    arrayList = arrayList12;
                    arrayList2 = arrayList13;
                    it = it2;
                    view = view15;
                    obj = obj7;
                    eVar3 = eVar11;
                    view2 = view14;
                } else {
                    it = it2;
                    ArrayList arrayList15 = new ArrayList();
                    Object obj9 = obj7;
                    t(arrayList15, b10.f().f2461v0);
                    if (z13) {
                        if (b10 == eVar10) {
                            arrayList15.removeAll(arrayList13);
                        } else {
                            arrayList15.removeAll(arrayList12);
                        }
                    }
                    if (arrayList15.isEmpty()) {
                        xVar3.a(g10, view15);
                        arrayList = arrayList12;
                        arrayList2 = arrayList13;
                        view = view15;
                        eVar4 = b10;
                        obj3 = obj8;
                        eVar3 = eVar11;
                        obj2 = obj9;
                        List<a0.e> list4 = list2;
                    } else {
                        xVar3.b(g10, arrayList15);
                        view = view15;
                        a0.e eVar12 = b10;
                        obj2 = obj9;
                        arrayList2 = arrayList13;
                        obj3 = obj8;
                        arrayList = arrayList12;
                        eVar3 = eVar11;
                        xVar3.t(g10, g10, arrayList15, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null);
                        if (eVar12.e() == a0.e.c.GONE) {
                            eVar4 = eVar12;
                            list2.remove(eVar4);
                            xVar3.r(g10, eVar4.f().f2461v0, arrayList15);
                            s0.a(m(), new i(arrayList15));
                        } else {
                            List<a0.e> list5 = list2;
                            eVar4 = eVar12;
                        }
                    }
                    if (eVar4.e() == a0.e.c.VISIBLE) {
                        arrayList14.addAll(arrayList15);
                        if (z12) {
                            xVar3.u(g10, rect4);
                        }
                        view2 = view14;
                    } else {
                        view2 = view14;
                        xVar3.v(g10, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (next4.j()) {
                        obj8 = xVar3.n(obj3, g10, (Object) null);
                        obj = obj2;
                    } else {
                        obj = xVar3.n(obj2, g10, (Object) null);
                        obj8 = obj3;
                    }
                }
                eVar11 = eVar3;
                view14 = view2;
                obj7 = obj;
                view15 = view;
                arrayList13 = arrayList2;
                arrayList12 = arrayList;
                it2 = it;
            }
        }
        ArrayList arrayList16 = arrayList12;
        ArrayList arrayList17 = arrayList13;
        a0.e eVar13 = eVar11;
        Object m11 = xVar3.m(obj8, obj7, obj4);
        for (m next5 : list) {
            if (!next5.d()) {
                Object h10 = next5.h();
                a0.e b11 = next5.b();
                boolean z14 = obj4 != null && (b11 == eVar10 || b11 == eVar13);
                if (h10 != null || z14) {
                    if (!w1.T0(m())) {
                        if (FragmentManager.T0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("SpecialEffectsController: Container ");
                            sb2.append(m());
                            sb2.append(" has not been laid out. Completing operation ");
                            sb2.append(b11);
                        }
                        next5.a();
                    } else {
                        xVar3.w(next5.b().f(), m11, next5.c(), new j(next5));
                    }
                }
            }
        }
        if (!w1.T0(m())) {
            return hashMap;
        }
        v.B(arrayList14, 4);
        ArrayList arrayList18 = arrayList16;
        ArrayList<String> o10 = xVar3.o(arrayList18);
        xVar3.c(m(), m11);
        xVar3.y(m(), arrayList17, arrayList18, o10, aVar5);
        v.B(arrayList14, 0);
        xVar3.A(obj4, arrayList17, arrayList18);
        return hashMap;
    }
}
