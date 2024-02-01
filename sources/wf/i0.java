package wf;

import fh.h;
import ie.g;
import kotlin.Metadata;
import pf.r0;
import we.l;
import xe.n0;
import zd.p;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f**\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0011"}, d2 = {"E", "Lkotlin/Function1;", "Lzd/u2;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lwf/d1;", "undeliveredElementException", "c", "(Lwe/l;Ljava/lang/Object;Lwf/d1;)Lwf/d1;", "Lie/g;", "context", "b", "(Lwe/l;Ljava/lang/Object;Lie/g;)V", "", "a", "(Lwe/l;Ljava/lang/Object;Lie/g;)Lwe/l;", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class i0 {

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "", "<anonymous parameter 0>", "Lzd/u2;", "c", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends n0 implements l<Throwable, u2> {
        public final /* synthetic */ l<E, u2> P;
        public final /* synthetic */ E Q;
        public final /* synthetic */ g R;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(l<? super E, u2> lVar, E e10, g gVar) {
            super(1);
            this.P = lVar;
            this.Q = e10;
            this.R = gVar;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Throwable) obj);
            return u2.f25116a;
        }

        public final void c(@fh.g Throwable th2) {
            i0.b(this.P, this.Q, this.R);
        }
    }

    @fh.g
    public static final <E> l<Throwable, u2> a(@fh.g l<? super E, u2> lVar, E e10, @fh.g g gVar) {
        return new a(lVar, e10, gVar);
    }

    public static final <E> void b(@fh.g l<? super E, u2> lVar, E e10, @fh.g g gVar) {
        d1 c10 = c(lVar, e10, (d1) null);
        if (c10 != null) {
            r0.b(gVar, c10);
        }
    }

    @h
    public static final <E> d1 c(@fh.g l<? super E, u2> lVar, E e10, @h d1 d1Var) {
        try {
            lVar.A(e10);
        } catch (Throwable th2) {
            if (d1Var == null || d1Var.getCause() == th2) {
                return new d1("Exception in undelivered element handler for " + e10, th2);
            }
            p.a(d1Var, th2);
        }
        return d1Var;
    }

    public static /* synthetic */ d1 d(l lVar, Object obj, d1 d1Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            d1Var = null;
        }
        return c(lVar, obj, d1Var);
    }
}
