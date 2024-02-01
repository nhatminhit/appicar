package lf;

import fh.g;
import gf.v;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p000if.m;
import we.p;
import xe.l0;
import zd.u0;

public final class h implements m<gf.m> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f20803a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20804b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20805c;
    @g

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, u0<Integer, Integer>> f20806d;

    public static final class a implements Iterator<gf.m>, ye.a {
        public int O = -1;
        public int P;
        public int Q;
        @fh.h
        public gf.m R;
        public int S;
        public final /* synthetic */ h T;

        public a(h hVar) {
            this.T = hVar;
            int I = v.I(hVar.f20804b, 0, hVar.f20803a.length());
            this.P = I;
            this.Q = I;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < lf.h.e(r6.T)) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r6 = this;
                int r0 = r6.Q
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.O = r1
                r0 = 0
                r6.R = r0
                goto L_0x0099
            L_0x000c:
                lf.h r0 = r6.T
                int r0 = r0.f20805c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.S
                int r0 = r0 + r3
                r6.S = r0
                lf.h r4 = r6.T
                int r4 = r4.f20805c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.Q
                lf.h r4 = r6.T
                java.lang.CharSequence r4 = r4.f20803a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                gf.m r0 = new gf.m
                int r1 = r6.P
                lf.h r4 = r6.T
                java.lang.CharSequence r4 = r4.f20803a
                int r4 = lf.c0.j3(r4)
                r0.<init>(r1, r4)
            L_0x0042:
                r6.R = r0
            L_0x0044:
                r6.Q = r2
                goto L_0x0097
            L_0x0047:
                lf.h r0 = r6.T
                we.p r0 = r0.f20806d
                lf.h r4 = r6.T
                java.lang.CharSequence r4 = r4.f20803a
                int r5 = r6.Q
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.g0(r4, r5)
                zd.u0 r0 = (zd.u0) r0
                if (r0 != 0) goto L_0x0073
                gf.m r0 = new gf.m
                int r1 = r6.P
                lf.h r4 = r6.T
                java.lang.CharSequence r4 = r4.f20803a
                int r4 = lf.c0.j3(r4)
                r0.<init>(r1, r4)
                goto L_0x0042
            L_0x0073:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.P
                gf.m r4 = gf.v.W1(r4, r2)
                r6.R = r4
                int r2 = r2 + r0
                r6.P = r2
                if (r0 != 0) goto L_0x0095
                r1 = r3
            L_0x0095:
                int r2 = r2 + r1
                goto L_0x0044
            L_0x0097:
                r6.O = r3
            L_0x0099:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lf.h.a.a():void");
        }

        public final int b() {
            return this.S;
        }

        public final int c() {
            return this.P;
        }

        @fh.h
        public final gf.m d() {
            return this.R;
        }

        public final int e() {
            return this.Q;
        }

        public final int f() {
            return this.O;
        }

        @g
        /* renamed from: h */
        public gf.m next() {
            if (this.O == -1) {
                a();
            }
            if (this.O != 0) {
                gf.m mVar = this.R;
                l0.n(mVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.R = null;
                this.O = -1;
                return mVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.O == -1) {
                a();
            }
            return this.O == 1;
        }

        public final void k(int i10) {
            this.S = i10;
        }

        public final void l(int i10) {
            this.P = i10;
        }

        public final void m(@fh.h gf.m mVar) {
            this.R = mVar;
        }

        public final void n(int i10) {
            this.Q = i10;
        }

        public final void o(int i10) {
            this.O = i10;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(@g CharSequence charSequence, int i10, int i11, @g p<? super CharSequence, ? super Integer, u0<Integer, Integer>> pVar) {
        l0.p(charSequence, "input");
        l0.p(pVar, "getNextMatch");
        this.f20803a = charSequence;
        this.f20804b = i10;
        this.f20805c = i11;
        this.f20806d = pVar;
    }

    @g
    public Iterator<gf.m> iterator() {
        return new a(this);
    }
}
