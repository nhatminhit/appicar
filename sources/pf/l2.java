package pf;

import fh.g;
import fh.h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import we.l;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B0\u0012'\u0010\r\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0007j\u0002`\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R5\u0010\r\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0007j\u0002`\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lpf/l2;", "Lpf/p2;", "", "cause", "Lzd/u2;", "X0", "(Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lzd/v0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "S", "Lwe/l;", "handler", "<init>", "(Lwe/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class l2 extends p2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater T = AtomicIntegerFieldUpdater.newUpdater(l2.class, "_invoked");
    @g
    public final l<Throwable, u2> S;
    @g
    private volatile /* synthetic */ int _invoked = 0;

    public l2(@g l<? super Throwable, u2> lVar) {
        this.S = lVar;
    }

    public /* bridge */ /* synthetic */ Object A(Object obj) {
        X0((Throwable) obj);
        return u2.f25116a;
    }

    public void X0(@h Throwable th2) {
        if (T.compareAndSet(this, 0, 1)) {
            this.S.A(th2);
        }
    }
}
