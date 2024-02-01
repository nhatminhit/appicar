package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

@Deprecated
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public OverScroller f2302a;

    public p(Context context, Interpolator interpolator) {
        OverScroller overScroller;
        if (interpolator == null) {
            overScroller = new OverScroller(context);
        }
        this.f2302a = overScroller;
    }

    @Deprecated
    public static p c(Context context) {
        return d(context, (Interpolator) null);
    }

    @Deprecated
    public static p d(Context context, Interpolator interpolator) {
        return new p(context, interpolator);
    }

    @Deprecated
    public void a() {
        this.f2302a.abortAnimation();
    }

    @Deprecated
    public boolean b() {
        return this.f2302a.computeScrollOffset();
    }

    @Deprecated
    public void e(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f2302a.fling(i10, i11, i12, i13, i14, i15, i16, i17);
    }

    @Deprecated
    public void f(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f2302a.fling(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19);
    }

    @Deprecated
    public float g() {
        return this.f2302a.getCurrVelocity();
    }

    @Deprecated
    public int h() {
        return this.f2302a.getCurrX();
    }

    @Deprecated
    public int i() {
        return this.f2302a.getCurrY();
    }

    @Deprecated
    public int j() {
        return this.f2302a.getFinalX();
    }

    @Deprecated
    public int k() {
        return this.f2302a.getFinalY();
    }

    @Deprecated
    public boolean l() {
        return this.f2302a.isFinished();
    }

    @Deprecated
    public boolean m() {
        return this.f2302a.isOverScrolled();
    }

    @Deprecated
    public void n(int i10, int i11, int i12) {
        this.f2302a.notifyHorizontalEdgeReached(i10, i11, i12);
    }

    @Deprecated
    public void o(int i10, int i11, int i12) {
        this.f2302a.notifyVerticalEdgeReached(i10, i11, i12);
    }

    @Deprecated
    public boolean p(int i10, int i11, int i12, int i13, int i14, int i15) {
        return this.f2302a.springBack(i10, i11, i12, i13, i14, i15);
    }

    @Deprecated
    public void q(int i10, int i11, int i12, int i13) {
        this.f2302a.startScroll(i10, i11, i12, i13);
    }

    @Deprecated
    public void r(int i10, int i11, int i12, int i13, int i14) {
        this.f2302a.startScroll(i10, i11, i12, i13, i14);
    }
}
