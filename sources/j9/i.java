package j9;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import d.m0;
import d.o0;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public long f19844a;

    /* renamed from: b  reason: collision with root package name */
    public long f19845b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f19846c;

    /* renamed from: d  reason: collision with root package name */
    public int f19847d;

    /* renamed from: e  reason: collision with root package name */
    public int f19848e;

    public i(long j10, long j11) {
        this.f19846c = null;
        this.f19847d = 0;
        this.f19848e = 1;
        this.f19844a = j10;
        this.f19845b = j11;
    }

    public i(long j10, long j11, @m0 TimeInterpolator timeInterpolator) {
        this.f19847d = 0;
        this.f19848e = 1;
        this.f19844a = j10;
        this.f19845b = j11;
        this.f19846c = timeInterpolator;
    }

    @m0
    public static i b(@m0 ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f19847d = valueAnimator.getRepeatCount();
        iVar.f19848e = valueAnimator.getRepeatMode();
        return iVar;
    }

    public static TimeInterpolator f(@m0 ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f19829b : interpolator instanceof AccelerateInterpolator ? a.f19830c : interpolator instanceof DecelerateInterpolator ? a.f19831d : interpolator;
    }

    public void a(@m0 Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f19844a;
    }

    public long d() {
        return this.f19845b;
    }

    @o0
    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f19846c;
        return timeInterpolator != null ? timeInterpolator : a.f19829b;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f19847d;
    }

    public int h() {
        return this.f19848e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    @m0
    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }
}
