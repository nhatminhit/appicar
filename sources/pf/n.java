package pf;

import fh.g;
import fh.h;
import java.util.concurrent.Future;
import kotlin.Metadata;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lpf/n;", "Lpf/u2;", "", "cause", "Lzd/u2;", "X0", "Ljava/util/concurrent/Future;", "S", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class n extends u2 {
    @g
    public final Future<?> S;

    public n(@g Future<?> future) {
        this.S = future;
    }

    public /* bridge */ /* synthetic */ Object A(Object obj) {
        X0((Throwable) obj);
        return u2.f25116a;
    }

    public void X0(@h Throwable th2) {
        if (th2 != null) {
            this.S.cancel(false);
        }
    }
}
