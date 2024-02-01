package pf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import we.l;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B0\u0012'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\bj\u0002`\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R5\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\bj\u0002`\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lpf/k2;", "Lpf/o;", "", "cause", "Lzd/u2;", "c", "", "toString", "Lkotlin/Function1;", "Lzd/v0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "O", "Lwe/l;", "handler", "<init>", "(Lwe/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class k2 extends o {
    @g
    public final l<Throwable, u2> O;

    public k2(@g l<? super Throwable, u2> lVar) {
        this.O = lVar;
    }

    public /* bridge */ /* synthetic */ Object A(Object obj) {
        c((Throwable) obj);
        return u2.f25116a;
    }

    public void c(@h Throwable th2) {
        this.O.A(th2);
    }

    @g
    public String toString() {
        return "InvokeOnCancel[" + z0.a(this.O) + '@' + z0.b(this) + ']';
    }
}
