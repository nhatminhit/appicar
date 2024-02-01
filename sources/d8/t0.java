package d8;

import java.util.concurrent.Callable;

public final class t0 extends v0 {

    /* renamed from: f  reason: collision with root package name */
    public final Callable f6653f;

    public /* synthetic */ t0(Callable callable, s0 s0Var) {
        super(false, 1, 5, (String) null, (Throwable) null, (u0) null);
        this.f6653f = callable;
    }

    public final String a() {
        try {
            return (String) this.f6653f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
