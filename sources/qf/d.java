package qf;

import android.os.Handler;
import android.os.Looper;
import fh.g;
import fh.h;
import gf.v;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import pf.c3;
import pf.e1;
import pf.m1;
import pf.p1;
import pf.q;
import pf.r2;
import we.l;
import xe.l0;
import xe.n0;
import xe.w;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b+\u0010,B\u001d\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b+\u0010-J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016J\u001e\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0016J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u001c\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00008\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lqf/d;", "Lqf/e;", "Lpf/e1;", "Lie/g;", "context", "", "P1", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lzd/u2;", "N1", "", "timeMillis", "Lpf/q;", "continuation", "p1", "Lpf/p1;", "W0", "", "toString", "", "other", "equals", "", "hashCode", "X1", "Landroid/os/Handler;", "Q", "Landroid/os/Handler;", "handler", "R", "Ljava/lang/String;", "name", "S", "Z", "invokeImmediately", "_immediate", "Lqf/d;", "T", "Y1", "()Lqf/d;", "immediate", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
public final class d extends e implements e1 {
    @g
    public final Handler Q;
    @h
    public final String R;
    public final boolean S;
    @g
    public final d T;
    @h
    private volatile d _immediate;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lzd/u2;", "run", "()V", "pf/k3$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a implements Runnable {
        public final /* synthetic */ q O;
        public final /* synthetic */ d P;

        public a(q qVar, d dVar) {
            this.O = qVar;
            this.P = dVar;
        }

        public final void run() {
            this.O.W(this.P, u2.f25116a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzd/u2;", "c", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    public static final class b extends n0 implements l<Throwable, u2> {
        public final /* synthetic */ d P;
        public final /* synthetic */ Runnable Q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, Runnable runnable) {
            super(1);
            this.P = dVar;
            this.Q = runnable;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Throwable) obj);
            return u2.f25116a;
        }

        public final void c(@h Throwable th2) {
            this.P.Q.removeCallbacks(this.Q);
        }
    }

    public d(@g Handler handler, @h String str) {
        this(handler, str, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Handler handler, String str, int i10, w wVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Handler handler, String str, boolean z10) {
        super((w) null);
        d dVar = null;
        this.Q = handler;
        this.R = str;
        this.S = z10;
        this._immediate = z10 ? this : dVar;
        d dVar2 = this._immediate;
        if (dVar2 == null) {
            dVar2 = new d(handler, str, true);
            this._immediate = dVar2;
        }
        this.T = dVar2;
    }

    public static final void Z1(d dVar, Runnable runnable) {
        dVar.Q.removeCallbacks(runnable);
    }

    public void N1(@g ie.g gVar, @g Runnable runnable) {
        if (!this.Q.post(runnable)) {
            X1(gVar, runnable);
        }
    }

    public boolean P1(@g ie.g gVar) {
        return !this.S || !l0.g(Looper.myLooper(), this.Q.getLooper());
    }

    @g
    public p1 W0(long j10, @g Runnable runnable, @g ie.g gVar) {
        if (this.Q.postDelayed(runnable, v.C(j10, 4611686018427387903L))) {
            return new c(this, runnable);
        }
        X1(gVar, runnable);
        return c3.O;
    }

    public final void X1(ie.g gVar, Runnable runnable) {
        r2.f(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        m1.c().N1(gVar, runnable);
    }

    @g
    /* renamed from: Y1 */
    public d U1() {
        return this.T;
    }

    public boolean equals(@h Object obj) {
        return (obj instanceof d) && ((d) obj).Q == this.Q;
    }

    public int hashCode() {
        return System.identityHashCode(this.Q);
    }

    public void p1(long j10, @g q<? super u2> qVar) {
        a aVar = new a(qVar, this);
        if (this.Q.postDelayed(aVar, v.C(j10, 4611686018427387903L))) {
            qVar.T(new b(this, aVar));
        } else {
            X1(qVar.e(), aVar);
        }
    }

    @g
    public String toString() {
        String T1 = T1();
        if (T1 != null) {
            return T1;
        }
        String str = this.R;
        if (str == null) {
            str = this.Q.toString();
        }
        if (!this.S) {
            return str;
        }
        return str + ".immediate";
    }
}
