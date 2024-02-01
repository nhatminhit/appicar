package h9;

import d.m0;
import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

public final class w<T> implements v<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8955a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final int f8956b;

    /* renamed from: c  reason: collision with root package name */
    public final s0 f8957c;
    @GuardedBy("mLock")

    /* renamed from: d  reason: collision with root package name */
    public int f8958d;
    @GuardedBy("mLock")

    /* renamed from: e  reason: collision with root package name */
    public int f8959e;
    @GuardedBy("mLock")

    /* renamed from: f  reason: collision with root package name */
    public int f8960f;
    @GuardedBy("mLock")

    /* renamed from: g  reason: collision with root package name */
    public Exception f8961g;
    @GuardedBy("mLock")

    /* renamed from: h  reason: collision with root package name */
    public boolean f8962h;

    public w(int i10, s0 s0Var) {
        this.f8956b = i10;
        this.f8957c = s0Var;
    }

    public final void a(T t10) {
        synchronized (this.f8955a) {
            this.f8958d++;
            d();
        }
    }

    public final void b() {
        synchronized (this.f8955a) {
            this.f8960f++;
            this.f8962h = true;
            d();
        }
    }

    public final void c(@m0 Exception exc) {
        synchronized (this.f8955a) {
            this.f8959e++;
            this.f8961g = exc;
            d();
        }
    }

    @GuardedBy("mLock")
    public final void d() {
        if (this.f8958d + this.f8959e + this.f8960f != this.f8956b) {
            return;
        }
        if (this.f8961g != null) {
            s0 s0Var = this.f8957c;
            int i10 = this.f8959e;
            int i11 = this.f8956b;
            s0Var.y(new ExecutionException(i10 + " out of " + i11 + " underlying tasks failed", this.f8961g));
        } else if (this.f8962h) {
            this.f8957c.A();
        } else {
            this.f8957c.z((Object) null);
        }
    }
}
