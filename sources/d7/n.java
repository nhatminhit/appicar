package d7;

import java.util.List;
import t7.o;

public final class n extends b {

    /* renamed from: e  reason: collision with root package name */
    public final List<? extends l> f6559e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6560f;

    public n(List<? extends l> list, boolean z10) {
        super(0, (long) (list.size() - 1));
        this.f6559e = list;
        this.f6560f = z10;
    }

    public long b() {
        return g().f6520f;
    }

    public o c() {
        return g().f6515a;
    }

    public long d() {
        return g().f6521g;
    }

    public final l g() {
        int f10 = (int) super.f();
        if (this.f6560f) {
            f10 = (this.f6559e.size() - 1) - f10;
        }
        return (l) this.f6559e.get(f10);
    }
}
