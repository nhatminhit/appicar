package tf;

import fh.g;
import kotlin.Metadata;
import wf.r0;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000e\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002\u001a\b\u0010\u0004\u001a\u00020\u0003H\u0002\"\u0014\u0010\b\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0007\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0012"}, d2 = {"", "Ltf/m;", "d", "", "e", "", "a", "I", "MAGIC", "b", "MIN_CAPACITY", "Lwf/r0;", "c", "Lwf/r0;", "REHASH", "Ltf/m;", "MARKED_NULL", "MARKED_TRUE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f23185a = -1640531527;

    /* renamed from: b  reason: collision with root package name */
    public static final int f23186b = 16;
    @g

    /* renamed from: c  reason: collision with root package name */
    public static final r0 f23187c = new r0("REHASH");
    @g

    /* renamed from: d  reason: collision with root package name */
    public static final m f23188d = new m((Object) null);
    @g

    /* renamed from: e  reason: collision with root package name */
    public static final m f23189e = new m(Boolean.TRUE);

    public static final m d(Object obj) {
        return obj == null ? f23188d : l0.g(obj, Boolean.TRUE) ? f23189e : new m(obj);
    }

    public static final Void e() {
        throw new UnsupportedOperationException("not implemented");
    }
}
