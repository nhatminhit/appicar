package be;

import fh.g;
import fh.h;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class b<T> implements Iterator<T>, ye.a {
    @g
    public p1 O = p1.NotReady;
    @h
    public T P;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16210a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                be.p1[] r0 = be.p1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                be.p1 r1 = be.p1.Done     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                be.p1 r1 = be.p1.Ready     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f16210a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: be.b.a.<clinit>():void");
        }
    }

    public abstract void a();

    public final void b() {
        this.O = p1.Done;
    }

    public final void c(T t10) {
        this.P = t10;
        this.O = p1.Ready;
    }

    public final boolean d() {
        this.O = p1.Failed;
        a();
        return this.O == p1.Ready;
    }

    public boolean hasNext() {
        p1 p1Var = this.O;
        if (p1Var != p1.Failed) {
            int i10 = a.f16210a[p1Var.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 != 2) {
                return d();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public T next() {
        if (hasNext()) {
            this.O = p1.NotReady;
            return this.P;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
