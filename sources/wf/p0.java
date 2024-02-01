package wf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import ve.f;
import wf.o0;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0014\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u0001\u0010\u0001\u0004\u0018\u00010\u0003ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lwf/p0;", "Lwf/o0;", "S", "", "", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "", "g", "(Ljava/lang/Object;)I", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "value", "h", "(Ljava/lang/Object;)Z", "isClosed", "f", "(Ljava/lang/Object;)Lwf/o0;", "getSegment$annotations", "()V", "segment", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@f
public final class p0<S extends o0<S>> {
    @h

    /* renamed from: a  reason: collision with root package name */
    public final Object f24115a;

    public /* synthetic */ p0(Object obj) {
        this.f24115a = obj;
    }

    public static final /* synthetic */ p0 a(Object obj) {
        return new p0(obj);
    }

    @g
    public static <S extends o0<S>> Object b(@h Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof p0) && l0.g(obj, ((p0) obj2).j());
    }

    public static final boolean d(Object obj, Object obj2) {
        return l0.g(obj, obj2);
    }

    public static /* synthetic */ void e() {
    }

    @g
    public static final S f(Object obj) {
        if (obj == g.f24101b) {
            throw new IllegalStateException("Does not contain segment".toString());
        } else if (obj != null) {
            return (o0) obj;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        }
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj == g.f24101b;
    }

    public static String i(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f24115a, obj);
    }

    public int hashCode() {
        return g(this.f24115a);
    }

    public final /* synthetic */ Object j() {
        return this.f24115a;
    }

    public String toString() {
        return i(this.f24115a);
    }
}
