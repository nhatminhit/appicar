package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import d.m0;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public EdgeEffect f2293a;

    @Deprecated
    public i(Context context) {
        this.f2293a = new EdgeEffect(context);
    }

    public static void e(@m0 EdgeEffect edgeEffect, float f10, float f11) {
        edgeEffect.onPull(f10, f11);
    }

    @Deprecated
    public boolean a(Canvas canvas) {
        return this.f2293a.draw(canvas);
    }

    @Deprecated
    public void b() {
        this.f2293a.finish();
    }

    @Deprecated
    public boolean c() {
        return this.f2293a.isFinished();
    }

    @Deprecated
    public boolean d(int i10) {
        this.f2293a.onAbsorb(i10);
        return true;
    }

    @Deprecated
    public boolean f(float f10) {
        this.f2293a.onPull(f10);
        return true;
    }

    @Deprecated
    public boolean g(float f10, float f11) {
        e(this.f2293a, f10, f11);
        return true;
    }

    @Deprecated
    public boolean h() {
        this.f2293a.onRelease();
        return this.f2293a.isFinished();
    }

    @Deprecated
    public void i(int i10, int i11) {
        this.f2293a.setSize(i10, i11);
    }
}
