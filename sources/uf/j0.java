package uf;

import be.w;
import fh.g;
import fh.h;
import ie.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import le.f;
import pf.p1;
import pf.t;
import rf.m;
import ve.e;
import vf.r;
import wf.r0;
import xe.l0;
import zd.d1;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\n\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u00014B\u001f\u0012\u0006\u0010J\u001a\u00020\u0016\u0012\u0006\u0010K\u001a\u00020\u0016\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bf\u0010gJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J9\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00142\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J(\u0010$\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\b\u0010%\u001a\u00020\fH\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010)\u001a\u00020\u000eH\u0002J\u001b\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J3\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0014\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u0014H\u0002¢\u0006\u0004\b/\u00100J!\u00104\u001a\u0002032\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H@ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b6\u0010\nJ\u001b\u00107\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b7\u0010\u001cJ\u000f\u00108\u001a\u00020\u000eH\u0000¢\u0006\u0004\b8\u00109J%\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0006\u0010:\u001a\u00020\u000eH\u0000¢\u0006\u0004\b;\u0010<J\b\u0010=\u001a\u00020\u0003H\u0014J\u001f\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00142\u0006\u0010>\u001a\u00020\u0016H\u0014¢\u0006\u0004\b?\u0010@J\b\u0010A\u001a\u00020\fH\u0016J&\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000G2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u00162\u0006\u0010F\u001a\u00020EH\u0016R\u0014\u0010J\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0010R\u0014\u0010K\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0010R\u0014\u0010F\u001a\u00020E8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010LR \u0010O\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010=R\u0016\u0010S\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010=R\u0016\u0010T\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u0016\u0010U\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010W\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\bV\u00109R\u0014\u0010Y\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\bP\u0010XR\u0014\u0010Z\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010XR\u0014\u0010\\\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b[\u00109R\u0014\u0010]\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\bM\u00109R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000^8VX\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u001a\u0010e\u001a\u00028\u00008DX\u0004¢\u0006\f\u0012\u0004\bc\u0010d\u001a\u0004\bI\u0010b\u0002\u0004\n\u0002\b\u0019¨\u0006h"}, d2 = {"Luf/j0;", "T", "Lvf/b;", "Luf/l0;", "Luf/d0;", "Luf/c;", "Lvf/r;", "value", "", "Z", "(Ljava/lang/Object;)Z", "a0", "Lzd/u2;", "L", "", "newHead", "I", "", "item", "O", "", "curBuffer", "", "curSize", "newSize", "Y", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "N", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "Luf/j0$a;", "emitter", "E", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "d0", "G", "slot", "c0", "b0", "index", "U", "D", "(Luf/l0;Lie/d;)Ljava/lang/Object;", "Lie/d;", "resumesIn", "P", "([Lie/d;)[Lie/d;", "Luf/j;", "collector", "", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "w", "d", "f0", "()J", "oldIndex", "e0", "(J)[Lie/d;", "J", "size", "K", "(I)[Luf/l0;", "k", "Lie/g;", "context", "capacity", "Lrf/m;", "onBufferOverflow", "Luf/i;", "c", "S", "replay", "bufferCapacity", "Lrf/m;", "V", "[Ljava/lang/Object;", "buffer", "W", "replayIndex", "X", "minCollectorIndex", "bufferSize", "queueSize", "R", "head", "()I", "replaySize", "totalSize", "Q", "bufferEndIndex", "queueEndIndex", "", "b", "()Ljava/util/List;", "replayCache", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "()V", "lastReplayedLocked", "<init>", "(IILrf/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class j0<T> extends vf.b<l0> implements d0<T>, c<T>, r<T> {
    public final int S;
    public final int T;
    @g
    public final m U;
    @h
    public Object[] V;
    public long W;
    public long X;
    public int Y;
    public int Z;

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Luf/j0$a;", "Lpf/p1;", "Lzd/u2;", "P", "Luf/j0;", "O", "Luf/j0;", "flow", "", "J", "index", "", "Q", "Ljava/lang/Object;", "value", "Lie/d;", "R", "Lie/d;", "cont", "<init>", "(Luf/j0;JLjava/lang/Object;Lie/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a implements p1 {
        @g
        @e
        public final j0<?> O;
        @e
        public long P;
        @e
        @h
        public final Object Q;
        @g
        @e
        public final d<u2> R;

        public a(@g j0<?> j0Var, long j10, @h Object obj, @g d<? super u2> dVar) {
            this.O = j0Var;
            this.P = j10;
            this.Q = obj;
            this.R = dVar;
        }

        public void P() {
            this.O.E(this);
        }
    }

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23349a;

        static {
            int[] iArr = new int[m.values().length];
            iArr[m.SUSPEND.ordinal()] = 1;
            iArr[m.DROP_LATEST.ordinal()] = 2;
            iArr[m.DROP_OLDEST.ordinal()] = 3;
            f23349a = iArr;
        }
    }

    @f(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {373, 380, 383}, m = "collect$suspendImpl", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class c extends le.d {
        public Object R;
        public Object S;
        public Object T;
        public Object U;
        public /* synthetic */ Object V;
        public final /* synthetic */ j0<T> W;
        public int X;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(j0<T> j0Var, d<? super c> dVar) {
            super(dVar);
            this.W = j0Var;
        }

        @h
        public final Object K(@g Object obj) {
            this.V = obj;
            this.X |= Integer.MIN_VALUE;
            return j0.H(this.W, (j) null, this);
        }
    }

    public j0(int i10, int i11, @g m mVar) {
        this.S = i10;
        this.T = i11;
        this.U = mVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: uf.l0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab A[Catch:{ all -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc A[Catch:{ all -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object H(uf.j0 r8, uf.j r9, ie.d r10) {
        /*
            boolean r0 = r10 instanceof uf.j0.c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            uf.j0$c r0 = (uf.j0.c) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x0018
        L_0x0013:
            uf.j0$c r0 = new uf.j0$c
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.V
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.X
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0075
            if (r2 == r5) goto L_0x005e
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r8 = r0.U
            pf.n2 r8 = (pf.n2) r8
            java.lang.Object r9 = r0.T
            uf.l0 r9 = (uf.l0) r9
            java.lang.Object r2 = r0.S
            uf.j r2 = (uf.j) r2
            java.lang.Object r5 = r0.R
            uf.j0 r5 = (uf.j0) r5
            goto L_0x0054
        L_0x003c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0044:
            java.lang.Object r8 = r0.U
            pf.n2 r8 = (pf.n2) r8
            java.lang.Object r9 = r0.T
            uf.l0 r9 = (uf.l0) r9
            java.lang.Object r2 = r0.S
            uf.j r2 = (uf.j) r2
            java.lang.Object r5 = r0.R
            uf.j0 r5 = (uf.j0) r5
        L_0x0054:
            zd.e1.n(r10)     // Catch:{ all -> 0x005b }
            r10 = r2
            r2 = r8
            r8 = r5
            goto L_0x00a3
        L_0x005b:
            r8 = move-exception
            goto L_0x00da
        L_0x005e:
            java.lang.Object r8 = r0.T
            r9 = r8
            uf.l0 r9 = (uf.l0) r9
            java.lang.Object r8 = r0.S
            uf.j r8 = (uf.j) r8
            java.lang.Object r2 = r0.R
            uf.j0 r2 = (uf.j0) r2
            zd.e1.n(r10)     // Catch:{ all -> 0x0071 }
            r10 = r8
            r8 = r2
            goto L_0x0097
        L_0x0071:
            r8 = move-exception
            r5 = r2
            goto L_0x00da
        L_0x0075:
            zd.e1.n(r10)
            vf.d r10 = r8.g()
            uf.l0 r10 = (uf.l0) r10
            boolean r2 = r9 instanceof uf.x0     // Catch:{ all -> 0x00d6 }
            if (r2 == 0) goto L_0x0094
            r2 = r9
            uf.x0 r2 = (uf.x0) r2     // Catch:{ all -> 0x00d6 }
            r0.R = r8     // Catch:{ all -> 0x00d6 }
            r0.S = r9     // Catch:{ all -> 0x00d6 }
            r0.T = r10     // Catch:{ all -> 0x00d6 }
            r0.X = r5     // Catch:{ all -> 0x00d6 }
            java.lang.Object r2 = r2.a(r0)     // Catch:{ all -> 0x00d6 }
            if (r2 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0097:
            ie.g r2 = r0.e()     // Catch:{ all -> 0x00d2 }
            pf.n2$b r5 = pf.n2.D     // Catch:{ all -> 0x00d2 }
            ie.g$b r2 = r2.g(r5)     // Catch:{ all -> 0x00d2 }
            pf.n2 r2 = (pf.n2) r2     // Catch:{ all -> 0x00d2 }
        L_0x00a3:
            java.lang.Object r5 = r8.c0(r9)     // Catch:{ all -> 0x00d2 }
            wf.r0 r6 = uf.k0.f23351a     // Catch:{ all -> 0x00d2 }
            if (r5 != r6) goto L_0x00bc
            r0.R = r8     // Catch:{ all -> 0x00d2 }
            r0.S = r10     // Catch:{ all -> 0x00d2 }
            r0.T = r9     // Catch:{ all -> 0x00d2 }
            r0.U = r2     // Catch:{ all -> 0x00d2 }
            r0.X = r4     // Catch:{ all -> 0x00d2 }
            java.lang.Object r5 = r8.D(r9, r0)     // Catch:{ all -> 0x00d2 }
            if (r5 != r1) goto L_0x00a3
            return r1
        L_0x00bc:
            if (r2 == 0) goto L_0x00c1
            pf.r2.A(r2)     // Catch:{ all -> 0x00d2 }
        L_0x00c1:
            r0.R = r8     // Catch:{ all -> 0x00d2 }
            r0.S = r10     // Catch:{ all -> 0x00d2 }
            r0.T = r9     // Catch:{ all -> 0x00d2 }
            r0.U = r2     // Catch:{ all -> 0x00d2 }
            r0.X = r3     // Catch:{ all -> 0x00d2 }
            java.lang.Object r5 = r10.d(r5, r0)     // Catch:{ all -> 0x00d2 }
            if (r5 != r1) goto L_0x00a3
            return r1
        L_0x00d2:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto L_0x00da
        L_0x00d6:
            r9 = move-exception
            r5 = r8
            r8 = r9
            r9 = r10
        L_0x00da:
            r5.m(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.j0.H(uf.j0, uf.j, ie.d):java.lang.Object");
    }

    public static /* synthetic */ Object M(j0 j0Var, Object obj, d dVar) {
        if (j0Var.w(obj)) {
            return u2.f25116a;
        }
        Object N = j0Var.N(obj, dVar);
        return N == ke.d.h() ? N : u2.f25116a;
    }

    /* access modifiers changed from: private */
    public final long R() {
        return Math.min(this.X, this.W);
    }

    public static /* synthetic */ void T() {
    }

    public final Object D(l0 l0Var, d<? super u2> dVar) {
        u2 u2Var;
        pf.r rVar = new pf.r(ke.c.d(dVar), 1);
        rVar.Z();
        synchronized (this) {
            if (b0(l0Var) < 0) {
                l0Var.f23353b = rVar;
            } else {
                d1.a aVar = d1.P;
                rVar.x(d1.b(u2.f25116a));
            }
            u2Var = u2.f25116a;
        }
        Object z10 = rVar.z();
        if (z10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return z10 == ke.d.h() ? z10 : u2Var;
    }

    public final void E(a aVar) {
        synchronized (this) {
            if (aVar.P >= R()) {
                Object[] objArr = this.V;
                l0.m(objArr);
                if (k0.f(objArr, aVar.P) == aVar) {
                    k0.h(objArr, aVar.P, k0.f23351a);
                    G();
                    u2 u2Var = u2.f25116a;
                }
            }
        }
    }

    public final void G() {
        if (this.T != 0 || this.Z > 1) {
            Object[] objArr = this.V;
            l0.m(objArr);
            while (this.Z > 0 && k0.f(objArr, (R() + ((long) X())) - 1) == k0.f23351a) {
                this.Z--;
                k0.h(objArr, R() + ((long) X()), (Object) null);
            }
        }
    }

    public final void I(long j10) {
        vf.d[] f10;
        if (!(this.P == 0 || (f10 = this.O) == null)) {
            for (vf.d dVar : f10) {
                if (dVar != null) {
                    l0 l0Var = (l0) dVar;
                    long j11 = l0Var.f23352a;
                    if (j11 >= 0 && j11 < j10) {
                        l0Var.f23352a = j10;
                    }
                }
            }
        }
        this.X = j10;
    }

    @g
    /* renamed from: J */
    public l0 i() {
        return new l0();
    }

    @g
    /* renamed from: K */
    public l0[] j(int i10) {
        return new l0[i10];
    }

    public final void L() {
        Object[] objArr = this.V;
        l0.m(objArr);
        k0.h(objArr, R(), (Object) null);
        this.Y--;
        long R = R() + 1;
        if (this.W < R) {
            this.W = R;
        }
        if (this.X < R) {
            I(R);
        }
    }

    public final Object N(T t10, d<? super u2> dVar) {
        d<u2>[] dVarArr;
        a aVar;
        pf.r rVar = new pf.r(ke.c.d(dVar), 1);
        rVar.Z();
        d<u2>[] dVarArr2 = vf.c.f23627a;
        synchronized (this) {
            if (Z(t10)) {
                d1.a aVar2 = d1.P;
                rVar.x(d1.b(u2.f25116a));
                dVarArr = P(dVarArr2);
                aVar = null;
            } else {
                a aVar3 = new a(this, ((long) X()) + R(), t10, rVar);
                O(aVar3);
                this.Z = this.Z + 1;
                if (this.T == 0) {
                    dVarArr2 = P(dVarArr2);
                }
                dVarArr = dVarArr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            t.a(rVar, aVar);
        }
        for (d<u2> dVar2 : dVarArr) {
            if (dVar2 != null) {
                d1.a aVar4 = d1.P;
                dVar2.x(d1.b(u2.f25116a));
            }
        }
        Object z10 = rVar.z();
        if (z10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return z10 == ke.d.h() ? z10 : u2.f25116a;
    }

    public final void O(Object obj) {
        int X2 = X();
        Object[] objArr = this.V;
        if (objArr == null) {
            objArr = Y((Object[]) null, 0, 2);
        } else if (X2 >= objArr.length) {
            objArr = Y(objArr, X2, objArr.length * 2);
        }
        k0.h(objArr, R() + ((long) X2), obj);
    }

    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r4 = (uf.l0) r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ie.d<zd.u2>[] P(ie.d<zd.u2>[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.P
            if (r1 == 0) goto L_0x0047
            vf.d[] r1 = r10.O
            if (r1 == 0) goto L_0x0047
            r2 = 0
            int r3 = r1.length
        L_0x000f:
            if (r2 >= r3) goto L_0x0047
            r4 = r1[r2]
            if (r4 == 0) goto L_0x0044
            uf.l0 r4 = (uf.l0) r4
            ie.d<? super zd.u2> r5 = r4.f23353b
            if (r5 != 0) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            long r6 = r10.b0(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0044
            int r6 = r11.length
            if (r0 < r6) goto L_0x0039
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            xe.l0.o(r11, r6)
        L_0x0039:
            r6 = r11
            ie.d[] r6 = (ie.d[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f23353b = r0
            r0 = r7
        L_0x0044:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x0047:
            ie.d[] r11 = (ie.d[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.j0.P(ie.d[]):ie.d[]");
    }

    public final long Q() {
        return R() + ((long) this.Y);
    }

    public final T S() {
        Object[] objArr = this.V;
        l0.m(objArr);
        return k0.f(objArr, (this.W + ((long) W())) - 1);
    }

    public final Object U(long j10) {
        Object[] objArr = this.V;
        l0.m(objArr);
        Object c10 = k0.f(objArr, j10);
        return c10 instanceof a ? ((a) c10).Q : c10;
    }

    public final long V() {
        return R() + ((long) this.Y) + ((long) this.Z);
    }

    public final int W() {
        return (int) ((R() + ((long) this.Y)) - this.W);
    }

    public final int X() {
        return this.Y + this.Z;
    }

    public final Object[] Y(Object[] objArr, int i10, int i11) {
        if (i11 > 0) {
            Object[] objArr2 = new Object[i11];
            this.V = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long R = R();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = ((long) i12) + R;
                k0.h(objArr2, j10, k0.f(objArr, j10));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean Z(T t10) {
        if (n() == 0) {
            return a0(t10);
        }
        if (this.Y >= this.T && this.X <= this.W) {
            int i10 = b.f23349a[this.U.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
        }
        O(t10);
        int i11 = this.Y + 1;
        this.Y = i11;
        if (i11 > this.T) {
            L();
        }
        if (W() > this.S) {
            d0(this.W + 1, this.X, Q(), V());
        }
        return true;
    }

    @h
    public Object a(@g j<? super T> jVar, @g d<?> dVar) {
        return H(this, jVar, dVar);
    }

    public final boolean a0(T t10) {
        if (this.S == 0) {
            return true;
        }
        O(t10);
        int i10 = this.Y + 1;
        this.Y = i10;
        if (i10 > this.S) {
            L();
        }
        this.X = R() + ((long) this.Y);
        return true;
    }

    @g
    public List<T> b() {
        synchronized (this) {
            int W2 = W();
            if (W2 == 0) {
                List<T> E = w.E();
                return E;
            }
            ArrayList arrayList = new ArrayList(W2);
            Object[] objArr = this.V;
            l0.m(objArr);
            for (int i10 = 0; i10 < W2; i10++) {
                arrayList.add(k0.f(objArr, this.W + ((long) i10)));
            }
            return arrayList;
        }
    }

    public final long b0(l0 l0Var) {
        long j10 = l0Var.f23352a;
        if (j10 < Q()) {
            return j10;
        }
        if (this.T <= 0 && j10 <= R() && this.Z != 0) {
            return j10;
        }
        return -1;
    }

    @g
    public i<T> c(@g ie.g gVar, int i10, @g m mVar) {
        return k0.e(this, gVar, i10, mVar);
    }

    public final Object c0(l0 l0Var) {
        Object obj;
        d<u2>[] dVarArr = vf.c.f23627a;
        synchronized (this) {
            long b02 = b0(l0Var);
            if (b02 < 0) {
                obj = k0.f23351a;
            } else {
                long j10 = l0Var.f23352a;
                Object U2 = U(b02);
                l0Var.f23352a = b02 + 1;
                Object obj2 = U2;
                dVarArr = e0(j10);
                obj = obj2;
            }
        }
        for (d<u2> dVar : dVarArr) {
            if (dVar != null) {
                d1.a aVar = d1.P;
                dVar.x(d1.b(u2.f25116a));
            }
        }
        return obj;
    }

    @h
    public Object d(T t10, @g d<? super u2> dVar) {
        return M(this, t10, dVar);
    }

    public final void d0(long j10, long j11, long j12, long j13) {
        long min = Math.min(j11, j10);
        for (long R = R(); R < min; R++) {
            Object[] objArr = this.V;
            l0.m(objArr);
            k0.h(objArr, R, (Object) null);
        }
        this.W = j10;
        this.X = j11;
        this.Y = (int) (j12 - min);
        this.Z = (int) (j13 - j12);
    }

    @g
    public final d<u2>[] e0(long j10) {
        long j11;
        long j12;
        long j13;
        vf.d[] f10;
        if (j10 > this.X) {
            return vf.c.f23627a;
        }
        long R = R();
        long j14 = ((long) this.Y) + R;
        if (this.T == 0 && this.Z > 0) {
            j14++;
        }
        if (!(this.P == 0 || (f10 = this.O) == null)) {
            for (vf.d dVar : f10) {
                if (dVar != null) {
                    long j15 = ((l0) dVar).f23352a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.X) {
            return vf.c.f23627a;
        }
        long Q = Q();
        int min = n() > 0 ? Math.min(this.Z, this.T - ((int) (Q - j14))) : this.Z;
        d<u2>[] dVarArr = vf.c.f23627a;
        long j16 = ((long) this.Z) + Q;
        if (min > 0) {
            dVarArr = new d[min];
            Object[] objArr = this.V;
            l0.m(objArr);
            long j17 = Q;
            int i10 = 0;
            while (true) {
                if (Q >= j16) {
                    j12 = j14;
                    j11 = j16;
                    break;
                }
                Object c10 = k0.f(objArr, Q);
                j12 = j14;
                r0 r0Var = k0.f23351a;
                if (c10 == r0Var) {
                    j11 = j16;
                    j13 = 1;
                } else if (c10 != null) {
                    a aVar = (a) c10;
                    int i11 = i10 + 1;
                    j11 = j16;
                    dVarArr[i10] = aVar.R;
                    k0.h(objArr, Q, r0Var);
                    k0.h(objArr, j17, aVar.Q);
                    j13 = 1;
                    j17++;
                    if (i11 >= min) {
                        break;
                    }
                    i10 = i11;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                }
                Q += j13;
                j14 = j12;
                j16 = j11;
            }
            Q = j17;
        } else {
            j12 = j14;
            j11 = j16;
        }
        int i12 = (int) (Q - R);
        long j18 = n() == 0 ? Q : j12;
        long max = Math.max(this.W, Q - ((long) Math.min(this.S, i12)));
        if (this.T == 0 && max < j11) {
            Object[] objArr2 = this.V;
            l0.m(objArr2);
            if (l0.g(k0.f(objArr2, max), k0.f23351a)) {
                Q++;
                max++;
            }
        }
        d0(max, j18, Q, j11);
        G();
        return (dVarArr.length == 0) ^ true ? P(dVarArr) : dVarArr;
    }

    public final long f0() {
        long j10 = this.W;
        if (j10 < this.X) {
            this.X = j10;
        }
        return j10;
    }

    public void k() {
        synchronized (this) {
            d0(Q(), this.X, Q(), V());
            u2 u2Var = u2.f25116a;
        }
    }

    public boolean w(T t10) {
        int i10;
        boolean z10;
        d<u2>[] dVarArr = vf.c.f23627a;
        synchronized (this) {
            if (Z(t10)) {
                dVarArr = P(dVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (d<u2> dVar : dVarArr) {
            if (dVar != null) {
                d1.a aVar = d1.P;
                dVar.x(d1.b(u2.f25116a));
            }
        }
        return z10;
    }
}
