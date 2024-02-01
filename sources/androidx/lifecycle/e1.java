package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import fh.g;
import i2.f;
import p000if.s;
import p000if.u;
import ve.h;
import we.l;
import xe.l0;
import xe.n0;

@h(name = "ViewTreeViewModelStoreOwner")
public final class e1 {

    public static final class a extends n0 implements l<View, View> {
        public static final a P = new a();

        public a() {
            super(1);
        }

        @fh.h
        /* renamed from: c */
        public final View A(@g View view) {
            l0.p(view, "view");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    public static final class b extends n0 implements l<View, b1> {
        public static final b P = new b();

        public b() {
            super(1);
        }

        @fh.h
        /* renamed from: c */
        public final b1 A(@g View view) {
            l0.p(view, "view");
            Object tag = view.getTag(f.a.view_tree_view_model_store_owner);
            if (tag instanceof b1) {
                return (b1) tag;
            }
            return null;
        }
    }

    @h(name = "get")
    @fh.h
    public static final b1 a(@g View view) {
        l0.p(view, "<this>");
        return (b1) u.F0(u.p1(s.l(view, a.P), b.P));
    }

    @h(name = "set")
    public static final void b(@g View view, @fh.h b1 b1Var) {
        l0.p(view, "<this>");
        view.setTag(f.a.view_tree_view_model_store_owner, b1Var);
    }
}
