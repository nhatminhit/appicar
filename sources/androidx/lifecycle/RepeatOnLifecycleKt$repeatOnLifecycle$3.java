package androidx.lifecycle;

import androidx.lifecycle.p;
import fh.g;
import fh.h;
import ie.d;
import le.f;
import le.o;
import pf.j;
import pf.m1;
import pf.u0;
import pf.z2;
import we.p;
import xe.r1;
import zd.e1;
import zd.u2;

@f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends o implements we.p<u0, d<? super u2>, Object> {
    public int S;
    public /* synthetic */ Object T;
    public final /* synthetic */ p U;
    public final /* synthetic */ p.b V;
    public final /* synthetic */ we.p<u0, d<? super u2>, Object> W;

    @r1({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,165:1\n314#2,11:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n97#1:166,11\n*E\n"})
    @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {166}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1  reason: invalid class name */
    public static final class AnonymousClass1 extends o implements we.p<u0, d<? super u2>, Object> {
        public Object S;
        public Object T;
        public Object U;
        public Object V;
        public Object W;
        public Object X;
        public int Y;

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            return new AnonymousClass1(pVar, bVar, u0Var, pVar2, dVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: xe.k1$h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: xe.k1$h} */
        /* JADX WARNING: Multi-variable type inference failed */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r16
                java.lang.Object r0 = ke.d.h()
                int r2 = r1.Y
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0038
                if (r2 != r4) goto L_0x0030
                java.lang.Object r0 = r1.X
                we.p r0 = (we.p) r0
                java.lang.Object r0 = r1.W
                pf.u0 r0 = (pf.u0) r0
                java.lang.Object r0 = r1.V
                androidx.lifecycle.p r0 = (androidx.lifecycle.p) r0
                java.lang.Object r0 = r1.U
                androidx.lifecycle.p$b r0 = (androidx.lifecycle.p.b) r0
                java.lang.Object r0 = r1.T
                r2 = r0
                xe.k1$h r2 = (xe.k1.h) r2
                java.lang.Object r0 = r1.S
                r5 = r0
                xe.k1$h r5 = (xe.k1.h) r5
                zd.e1.n(r17)     // Catch:{ all -> 0x002d }
                goto L_0x00ac
            L_0x002d:
                r0 = move-exception
                goto L_0x00c7
            L_0x0030:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0038:
                zd.e1.n(r17)
                androidx.lifecycle.p r2 = r4
                androidx.lifecycle.p$b r2 = r2.b()
                androidx.lifecycle.p$b r5 = androidx.lifecycle.p.b.DESTROYED
                if (r2 != r5) goto L_0x0048
                zd.u2 r0 = zd.u2.f25116a
                return r0
            L_0x0048:
                xe.k1$h r2 = new xe.k1$h
                r2.<init>()
                xe.k1$h r13 = new xe.k1$h
                r13.<init>()
                androidx.lifecycle.p$b r5 = r5     // Catch:{ all -> 0x00c4 }
                androidx.lifecycle.p r14 = r4     // Catch:{ all -> 0x00c4 }
                pf.u0 r8 = r6     // Catch:{ all -> 0x00c4 }
                we.p<pf.u0, ie.d<? super zd.u2>, java.lang.Object> r12 = r7     // Catch:{ all -> 0x00c4 }
                r1.S = r2     // Catch:{ all -> 0x00c4 }
                r1.T = r13     // Catch:{ all -> 0x00c4 }
                r1.U = r5     // Catch:{ all -> 0x00c4 }
                r1.V = r14     // Catch:{ all -> 0x00c4 }
                r1.W = r8     // Catch:{ all -> 0x00c4 }
                r1.X = r12     // Catch:{ all -> 0x00c4 }
                r1.Y = r4     // Catch:{ all -> 0x00c4 }
                pf.r r15 = new pf.r     // Catch:{ all -> 0x00c4 }
                ie.d r6 = ke.c.d(r16)     // Catch:{ all -> 0x00c4 }
                r15.<init>(r6, r4)     // Catch:{ all -> 0x00c4 }
                r15.Z()     // Catch:{ all -> 0x00c4 }
                androidx.lifecycle.p$a$a r6 = androidx.lifecycle.p.a.Companion     // Catch:{ all -> 0x00c4 }
                androidx.lifecycle.p$a r7 = r6.d(r5)     // Catch:{ all -> 0x00c4 }
                androidx.lifecycle.p$a r9 = r6.a(r5)     // Catch:{ all -> 0x00c4 }
                r5 = 0
                ag.c r11 = ag.e.b(r5, r4, r3)     // Catch:{ all -> 0x00c4 }
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r10 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch:{ all -> 0x00c4 }
                r5 = r10
                r6 = r7
                r7 = r2
                r3 = r10
                r10 = r15
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c4 }
                r13.O = r3     // Catch:{ all -> 0x00c4 }
                java.lang.String r5 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver"
                xe.l0.n(r3, r5)     // Catch:{ all -> 0x00c4 }
                r10 = r3
                androidx.lifecycle.u r10 = (androidx.lifecycle.u) r10     // Catch:{ all -> 0x00c4 }
                r14.a(r10)     // Catch:{ all -> 0x00c4 }
                java.lang.Object r3 = r15.z()     // Catch:{ all -> 0x00c4 }
                java.lang.Object r5 = ke.d.h()     // Catch:{ all -> 0x00c4 }
                if (r3 != r5) goto L_0x00a7
                le.h.c(r16)     // Catch:{ all -> 0x00c4 }
            L_0x00a7:
                if (r3 != r0) goto L_0x00aa
                return r0
            L_0x00aa:
                r5 = r2
                r2 = r13
            L_0x00ac:
                T r0 = r5.O
                pf.n2 r0 = (pf.n2) r0
                if (r0 == 0) goto L_0x00b6
                r3 = 0
                pf.n2.a.b(r0, r3, r4, r3)
            L_0x00b6:
                T r0 = r2.O
                androidx.lifecycle.u r0 = (androidx.lifecycle.u) r0
                if (r0 == 0) goto L_0x00c1
                androidx.lifecycle.p r2 = r4
                r2.d(r0)
            L_0x00c1:
                zd.u2 r0 = zd.u2.f25116a
                return r0
            L_0x00c4:
                r0 = move-exception
                r5 = r2
                r2 = r13
            L_0x00c7:
                T r3 = r5.O
                pf.n2 r3 = (pf.n2) r3
                if (r3 == 0) goto L_0x00d1
                r5 = 0
                pf.n2.a.b(r3, r5, r4, r5)
            L_0x00d1:
                T r2 = r2.O
                androidx.lifecycle.u r2 = (androidx.lifecycle.u) r2
                if (r2 == 0) goto L_0x00dc
                androidx.lifecycle.p r3 = r4
                r3.d(r2)
            L_0x00dc:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.K(java.lang.Object):java.lang.Object");
        }

        @h
        /* renamed from: P */
        public final Object g0(@g u0 u0Var, @h d<? super u2> dVar) {
            return ((AnonymousClass1) H(u0Var, dVar)).K(u2.f25116a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(p pVar, p.b bVar, we.p<? super u0, ? super d<? super u2>, ? extends Object> pVar2, d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> dVar) {
        super(2, dVar);
        this.U = pVar;
        this.V = bVar;
        this.W = pVar2;
    }

    @g
    public final d<u2> H(@h Object obj, @g d<?> dVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.U, this.V, this.W, dVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.T = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @h
    public final Object K(@g Object obj) {
        Object h10 = ke.d.h();
        int i10 = this.S;
        if (i10 == 0) {
            e1.n(obj);
            final u0 u0Var = (u0) this.T;
            z2 S1 = m1.e().S1();
            final p pVar = this.U;
            final p.b bVar = this.V;
            final we.p<u0, d<? super u2>, Object> pVar2 = this.W;
            AnonymousClass1 r32 = new AnonymousClass1((d<? super AnonymousClass1>) null);
            this.S = 1;
            if (j.h(S1, r32, this) == h10) {
                return h10;
            }
        } else if (i10 == 1) {
            e1.n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return u2.f25116a;
    }

    @h
    /* renamed from: P */
    public final Object g0(@g u0 u0Var, @h d<? super u2> dVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) H(u0Var, dVar)).K(u2.f25116a);
    }
}
