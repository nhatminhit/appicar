package pf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import ve.e;
import we.l;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B4\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003J$\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J:\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0014R/\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0018"}, d2 = {"Lpf/f0;", "", "a", "Lkotlin/Function1;", "", "Lzd/v0;", "name", "cause", "Lzd/u2;", "b", "result", "onCancellation", "c", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "Lwe/l;", "<init>", "(Ljava/lang/Object;Lwe/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class f0 {
    @e
    @h

    /* renamed from: a  reason: collision with root package name */
    public final Object f21999a;
    @g
    @e

    /* renamed from: b  reason: collision with root package name */
    public final l<Throwable, u2> f22000b;

    public f0(@h Object obj, @g l<? super Throwable, u2> lVar) {
        this.f21999a = obj;
        this.f22000b = lVar;
    }

    public static /* synthetic */ f0 d(f0 f0Var, Object obj, l<Throwable, u2> lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = f0Var.f21999a;
        }
        if ((i10 & 2) != 0) {
            lVar = f0Var.f22000b;
        }
        return f0Var.c(obj, lVar);
    }

    @h
    public final Object a() {
        return this.f21999a;
    }

    @g
    public final l<Throwable, u2> b() {
        return this.f22000b;
    }

    @g
    public final f0 c(@h Object obj, @g l<? super Throwable, u2> lVar) {
        return new f0(obj, lVar);
    }

    public boolean equals(@h Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return l0.g(this.f21999a, f0Var.f21999a) && l0.g(this.f22000b, f0Var.f22000b);
    }

    public int hashCode() {
        Object obj = this.f21999a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f22000b.hashCode();
    }

    @g
    public String toString() {
        return "CompletedWithCancellation(result=" + this.f21999a + ", onCancellation=" + this.f22000b + ')';
    }
}
