package f8;

import com.google.android.gms.common.api.Status;
import d.m0;
import e8.a;
import f8.u;

public abstract class w<R extends u> implements v<R> {
    @a
    public final void a(@m0 R r10) {
        Status g10 = r10.g();
        if (g10.r1()) {
            c(r10);
            return;
        }
        b(g10);
        if (r10 instanceof q) {
            try {
                ((q) r10).a();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(r10));
            }
        }
    }

    public abstract void b(@m0 Status status);

    public abstract void c(@m0 R r10);
}
