package rf;

import fh.g;
import fh.h;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import pf.p1;
import pf.s;
import pf.t;
import pf.z0;
import rf.m0;
import rf.r;
import we.l;
import we.p;
import wf.d1;
import wf.i0;
import wf.q;
import wf.q0;
import wf.r0;
import wf.w;
import wf.x;
import wf.y;
import wf.z;
import xe.l0;
import xe.u1;
import zd.d1;
import zd.e1;
import zd.f1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004ghijB)\u0012 \u0010K\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u000109j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`I¢\u0006\u0004\bf\u0010=J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u001c\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010\b\u001a\u00028\u00002(\u0010\u001b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0014¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0004¢\u0006\u0004\b&\u0010'J\u001d\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010(2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0016\u0010)J#\u0010,\u001a\u000e\u0012\u0002\b\u00030*j\u0006\u0012\u0002\b\u0003`+2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b,\u0010-J\u001b\u0010.\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b.\u0010\rJ\u0017\u00100\u001a\u00020/2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00101J$\u00103\u001a\b\u0012\u0004\u0012\u00020\u000b022\u0006\u0010\b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b3\u0010\"J\u0019\u00105\u001a\u0004\u0018\u00010\u001a2\u0006\u00104\u001a\u00020%H\u0014¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020/2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b7\u00108J)\u0010<\u001a\u00020\u000b2\u0018\u0010;\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u000b09j\u0002`:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020>H\u0014¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010(H\u0014¢\u0006\u0004\bA\u0010BJ\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000C2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HR.\u0010K\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u000109j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`I8\u0004X\u0004¢\u0006\u0006\n\u0004\b#\u0010JR\u001a\u0010P\u001a\u00020L8\u0004X\u0004¢\u0006\f\n\u0004\b?\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020/8BX\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020F8BX\u0004¢\u0006\u0006\u001a\u0004\bT\u0010HR\u0014\u0010W\u001a\u00020/8$X¤\u0004¢\u0006\u0006\u001a\u0004\bV\u0010RR\u0014\u0010Y\u001a\u00020/8$X¤\u0004¢\u0006\u0006\u001a\u0004\bX\u0010RR\u001a\u0010\\\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u001a\u0010^\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0004¢\u0006\u0006\u001a\u0004\b]\u0010[R\u0011\u0010`\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b_\u0010RR#\u0010c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020a8F¢\u0006\u0006\u001a\u0004\b\u0001\u0010bR\u0014\u0010e\u001a\u00020F8TX\u0004¢\u0006\u0006\u001a\u0004\bd\u0010H\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006k"}, d2 = {"Lrf/c;", "E", "Lrf/m0;", "Lrf/w;", "closed", "", "y", "(Lrf/w;)Ljava/lang/Throwable;", "element", "x", "(Ljava/lang/Object;Lrf/w;)Ljava/lang/Throwable;", "Lzd/u2;", "S", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "Lie/d;", "A", "(Lie/d;Ljava/lang/Object;Lrf/w;)V", "cause", "B", "(Ljava/lang/Throwable;)V", "w", "(Lrf/w;)V", "R", "Lzf/f;", "select", "Lkotlin/Function2;", "", "block", "Q", "(Lzf/f;Ljava/lang/Object;Lwe/p;)V", "", "k", "()I", "N", "(Ljava/lang/Object;)Ljava/lang/Object;", "O", "(Ljava/lang/Object;Lzf/f;)Ljava/lang/Object;", "Lrf/l0;", "U", "()Lrf/l0;", "Lrf/j0;", "(Ljava/lang/Object;)Lrf/j0;", "Lwf/y$b;", "Lkotlinx/coroutines/internal/AddLastDesc;", "l", "(Ljava/lang/Object;)Lwf/y$b;", "C", "", "offer", "(Ljava/lang/Object;)Z", "Lrf/r;", "K", "send", "o", "(Lrf/l0;)Ljava/lang/Object;", "G", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "n", "(Lwe/l;)V", "Lwf/y;", "P", "(Lwf/y;)V", "T", "()Lrf/j0;", "Lrf/c$d;", "m", "(Ljava/lang/Object;)Lrf/c$d;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "Lwe/l;", "onUndeliveredElement", "Lwf/w;", "Lwf/w;", "t", "()Lwf/w;", "queue", "M", "()Z", "isFullImpl", "u", "queueDebugStateString", "F", "isBufferAlwaysFull", "H", "isBufferFull", "r", "()Lrf/w;", "closedForSend", "q", "closedForReceive", "L", "isClosedForSend", "Lzf/e;", "()Lzf/e;", "onSend", "p", "bufferDebugString", "<init>", "a", "b", "c", "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class c<E> implements m0<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Q = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");
    @ve.e
    @h
    public final l<E, u2> O;
    @g
    public final w P = new w();
    @g
    private volatile /* synthetic */ Object onCloseHandler = null;

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00028\u00018\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lrf/c$a;", "E", "Lrf/l0;", "Lwf/y$d;", "otherOp", "Lwf/r0;", "a1", "Lzd/u2;", "X0", "Lrf/w;", "closed", "Z0", "", "toString", "R", "Ljava/lang/Object;", "element", "", "Y0", "()Ljava/lang/Object;", "pollResult", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<E> extends l0 {
        @ve.e
        public final E R;

        public a(E e10) {
            this.R = e10;
        }

        public void X0() {
        }

        @h
        public Object Y0() {
            return this.R;
        }

        public void Z0(@g w<?> wVar) {
        }

        @h
        public r0 a1(@h y.d dVar) {
            r0 r0Var = s.f22024d;
            if (dVar != null) {
                dVar.d();
            }
            return r0Var;
        }

        @g
        public String toString() {
            return "SendBuffered@" + z0.b(this) + '(' + this.R + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¨\u0006\u000e"}, d2 = {"Lrf/c$b;", "E", "Lwf/y$b;", "Lrf/c$a;", "Lkotlinx/coroutines/internal/AddLastDesc;", "Lwf/y;", "affected", "", "e", "Lwf/w;", "queue", "element", "<init>", "(Lwf/w;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static class b<E> extends y.b<a<? extends E>> {
        public b(@g w wVar, E e10) {
            super(wVar, new a(e10));
        }

        @h
        public Object e(@g y yVar) {
            if (yVar instanceof w) {
                return yVar;
            }
            if (yVar instanceof j0) {
                return b.f22524e;
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u00032\u00020\u0004BX\u0012\u0006\u0010\u0015\u001a\u00028\u0001\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00020\u001a\u0012(\u0010$\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001eø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0015\u001a\u00028\u00018\u0016X\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00020\u001a8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR9\u0010$\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001e8\u0006X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\"\u0010#\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lrf/c$c;", "E", "R", "Lrf/l0;", "Lpf/p1;", "Lwf/y$d;", "otherOp", "Lwf/r0;", "a1", "Lzd/u2;", "X0", "P", "Lrf/w;", "closed", "Z0", "b1", "", "toString", "Ljava/lang/Object;", "Y0", "()Ljava/lang/Object;", "pollResult", "Lrf/c;", "S", "Lrf/c;", "channel", "Lzf/f;", "T", "Lzf/f;", "select", "Lkotlin/Function2;", "Lrf/m0;", "Lie/d;", "", "U", "Lwe/p;", "block", "<init>", "(Ljava/lang/Object;Lrf/c;Lzf/f;Lwe/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: rf.c$c  reason: collision with other inner class name */
    public static final class C0407c<E, R> extends l0 implements p1 {
        public final E R;
        @g
        @ve.e
        public final c<E> S;
        @g
        @ve.e
        public final zf.f<R> T;
        @g
        @ve.e
        public final p<m0<? super E>, ie.d<? super R>, Object> U;

        public C0407c(E e10, @g c<E> cVar, @g zf.f<? super R> fVar, @g p<? super m0<? super E>, ? super ie.d<? super R>, ? extends Object> pVar) {
            this.R = e10;
            this.S = cVar;
            this.T = fVar;
            this.U = pVar;
        }

        public void P() {
            if (Q0()) {
                b1();
            }
        }

        public void X0() {
            xf.a.f(this.U, this.S, this.T.Q(), (l) null, 4, (Object) null);
        }

        public E Y0() {
            return this.R;
        }

        public void Z0(@g w<?> wVar) {
            if (this.T.F()) {
                this.T.j0(wVar.f1());
            }
        }

        @h
        public r0 a1(@h y.d dVar) {
            return (r0) this.T.d(dVar);
        }

        public void b1() {
            l<E, u2> lVar = this.S.O;
            if (lVar != null) {
                i0.b(lVar, Y0(), this.T.Q().e());
            }
        }

        @g
        public String toString() {
            return "SendSelect@" + z0.b(this) + '(' + Y0() + ")[" + this.S + ", " + this.T + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\u000e\u001a\u00028\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016R\u0014\u0010\u000e\u001a\u00028\u00018\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0013"}, d2 = {"Lrf/c$d;", "E", "Lwf/y$e;", "Lrf/j0;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lwf/y;", "affected", "", "e", "Lwf/y$d;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "j", "Ljava/lang/Object;", "element", "Lwf/w;", "queue", "<init>", "(Ljava/lang/Object;Lwf/w;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d<E> extends y.e<j0<? super E>> {
        @ve.e

        /* renamed from: e  reason: collision with root package name */
        public final E f22528e;

        public d(E e10, @g w wVar) {
            super(wVar);
            this.f22528e = e10;
        }

        @h
        public Object e(@g y yVar) {
            if (yVar instanceof w) {
                return yVar;
            }
            if (!(yVar instanceof j0)) {
                return b.f22524e;
            }
            return null;
        }

        @h
        public Object j(@g y.d dVar) {
            r0 k10 = ((j0) dVar.f24137a).k(this.f22528e, dVar);
            if (k10 == null) {
                return z.f24144a;
            }
            Object obj = wf.c.f24083b;
            if (k10 == obj) {
                return obj;
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"wf/y$f", "Lwf/y$c;", "Lwf/y;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class e extends y.c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c f22529d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(y yVar, c cVar) {
            super(yVar);
            this.f22529d = cVar;
        }

        @h
        /* renamed from: k */
        public Object i(@g y yVar) {
            if (this.f22529d.H()) {
                return null;
            }
            return x.a();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JX\u0010\f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"rf/c$f", "Lzf/e;", "Lrf/m0;", "R", "Lzf/f;", "select", "param", "Lkotlin/Function2;", "Lie/d;", "", "block", "Lzd/u2;", "F", "(Lzf/f;Ljava/lang/Object;Lwe/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class f implements zf.e<E, m0<? super E>> {
        public final /* synthetic */ c<E> O;

        public f(c<E> cVar) {
            this.O = cVar;
        }

        public <R> void F(@g zf.f<? super R> fVar, E e10, @g p<? super m0<? super E>, ? super ie.d<? super R>, ? extends Object> pVar) {
            this.O.Q(fVar, e10, pVar);
        }
    }

    public c(@h l<? super E, u2> lVar) {
        this.O = lVar;
    }

    public final void A(ie.d<?> dVar, E e10, w<?> wVar) {
        Object a10;
        d1 d10;
        w(wVar);
        Throwable f12 = wVar.f1();
        l<E, u2> lVar = this.O;
        if (lVar == null || (d10 = i0.d(lVar, e10, (d1) null, 2, (Object) null)) == null) {
            d1.a aVar = zd.d1.P;
            a10 = e1.a(f12);
        } else {
            zd.p.a(d10, f12);
            d1.a aVar2 = zd.d1.P;
            a10 = e1.a(d10);
        }
        dVar.x(zd.d1.b(a10));
    }

    public final void B(Throwable th2) {
        r0 r0Var;
        Object obj = this.onCloseHandler;
        if (obj != null && obj != (r0Var = b.f22527h) && f1.a(Q, this, obj, r0Var)) {
            ((l) u1.q(obj, 1)).A(th2);
        }
    }

    @h
    public final Object C(E e10, @g ie.d<? super u2> dVar) {
        if (N(e10) == b.f22523d) {
            return u2.f25116a;
        }
        Object S = S(e10, dVar);
        return S == ke.d.h() ? S : u2.f25116a;
    }

    @g
    public final zf.e<E, m0<E>> E() {
        return new f(this);
    }

    public abstract boolean F();

    public boolean G(@h Throwable th2) {
        boolean z10;
        w wVar = new w(th2);
        w wVar2 = this.P;
        while (true) {
            y K0 = wVar2.K0();
            z10 = true;
            if (!(K0 instanceof w)) {
                if (K0.B0(wVar, wVar2)) {
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            wVar = (w) this.P.K0();
        }
        w(wVar);
        if (z10) {
            B(th2);
        }
        return z10;
    }

    public abstract boolean H();

    @g
    public final Object K(E e10) {
        w<?> wVar;
        r.b bVar;
        Object N = N(e10);
        if (N == b.f22523d) {
            return r.f22540b.c(u2.f25116a);
        }
        if (N == b.f22524e) {
            wVar = r();
            if (wVar == null) {
                return r.f22540b.b();
            }
            bVar = r.f22540b;
        } else if (N instanceof w) {
            bVar = r.f22540b;
            wVar = (w) N;
        } else {
            throw new IllegalStateException(("trySend returned " + N).toString());
        }
        return bVar.a(y(wVar));
    }

    public final boolean L() {
        return r() != null;
    }

    public final boolean M() {
        return !(this.P.J0() instanceof j0) && H();
    }

    @g
    public Object N(E e10) {
        j0 T;
        do {
            T = T();
            if (T == null) {
                return b.f22524e;
            }
        } while (T.k(e10, (y.d) null) == null);
        T.f0(e10);
        return T.w();
    }

    @g
    public Object O(E e10, @g zf.f<?> fVar) {
        d m10 = m(e10);
        Object q02 = fVar.q0(m10);
        if (q02 != null) {
            return q02;
        }
        j0 j0Var = (j0) m10.o();
        j0Var.f0(e10);
        return j0Var.w();
    }

    public void P(@g y yVar) {
    }

    public final <R> void Q(zf.f<? super R> fVar, E e10, p<? super m0<? super E>, ? super ie.d<? super R>, ? extends Object> pVar) {
        while (!fVar.N()) {
            if (M()) {
                C0407c cVar = new C0407c(e10, this, fVar, pVar);
                Object o10 = o(cVar);
                if (o10 == null) {
                    fVar.H(cVar);
                    return;
                } else if (o10 instanceof w) {
                    throw q0.p(x(e10, (w) o10));
                } else if (o10 != b.f22526g && !(o10 instanceof h0)) {
                    throw new IllegalStateException(("enqueueSend returned " + o10 + p7.f.f11698i).toString());
                }
            }
            Object O2 = O(e10, fVar);
            if (O2 != zf.g.d()) {
                if (O2 != b.f22524e && O2 != wf.c.f24083b) {
                    if (O2 == b.f22523d) {
                        xf.b.d(pVar, this, fVar.Q());
                        return;
                    } else if (O2 instanceof w) {
                        throw q0.p(x(e10, (w) O2));
                    } else {
                        throw new IllegalStateException(("offerSelectInternal returned " + O2).toString());
                    }
                }
            } else {
                return;
            }
        }
    }

    @h
    public final j0<?> R(E e10) {
        y K0;
        w wVar = this.P;
        a aVar = new a(e10);
        do {
            K0 = wVar.K0();
            if (K0 instanceof j0) {
                return (j0) K0;
            }
        } while (!K0.B0(aVar, wVar));
        return null;
    }

    public final Object S(E e10, ie.d<? super u2> dVar) {
        pf.r<? super u2> b10 = t.b(ke.c.d(dVar));
        while (true) {
            if (M()) {
                l0 n0Var = this.O == null ? new n0(e10, b10) : new o0(e10, b10, this.O);
                Object o10 = o(n0Var);
                if (o10 == null) {
                    t.c(b10, n0Var);
                    break;
                } else if (o10 instanceof w) {
                    A(b10, e10, (w) o10);
                    break;
                } else if (o10 != b.f22526g && !(o10 instanceof h0)) {
                    throw new IllegalStateException(("enqueueSend returned " + o10).toString());
                }
            }
            Object N = N(e10);
            if (N == b.f22523d) {
                d1.a aVar = zd.d1.P;
                b10.x(zd.d1.b(u2.f25116a));
                break;
            } else if (N != b.f22524e) {
                if (N instanceof w) {
                    A(b10, e10, (w) N);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + N).toString());
                }
            }
        }
        Object z10 = b10.z();
        if (z10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return z10 == ke.d.h() ? z10 : u2.f25116a;
    }

    @h
    public j0<E> T() {
        y yVar;
        y T0;
        w wVar = this.P;
        while (true) {
            yVar = (y) wVar.I0();
            if (yVar != wVar && (yVar instanceof j0)) {
                if (((((j0) yVar) instanceof w) && !yVar.N0()) || (T0 = yVar.T0()) == null) {
                    break;
                }
                T0.M0();
            }
        }
        yVar = null;
        return (j0) yVar;
    }

    @h
    public final l0 U() {
        y yVar;
        y T0;
        w wVar = this.P;
        while (true) {
            yVar = (y) wVar.I0();
            if (yVar != wVar && (yVar instanceof l0)) {
                if (((((l0) yVar) instanceof w) && !yVar.N0()) || (T0 = yVar.T0()) == null) {
                    break;
                }
                T0.M0();
            }
        }
        yVar = null;
        return (l0) yVar;
    }

    public final int k() {
        w wVar = this.P;
        int i10 = 0;
        for (y yVar = (y) wVar.I0(); !l0.g(yVar, wVar); yVar = yVar.J0()) {
            if (yVar instanceof y) {
                i10++;
            }
        }
        return i10;
    }

    @g
    public final y.b<?> l(E e10) {
        return new b(this.P, e10);
    }

    @g
    public final d<E> m(E e10) {
        return new d<>(e10, this.P);
    }

    public void n(@g l<? super Throwable, u2> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Q;
        if (!f1.a(atomicReferenceFieldUpdater, this, (Object) null, lVar)) {
            Object obj = this.onCloseHandler;
            if (obj == b.f22527h) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException("Another handler was already registered: " + obj);
        }
        w<?> r10 = r();
        if (r10 != null && f1.a(atomicReferenceFieldUpdater, this, lVar, b.f22527h)) {
            lVar.A(r10.R);
        }
    }

    @h
    public Object o(@g l0 l0Var) {
        boolean z10;
        y K0;
        if (F()) {
            w wVar = this.P;
            do {
                K0 = wVar.K0();
                if (K0 instanceof j0) {
                    return K0;
                }
            } while (!K0.B0(l0Var, wVar));
            return null;
        }
        w wVar2 = this.P;
        e eVar = new e(l0Var, this);
        while (true) {
            y K02 = wVar2.K0();
            if (!(K02 instanceof j0)) {
                int V0 = K02.V0(l0Var, wVar2, eVar);
                z10 = true;
                if (V0 != 1) {
                    if (V0 == 2) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return K02;
            }
        }
        if (!z10) {
            return b.f22526g;
        }
        return null;
    }

    public boolean offer(E e10) {
        wf.d1 d10;
        try {
            return m0.a.c(this, e10);
        } catch (Throwable th2) {
            l<E, u2> lVar = this.O;
            if (lVar == null || (d10 = i0.d(lVar, e10, (wf.d1) null, 2, (Object) null)) == null) {
                throw th2;
            }
            zd.p.a(d10, th2);
            throw d10;
        }
    }

    @g
    public String p() {
        return "";
    }

    @h
    public final w<?> q() {
        y J0 = this.P.J0();
        w<?> wVar = J0 instanceof w ? (w) J0 : null;
        if (wVar == null) {
            return null;
        }
        w(wVar);
        return wVar;
    }

    @h
    public final w<?> r() {
        y K0 = this.P.K0();
        w<?> wVar = K0 instanceof w ? (w) K0 : null;
        if (wVar == null) {
            return null;
        }
        w(wVar);
        return wVar;
    }

    @g
    public final w t() {
        return this.P;
    }

    @g
    public String toString() {
        return z0.a(this) + '@' + z0.b(this) + '{' + u() + '}' + p();
    }

    public final String u() {
        String str;
        y J0 = this.P.J0();
        if (J0 == this.P) {
            return "EmptyQueue";
        }
        if (J0 instanceof w) {
            str = J0.toString();
        } else if (J0 instanceof h0) {
            str = "ReceiveQueued";
        } else if (J0 instanceof l0) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + J0;
        }
        y K0 = this.P.K0();
        if (K0 == J0) {
            return str;
        }
        String str2 = str + ",queueSize=" + k();
        if (!(K0 instanceof w)) {
            return str2;
        }
        return str2 + ",closedForSend=" + K0;
    }

    public final void w(w<?> wVar) {
        Object c10 = q.c((Object) null, 1, (xe.w) null);
        while (true) {
            y K0 = wVar.K0();
            h0 h0Var = K0 instanceof h0 ? (h0) K0 : null;
            if (h0Var == null) {
                break;
            } else if (!h0Var.Q0()) {
                h0Var.L0();
            } else {
                c10 = q.h(c10, h0Var);
            }
        }
        if (c10 != null) {
            if (!(c10 instanceof ArrayList)) {
                ((h0) c10).Z0(wVar);
            } else {
                ArrayList arrayList = (ArrayList) c10;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((h0) arrayList.get(size)).Z0(wVar);
                }
            }
        }
        P(wVar);
    }

    public final Throwable x(E e10, w<?> wVar) {
        wf.d1 d10;
        w(wVar);
        l<E, u2> lVar = this.O;
        if (lVar == null || (d10 = i0.d(lVar, e10, (wf.d1) null, 2, (Object) null)) == null) {
            return wVar.f1();
        }
        zd.p.a(d10, wVar.f1());
        throw d10;
    }

    public final Throwable y(w<?> wVar) {
        w(wVar);
        return wVar.f1();
    }
}
