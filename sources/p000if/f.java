package p000if;

import fh.g;
import fh.h;
import java.util.Iterator;
import we.l;
import xe.l0;

/* renamed from: if.f  reason: invalid package */
public final class f<T> implements m<T> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f19702a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final l<T, Boolean> f19703b;

    /* renamed from: if.f$a */
    public static final class a implements Iterator<T>, ye.a {
        @g
        public final Iterator<T> O;
        public int P = -1;
        @h
        public T Q;
        public final /* synthetic */ f<T> R;

        public a(f<T> fVar) {
            this.R = fVar;
            this.O = fVar.f19702a.iterator();
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r2 = this;
            L_0x0000:
                java.util.Iterator<T> r0 = r2.O
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L_0x0026
                java.util.Iterator<T> r0 = r2.O
                java.lang.Object r0 = r0.next()
                if.f<T> r1 = r2.R
                we.l r1 = r1.f19703b
                java.lang.Object r1 = r1.A(r0)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L_0x0000
                r2.Q = r0
                r0 = 1
            L_0x0023:
                r2.P = r0
                return
            L_0x0026:
                r0 = 0
                goto L_0x0023
            */
            throw new UnsupportedOperationException("Method not decompiled: p000if.f.a.a():void");
        }

        public final int b() {
            return this.P;
        }

        @g
        public final Iterator<T> c() {
            return this.O;
        }

        @h
        public final T d() {
            return this.Q;
        }

        public final void e(int i10) {
            this.P = i10;
        }

        public final void f(@h T t10) {
            this.Q = t10;
        }

        public boolean hasNext() {
            if (this.P == -1) {
                a();
            }
            return this.P == 1 || this.O.hasNext();
        }

        public T next() {
            if (this.P == -1) {
                a();
            }
            if (this.P != 1) {
                return this.O.next();
            }
            T t10 = this.Q;
            this.Q = null;
            this.P = 0;
            return t10;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(@g m<? extends T> mVar, @g l<? super T, Boolean> lVar) {
        l0.p(mVar, "sequence");
        l0.p(lVar, "predicate");
        this.f19702a = mVar;
        this.f19703b = lVar;
    }

    @g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
