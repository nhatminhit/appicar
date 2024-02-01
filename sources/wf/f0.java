package wf;

import fh.g;
import java.util.List;
import kotlin.Metadata;
import pf.i2;
import pf.z2;
import zd.y;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\t\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0003H\u0007\u001a \u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u001a\b\u0010\u000e\u001a\u00020\rH\u0000\"\u0014\u0010\u0010\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u000f\"\u001a\u0010\u0015\u001a\u00020\u00058\u0002XD¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lwf/d0;", "", "factories", "Lpf/z2;", "f", "", "d", "", "cause", "", "errorHint", "Lwf/g0;", "a", "", "e", "Ljava/lang/String;", "FAST_SERVICE_LOADER_PROPERTY_NAME", "b", "Z", "getSUPPORT_MISSING$annotations", "()V", "SUPPORT_MISSING", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class f0 {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final String f24098a = "kotlinx.coroutines.fast.service.loader";

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f24099b = true;

    public static final g0 a(Throwable th2, String str) {
        if (f24099b) {
            return new g0(th2, str);
        }
        if (th2 != null) {
            throw th2;
        }
        e();
        throw new y();
    }

    public static /* synthetic */ g0 b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    public static /* synthetic */ void c() {
    }

    @i2
    public static final boolean d(@g z2 z2Var) {
        return z2Var.S1() instanceof g0;
    }

    @g
    public static final Void e() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @g
    @i2
    public static final z2 f(@g d0 d0Var, @g List<? extends d0> list) {
        try {
            return d0Var.b(list);
        } catch (Throwable th2) {
            return a(th2, d0Var.a());
        }
    }
}
