package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import f1.s0;
import f1.w1;
import g3.p;
import h0.z2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class v {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f2715a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    public static final x f2716b = new w();

    /* renamed from: c  reason: collision with root package name */
    public static final x f2717c = x();

    public class a implements Runnable {
        public final /* synthetic */ g O;
        public final /* synthetic */ Fragment P;
        public final /* synthetic */ x0.c Q;

        public a(g gVar, Fragment fragment, x0.c cVar) {
            this.O = gVar;
            this.P = fragment;
            this.Q = cVar;
        }

        public void run() {
            this.O.b(this.P, this.Q);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ ArrayList O;

        public b(ArrayList arrayList) {
            this.O = arrayList;
        }

        public void run() {
            v.B(this.O, 4);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ g O;
        public final /* synthetic */ Fragment P;
        public final /* synthetic */ x0.c Q;

        public c(g gVar, Fragment fragment, x0.c cVar) {
            this.O = gVar;
            this.P = fragment;
            this.Q = cVar;
        }

        public void run() {
            this.O.b(this.P, this.Q);
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ Object O;
        public final /* synthetic */ x P;
        public final /* synthetic */ View Q;
        public final /* synthetic */ Fragment R;
        public final /* synthetic */ ArrayList S;
        public final /* synthetic */ ArrayList T;
        public final /* synthetic */ ArrayList U;
        public final /* synthetic */ Object V;

        public d(Object obj, x xVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.O = obj;
            this.P = xVar;
            this.Q = view;
            this.R = fragment;
            this.S = arrayList;
            this.T = arrayList2;
            this.U = arrayList3;
            this.V = obj2;
        }

        public void run() {
            Object obj = this.O;
            if (obj != null) {
                this.P.p(obj, this.Q);
                this.T.addAll(v.k(this.P, this.O, this.R, this.S, this.Q));
            }
            if (this.U != null) {
                if (this.V != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.Q);
                    this.P.q(this.V, this.U, arrayList);
                }
                this.U.clear();
                this.U.add(this.Q);
            }
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ Fragment O;
        public final /* synthetic */ Fragment P;
        public final /* synthetic */ boolean Q;
        public final /* synthetic */ androidx.collection.a R;
        public final /* synthetic */ View S;
        public final /* synthetic */ x T;
        public final /* synthetic */ Rect U;

        public e(Fragment fragment, Fragment fragment2, boolean z10, androidx.collection.a aVar, View view, x xVar, Rect rect) {
            this.O = fragment;
            this.P = fragment2;
            this.Q = z10;
            this.R = aVar;
            this.S = view;
            this.T = xVar;
            this.U = rect;
        }

        public void run() {
            v.f(this.O, this.P, this.Q, this.R, false);
            View view = this.S;
            if (view != null) {
                this.T.k(view, this.U);
            }
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ x O;
        public final /* synthetic */ androidx.collection.a P;
        public final /* synthetic */ Object Q;
        public final /* synthetic */ h R;
        public final /* synthetic */ ArrayList S;
        public final /* synthetic */ View T;
        public final /* synthetic */ Fragment U;
        public final /* synthetic */ Fragment V;
        public final /* synthetic */ boolean W;
        public final /* synthetic */ ArrayList X;
        public final /* synthetic */ Object Y;
        public final /* synthetic */ Rect Z;

        public f(x xVar, androidx.collection.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z10, ArrayList arrayList2, Object obj2, Rect rect) {
            this.O = xVar;
            this.P = aVar;
            this.Q = obj;
            this.R = hVar;
            this.S = arrayList;
            this.T = view;
            this.U = fragment;
            this.V = fragment2;
            this.W = z10;
            this.X = arrayList2;
            this.Y = obj2;
            this.Z = rect;
        }

        public void run() {
            androidx.collection.a<String, View> h10 = v.h(this.O, this.P, this.Q, this.R);
            if (h10 != null) {
                this.S.addAll(h10.values());
                this.S.add(this.T);
            }
            v.f(this.U, this.V, this.W, h10, false);
            Object obj = this.Q;
            if (obj != null) {
                this.O.A(obj, this.X, this.S);
                View t10 = v.t(h10, this.R, this.Y, this.W);
                if (t10 != null) {
                    this.O.k(t10, this.Z);
                }
            }
        }
    }

    public interface g {
        void a(@m0 Fragment fragment, @m0 x0.c cVar);

        void b(@m0 Fragment fragment, @m0 x0.c cVar);
    }

    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f2718a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2719b;

        /* renamed from: c  reason: collision with root package name */
        public a f2720c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f2721d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2722e;

        /* renamed from: f  reason: collision with root package name */
        public a f2723f;
    }

    public static void A(x xVar, Object obj, Object obj2, androidx.collection.a<String, View> aVar, boolean z10, a aVar2) {
        ArrayList<String> arrayList = aVar2.f2703p;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z10 ? aVar2.f2704q : aVar2.f2703p).get(0));
            xVar.v(obj, view);
            if (obj2 != null) {
                xVar.v(obj2, view);
            }
        }
    }

    public static void B(ArrayList<View> arrayList, int i10) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i10);
            }
        }
    }

    public static void C(@m0 Context context, @m0 d dVar, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, boolean z10, g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i12 = i10; i12 < i11; i12++) {
            a aVar = arrayList.get(i12);
            if (arrayList2.get(i12).booleanValue()) {
                e(aVar, sparseArray, z10);
            } else {
                c(aVar, sparseArray, z10);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = sparseArray.keyAt(i13);
                androidx.collection.a<String, String> d10 = d(keyAt, arrayList, arrayList2, i10, i11);
                h hVar = (h) sparseArray.valueAt(i13);
                if (dVar.d() && (viewGroup = (ViewGroup) dVar.c(keyAt)) != null) {
                    if (z10) {
                        o(viewGroup, hVar, view, d10, gVar);
                    } else {
                        n(viewGroup, hVar, view, d10, gVar);
                    }
                }
            }
        }
    }

    public static boolean D() {
        return (f2716b == null && f2717c == null) ? false : true;
    }

    public static void a(ArrayList<View> arrayList, androidx.collection.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View q10 = aVar.q(size);
            if (collection.contains(w1.w0(q10))) {
                arrayList.add(q10);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0039, code lost:
        if (r0.Z != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0088, code lost:
        if (r0.f2453n0 == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(androidx.fragment.app.a r8, androidx.fragment.app.u.a r9, android.util.SparseArray<androidx.fragment.app.v.h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f2708b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.f2451l0
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f2715a
            int r9 = r9.f2707a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f2707a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007d
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007d
            r9 = r2
            r3 = r9
            r4 = r3
            goto L_0x0090
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.B0
            if (r9 == 0) goto L_0x008c
            boolean r9 = r0.f2453n0
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.Z
            if (r9 == 0) goto L_0x008c
            goto L_0x008a
        L_0x003c:
            boolean r9 = r0.f2453n0
            goto L_0x008d
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.B0
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.Z
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2453n0
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.Z
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2453n0
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            boolean r9 = r0.Z
            if (r12 == 0) goto L_0x0072
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.f2461v0
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.C0
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = r3
            goto L_0x0079
        L_0x0070:
            r9 = r2
            goto L_0x0079
        L_0x0072:
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2453n0
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x0079:
            r4 = r9
            r9 = r3
            r3 = r2
            goto L_0x0090
        L_0x007d:
            if (r12 == 0) goto L_0x0082
            boolean r9 = r0.A0
            goto L_0x008d
        L_0x0082:
            boolean r9 = r0.Z
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.f2453n0
            if (r9 != 0) goto L_0x008c
        L_0x008a:
            r9 = r3
            goto L_0x008d
        L_0x008c:
            r9 = r2
        L_0x008d:
            r4 = r2
            r2 = r9
            r9 = r4
        L_0x0090:
            java.lang.Object r5 = r10.get(r1)
            androidx.fragment.app.v$h r5 = (androidx.fragment.app.v.h) r5
            if (r2 == 0) goto L_0x00a2
            androidx.fragment.app.v$h r5 = p(r5, r10, r1)
            r5.f2718a = r0
            r5.f2719b = r11
            r5.f2720c = r8
        L_0x00a2:
            r2 = 0
            if (r12 != 0) goto L_0x00c3
            if (r3 == 0) goto L_0x00c3
            if (r5 == 0) goto L_0x00af
            androidx.fragment.app.Fragment r3 = r5.f2721d
            if (r3 != r0) goto L_0x00af
            r5.f2721d = r2
        L_0x00af:
            boolean r3 = r8.f2705r
            if (r3 != 0) goto L_0x00c3
            androidx.fragment.app.FragmentManager r3 = r8.L
            androidx.fragment.app.q r6 = r3.A(r0)
            androidx.fragment.app.t r7 = r3.F0()
            r7.q(r6)
            r3.f1(r0)
        L_0x00c3:
            if (r4 == 0) goto L_0x00d5
            if (r5 == 0) goto L_0x00cb
            androidx.fragment.app.Fragment r3 = r5.f2721d
            if (r3 != 0) goto L_0x00d5
        L_0x00cb:
            androidx.fragment.app.v$h r5 = p(r5, r10, r1)
            r5.f2721d = r0
            r5.f2722e = r11
            r5.f2723f = r8
        L_0x00d5:
            if (r12 != 0) goto L_0x00e1
            if (r9 == 0) goto L_0x00e1
            if (r5 == 0) goto L_0x00e1
            androidx.fragment.app.Fragment r8 = r5.f2718a
            if (r8 != r0) goto L_0x00e1
            r5.f2718a = r2
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.v.b(androidx.fragment.app.a, androidx.fragment.app.u$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(a aVar, SparseArray<h> sparseArray, boolean z10) {
        int size = aVar.f2690c.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(aVar, aVar.f2690c.get(i10), sparseArray, false, z10);
        }
    }

    public static androidx.collection.a<String, String> d(int i10, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i11, int i12) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        androidx.collection.a<String, String> aVar = new androidx.collection.a<>();
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            a aVar2 = arrayList.get(i13);
            if (aVar2.X(i10)) {
                boolean booleanValue = arrayList2.get(i13).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f2703p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f2703p;
                        arrayList4 = aVar2.f2704q;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f2703p;
                        arrayList3 = aVar2.f2704q;
                        arrayList4 = arrayList6;
                    }
                    for (int i14 = 0; i14 < size; i14++) {
                        String str = arrayList4.get(i14);
                        String str2 = arrayList3.get(i14);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(a aVar, SparseArray<h> sparseArray, boolean z10) {
        if (aVar.L.B0().d()) {
            for (int size = aVar.f2690c.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f2690c.get(size), sparseArray, true, z10);
            }
        }
    }

    public static void f(Fragment fragment, Fragment fragment2, boolean z10, androidx.collection.a<String, View> aVar, boolean z11) {
        z2 C = z10 ? fragment2.C() : fragment.C();
        if (C != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add(aVar.m(i10));
                arrayList.add(aVar.q(i10));
            }
            if (z11) {
                C.g(arrayList2, arrayList, (List<View>) null);
            } else {
                C.f(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    public static boolean g(x xVar, List<Object> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!xVar.e(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static androidx.collection.a<String, View> h(x xVar, androidx.collection.a<String, String> aVar, Object obj, h hVar) {
        z2 z2Var;
        ArrayList<String> arrayList;
        String q10;
        Fragment fragment = hVar.f2718a;
        View view = fragment.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
        xVar.j(aVar2, view);
        a aVar3 = hVar.f2720c;
        if (hVar.f2719b) {
            z2Var = fragment.E();
            arrayList = aVar3.f2703p;
        } else {
            z2Var = fragment.C();
            arrayList = aVar3.f2704q;
        }
        if (arrayList != null) {
            aVar2.u(arrayList);
            aVar2.u(aVar.values());
        }
        if (z2Var != null) {
            z2Var.d(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view2 = aVar2.get(str);
                if (view2 == null) {
                    String q11 = q(aVar, str);
                    if (q11 != null) {
                        aVar.remove(q11);
                    }
                } else if (!str.equals(w1.w0(view2)) && (q10 = q(aVar, str)) != null) {
                    aVar.put(q10, w1.w0(view2));
                }
            }
        } else {
            y(aVar, aVar2);
        }
        return aVar2;
    }

    public static androidx.collection.a<String, View> i(x xVar, androidx.collection.a<String, String> aVar, Object obj, h hVar) {
        z2 z2Var;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f2721d;
        androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
        xVar.j(aVar2, fragment.requireView());
        a aVar3 = hVar.f2723f;
        if (hVar.f2722e) {
            z2Var = fragment.C();
            arrayList = aVar3.f2704q;
        } else {
            z2Var = fragment.E();
            arrayList = aVar3.f2703p;
        }
        if (arrayList != null) {
            aVar2.u(arrayList);
        }
        if (z2Var != null) {
            z2Var.d(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(w1.w0(view))) {
                    aVar.put(w1.w0(view), aVar.remove(str));
                }
            }
        } else {
            aVar.u(aVar2.keySet());
        }
        return aVar2;
    }

    public static x j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        x xVar = f2716b;
        if (xVar != null && g(xVar, arrayList)) {
            return xVar;
        }
        x xVar2 = f2717c;
        if (xVar2 != null && g(xVar2, arrayList)) {
            return xVar2;
        }
        if (xVar == null && xVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static ArrayList<View> k(x xVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            xVar.f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        xVar.b(obj, arrayList2);
        return arrayList2;
    }

    public static Object l(x xVar, ViewGroup viewGroup, View view, androidx.collection.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        androidx.collection.a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        x xVar2 = xVar;
        h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.f2718a;
        Fragment fragment2 = hVar2.f2721d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar2.f2719b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = u(xVar2, fragment, fragment2, z10);
            aVar2 = aVar;
        }
        androidx.collection.a<String, View> i10 = i(xVar2, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i10.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z10, i10, true);
        if (obj4 != null) {
            rect = new Rect();
            xVar2.z(obj4, view, arrayList3);
            A(xVar, obj4, obj2, i10, hVar2.f2722e, hVar2.f2723f);
            if (obj5 != null) {
                xVar2.u(obj5, rect);
            }
        } else {
            rect = null;
        }
        f fVar = r0;
        f fVar2 = new f(xVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z10, arrayList, obj, rect);
        s0.a(viewGroup, fVar);
        return obj4;
    }

    public static Object m(x xVar, ViewGroup viewGroup, View view, androidx.collection.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        x xVar2 = xVar;
        View view3 = view;
        androidx.collection.a<String, String> aVar2 = aVar;
        h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj4 = obj;
        Fragment fragment = hVar2.f2718a;
        Fragment fragment2 = hVar2.f2721d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar2.f2719b;
        Object u10 = aVar.isEmpty() ? null : u(xVar, fragment, fragment2, z10);
        androidx.collection.a<String, View> i10 = i(xVar, aVar2, u10, hVar2);
        androidx.collection.a<String, View> h10 = h(xVar, aVar2, u10, hVar2);
        if (aVar.isEmpty()) {
            if (i10 != null) {
                i10.clear();
            }
            if (h10 != null) {
                h10.clear();
            }
            obj3 = null;
        } else {
            a(arrayList3, i10, aVar.keySet());
            a(arrayList4, h10, aVar.values());
            obj3 = u10;
        }
        if (obj4 == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z10, i10, true);
        if (obj3 != null) {
            arrayList4.add(view3);
            xVar.z(obj3, view3, arrayList3);
            A(xVar, obj3, obj2, i10, hVar2.f2722e, hVar2.f2723f);
            Rect rect2 = new Rect();
            View t10 = t(h10, hVar2, obj4, z10);
            if (t10 != null) {
                xVar.u(obj4, rect2);
            }
            rect = rect2;
            view2 = t10;
        } else {
            view2 = null;
            rect = null;
        }
        s0.a(viewGroup, new e(fragment, fragment2, z10, h10, view2, xVar, rect));
        return obj3;
    }

    public static void n(@m0 ViewGroup viewGroup, h hVar, View view, androidx.collection.a<String, String> aVar, g gVar) {
        Object obj;
        ViewGroup viewGroup2 = viewGroup;
        h hVar2 = hVar;
        View view2 = view;
        androidx.collection.a<String, String> aVar2 = aVar;
        g gVar2 = gVar;
        Fragment fragment = hVar2.f2718a;
        Fragment fragment2 = hVar2.f2721d;
        x j10 = j(fragment2, fragment);
        if (j10 != null) {
            boolean z10 = hVar2.f2719b;
            boolean z11 = hVar2.f2722e;
            Object r10 = r(j10, fragment, z10);
            Object s10 = s(j10, fragment2, z11);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = s10;
            x xVar = j10;
            Object l10 = l(j10, viewGroup, view, aVar, hVar, arrayList, arrayList2, r10, obj2);
            Object obj3 = r10;
            if (obj3 == null && l10 == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList<View> k10 = k(xVar, obj, fragment2, arrayList4, view2);
            if (k10 == null || k10.isEmpty()) {
                obj = null;
            }
            Object obj4 = obj;
            xVar.a(obj3, view2);
            Object v10 = v(xVar, obj3, obj4, l10, fragment, hVar2.f2719b);
            if (!(fragment2 == null || k10 == null || (k10.size() <= 0 && arrayList4.size() <= 0))) {
                x0.c cVar = new x0.c();
                gVar2.a(fragment2, cVar);
                xVar.w(fragment2, v10, cVar, new c(gVar2, fragment2, cVar));
            }
            if (v10 != null) {
                ArrayList arrayList5 = new ArrayList();
                x xVar2 = xVar;
                xVar2.t(v10, obj3, arrayList5, obj4, k10, l10, arrayList2);
                z(xVar2, viewGroup, fragment, view, arrayList2, obj3, arrayList5, obj4, k10);
                ViewGroup viewGroup3 = viewGroup;
                x xVar3 = xVar;
                ArrayList arrayList6 = arrayList2;
                xVar3.x(viewGroup3, arrayList6, aVar2);
                xVar3.c(viewGroup3, v10);
                xVar3.s(viewGroup3, arrayList6, aVar2);
            }
        }
    }

    public static void o(@m0 ViewGroup viewGroup, h hVar, View view, androidx.collection.a<String, String> aVar, g gVar) {
        Object obj;
        h hVar2 = hVar;
        View view2 = view;
        g gVar2 = gVar;
        Fragment fragment = hVar2.f2718a;
        Fragment fragment2 = hVar2.f2721d;
        x j10 = j(fragment2, fragment);
        if (j10 != null) {
            boolean z10 = hVar2.f2719b;
            boolean z11 = hVar2.f2722e;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object r10 = r(j10, fragment, z10);
            Object s10 = s(j10, fragment2, z11);
            ArrayList arrayList3 = arrayList2;
            Object m10 = m(j10, viewGroup, view, aVar, hVar, arrayList2, arrayList, r10, s10);
            Object obj2 = r10;
            if (obj2 == null && m10 == null) {
                obj = s10;
                if (obj == null) {
                    return;
                }
            } else {
                obj = s10;
            }
            ArrayList<View> k10 = k(j10, obj, fragment2, arrayList3, view2);
            ArrayList<View> k11 = k(j10, obj2, fragment, arrayList, view2);
            B(k11, 4);
            Fragment fragment3 = fragment;
            ArrayList<View> arrayList4 = k10;
            Object v10 = v(j10, obj2, obj, m10, fragment3, z10);
            if (!(fragment2 == null || arrayList4 == null || (arrayList4.size() <= 0 && arrayList3.size() <= 0))) {
                x0.c cVar = new x0.c();
                g gVar3 = gVar;
                gVar3.a(fragment2, cVar);
                j10.w(fragment2, v10, cVar, new a(gVar3, fragment2, cVar));
            }
            if (v10 != null) {
                w(j10, obj, fragment2, arrayList4);
                ArrayList<String> o10 = j10.o(arrayList);
                x xVar = j10;
                xVar.t(v10, obj2, k11, obj, arrayList4, m10, arrayList);
                ViewGroup viewGroup2 = viewGroup;
                j10.c(viewGroup2, v10);
                xVar.y(viewGroup2, arrayList3, arrayList, o10, aVar);
                B(k11, 0);
                j10.A(m10, arrayList3, arrayList);
            }
        }
    }

    public static h p(h hVar, SparseArray<h> sparseArray, int i10) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i10, hVar2);
        return hVar2;
    }

    public static String q(androidx.collection.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (str.equals(aVar.q(i10))) {
                return aVar.m(i10);
            }
        }
        return null;
    }

    public static Object r(x xVar, Fragment fragment, boolean z10) {
        if (fragment == null) {
            return null;
        }
        return xVar.g(z10 ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    public static Object s(x xVar, Fragment fragment, boolean z10) {
        if (fragment == null) {
            return null;
        }
        return xVar.g(z10 ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    public static View t(androidx.collection.a<String, View> aVar, h hVar, Object obj, boolean z10) {
        ArrayList<String> arrayList;
        a aVar2 = hVar.f2720c;
        if (obj == null || aVar == null || (arrayList = aVar2.f2703p) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z10 ? aVar2.f2703p : aVar2.f2704q).get(0));
    }

    public static Object u(x xVar, Fragment fragment, Fragment fragment2, boolean z10) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return xVar.B(xVar.g(z10 ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    public static Object v(x xVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z10) {
        return (obj == null || obj2 == null || fragment == null) ? true : z10 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() ? xVar.n(obj2, obj, obj3) : xVar.m(obj2, obj, obj3);
    }

    public static void w(x xVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.Z && fragment.f2453n0 && fragment.B0) {
            fragment.D0(true);
            xVar.r(obj, fragment.getView(), arrayList);
            s0.a(fragment.f2460u0, new b(arrayList));
        }
    }

    public static x x() {
        try {
            return p.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void y(@m0 androidx.collection.a<String, String> aVar, @m0 androidx.collection.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.q(size))) {
                aVar.o(size);
            }
        }
    }

    public static void z(x xVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        s0.a(viewGroup, new d(obj, xVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
