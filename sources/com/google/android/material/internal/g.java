package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import d.b1;
import d.h0;
import d.m0;
import d.o0;
import d.q;
import d.x0;
import f1.e3;
import f1.w1;
import g1.z;
import i9.a;
import java.util.ArrayList;

@x0({x0.a.LIBRARY_GROUP})
public class g implements androidx.appcompat.view.menu.j {

    /* renamed from: k0  reason: collision with root package name */
    public static final String f17195k0 = "android:menu:list";

    /* renamed from: l0  reason: collision with root package name */
    public static final String f17196l0 = "android:menu:adapter";

    /* renamed from: m0  reason: collision with root package name */
    public static final String f17197m0 = "android:menu:header";
    public NavigationMenuView O;
    public LinearLayout P;
    public j.a Q;
    public androidx.appcompat.view.menu.e R;
    public int S;
    public c T;
    public LayoutInflater U;
    public int V;
    public boolean W;
    public ColorStateList X;
    public ColorStateList Y;
    public Drawable Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f17198a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f17199b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f17200c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f17201d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f17202e0 = true;

    /* renamed from: f0  reason: collision with root package name */
    public int f17203f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f17204g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f17205h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f17206i0 = -1;

    /* renamed from: j0  reason: collision with root package name */
    public final View.OnClickListener f17207j0 = new a();

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            boolean z10 = true;
            g.this.M(true);
            androidx.appcompat.view.menu.h itemData = ((NavigationMenuItemView) view).getItemData();
            g gVar = g.this;
            boolean P = gVar.R.P(itemData, gVar, 0);
            if (itemData == null || !itemData.isCheckable() || !P) {
                z10 = false;
            } else {
                g.this.T.O(itemData);
            }
            g.this.M(false);
            if (z10) {
                g.this.d(false);
            }
        }
    }

    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    public class c extends RecyclerView.g<l> {

        /* renamed from: g  reason: collision with root package name */
        public static final String f17208g = "android:menu:checked";

        /* renamed from: h  reason: collision with root package name */
        public static final String f17209h = "android:menu:action_views";

        /* renamed from: i  reason: collision with root package name */
        public static final int f17210i = 0;

        /* renamed from: j  reason: collision with root package name */
        public static final int f17211j = 1;

        /* renamed from: k  reason: collision with root package name */
        public static final int f17212k = 2;

        /* renamed from: l  reason: collision with root package name */
        public static final int f17213l = 3;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f17214c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public androidx.appcompat.view.menu.h f17215d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f17216e;

        public c() {
            M();
        }

        public final void F(int i10, int i11) {
            while (i10 < i11) {
                ((C0281g) this.f17214c.get(i10)).f17221b = true;
                i10++;
            }
        }

        @m0
        public Bundle G() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.h hVar = this.f17215d;
            if (hVar != null) {
                bundle.putInt(f17208g, hVar.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f17214c.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f17214c.get(i10);
                if (eVar instanceof C0281g) {
                    androidx.appcompat.view.menu.h a10 = ((C0281g) eVar).a();
                    View actionView = a10 != null ? a10.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a10.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(f17209h, sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.h H() {
            return this.f17215d;
        }

        public int I() {
            int i10 = g.this.P.getChildCount() == 0 ? 0 : 1;
            for (int i11 = 0; i11 < g.this.T.e(); i11++) {
                if (g.this.T.g(i11) == 0) {
                    i10++;
                }
            }
            return i10;
        }

        /* renamed from: J */
        public void u(@m0 l lVar, int i10) {
            int g10 = g(i10);
            if (g10 == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f3220a;
                navigationMenuItemView.setIconTintList(g.this.Y);
                g gVar = g.this;
                if (gVar.W) {
                    navigationMenuItemView.setTextAppearance(gVar.V);
                }
                ColorStateList colorStateList = g.this.X;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = g.this.Z;
                w1.G1(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                C0281g gVar2 = (C0281g) this.f17214c.get(i10);
                navigationMenuItemView.setNeedsEmptyIcon(gVar2.f17221b);
                navigationMenuItemView.setHorizontalPadding(g.this.f17198a0);
                navigationMenuItemView.setIconPadding(g.this.f17199b0);
                g gVar3 = g.this;
                if (gVar3.f17201d0) {
                    navigationMenuItemView.setIconSize(gVar3.f17200c0);
                }
                navigationMenuItemView.setMaxLines(g.this.f17203f0);
                navigationMenuItemView.g(gVar2.a(), 0);
            } else if (g10 == 1) {
                ((TextView) lVar.f3220a).setText(((C0281g) this.f17214c.get(i10)).a().getTitle());
            } else if (g10 == 2) {
                f fVar = (f) this.f17214c.get(i10);
                lVar.f3220a.setPadding(0, fVar.b(), 0, fVar.a());
            }
        }

        @o0
        /* renamed from: K */
        public l w(ViewGroup viewGroup, int i10) {
            if (i10 == 0) {
                g gVar = g.this;
                return new i(gVar.U, viewGroup, gVar.f17207j0);
            } else if (i10 == 1) {
                return new k(g.this.U, viewGroup);
            } else {
                if (i10 == 2) {
                    return new j(g.this.U, viewGroup);
                }
                if (i10 != 3) {
                    return null;
                }
                return new b(g.this.P);
            }
        }

        /* renamed from: L */
        public void B(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.f3220a).F();
            }
        }

        public final void M() {
            if (!this.f17216e) {
                boolean z10 = true;
                this.f17216e = true;
                this.f17214c.clear();
                this.f17214c.add(new d());
                int i10 = -1;
                int size = g.this.R.H().size();
                int i11 = 0;
                boolean z11 = false;
                int i12 = 0;
                while (i11 < size) {
                    androidx.appcompat.view.menu.h hVar = g.this.R.H().get(i11);
                    if (hVar.isChecked()) {
                        O(hVar);
                    }
                    if (hVar.isCheckable()) {
                        hVar.w(false);
                    }
                    if (hVar.hasSubMenu()) {
                        SubMenu subMenu = hVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i11 != 0) {
                                this.f17214c.add(new f(g.this.f17205h0, 0));
                            }
                            this.f17214c.add(new C0281g(hVar));
                            int size2 = this.f17214c.size();
                            int size3 = subMenu.size();
                            int i13 = 0;
                            boolean z12 = false;
                            while (i13 < size3) {
                                androidx.appcompat.view.menu.h hVar2 = (androidx.appcompat.view.menu.h) subMenu.getItem(i13);
                                if (hVar2.isVisible()) {
                                    if (!z12 && hVar2.getIcon() != null) {
                                        z12 = z10;
                                    }
                                    if (hVar2.isCheckable()) {
                                        hVar2.w(false);
                                    }
                                    if (hVar.isChecked()) {
                                        O(hVar);
                                    }
                                    this.f17214c.add(new C0281g(hVar2));
                                }
                                i13++;
                                z10 = true;
                            }
                            if (z12) {
                                F(size2, this.f17214c.size());
                            }
                        }
                    } else {
                        int groupId = hVar.getGroupId();
                        if (groupId != i10) {
                            i12 = this.f17214c.size();
                            z11 = hVar.getIcon() != null;
                            if (i11 != 0) {
                                i12++;
                                ArrayList<e> arrayList = this.f17214c;
                                int i14 = g.this.f17205h0;
                                arrayList.add(new f(i14, i14));
                            }
                        } else if (!z11 && hVar.getIcon() != null) {
                            F(i12, this.f17214c.size());
                            z11 = true;
                        }
                        C0281g gVar = new C0281g(hVar);
                        gVar.f17221b = z11;
                        this.f17214c.add(gVar);
                        i10 = groupId;
                    }
                    i11++;
                    z10 = true;
                }
                this.f17216e = false;
            }
        }

        public void N(@m0 Bundle bundle) {
            androidx.appcompat.view.menu.h a10;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            androidx.appcompat.view.menu.h a11;
            int i10 = bundle.getInt(f17208g, 0);
            if (i10 != 0) {
                this.f17216e = true;
                int size = this.f17214c.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    e eVar = this.f17214c.get(i11);
                    if ((eVar instanceof C0281g) && (a11 = ((C0281g) eVar).a()) != null && a11.getItemId() == i10) {
                        O(a11);
                        break;
                    }
                    i11++;
                }
                this.f17216e = false;
                M();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f17209h);
            if (sparseParcelableArray != null) {
                int size2 = this.f17214c.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    e eVar2 = this.f17214c.get(i12);
                    if (!(!(eVar2 instanceof C0281g) || (a10 = ((C0281g) eVar2).a()) == null || (actionView = a10.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a10.getItemId())) == null)) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void O(@m0 androidx.appcompat.view.menu.h hVar) {
            if (this.f17215d != hVar && hVar.isCheckable()) {
                androidx.appcompat.view.menu.h hVar2 = this.f17215d;
                if (hVar2 != null) {
                    hVar2.setChecked(false);
                }
                this.f17215d = hVar;
                hVar.setChecked(true);
            }
        }

        public void P(boolean z10) {
            this.f17216e = z10;
        }

        public void Q() {
            M();
            j();
        }

        public int e() {
            return this.f17214c.size();
        }

        public long f(int i10) {
            return (long) i10;
        }

        public int g(int i10) {
            e eVar = this.f17214c.get(i10);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof C0281g) {
                return ((C0281g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }
    }

    public static class d implements e {
    }

    public interface e {
    }

    public static class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final int f17218a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17219b;

        public f(int i10, int i11) {
            this.f17218a = i10;
            this.f17219b = i11;
        }

        public int a() {
            return this.f17219b;
        }

        public int b() {
            return this.f17218a;
        }
    }

    /* renamed from: com.google.android.material.internal.g$g  reason: collision with other inner class name */
    public static class C0281g implements e {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.appcompat.view.menu.h f17220a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f17221b;

        public C0281g(androidx.appcompat.view.menu.h hVar) {
            this.f17220a = hVar;
        }

        public androidx.appcompat.view.menu.h a() {
            return this.f17220a;
        }
    }

    public class h extends y {
        public h(@m0 RecyclerView recyclerView) {
            super(recyclerView);
        }

        public void g(View view, @m0 z zVar) {
            super.g(view, zVar);
            zVar.W0(z.b.e(g.this.T.I(), 0, false));
        }
    }

    public static class i extends l {
        public i(@m0 LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(a.k.design_navigation_item, viewGroup, false));
            this.f3220a.setOnClickListener(onClickListener);
        }
    }

    public static class j extends l {
        public j(@m0 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(a.k.design_navigation_item_separator, viewGroup, false));
        }
    }

    public static class k extends l {
        public k(@m0 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(a.k.design_navigation_item_subheader, viewGroup, false));
        }
    }

    public static abstract class l extends RecyclerView.e0 {
        public l(View view) {
            super(view);
        }
    }

    public void A(boolean z10) {
        if (this.f17202e0 != z10) {
            this.f17202e0 = z10;
            N();
        }
    }

    public void B(@m0 androidx.appcompat.view.menu.h hVar) {
        this.T.O(hVar);
    }

    public void C(int i10) {
        this.S = i10;
    }

    public void D(@o0 Drawable drawable) {
        this.Z = drawable;
        d(false);
    }

    public void E(int i10) {
        this.f17198a0 = i10;
        d(false);
    }

    public void F(int i10) {
        this.f17199b0 = i10;
        d(false);
    }

    public void G(@q int i10) {
        if (this.f17200c0 != i10) {
            this.f17200c0 = i10;
            this.f17201d0 = true;
            d(false);
        }
    }

    public void H(@o0 ColorStateList colorStateList) {
        this.Y = colorStateList;
        d(false);
    }

    public void I(int i10) {
        this.f17203f0 = i10;
        d(false);
    }

    public void J(@b1 int i10) {
        this.V = i10;
        this.W = true;
        d(false);
    }

    public void K(@o0 ColorStateList colorStateList) {
        this.X = colorStateList;
        d(false);
    }

    public void L(int i10) {
        this.f17206i0 = i10;
        NavigationMenuView navigationMenuView = this.O;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i10);
        }
    }

    public void M(boolean z10) {
        c cVar = this.T;
        if (cVar != null) {
            cVar.P(z10);
        }
    }

    public final void N() {
        int i10 = (this.P.getChildCount() != 0 || !this.f17202e0) ? 0 : this.f17204g0;
        NavigationMenuView navigationMenuView = this.O;
        navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
    }

    public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        j.a aVar = this.Q;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    public void c(@m0 View view) {
        this.P.addView(view);
        NavigationMenuView navigationMenuView = this.O;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void d(boolean z10) {
        c cVar = this.T;
        if (cVar != null) {
            cVar.Q();
        }
    }

    public boolean e() {
        return false;
    }

    public boolean f(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    public boolean g(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    public int getId() {
        return this.S;
    }

    public void h(j.a aVar) {
        this.Q = aVar;
    }

    public void i(@m0 Context context, @m0 androidx.appcompat.view.menu.e eVar) {
        this.U = LayoutInflater.from(context);
        this.R = eVar;
        this.f17205h0 = context.getResources().getDimensionPixelOffset(a.f.design_navigation_separator_vertical_padding);
    }

    public void j(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.O.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(f17196l0);
            if (bundle2 != null) {
                this.T.N(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray(f17197m0);
            if (sparseParcelableArray2 != null) {
                this.P.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public void k(@m0 e3 e3Var) {
        int r10 = e3Var.r();
        if (this.f17204g0 != r10) {
            this.f17204g0 = r10;
            N();
        }
        NavigationMenuView navigationMenuView = this.O;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, e3Var.o());
        w1.o(this.P, e3Var);
    }

    public boolean l(m mVar) {
        return false;
    }

    public androidx.appcompat.view.menu.k m(ViewGroup viewGroup) {
        if (this.O == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.U.inflate(a.k.design_navigation_menu, viewGroup, false);
            this.O = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.O));
            if (this.T == null) {
                this.T = new c();
            }
            int i10 = this.f17206i0;
            if (i10 != -1) {
                this.O.setOverScrollMode(i10);
            }
            this.P = (LinearLayout) this.U.inflate(a.k.design_navigation_item_header, this.O, false);
            this.O.setAdapter(this.T);
        }
        return this.O;
    }

    @m0
    public Parcelable n() {
        Bundle bundle = new Bundle();
        if (this.O != null) {
            SparseArray sparseArray = new SparseArray();
            this.O.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.T;
        if (cVar != null) {
            bundle.putBundle(f17196l0, cVar.G());
        }
        if (this.P != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.P.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(f17197m0, sparseArray2);
        }
        return bundle;
    }

    @o0
    public androidx.appcompat.view.menu.h o() {
        return this.T.H();
    }

    public int p() {
        return this.P.getChildCount();
    }

    public View q(int i10) {
        return this.P.getChildAt(i10);
    }

    @o0
    public Drawable r() {
        return this.Z;
    }

    public int s() {
        return this.f17198a0;
    }

    public int t() {
        return this.f17199b0;
    }

    public int u() {
        return this.f17203f0;
    }

    @o0
    public ColorStateList v() {
        return this.X;
    }

    @o0
    public ColorStateList w() {
        return this.Y;
    }

    public View x(@h0 int i10) {
        View inflate = this.U.inflate(i10, this.P, false);
        c(inflate);
        return inflate;
    }

    public boolean y() {
        return this.f17202e0;
    }

    public void z(@m0 View view) {
        this.P.removeView(view);
        if (this.P.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.O;
            navigationMenuView.setPadding(0, this.f17204g0, 0, navigationMenuView.getPaddingBottom());
        }
    }
}
