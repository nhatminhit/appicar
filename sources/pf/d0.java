package pf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import ve.e;
import we.l;
import xe.l0;
import xe.w;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\\\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010&J\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J&\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J`\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR1\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0011\u0010$\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lpf/d0;", "", "Lpf/r;", "cont", "", "cause", "Lzd/u2;", "i", "a", "Lpf/o;", "b", "Lkotlin/Function1;", "Lzd/v0;", "name", "c", "d", "e", "result", "cancelHandler", "onCancellation", "idempotentResume", "cancelCause", "f", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "Lpf/o;", "Lwe/l;", "Ljava/lang/Throwable;", "h", "()Z", "cancelled", "<init>", "(Ljava/lang/Object;Lpf/o;Lwe/l;Ljava/lang/Object;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class d0 {
    @e
    @h

    /* renamed from: a  reason: collision with root package name */
    public final Object f21990a;
    @e
    @h

    /* renamed from: b  reason: collision with root package name */
    public final o f21991b;
    @e
    @h

    /* renamed from: c  reason: collision with root package name */
    public final l<Throwable, u2> f21992c;
    @e
    @h

    /* renamed from: d  reason: collision with root package name */
    public final Object f21993d;
    @e
    @h

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f21994e;

    public d0(@h Object obj, @h o oVar, @h l<? super Throwable, u2> lVar, @h Object obj2, @h Throwable th2) {
        this.f21990a = obj;
        this.f21991b = oVar;
        this.f21992c = lVar;
        this.f21993d = obj2;
        this.f21994e = th2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj, o oVar, l lVar, Object obj2, Throwable th2, int i10, w wVar) {
        this(obj, (i10 & 2) != 0 ? null : oVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }

    public static /* synthetic */ d0 g(d0 d0Var, Object obj, o oVar, l<Throwable, u2> lVar, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = d0Var.f21990a;
        }
        if ((i10 & 2) != 0) {
            oVar = d0Var.f21991b;
        }
        o oVar2 = oVar;
        if ((i10 & 4) != 0) {
            lVar = d0Var.f21992c;
        }
        l<Throwable, u2> lVar2 = lVar;
        if ((i10 & 8) != 0) {
            obj2 = d0Var.f21993d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th2 = d0Var.f21994e;
        }
        return d0Var.f(obj, oVar2, lVar2, obj4, th2);
    }

    @h
    public final Object a() {
        return this.f21990a;
    }

    @h
    public final o b() {
        return this.f21991b;
    }

    @h
    public final l<Throwable, u2> c() {
        return this.f21992c;
    }

    @h
    public final Object d() {
        return this.f21993d;
    }

    @h
    public final Throwable e() {
        return this.f21994e;
    }

    public boolean equals(@h Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return l0.g(this.f21990a, d0Var.f21990a) && l0.g(this.f21991b, d0Var.f21991b) && l0.g(this.f21992c, d0Var.f21992c) && l0.g(this.f21993d, d0Var.f21993d) && l0.g(this.f21994e, d0Var.f21994e);
    }

    @g
    public final d0 f(@h Object obj, @h o oVar, @h l<? super Throwable, u2> lVar, @h Object obj2, @h Throwable th2) {
        return new d0(obj, oVar, lVar, obj2, th2);
    }

    public final boolean h() {
        return this.f21994e != null;
    }

    public int hashCode() {
        Object obj = this.f21990a;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        o oVar = this.f21991b;
        int hashCode2 = (hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        l<Throwable, u2> lVar = this.f21992c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f21993d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f21994e;
        if (th2 != null) {
            i10 = th2.hashCode();
        }
        return hashCode4 + i10;
    }

    public final void i(@g r<?> rVar, @g Throwable th2) {
        o oVar = this.f21991b;
        if (oVar != null) {
            rVar.l(oVar, th2);
        }
        l<Throwable, u2> lVar = this.f21992c;
        if (lVar != null) {
            rVar.q(lVar, th2);
        }
    }

    @g
    public String toString() {
        return "CompletedContinuation(result=" + this.f21990a + ", cancelHandler=" + this.f21991b + ", onCancellation=" + this.f21992c + ", idempotentResume=" + this.f21993d + ", cancelCause=" + this.f21994e + ')';
    }
}
