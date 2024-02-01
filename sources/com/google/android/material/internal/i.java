package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import d.m0;
import d.o0;
import d.x0;
import java.util.ArrayList;

@x0({x0.a.LIBRARY_GROUP})
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f17223a = new ArrayList<>();
    @o0

    /* renamed from: b  reason: collision with root package name */
    public b f17224b = null;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f17225c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Animator.AnimatorListener f17226d = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            i iVar = i.this;
            if (iVar.f17225c == animator) {
                iVar.f17225c = null;
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f17228a;

        /* renamed from: b  reason: collision with root package name */
        public final ValueAnimator f17229b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f17228a = iArr;
            this.f17229b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f17226d);
        this.f17223a.add(bVar);
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f17225c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f17225c = null;
        }
    }

    public void c() {
        ValueAnimator valueAnimator = this.f17225c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f17225c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f17223a.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                bVar = null;
                break;
            }
            bVar = this.f17223a.get(i10);
            if (StateSet.stateSetMatches(bVar.f17228a, iArr)) {
                break;
            }
            i10++;
        }
        b bVar2 = this.f17224b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                b();
            }
            this.f17224b = bVar;
            if (bVar != null) {
                e(bVar);
            }
        }
    }

    public final void e(@m0 b bVar) {
        ValueAnimator valueAnimator = bVar.f17229b;
        this.f17225c = valueAnimator;
        valueAnimator.start();
    }
}
