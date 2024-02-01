package ag;

import fh.g;
import fh.h;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import tf.b;
import wf.o0;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\b¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\b¢\u0006\u0004\b\t\u0010\nJ,\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\b¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lag/i;", "Lwf/o0;", "", "index", "", "u", "(I)Ljava/lang/Object;", "value", "Lzd/u2;", "w", "(ILjava/lang/Object;)V", "expected", "", "t", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "v", "(ILjava/lang/Object;)Ljava/lang/Object;", "s", "(I)V", "", "toString", "()Ljava/lang/String;", "p", "()I", "maxSlots", "", "id", "prev", "pointers", "<init>", "(JLag/i;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class i extends o0<i> {
    @g

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f16109e = new AtomicReferenceArray(h.f16108f);

    public i(long j10, @h i iVar, int i10) {
        super(j10, iVar, i10);
    }

    public int p() {
        return h.f16108f;
    }

    public final void s(int i10) {
        this.f16109e.set(i10, h.f16107e);
        q();
    }

    public final boolean t(int i10, @h Object obj, @h Object obj2) {
        return b.a(this.f16109e, i10, obj, obj2);
    }

    @g
    public String toString() {
        return "SemaphoreSegment[id=" + o() + ", hashCode=" + hashCode() + ']';
    }

    @h
    public final Object u(int i10) {
        return this.f16109e.get(i10);
    }

    @h
    public final Object v(int i10, @h Object obj) {
        return this.f16109e.getAndSet(i10, obj);
    }

    public final void w(int i10, @h Object obj) {
        this.f16109e.set(i10, obj);
    }
}
