package pf;

import fh.g;
import ie.d;
import kotlin.Metadata;
import we.a;
import wf.l;
import wf.w0;
import xe.i0;
import zd.a1;
import zd.d1;
import zd.e1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0011\u001a \u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a.\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001a'\u0010\u0010\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\b\u001a\u0019\u0010\u0013\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\b\"\u0014\u0010\u0015\u001a\u00020\u00028\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014\"\u001a\u0010\u0019\u001a\u00020\u00028\u0000XT¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00028\u0000XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014\"\u0014\u0010\u001d\u001a\u00020\u00028\u0000XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014\"\u0014\u0010\u001e\u001a\u00020\u00028\u0000XT¢\u0006\u0006\n\u0004\b\n\u0010\u0014\"\u0018\u0010 \u001a\u00020\b*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001f\"\u0018\u0010!\u001a\u00020\b*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006\""}, d2 = {"T", "Lpf/j1;", "", "mode", "Lzd/u2;", "a", "Lie/d;", "delegate", "", "undispatched", "e", "f", "Lpf/t1;", "eventLoop", "Lkotlin/Function0;", "block", "h", "", "exception", "g", "I", "MODE_ATOMIC", "b", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE", "c", "MODE_CANCELLABLE_REUSABLE", "d", "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "(I)Z", "isCancellableMode", "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f22006a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f22007b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f22008c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f22009d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final int f22010e = -1;

    public static final <T> void a(@g j1<? super T> j1Var, int i10) {
        d<? super T> d10 = j1Var.d();
        boolean z10 = i10 == 4;
        if (z10 || !(d10 instanceof l) || c(i10) != c(j1Var.Q)) {
            e(j1Var, d10, z10);
            return;
        }
        o0 o0Var = ((l) d10).R;
        ie.g e10 = d10.e();
        if (o0Var.P1(e10)) {
            o0Var.N1(e10, j1Var);
        } else {
            f(j1Var);
        }
    }

    @a1
    public static /* synthetic */ void b() {
    }

    public static final boolean c(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean d(int i10) {
        return i10 == 2;
    }

    public static final <T> void e(@g j1<? super T> j1Var, @g d<? super T> dVar, boolean z10) {
        Object obj;
        Object j10 = j1Var.j();
        Throwable g10 = j1Var.g(j10);
        if (g10 != null) {
            d1.a aVar = d1.P;
            obj = e1.a(g10);
        } else {
            d1.a aVar2 = d1.P;
            obj = j1Var.h(j10);
        }
        Object b10 = d1.b(obj);
        if (z10) {
            l lVar = (l) dVar;
            d<T> dVar2 = lVar.S;
            Object obj2 = lVar.U;
            ie.g e10 = dVar2.e();
            Object c10 = w0.c(e10, obj2);
            c4<?> g11 = c10 != w0.f24123a ? n0.g(dVar2, e10, c10) : null;
            try {
                lVar.S.x(b10);
                u2 u2Var = u2.f25116a;
            } finally {
                if (g11 == null || g11.K1()) {
                    w0.a(e10, c10);
                }
            }
        } else {
            dVar.x(b10);
        }
    }

    public static final void f(j1<?> j1Var) {
        t1 b10 = u3.f22027a.b();
        if (b10.a2()) {
            b10.V1(j1Var);
            return;
        }
        b10.X1(true);
        try {
            e(j1Var, j1Var.d(), true);
            do {
            } while (b10.d2());
        } catch (Throwable th2) {
            b10.S1(true);
            throw th2;
        }
        b10.S1(true);
    }

    public static final void g(@g d<?> dVar, @g Throwable th2) {
        d1.a aVar = d1.P;
        dVar.x(d1.b(e1.a(th2)));
    }

    public static final void h(@g j1<?> j1Var, @g t1 t1Var, @g a<u2> aVar) {
        t1Var.X1(true);
        try {
            aVar.n();
            do {
            } while (t1Var.d2());
        } catch (Throwable th2) {
            i0.d(1);
            t1Var.S1(true);
            i0.c(1);
            throw th2;
        }
        i0.d(1);
        t1Var.S1(true);
        i0.c(1);
    }
}
