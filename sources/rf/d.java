package rf;

import fh.g;
import fh.h;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import pf.n2;
import pf.r0;
import pf.y1;
import pf.z0;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\u0012"}, d2 = {"Lrf/d;", "E", "Lrf/o;", "Lrf/f;", "", "cause", "Lzd/u2;", "i1", "exception", "", "K0", "Lie/g;", "parentContext", "Lrf/n;", "channel", "active", "<init>", "(Lie/g;Lrf/n;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class d<E> extends o<E> implements f<E> {
    public d(@g ie.g gVar, @g n<E> nVar, boolean z10) {
        super(gVar, nVar, false, z10);
        M0((n2) gVar.g(n2.D));
    }

    public boolean K0(@g Throwable th2) {
        r0.b(e(), th2);
        return true;
    }

    public void i1(@h Throwable th2) {
        n J1 = J1();
        CancellationException cancellationException = null;
        if (th2 != null) {
            if (th2 instanceof CancellationException) {
                cancellationException = (CancellationException) th2;
            }
            if (cancellationException == null) {
                cancellationException = y1.a(z0.a(this) + " was cancelled", th2);
            }
        }
        J1.h(cancellationException);
    }
}
