package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import d.m0;
import d.r0;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public final class b extends ViewPager2.j {
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final List<ViewPager2.j> f3998a;

    public b(int i10) {
        this.f3998a = new ArrayList(i10);
    }

    public void a(int i10) {
        try {
            for (ViewPager2.j a10 : this.f3998a) {
                a10.a(i10);
            }
        } catch (ConcurrentModificationException e10) {
            f(e10);
        }
    }

    public void b(int i10, float f10, @r0 int i11) {
        try {
            for (ViewPager2.j b10 : this.f3998a) {
                b10.b(i10, f10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            f(e10);
        }
    }

    public void c(int i10) {
        try {
            for (ViewPager2.j c10 : this.f3998a) {
                c10.c(i10);
            }
        } catch (ConcurrentModificationException e10) {
            f(e10);
        }
    }

    public void d(ViewPager2.j jVar) {
        this.f3998a.add(jVar);
    }

    public void e(ViewPager2.j jVar) {
        this.f3998a.remove(jVar);
    }

    public final void f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
