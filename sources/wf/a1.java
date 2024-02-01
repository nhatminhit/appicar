package wf;

import be.o;
import fh.g;
import fh.h;
import java.lang.Comparable;
import java.util.Arrays;
import kotlin.Metadata;
import pf.i2;
import we.l;
import wf.b1;
import xe.i0;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u000e\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b3\u0010\bJ\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u000f\u001a\u0004\u0018\u00018\u00002!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0013\u0010\u0012J&\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\tH\b¢\u0006\u0004\b\u0014\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00028\u00002\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\r0\tH\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u001d\u0010\u0012J\u0017\u0010 \u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\"\u0010\u0017J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u001eH\u0010¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u001eH\u0010¢\u0006\u0004\b%\u0010$J\u0017\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000&H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u001eH\u0002¢\u0006\u0004\b)\u0010*R \u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010+R$\u0010/\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u001e8F@BX\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010$R\u0011\u00102\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lwf/a1;", "Lwf/b1;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lzd/u2;", "d", "()V", "Lkotlin/Function1;", "Lzd/v0;", "name", "value", "", "predicate", "e", "(Lwe/l;)Lwf/b1;", "i", "()Lwf/b1;", "n", "m", "node", "b", "(Lwf/b1;)V", "cond", "c", "(Lwf/b1;Lwe/l;)Z", "k", "(Lwf/b1;)Z", "f", "", "index", "l", "(I)Lwf/b1;", "a", "q", "(I)V", "p", "", "j", "()[Lwf/b1;", "r", "(II)V", "[Lwf/b1;", "g", "()I", "o", "size", "h", "()Z", "isEmpty", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@i2
public class a1<T extends b1 & Comparable<? super T>> {
    @g
    private volatile /* synthetic */ int _size = 0;
    @h

    /* renamed from: a  reason: collision with root package name */
    public T[] f24056a;

    @zd.a1
    public final void a(@g T t10) {
        t10.a(this);
        b1[] j10 = j();
        int g10 = g();
        o(g10 + 1);
        j10[g10] = t10;
        t10.setIndex(g10);
        q(g10);
    }

    public final void b(@g T t10) {
        synchronized (this) {
            a(t10);
            u2 u2Var = u2.f25116a;
        }
    }

    public final boolean c(@g T t10, @g l<? super T, Boolean> lVar) {
        boolean z10;
        synchronized (this) {
            try {
                if (lVar.A(f()).booleanValue()) {
                    a(t10);
                    z10 = true;
                } else {
                    z10 = false;
                }
                i0.d(1);
            } catch (Throwable th2) {
                i0.d(1);
                i0.c(1);
                throw th2;
            }
        }
        i0.c(1);
        return z10;
    }

    public final void d() {
        synchronized (this) {
            T[] tArr = this.f24056a;
            if (tArr != null) {
                o.w2(tArr, (Object) null, 0, 0, 6, (Object) null);
            }
            this._size = 0;
            u2 u2Var = u2.f25116a;
        }
    }

    @h
    public final T e(@g l<? super T, Boolean> lVar) {
        T t10;
        synchronized (this) {
            int i10 = 0;
            int g10 = g();
            while (true) {
                t10 = null;
                if (i10 >= g10) {
                    break;
                }
                T[] tArr = this.f24056a;
                if (tArr != null) {
                    t10 = tArr[i10];
                }
                l0.m(t10);
                if (lVar.A(t10).booleanValue()) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    @zd.a1
    @h
    public final T f() {
        T[] tArr = this.f24056a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int g() {
        return this._size;
    }

    public final boolean h() {
        return g() == 0;
    }

    @h
    public final T i() {
        T f10;
        synchronized (this) {
            f10 = f();
        }
        return f10;
    }

    public final T[] j() {
        T[] tArr = this.f24056a;
        if (tArr == null) {
            T[] tArr2 = new b1[4];
            this.f24056a = tArr2;
            return tArr2;
        } else if (g() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, g() * 2);
            l0.o(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (b1[]) copyOf;
            this.f24056a = tArr3;
            return tArr3;
        }
    }

    public final boolean k(@g T t10) {
        boolean z10;
        synchronized (this) {
            if (t10.b() == null) {
                z10 = false;
            } else {
                l(t10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    @g
    @zd.a1
    public final T l(int i10) {
        T[] tArr = this.f24056a;
        l0.m(tArr);
        o(g() - 1);
        if (i10 < g()) {
            r(i10, g());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                l0.m(t10);
                T t11 = tArr[i11];
                l0.m(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    r(i10, i11);
                    q(i11);
                }
            }
            p(i10);
        }
        T t12 = tArr[g()];
        l0.m(t12);
        t12.a((a1<?>) null);
        t12.setIndex(-1);
        tArr[g()] = null;
        return t12;
    }

    @h
    public final T m(@g l<? super T, Boolean> lVar) {
        synchronized (this) {
            try {
                b1 f10 = f();
                T t10 = null;
                if (f10 == null) {
                    i0.d(2);
                    i0.c(2);
                    return null;
                }
                if (lVar.A(f10).booleanValue()) {
                    t10 = l(0);
                }
                i0.d(1);
                i0.c(1);
                return t10;
            } catch (Throwable th2) {
                i0.d(1);
                i0.c(1);
                throw th2;
            }
        }
    }

    @h
    public final T n() {
        T l10;
        synchronized (this) {
            l10 = g() > 0 ? l(0) : null;
        }
        return l10;
    }

    public final void o(int i10) {
        this._size = i10;
    }

    public final void p(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 < g()) {
                T[] tArr = this.f24056a;
                l0.m(tArr);
                int i12 = i11 + 1;
                if (i12 < g()) {
                    T t10 = tArr[i12];
                    l0.m(t10);
                    T t11 = tArr[i11];
                    l0.m(t11);
                    if (((Comparable) t10).compareTo(t11) < 0) {
                        i11 = i12;
                    }
                }
                T t12 = tArr[i10];
                l0.m(t12);
                T t13 = tArr[i11];
                l0.m(t13);
                if (((Comparable) t12).compareTo(t13) > 0) {
                    r(i10, i11);
                    i10 = i11;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void q(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f24056a;
            l0.m(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            l0.m(t10);
            T t11 = tArr[i10];
            l0.m(t11);
            if (((Comparable) t10).compareTo(t11) > 0) {
                r(i10, i11);
                i10 = i11;
            } else {
                return;
            }
        }
    }

    public final void r(int i10, int i11) {
        T[] tArr = this.f24056a;
        l0.m(tArr);
        T t10 = tArr[i11];
        l0.m(t10);
        T t11 = tArr[i10];
        l0.m(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }
}
