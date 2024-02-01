package pf;

import fh.g;
import fh.h;
import ie.d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ke.c;
import kotlin.Metadata;
import we.l;
import wf.m;
import wf.n0;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0015"}, d2 = {"Lpf/i1;", "T", "Lwf/n0;", "", "state", "Lzd/u2;", "f0", "(Ljava/lang/Object;)V", "E1", "K1", "()Ljava/lang/Object;", "", "N1", "()Z", "M1", "Lie/g;", "context", "Lie/d;", "uCont", "<init>", "(Lie/g;Lie/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class i1<T> extends n0<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater R = AtomicIntegerFieldUpdater.newUpdater(i1.class, "_decision");
    @g
    private volatile /* synthetic */ int _decision = 0;

    public i1(@g ie.g gVar, @g d<? super T> dVar) {
        super(gVar, dVar);
    }

    public void E1(@h Object obj) {
        if (!M1()) {
            m.g(c.d(this.Q), k0.a(obj, this.Q), (l) null, 2, (Object) null);
        }
    }

    @h
    public final Object K1() {
        if (N1()) {
            return ke.d.h();
        }
        Object o10 = w2.o(J0());
        if (!(o10 instanceof e0)) {
            return o10;
        }
        throw ((e0) o10).f21998a;
    }

    public final boolean M1() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!R.compareAndSet(this, 0, 2));
        return true;
    }

    public final boolean N1() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!R.compareAndSet(this, 0, 1));
        return true;
    }

    public void f0(@h Object obj) {
        E1(obj);
    }
}
