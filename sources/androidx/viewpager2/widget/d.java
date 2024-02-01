package androidx.viewpager2.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import d.f1;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ViewPager2 f4000a;

    /* renamed from: b  reason: collision with root package name */
    public final g f4001b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f4002c;

    /* renamed from: d  reason: collision with root package name */
    public VelocityTracker f4003d;

    /* renamed from: e  reason: collision with root package name */
    public int f4004e;

    /* renamed from: f  reason: collision with root package name */
    public float f4005f;

    /* renamed from: g  reason: collision with root package name */
    public int f4006g;

    /* renamed from: h  reason: collision with root package name */
    public long f4007h;

    public d(ViewPager2 viewPager2, g gVar, RecyclerView recyclerView) {
        this.f4000a = viewPager2;
        this.f4001b = gVar;
        this.f4002c = recyclerView;
    }

    public final void a(long j10, int i10, float f10, float f11) {
        MotionEvent obtain = MotionEvent.obtain(this.f4007h, j10, i10, f10, f11, 0);
        this.f4003d.addMovement(obtain);
        obtain.recycle();
    }

    @f1
    public boolean b() {
        if (this.f4001b.i()) {
            return false;
        }
        this.f4006g = 0;
        this.f4005f = (float) 0;
        this.f4007h = SystemClock.uptimeMillis();
        c();
        this.f4001b.m();
        if (!this.f4001b.k()) {
            this.f4002c.N1();
        }
        a(this.f4007h, 0, 0.0f, 0.0f);
        return true;
    }

    public final void c() {
        VelocityTracker velocityTracker = this.f4003d;
        if (velocityTracker == null) {
            this.f4003d = VelocityTracker.obtain();
            this.f4004e = ViewConfiguration.get(this.f4000a.getContext()).getScaledMaximumFlingVelocity();
            return;
        }
        velocityTracker.clear();
    }

    @f1
    public boolean d() {
        if (!this.f4001b.j()) {
            return false;
        }
        this.f4001b.o();
        VelocityTracker velocityTracker = this.f4003d;
        velocityTracker.computeCurrentVelocity(1000, (float) this.f4004e);
        if (this.f4002c.l0((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            return true;
        }
        this.f4000a.v();
        return true;
    }

    @f1
    public boolean e(float f10) {
        int i10 = 0;
        if (!this.f4001b.j()) {
            return false;
        }
        float f11 = this.f4005f - f10;
        this.f4005f = f11;
        int round = Math.round(f11 - ((float) this.f4006g));
        this.f4006g += round;
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z10 = this.f4000a.getOrientation() == 0;
        int i11 = z10 ? round : 0;
        if (!z10) {
            i10 = round;
        }
        float f12 = 0.0f;
        float f13 = z10 ? this.f4005f : 0.0f;
        if (!z10) {
            f12 = this.f4005f;
        }
        this.f4002c.scrollBy(i11, i10);
        a(uptimeMillis, 2, f13, f12);
        return true;
    }

    public boolean f() {
        return this.f4001b.j();
    }
}
