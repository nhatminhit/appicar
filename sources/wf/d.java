package wf;

import fh.g;
import fh.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import pf.i2;
import zd.f1;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u0006R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lwf/d;", "T", "Lwf/j0;", "", "decision", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "affected", "i", "failure", "Lzd/u2;", "d", "(Ljava/lang/Object;Ljava/lang/Object;)V", "c", "f", "()Ljava/lang/Object;", "consensus", "", "h", "()Z", "isDecided", "", "g", "()J", "opSequence", "a", "()Lwf/d;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@i2
public abstract class d<T> extends j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24088a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_consensus");
    @g
    private volatile /* synthetic */ Object _consensus = c.f24082a;

    @g
    public d<?> a() {
        return this;
    }

    @h
    public final Object c(@h Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == c.f24082a) {
            obj2 = e(i(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(T t10, @h Object obj);

    @h
    public final Object e(@h Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = c.f24082a;
        return obj2 != obj3 ? obj2 : f1.a(f24088a, this, obj3, obj) ? obj : this._consensus;
    }

    @h
    public final Object f() {
        return this._consensus;
    }

    public long g() {
        return 0;
    }

    public final boolean h() {
        return this._consensus != c.f24082a;
    }

    @h
    public abstract Object i(T t10);
}
