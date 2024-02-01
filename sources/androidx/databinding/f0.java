package androidx.databinding;

import androidx.lifecycle.y;
import d.o0;
import d.x0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

@x0({x0.a.P})
public class f0<T> extends WeakReference<ViewDataBinding> {

    /* renamed from: a  reason: collision with root package name */
    public final a0<T> f2362a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2363b;

    /* renamed from: c  reason: collision with root package name */
    public T f2364c;

    public f0(ViewDataBinding viewDataBinding, int i10, a0<T> a0Var, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.f2363b = i10;
        this.f2362a = a0Var;
    }

    @o0
    public ViewDataBinding a() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            e();
        }
        return viewDataBinding;
    }

    public T b() {
        return this.f2364c;
    }

    public void c(y yVar) {
        this.f2362a.b(yVar);
    }

    public void d(T t10) {
        e();
        this.f2364c = t10;
        if (t10 != null) {
            this.f2362a.e(t10);
        }
    }

    public boolean e() {
        boolean z10;
        T t10 = this.f2364c;
        if (t10 != null) {
            this.f2362a.d(t10);
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2364c = null;
        return z10;
    }
}
