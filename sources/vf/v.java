package vf;

import fh.g;
import fh.h;
import ie.g;
import ie.i;
import kotlin.Metadata;
import le.d;
import le.e;
import lf.u;
import pf.r2;
import uf.j;
import we.p;
import xe.l0;
import xe.n0;
import zd.d1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010!\u001a\u00020\u0015¢\u0006\u0004\b0\u00101J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\n\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\fH\u0016J\u001b\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u0004\u0018\u00010\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0002R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010!\u001a\u00020\u00158\u0000X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010 R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lvf/v;", "T", "Luf/j;", "Lle/d;", "Lle/e;", "Ljava/lang/StackTraceElement;", "R", "Lzd/d1;", "", "result", "K", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lzd/u2;", "L", "value", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "Lie/d;", "uCont", "Q", "(Lie/d;Ljava/lang/Object;)Ljava/lang/Object;", "Lie/g;", "currentContext", "previousContext", "P", "(Lie/g;Lie/g;Ljava/lang/Object;)V", "Lvf/n;", "exception", "c0", "Luf/j;", "collector", "S", "Lie/g;", "collectContext", "", "I", "collectContextSize", "U", "lastEmissionContext", "V", "Lie/d;", "completion", "u", "()Lle/e;", "callerFrame", "e", "()Lie/g;", "context", "<init>", "(Luf/j;Lie/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class v<T> extends d implements j<T>, e {
    @g
    @ve.e
    public final j<T> R;
    @g
    @ve.e
    public final ie.g S;
    @ve.e
    public final int T;
    @h
    public ie.g U;
    @h
    public ie.d<? super u2> V;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "count", "Lie/g$b;", "<anonymous parameter 1>", "c", "(ILie/g$b;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    public static final class a extends n0 implements p<Integer, g.b, Integer> {
        public static final a P = new a();

        public a() {
            super(2);
        }

        @fh.g
        public final Integer c(int i10, @fh.g g.b bVar) {
            return Integer.valueOf(i10 + 1);
        }

        public /* bridge */ /* synthetic */ Object g0(Object obj, Object obj2) {
            return c(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public v(@fh.g j<? super T> jVar, @fh.g ie.g gVar) {
        super(s.O, i.O);
        this.R = jVar;
        this.S = gVar;
        this.T = ((Number) gVar.o(0, a.P)).intValue();
    }

    @fh.g
    public Object K(@fh.g Object obj) {
        Throwable e10 = d1.e(obj);
        if (e10 != null) {
            this.U = new n(e10, e());
        }
        ie.d<? super u2> dVar = this.V;
        if (dVar != null) {
            dVar.x(obj);
        }
        return ke.d.h();
    }

    public void L() {
        super.L();
    }

    public final void P(ie.g gVar, ie.g gVar2, T t10) {
        if (gVar2 instanceof n) {
            c0((n) gVar2, t10);
        }
        x.a(this, gVar);
    }

    public final Object Q(ie.d<? super u2> dVar, T t10) {
        ie.g e10 = dVar.e();
        r2.z(e10);
        ie.g gVar = this.U;
        if (gVar != e10) {
            P(e10, gVar, t10);
            this.U = e10;
        }
        this.V = dVar;
        Object y10 = w.f23633a.y(this.R, t10, this);
        if (!l0.g(y10, ke.d.h())) {
            this.V = null;
        }
        return y10;
    }

    @h
    public StackTraceElement R() {
        return null;
    }

    public final void c0(n nVar, Object obj) {
        throw new IllegalStateException(u.p("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + nVar.O + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @h
    public Object d(T t10, @fh.g ie.d<? super u2> dVar) {
        try {
            Object Q = Q(dVar, t10);
            if (Q == ke.d.h()) {
                le.h.c(dVar);
            }
            return Q == ke.d.h() ? Q : u2.f25116a;
        } catch (Throwable th2) {
            this.U = new n(th2, dVar.e());
            throw th2;
        }
    }

    @fh.g
    public ie.g e() {
        ie.g gVar = this.U;
        return gVar == null ? i.O : gVar;
    }

    @h
    public e u() {
        ie.d<? super u2> dVar = this.V;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }
}
