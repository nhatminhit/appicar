package zf;

import fh.h;
import ie.d;
import kotlin.Metadata;
import pf.c2;
import pf.f1;
import we.l;
import wf.r0;
import xe.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aN\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001aG\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\u000bHHø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e\" \u0010\u0015\u001a\u00020\u00068\u0000X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\" \u0010\u0019\u001a\u00020\u00068\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012\"\u001a\u0010\u001c\u001a\u00020\u00068\u0002X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u0012\u0004\b\u001b\u0010\u0014\"\u001a\u0010\u001e\u001a\u00020\u00068\u0002X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u0012\u0004\b\u001d\u0010\u0014\"\u001a\u0010#\u001a\u00020\u001f8\u0002X\u0004¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010\u0014\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"R", "Lzf/a;", "Lnf/e;", "timeout", "Lkotlin/Function1;", "Lie/d;", "", "block", "Lzd/u2;", "k", "(Lzf/a;JLwe/l;)V", "Lzd/u;", "builder", "l", "(Lwe/l;Lie/d;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "getNOT_SELECTED$annotations", "()V", "NOT_SELECTED", "b", "d", "getALREADY_SELECTED$annotations", "ALREADY_SELECTED", "c", "getUNDECIDED$annotations", "UNDECIDED", "getRESUMED$annotations", "RESUMED", "Lzf/i;", "e", "Lzf/i;", "getSelectOpSequenceNumber$annotations", "selectOpSequenceNumber", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class g {
    @fh.g

    /* renamed from: a  reason: collision with root package name */
    public static final Object f25123a = new r0("NOT_SELECTED");
    @fh.g

    /* renamed from: b  reason: collision with root package name */
    public static final Object f25124b = new r0("ALREADY_SELECTED");
    @fh.g

    /* renamed from: c  reason: collision with root package name */
    public static final Object f25125c = new r0("UNDECIDED");
    @fh.g

    /* renamed from: d  reason: collision with root package name */
    public static final Object f25126d = new r0("RESUMED");
    @fh.g

    /* renamed from: e  reason: collision with root package name */
    public static final i f25127e = new i();

    @fh.g
    public static final Object d() {
        return f25124b;
    }

    public static /* synthetic */ void e() {
    }

    @fh.g
    public static final Object f() {
        return f25123a;
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void j() {
    }

    @c2
    public static final <R> void k(@fh.g a<? super R> aVar, long j10, @fh.g l<? super d<? super R>, ? extends Object> lVar) {
        aVar.L(f1.e(j10), lVar);
    }

    @h
    public static final <R> Object l(@fh.g l<? super a<? super R>, u2> lVar, @fh.g d<? super R> dVar) {
        b bVar = new b(dVar);
        try {
            lVar.A(bVar);
        } catch (Throwable th2) {
            bVar.g1(th2);
        }
        Object f12 = bVar.f1();
        if (f12 == ke.d.h()) {
            le.h.c(dVar);
        }
        return f12;
    }

    public static final <R> Object m(l<? super a<? super R>, u2> lVar, d<? super R> dVar) {
        i0.e(0);
        b bVar = new b(dVar);
        try {
            lVar.A(bVar);
        } catch (Throwable th2) {
            bVar.g1(th2);
        }
        Object f12 = bVar.f1();
        if (f12 == ke.d.h()) {
            le.h.c(dVar);
        }
        i0.e(1);
        return f12;
    }
}
