package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import d.m0;
import d.o0;
import f1.w1;
import g1.a0;
import g1.z;
import java.util.Map;
import java.util.WeakHashMap;

public class y extends f1.a {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f3738d;

    /* renamed from: e  reason: collision with root package name */
    public final a f3739e;

    public static class a extends f1.a {

        /* renamed from: d  reason: collision with root package name */
        public final y f3740d;

        /* renamed from: e  reason: collision with root package name */
        public Map<View, f1.a> f3741e = new WeakHashMap();

        public a(@m0 y yVar) {
            this.f3740d = yVar;
        }

        public boolean a(@m0 View view, @m0 AccessibilityEvent accessibilityEvent) {
            f1.a aVar = this.f3741e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @o0
        public a0 b(@m0 View view) {
            f1.a aVar = this.f3741e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        public void f(@m0 View view, @m0 AccessibilityEvent accessibilityEvent) {
            f1.a aVar = this.f3741e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        public void g(View view, z zVar) {
            if (!this.f3740d.o() && this.f3740d.f3738d.getLayoutManager() != null) {
                this.f3740d.f3738d.getLayoutManager().f1(view, zVar);
                f1.a aVar = this.f3741e.get(view);
                if (aVar != null) {
                    aVar.g(view, zVar);
                    return;
                }
            }
            super.g(view, zVar);
        }

        public void h(@m0 View view, @m0 AccessibilityEvent accessibilityEvent) {
            f1.a aVar = this.f3741e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        public boolean i(@m0 ViewGroup viewGroup, @m0 View view, @m0 AccessibilityEvent accessibilityEvent) {
            f1.a aVar = this.f3741e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (this.f3740d.o() || this.f3740d.f3738d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            f1.a aVar = this.f3741e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f3740d.f3738d.getLayoutManager().z1(view, i10, bundle);
        }

        public void l(@m0 View view, int i10) {
            f1.a aVar = this.f3741e.get(view);
            if (aVar != null) {
                aVar.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        public void m(@m0 View view, @m0 AccessibilityEvent accessibilityEvent) {
            f1.a aVar = this.f3741e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public f1.a n(View view) {
            return this.f3741e.remove(view);
        }

        public void o(View view) {
            f1.a C = w1.C(view);
            if (C != null && C != this) {
                this.f3741e.put(view, C);
            }
        }
    }

    public y(@m0 RecyclerView recyclerView) {
        this.f3738d = recyclerView;
        f1.a n10 = n();
        this.f3739e = (n10 == null || !(n10 instanceof a)) ? new a(this) : (a) n10;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().b1(accessibilityEvent);
            }
        }
    }

    public void g(View view, z zVar) {
        super.g(view, zVar);
        if (!o() && this.f3738d.getLayoutManager() != null) {
            this.f3738d.getLayoutManager().e1(zVar);
        }
    }

    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f3738d.getLayoutManager() == null) {
            return false;
        }
        return this.f3738d.getLayoutManager().x1(i10, bundle);
    }

    @m0
    public f1.a n() {
        return this.f3739e;
    }

    public boolean o() {
        return this.f3738d.C0();
    }
}
