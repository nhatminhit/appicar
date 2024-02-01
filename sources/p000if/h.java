package p000if;

import fh.g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import we.l;
import xe.l0;
import xe.w;

/* renamed from: if.h  reason: invalid package */
public final class h<T> implements m<T> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f19705a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f19706b;
    @g

    /* renamed from: c  reason: collision with root package name */
    public final l<T, Boolean> f19707c;

    /* renamed from: if.h$a */
    public static final class a implements Iterator<T>, ye.a {
        @g
        public final Iterator<T> O;
        public int P = -1;
        @fh.h
        public T Q;
        public final /* synthetic */ h<T> R;

        public a(h<T> hVar) {
            this.R = hVar;
            this.O = hVar.f19705a.iterator();
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r3 = this;
            L_0x0000:
                java.util.Iterator<T> r0 = r3.O
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L_0x002c
                java.util.Iterator<T> r0 = r3.O
                java.lang.Object r0 = r0.next()
                if.h<T> r1 = r3.R
                we.l r1 = r1.f19707c
                java.lang.Object r1 = r1.A(r0)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if.h<T> r2 = r3.R
                boolean r2 = r2.f19706b
                if (r1 != r2) goto L_0x0000
                r3.Q = r0
                r0 = 1
            L_0x0029:
                r3.P = r0
                return
            L_0x002c:
                r0 = 0
                goto L_0x0029
            */
            throw new UnsupportedOperationException("Method not decompiled: p000if.h.a.a():void");
        }

        @g
        public final Iterator<T> b() {
            return this.O;
        }

        @fh.h
        public final T c() {
            return this.Q;
        }

        public final int d() {
            return this.P;
        }

        public final void e(@fh.h T t10) {
            this.Q = t10;
        }

        public final void f(int i10) {
            this.P = i10;
        }

        public boolean hasNext() {
            if (this.P == -1) {
                a();
            }
            return this.P == 1;
        }

        public T next() {
            if (this.P == -1) {
                a();
            }
            if (this.P != 0) {
                T t10 = this.Q;
                this.Q = null;
                this.P = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(@g m<? extends T> mVar, boolean z10, @g l<? super T, Boolean> lVar) {
        l0.p(mVar, "sequence");
        l0.p(lVar, "predicate");
        this.f19705a = mVar;
        this.f19706b = z10;
        this.f19707c = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(m mVar, boolean z10, l lVar, int i10, w wVar) {
        this(mVar, (i10 & 2) != 0 ? true : z10, lVar);
    }

    @g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
