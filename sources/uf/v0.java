package uf;

import fh.g;
import g7.h;
import kotlin.Metadata;
import rf.m;
import vf.u;
import we.l;
import wf.r0;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\b¢\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\b¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\b\u001a6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000\"\u001a\u0010\u0019\u001a\u00020\u00158\u0002X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u00020\u00158\u0002X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u0012\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {"T", "value", "Luf/e0;", "a", "(Ljava/lang/Object;)Luf/e0;", "Lkotlin/Function1;", "function", "i", "(Luf/e0;Lwe/l;)Ljava/lang/Object;", "e", "Lzd/u2;", "h", "Luf/t0;", "Lie/g;", "context", "", "capacity", "Lrf/m;", "onBufferOverflow", "Luf/i;", "d", "Lwf/r0;", "Lwf/r0;", "getNONE$annotations", "()V", "NONE", "b", "getPENDING$annotations", "PENDING", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class v0 {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f23366a = new r0(h.A);
    @g

    /* renamed from: b  reason: collision with root package name */
    public static final r0 f23367b = new r0("PENDING");

    @g
    public static final <T> e0<T> a(T t10) {
        if (t10 == null) {
            t10 = u.f23630a;
        }
        return new u0(t10);
    }

    @g
    public static final <T> i<T> d(@g t0<? extends T> t0Var, @g ie.g gVar, int i10, @g m mVar) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 2) {
            z10 = true;
        }
        return ((z10 || i10 == -2) && mVar == m.DROP_OLDEST) ? t0Var : k0.e(t0Var, gVar, i10, mVar);
    }

    public static final <T> T e(@g e0<T> e0Var, @g l<? super T, ? extends T> lVar) {
        T value;
        do {
            value = e0Var.getValue();
        } while (!e0Var.h(value, lVar.A(value)));
        return value;
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void g() {
    }

    public static final <T> void h(@g e0<T> e0Var, @g l<? super T, ? extends T> lVar) {
        T value;
        do {
            value = e0Var.getValue();
        } while (!e0Var.h(value, lVar.A(value)));
    }

    public static final <T> T i(@g e0<T> e0Var, @g l<? super T, ? extends T> lVar) {
        T value;
        T A;
        do {
            value = e0Var.getValue();
            A = lVar.A(value);
        } while (!e0Var.h(value, A));
        return A;
    }
}
