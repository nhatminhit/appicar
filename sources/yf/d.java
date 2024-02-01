package yf;

import fh.g;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lyf/d;", "Lyf/i;", "Lzd/u2;", "Y1", "()V", "close", "", "toString", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class d extends i {
    @g
    public static final d W = new d();

    public d() {
        super(o.f24787c, o.f24788d, o.f24789e, o.f24785a);
    }

    public final void Y1() {
        super.close();
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @g
    public String toString() {
        return "Dispatchers.Default";
    }
}
