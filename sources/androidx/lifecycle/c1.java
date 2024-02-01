package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import fh.g;
import h2.a;
import p000if.s;
import p000if.u;
import ve.h;
import we.l;
import xe.l0;
import xe.n0;

@h(name = "ViewTreeLifecycleOwner")
public final class c1 {

    public static final class a extends n0 implements l<View, View> {
        public static final a P = new a();

        public a() {
            super(1);
        }

        @fh.h
        /* renamed from: c */
        public final View A(@g View view) {
            l0.p(view, "currentView");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    public static final class b extends n0 implements l<View, y> {
        public static final b P = new b();

        public b() {
            super(1);
        }

        @fh.h
        /* renamed from: c */
        public final y A(@g View view) {
            l0.p(view, "viewParent");
            Object tag = view.getTag(a.C0143a.view_tree_lifecycle_owner);
            if (tag instanceof y) {
                return (y) tag;
            }
            return null;
        }
    }

    @h(name = "get")
    @fh.h
    public static final y a(@g View view) {
        l0.p(view, "<this>");
        return (y) u.F0(u.p1(s.l(view, a.P), b.P));
    }

    @h(name = "set")
    public static final void b(@g View view, @fh.h y yVar) {
        l0.p(view, "<this>");
        view.setTag(a.C0143a.view_tree_lifecycle_owner, yVar);
    }
}
