package pf;

import fh.g;
import fh.h;
import ie.d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ke.c;
import kotlin.Metadata;
import xe.l0;
import zd.d1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\b\u0004B\u001d\u0012\u0014\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lpf/e;", "T", "", "", "b", "(Lie/d;)Ljava/lang/Object;", "", "Lpf/c1;", "a", "[Lpf/c1;", "deferreds", "<init>", "([Lpf/c1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class e<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21995b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount");
    @g

    /* renamed from: a  reason: collision with root package name */
    public final c1<T>[] f21996a;
    @g
    public volatile /* synthetic */ int notCompletedCount;

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R<\u0010\u001b\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0016\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00158F@FX\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lpf/e$a;", "Lpf/u2;", "", "cause", "Lzd/u2;", "X0", "(Ljava/lang/Throwable;)V", "Lpf/q;", "", "S", "Lpf/q;", "continuation", "Lpf/p1;", "T", "Lpf/p1;", "b1", "()Lpf/p1;", "d1", "(Lpf/p1;)V", "handle", "Lpf/e$b;", "Lpf/e;", "value", "a1", "()Lpf/e$b;", "c1", "(Lpf/e$b;)V", "disposer", "<init>", "(Lpf/e;Lpf/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class a extends u2 {
        @g
        public final q<List<? extends T>> S;
        public p1 T;
        @g
        private volatile /* synthetic */ Object _disposer = null;

        public a(@g q<? super List<? extends T>> qVar) {
            this.S = qVar;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            X0((Throwable) obj);
            return u2.f25116a;
        }

        public void X0(@h Throwable th2) {
            if (th2 != null) {
                Object S2 = this.S.S(th2);
                if (S2 != null) {
                    this.S.t0(S2);
                    e<T>.b a12 = a1();
                    if (a12 != null) {
                        a12.d();
                        return;
                    }
                    return;
                }
                return;
            }
            if (e.f21995b.decrementAndGet(e.this) == 0) {
                q<List<? extends T>> qVar = this.S;
                c1[] a10 = e.this.f21996a;
                ArrayList arrayList = new ArrayList(a10.length);
                for (c1 w10 : a10) {
                    arrayList.add(w10.w());
                }
                d1.a aVar = d1.P;
                qVar.x(d1.b(arrayList));
            }
        }

        @h
        public final e<T>.b a1() {
            return (b) this._disposer;
        }

        @g
        public final p1 b1() {
            p1 p1Var = this.T;
            if (p1Var != null) {
                return p1Var;
            }
            l0.S("handle");
            return null;
        }

        public final void c1(@h e<T>.b bVar) {
            this._disposer = bVar;
        }

        public final void d1(@g p1 p1Var) {
            this.T = p1Var;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lpf/e$b;", "Lpf/o;", "Lzd/u2;", "d", "", "cause", "c", "", "toString", "", "Lpf/e$a;", "Lpf/e;", "O", "[Lpf/e$a;", "nodes", "<init>", "(Lpf/e;[Lpf/e$a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class b extends o {
        @g
        public final e<T>.a[] O;

        public b(@g e<T>.a[] aVarArr) {
            this.O = aVarArr;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Throwable) obj);
            return u2.f25116a;
        }

        public void c(@h Throwable th2) {
            d();
        }

        public final void d() {
            for (e<T>.a b12 : this.O) {
                b12.b1().P();
            }
        }

        @g
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.O + ']';
        }
    }

    public e(@g c1<? extends T>[] c1VarArr) {
        this.f21996a = c1VarArr;
        this.notCompletedCount = c1VarArr.length;
    }

    @h
    public final Object b(@g d<? super List<? extends T>> dVar) {
        r rVar = new r(c.d(dVar), 1);
        rVar.Z();
        int length = this.f21996a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            c1 c1Var = this.f21996a[i10];
            c1Var.start();
            a aVar = new a(rVar);
            aVar.d1(c1Var.A(aVar));
            u2 u2Var = u2.f25116a;
            aVarArr[i10] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].c1(bVar);
        }
        if (rVar.m()) {
            bVar.d();
        } else {
            rVar.T(bVar);
        }
        Object z10 = rVar.z();
        if (z10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return z10;
    }
}
