package wf;

import fh.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import pf.i2;
import pf.z0;
import we.l;
import xe.e1;
import xe.l0;
import zd.a1;
import zd.f1;
import zd.i0;

@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001:\u0005JKLMNB\u0007¢\u0006\u0004\bI\u00102J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00060\u0000j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0000j\u0002`\u0005H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0016\u001a\u00020\u00152\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u001a\u0010\fJ)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\f\b\u0000\u0010\u001b*\u00060\u0000j\u0002`\u00052\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\b¢\u0006\u0004\b\u001f\u0010 J4\u0010#\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010\"\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130!H\b¢\u0006\u0004\b#\u0010$JD\u0010%\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010\"\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130!2\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\b¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0001¢\u0006\u0004\b'\u0010(J/\u0010+\u001a\u00020*2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u00052\u0006\u0010)\u001a\u00020\u0015H\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0001¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\n¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\nH\u0001¢\u0006\u0004\b3\u00102J\u0015\u00104\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b4\u00100J\u0017\u00106\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u000505¢\u0006\u0004\b6\u00107J.\u00108\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001b\u0018\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130!H\b¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0014¢\u0006\u0004\b:\u00100J'\u0010<\u001a\u00020\n2\n\u0010;\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0000¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\bA\u0010.R\u0011\u0010\t\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0015\u0010F\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\bE\u00100R\u0015\u0010H\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\bG\u00100¨\u0006O"}, d2 = {"Lwf/y;", "", "Lwf/l0;", "U0", "()Lwf/l0;", "Lkotlinx/coroutines/internal/Node;", "current", "G0", "(Lwf/y;)Lwf/y;", "next", "Lzd/u2;", "H0", "(Lwf/y;)V", "Lwf/j0;", "op", "D0", "(Lwf/j0;)Lwf/y;", "node", "Lkotlin/Function0;", "", "condition", "Lwf/y$c;", "O0", "(Lwf/y;Lwe/a;)Lwf/y$c;", "C0", "(Lwf/y;)Z", "x0", "T", "Lwf/y$b;", "E0", "(Lwf/y;)Lwf/y$b;", "y0", "(Lwf/y;Lwe/a;)Z", "Lkotlin/Function1;", "predicate", "z0", "(Lwf/y;Lwe/l;)Z", "A0", "(Lwf/y;Lwe/l;Lwe/a;)Z", "B0", "(Lwf/y;Lwf/y;)Z", "condAdd", "", "V0", "(Lwf/y;Lwf/y;Lwf/y$c;)I", "Q0", "()Z", "T0", "()Lwf/y;", "L0", "()V", "M0", "S0", "Lwf/y$e;", "F0", "()Lwf/y$e;", "R0", "(Lwe/l;)Ljava/lang/Object;", "P0", "prev", "W0", "(Lwf/y;Lwf/y;)V", "", "toString", "()Ljava/lang/String;", "N0", "isRemoved", "I0", "()Ljava/lang/Object;", "J0", "nextNode", "K0", "prevNode", "<init>", "a", "b", "c", "d", "e", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@i2
public class y {
    public static final /* synthetic */ AtomicReferenceFieldUpdater O;
    public static final /* synthetic */ AtomicReferenceFieldUpdater P;
    public static final /* synthetic */ AtomicReferenceFieldUpdater Q;
    @fh.g
    public volatile /* synthetic */ Object _next = this;
    @fh.g
    public volatile /* synthetic */ Object _prev = this;
    @fh.g
    private volatile /* synthetic */ Object _removedRef = null;

    @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0016\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0014J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\bH\u0014J \u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H$J \u0010\u000f\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H&J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0014\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0015J\u001c\u0010\u0018\u001a\u00020\r2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\bR\u001c\u0010\u001b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Lwf/y$a;", "Lwf/b;", "Lwf/j0;", "op", "Lwf/y;", "Lkotlinx/coroutines/internal/Node;", "m", "affected", "", "e", "next", "", "l", "Lzd/u2;", "f", "n", "Lwf/y$d;", "prepareOp", "g", "j", "k", "Lwf/d;", "c", "failure", "a", "h", "()Lwf/y;", "affectedNode", "i", "originalNext", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static abstract class a extends b {
        public final void a(@fh.g d<?> dVar, @h Object obj) {
            y i10;
            boolean z10 = obj == null;
            y h10 = h();
            if (h10 != null && (i10 = i()) != null) {
                if (f1.a(y.O, h10, dVar, z10 ? n(h10, i10) : i10) && z10) {
                    f(h10, i10);
                }
            }
        }

        @h
        public final Object c(@fh.g d<?> dVar) {
            while (true) {
                y m10 = m(dVar);
                if (m10 == null) {
                    return c.f24083b;
                }
                Object obj = m10._next;
                if (obj == dVar || dVar.h()) {
                    return null;
                }
                if (obj instanceof j0) {
                    j0 j0Var = (j0) obj;
                    if (dVar.b(j0Var)) {
                        return c.f24083b;
                    }
                    j0Var.c(m10);
                } else {
                    Object e10 = e(m10);
                    if (e10 != null) {
                        return e10;
                    }
                    if (!l(m10, obj)) {
                        d dVar2 = new d(m10, (y) obj, this);
                        if (f1.a(y.O, m10, obj, dVar2)) {
                            try {
                                if (dVar2.c(m10) != z.f24144a) {
                                    return null;
                                }
                            } catch (Throwable th2) {
                                f1.a(y.O, m10, dVar2, obj);
                                throw th2;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }

        @h
        public Object e(@fh.g y yVar) {
            return null;
        }

        public abstract void f(@fh.g y yVar, @fh.g y yVar2);

        public abstract void g(@fh.g d dVar);

        @h
        public abstract y h();

        @h
        public abstract y i();

        @h
        public Object j(@fh.g d dVar) {
            g(dVar);
            return null;
        }

        public void k(@fh.g y yVar) {
        }

        public boolean l(@fh.g y yVar, @fh.g Object obj) {
            return false;
        }

        @h
        public y m(@fh.g j0 j0Var) {
            y h10 = h();
            l0.m(h10);
            return h10;
        }

        @fh.g
        public abstract Object n(@fh.g y yVar, @fh.g y yVar2);
    }

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004B\u001b\u0012\n\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010\u0017J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00112\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u00060\u0001j\u0002`\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00028\u00008\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028DX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u00060\u0001j\u0002`\u00028DX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lwf/y$b;", "Lwf/y;", "Lkotlinx/coroutines/internal/Node;", "T", "Lwf/y$a;", "Lwf/j0;", "op", "m", "(Lwf/j0;)Lwf/y;", "affected", "", "next", "", "l", "(Lwf/y;Ljava/lang/Object;)Z", "Lwf/y$d;", "prepareOp", "Lzd/u2;", "g", "(Lwf/y$d;)V", "n", "(Lwf/y;Lwf/y;)Ljava/lang/Object;", "f", "(Lwf/y;Lwf/y;)V", "b", "Lwf/y;", "queue", "c", "node", "h", "()Lwf/y;", "affectedNode", "i", "originalNext", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static class b<T extends y> extends a {

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f24132d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_affectedNode");
        @fh.g
        private volatile /* synthetic */ Object _affectedNode = null;
        @fh.g
        @ve.e

        /* renamed from: b  reason: collision with root package name */
        public final y f24133b;
        @fh.g
        @ve.e

        /* renamed from: c  reason: collision with root package name */
        public final T f24134c;

        public b(@fh.g y yVar, @fh.g T t10) {
            this.f24133b = yVar;
            this.f24134c = t10;
        }

        public void f(@fh.g y yVar, @fh.g y yVar2) {
            this.f24134c.H0(this.f24133b);
        }

        public void g(@fh.g d dVar) {
            f1.a(f24132d, this, (Object) null, dVar.f24137a);
        }

        @h
        public final y h() {
            return (y) this._affectedNode;
        }

        @fh.g
        public final y i() {
            return this.f24133b;
        }

        public boolean l(@fh.g y yVar, @fh.g Object obj) {
            return obj != this.f24133b;
        }

        @h
        public final y m(@fh.g j0 j0Var) {
            return this.f24133b.D0(j0Var);
        }

        @fh.g
        public Object n(@fh.g y yVar, @fh.g y yVar2) {
            T t10 = this.f24134c;
            f1.a(y.P, t10, t10, yVar);
            T t11 = this.f24134c;
            f1.a(y.O, t11, t11, this.f24133b);
            return this.f24134c;
        }
    }

    @a1
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0018\u0010\u000b\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lwf/y$c;", "Lwf/d;", "Lwf/y;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "failure", "Lzd/u2;", "j", "b", "Lwf/y;", "newNode", "c", "oldNext", "<init>", "(Lwf/y;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static abstract class c extends d<y> {
        @fh.g
        @ve.e

        /* renamed from: b  reason: collision with root package name */
        public final y f24135b;
        @ve.e
        @h

        /* renamed from: c  reason: collision with root package name */
        public y f24136c;

        public c(@fh.g y yVar) {
            this.f24135b = yVar;
        }

        /* renamed from: j */
        public void d(@fh.g y yVar, @h Object obj) {
            boolean z10 = obj == null;
            y yVar2 = z10 ? this.f24135b : this.f24136c;
            if (yVar2 != null && f1.a(y.O, yVar, this, yVar2) && z10) {
                y yVar3 = this.f24135b;
                y yVar4 = this.f24136c;
                l0.m(yVar4);
                yVar3.H0(yVar4);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0003\u001a\u00060\tj\u0002`\n\u0012\n\u0010\u000e\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\u0003\u001a\u00060\tj\u0002`\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u00060\tj\u0002`\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, d2 = {"Lwf/y$d;", "Lwf/j0;", "", "affected", "c", "Lzd/u2;", "d", "", "toString", "Lwf/y;", "Lkotlinx/coroutines/internal/Node;", "a", "Lwf/y;", "b", "next", "Lwf/y$a;", "Lwf/y$a;", "desc", "Lwf/d;", "()Lwf/d;", "atomicOp", "<init>", "(Lwf/y;Lwf/y;Lwf/y$a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d extends j0 {
        @fh.g
        @ve.e

        /* renamed from: a  reason: collision with root package name */
        public final y f24137a;
        @fh.g
        @ve.e

        /* renamed from: b  reason: collision with root package name */
        public final y f24138b;
        @fh.g
        @ve.e

        /* renamed from: c  reason: collision with root package name */
        public final a f24139c;

        public d(@fh.g y yVar, @fh.g y yVar2, @fh.g a aVar) {
            this.f24137a = yVar;
            this.f24138b = yVar2;
            this.f24139c = aVar;
        }

        @fh.g
        public d<?> a() {
            return this.f24139c.b();
        }

        @h
        public Object c(@h Object obj) {
            if (obj != null) {
                y yVar = (y) obj;
                Object j10 = this.f24139c.j(this);
                Object obj2 = z.f24144a;
                if (j10 == obj2) {
                    y yVar2 = this.f24138b;
                    if (f1.a(y.O, yVar, this, yVar2.U0())) {
                        this.f24139c.k(yVar);
                        y unused = yVar2.D0((j0) null);
                    }
                    return obj2;
                }
                Object e10 = j10 != null ? a().e(j10) : a().f();
                f1.a(y.O, yVar, this, e10 == c.f24082a ? a() : e10 == null ? this.f24139c.n(yVar, this.f24138b) : this.f24138b);
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        }

        public final void d() {
            this.f24139c.g(this);
        }

        @fh.g
        public String toString() {
            return "PrepareOp(op=" + a() + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\u0010\u001c\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\r\u001a\u00020\nH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00132\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u00060\u0005j\u0002`\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010&\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006)"}, d2 = {"Lwf/y$e;", "T", "Lwf/y$a;", "Lwf/j0;", "op", "Lwf/y;", "Lkotlinx/coroutines/internal/Node;", "m", "(Lwf/j0;)Lwf/y;", "affected", "", "e", "(Lwf/y;)Ljava/lang/Object;", "next", "", "l", "(Lwf/y;Ljava/lang/Object;)Z", "Lwf/y$d;", "prepareOp", "Lzd/u2;", "g", "(Lwf/y$d;)V", "n", "(Lwf/y;Lwf/y;)Ljava/lang/Object;", "f", "(Lwf/y;Lwf/y;)V", "b", "Lwf/y;", "queue", "o", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", "h", "()Lwf/y;", "affectedNode", "i", "originalNext", "<init>", "(Lwf/y;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static class e<T> extends a {

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f24140c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f24141d;
        @fh.g
        private volatile /* synthetic */ Object _affectedNode = null;
        @fh.g
        private volatile /* synthetic */ Object _originalNext = null;
        @fh.g
        @ve.e

        /* renamed from: b  reason: collision with root package name */
        public final y f24142b;

        static {
            Class<Object> cls = Object.class;
            Class<e> cls2 = e.class;
            f24140c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_affectedNode");
            f24141d = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_originalNext");
        }

        public e(@fh.g y yVar) {
            this.f24142b = yVar;
        }

        public static /* synthetic */ void p() {
        }

        @h
        public Object e(@fh.g y yVar) {
            if (yVar == this.f24142b) {
                return x.d();
            }
            return null;
        }

        public final void f(@fh.g y yVar, @fh.g y yVar2) {
            y unused = yVar2.D0((j0) null);
        }

        public void g(@fh.g d dVar) {
            f1.a(f24140c, this, (Object) null, dVar.f24137a);
            f1.a(f24141d, this, (Object) null, dVar.f24138b);
        }

        @h
        public final y h() {
            return (y) this._affectedNode;
        }

        @h
        public final y i() {
            return (y) this._originalNext;
        }

        public final boolean l(@fh.g y yVar, @fh.g Object obj) {
            if (!(obj instanceof l0)) {
                return false;
            }
            ((l0) obj).f24105a.M0();
            return true;
        }

        @h
        public final y m(@fh.g j0 j0Var) {
            y yVar = this.f24142b;
            while (true) {
                Object obj = yVar._next;
                if (!(obj instanceof j0)) {
                    return (y) obj;
                }
                j0 j0Var2 = (j0) obj;
                if (j0Var.b(j0Var2)) {
                    return null;
                }
                j0Var2.c(this.f24142b);
            }
        }

        @fh.g
        public final Object n(@fh.g y yVar, @fh.g y yVar2) {
            return yVar2.U0();
        }

        public final T o() {
            T h10 = h();
            l0.m(h10);
            return h10;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, d2 = {"wf/y$f", "Lwf/y$c;", "Lwf/y;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class f extends c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ we.a<Boolean> f24143d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(y yVar, we.a<Boolean> aVar) {
            super(yVar);
            this.f24143d = aVar;
        }

        @h
        /* renamed from: k */
        public Object i(@fh.g y yVar) {
            if (this.f24143d.n().booleanValue()) {
                return null;
            }
            return x.a();
        }
    }

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class g extends e1 {
        public g(Object obj) {
            super(obj, z0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        @h
        public Object get() {
            return z0.a(this.P);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<y> cls2 = y.class;
        O = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        P = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        Q = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    public final boolean A0(@fh.g y yVar, @fh.g l<? super y, Boolean> lVar, @fh.g we.a<Boolean> aVar) {
        int V0;
        f fVar = new f(yVar, aVar);
        do {
            y K0 = K0();
            if (!lVar.A(K0).booleanValue()) {
                return false;
            }
            V0 = K0.V0(yVar, this, fVar);
            if (V0 == 1) {
                return true;
            }
        } while (V0 != 2);
        return false;
    }

    @a1
    public final boolean B0(@fh.g y yVar, @fh.g y yVar2) {
        P.lazySet(yVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = O;
        atomicReferenceFieldUpdater.lazySet(yVar, yVar2);
        if (!f1.a(atomicReferenceFieldUpdater, this, yVar2, yVar)) {
            return false;
        }
        yVar.H0(yVar2);
        return true;
    }

    public final boolean C0(@fh.g y yVar) {
        P.lazySet(yVar, this);
        O.lazySet(yVar, this);
        while (I0() == this) {
            if (f1.a(O, this, this, yVar)) {
                yVar.H0(this);
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: wf.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: wf.y} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (zd.f1.a(O, r3, r2, ((wf.l0) r4).f24105a) != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final wf.y D0(wf.j0 r8) {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7._prev
            wf.y r0 = (wf.y) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = P
            boolean r0 = zd.f1.a(r1, r7, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r7.N0()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r8) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof wf.j0
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0032
            r0 = r4
            wf.j0 r0 = (wf.j0) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            wf.j0 r4 = (wf.j0) r4
            r4.c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof wf.l0
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = O
            wf.l0 r4 = (wf.l0) r4
            wf.y r4 = r4.f24105a
            boolean r2 = zd.f1.a(r5, r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            wf.y r2 = (wf.y) r2
            goto L_0x0007
        L_0x0052:
            r3 = r4
            wf.y r3 = (wf.y) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.y.D0(wf.j0):wf.y");
    }

    @fh.g
    public final <T extends y> b<T> E0(@fh.g T t10) {
        return new b<>(this, t10);
    }

    @fh.g
    public final e<y> F0() {
        return new e<>(this);
    }

    public final y G0(y yVar) {
        while (yVar.N0()) {
            yVar = (y) yVar._prev;
        }
        return yVar;
    }

    public final void H0(y yVar) {
        y yVar2;
        do {
            yVar2 = (y) yVar._prev;
            if (I0() != yVar) {
                return;
            }
        } while (!f1.a(P, yVar, yVar2, this));
        if (N0()) {
            yVar.D0((j0) null);
        }
    }

    @fh.g
    public final Object I0() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof j0)) {
                return obj;
            }
            ((j0) obj).c(this);
        }
    }

    @fh.g
    public final y J0() {
        return x.h(I0());
    }

    @fh.g
    public final y K0() {
        y D0 = D0((j0) null);
        return D0 == null ? G0((y) this._prev) : D0;
    }

    public final void L0() {
        ((l0) I0()).f24105a.M0();
    }

    @a1
    public final void M0() {
        y yVar = this;
        while (true) {
            Object I0 = yVar.I0();
            if (I0 instanceof l0) {
                yVar = ((l0) I0).f24105a;
            } else {
                yVar.D0((j0) null);
                return;
            }
        }
    }

    public boolean N0() {
        return I0() instanceof l0;
    }

    @fh.g
    @a1
    public final c O0(@fh.g y yVar, @fh.g we.a<Boolean> aVar) {
        return new f(yVar, aVar);
    }

    @h
    public y P0() {
        Object I0 = I0();
        l0 l0Var = I0 instanceof l0 ? (l0) I0 : null;
        if (l0Var != null) {
            return l0Var.f24105a;
        }
        return null;
    }

    public boolean Q0() {
        return T0() == null;
    }

    public final /* synthetic */ <T> T R0(l<? super T, Boolean> lVar) {
        y T0;
        while (true) {
            T t10 = (y) I0();
            if (t10 == this) {
                return null;
            }
            l0.y(3, w1.a.X4);
            if (!(t10 instanceof Object)) {
                return null;
            }
            if ((lVar.A(t10).booleanValue() && !t10.N0()) || (T0 = t10.T0()) == null) {
                return t10;
            }
            T0.M0();
        }
    }

    @h
    public final y S0() {
        while (true) {
            y yVar = (y) I0();
            if (yVar == this) {
                return null;
            }
            if (yVar.Q0()) {
                return yVar;
            }
            yVar.L0();
        }
    }

    @a1
    @h
    public final y T0() {
        Object I0;
        y yVar;
        do {
            I0 = I0();
            if (I0 instanceof l0) {
                return ((l0) I0).f24105a;
            }
            if (I0 == this) {
                return (y) I0;
            }
            yVar = (y) I0;
        } while (!f1.a(O, this, I0, yVar.U0()));
        yVar.D0((j0) null);
        return null;
    }

    public final l0 U0() {
        l0 l0Var = (l0) this._removedRef;
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0(this);
        Q.lazySet(this, l0Var2);
        return l0Var2;
    }

    @a1
    public final int V0(@fh.g y yVar, @fh.g y yVar2, @fh.g c cVar) {
        P.lazySet(yVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = O;
        atomicReferenceFieldUpdater.lazySet(yVar, yVar2);
        cVar.f24136c = yVar2;
        if (!f1.a(atomicReferenceFieldUpdater, this, yVar2, cVar)) {
            return 0;
        }
        return cVar.c(this) == null ? 1 : 2;
    }

    public final void W0(@fh.g y yVar, @fh.g y yVar2) {
    }

    @fh.g
    public String toString() {
        return new g(this) + '@' + z0.b(this);
    }

    public final void x0(@fh.g y yVar) {
        do {
        } while (!K0().B0(yVar, this));
    }

    public final boolean y0(@fh.g y yVar, @fh.g we.a<Boolean> aVar) {
        int V0;
        f fVar = new f(yVar, aVar);
        do {
            V0 = K0().V0(yVar, this, fVar);
            if (V0 == 1) {
                return true;
            }
        } while (V0 != 2);
        return false;
    }

    public final boolean z0(@fh.g y yVar, @fh.g l<? super y, Boolean> lVar) {
        y K0;
        do {
            K0 = K0();
            if (!lVar.A(K0).booleanValue()) {
                return false;
            }
        } while (!K0.B0(yVar, this));
        return true;
    }
}
