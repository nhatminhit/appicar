package g3;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.x;
import d.m0;
import d.x0;
import g3.j0;
import java.util.ArrayList;
import java.util.List;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
@SuppressLint({"RestrictedApi"})
public class p extends x {

    public class a extends j0.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f7825a;

        public a(Rect rect) {
            this.f7825a = rect;
        }

        public Rect a(@m0 j0 j0Var) {
            return this.f7825a;
        }
    }

    public class b implements j0.h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f7827a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f7828b;

        public b(View view, ArrayList arrayList) {
            this.f7827a = view;
            this.f7828b = arrayList;
        }

        public void a(@m0 j0 j0Var) {
        }

        public void b(@m0 j0 j0Var) {
        }

        public void c(@m0 j0 j0Var) {
        }

        public void d(@m0 j0 j0Var) {
        }

        public void e(@m0 j0 j0Var) {
            j0Var.o0(this);
            this.f7827a.setVisibility(8);
            int size = this.f7828b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f7828b.get(i10)).setVisibility(0);
            }
        }
    }

    public class c extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f7830a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f7831b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f7832c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f7833d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f7834e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f7835f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f7830a = obj;
            this.f7831b = arrayList;
            this.f7832c = obj2;
            this.f7833d = arrayList2;
            this.f7834e = obj3;
            this.f7835f = arrayList3;
        }

        public void b(@m0 j0 j0Var) {
            Object obj = this.f7830a;
            if (obj != null) {
                p.this.q(obj, this.f7831b, (ArrayList<View>) null);
            }
            Object obj2 = this.f7832c;
            if (obj2 != null) {
                p.this.q(obj2, this.f7833d, (ArrayList<View>) null);
            }
            Object obj3 = this.f7834e;
            if (obj3 != null) {
                p.this.q(obj3, this.f7835f, (ArrayList<View>) null);
            }
        }

        public void e(@m0 j0 j0Var) {
            j0Var.o0(this);
        }
    }

    public class d extends j0.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f7837a;

        public d(Rect rect) {
            this.f7837a = rect;
        }

        public Rect a(@m0 j0 j0Var) {
            Rect rect = this.f7837a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f7837a;
        }
    }

    public static boolean C(j0 j0Var) {
        return !x.l(j0Var.W()) || !x.l(j0Var.X()) || !x.l(j0Var.Y());
    }

    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        o0 o0Var = (o0) obj;
        if (o0Var != null) {
            o0Var.Z().clear();
            o0Var.Z().addAll(arrayList2);
            q(o0Var, arrayList, arrayList2);
        }
    }

    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        o0 o0Var = new o0();
        o0Var.M0((j0) obj);
        return o0Var;
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((j0) obj).g(view);
        }
    }

    public void b(Object obj, ArrayList<View> arrayList) {
        j0 j0Var = (j0) obj;
        if (j0Var != null) {
            int i10 = 0;
            if (j0Var instanceof o0) {
                o0 o0Var = (o0) j0Var;
                int Q0 = o0Var.Q0();
                while (i10 < Q0) {
                    b(o0Var.P0(i10), arrayList);
                    i10++;
                }
            } else if (!C(j0Var) && x.l(j0Var.Z())) {
                int size = arrayList.size();
                while (i10 < size) {
                    j0Var.g(arrayList.get(i10));
                    i10++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        m0.b(viewGroup, (j0) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof j0;
    }

    public Object g(Object obj) {
        if (obj != null) {
            return ((j0) obj).clone();
        }
        return null;
    }

    public Object m(Object obj, Object obj2, Object obj3) {
        j0 j0Var = (j0) obj;
        j0 j0Var2 = (j0) obj2;
        j0 j0Var3 = (j0) obj3;
        if (j0Var != null && j0Var2 != null) {
            j0Var = new o0().M0(j0Var).M0(j0Var2).Z0(1);
        } else if (j0Var == null) {
            j0Var = j0Var2 != null ? j0Var2 : null;
        }
        if (j0Var3 == null) {
            return j0Var;
        }
        o0 o0Var = new o0();
        if (j0Var != null) {
            o0Var.M0(j0Var);
        }
        o0Var.M0(j0Var3);
        return o0Var;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        o0 o0Var = new o0();
        if (obj != null) {
            o0Var.M0((j0) obj);
        }
        if (obj2 != null) {
            o0Var.M0((j0) obj2);
        }
        if (obj3 != null) {
            o0Var.M0((j0) obj3);
        }
        return o0Var;
    }

    public void p(Object obj, View view) {
        if (obj != null) {
            ((j0) obj).q0(view);
        }
    }

    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        j0 j0Var = (j0) obj;
        int i10 = 0;
        if (j0Var instanceof o0) {
            o0 o0Var = (o0) j0Var;
            int Q0 = o0Var.Q0();
            while (i10 < Q0) {
                q(o0Var.P0(i10), arrayList, arrayList2);
                i10++;
            }
        } else if (!C(j0Var)) {
            List<View> Z = j0Var.Z();
            if (Z.size() == arrayList.size() && Z.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i10 < size) {
                    j0Var.g(arrayList2.get(i10));
                    i10++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    j0Var.q0(arrayList.get(size2));
                }
            }
        }
    }

    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((j0) obj).a(new b(view, arrayList));
    }

    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((j0) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((j0) obj).y0(new d(rect));
        }
    }

    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((j0) obj).y0(new a(rect));
        }
    }

    public void z(Object obj, View view, ArrayList<View> arrayList) {
        o0 o0Var = (o0) obj;
        List<View> Z = o0Var.Z();
        Z.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            x.d(Z, arrayList.get(i10));
        }
        Z.add(view);
        arrayList.add(view);
        b(o0Var, arrayList);
    }
}
