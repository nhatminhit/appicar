package ie;

import fh.g;
import fh.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ke.d;
import le.e;
import xe.l0;
import xe.w;
import zd.a1;
import zd.d1;
import zd.f1;
import zd.h1;

@h1(version = "1.3")
@a1
public final class k<T> implements d<T>, e {
    @g
    public static final a P = new a((w) null);
    @Deprecated
    public static final AtomicReferenceFieldUpdater<k<?>, Object> Q = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");
    @g
    public final d<T> O;
    @h
    private volatile Object result;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        public static /* synthetic */ void a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @a1
    public k(@g d<? super T> dVar) {
        this(dVar, ke.a.UNDECIDED);
        l0.p(dVar, "delegate");
    }

    public k(@g d<? super T> dVar, @h Object obj) {
        l0.p(dVar, "delegate");
        this.O = dVar;
        this.result = obj;
    }

    @h
    public StackTraceElement R() {
        return null;
    }

    @a1
    @h
    public final Object a() {
        Object obj = this.result;
        ke.a aVar = ke.a.UNDECIDED;
        if (obj == aVar) {
            if (f1.a(Q, this, aVar, d.h())) {
                return d.h();
            }
            obj = this.result;
        }
        if (obj == ke.a.RESUMED) {
            return d.h();
        }
        if (!(obj instanceof d1.b)) {
            return obj;
        }
        throw ((d1.b) obj).O;
    }

    @g
    public g e() {
        return this.O.e();
    }

    @g
    public String toString() {
        return "SafeContinuation for " + this.O;
    }

    @h
    public e u() {
        d<T> dVar = this.O;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public void x(@g Object obj) {
        while (true) {
            Object obj2 = this.result;
            ke.a aVar = ke.a.UNDECIDED;
            if (obj2 == aVar) {
                if (f1.a(Q, this, aVar, obj)) {
                    return;
                }
            } else if (obj2 != d.h()) {
                throw new IllegalStateException("Already resumed");
            } else if (f1.a(Q, this, d.h(), ke.a.RESUMED)) {
                this.O.x(obj);
                return;
            }
        }
    }
}
