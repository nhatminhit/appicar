package be;

import fh.g;
import fh.h;
import ie.d;
import java.util.Iterator;
import java.util.List;
import le.f;
import le.k;
import p000if.m;
import p000if.o;
import p000if.q;
import we.p;
import xe.l0;
import zd.u2;

public final class o1 {

    @f(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    public static final class a extends k implements p<o<? super List<? extends T>>, d<? super u2>, Object> {
        public Object Q;
        public Object R;
        public int S;
        public int T;
        public /* synthetic */ Object U;
        public final /* synthetic */ int V;
        public final /* synthetic */ int W;
        public final /* synthetic */ Iterator<T> X;
        public final /* synthetic */ boolean Y;
        public final /* synthetic */ boolean Z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, Iterator<? extends T> it, boolean z10, boolean z11, d<? super a> dVar) {
            super(2, dVar);
            this.V = i10;
            this.W = i11;
            this.X = it;
            this.Y = z10;
            this.Z = z11;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            a aVar = new a(this.V, this.W, this.X, this.Y, this.Z, dVar);
            aVar.U = obj;
            return aVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0129  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0133  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0125 A[SYNTHETIC] */
        @fh.h
        public final java.lang.Object K(@fh.g java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r12.T
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L_0x005a
                if (r1 == r6) goto L_0x0046
                if (r1 == r5) goto L_0x0041
                if (r1 == r4) goto L_0x002f
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                goto L_0x0041
            L_0x0019:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0021:
                java.lang.Object r1 = r12.Q
                be.i1 r1 = (be.i1) r1
                java.lang.Object r4 = r12.U
                if.o r4 = (p000if.o) r4
                zd.e1.n(r13)
                r13 = r12
                goto L_0x014d
            L_0x002f:
                java.lang.Object r1 = r12.R
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r5 = r12.Q
                be.i1 r5 = (be.i1) r5
                java.lang.Object r8 = r12.U
                if.o r8 = (p000if.o) r8
                zd.e1.n(r13)
                r13 = r12
                goto L_0x011f
            L_0x0041:
                zd.e1.n(r13)
                goto L_0x0169
            L_0x0046:
                int r1 = r12.S
                java.lang.Object r2 = r12.R
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r3 = r12.Q
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.lang.Object r4 = r12.U
                if.o r4 = (p000if.o) r4
                zd.e1.n(r13)
                r13 = r12
                r8 = r1
                goto L_0x00a8
            L_0x005a:
                zd.e1.n(r13)
                java.lang.Object r13 = r12.U
                if.o r13 = (p000if.o) r13
                int r1 = r12.V
                r8 = 1024(0x400, float:1.435E-42)
                int r1 = gf.v.B(r1, r8)
                int r8 = r12.W
                int r9 = r12.V
                int r8 = r8 - r9
                if (r8 < 0) goto L_0x00dc
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r1)
                r1 = 0
                java.util.Iterator<T> r3 = r12.X
                r4 = r13
                r13 = r12
                r11 = r3
                r3 = r2
                r2 = r11
            L_0x007d:
                boolean r9 = r2.hasNext()
                if (r9 == 0) goto L_0x00ba
                java.lang.Object r9 = r2.next()
                if (r1 <= 0) goto L_0x008c
                int r1 = r1 + -1
                goto L_0x007d
            L_0x008c:
                r3.add(r9)
                int r9 = r3.size()
                int r10 = r13.V
                if (r9 != r10) goto L_0x007d
                r13.U = r4
                r13.Q = r3
                r13.R = r2
                r13.S = r8
                r13.T = r6
                java.lang.Object r1 = r4.a(r3, r13)
                if (r1 != r0) goto L_0x00a8
                return r0
            L_0x00a8:
                boolean r1 = r13.Y
                if (r1 == 0) goto L_0x00b0
                r3.clear()
                goto L_0x00b8
            L_0x00b0:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r13.V
                r1.<init>(r3)
                r3 = r1
            L_0x00b8:
                r1 = r8
                goto L_0x007d
            L_0x00ba:
                boolean r1 = r3.isEmpty()
                r1 = r1 ^ r6
                if (r1 == 0) goto L_0x0169
                boolean r1 = r13.Z
                if (r1 != 0) goto L_0x00cd
                int r1 = r3.size()
                int r2 = r13.V
                if (r1 != r2) goto L_0x0169
            L_0x00cd:
                r13.U = r7
                r13.Q = r7
                r13.R = r7
                r13.T = r5
                java.lang.Object r13 = r4.a(r3, r13)
                if (r13 != r0) goto L_0x0169
                return r0
            L_0x00dc:
                be.i1 r5 = new be.i1
                r5.<init>(r1)
                java.util.Iterator<T> r1 = r12.X
                r8 = r13
                r13 = r12
            L_0x00e5:
                boolean r9 = r1.hasNext()
                if (r9 == 0) goto L_0x0125
                java.lang.Object r9 = r1.next()
                r5.h(r9)
                boolean r9 = r5.n()
                if (r9 == 0) goto L_0x00e5
                int r9 = r5.size()
                int r10 = r13.V
                if (r9 >= r10) goto L_0x0105
                be.i1 r5 = r5.l(r10)
                goto L_0x00e5
            L_0x0105:
                boolean r9 = r13.Y
                if (r9 == 0) goto L_0x010b
                r9 = r5
                goto L_0x0110
            L_0x010b:
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>(r5)
            L_0x0110:
                r13.U = r8
                r13.Q = r5
                r13.R = r1
                r13.T = r4
                java.lang.Object r9 = r8.a(r9, r13)
                if (r9 != r0) goto L_0x011f
                return r0
            L_0x011f:
                int r9 = r13.W
                r5.o(r9)
                goto L_0x00e5
            L_0x0125:
                boolean r1 = r13.Z
                if (r1 == 0) goto L_0x0169
                r1 = r5
                r4 = r8
            L_0x012b:
                int r5 = r1.size()
                int r8 = r13.W
                if (r5 <= r8) goto L_0x0153
                boolean r5 = r13.Y
                if (r5 == 0) goto L_0x0139
                r5 = r1
                goto L_0x013e
            L_0x0139:
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r1)
            L_0x013e:
                r13.U = r4
                r13.Q = r1
                r13.R = r7
                r13.T = r3
                java.lang.Object r5 = r4.a(r5, r13)
                if (r5 != r0) goto L_0x014d
                return r0
            L_0x014d:
                int r5 = r13.W
                r1.o(r5)
                goto L_0x012b
            L_0x0153:
                boolean r3 = r1.isEmpty()
                r3 = r3 ^ r6
                if (r3 == 0) goto L_0x0169
                r13.U = r7
                r13.Q = r7
                r13.R = r7
                r13.T = r2
                java.lang.Object r13 = r4.a(r1, r13)
                if (r13 != r0) goto L_0x0169
                return r0
            L_0x0169:
                zd.u2 r13 = zd.u2.f25116a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: be.o1.a.K(java.lang.Object):java.lang.Object");
        }

        @h
        /* renamed from: N */
        public final Object g0(@g o<? super List<? extends T>> oVar, @h d<? super u2> dVar) {
            return ((a) H(oVar, dVar)).K(u2.f25116a);
        }
    }

    public static final class b implements m<List<? extends T>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m f16214a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f16215b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f16216c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ boolean f16217d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f16218e;

        public b(m mVar, int i10, int i11, boolean z10, boolean z11) {
            this.f16214a = mVar;
            this.f16215b = i10;
            this.f16216c = i11;
            this.f16217d = z10;
            this.f16218e = z11;
        }

        @g
        public Iterator<List<? extends T>> iterator() {
            return o1.b(this.f16214a.iterator(), this.f16215b, this.f16216c, this.f16217d, this.f16218e);
        }
    }

    public static final void a(int i10, int i11) {
        String str;
        if (!(i10 > 0 && i11 > 0)) {
            if (i10 != i11) {
                str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
            } else {
                str = "size " + i10 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @g
    public static final <T> Iterator<List<T>> b(@g Iterator<? extends T> it, int i10, int i11, boolean z10, boolean z11) {
        l0.p(it, "iterator");
        return !it.hasNext() ? g0.O : q.a(new a(i10, i11, it, z11, z10, (d<? super a>) null));
    }

    @g
    public static final <T> m<List<T>> c(@g m<? extends T> mVar, int i10, int i11, boolean z10, boolean z11) {
        l0.p(mVar, "<this>");
        a(i10, i11);
        return new b(mVar, i10, i11, z10, z11);
    }
}
