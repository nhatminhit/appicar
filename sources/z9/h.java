package z9;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import d.m0;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public View f24877a;

    /* renamed from: b  reason: collision with root package name */
    public j f24878b;

    /* renamed from: c  reason: collision with root package name */
    public ScrollView f24879c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f24880d = new int[2];

    /* renamed from: e  reason: collision with root package name */
    public final int[] f24881e = new int[2];

    /* renamed from: f  reason: collision with root package name */
    public final ViewTreeObserver.OnScrollChangedListener f24882f = new a();

    public class a implements ViewTreeObserver.OnScrollChangedListener {
        public a() {
        }

        public void onScrollChanged() {
            h.this.e();
        }
    }

    public h(View view, j jVar, ScrollView scrollView) {
        this.f24877a = view;
        this.f24878b = jVar;
        this.f24879c = scrollView;
    }

    public void a(ScrollView scrollView) {
        this.f24879c = scrollView;
    }

    public void b(j jVar) {
        this.f24878b = jVar;
    }

    public void c(@m0 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f24882f);
    }

    public void d(@m0 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f24882f);
    }

    public void e() {
        j jVar;
        float f10;
        ScrollView scrollView = this.f24879c;
        if (scrollView != null) {
            if (scrollView.getChildCount() != 0) {
                this.f24879c.getLocationInWindow(this.f24880d);
                this.f24879c.getChildAt(0).getLocationInWindow(this.f24881e);
                int top = (this.f24877a.getTop() - this.f24880d[1]) + this.f24881e[1];
                int height = this.f24877a.getHeight();
                int height2 = this.f24879c.getHeight();
                if (top < 0) {
                    jVar = this.f24878b;
                    f10 = (((float) top) / ((float) height)) + 1.0f;
                } else {
                    int i10 = top + height;
                    if (i10 > height2) {
                        int i11 = i10 - height2;
                        jVar = this.f24878b;
                        f10 = 1.0f - (((float) i11) / ((float) height));
                    } else if (this.f24878b.z() != 1.0f) {
                        this.f24878b.o0(1.0f);
                        this.f24877a.invalidate();
                        return;
                    } else {
                        return;
                    }
                }
                jVar.o0(Math.max(0.0f, Math.min(1.0f, f10)));
                this.f24877a.invalidate();
                return;
            }
            throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
        }
    }
}
