package wf;

import fh.g;
import fh.h;
import ie.g;
import ie.i;
import kotlin.Metadata;
import pf.s3;
import we.p;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0016\u001a\u00028\u0000\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\r\u001a\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016J*\u0010\u0010\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u000f*\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00028\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lwf/x0;", "T", "Lpf/s3;", "Lie/g;", "context", "z0", "(Lie/g;)Ljava/lang/Object;", "oldState", "Lzd/u2;", "Z0", "(Lie/g;Ljava/lang/Object;)V", "Lie/g$c;", "key", "i", "Lie/g$b;", "E", "g", "(Lie/g$c;)Lie/g$b;", "", "toString", "O", "Ljava/lang/Object;", "value", "Ljava/lang/ThreadLocal;", "P", "Ljava/lang/ThreadLocal;", "threadLocal", "Q", "Lie/g$c;", "getKey", "()Lie/g$c;", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class x0<T> implements s3<T> {
    public final T O;
    @g
    public final ThreadLocal<T> P;
    @g
    public final g.c<?> Q;

    public x0(T t10, @fh.g ThreadLocal<T> threadLocal) {
        this.O = t10;
        this.P = threadLocal;
        this.Q = new y0(threadLocal);
    }

    public void Z0(@fh.g ie.g gVar, T t10) {
        this.P.set(t10);
    }

    @h
    public <E extends g.b> E g(@fh.g g.c<E> cVar) {
        if (l0.g(getKey(), cVar)) {
            return this;
        }
        return null;
    }

    @fh.g
    public g.c<?> getKey() {
        return this.Q;
    }

    @fh.g
    public ie.g i(@fh.g g.c<?> cVar) {
        return l0.g(getKey(), cVar) ? i.O : this;
    }

    @fh.g
    public ie.g m1(@fh.g ie.g gVar) {
        return s3.a.d(this, gVar);
    }

    public <R> R o(R r10, @fh.g p<? super R, ? super g.b, ? extends R> pVar) {
        return s3.a.a(this, r10, pVar);
    }

    @fh.g
    public String toString() {
        return "ThreadLocal(value=" + this.O + ", threadLocal = " + this.P + ')';
    }

    public T z0(@fh.g ie.g gVar) {
        T t10 = this.P.get();
        this.P.set(this.O);
        return t10;
    }
}
