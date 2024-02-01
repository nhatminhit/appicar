package vf;

import fh.g;
import kotlin.Metadata;
import rf.m;
import uf.j0;
import uf.t0;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lvf/a0;", "Luf/t0;", "", "Luf/j0;", "delta", "", "h0", "g0", "()Ljava/lang/Integer;", "value", "initialValue", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class a0 extends j0<Integer> implements t0<Integer> {
    public a0(int i10) {
        super(1, Integer.MAX_VALUE, m.DROP_OLDEST);
        w(Integer.valueOf(i10));
    }

    @g
    /* renamed from: g0 */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) S()).intValue());
        }
        return valueOf;
    }

    public final boolean h0(int i10) {
        boolean w10;
        synchronized (this) {
            w10 = w(Integer.valueOf(((Number) S()).intValue() + i10));
        }
        return w10;
    }
}
