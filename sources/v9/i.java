package v9;

import android.animation.Animator;
import d.m0;
import j3.b;

public abstract class i<T extends Animator> {

    /* renamed from: a  reason: collision with root package name */
    public j f23482a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f23483b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f23484c;

    public i(int i10) {
        this.f23483b = new float[(i10 * 2)];
        this.f23484c = new int[i10];
    }

    public abstract void a();

    public float b(int i10, int i11, int i12) {
        return ((float) (i10 - i11)) / ((float) i12);
    }

    public abstract void c();

    public abstract void d(@m0 b.a aVar);

    public void e(@m0 j jVar) {
        this.f23482a = jVar;
    }

    public abstract void f();

    public abstract void g();

    public abstract void h();
}
