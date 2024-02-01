package i5;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import w4.d;
import w4.j;
import w4.l;
import w4.o;
import w4.p;

public class r<T> implements Iterator<T>, Closeable {
    public static final r<?> W = new r((j) null, (l) null, (g) null, (k<?>) null, false, (Object) null);
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f9115a0 = 3;
    public final j O;
    public final g P;
    public final k<T> Q;
    public final l R;
    public final o S;
    public final T T;
    public final boolean U;
    public int V;

    public r(j jVar, l lVar, g gVar, k<?> kVar, boolean z10, Object obj) {
        int i10;
        this.O = jVar;
        this.R = lVar;
        this.P = gVar;
        this.Q = kVar;
        this.U = z10;
        if (obj == null) {
            this.T = null;
        } else {
            this.T = obj;
        }
        if (lVar == null) {
            this.S = null;
            i10 = 0;
        } else {
            o U1 = lVar.U1();
            if (!z10 || !lVar.u2()) {
                p P2 = lVar.P();
                if (P2 == p.START_OBJECT || P2 == p.START_ARRAY) {
                    U1 = U1.e();
                }
            } else {
                lVar.w();
            }
            this.S = U1;
            i10 = 2;
        }
        this.V = i10;
    }

    public static <T> r<T> i() {
        return W;
    }

    public <L extends List<? super T>> L A(L l10) throws IOException {
        while (o()) {
            l10.add(q());
        }
        return l10;
    }

    public <R> R c(IOException iOException) {
        throw new RuntimeException(iOException.getMessage(), iOException);
    }

    public void close() throws IOException {
        if (this.V != 0) {
            this.V = 0;
            l lVar = this.R;
            if (lVar != null) {
                lVar.close();
            }
        }
    }

    public <R> R f(l lVar) {
        throw new a0(lVar.getMessage(), lVar);
    }

    public void g() throws IOException {
        l lVar = this.R;
        if (lVar.U1() != this.S) {
            while (true) {
                p D2 = lVar.D2();
                if (D2 == p.END_ARRAY || D2 == p.END_OBJECT) {
                    if (lVar.U1() == this.S) {
                        lVar.w();
                        return;
                    }
                } else if (D2 == p.START_ARRAY || D2 == p.START_OBJECT) {
                    lVar.Z2();
                } else if (D2 == null) {
                    return;
                }
            }
        }
    }

    public <R> R h() {
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        Object f10;
        try {
            return o();
        } catch (l e10) {
            f10 = f(e10);
            return ((Boolean) f10).booleanValue();
        } catch (IOException e11) {
            f10 = c(e11);
            return ((Boolean) f10).booleanValue();
        }
    }

    public j k() {
        return this.R.W0();
    }

    public l l() {
        return this.R;
    }

    public d m() {
        return this.R.V1();
    }

    public T next() {
        try {
            return q();
        } catch (l e10) {
            return f(e10);
        } catch (IOException e11) {
            return c(e11);
        }
    }

    public boolean o() throws IOException {
        p D2;
        l lVar;
        int i10 = this.V;
        if (i10 == 0) {
            return false;
        }
        if (i10 == 1) {
            g();
        } else if (i10 != 2) {
            return true;
        }
        if (this.R.P() == null && ((D2 = this.R.D2()) == null || D2 == p.END_ARRAY)) {
            this.V = 0;
            if (this.U && (lVar = this.R) != null) {
                lVar.close();
            }
            return false;
        }
        this.V = 3;
        return true;
    }

    public T q() throws IOException {
        T t10;
        int i10 = this.V;
        if (i10 == 0) {
            return h();
        }
        int i11 = 2;
        i11 = 1;
        if ((i10 == i11 || i10 == i11) && !o()) {
            return h();
        }
        try {
            T t11 = this.T;
            if (t11 == null) {
                t10 = this.Q.f(this.R, this.P);
            } else {
                this.Q.g(this.R, this.P, t11);
                t10 = this.T;
            }
            return t10;
        } finally {
            this.V = i11;
            this.R.w();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public <C extends Collection<? super T>> C t(C c10) throws IOException {
        while (o()) {
            c10.add(q());
        }
        return c10;
    }

    public List<T> w() throws IOException {
        return A(new ArrayList());
    }
}
