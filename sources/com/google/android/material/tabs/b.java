package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import d.m0;
import d.o0;
import java.lang.ref.WeakReference;

public final class b {
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final TabLayout f17480a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager2 f17481b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f17482c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f17483d;

    /* renamed from: e  reason: collision with root package name */
    public final C0283b f17484e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView.g<?> f17485f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17486g;
    @o0

    /* renamed from: h  reason: collision with root package name */
    public c f17487h;
    @o0

    /* renamed from: i  reason: collision with root package name */
    public TabLayout.f f17488i;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public RecyclerView.i f17489j;

    public class a extends RecyclerView.i {
        public a() {
        }

        public void a() {
            b.this.d();
        }

        public void b(int i10, int i11) {
            b.this.d();
        }

        public void c(int i10, int i11, @o0 Object obj) {
            b.this.d();
        }

        public void d(int i10, int i11) {
            b.this.d();
        }

        public void e(int i10, int i11, int i12) {
            b.this.d();
        }

        public void f(int i10, int i11) {
            b.this.d();
        }
    }

    /* renamed from: com.google.android.material.tabs.b$b  reason: collision with other inner class name */
    public interface C0283b {
        void a(@m0 TabLayout.i iVar, int i10);
    }

    public static class c extends ViewPager2.j {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f17491a;

        /* renamed from: b  reason: collision with root package name */
        public int f17492b;

        /* renamed from: c  reason: collision with root package name */
        public int f17493c;

        public c(TabLayout tabLayout) {
            this.f17491a = new WeakReference<>(tabLayout);
            d();
        }

        public void a(int i10) {
            this.f17492b = this.f17493c;
            this.f17493c = i10;
        }

        public void b(int i10, float f10, int i11) {
            TabLayout tabLayout = this.f17491a.get();
            if (tabLayout != null) {
                int i12 = this.f17493c;
                boolean z10 = false;
                boolean z11 = i12 != 2 || this.f17492b == 1;
                if (!(i12 == 2 && this.f17492b == 0)) {
                    z10 = true;
                }
                tabLayout.Q(i10, f10, z11, z10);
            }
        }

        public void c(int i10) {
            TabLayout tabLayout = this.f17491a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
                int i11 = this.f17493c;
                tabLayout.N(tabLayout.z(i10), i11 == 0 || (i11 == 2 && this.f17492b == 0));
            }
        }

        public void d() {
            this.f17493c = 0;
            this.f17492b = 0;
        }
    }

    public static class d implements TabLayout.f {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager2 f17494a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f17495b;

        public d(ViewPager2 viewPager2, boolean z10) {
            this.f17494a = viewPager2;
            this.f17495b = z10;
        }

        public void a(TabLayout.i iVar) {
        }

        public void b(@m0 TabLayout.i iVar) {
            this.f17494a.s(iVar.k(), this.f17495b);
        }

        public void c(TabLayout.i iVar) {
        }
    }

    public b(@m0 TabLayout tabLayout, @m0 ViewPager2 viewPager2, @m0 C0283b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    public b(@m0 TabLayout tabLayout, @m0 ViewPager2 viewPager2, boolean z10, @m0 C0283b bVar) {
        this(tabLayout, viewPager2, z10, true, bVar);
    }

    public b(@m0 TabLayout tabLayout, @m0 ViewPager2 viewPager2, boolean z10, boolean z11, @m0 C0283b bVar) {
        this.f17480a = tabLayout;
        this.f17481b = viewPager2;
        this.f17482c = z10;
        this.f17483d = z11;
        this.f17484e = bVar;
    }

    public void a() {
        if (!this.f17486g) {
            RecyclerView.g<?> adapter = this.f17481b.getAdapter();
            this.f17485f = adapter;
            if (adapter != null) {
                this.f17486g = true;
                c cVar = new c(this.f17480a);
                this.f17487h = cVar;
                this.f17481b.n(cVar);
                d dVar = new d(this.f17481b, this.f17483d);
                this.f17488i = dVar;
                this.f17480a.d(dVar);
                if (this.f17482c) {
                    a aVar = new a();
                    this.f17489j = aVar;
                    this.f17485f.C(aVar);
                }
                d();
                this.f17480a.P(this.f17481b.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public void b() {
        RecyclerView.g<?> gVar;
        if (this.f17482c && (gVar = this.f17485f) != null) {
            gVar.E(this.f17489j);
            this.f17489j = null;
        }
        this.f17480a.I(this.f17488i);
        this.f17481b.x(this.f17487h);
        this.f17488i = null;
        this.f17487h = null;
        this.f17485f = null;
        this.f17486g = false;
    }

    public boolean c() {
        return this.f17486g;
    }

    public void d() {
        int min;
        this.f17480a.G();
        RecyclerView.g<?> gVar = this.f17485f;
        if (gVar != null) {
            int e10 = gVar.e();
            for (int i10 = 0; i10 < e10; i10++) {
                TabLayout.i D = this.f17480a.D();
                this.f17484e.a(D, i10);
                this.f17480a.h(D, false);
            }
            if (e10 > 0 && (min = Math.min(this.f17481b.getCurrentItem(), this.f17480a.getTabCount() - 1)) != this.f17480a.getSelectedTabPosition()) {
                TabLayout tabLayout = this.f17480a;
                tabLayout.M(tabLayout.z(min));
            }
        }
    }
}
