package pf;

import fh.g;
import fh.h;
import ie.g;
import kotlin.Metadata;
import xe.l0;
import xe.w;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lpf/t0;", "Lie/a;", "", "toString", "N1", "name", "O1", "", "hashCode", "", "other", "", "equals", "P", "Ljava/lang/String;", "Q1", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Q", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class t0 extends ie.a {
    @g
    public static final a Q = new a((w) null);
    @g
    public final String P;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpf/t0$a;", "Lie/g$c;", "Lpf/t0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a implements g.c<t0> {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public t0(@fh.g String str) {
        super(Q);
        this.P = str;
    }

    public static /* synthetic */ t0 P1(t0 t0Var, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = t0Var.P;
        }
        return t0Var.O1(str);
    }

    @fh.g
    public final String N1() {
        return this.P;
    }

    @fh.g
    public final t0 O1(@fh.g String str) {
        return new t0(str);
    }

    @fh.g
    public final String Q1() {
        return this.P;
    }

    public boolean equals(@h Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && l0.g(this.P, ((t0) obj).P);
    }

    public int hashCode() {
        return this.P.hashCode();
    }

    @fh.g
    public String toString() {
        return "CoroutineName(" + this.P + ')';
    }
}
