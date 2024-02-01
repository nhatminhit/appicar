package je;

import java.util.concurrent.CancellationException;
import oe.f;
import zd.h1;

public final class a {
    @h1(version = "1.4")
    @f
    public static final CancellationException a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @h1(version = "1.4")
    @f
    public static final CancellationException b(Throwable th2) {
        CancellationException cancellationException = new CancellationException(th2 != null ? th2.toString() : null);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @h1(version = "1.4")
    public static /* synthetic */ void c() {
    }
}
