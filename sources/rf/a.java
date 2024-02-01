package rf;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import pf.p1;
import pf.q;
import pf.r;
import pf.s;
import pf.t;
import pf.z0;
import rf.n;
import rf.p;
import rf.r;
import we.l;
import wf.i0;
import wf.q0;
import wf.r0;
import wf.w;
import wf.x;
import wf.y;
import wf.z;
import zd.b1;
import zd.d1;
import zd.e1;
import zd.m;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0007WGXMY)ZB)\u0012 \u0010T\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010Rj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`S¢\u0006\u0004\bU\u0010VJ!\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002JT\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JZ\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u0004* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\u00132\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0014J\u0013\u0010 \u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0014J\"\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010!J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000#ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010&J\u0012\u0010)\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'H\u0007J\u0016\u0010,\u001a\u00020\u00132\u000e\u0010(\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+J\u0019\u0010-\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u000bH\u0014J/\u00106\u001a\u00020\u00132\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\n\u00105\u001a\u0006\u0012\u0002\b\u000304H\u0014ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00028\u000008H\u0002J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:H\u0004J\u0010\u0010=\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010<H\u0014J\b\u0010>\u001a\u00020\u0013H\u0014J\b\u0010?\u001a\u00020\u0013H\u0014R\u0014\u0010B\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\bC\u0010AR\u0014\u0010F\u001a\u00020\u000b8DX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010AR\u0014\u0010H\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010AR\u0014\u0010I\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\bI\u0010AR\u0014\u0010K\u001a\u00020\u000b8DX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010AR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR \u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#0L8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\bP\u0010N\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006["}, d2 = {"Lrf/a;", "E", "Lrf/c;", "Lrf/n;", "R", "", "receiveMode", "o0", "(ILie/d;)Ljava/lang/Object;", "Lrf/h0;", "receive", "", "b0", "Lzf/f;", "select", "Lkotlin/Function2;", "", "Lie/d;", "block", "Lzd/u2;", "p0", "(Lzf/f;ILwe/p;)V", "value", "r0", "(Lwe/p;Lzf/f;ILjava/lang/Object;)V", "d0", "(Lzf/f;Lwe/p;I)Z", "Lpf/q;", "cont", "q0", "m0", "n0", "D", "(Lie/d;)Ljava/lang/Object;", "c0", "Lrf/r;", "v", "z", "()Ljava/lang/Object;", "", "cause", "f", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "h", "Z", "(Ljava/lang/Throwable;)Z", "wasClosed", "i0", "Lwf/q;", "Lrf/l0;", "list", "Lrf/w;", "closed", "j0", "(Ljava/lang/Object;Lrf/w;)V", "Lrf/p;", "iterator", "Lrf/a$g;", "a0", "Lrf/j0;", "T", "l0", "k0", "f0", "()Z", "isBufferAlwaysEmpty", "g0", "isBufferEmpty", "e0", "hasReceiveOrClosed", "b", "isClosedForReceive", "isEmpty", "h0", "isEmptyImpl", "Lzf/d;", "d", "()Lzf/d;", "onReceive", "j", "onReceiveCatching", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lwe/l;)V", "a", "c", "e", "g", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class a<E> extends c<E> implements n<E> {

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\u00020\u0003HBø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0013\u0010\u000b\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lrf/a$a;", "E", "Lrf/p;", "", "b", "(Lie/d;)Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "", "result", "e", "f", "Lrf/a;", "a", "Lrf/a;", "channel", "Ljava/lang/Object;", "d", "g", "(Ljava/lang/Object;)V", "<init>", "(Lrf/a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: rf.a$a  reason: collision with other inner class name */
    public static final class C0406a<E> implements p<E> {
        @fh.g
        @ve.e

        /* renamed from: a  reason: collision with root package name */
        public final a<E> f22517a;
        @fh.h

        /* renamed from: b  reason: collision with root package name */
        public Object f22518b = b.f22525f;

        public C0406a(@fh.g a<E> aVar) {
            this.f22517a = aVar;
        }

        @ve.h(name = "next")
        @zd.k(level = m.Q, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ Object a(ie.d dVar) {
            return p.a.a(this, dVar);
        }

        @fh.h
        public Object b(@fh.g ie.d<? super Boolean> dVar) {
            Object obj = this.f22518b;
            r0 r0Var = b.f22525f;
            if (obj == r0Var) {
                obj = this.f22517a.m0();
                this.f22518b = obj;
                if (obj == r0Var) {
                    return f(dVar);
                }
            }
            return le.b.a(e(obj));
        }

        @fh.h
        public final Object d() {
            return this.f22518b;
        }

        public final boolean e(Object obj) {
            if (!(obj instanceof w)) {
                return true;
            }
            w wVar = (w) obj;
            if (wVar.R == null) {
                return false;
            }
            throw q0.p(wVar.e1());
        }

        public final Object f(ie.d<? super Boolean> dVar) {
            Object obj;
            r<? super Boolean> b10 = t.b(ke.c.d(dVar));
            d dVar2 = new d(this, b10);
            while (true) {
                if (this.f22517a.b0(dVar2)) {
                    this.f22517a.q0(b10, dVar2);
                    break;
                }
                Object m02 = this.f22517a.m0();
                g(m02);
                if (m02 instanceof w) {
                    w wVar = (w) m02;
                    if (wVar.R == null) {
                        d1.a aVar = d1.P;
                        obj = le.b.a(false);
                    } else {
                        d1.a aVar2 = d1.P;
                        obj = e1.a(wVar.e1());
                    }
                    b10.x(d1.b(obj));
                } else if (m02 != b.f22525f) {
                    Boolean a10 = le.b.a(true);
                    l<E, u2> lVar = this.f22517a.O;
                    b10.B(a10, lVar != null ? i0.a(lVar, m02, b10.e()) : null);
                }
            }
            Object z10 = b10.z();
            if (z10 == ke.d.h()) {
                le.h.c(dVar);
            }
            return z10;
        }

        public final void g(@fh.h Object obj) {
            this.f22518b = obj;
        }

        public E next() {
            E e10 = this.f22518b;
            if (!(e10 instanceof w)) {
                E e11 = b.f22525f;
                if (e10 != e11) {
                    this.f22518b = e11;
                    return e10;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw q0.p(((w) e10).e1());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lrf/a$b;", "E", "Lrf/h0;", "value", "", "a1", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lwf/y$d;", "otherOp", "Lwf/r0;", "k", "(Ljava/lang/Object;Lwf/y$d;)Lwf/r0;", "Lzd/u2;", "f0", "(Ljava/lang/Object;)V", "Lrf/w;", "closed", "Z0", "", "toString", "Lpf/q;", "R", "Lpf/q;", "cont", "", "S", "I", "receiveMode", "<init>", "(Lpf/q;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static class b<E> extends h0<E> {
        @fh.g
        @ve.e
        public final q<Object> R;
        @ve.e
        public final int S;

        public b(@fh.g q<Object> qVar, int i10) {
            this.R = qVar;
            this.S = i10;
        }

        public void Z0(@fh.g w<?> wVar) {
            Object obj;
            q<Object> qVar;
            if (this.S == 1) {
                qVar = this.R;
                obj = r.b(r.f22540b.a(wVar.R));
                d1.a aVar = d1.P;
            } else {
                qVar = this.R;
                d1.a aVar2 = d1.P;
                obj = e1.a(wVar.e1());
            }
            qVar.x(d1.b(obj));
        }

        @fh.h
        public final Object a1(E e10) {
            return this.S == 1 ? r.b(r.f22540b.c(e10)) : e10;
        }

        public void f0(E e10) {
            this.R.t0(s.f22024d);
        }

        @fh.h
        public r0 k(E e10, @fh.h y.d dVar) {
            if (this.R.p(a1(e10), dVar != null ? dVar.f24139c : null, Y0(e10)) == null) {
                return null;
            }
            if (dVar != null) {
                dVar.d();
            }
            return s.f22024d;
        }

        @fh.g
        public String toString() {
            return "ReceiveElement@" + z0.b(this) + "[receiveMode=" + this.S + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B=\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lrf/a$c;", "E", "Lrf/a$b;", "value", "Lkotlin/Function1;", "", "Lzd/u2;", "Y0", "(Ljava/lang/Object;)Lwe/l;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "T", "Lwe/l;", "onUndeliveredElement", "Lpf/q;", "", "cont", "", "receiveMode", "<init>", "(Lpf/q;ILwe/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class c<E> extends b<E> {
        @fh.g
        @ve.e
        public final l<E, u2> T;

        public c(@fh.g q<Object> qVar, int i10, @fh.g l<? super E, u2> lVar) {
            super(qVar, i10);
            this.T = lVar;
        }

        @fh.h
        public l<Throwable, u2> Y0(E e10) {
            return i0.a(this.T, e10, this.R.e());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B#\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00158\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lrf/a$d;", "E", "Lrf/h0;", "value", "Lwf/y$d;", "otherOp", "Lwf/r0;", "k", "(Ljava/lang/Object;Lwf/y$d;)Lwf/r0;", "Lzd/u2;", "f0", "(Ljava/lang/Object;)V", "Lrf/w;", "closed", "Z0", "Lkotlin/Function1;", "", "Y0", "(Ljava/lang/Object;)Lwe/l;", "", "toString", "Lrf/a$a;", "R", "Lrf/a$a;", "iterator", "Lpf/q;", "", "S", "Lpf/q;", "cont", "<init>", "(Lrf/a$a;Lpf/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static class d<E> extends h0<E> {
        @fh.g
        @ve.e
        public final C0406a<E> R;
        @fh.g
        @ve.e
        public final q<Boolean> S;

        public d(@fh.g C0406a<E> aVar, @fh.g q<? super Boolean> qVar) {
            this.R = aVar;
            this.S = qVar;
        }

        @fh.h
        public l<Throwable, u2> Y0(E e10) {
            l<E, u2> lVar = this.R.f22517a.O;
            if (lVar != null) {
                return i0.a(lVar, e10, this.S.e());
            }
            return null;
        }

        public void Z0(@fh.g w<?> wVar) {
            Object b10 = wVar.R == null ? q.a.b(this.S, Boolean.FALSE, (Object) null, 2, (Object) null) : this.S.S(wVar.e1());
            if (b10 != null) {
                this.R.g(wVar);
                this.S.t0(b10);
            }
        }

        public void f0(E e10) {
            this.R.g(e10);
            this.S.t0(s.f22024d);
        }

        @fh.h
        public r0 k(E e10, @fh.h y.d dVar) {
            if (this.S.p(Boolean.TRUE, dVar != null ? dVar.f24139c : null, Y0(e10)) == null) {
                return null;
            }
            if (dVar != null) {
                dVar.d();
            }
            return s.f22024d;
        }

        @fh.g
        public String toString() {
            return "ReceiveHasNext@" + z0.b(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u00028\u00020\u00032\u00020\u0004BT\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00020\u0018\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\u0012$\u0010$\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010!\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f\u0012\u0006\u0010(\u001a\u00020%ø\u0001\u0000¢\u0006\u0004\b)\u0010*J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00028\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0010\u001a\u00020\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00020\u00188\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR5\u0010$\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010!\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8\u0006X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0006X\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lrf/a$e;", "R", "E", "Lrf/h0;", "Lpf/p1;", "value", "Lwf/y$d;", "otherOp", "Lwf/r0;", "k", "(Ljava/lang/Object;Lwf/y$d;)Lwf/r0;", "Lzd/u2;", "f0", "(Ljava/lang/Object;)V", "Lrf/w;", "closed", "Z0", "P", "Lkotlin/Function1;", "", "Y0", "(Ljava/lang/Object;)Lwe/l;", "", "toString", "Lrf/a;", "Lrf/a;", "channel", "Lzf/f;", "S", "Lzf/f;", "select", "Lkotlin/Function2;", "", "Lie/d;", "T", "Lwe/p;", "block", "", "U", "I", "receiveMode", "<init>", "(Lrf/a;Lzf/f;Lwe/p;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class e<R, E> extends h0<E> implements p1 {
        @fh.g
        @ve.e
        public final a<E> R;
        @fh.g
        @ve.e
        public final zf.f<R> S;
        @fh.g
        @ve.e
        public final we.p<Object, ie.d<? super R>, Object> T;
        @ve.e
        public final int U;

        public e(@fh.g a<E> aVar, @fh.g zf.f<? super R> fVar, @fh.g we.p<Object, ? super ie.d<? super R>, ? extends Object> pVar, int i10) {
            this.R = aVar;
            this.S = fVar;
            this.T = pVar;
            this.U = i10;
        }

        public void P() {
            if (Q0()) {
                this.R.k0();
            }
        }

        @fh.h
        public l<Throwable, u2> Y0(E e10) {
            l<E, u2> lVar = this.R.O;
            if (lVar != null) {
                return i0.a(lVar, e10, this.S.Q().e());
            }
            return null;
        }

        public void Z0(@fh.g w<?> wVar) {
            if (this.S.F()) {
                int i10 = this.U;
                if (i10 == 0) {
                    this.S.j0(wVar.e1());
                } else if (i10 == 1) {
                    xf.a.f(this.T, r.b(r.f22540b.a(wVar.R)), this.S.Q(), (l) null, 4, (Object) null);
                }
            }
        }

        public void f0(E e10) {
            xf.a.e(this.T, this.U == 1 ? r.b(r.f22540b.c(e10)) : e10, this.S.Q(), Y0(e10));
        }

        @fh.h
        public r0 k(E e10, @fh.h y.d dVar) {
            return (r0) this.S.d(dVar);
        }

        @fh.g
        public String toString() {
            return "ReceiveSelect@" + z0.b(this) + '[' + this.S + ",receiveMode=" + this.U + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lrf/a$f;", "Lpf/g;", "", "cause", "Lzd/u2;", "c", "", "toString", "Lrf/h0;", "O", "Lrf/h0;", "receive", "<init>", "(Lrf/a;Lrf/h0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class f extends pf.g {
        @fh.g
        public final h0<?> O;

        public f(@fh.g h0<?> h0Var) {
            this.O = h0Var;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Throwable) obj);
            return u2.f25116a;
        }

        public void c(@fh.h Throwable th2) {
            if (this.O.Q0()) {
                a.this.k0();
            }
        }

        @fh.g
        public String toString() {
            return "RemoveReceiveOnCancel[" + this.O + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, d2 = {"Lrf/a$g;", "E", "Lwf/y$e;", "Lrf/l0;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lwf/y;", "affected", "", "e", "Lwf/y$d;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "j", "Lzd/u2;", "k", "Lwf/w;", "queue", "<init>", "(Lwf/w;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class g<E> extends y.e<l0> {
        public g(@fh.g w wVar) {
            super(wVar);
        }

        @fh.h
        public Object e(@fh.g y yVar) {
            if (yVar instanceof w) {
                return yVar;
            }
            if (!(yVar instanceof l0)) {
                return b.f22525f;
            }
            return null;
        }

        @fh.h
        public Object j(@fh.g y.d dVar) {
            r0 a12 = ((l0) dVar.f24137a).a1(dVar);
            if (a12 == null) {
                return z.f24144a;
            }
            Object obj = wf.c.f24083b;
            if (a12 == obj) {
                return obj;
            }
            return null;
        }

        public void k(@fh.g y yVar) {
            ((l0) yVar).b1();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"wf/y$f", "Lwf/y$c;", "Lwf/y;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class h extends y.c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f22519d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(y yVar, a aVar) {
            super(yVar);
            this.f22519d = aVar;
        }

        @fh.h
        /* renamed from: k */
        public Object i(@fh.g y yVar) {
            if (this.f22519d.g0()) {
                return null;
            }
            return x.a();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JJ\u0010\n\u001a\u00020\t\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"rf/a$i", "Lzf/d;", "R", "Lzf/f;", "select", "Lkotlin/Function2;", "Lie/d;", "", "block", "Lzd/u2;", "y", "(Lzf/f;Lwe/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class i implements zf.d<E> {
        public final /* synthetic */ a<E> O;

        public i(a<E> aVar) {
            this.O = aVar;
        }

        public <R> void y(@fh.g zf.f<? super R> fVar, @fh.g we.p<? super E, ? super ie.d<? super R>, ? extends Object> pVar) {
            this.O.p0(fVar, 0, pVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JS\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"rf/a$j", "Lzf/d;", "Lrf/r;", "R", "Lzf/f;", "select", "Lkotlin/Function2;", "Lie/d;", "", "block", "Lzd/u2;", "y", "(Lzf/f;Lwe/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class j implements zf.d<r<? extends E>> {
        public final /* synthetic */ a<E> O;

        public j(a<E> aVar) {
            this.O = aVar;
        }

        public <R> void y(@fh.g zf.f<? super R> fVar, @fh.g we.p<? super r<? extends E>, ? super ie.d<? super R>, ? extends Object> pVar) {
            this.O.p0(fVar, 1, pVar);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", i = {}, l = {633}, m = "receiveCatching-JP2dKIU", n = {}, s = {})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class k extends le.d {
        public /* synthetic */ Object R;
        public final /* synthetic */ a<E> S;
        public int T;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(a<E> aVar, ie.d<? super k> dVar) {
            super(dVar);
            this.S = aVar;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.R = obj;
            this.T |= Integer.MIN_VALUE;
            Object v10 = this.S.v(this);
            return v10 == ke.d.h() ? v10 : r.b(v10);
        }
    }

    public a(@fh.h l<? super E, u2> lVar) {
        super(lVar);
    }

    @fh.h
    public final Object D(@fh.g ie.d<? super E> dVar) {
        Object m02 = m0();
        return (m02 == b.f22525f || (m02 instanceof w)) ? o0(0, dVar) : m02;
    }

    @fh.h
    @oe.h
    @zd.k(level = m.P, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    public Object J(@fh.g ie.d<? super E> dVar) {
        return n.a.e(this, dVar);
    }

    @fh.h
    public j0<E> T() {
        j0<E> T = super.T();
        if (T != null && !(T instanceof w)) {
            k0();
        }
        return T;
    }

    /* renamed from: Z */
    public final boolean f(@fh.h Throwable th2) {
        boolean G = G(th2);
        i0(G);
        return G;
    }

    @fh.g
    public final g<E> a0() {
        return new g<>(t());
    }

    public boolean b() {
        return q() != null && g0();
    }

    public final boolean b0(h0<? super E> h0Var) {
        boolean c02 = c0(h0Var);
        if (c02) {
            l0();
        }
        return c02;
    }

    public boolean c0(@fh.g h0<? super E> h0Var) {
        int V0;
        y K0;
        if (f0()) {
            w t10 = t();
            do {
                K0 = t10.K0();
                if (!(!(K0 instanceof l0))) {
                    return false;
                }
            } while (!K0.B0(h0Var, t10));
        } else {
            w t11 = t();
            h hVar = new h(h0Var, this);
            do {
                y K02 = t11.K0();
                if (!(!(K02 instanceof l0))) {
                    return false;
                }
                V0 = K02.V0(h0Var, t11, hVar);
                if (V0 != 1) {
                }
            } while (V0 != 2);
            return false;
        }
        return true;
    }

    @zd.k(level = m.Q, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        h((CancellationException) null);
    }

    @fh.g
    public final zf.d<E> d() {
        return new i(this);
    }

    public final <R> boolean d0(zf.f<? super R> fVar, we.p<Object, ? super ie.d<? super R>, ? extends Object> pVar, int i10) {
        e eVar = new e(this, fVar, pVar, i10);
        boolean b02 = b0(eVar);
        if (b02) {
            fVar.H(eVar);
        }
        return b02;
    }

    public final boolean e0() {
        return t().J0() instanceof j0;
    }

    public abstract boolean f0();

    public abstract boolean g0();

    public final void h(@fh.h CancellationException cancellationException) {
        if (!b()) {
            if (cancellationException == null) {
                cancellationException = new CancellationException(z0.a(this) + " was cancelled");
            }
            f(cancellationException);
        }
    }

    public final boolean h0() {
        return !(t().J0() instanceof l0) && g0();
    }

    public void i0(boolean z10) {
        w<?> r10 = r();
        if (r10 != null) {
            Object c10 = wf.q.c((Object) null, 1, (xe.w) null);
            while (true) {
                y K0 = r10.K0();
                if (K0 instanceof w) {
                    j0(c10, r10);
                    return;
                } else if (!K0.Q0()) {
                    K0.L0();
                } else {
                    c10 = wf.q.h(c10, (l0) K0);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    public boolean isEmpty() {
        return h0();
    }

    @fh.g
    public final p<E> iterator() {
        return new C0406a(this);
    }

    @fh.g
    public final zf.d<r<E>> j() {
        return new j(this);
    }

    public void j0(@fh.g Object obj, @fh.g w<?> wVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((l0) obj).Z0(wVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 < size) {
                ((l0) arrayList.get(size)).Z0(wVar);
            } else {
                return;
            }
        }
    }

    public void k0() {
    }

    public void l0() {
    }

    @fh.h
    public Object m0() {
        while (true) {
            l0 U = U();
            if (U == null) {
                return b.f22525f;
            }
            if (U.a1((y.d) null) != null) {
                U.X0();
                return U.Y0();
            }
            U.b1();
        }
    }

    @fh.h
    public Object n0(@fh.g zf.f<?> fVar) {
        g a02 = a0();
        Object q02 = fVar.q0(a02);
        if (q02 != null) {
            return q02;
        }
        ((l0) a02.o()).X0();
        return ((l0) a02.o()).Y0();
    }

    public final <R> Object o0(int i10, ie.d<? super R> dVar) {
        r<? super R> b10 = t.b(ke.c.d(dVar));
        b bVar = this.O == null ? new b(b10, i10) : new c(b10, i10, this.O);
        while (true) {
            if (!b0(bVar)) {
                Object m02 = m0();
                if (!(m02 instanceof w)) {
                    if (m02 != b.f22525f) {
                        b10.B(bVar.a1(m02), bVar.Y0(m02));
                        break;
                    }
                } else {
                    bVar.Z0((w) m02);
                    break;
                }
            } else {
                q0(b10, bVar);
                break;
            }
        }
        Object z10 = b10.z();
        if (z10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return z10;
    }

    public final <R> void p0(zf.f<? super R> fVar, int i10, we.p<Object, ? super ie.d<? super R>, ? extends Object> pVar) {
        while (!fVar.N()) {
            if (!h0()) {
                Object n02 = n0(fVar);
                if (n02 != zf.g.d()) {
                    if (!(n02 == b.f22525f || n02 == wf.c.f24083b)) {
                        r0(pVar, fVar, i10, n02);
                    }
                } else {
                    return;
                }
            } else if (d0(fVar, pVar, i10)) {
                return;
            }
        }
    }

    @fh.h
    @zd.k(level = m.P, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return n.a.d(this);
    }

    public final void q0(q<?> qVar, h0<?> h0Var) {
        qVar.T(new f(h0Var));
    }

    public final <R> void r0(we.p<Object, ? super ie.d<? super R>, ? extends Object> pVar, zf.f<? super R> fVar, int i10, Object obj) {
        Object obj2;
        r.b bVar;
        boolean z10 = obj instanceof w;
        if (z10) {
            if (i10 == 0) {
                throw q0.p(((w) obj).e1());
            } else if (i10 == 1 && fVar.F()) {
                bVar = r.f22540b;
            } else {
                return;
            }
        } else if (i10 == 1) {
            bVar = r.f22540b;
            if (!z10) {
                obj2 = bVar.c(obj);
                xf.b.d(pVar, r.b(obj2), fVar.Q());
            }
        } else {
            xf.b.d(pVar, obj, fVar.Q());
            return;
        }
        obj2 = bVar.a(((w) obj).R);
        xf.b.d(pVar, r.b(obj2), fVar.Q());
    }

    @fh.g
    public zf.d<E> s() {
        return n.a.b(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(@fh.g ie.d<? super rf.r<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof rf.a.k
            if (r0 == 0) goto L_0x0013
            r0 = r5
            rf.a$k r0 = (rf.a.k) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            rf.a$k r0 = new rf.a$k
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.R
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            zd.e1.n(r5)
            goto L_0x005b
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            zd.e1.n(r5)
            java.lang.Object r5 = r4.m0()
            wf.r0 r2 = rf.b.f22525f
            if (r5 == r2) goto L_0x0052
            boolean r0 = r5 instanceof rf.w
            if (r0 == 0) goto L_0x004b
            rf.r$b r0 = rf.r.f22540b
            rf.w r5 = (rf.w) r5
            java.lang.Throwable r5 = r5.R
            java.lang.Object r5 = r0.a(r5)
            goto L_0x0051
        L_0x004b:
            rf.r$b r0 = rf.r.f22540b
            java.lang.Object r5 = r0.c(r5)
        L_0x0051:
            return r5
        L_0x0052:
            r0.T = r3
            java.lang.Object r5 = r4.o0(r3, r0)
            if (r5 != r1) goto L_0x005b
            return r1
        L_0x005b:
            rf.r r5 = (rf.r) r5
            java.lang.Object r5 = r5.o()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.a.v(ie.d):java.lang.Object");
    }

    @fh.g
    public final Object z() {
        Object m02 = m0();
        return m02 == b.f22525f ? r.f22540b.b() : m02 instanceof w ? r.f22540b.a(((w) m02).R) : r.f22540b.c(m02);
    }
}
