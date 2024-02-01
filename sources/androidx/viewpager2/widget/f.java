package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import d.o0;
import java.util.Locale;

public final class f extends ViewPager2.j {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayoutManager f4009a;

    /* renamed from: b  reason: collision with root package name */
    public ViewPager2.m f4010b;

    public f(LinearLayoutManager linearLayoutManager) {
        this.f4009a = linearLayoutManager;
    }

    public void a(int i10) {
    }

    public void b(int i10, float f10, int i11) {
        if (this.f4010b != null) {
            float f11 = -f10;
            int i12 = 0;
            while (i12 < this.f4009a.Q()) {
                View P = this.f4009a.P(i12);
                if (P != null) {
                    this.f4010b.a(P, ((float) (this.f4009a.s0(P) - i10)) + f11);
                    i12++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i12), Integer.valueOf(this.f4009a.Q())}));
                }
            }
        }
    }

    public void c(int i10) {
    }

    public ViewPager2.m d() {
        return this.f4010b;
    }

    public void e(@o0 ViewPager2.m mVar) {
        this.f4010b = mVar;
    }
}
