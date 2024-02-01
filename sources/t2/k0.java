package t2;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import d.g1;
import d.m0;
import d.o0;
import e1.n;
import f1.w1;

public final class k0 extends a {

    /* renamed from: g  reason: collision with root package name */
    public static final String f12843g = "ViewAutoScroller";

    /* renamed from: h  reason: collision with root package name */
    public static final float f12844h = 0.125f;

    /* renamed from: i  reason: collision with root package name */
    public static final int f12845i = 70;

    /* renamed from: a  reason: collision with root package name */
    public final float f12846a;

    /* renamed from: b  reason: collision with root package name */
    public final c f12847b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f12848c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public Point f12849d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public Point f12850e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12851f;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            k0.this.f();
        }
    }

    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView f12852a;

        public b(@m0 RecyclerView recyclerView) {
            this.f12852a = recyclerView;
        }

        public int a() {
            Rect rect = new Rect();
            this.f12852a.getGlobalVisibleRect(rect);
            return rect.height();
        }

        public void b(@m0 Runnable runnable) {
            this.f12852a.removeCallbacks(runnable);
        }

        public void c(@m0 Runnable runnable) {
            w1.n1(this.f12852a, runnable);
        }

        public void d(int i10) {
            this.f12852a.scrollBy(0, i10);
        }
    }

    public static abstract class c {
        public abstract int a();

        public abstract void b(@m0 Runnable runnable);

        public abstract void c(@m0 Runnable runnable);

        public abstract void d(int i10);
    }

    public k0(@m0 c cVar) {
        this(cVar, 0.125f);
    }

    @g1
    public k0(@m0 c cVar, float f10) {
        n.a(cVar != null);
        this.f12847b = cVar;
        this.f12846a = f10;
        this.f12848c = new a();
    }

    public static c e(RecyclerView recyclerView) {
        return new b(recyclerView);
    }

    public void a() {
        this.f12847b.b(this.f12848c);
        this.f12849d = null;
        this.f12850e = null;
        this.f12851f = false;
    }

    public void b(@m0 Point point) {
        this.f12850e = point;
        if (this.f12849d == null) {
            this.f12849d = point;
        }
        this.f12847b.c(this.f12848c);
    }

    public final boolean c(@m0 Point point) {
        float f10 = this.f12846a;
        return Math.abs(this.f12849d.y - point.y) >= ((int) ((((float) this.f12847b.a()) * f10) * (f10 * 2.0f)));
    }

    @g1
    public int d(int i10) {
        int signum = (int) Math.signum((float) i10);
        int g10 = (int) (((float) (signum * 70)) * g(Math.min(1.0f, ((float) Math.abs(i10)) / ((float) ((int) (((float) this.f12847b.a()) * this.f12846a))))));
        return g10 != 0 ? g10 : signum;
    }

    public void f() {
        int a10 = (int) (((float) this.f12847b.a()) * this.f12846a);
        int i10 = this.f12850e.y;
        int a11 = i10 <= a10 ? i10 - a10 : i10 >= this.f12847b.a() - a10 ? (this.f12850e.y - this.f12847b.a()) + a10 : 0;
        if (a11 != 0) {
            if (this.f12851f || c(this.f12850e)) {
                this.f12851f = true;
                if (a11 <= a10) {
                    a10 = a11;
                }
                this.f12847b.d(d(a10));
                this.f12847b.b(this.f12848c);
                this.f12847b.c(this.f12848c);
            }
        }
    }

    public final float g(float f10) {
        return (float) Math.pow((double) f10, 10.0d);
    }
}
