package g3;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import d.o0;
import f1.w1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class m0 {

    /* renamed from: c  reason: collision with root package name */
    public static final String f7808c = "TransitionManager";

    /* renamed from: d  reason: collision with root package name */
    public static j0 f7809d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<j0>>>> f7810e = new ThreadLocal<>();

    /* renamed from: f  reason: collision with root package name */
    public static ArrayList<ViewGroup> f7811f = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public androidx.collection.a<f0, j0> f7812a = new androidx.collection.a<>();

    /* renamed from: b  reason: collision with root package name */
    public androidx.collection.a<f0, androidx.collection.a<f0, j0>> f7813b = new androidx.collection.a<>();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public j0 O;
        public ViewGroup P;

        /* renamed from: g3.m0$a$a  reason: collision with other inner class name */
        public class C0135a extends l0 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ androidx.collection.a f7814a;

            public C0135a(androidx.collection.a aVar) {
                this.f7814a = aVar;
            }

            public void e(@d.m0 j0 j0Var) {
                ((ArrayList) this.f7814a.get(a.this.P)).remove(j0Var);
                j0Var.o0(this);
            }
        }

        public a(j0 j0Var, ViewGroup viewGroup) {
            this.O = j0Var;
            this.P = viewGroup;
        }

        public final void a() {
            this.P.getViewTreeObserver().removeOnPreDrawListener(this);
            this.P.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!m0.f7811f.remove(this.P)) {
                return true;
            }
            androidx.collection.a<ViewGroup, ArrayList<j0>> e10 = m0.e();
            ArrayList arrayList = e10.get(this.P);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                e10.put(this.P, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.O);
            this.O.a(new C0135a(e10));
            this.O.u(this.P, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((j0) it.next()).t0(this.P);
                }
            }
            this.O.n0(this.P);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            m0.f7811f.remove(this.P);
            ArrayList arrayList = m0.e().get(this.P);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((j0) it.next()).t0(this.P);
                }
            }
            this.O.v(true);
        }
    }

    public static void a(@d.m0 ViewGroup viewGroup) {
        b(viewGroup, (j0) null);
    }

    public static void b(@d.m0 ViewGroup viewGroup, @o0 j0 j0Var) {
        if (!f7811f.contains(viewGroup) && w1.T0(viewGroup)) {
            f7811f.add(viewGroup);
            if (j0Var == null) {
                j0Var = f7809d;
            }
            j0 w10 = j0Var.clone();
            j(viewGroup, w10);
            f0.g(viewGroup, (f0) null);
            i(viewGroup, w10);
        }
    }

    public static void c(f0 f0Var, j0 j0Var) {
        ViewGroup e10 = f0Var.e();
        if (!f7811f.contains(e10)) {
            f0 c10 = f0.c(e10);
            if (j0Var == null) {
                if (c10 != null) {
                    c10.b();
                }
                f0Var.a();
                return;
            }
            f7811f.add(e10);
            j0 w10 = j0Var.clone();
            w10.D0(e10);
            if (c10 != null && c10.f()) {
                w10.w0(true);
            }
            j(e10, w10);
            f0Var.a();
            i(e10, w10);
        }
    }

    public static void d(ViewGroup viewGroup) {
        f7811f.remove(viewGroup);
        ArrayList arrayList = e().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((j0) arrayList2.get(size)).L(viewGroup);
            }
        }
    }

    public static androidx.collection.a<ViewGroup, ArrayList<j0>> e() {
        androidx.collection.a<ViewGroup, ArrayList<j0>> aVar;
        WeakReference weakReference = f7810e.get();
        if (weakReference != null && (aVar = (androidx.collection.a) weakReference.get()) != null) {
            return aVar;
        }
        androidx.collection.a<ViewGroup, ArrayList<j0>> aVar2 = new androidx.collection.a<>();
        f7810e.set(new WeakReference(aVar2));
        return aVar2;
    }

    public static void g(@d.m0 f0 f0Var) {
        c(f0Var, f7809d);
    }

    public static void h(@d.m0 f0 f0Var, @o0 j0 j0Var) {
        c(f0Var, j0Var);
    }

    public static void i(ViewGroup viewGroup, j0 j0Var) {
        if (j0Var != null && viewGroup != null) {
            a aVar = new a(j0Var, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    public static void j(ViewGroup viewGroup, j0 j0Var) {
        ArrayList arrayList = e().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((j0) it.next()).m0(viewGroup);
            }
        }
        if (j0Var != null) {
            j0Var.u(viewGroup, true);
        }
        f0 c10 = f0.c(viewGroup);
        if (c10 != null) {
            c10.b();
        }
    }

    public final j0 f(f0 f0Var) {
        f0 c10;
        androidx.collection.a aVar;
        j0 j0Var;
        ViewGroup e10 = f0Var.e();
        if (e10 != null && (c10 = f0.c(e10)) != null && (aVar = this.f7813b.get(f0Var)) != null && (j0Var = (j0) aVar.get(c10)) != null) {
            return j0Var;
        }
        j0 j0Var2 = this.f7812a.get(f0Var);
        return j0Var2 != null ? j0Var2 : f7809d;
    }

    public void k(@d.m0 f0 f0Var, @d.m0 f0 f0Var2, @o0 j0 j0Var) {
        androidx.collection.a aVar = this.f7813b.get(f0Var2);
        if (aVar == null) {
            aVar = new androidx.collection.a();
            this.f7813b.put(f0Var2, aVar);
        }
        aVar.put(f0Var, j0Var);
    }

    public void l(@d.m0 f0 f0Var, @o0 j0 j0Var) {
        this.f7812a.put(f0Var, j0Var);
    }

    public void m(@d.m0 f0 f0Var) {
        c(f0Var, f(f0Var));
    }
}
