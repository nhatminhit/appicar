package wf;

import fh.g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import we.a;
import wf.h;
import xe.l0;
import zd.f1;
import zd.y;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\"\u0010#J \u0010\u0006\u001a\u0004\u0018\u00018\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\b¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0014\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\u0018\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0010R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u0004\u0018\u00018\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u0014\u0010!\u001a\u00028\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0013¨\u0006$"}, d2 = {"Lwf/h;", "N", "", "Lkotlin/Function0;", "", "onClosedAction", "k", "(Lwe/a;)Lwf/h;", "value", "", "m", "(Lwf/h;)Z", "Lzd/u2;", "b", "()V", "j", "()Z", "l", "d", "()Lwf/h;", "next", "i", "isTail", "f", "prev", "g", "removed", "e", "()Ljava/lang/Object;", "nextOrClosed", "c", "leftmostAliveNode", "h", "rightmostAliveNode", "<init>", "(Lwf/h;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class h<N extends h<N>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24102a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24103b;
    @g
    private volatile /* synthetic */ Object _next = null;
    @g
    private volatile /* synthetic */ Object _prev;

    static {
        Class<Object> cls = Object.class;
        Class<h> cls2 = h.class;
        f24102a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f24103b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
    }

    public h(@fh.h N n10) {
        this._prev = n10;
    }

    public final void b() {
        f24103b.lazySet(this, (Object) null);
    }

    public final N c() {
        N f10 = f();
        while (f10 != null && f10.g()) {
            f10 = (h) f10._prev;
        }
        return f10;
    }

    @fh.h
    public final N d() {
        N a10 = e();
        if (a10 == g.f24101b) {
            return null;
        }
        return (h) a10;
    }

    public final Object e() {
        return this._next;
    }

    @fh.h
    public final N f() {
        return (h) this._prev;
    }

    public abstract boolean g();

    public final N h() {
        N d10 = d();
        while (true) {
            l0.m(d10);
            if (!d10.g()) {
                return d10;
            }
            d10 = d10.d();
        }
    }

    public final boolean i() {
        return d() == null;
    }

    public final boolean j() {
        return f1.a(f24102a, this, (Object) null, g.f24101b);
    }

    @fh.h
    public final N k(@g a aVar) {
        N a10 = e();
        if (a10 != g.f24101b) {
            return (h) a10;
        }
        aVar.n();
        throw new y();
    }

    public final void l() {
        while (true) {
            h c10 = c();
            h h10 = h();
            h10._prev = c10;
            if (c10 != null) {
                c10._next = h10;
            }
            if (!h10.g() && (c10 == null || !c10.g())) {
                return;
            }
        }
    }

    public final boolean m(@g N n10) {
        return f1.a(f24102a, this, (Object) null, n10);
    }
}
