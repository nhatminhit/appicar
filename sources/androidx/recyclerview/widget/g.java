package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class g {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f3437d = false;

    /* renamed from: e  reason: collision with root package name */
    public static final String f3438e = "ChildrenHelper";

    /* renamed from: a  reason: collision with root package name */
    public final b f3439a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3440b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<View> f3441c = new ArrayList();

    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final int f3442c = 64;

        /* renamed from: d  reason: collision with root package name */
        public static final long f3443d = Long.MIN_VALUE;

        /* renamed from: a  reason: collision with root package name */
        public long f3444a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f3445b;

        public void a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f3445b;
                if (aVar != null) {
                    aVar.a(i10 - 64);
                    return;
                }
                return;
            }
            this.f3444a &= ~(1 << i10);
        }

        public int b(int i10) {
            a aVar = this.f3445b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f3444a) : Long.bitCount(this.f3444a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f3444a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f3444a);
        }

        public final void c() {
            if (this.f3445b == null) {
                this.f3445b = new a();
            }
        }

        public boolean d(int i10) {
            if (i10 < 64) {
                return (this.f3444a & (1 << i10)) != 0;
            }
            c();
            return this.f3445b.d(i10 - 64);
        }

        public void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f3445b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f3444a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f3444a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f3445b != null) {
                c();
                this.f3445b.e(0, z11);
            }
        }

        public boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f3445b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f3444a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f3444a = j12;
            long j13 = j10 - 1;
            this.f3444a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f3445b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f3445b.f(0);
            }
            return z10;
        }

        public void g() {
            this.f3444a = 0;
            a aVar = this.f3445b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i10) {
            if (i10 >= 64) {
                c();
                this.f3445b.h(i10 - 64);
                return;
            }
            this.f3444a |= 1 << i10;
        }

        public String toString() {
            if (this.f3445b == null) {
                return Long.toBinaryString(this.f3444a);
            }
            return this.f3445b.toString() + "xx" + Long.toBinaryString(this.f3444a);
        }
    }

    public interface b {
        View a(int i10);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.e0 f(View view);

        void g(int i10);

        void h(View view);

        void i(View view, int i10);

        void j(int i10);

        void k(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    public g(b bVar) {
        this.f3439a = bVar;
    }

    public void a(View view, int i10, boolean z10) {
        int c10 = i10 < 0 ? this.f3439a.c() : h(i10);
        this.f3440b.e(c10, z10);
        if (z10) {
            l(view);
        }
        this.f3439a.i(view, c10);
    }

    public void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    public void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int c10 = i10 < 0 ? this.f3439a.c() : h(i10);
        this.f3440b.e(c10, z10);
        if (z10) {
            l(view);
        }
        this.f3439a.k(view, c10, layoutParams);
    }

    public void d(int i10) {
        int h10 = h(i10);
        this.f3440b.f(h10);
        this.f3439a.g(h10);
    }

    public View e(int i10) {
        int size = this.f3441c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f3441c.get(i11);
            RecyclerView.e0 f10 = this.f3439a.f(view);
            if (f10.m() == i10 && !f10.u() && !f10.w()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i10) {
        return this.f3439a.a(h(i10));
    }

    public int g() {
        return this.f3439a.c() - this.f3441c.size();
    }

    public final int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int c10 = this.f3439a.c();
        int i11 = i10;
        while (i11 < c10) {
            int b10 = i10 - (i11 - this.f3440b.b(i11));
            if (b10 == 0) {
                while (this.f3440b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    public View i(int i10) {
        return this.f3439a.a(i10);
    }

    public int j() {
        return this.f3439a.c();
    }

    public void k(View view) {
        int e10 = this.f3439a.e(view);
        if (e10 >= 0) {
            this.f3440b.h(e10);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public final void l(View view) {
        this.f3441c.add(view);
        this.f3439a.b(view);
    }

    public int m(View view) {
        int e10 = this.f3439a.e(view);
        if (e10 != -1 && !this.f3440b.d(e10)) {
            return e10 - this.f3440b.b(e10);
        }
        return -1;
    }

    public boolean n(View view) {
        return this.f3441c.contains(view);
    }

    public void o() {
        this.f3440b.g();
        for (int size = this.f3441c.size() - 1; size >= 0; size--) {
            this.f3439a.h(this.f3441c.get(size));
            this.f3441c.remove(size);
        }
        this.f3439a.d();
    }

    public void p(View view) {
        int e10 = this.f3439a.e(view);
        if (e10 >= 0) {
            if (this.f3440b.f(e10)) {
                t(view);
            }
            this.f3439a.j(e10);
        }
    }

    public void q(int i10) {
        int h10 = h(i10);
        View a10 = this.f3439a.a(h10);
        if (a10 != null) {
            if (this.f3440b.f(h10)) {
                t(a10);
            }
            this.f3439a.j(h10);
        }
    }

    public boolean r(View view) {
        int e10 = this.f3439a.e(view);
        if (e10 == -1) {
            t(view);
            return true;
        } else if (!this.f3440b.d(e10)) {
            return false;
        } else {
            this.f3440b.f(e10);
            t(view);
            this.f3439a.j(e10);
            return true;
        }
    }

    public void s(View view) {
        int e10 = this.f3439a.e(view);
        if (e10 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f3440b.d(e10)) {
            this.f3440b.a(e10);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean t(View view) {
        if (!this.f3441c.remove(view)) {
            return false;
        }
        this.f3439a.h(view);
        return true;
    }

    public String toString() {
        return this.f3440b.toString() + ", hidden list:" + this.f3441c.size();
    }
}
