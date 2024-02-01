package tf;

import fh.g;
import fh.h;
import ie.e;
import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import kotlin.Metadata;
import pf.s0;
import pf.t0;
import zd.a1;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006,"}, d2 = {"Ltf/k;", "Ljava/io/Serializable;", "", "O", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "coroutineId", "", "P", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "dispatcher", "Q", "f", "name", "R", "h", "state", "S", "e", "lastObservedThreadState", "T", "d", "lastObservedThreadName", "", "Ljava/lang/StackTraceElement;", "U", "Ljava/util/List;", "c", "()Ljava/util/List;", "lastObservedStackTrace", "V", "J", "g", "()J", "sequenceNumber", "Ltf/f;", "source", "Lie/g;", "context", "<init>", "(Ltf/f;Lie/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@a1
public final class k implements Serializable {
    @h
    public final Long O;
    @h
    public final String P;
    @h
    public final String Q;
    @g
    public final String R;
    @h
    public final String S;
    @h
    public final String T;
    @g
    public final List<StackTraceElement> U;
    public final long V;

    public k(@g f fVar, @g ie.g gVar) {
        Thread.State state;
        s0 s0Var = (s0) gVar.g(s0.Q);
        String str = null;
        this.O = s0Var != null ? Long.valueOf(s0Var.Q1()) : null;
        e eVar = (e) gVar.g(e.B);
        this.P = eVar != null ? eVar.toString() : null;
        t0 t0Var = (t0) gVar.g(t0.Q);
        this.Q = t0Var != null ? t0Var.Q1() : null;
        this.R = fVar.g();
        Thread thread = fVar.f23202e;
        this.S = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = fVar.f23202e;
        this.T = thread2 != null ? thread2.getName() : str;
        this.U = fVar.h();
        this.V = fVar.f23199b;
    }

    @h
    public final Long a() {
        return this.O;
    }

    @h
    public final String b() {
        return this.P;
    }

    @g
    public final List<StackTraceElement> c() {
        return this.U;
    }

    @h
    public final String d() {
        return this.T;
    }

    @h
    public final String e() {
        return this.S;
    }

    @h
    public final String f() {
        return this.Q;
    }

    public final long g() {
        return this.V;
    }

    @g
    public final String h() {
        return this.R;
    }
}
