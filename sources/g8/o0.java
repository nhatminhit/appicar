package g8;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.g1;
import java.lang.ref.WeakReference;

public final class o0 extends a {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f8247a;

    @g1(otherwise = 2)
    public o0(s sVar) {
        this.f8247a = new WeakReference(sVar);
    }

    @CanIgnoreReturnValue
    public final a b(Runnable runnable) {
        s sVar = (s) this.f8247a.get();
        if (sVar != null) {
            sVar.o(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }
}
