package xf;

import fh.g;
import fh.h;
import ie.d;
import ke.c;
import kotlin.Metadata;
import pf.i2;
import we.l;
import we.p;
import wf.m;
import zd.d1;
import zd.e1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a{\u0010\u0010\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0013\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00022\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001a#\u0010\u0016\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\b\u001a\u001c\u0010\u0017\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"T", "Lkotlin/Function1;", "Lie/d;", "", "completion", "Lzd/u2;", "d", "(Lwe/l;Lie/d;)V", "R", "Lkotlin/Function2;", "receiver", "", "Lzd/v0;", "name", "cause", "onCancellation", "e", "(Lwe/p;Ljava/lang/Object;Lie/d;Lwe/l;)V", "fatalCompletion", "c", "Lkotlin/Function0;", "block", "b", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class a {
    public static final void a(d<?> dVar, Throwable th2) {
        d1.a aVar = d1.P;
        dVar.x(d1.b(e1.a(th2)));
        throw th2;
    }

    public static final void b(d<?> dVar, we.a<u2> aVar) {
        try {
            aVar.n();
        } catch (Throwable th2) {
            a(dVar, th2);
        }
    }

    public static final void c(@g d<? super u2> dVar, @g d<?> dVar2) {
        try {
            d<? super u2> d10 = c.d(dVar);
            d1.a aVar = d1.P;
            m.g(d10, d1.b(u2.f25116a), (l) null, 2, (Object) null);
        } catch (Throwable th2) {
            a(dVar2, th2);
        }
    }

    @i2
    public static final <T> void d(@g l<? super d<? super T>, ? extends Object> lVar, @g d<? super T> dVar) {
        try {
            d<u2> d10 = c.d(c.b(lVar, dVar));
            d1.a aVar = d1.P;
            m.g(d10, d1.b(u2.f25116a), (l) null, 2, (Object) null);
        } catch (Throwable th2) {
            a(dVar, th2);
        }
    }

    public static final <R, T> void e(@g p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, @g d<? super T> dVar, @h l<? super Throwable, u2> lVar) {
        try {
            d<u2> d10 = c.d(c.c(pVar, r10, dVar));
            d1.a aVar = d1.P;
            m.f(d10, d1.b(u2.f25116a), lVar);
        } catch (Throwable th2) {
            a(dVar, th2);
        }
    }

    public static /* synthetic */ void f(p pVar, Object obj, d dVar, l lVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        e(pVar, obj, dVar, lVar);
    }
}
