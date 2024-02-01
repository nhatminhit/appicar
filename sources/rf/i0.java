package rf;

import fh.g;
import fh.h;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import le.f;
import le.o;
import pf.c2;
import pf.i2;
import we.p;
import wf.q0;
import zd.b1;
import zd.e1;
import zd.k;
import zd.m;
import zd.u2;
import zf.d;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦\u0002J\u001a\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH&J\b\u0010\u0010\u001a\u00020\u000eH\u0017J\u0014\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0011H'J\u0011\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\u0014\u0010\bJ\u0015\u0010\u0015\u001a\u0004\u0018\u00018\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00128&X§\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00128&X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR#\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u001d8&X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\"\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001d8VX\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0019\u001a\u0004\b#\u0010\u001f\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lrf/i0;", "E", "", "D", "(Lie/d;)Ljava/lang/Object;", "Lrf/r;", "v", "z", "()Ljava/lang/Object;", "Lrf/p;", "iterator", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lzd/u2;", "h", "cancel", "", "", "f", "poll", "J", "b", "()Z", "isClosedForReceive$annotations", "()V", "isClosedForReceive", "isEmpty", "isEmpty$annotations", "Lzf/d;", "d", "()Lzf/d;", "onReceive", "j", "onReceiveCatching", "s", "getOnReceiveOrNull$annotations", "onReceiveOrNull", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface i0<E> {

    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001JL\u0010\n\u001a\u00020\t\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032$\u0010\b\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0017ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"rf/i0$a$a", "Lzf/d;", "R", "Lzf/f;", "select", "Lkotlin/Function2;", "Lie/d;", "", "block", "Lzd/u2;", "y", "(Lzf/f;Lwe/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        /* renamed from: rf.i0$a$a  reason: collision with other inner class name */
        public static final class C0408a implements d<E> {
            public final /* synthetic */ i0<E> O;

            @f(c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1", f = "Channel.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, d2 = {"R", "E", "Lrf/r;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            /* renamed from: rf.i0$a$a$a  reason: collision with other inner class name */
            public static final class C0409a extends o implements p<r<? extends E>, ie.d<? super R>, Object> {
                public int S;
                public /* synthetic */ Object T;
                public final /* synthetic */ p<E, ie.d<? super R>, Object> U;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0409a(p<? super E, ? super ie.d<? super R>, ? extends Object> pVar, ie.d<? super C0409a> dVar) {
                    super(2, dVar);
                    this.U = pVar;
                }

                @g
                public final ie.d<u2> H(@h Object obj, @g ie.d<?> dVar) {
                    C0409a aVar = new C0409a(this.U, dVar);
                    aVar.T = obj;
                    return aVar;
                }

                @h
                public final Object K(@g Object obj) {
                    Object h10 = ke.d.h();
                    int i10 = this.S;
                    if (i10 == 0) {
                        e1.n(obj);
                        Object o10 = ((r) this.T).o();
                        Throwable f10 = r.f(o10);
                        if (f10 == null) {
                            p<E, ie.d<? super R>, Object> pVar = this.U;
                            Object h11 = r.h(o10);
                            this.S = 1;
                            obj = pVar.g0(h11, this);
                            if (obj == h10) {
                                return h10;
                            }
                        } else {
                            throw f10;
                        }
                    } else if (i10 == 1) {
                        e1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return obj;
                }

                @h
                public final Object P(@g Object obj, @h ie.d<? super R> dVar) {
                    return ((C0409a) H(r.b(obj), dVar)).K(u2.f25116a);
                }

                public /* bridge */ /* synthetic */ Object g0(Object obj, Object obj2) {
                    return P(((r) obj).o(), (ie.d) obj2);
                }
            }

            public C0408a(i0<? extends E> i0Var) {
                this.O = i0Var;
            }

            @i2
            public <R> void y(@g zf.f<? super R> fVar, @g p<? super E, ? super ie.d<? super R>, ? extends Object> pVar) {
                this.O.j().y(fVar, new C0409a(pVar, (ie.d<? super C0409a>) null));
            }
        }

        @f(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {354}, m = "receiveOrNull", n = {}, s = {})
        @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class b<E> extends le.d {
            public /* synthetic */ Object R;
            public int S;

            public b(ie.d<? super b> dVar) {
                super(dVar);
            }

            @h
            public final Object K(@g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return a.i((i0) null, this);
            }
        }

        public static /* synthetic */ void b(i0 i0Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    cancellationException = null;
                }
                i0Var.h(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ boolean c(i0 i0Var, Throwable th2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th2 = null;
                }
                return i0Var.f(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        @g
        public static <E> d<E> d(@g i0<? extends E> i0Var) {
            return new C0408a(i0Var);
        }

        @k(level = m.P, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @b1(expression = "onReceiveCatching", imports = {}))
        public static /* synthetic */ void e() {
        }

        @c2
        public static /* synthetic */ void f() {
        }

        @c2
        public static /* synthetic */ void g() {
        }

        @h
        @k(level = m.P, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E h(@g i0<? extends E> i0Var) {
            Object z10 = i0Var.z();
            if (r.m(z10)) {
                return r.i(z10);
            }
            Throwable f10 = r.f(z10);
            if (f10 == null) {
                return null;
            }
            throw q0.p(f10);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        @oe.h
        @zd.k(level = zd.m.P, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @zd.b1(expression = "receiveCatching().getOrNull()", imports = {}))
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <E> java.lang.Object i(@fh.g rf.i0<? extends E> r4, @fh.g ie.d<? super E> r5) {
            /*
                boolean r0 = r5 instanceof rf.i0.a.b
                if (r0 == 0) goto L_0x0013
                r0 = r5
                rf.i0$a$b r0 = (rf.i0.a.b) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                rf.i0$a$b r0 = new rf.i0$a$b
                r0.<init>(r5)
            L_0x0018:
                java.lang.Object r5 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                zd.e1.n(r5)
                rf.r r5 = (rf.r) r5
                java.lang.Object r4 = r5.o()
                goto L_0x0043
            L_0x002f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L_0x0037:
                zd.e1.n(r5)
                r0.S = r3
                java.lang.Object r4 = r4.v(r0)
                if (r4 != r1) goto L_0x0043
                return r1
            L_0x0043:
                java.lang.Object r4 = rf.r.h(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: rf.i0.a.i(rf.i0, ie.d):java.lang.Object");
        }
    }

    @h
    Object D(@g ie.d<? super E> dVar);

    @h
    @oe.h
    @k(level = m.P, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    Object J(@g ie.d<? super E> dVar);

    boolean b();

    @k(level = m.Q, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    @g
    d<E> d();

    @k(level = m.Q, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean f(Throwable th2);

    void h(@h CancellationException cancellationException);

    boolean isEmpty();

    @g
    p<E> iterator();

    @g
    d<r<E>> j();

    @h
    @k(level = m.P, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
    E poll();

    @g
    d<E> s();

    @h
    Object v(@g ie.d<? super r<? extends E>> dVar);

    @g
    Object z();
}
