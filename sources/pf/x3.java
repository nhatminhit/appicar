package pf;

import fh.g;
import fh.h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import we.l;
import zd.u2;
import zd.y;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\r\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lpf/x3;", "Lkotlin/Function1;", "", "Lzd/v0;", "name", "cause", "Lzd/u2;", "Lkotlinx/coroutines/CompletionHandler;", "f", "()V", "c", "e", "(Ljava/lang/Throwable;)V", "", "state", "", "d", "(I)Ljava/lang/Void;", "Lpf/n2;", "O", "Lpf/n2;", "job", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "P", "Ljava/lang/Thread;", "targetThread", "Lpf/p1;", "Q", "Lpf/p1;", "cancelHandle", "<init>", "(Lpf/n2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class x3 implements l<Throwable, u2> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater R = AtomicIntegerFieldUpdater.newUpdater(x3.class, "_state");
    @g
    public final n2 O;
    public final Thread P = Thread.currentThread();
    @h
    public p1 Q;
    @g
    private volatile /* synthetic */ int _state = 0;

    public x3(@g n2 n2Var) {
        this.O = n2Var;
    }

    public /* bridge */ /* synthetic */ Object A(Object obj) {
        e((Throwable) obj);
        return u2.f25116a;
    }

    public final void c() {
        while (true) {
            int i10 = this._state;
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        d(i10);
                        throw new y();
                    }
                }
            } else if (R.compareAndSet(this, i10, 1)) {
                p1 p1Var = this.Q;
                if (p1Var != null) {
                    p1Var.P();
                    return;
                }
                return;
            }
        }
    }

    public final Void d(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public void e(@h Throwable th2) {
        int i10;
        do {
            i10 = this._state;
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2 && i10 != 3) {
                    d(i10);
                    throw new y();
                }
                return;
            }
        } while (!R.compareAndSet(this, i10, 2));
        this.P.interrupt();
        this._state = 3;
    }

    public final void f() {
        int i10;
        this.Q = this.O.e0(true, true, this);
        do {
            i10 = this._state;
            if (i10 != 0) {
                if (i10 != 2 && i10 != 3) {
                    d(i10);
                    throw new y();
                }
                return;
            }
        } while (!R.compareAndSet(this, i10, 0));
    }
}
