package pf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import zd.d1;
import zd.e1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lpf/h3;", "T", "Lpf/u2;", "", "cause", "Lzd/u2;", "X0", "Lpf/r;", "S", "Lpf/r;", "continuation", "<init>", "(Lpf/r;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class h3<T> extends u2 {
    @g
    public final r<T> S;

    public h3(@g r<? super T> rVar) {
        this.S = rVar;
    }

    public /* bridge */ /* synthetic */ Object A(Object obj) {
        X0((Throwable) obj);
        return u2.f25116a;
    }

    public void X0(@h Throwable th2) {
        Object obj;
        r<T> rVar;
        Object J0 = Y0().J0();
        if (J0 instanceof e0) {
            rVar = this.S;
            d1.a aVar = d1.P;
            obj = e1.a(((e0) J0).f21998a);
        } else {
            rVar = this.S;
            d1.a aVar2 = d1.P;
            obj = w2.o(J0);
        }
        rVar.x(d1.b(obj));
    }
}
