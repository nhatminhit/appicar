package y2;

import android.view.View;
import android.view.ViewParent;
import fh.g;
import kotlin.Metadata;
import p000if.s;
import p000if.u;
import ve.h;
import we.l;
import xe.l0;
import xe.n0;
import y2.a;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Ly2/e;", "owner", "Lzd/u2;", "b", "(Landroid/view/View;Ly2/e;)V", "a", "(Landroid/view/View;)Ly2/e;", "savedstate_release"}, k = 2, mv = {1, 6, 0})
@h(name = "ViewTreeSavedStateRegistryOwner")
public final class f {

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "view", "c", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 6, 0})
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

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Ly2/e;", "c", "(Landroid/view/View;)Ly2/e;"}, k = 3, mv = {1, 6, 0})
    public static final class b extends n0 implements l<View, e> {
        public static final b P = new b();

        public b() {
            super(1);
        }

        @fh.h
        /* renamed from: c */
        public final e A(@g View view) {
            l0.p(view, "view");
            Object tag = view.getTag(a.C0244a.view_tree_saved_state_registry_owner);
            if (tag instanceof e) {
                return (e) tag;
            }
            return null;
        }
    }

    @h(name = "get")
    @fh.h
    public static final e a(@g View view) {
        l0.p(view, "<this>");
        return (e) u.F0(u.p1(s.l(view, a.P), b.P));
    }

    @h(name = "set")
    public static final void b(@g View view, @fh.h e eVar) {
        l0.p(view, "<this>");
        view.setTag(a.C0244a.view_tree_saved_state_registry_owner, eVar);
    }
}
