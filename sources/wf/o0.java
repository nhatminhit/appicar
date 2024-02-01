package wf;

import fh.g;
import fh.h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import s0.a;
import wf.o0;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005¨\u0006\u001a"}, d2 = {"Lwf/o0;", "S", "Lwf/h;", "", "r", "()Z", "n", "Lzd/u2;", "q", "()V", "", "c", "J", "o", "()J", "id", "", "p", "()I", "maxSlots", "g", "removed", "prev", "pointers", "<init>", "(JLwf/o0;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class o0<S extends o0<S>> extends h<S> {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24112d = AtomicIntegerFieldUpdater.newUpdater(o0.class, "cleanedAndPointers");

    /* renamed from: c  reason: collision with root package name */
    public final long f24113c;
    @g
    private volatile /* synthetic */ int cleanedAndPointers;

    public o0(long j10, @h S s10, int i10) {
        super(s10);
        this.f24113c = j10;
        this.cleanedAndPointers = i10 << 16;
    }

    public boolean g() {
        return this.cleanedAndPointers == p() && !i();
    }

    public final boolean n() {
        return f24112d.addAndGet(this, a.f12612c) == p() && !i();
    }

    public final long o() {
        return this.f24113c;
    }

    public abstract int p();

    public final void q() {
        if (f24112d.incrementAndGet(this) == p() && !i()) {
            l();
        }
    }

    public final boolean r() {
        int i10;
        do {
            i10 = this.cleanedAndPointers;
            if (!(i10 != p() || i())) {
                return false;
            }
        } while (!f24112d.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
