package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import d.m0;
import java.util.Locale;

public final class g extends RecyclerView.t {

    /* renamed from: n  reason: collision with root package name */
    public static final int f4011n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f4012o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f4013p = 2;

    /* renamed from: q  reason: collision with root package name */
    public static final int f4014q = 3;

    /* renamed from: r  reason: collision with root package name */
    public static final int f4015r = 4;

    /* renamed from: s  reason: collision with root package name */
    public static final int f4016s = -1;

    /* renamed from: a  reason: collision with root package name */
    public ViewPager2.j f4017a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager2 f4018b;
    @m0

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f4019c;
    @m0

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayoutManager f4020d;

    /* renamed from: e  reason: collision with root package name */
    public int f4021e;

    /* renamed from: f  reason: collision with root package name */
    public int f4022f;

    /* renamed from: g  reason: collision with root package name */
    public a f4023g = new a();

    /* renamed from: h  reason: collision with root package name */
    public int f4024h;

    /* renamed from: i  reason: collision with root package name */
    public int f4025i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4026j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4027k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4028l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4029m;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f4030a;

        /* renamed from: b  reason: collision with root package name */
        public float f4031b;

        /* renamed from: c  reason: collision with root package name */
        public int f4032c;

        public void a() {
            this.f4030a = -1;
            this.f4031b = 0.0f;
            this.f4032c = 0;
        }
    }

    public g(@m0 ViewPager2 viewPager2) {
        this.f4018b = viewPager2;
        RecyclerView recyclerView = viewPager2.f3971a0;
        this.f4019c = recyclerView;
        this.f4020d = (LinearLayoutManager) recyclerView.getLayoutManager();
        q();
    }

    public void a(@m0 RecyclerView recyclerView, int i10) {
        boolean z10 = true;
        if (!(this.f4021e == 1 && this.f4022f == 1) && i10 == 1) {
            s(false);
        } else if (!l() || i10 != 2) {
            if (l() && i10 == 0) {
                t();
                if (!this.f4027k) {
                    int i11 = this.f4023g.f4030a;
                    if (i11 != -1) {
                        c(i11, 0.0f, 0);
                    }
                } else {
                    a aVar = this.f4023g;
                    if (aVar.f4032c == 0) {
                        int i12 = this.f4024h;
                        int i13 = aVar.f4030a;
                        if (i12 != i13) {
                            d(i13);
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    e(0);
                    q();
                }
            }
            if (this.f4021e == 2 && i10 == 0 && this.f4028l) {
                t();
                a aVar2 = this.f4023g;
                if (aVar2.f4032c == 0) {
                    int i14 = this.f4025i;
                    int i15 = aVar2.f4030a;
                    if (i14 != i15) {
                        if (i15 == -1) {
                            i15 = 0;
                        }
                        d(i15);
                    }
                    e(0);
                    q();
                }
            }
        } else if (this.f4027k) {
            e(2);
            this.f4026j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r3.f4024h != r5) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r5 < 0) == r3.f4018b.k()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(@d.m0 androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f4027k = r4
            r3.t()
            boolean r0 = r3.f4026j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x003a
            r3.f4026j = r2
            if (r6 > 0) goto L_0x0022
            if (r6 != 0) goto L_0x0020
            if (r5 >= 0) goto L_0x0016
            r5 = r4
            goto L_0x0017
        L_0x0016:
            r5 = r2
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f4018b
            boolean r6 = r6.k()
            if (r5 != r6) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r5 = r2
            goto L_0x0023
        L_0x0022:
            r5 = r4
        L_0x0023:
            if (r5 == 0) goto L_0x002f
            androidx.viewpager2.widget.g$a r5 = r3.f4023g
            int r6 = r5.f4032c
            if (r6 == 0) goto L_0x002f
            int r5 = r5.f4030a
            int r5 = r5 + r4
            goto L_0x0033
        L_0x002f:
            androidx.viewpager2.widget.g$a r5 = r3.f4023g
            int r5 = r5.f4030a
        L_0x0033:
            r3.f4025i = r5
            int r6 = r3.f4024h
            if (r6 == r5) goto L_0x0048
            goto L_0x0045
        L_0x003a:
            int r5 = r3.f4021e
            if (r5 != 0) goto L_0x0048
            androidx.viewpager2.widget.g$a r5 = r3.f4023g
            int r5 = r5.f4030a
            if (r5 != r1) goto L_0x0045
            r5 = r2
        L_0x0045:
            r3.d(r5)
        L_0x0048:
            androidx.viewpager2.widget.g$a r5 = r3.f4023g
            int r6 = r5.f4030a
            if (r6 != r1) goto L_0x004f
            r6 = r2
        L_0x004f:
            float r0 = r5.f4031b
            int r5 = r5.f4032c
            r3.c(r6, r0, r5)
            androidx.viewpager2.widget.g$a r5 = r3.f4023g
            int r6 = r5.f4030a
            int r0 = r3.f4025i
            if (r6 == r0) goto L_0x0060
            if (r0 != r1) goto L_0x006e
        L_0x0060:
            int r5 = r5.f4032c
            if (r5 != 0) goto L_0x006e
            int r5 = r3.f4022f
            if (r5 == r4) goto L_0x006e
            r3.e(r2)
            r3.q()
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.g.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i10, float f10, int i11) {
        ViewPager2.j jVar = this.f4017a;
        if (jVar != null) {
            jVar.b(i10, f10, i11);
        }
    }

    public final void d(int i10) {
        ViewPager2.j jVar = this.f4017a;
        if (jVar != null) {
            jVar.c(i10);
        }
    }

    public final void e(int i10) {
        if ((this.f4021e != 3 || this.f4022f != 0) && this.f4022f != i10) {
            this.f4022f = i10;
            ViewPager2.j jVar = this.f4017a;
            if (jVar != null) {
                jVar.a(i10);
            }
        }
    }

    public final int f() {
        return this.f4020d.y2();
    }

    public double g() {
        t();
        a aVar = this.f4023g;
        return ((double) aVar.f4030a) + ((double) aVar.f4031b);
    }

    public int h() {
        return this.f4022f;
    }

    public boolean i() {
        return this.f4022f == 1;
    }

    public boolean j() {
        return this.f4029m;
    }

    public boolean k() {
        return this.f4022f == 0;
    }

    public final boolean l() {
        int i10 = this.f4021e;
        return i10 == 1 || i10 == 4;
    }

    public void m() {
        this.f4021e = 4;
        s(true);
    }

    public void n() {
        this.f4028l = true;
    }

    public void o() {
        if (!i() || this.f4029m) {
            this.f4029m = false;
            t();
            a aVar = this.f4023g;
            if (aVar.f4032c == 0) {
                int i10 = aVar.f4030a;
                if (i10 != this.f4024h) {
                    d(i10);
                }
                e(0);
                q();
                return;
            }
            e(2);
        }
    }

    public void p(int i10, boolean z10) {
        this.f4021e = z10 ? 2 : 3;
        boolean z11 = false;
        this.f4029m = false;
        if (this.f4025i != i10) {
            z11 = true;
        }
        this.f4025i = i10;
        e(2);
        if (z11) {
            d(i10);
        }
    }

    public final void q() {
        this.f4021e = 0;
        this.f4022f = 0;
        this.f4023g.a();
        this.f4024h = -1;
        this.f4025i = -1;
        this.f4026j = false;
        this.f4027k = false;
        this.f4029m = false;
        this.f4028l = false;
    }

    public void r(ViewPager2.j jVar) {
        this.f4017a = jVar;
    }

    public final void s(boolean z10) {
        this.f4029m = z10;
        this.f4021e = z10 ? 4 : 1;
        int i10 = this.f4025i;
        if (i10 != -1) {
            this.f4024h = i10;
            this.f4025i = -1;
        } else if (this.f4024h == -1) {
            this.f4024h = f();
        }
        e(1);
    }

    public final void t() {
        int i10;
        a aVar = this.f4023g;
        int y22 = this.f4020d.y2();
        aVar.f4030a = y22;
        if (y22 == -1) {
            aVar.a();
            return;
        }
        View J = this.f4020d.J(y22);
        if (J == null) {
            aVar.a();
            return;
        }
        int j02 = this.f4020d.j0(J);
        int u02 = this.f4020d.u0(J);
        int x02 = this.f4020d.x0(J);
        int O = this.f4020d.O(J);
        ViewGroup.LayoutParams layoutParams = J.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            j02 += marginLayoutParams.leftMargin;
            u02 += marginLayoutParams.rightMargin;
            x02 += marginLayoutParams.topMargin;
            O += marginLayoutParams.bottomMargin;
        }
        int height = J.getHeight() + x02 + O;
        int width = J.getWidth() + j02 + u02;
        if (this.f4020d.Q2() == 0) {
            i10 = (J.getLeft() - j02) - this.f4019c.getPaddingLeft();
            if (this.f4018b.k()) {
                i10 = -i10;
            }
            height = width;
        } else {
            i10 = (J.getTop() - x02) - this.f4019c.getPaddingTop();
        }
        int i11 = -i10;
        aVar.f4032c = i11;
        if (i11 >= 0) {
            aVar.f4031b = height == 0 ? 0.0f : ((float) i11) / ((float) height);
        } else if (new a(this.f4020d).d()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[]{Integer.valueOf(aVar.f4032c)}));
        }
    }
}
