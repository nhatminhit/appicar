package p000if;

import be.e0;
import be.l1;
import be.o1;
import be.p0;
import fe.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import xe.h0;
import xe.k1;
import xe.l0;
import xe.n0;
import zd.b1;
import zd.e1;
import zd.e2;
import zd.h1;
import zd.j2;
import zd.r1;
import zd.t0;
import zd.u0;
import zd.u2;
import zd.y2;

/* renamed from: if.u  reason: invalid package */
public class u extends t {

    /* renamed from: if.u$a */
    public static final class a implements Iterable<T>, ye.a {
        public final /* synthetic */ m O;

        public a(m mVar) {
            this.O = mVar;
        }

        @fh.g
        public Iterator<T> iterator() {
            return this.O.iterator();
        }
    }

    /* renamed from: if.u$a0 */
    public static final class a0 extends n0 implements we.p<T, T, u0<? extends T, ? extends T>> {
        public static final a0 P = new a0();

        public a0() {
            super(2);
        }

        @fh.g
        /* renamed from: c */
        public final u0<T, T> g0(T t10, T t11) {
            return r1.a(t10, t11);
        }
    }

    /* renamed from: if.u$b */
    public static final class b extends n0 implements we.l<T, T> {
        public static final b P = new b();

        public b() {
            super(1);
        }

        public final T A(T t10) {
            return t10;
        }
    }

    @le.f(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0}, l = {2855}, m = "invokeSuspend", n = {"$this$result", "iterator", "next"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: if.u$b0 */
    public static final class b0 extends le.k implements we.p<o<? super R>, ie.d<? super u2>, Object> {
        public Object Q;
        public Object R;
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ m<T> U;
        public final /* synthetic */ we.p<T, T, R> V;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b0(m<? extends T> mVar, we.p<? super T, ? super T, ? extends R> pVar, ie.d<? super b0> dVar) {
            super(2, dVar);
            this.U = mVar;
            this.V = pVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            b0 b0Var = new b0(this.U, this.V, dVar);
            b0Var.T = obj;
            return b0Var;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            T t10;
            o oVar;
            Iterator<T> it;
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                o oVar2 = (o) this.T;
                Iterator<T> it2 = this.U.iterator();
                if (!it2.hasNext()) {
                    return u2.f25116a;
                }
                oVar = oVar2;
                t10 = it2.next();
                it = it2;
            } else if (i10 == 1) {
                T t11 = this.R;
                it = (Iterator) this.Q;
                oVar = (o) this.T;
                e1.n(obj);
                t10 = t11;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (it.hasNext()) {
                T next = it.next();
                R g02 = this.V.g0(t10, next);
                this.T = oVar;
                this.Q = it;
                this.R = next;
                this.S = 1;
                if (oVar.a(g02, this) == h10) {
                    return h10;
                }
                t10 = next;
            }
            return u2.f25116a;
        }

        @fh.h
        /* renamed from: N */
        public final Object g0(@fh.g o<? super R> oVar, @fh.h ie.d<? super u2> dVar) {
            return ((b0) H(oVar, dVar)).K(u2.f25116a);
        }
    }

    /* renamed from: if.u$c */
    public static final class c extends n0 implements we.l<Integer, T> {
        public final /* synthetic */ int P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(int i10) {
            super(1);
            this.P = i10;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            return c(((Number) obj).intValue());
        }

        public final T c(int i10) {
            throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.P + '.');
        }
    }

    /* renamed from: if.u$d */
    public static final class d extends n0 implements we.l<p0<? extends T>, Boolean> {
        public final /* synthetic */ we.p<Integer, T, Boolean> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(we.p<? super Integer, ? super T, Boolean> pVar) {
            super(1);
            this.P = pVar;
        }

        @fh.g
        /* renamed from: c */
        public final Boolean A(@fh.g p0<? extends T> p0Var) {
            l0.p(p0Var, "it");
            return this.P.g0(Integer.valueOf(p0Var.e()), p0Var.f());
        }
    }

    /* renamed from: if.u$e */
    public static final class e extends n0 implements we.l<p0<? extends T>, T> {
        public static final e P = new e();

        public e() {
            super(1);
        }

        /* renamed from: c */
        public final T A(@fh.g p0<? extends T> p0Var) {
            l0.p(p0Var, "it");
            return p0Var.f();
        }
    }

    /* renamed from: if.u$f */
    public static final class f extends n0 implements we.l<Object, Boolean> {
        public static final f P = new f();

        public f() {
            super(1);
        }

        @fh.g
        /* renamed from: c */
        public final Boolean A(@fh.h Object obj) {
            l0.y(3, "R");
            return Boolean.valueOf(obj instanceof Object);
        }
    }

    /* renamed from: if.u$g */
    public static final class g extends n0 implements we.l<T, Boolean> {
        public static final g P = new g();

        public g() {
            super(1);
        }

        @fh.g
        /* renamed from: c */
        public final Boolean A(@fh.h T t10) {
            return Boolean.valueOf(t10 == null);
        }
    }

    /* renamed from: if.u$h */
    public /* synthetic */ class h extends h0 implements we.l<Iterable<? extends R>, Iterator<? extends R>> {
        public static final h X = new h();

        public h() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @fh.g
        /* renamed from: z0 */
        public final Iterator<R> A(@fh.g Iterable<? extends R> iterable) {
            l0.p(iterable, "p0");
            return iterable.iterator();
        }
    }

    /* renamed from: if.u$i */
    public /* synthetic */ class i extends h0 implements we.l<m<? extends R>, Iterator<? extends R>> {
        public static final i X = new i();

        public i() {
            super(1, m.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @fh.g
        /* renamed from: z0 */
        public final Iterator<R> A(@fh.g m<? extends R> mVar) {
            l0.p(mVar, "p0");
            return mVar.iterator();
        }
    }

    /* renamed from: if.u$j */
    public /* synthetic */ class j extends h0 implements we.l<Iterable<? extends R>, Iterator<? extends R>> {
        public static final j X = new j();

        public j() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @fh.g
        /* renamed from: z0 */
        public final Iterator<R> A(@fh.g Iterable<? extends R> iterable) {
            l0.p(iterable, "p0");
            return iterable.iterator();
        }
    }

    /* renamed from: if.u$k */
    public /* synthetic */ class k extends h0 implements we.l<m<? extends R>, Iterator<? extends R>> {
        public static final k X = new k();

        public k() {
            super(1, m.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @fh.g
        /* renamed from: z0 */
        public final Iterator<R> A(@fh.g m<? extends R> mVar) {
            l0.p(mVar, "p0");
            return mVar.iterator();
        }
    }

    /* renamed from: if.u$l */
    public static final class l implements be.l0<T, K> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m<T> f19726a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ we.l<T, K> f19727b;

        public l(m<? extends T> mVar, we.l<? super T, ? extends K> lVar) {
            this.f19726a = mVar;
            this.f19727b = lVar;
        }

        public K a(T t10) {
            return this.f19727b.A(t10);
        }

        @fh.g
        public Iterator<T> b() {
            return this.f19726a.iterator();
        }
    }

    /* renamed from: if.u$m */
    public static final class m implements m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m<T> f19728a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ T f19729b;

        /* renamed from: if.u$m$a */
        public static final class a extends n0 implements we.l<T, Boolean> {
            public final /* synthetic */ k1.a P;
            public final /* synthetic */ T Q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(k1.a aVar, T t10) {
                super(1);
                this.P = aVar;
                this.Q = t10;
            }

            @fh.g
            /* renamed from: c */
            public final Boolean A(T t10) {
                boolean z10 = true;
                if (!this.P.O && l0.g(t10, this.Q)) {
                    this.P.O = true;
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }

        public m(m<? extends T> mVar, T t10) {
            this.f19728a = mVar;
            this.f19729b = t10;
        }

        @fh.g
        public Iterator<T> iterator() {
            return u.p0(this.f19728a, new a(new k1.a(), this.f19729b)).iterator();
        }
    }

    /* renamed from: if.u$n */
    public static final class n implements m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m<T> f19730a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ T[] f19731b;

        /* renamed from: if.u$n$a */
        public static final class a extends n0 implements we.l<T, Boolean> {
            public final /* synthetic */ T[] P;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(T[] tArr) {
                super(1);
                this.P = tArr;
            }

            @fh.g
            /* renamed from: c */
            public final Boolean A(T t10) {
                return Boolean.valueOf(be.p.T8(this.P, t10));
            }
        }

        public n(m<? extends T> mVar, T[] tArr) {
            this.f19730a = mVar;
            this.f19731b = tArr;
        }

        @fh.g
        public Iterator<T> iterator() {
            return u.u0(this.f19730a, new a(this.f19731b)).iterator();
        }
    }

    /* renamed from: if.u$o */
    public static final class o implements m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Iterable<T> f19732a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ m<T> f19733b;

        /* renamed from: if.u$o$a */
        public static final class a extends n0 implements we.l<T, Boolean> {
            public final /* synthetic */ Collection<T> P;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Collection<? extends T> collection) {
                super(1);
                this.P = collection;
            }

            @fh.g
            /* renamed from: c */
            public final Boolean A(T t10) {
                return Boolean.valueOf(this.P.contains(t10));
            }
        }

        public o(Iterable<? extends T> iterable, m<? extends T> mVar) {
            this.f19732a = iterable;
            this.f19733b = mVar;
        }

        @fh.g
        public Iterator<T> iterator() {
            Collection<T> q02 = be.b0.q0(this.f19732a);
            return (q02.isEmpty() ? this.f19733b : u.u0(this.f19733b, new a(q02))).iterator();
        }
    }

    /* renamed from: if.u$p */
    public static final class p implements m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m<T> f19734a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ m<T> f19735b;

        /* renamed from: if.u$p$a */
        public static final class a extends n0 implements we.l<T, Boolean> {
            public final /* synthetic */ List<T> P;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(List<? extends T> list) {
                super(1);
                this.P = list;
            }

            @fh.g
            /* renamed from: c */
            public final Boolean A(T t10) {
                return Boolean.valueOf(this.P.contains(t10));
            }
        }

        public p(m<? extends T> mVar, m<? extends T> mVar2) {
            this.f19734a = mVar;
            this.f19735b = mVar2;
        }

        @fh.g
        public Iterator<T> iterator() {
            List<T> c32 = u.c3(this.f19734a);
            return (c32.isEmpty() ? this.f19735b : u.u0(this.f19735b, new a(c32))).iterator();
        }
    }

    /* renamed from: if.u$q */
    public static final class q extends n0 implements we.l<T, T> {
        public final /* synthetic */ we.l<T, u2> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(we.l<? super T, u2> lVar) {
            super(1);
            this.P = lVar;
        }

        public final T A(T t10) {
            this.P.A(t10);
            return t10;
        }
    }

    /* renamed from: if.u$r */
    public static final class r extends n0 implements we.p<Integer, T, T> {
        public final /* synthetic */ we.p<Integer, T, u2> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public r(we.p<? super Integer, ? super T, u2> pVar) {
            super(2);
            this.P = pVar;
        }

        public final T c(int i10, T t10) {
            this.P.g0(Integer.valueOf(i10), t10);
            return t10;
        }

        public /* bridge */ /* synthetic */ Object g0(Object obj, Object obj2) {
            return c(((Number) obj).intValue(), obj2);
        }
    }

    /* renamed from: if.u$s */
    public static final class s extends n0 implements we.l<T, T> {
        public final /* synthetic */ m<T> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public s(m<? extends T> mVar) {
            super(1);
            this.P = mVar;
        }

        @fh.g
        public final T A(@fh.h T t10) {
            if (t10 != null) {
                return t10;
            }
            throw new IllegalArgumentException("null element found in " + this.P + '.');
        }
    }

    @le.f(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1}, l = {2290, 2294}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator"}, s = {"L$0", "L$0", "L$1"})
    /* renamed from: if.u$t */
    public static final class t extends le.k implements we.p<o<? super R>, ie.d<? super u2>, Object> {
        public Object Q;
        public Object R;
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ R U;
        public final /* synthetic */ m<T> V;
        public final /* synthetic */ we.p<R, T, R> W;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public t(R r10, m<? extends T> mVar, we.p<? super R, ? super T, ? extends R> pVar, ie.d<? super t> dVar) {
            super(2, dVar);
            this.U = r10;
            this.V = mVar;
            this.W = pVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            t tVar = new t(this.U, this.V, this.W, dVar);
            tVar.T = obj;
            return tVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: if.o} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r7.S
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002d
                if (r1 == r3) goto L_0x0025
                if (r1 != r2) goto L_0x001d
                java.lang.Object r1 = r7.R
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r7.Q
                java.lang.Object r4 = r7.T
                if.o r4 = (p000if.o) r4
                zd.e1.n(r8)
                r8 = r3
                goto L_0x004c
            L_0x001d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0025:
                java.lang.Object r1 = r7.T
                if.o r1 = (p000if.o) r1
                zd.e1.n(r8)
                goto L_0x0042
            L_0x002d:
                zd.e1.n(r8)
                java.lang.Object r8 = r7.T
                r1 = r8
                if.o r1 = (p000if.o) r1
                R r8 = r7.U
                r7.T = r1
                r7.S = r3
                java.lang.Object r8 = r1.a(r8, r7)
                if (r8 != r0) goto L_0x0042
                return r0
            L_0x0042:
                R r8 = r7.U
                if.m<T> r3 = r7.V
                java.util.Iterator r3 = r3.iterator()
                r4 = r1
                r1 = r3
            L_0x004c:
                r3 = r7
            L_0x004d:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x006c
                java.lang.Object r5 = r1.next()
                we.p<R, T, R> r6 = r3.W
                java.lang.Object r8 = r6.g0(r8, r5)
                r3.T = r4
                r3.Q = r8
                r3.R = r1
                r3.S = r2
                java.lang.Object r5 = r4.a(r8, r3)
                if (r5 != r0) goto L_0x004d
                return r0
            L_0x006c:
                zd.u2 r8 = zd.u2.f25116a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000if.u.t.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: N */
        public final Object g0(@fh.g o<? super R> oVar, @fh.h ie.d<? super u2> dVar) {
            return ((t) H(oVar, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {2318, 2323}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "index"}, s = {"L$0", "L$0", "L$1", "I$0"})
    /* renamed from: if.u$u  reason: collision with other inner class name */
    public static final class C0328u extends le.k implements we.p<o<? super R>, ie.d<? super u2>, Object> {
        public Object Q;
        public Object R;
        public int S;
        public int T;
        public /* synthetic */ Object U;
        public final /* synthetic */ R V;
        public final /* synthetic */ m<T> W;
        public final /* synthetic */ we.q<Integer, R, T, R> X;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0328u(R r10, m<? extends T> mVar, we.q<? super Integer, ? super R, ? super T, ? extends R> qVar, ie.d<? super C0328u> dVar) {
            super(2, dVar);
            this.V = r10;
            this.W = mVar;
            this.X = qVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            C0328u uVar = new C0328u(this.V, this.W, this.X, dVar);
            uVar.U = obj;
            return uVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: if.o} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r9.T
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0030
                if (r1 == r3) goto L_0x0028
                if (r1 != r2) goto L_0x0020
                int r1 = r9.S
                java.lang.Object r3 = r9.R
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r9.Q
                java.lang.Object r5 = r9.U
                if.o r5 = (p000if.o) r5
                zd.e1.n(r10)
                r10 = r1
                r1 = r4
                goto L_0x0051
            L_0x0020:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0028:
                java.lang.Object r1 = r9.U
                if.o r1 = (p000if.o) r1
                zd.e1.n(r10)
                goto L_0x0045
            L_0x0030:
                zd.e1.n(r10)
                java.lang.Object r10 = r9.U
                r1 = r10
                if.o r1 = (p000if.o) r1
                R r10 = r9.V
                r9.U = r1
                r9.T = r3
                java.lang.Object r10 = r1.a(r10, r9)
                if (r10 != r0) goto L_0x0045
                return r0
            L_0x0045:
                r10 = 0
                R r3 = r9.V
                if.m<T> r4 = r9.W
                java.util.Iterator r4 = r4.iterator()
                r5 = r1
                r1 = r3
                r3 = r4
            L_0x0051:
                r4 = r9
            L_0x0052:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x0081
                java.lang.Object r6 = r3.next()
                we.q<java.lang.Integer, R, T, R> r7 = r4.X
                int r8 = r10 + 1
                if (r10 >= 0) goto L_0x0065
                be.w.W()
            L_0x0065:
                java.lang.Integer r10 = le.b.f(r10)
                java.lang.Object r10 = r7.y(r10, r1, r6)
                r4.U = r5
                r4.Q = r10
                r4.R = r3
                r4.S = r8
                r4.T = r2
                java.lang.Object r1 = r5.a(r10, r4)
                if (r1 != r0) goto L_0x007e
                return r0
            L_0x007e:
                r1 = r10
                r10 = r8
                goto L_0x0052
            L_0x0081:
                zd.u2 r10 = zd.u2.f25116a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p000if.u.C0328u.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: N */
        public final Object g0(@fh.g o<? super R> oVar, @fh.h ie.d<? super u2> dVar) {
            return ((C0328u) H(oVar, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1}, l = {2348, 2351}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* renamed from: if.u$v */
    public static final class v extends le.k implements we.p<o<? super S>, ie.d<? super u2>, Object> {
        public Object Q;
        public Object R;
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ m<T> U;
        public final /* synthetic */ we.p<S, T, S> V;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public v(m<? extends T> mVar, we.p<? super S, ? super T, ? extends S> pVar, ie.d<? super v> dVar) {
            super(2, dVar);
            this.U = mVar;
            this.V = pVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            v vVar = new v(this.U, this.V, dVar);
            vVar.T = obj;
            return vVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: if.o} */
        /* JADX WARNING: Multi-variable type inference failed */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r7.S
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0024
                if (r1 == r3) goto L_0x000e
                if (r1 != r2) goto L_0x001c
            L_0x000e:
                java.lang.Object r1 = r7.R
                java.lang.Object r3 = r7.Q
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r7.T
                if.o r4 = (p000if.o) r4
                zd.e1.n(r8)
                goto L_0x004c
            L_0x001c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0024:
                zd.e1.n(r8)
                java.lang.Object r8 = r7.T
                r4 = r8
                if.o r4 = (p000if.o) r4
                if.m<T> r8 = r7.U
                java.util.Iterator r8 = r8.iterator()
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L_0x006c
                java.lang.Object r1 = r8.next()
                r7.T = r4
                r7.Q = r8
                r7.R = r1
                r7.S = r3
                java.lang.Object r3 = r4.a(r1, r7)
                if (r3 != r0) goto L_0x004b
                return r0
            L_0x004b:
                r3 = r8
            L_0x004c:
                r8 = r7
            L_0x004d:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x006c
                we.p<S, T, S> r5 = r8.V
                java.lang.Object r6 = r3.next()
                java.lang.Object r1 = r5.g0(r1, r6)
                r8.T = r4
                r8.Q = r3
                r8.R = r1
                r8.S = r2
                java.lang.Object r5 = r4.a(r1, r8)
                if (r5 != r0) goto L_0x004d
                return r0
            L_0x006c:
                zd.u2 r8 = zd.u2.f25116a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000if.u.v.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: N */
        public final Object g0(@fh.g o<? super S> oVar, @fh.h ie.d<? super u2> dVar) {
            return ((v) H(oVar, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {2377, 2381}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", "index"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
    /* renamed from: if.u$w */
    public static final class w extends le.k implements we.p<o<? super S>, ie.d<? super u2>, Object> {
        public Object Q;
        public Object R;
        public int S;
        public int T;
        public /* synthetic */ Object U;
        public final /* synthetic */ m<T> V;
        public final /* synthetic */ we.q<Integer, S, T, S> W;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public w(m<? extends T> mVar, we.q<? super Integer, ? super S, ? super T, ? extends S> qVar, ie.d<? super w> dVar) {
            super(2, dVar);
            this.V = mVar;
            this.W = qVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            w wVar = new w(this.V, this.W, dVar);
            wVar.U = obj;
            return wVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: if.o} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r10.T
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0038
                if (r1 == r3) goto L_0x002a
                if (r1 != r2) goto L_0x0022
                int r1 = r10.S
                java.lang.Object r3 = r10.R
                java.lang.Object r4 = r10.Q
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r10.U
                if.o r5 = (p000if.o) r5
                zd.e1.n(r11)
                r11 = r10
                r9 = r3
                r3 = r1
                r1 = r9
                goto L_0x0060
            L_0x0022:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x002a:
                java.lang.Object r1 = r10.R
                java.lang.Object r4 = r10.Q
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r10.U
                if.o r5 = (p000if.o) r5
                zd.e1.n(r11)
                goto L_0x005f
            L_0x0038:
                zd.e1.n(r11)
                java.lang.Object r11 = r10.U
                r5 = r11
                if.o r5 = (p000if.o) r5
                if.m<T> r11 = r10.V
                java.util.Iterator r4 = r11.iterator()
                boolean r11 = r4.hasNext()
                if (r11 == 0) goto L_0x008f
                java.lang.Object r1 = r4.next()
                r10.U = r5
                r10.Q = r4
                r10.R = r1
                r10.T = r3
                java.lang.Object r11 = r5.a(r1, r10)
                if (r11 != r0) goto L_0x005f
                return r0
            L_0x005f:
                r11 = r10
            L_0x0060:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x008f
                we.q<java.lang.Integer, S, T, S> r6 = r11.W
                int r7 = r3 + 1
                if (r3 >= 0) goto L_0x006f
                be.w.W()
            L_0x006f:
                java.lang.Integer r3 = le.b.f(r3)
                java.lang.Object r8 = r4.next()
                java.lang.Object r3 = r6.y(r3, r1, r8)
                r11.U = r5
                r11.Q = r4
                r11.R = r3
                r11.S = r7
                r11.T = r2
                java.lang.Object r1 = r5.a(r3, r11)
                if (r1 != r0) goto L_0x008c
                return r0
            L_0x008c:
                r1 = r3
                r3 = r7
                goto L_0x0060
            L_0x008f:
                zd.u2 r11 = zd.u2.f25116a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p000if.u.w.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: N */
        public final Object g0(@fh.g o<? super S> oVar, @fh.h ie.d<? super u2> dVar) {
            return ((w) H(oVar, dVar)).K(u2.f25116a);
        }
    }

    /* renamed from: if.u$x */
    public static final class x implements m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m<T> f19736a;

        public x(m<? extends T> mVar) {
            this.f19736a = mVar;
        }

        @fh.g
        public Iterator<T> iterator() {
            List<T> d32 = u.d3(this.f19736a);
            be.a0.j0(d32);
            return d32.iterator();
        }
    }

    /* renamed from: if.u$y */
    public static final class y implements m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m<T> f19737a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Comparator<? super T> f19738b;

        public y(m<? extends T> mVar, Comparator<? super T> comparator) {
            this.f19737a = mVar;
            this.f19738b = comparator;
        }

        @fh.g
        public Iterator<T> iterator() {
            List<T> d32 = u.d3(this.f19737a);
            be.a0.m0(d32, this.f19738b);
            return d32.iterator();
        }
    }

    /* renamed from: if.u$z */
    public static final class z extends n0 implements we.p<T, R, u0<? extends T, ? extends R>> {
        public static final z P = new z();

        public z() {
            super(2);
        }

        @fh.g
        /* renamed from: c */
        public final u0<T, R> g0(T t10, R r10) {
            return r1.a(t10, r10);
        }
    }

    @oe.f
    public static final <T> T A0(m<? extends T> mVar, we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        T t10 = null;
        for (T next : mVar) {
            if (lVar.A(next).booleanValue()) {
                t10 = next;
            }
        }
        return t10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T, R> R A1(m<? extends T> mVar, Comparator<? super R> comparator, we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            R A = lVar.A(it.next());
            while (it.hasNext()) {
                R A2 = lVar.A(it.next());
                if (comparator.compare(A, A2) < 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.g
    public static final <T, R> m<R> A2(@fh.g m<? extends T> mVar, R r10, @fh.g we.p<? super R, ? super T, ? extends R> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "operation");
        return w2(mVar, r10, pVar);
    }

    public static final <T> T B0(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T, R> R B1(m<? extends T> mVar, Comparator<? super R> comparator, we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R A = lVar.A(it.next());
        while (it.hasNext()) {
            R A2 = lVar.A(it.next());
            if (comparator.compare(A, A2) < 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.g
    public static final <T, R> m<R> B2(@fh.g m<? extends T> mVar, R r10, @fh.g we.q<? super Integer, ? super R, ? super T, ? extends R> qVar) {
        l0.p(mVar, "<this>");
        l0.p(qVar, "operation");
        return x2(mVar, r10, qVar);
    }

    public static final <T> T C0(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        for (T next : mVar) {
            if (lVar.A(next).booleanValue()) {
                return next;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @h1(version = "1.4")
    @fh.h
    public static final <T extends Comparable<? super T>> T C1(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t10 = (Comparable) it.next();
        while (it.hasNext()) {
            T t11 = (Comparable) it.next();
            if (t10.compareTo(t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    public static final <T> T C2(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @h1(version = "1.5")
    @oe.f
    public static final <T, R> R D0(m<? extends T> mVar, we.l<? super T, ? extends R> lVar) {
        R r10;
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                r10 = null;
                break;
            }
            r10 = lVar.A(it.next());
            if (r10 != null) {
                break;
            }
        }
        if (r10 != null) {
            return r10;
        }
        throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
    }

    @h1(version = "1.4")
    @fh.h
    public static final Double D1(@fh.g m<Double> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static final <T> T D2(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T next : mVar) {
            if (lVar.A(next).booleanValue()) {
                if (!z10) {
                    z10 = true;
                    t10 = next;
                } else {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @h1(version = "1.5")
    @oe.f
    public static final <T, R> R E0(m<? extends T> mVar, we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        for (Object A : mVar) {
            R A2 = lVar.A(A);
            if (A2 != null) {
                return A2;
            }
        }
        return null;
    }

    @h1(version = "1.4")
    @fh.h
    public static final Float E1(@fh.g m<Float> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @fh.h
    public static final <T> T E2(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @fh.h
    public static final <T> T F0(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    @h1(version = "1.7")
    @ve.h(name = "maxOrThrow")
    public static final double F1(@fh.g m<Double> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @fh.h
    public static final <T> T F2(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        boolean z10 = false;
        T t10 = null;
        for (T next : mVar) {
            if (lVar.A(next).booleanValue()) {
                if (z10) {
                    return null;
                }
                z10 = true;
                t10 = next;
            }
        }
        if (!z10) {
            return null;
        }
        return t10;
    }

    @fh.h
    public static final <T> T G0(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        for (T next : mVar) {
            if (lVar.A(next).booleanValue()) {
                return next;
            }
        }
        return null;
    }

    @h1(version = "1.7")
    @ve.h(name = "maxOrThrow")
    public static final float G1(@fh.g m<Float> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @fh.g
    public static final <T extends Comparable<? super T>> m<T> G2(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return new x(mVar);
    }

    @fh.g
    public static final <T, R> m<R> H0(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, ? extends m<? extends R>> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        return new i(mVar, lVar, i.X);
    }

    @h1(version = "1.7")
    @fh.g
    @ve.h(name = "maxOrThrow")
    public static final <T extends Comparable<? super T>> T H1(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T t10 = (Comparable) it.next();
            while (it.hasNext()) {
                T t11 = (Comparable) it.next();
                if (t10.compareTo(t11) < 0) {
                    t10 = t11;
                }
            }
            return t10;
        }
        throw new NoSuchElementException();
    }

    @fh.g
    public static final <T, R extends Comparable<? super R>> m<T> H2(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        return K2(mVar, new g.a(lVar));
    }

    @h1(version = "1.4")
    @fh.g
    @t0
    @ve.h(name = "flatMapIndexedIterable")
    public static final <T, R> m<R> I0(@fh.g m<? extends T> mVar, @fh.g we.p<? super Integer, ? super T, ? extends Iterable<? extends R>> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "transform");
        return s.h(mVar, pVar, j.X);
    }

    @h1(version = "1.4")
    @fh.h
    public static final <T> T I1(@fh.g m<? extends T> mVar, @fh.g Comparator<? super T> comparator) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @fh.g
    public static final <T, R extends Comparable<? super R>> m<T> I2(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        return K2(mVar, new g.c(lVar));
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterableTo")
    public static final <T, R, C extends Collection<? super R>> C J0(m<? extends T> mVar, C c10, we.p<? super Integer, ? super T, ? extends Iterable<? extends R>> pVar) {
        l0.p(mVar, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int i10 = 0;
        for (Object next : mVar) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                be.w.W();
            }
            be.b0.o0(c10, (Iterable) pVar.g0(Integer.valueOf(i10), next));
            i10 = i11;
        }
        return c10;
    }

    @h1(version = "1.7")
    @ve.h(name = "maxWithOrThrow")
    public static final <T> T J1(@fh.g m<? extends T> mVar, @fh.g Comparator<? super T> comparator) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (comparator.compare(next, next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @fh.g
    public static final <T extends Comparable<? super T>> m<T> J2(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return K2(mVar, fe.g.x());
    }

    public static final <T> boolean K(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        for (Object A : mVar) {
            if (!lVar.A(A).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.4")
    @fh.g
    @t0
    @ve.h(name = "flatMapIndexedSequence")
    public static final <T, R> m<R> K0(@fh.g m<? extends T> mVar, @fh.g we.p<? super Integer, ? super T, ? extends m<? extends R>> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "transform");
        return s.h(mVar, pVar, k.X);
    }

    @h1(version = "1.4")
    @fh.h
    public static final <T, R extends Comparable<? super R>> T K1(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) lVar.A(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) lVar.A(next2);
            if (comparable.compareTo(comparable2) > 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    @fh.g
    public static final <T> m<T> K2(@fh.g m<? extends T> mVar, @fh.g Comparator<? super T> comparator) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        return new y(mVar, comparator);
    }

    public static final <T> boolean L(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return mVar.iterator().hasNext();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedSequenceTo")
    public static final <T, R, C extends Collection<? super R>> C L0(m<? extends T> mVar, C c10, we.p<? super Integer, ? super T, ? extends m<? extends R>> pVar) {
        l0.p(mVar, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int i10 = 0;
        for (Object next : mVar) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                be.w.W();
            }
            be.b0.n0(c10, (m) pVar.g0(Integer.valueOf(i10), next));
            i10 = i11;
        }
        return c10;
    }

    @h1(version = "1.7")
    @ve.h(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T L1(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            Comparable comparable = (Comparable) lVar.A(next);
            do {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) lVar.A(next2);
                if (comparable.compareTo(comparable2) > 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException();
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> int L2(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Integer> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (Object A : mVar) {
            i10 += lVar.A(A).intValue();
        }
        return i10;
    }

    public static final <T> boolean M(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        for (Object A : mVar) {
            if (lVar.A(A).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @h1(version = "1.4")
    @fh.g
    @t0
    @ve.h(name = "flatMapIterable")
    public static final <T, R> m<R> M0(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, ? extends Iterable<? extends R>> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        return new i(mVar, lVar, h.X);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T> double M1(m<? extends T> mVar, we.l<? super T, Double> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.A(it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.A(it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> double M2(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Double> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (Object A : mVar) {
            d10 += lVar.A(A).doubleValue();
        }
        return d10;
    }

    @fh.g
    public static final <T> Iterable<T> N(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return new a(mVar);
    }

    @h1(version = "1.4")
    @fh.g
    @t0
    @ve.h(name = "flatMapIterableTo")
    public static final <T, R, C extends Collection<? super R>> C N0(@fh.g m<? extends T> mVar, @fh.g C c10, @fh.g we.l<? super T, ? extends Iterable<? extends R>> lVar) {
        l0.p(mVar, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (Object A : mVar) {
            be.b0.o0(c10, (Iterable) lVar.A(A));
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T> float N1(m<? extends T> mVar, we.l<? super T, Float> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = lVar.A(it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, lVar.A(it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @ve.h(name = "sumOfByte")
    public static final int N2(@fh.g m<Byte> mVar) {
        l0.p(mVar, "<this>");
        int i10 = 0;
        for (Byte byteValue : mVar) {
            i10 += byteValue.byteValue();
        }
        return i10;
    }

    @oe.f
    public static final <T> m<T> O(m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return mVar;
    }

    @fh.g
    public static final <T, R, C extends Collection<? super R>> C O0(@fh.g m<? extends T> mVar, @fh.g C c10, @fh.g we.l<? super T, ? extends m<? extends R>> lVar) {
        l0.p(mVar, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (Object A : mVar) {
            be.b0.n0(c10, (m) lVar.A(A));
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T, R extends Comparable<? super R>> R O1(m<? extends T> mVar, we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            R r10 = (Comparable) lVar.A(it.next());
            while (it.hasNext()) {
                R r11 = (Comparable) lVar.A(it.next());
                if (r10.compareTo(r11) > 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @ve.h(name = "sumOfDouble")
    public static final double O2(@fh.g m<Double> mVar) {
        l0.p(mVar, "<this>");
        double d10 = 0.0d;
        for (Double doubleValue : mVar) {
            d10 += doubleValue.doubleValue();
        }
        return d10;
    }

    @fh.g
    public static final <T, K, V> Map<K, V> P(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object A : mVar) {
            u0 u0Var = (u0) lVar.A(A);
            linkedHashMap.put(u0Var.e(), u0Var.f());
        }
        return linkedHashMap;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [we.p, we.p<? super R, ? super T, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R P0(@fh.g p000if.m<? extends T> r1, R r2, @fh.g we.p<? super R, ? super T, ? extends R> r3) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r1, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r3, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r1.next()
            java.lang.Object r2 = r3.g0(r2, r0)
            goto L_0x000e
        L_0x001d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000if.u.P0(if.m, java.lang.Object, we.p):java.lang.Object");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T, R extends Comparable<? super R>> R P1(m<? extends T> mVar, we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R r10 = (Comparable) lVar.A(it.next());
        while (it.hasNext()) {
            R r11 = (Comparable) lVar.A(it.next());
            if (r10.compareTo(r11) > 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfDouble")
    public static final <T> double P2(m<? extends T> mVar, we.l<? super T, Double> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (Object A : mVar) {
            d10 += lVar.A(A).doubleValue();
        }
        return d10;
    }

    @fh.g
    public static final <T, K> Map<K, T> Q(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, ? extends K> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : mVar) {
            linkedHashMap.put(lVar.A(next), next);
        }
        return linkedHashMap;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super T, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R Q0(@fh.g p000if.m<? extends T> r3, R r4, @fh.g we.q<? super java.lang.Integer, ? super R, ? super T, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L_0x000f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x002a
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L_0x0020
            be.w.W()
        L_0x0020:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r4 = r5.y(r0, r4, r1)
            r0 = r2
            goto L_0x000f
        L_0x002a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000if.u.Q0(if.m, java.lang.Object, we.q):java.lang.Object");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T> Double Q1(m<? extends T> mVar, we.l<? super T, Double> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = lVar.A(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.A(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @ve.h(name = "sumOfFloat")
    public static final float Q2(@fh.g m<Float> mVar) {
        l0.p(mVar, "<this>");
        float f10 = 0.0f;
        for (Float floatValue : mVar) {
            f10 += floatValue.floatValue();
        }
        return f10;
    }

    @fh.g
    public static final <T, K, V> Map<K, V> R(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, ? extends K> lVar, @fh.g we.l<? super T, ? extends V> lVar2) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : mVar) {
            linkedHashMap.put(lVar.A(next), lVar2.A(next));
        }
        return linkedHashMap;
    }

    public static final <T> void R0(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, u2> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "action");
        for (Object A : mVar) {
            lVar.A(A);
        }
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T> Float R1(m<? extends T> mVar, we.l<? super T, Float> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = lVar.A(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.A(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @ve.h(name = "sumOfInt")
    public static final int R2(@fh.g m<Integer> mVar) {
        l0.p(mVar, "<this>");
        int i10 = 0;
        for (Integer intValue : mVar) {
            i10 += intValue.intValue();
        }
        return i10;
    }

    @fh.g
    public static final <T, K, M extends Map<? super K, ? super T>> M S(@fh.g m<? extends T> mVar, @fh.g M m10, @fh.g we.l<? super T, ? extends K> lVar) {
        l0.p(mVar, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (Object next : mVar) {
            m10.put(lVar.A(next), next);
        }
        return m10;
    }

    public static final <T> void S0(@fh.g m<? extends T> mVar, @fh.g we.p<? super Integer, ? super T, u2> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "action");
        int i10 = 0;
        for (Object next : mVar) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                be.w.W();
            }
            pVar.g0(Integer.valueOf(i10), next);
            i10 = i11;
        }
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T, R> R S1(m<? extends T> mVar, Comparator<? super R> comparator, we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            R A = lVar.A(it.next());
            while (it.hasNext()) {
                R A2 = lVar.A(it.next());
                if (comparator.compare(A, A2) > 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfInt")
    public static final <T> int S2(m<? extends T> mVar, we.l<? super T, Integer> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (Object A : mVar) {
            i10 += lVar.A(A).intValue();
        }
        return i10;
    }

    @fh.g
    public static final <T, K, V, M extends Map<? super K, ? super V>> M T(@fh.g m<? extends T> mVar, @fh.g M m10, @fh.g we.l<? super T, ? extends K> lVar, @fh.g we.l<? super T, ? extends V> lVar2) {
        l0.p(mVar, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (Object next : mVar) {
            m10.put(lVar.A(next), lVar2.A(next));
        }
        return m10;
    }

    @fh.g
    public static final <T, K> Map<K, List<T>> T0(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, ? extends K> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : mVar) {
            Object A = lVar.A(next);
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(next);
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T, R> R T1(m<? extends T> mVar, Comparator<? super R> comparator, we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R A = lVar.A(it.next());
        while (it.hasNext()) {
            R A2 = lVar.A(it.next());
            if (comparator.compare(A, A2) > 0) {
                A = A2;
            }
        }
        return A;
    }

    @ve.h(name = "sumOfLong")
    public static final long T2(@fh.g m<Long> mVar) {
        l0.p(mVar, "<this>");
        long j10 = 0;
        for (Long longValue : mVar) {
            j10 += longValue.longValue();
        }
        return j10;
    }

    @fh.g
    public static final <T, K, V, M extends Map<? super K, ? super V>> M U(@fh.g m<? extends T> mVar, @fh.g M m10, @fh.g we.l<? super T, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(mVar, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "transform");
        for (Object A : mVar) {
            u0 u0Var = (u0) lVar.A(A);
            m10.put(u0Var.e(), u0Var.f());
        }
        return m10;
    }

    @fh.g
    public static final <T, K, V> Map<K, List<V>> U0(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, ? extends K> lVar, @fh.g we.l<? super T, ? extends V> lVar2) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : mVar) {
            Object A = lVar.A(next);
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(lVar2.A(next));
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @fh.h
    public static final <T extends Comparable<? super T>> T U1(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t10 = (Comparable) it.next();
        while (it.hasNext()) {
            T t11 = (Comparable) it.next();
            if (t10.compareTo(t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfLong")
    public static final <T> long U2(m<? extends T> mVar, we.l<? super T, Long> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        long j10 = 0;
        for (Object A : mVar) {
            j10 += lVar.A(A).longValue();
        }
        return j10;
    }

    @fh.g
    @h1(version = "1.3")
    public static final <K, V> Map<K, V> V(@fh.g m<? extends K> mVar, @fh.g we.l<? super K, ? extends V> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : mVar) {
            linkedHashMap.put(next, lVar.A(next));
        }
        return linkedHashMap;
    }

    @fh.g
    public static final <T, K, M extends Map<? super K, List<T>>> M V0(@fh.g m<? extends T> mVar, @fh.g M m10, @fh.g we.l<? super T, ? extends K> lVar) {
        l0.p(mVar, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (Object next : mVar) {
            Object A = lVar.A(next);
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(next);
        }
        return m10;
    }

    @h1(version = "1.4")
    @fh.h
    public static final Double V1(@fh.g m<Double> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @ve.h(name = "sumOfShort")
    public static final int V2(@fh.g m<Short> mVar) {
        l0.p(mVar, "<this>");
        int i10 = 0;
        for (Short shortValue : mVar) {
            i10 += shortValue.shortValue();
        }
        return i10;
    }

    @fh.g
    @h1(version = "1.3")
    public static final <K, V, M extends Map<? super K, ? super V>> M W(@fh.g m<? extends K> mVar, @fh.g M m10, @fh.g we.l<? super K, ? extends V> lVar) {
        l0.p(mVar, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "valueSelector");
        for (Object next : mVar) {
            m10.put(next, lVar.A(next));
        }
        return m10;
    }

    @fh.g
    public static final <T, K, V, M extends Map<? super K, List<V>>> M W0(@fh.g m<? extends T> mVar, @fh.g M m10, @fh.g we.l<? super T, ? extends K> lVar, @fh.g we.l<? super T, ? extends V> lVar2) {
        l0.p(mVar, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (Object next : mVar) {
            Object A = lVar.A(next);
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(lVar2.A(next));
        }
        return m10;
    }

    @h1(version = "1.4")
    @fh.h
    public static final Float W1(@fh.g m<Float> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfUInt")
    public static final <T> int W2(m<? extends T> mVar, we.l<? super T, e2> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        int l10 = e2.l(0);
        for (Object A : mVar) {
            l10 = e2.l(l10 + lVar.A(A).l0());
        }
        return l10;
    }

    @ve.h(name = "averageOfByte")
    public static final double X(@fh.g m<Byte> mVar) {
        l0.p(mVar, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Byte byteValue : mVar) {
            d10 += (double) byteValue.byteValue();
            i10++;
            if (i10 < 0) {
                be.w.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @fh.g
    @h1(version = "1.1")
    public static final <T, K> be.l0<T, K> X0(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, ? extends K> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "keySelector");
        return new l(mVar, lVar);
    }

    @h1(version = "1.7")
    @ve.h(name = "minOrThrow")
    public static final double X1(@fh.g m<Double> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfULong")
    public static final <T> long X2(m<? extends T> mVar, we.l<? super T, j2> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        long l10 = j2.l(0);
        for (Object A : mVar) {
            l10 = j2.l(l10 + lVar.A(A).l0());
        }
        return l10;
    }

    @ve.h(name = "averageOfDouble")
    public static final double Y(@fh.g m<Double> mVar) {
        l0.p(mVar, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Double doubleValue : mVar) {
            d10 += doubleValue.doubleValue();
            i10++;
            if (i10 < 0) {
                be.w.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    public static final <T> int Y0(@fh.g m<? extends T> mVar, T t10) {
        l0.p(mVar, "<this>");
        int i10 = 0;
        for (Object next : mVar) {
            if (i10 < 0) {
                be.w.W();
            }
            if (l0.g(t10, next)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @h1(version = "1.7")
    @ve.h(name = "minOrThrow")
    public static final float Y1(@fh.g m<Float> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @fh.g
    public static final <T> m<T> Y2(@fh.g m<? extends T> mVar, int i10) {
        l0.p(mVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? s.g() : mVar instanceof e ? ((e) mVar).a(i10) : new w(mVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @ve.h(name = "averageOfFloat")
    public static final double Z(@fh.g m<Float> mVar) {
        l0.p(mVar, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Float floatValue : mVar) {
            d10 += (double) floatValue.floatValue();
            i10++;
            if (i10 < 0) {
                be.w.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    public static final <T> int Z0(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        int i10 = 0;
        for (Object next : mVar) {
            if (i10 < 0) {
                be.w.W();
            }
            if (lVar.A(next).booleanValue()) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @h1(version = "1.7")
    @fh.g
    @ve.h(name = "minOrThrow")
    public static final <T extends Comparable<? super T>> T Z1(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T t10 = (Comparable) it.next();
            while (it.hasNext()) {
                T t11 = (Comparable) it.next();
                if (t10.compareTo(t11) > 0) {
                    t10 = t11;
                }
            }
            return t10;
        }
        throw new NoSuchElementException();
    }

    @fh.g
    public static final <T> m<T> Z2(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        return new x(mVar, lVar);
    }

    @ve.h(name = "averageOfInt")
    public static final double a0(@fh.g m<Integer> mVar) {
        l0.p(mVar, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Integer intValue : mVar) {
            d10 += (double) intValue.intValue();
            i10++;
            if (i10 < 0) {
                be.w.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    public static final <T> int a1(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        int i10 = -1;
        int i11 = 0;
        for (Object next : mVar) {
            if (i11 < 0) {
                be.w.W();
            }
            if (lVar.A(next).booleanValue()) {
                i10 = i11;
            }
            i11++;
        }
        return i10;
    }

    @h1(version = "1.4")
    @fh.h
    public static final <T> T a2(@fh.g m<? extends T> mVar, @fh.g Comparator<? super T> comparator) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @fh.g
    public static final <T, C extends Collection<? super T>> C a3(@fh.g m<? extends T> mVar, @fh.g C c10) {
        l0.p(mVar, "<this>");
        l0.p(c10, "destination");
        for (Object add : mVar) {
            c10.add(add);
        }
        return c10;
    }

    @ve.h(name = "averageOfLong")
    public static final double b0(@fh.g m<Long> mVar) {
        l0.p(mVar, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Long longValue : mVar) {
            d10 += (double) longValue.longValue();
            i10++;
            if (i10 < 0) {
                be.w.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @fh.g
    public static final <T, A extends Appendable> A b1(@fh.g m<? extends T> mVar, @fh.g A a10, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super T, ? extends CharSequence> lVar) {
        l0.p(mVar, "<this>");
        l0.p(a10, "buffer");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (Object next : mVar) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            lf.t.b(a10, next, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    @h1(version = "1.7")
    @ve.h(name = "minWithOrThrow")
    public static final <T> T b2(@fh.g m<? extends T> mVar, @fh.g Comparator<? super T> comparator) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (comparator.compare(next, next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @fh.g
    public static final <T> HashSet<T> b3(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return (HashSet) a3(mVar, new HashSet());
    }

    @ve.h(name = "averageOfShort")
    public static final double c0(@fh.g m<Short> mVar) {
        l0.p(mVar, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Short shortValue : mVar) {
            d10 += (double) shortValue.shortValue();
            i10++;
            if (i10 < 0) {
                be.w.V();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    public static /* synthetic */ Appendable c1(m mVar, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return b1(mVar, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    @fh.g
    public static final <T> m<T> c2(@fh.g m<? extends T> mVar, @fh.g m<? extends T> mVar2) {
        l0.p(mVar, "<this>");
        l0.p(mVar2, "elements");
        return new p(mVar2, mVar);
    }

    @fh.g
    public static final <T> List<T> c3(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return be.w.Q(d3(mVar));
    }

    @fh.g
    @h1(version = "1.2")
    public static final <T> m<List<T>> d0(@fh.g m<? extends T> mVar, int i10) {
        l0.p(mVar, "<this>");
        return g3(mVar, i10, i10, true);
    }

    @fh.g
    public static final <T> String d1(@fh.g m<? extends T> mVar, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super T, ? extends CharSequence> lVar) {
        l0.p(mVar, "<this>");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        String sb2 = ((StringBuilder) b1(mVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        l0.o(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    @fh.g
    public static final <T> m<T> d2(@fh.g m<? extends T> mVar, @fh.g Iterable<? extends T> iterable) {
        l0.p(mVar, "<this>");
        l0.p(iterable, "elements");
        return new o(iterable, mVar);
    }

    @fh.g
    public static final <T> List<T> d3(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return (List) a3(mVar, new ArrayList());
    }

    @fh.g
    @h1(version = "1.2")
    public static final <T, R> m<R> e0(@fh.g m<? extends T> mVar, int i10, @fh.g we.l<? super List<? extends T>, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        return h3(mVar, i10, i10, true, lVar);
    }

    public static /* synthetic */ String e1(m mVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return d1(mVar, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    @fh.g
    public static final <T> m<T> e2(@fh.g m<? extends T> mVar, T t10) {
        l0.p(mVar, "<this>");
        return new m(mVar, t10);
    }

    @fh.g
    public static final <T> Set<T> e3(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object add : mVar) {
            linkedHashSet.add(add);
        }
        return linkedHashSet;
    }

    public static final <T> boolean f0(@fh.g m<? extends T> mVar, T t10) {
        l0.p(mVar, "<this>");
        return Y0(mVar, t10) >= 0;
    }

    public static final <T> T f1(@fh.g m<? extends T> mVar) {
        T next;
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @fh.g
    public static final <T> m<T> f2(@fh.g m<? extends T> mVar, @fh.g T[] tArr) {
        l0.p(mVar, "<this>");
        l0.p(tArr, "elements");
        return tArr.length == 0 ? mVar : new n(mVar, tArr);
    }

    @fh.g
    public static final <T> Set<T> f3(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return l1.r((Set) a3(mVar, new LinkedHashSet()));
    }

    public static final <T> int g0(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                be.w.V();
            }
        }
        return i10;
    }

    public static final <T> T g1(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T next : mVar) {
            if (lVar.A(next).booleanValue()) {
                z10 = true;
                t10 = next;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @oe.f
    public static final <T> m<T> g2(m<? extends T> mVar, T t10) {
        l0.p(mVar, "<this>");
        return e2(mVar, t10);
    }

    @fh.g
    @h1(version = "1.2")
    public static final <T> m<List<T>> g3(@fh.g m<? extends T> mVar, int i10, int i11, boolean z10) {
        l0.p(mVar, "<this>");
        return o1.c(mVar, i10, i11, z10, false);
    }

    public static final <T> int h0(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        int i10 = 0;
        for (Object A : mVar) {
            if (lVar.A(A).booleanValue() && (i10 = i10 + 1) < 0) {
                be.w.V();
            }
        }
        return i10;
    }

    public static final <T> int h1(@fh.g m<? extends T> mVar, T t10) {
        l0.p(mVar, "<this>");
        int i10 = -1;
        int i11 = 0;
        for (Object next : mVar) {
            if (i11 < 0) {
                be.w.W();
            }
            if (l0.g(t10, next)) {
                i10 = i11;
            }
            i11++;
        }
        return i10;
    }

    public static final <T> boolean h2(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return !mVar.iterator().hasNext();
    }

    @fh.g
    @h1(version = "1.2")
    public static final <T, R> m<R> h3(@fh.g m<? extends T> mVar, int i10, int i11, boolean z10, @fh.g we.l<? super List<? extends T>, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        return k1(o1.c(mVar, i10, i11, z10, true), lVar);
    }

    @fh.g
    public static final <T> m<T> i0(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return j0(mVar, b.P);
    }

    @fh.h
    public static final <T> T i1(@fh.g m<? extends T> mVar) {
        T next;
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static final <T> boolean i2(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        for (Object A : mVar) {
            if (lVar.A(A).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ m i3(m mVar, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return g3(mVar, i10, i11, z10);
    }

    @fh.g
    public static final <T, K> m<T> j0(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, ? extends K> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        return new c(mVar, lVar);
    }

    @fh.h
    public static final <T> T j1(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        T t10 = null;
        for (T next : mVar) {
            if (lVar.A(next).booleanValue()) {
                t10 = next;
            }
        }
        return t10;
    }

    @fh.g
    @h1(version = "1.1")
    public static final <T> m<T> j2(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, u2> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "action");
        return k1(mVar, new q(lVar));
    }

    public static /* synthetic */ m j3(m mVar, int i10, int i11, boolean z10, we.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return h3(mVar, i10, i11, z10, lVar);
    }

    @fh.g
    public static final <T> m<T> k0(@fh.g m<? extends T> mVar, int i10) {
        l0.p(mVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? mVar : mVar instanceof e ? ((e) mVar).b(i10) : new d(mVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <T, R> m<R> k1(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        return new z(mVar, lVar);
    }

    @fh.g
    @h1(version = "1.4")
    public static final <T> m<T> k2(@fh.g m<? extends T> mVar, @fh.g we.p<? super Integer, ? super T, u2> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "action");
        return l1(mVar, new r(pVar));
    }

    @fh.g
    public static final <T> m<p0<T>> k3(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return new k(mVar);
    }

    @fh.g
    public static final <T> m<T> l0(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        return new f(mVar, lVar);
    }

    @fh.g
    public static final <T, R> m<R> l1(@fh.g m<? extends T> mVar, @fh.g we.p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "transform");
        return new y(mVar, pVar);
    }

    @fh.g
    public static final <T> u0<List<T>, List<T>> l2(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : mVar) {
            if (lVar.A(next).booleanValue()) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        return new u0<>(arrayList, arrayList2);
    }

    @fh.g
    public static final <T, R> m<u0<T, R>> l3(@fh.g m<? extends T> mVar, @fh.g m<? extends R> mVar2) {
        l0.p(mVar, "<this>");
        l0.p(mVar2, "other");
        return new l(mVar, mVar2, z.P);
    }

    public static final <T> T m0(@fh.g m<? extends T> mVar, int i10) {
        l0.p(mVar, "<this>");
        return n0(mVar, i10, new c(i10));
    }

    @fh.g
    public static final <T, R> m<R> m1(@fh.g m<? extends T> mVar, @fh.g we.p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "transform");
        return v0(new y(mVar, pVar));
    }

    @fh.g
    public static final <T> m<T> m2(@fh.g m<? extends T> mVar, @fh.g m<? extends T> mVar2) {
        l0.p(mVar, "<this>");
        l0.p(mVar2, "elements");
        return s.i(s.q(mVar, mVar2));
    }

    @fh.g
    public static final <T, R, V> m<V> m3(@fh.g m<? extends T> mVar, @fh.g m<? extends R> mVar2, @fh.g we.p<? super T, ? super R, ? extends V> pVar) {
        l0.p(mVar, "<this>");
        l0.p(mVar2, "other");
        l0.p(pVar, "transform");
        return new l(mVar, mVar2, pVar);
    }

    public static final <T> T n0(@fh.g m<? extends T> mVar, int i10, @fh.g we.l<? super Integer, ? extends T> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "defaultValue");
        if (i10 >= 0) {
            int i11 = 0;
            for (T next : mVar) {
                int i12 = i11 + 1;
                if (i10 == i11) {
                    return next;
                }
                i11 = i12;
            }
        }
        return lVar.A(Integer.valueOf(i10));
    }

    @fh.g
    public static final <T, R, C extends Collection<? super R>> C n1(@fh.g m<? extends T> mVar, @fh.g C c10, @fh.g we.p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(mVar, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int i10 = 0;
        for (Object next : mVar) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                be.w.W();
            }
            Object g02 = pVar.g0(Integer.valueOf(i10), next);
            if (g02 != null) {
                c10.add(g02);
            }
            i10 = i11;
        }
        return c10;
    }

    @fh.g
    public static final <T> m<T> n2(@fh.g m<? extends T> mVar, @fh.g Iterable<? extends T> iterable) {
        l0.p(mVar, "<this>");
        l0.p(iterable, "elements");
        return s.i(s.q(mVar, e0.v1(iterable)));
    }

    @fh.g
    @h1(version = "1.2")
    public static final <T> m<u0<T, T>> n3(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return o3(mVar, a0.P);
    }

    @fh.h
    public static final <T> T o0(@fh.g m<? extends T> mVar, int i10) {
        l0.p(mVar, "<this>");
        if (i10 < 0) {
            return null;
        }
        int i11 = 0;
        for (T next : mVar) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return next;
            }
            i11 = i12;
        }
        return null;
    }

    @fh.g
    public static final <T, R, C extends Collection<? super R>> C o1(@fh.g m<? extends T> mVar, @fh.g C c10, @fh.g we.p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(mVar, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int i10 = 0;
        for (Object next : mVar) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                be.w.W();
            }
            c10.add(pVar.g0(Integer.valueOf(i10), next));
            i10 = i11;
        }
        return c10;
    }

    @fh.g
    public static final <T> m<T> o2(@fh.g m<? extends T> mVar, T t10) {
        l0.p(mVar, "<this>");
        return s.i(s.q(mVar, s.q(t10)));
    }

    @fh.g
    @h1(version = "1.2")
    public static final <T, R> m<R> o3(@fh.g m<? extends T> mVar, @fh.g we.p<? super T, ? super T, ? extends R> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "transform");
        return q.b(new b0(mVar, pVar, (ie.d<? super b0>) null));
    }

    @fh.g
    public static final <T> m<T> p0(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        return new h(mVar, true, lVar);
    }

    @fh.g
    public static final <T, R> m<R> p1(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        return v0(new z(mVar, lVar));
    }

    @fh.g
    public static final <T> m<T> p2(@fh.g m<? extends T> mVar, @fh.g T[] tArr) {
        l0.p(mVar, "<this>");
        l0.p(tArr, "elements");
        return n2(mVar, be.o.t(tArr));
    }

    @fh.g
    public static final <T> m<T> q0(@fh.g m<? extends T> mVar, @fh.g we.p<? super Integer, ? super T, Boolean> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "predicate");
        return new z(new h(new k(mVar), true, new d(pVar)), e.P);
    }

    @fh.g
    public static final <T, R, C extends Collection<? super R>> C q1(@fh.g m<? extends T> mVar, @fh.g C c10, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (Object A : mVar) {
            Object A2 = lVar.A(A);
            if (A2 != null) {
                c10.add(A2);
            }
        }
        return c10;
    }

    @oe.f
    public static final <T> m<T> q2(m<? extends T> mVar, T t10) {
        l0.p(mVar, "<this>");
        return o2(mVar, t10);
    }

    @fh.g
    public static final <T, C extends Collection<? super T>> C r0(@fh.g m<? extends T> mVar, @fh.g C c10, @fh.g we.p<? super Integer, ? super T, Boolean> pVar) {
        l0.p(mVar, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "predicate");
        int i10 = 0;
        for (Object next : mVar) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                be.w.W();
            }
            if (pVar.g0(Integer.valueOf(i10), next).booleanValue()) {
                c10.add(next);
            }
            i10 = i11;
        }
        return c10;
    }

    @fh.g
    public static final <T, R, C extends Collection<? super R>> C r1(@fh.g m<? extends T> mVar, @fh.g C c10, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (Object A : mVar) {
            c10.add(lVar.A(A));
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [we.p, we.p<? super S, ? super T, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S r2(@fh.g p000if.m<? extends T> r2, @fh.g we.p<? super S, ? super T, ? extends S> r3) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r2.next()
        L_0x0018:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r3.g0(r0, r1)
            goto L_0x0018
        L_0x0027:
            return r0
        L_0x0028:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Empty sequence can't be reduced."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000if.u.r2(if.m, we.p):java.lang.Object");
    }

    public static final /* synthetic */ <R> m<R> s0(m<?> mVar) {
        l0.p(mVar, "<this>");
        l0.w();
        m<R> p02 = p0(mVar, f.P);
        l0.n(p02, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return p02;
    }

    @h1(version = "1.4")
    @fh.h
    public static final <T, R extends Comparable<? super R>> T s1(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) lVar.A(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) lVar.A(next2);
            if (comparable.compareTo(comparable2) < 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.q, we.q<? super java.lang.Integer, ? super S, ? super T, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S s2(@fh.g p000if.m<? extends T> r4, @fh.g we.q<? super java.lang.Integer, ? super S, ? super T, ? extends S> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r4.next()
            r1 = 1
        L_0x0019:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0034
            int r2 = r1 + 1
            if (r1 >= 0) goto L_0x0026
            be.w.W()
        L_0x0026:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r4.next()
            java.lang.Object r0 = r5.y(r1, r0, r3)
            r1 = r2
            goto L_0x0019
        L_0x0034:
            return r0
        L_0x0035:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "Empty sequence can't be reduced."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000if.u.s2(if.m, we.q):java.lang.Object");
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C t0(m<?> mVar, C c10) {
        l0.p(mVar, "<this>");
        l0.p(c10, "destination");
        for (Object next : mVar) {
            l0.y(3, "R");
            if (next instanceof Object) {
                c10.add(next);
            }
        }
        return c10;
    }

    @h1(version = "1.7")
    @ve.h(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T t1(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            Comparable comparable = (Comparable) lVar.A(next);
            do {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) lVar.A(next2);
                if (comparable.compareTo(comparable2) < 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.q, we.q<? super java.lang.Integer, ? super S, ? super T, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S t2(@fh.g p000if.m<? extends T> r4, @fh.g we.q<? super java.lang.Integer, ? super S, ? super T, ? extends S> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L_0x0016
            r4 = 0
            return r4
        L_0x0016:
            java.lang.Object r0 = r4.next()
            r1 = 1
        L_0x001b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0036
            int r2 = r1 + 1
            if (r1 >= 0) goto L_0x0028
            be.w.W()
        L_0x0028:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r4.next()
            java.lang.Object r0 = r5.y(r1, r0, r3)
            r1 = r2
            goto L_0x001b
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000if.u.t2(if.m, we.q):java.lang.Object");
    }

    @fh.g
    public static final <T> m<T> u0(@fh.g m<? extends T> mVar, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        return new h(mVar, false, lVar);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T> double u1(m<? extends T> mVar, we.l<? super T, Double> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.A(it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.A(it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [we.p, we.p<? super S, ? super T, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S u2(@fh.g p000if.m<? extends T> r2, @fh.g we.p<? super S, ? super T, ? extends S> r3) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L_0x0016
            r2 = 0
            return r2
        L_0x0016:
            java.lang.Object r0 = r2.next()
        L_0x001a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r3.g0(r0, r1)
            goto L_0x001a
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000if.u.u2(if.m, we.p):java.lang.Object");
    }

    @fh.g
    public static final <T> m<T> v0(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        m<T> u02 = u0(mVar, g.P);
        l0.n(u02, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return u02;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T> float v1(m<? extends T> mVar, we.l<? super T, Float> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = lVar.A(it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, lVar.A(it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @fh.g
    public static final <T> m<T> v2(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return k1(mVar, new s(mVar));
    }

    @fh.g
    public static final <C extends Collection<? super T>, T> C w0(@fh.g m<? extends T> mVar, @fh.g C c10) {
        l0.p(mVar, "<this>");
        l0.p(c10, "destination");
        for (Object next : mVar) {
            if (next != null) {
                c10.add(next);
            }
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T, R extends Comparable<? super R>> R w1(m<? extends T> mVar, we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            R r10 = (Comparable) lVar.A(it.next());
            while (it.hasNext()) {
                R r11 = (Comparable) lVar.A(it.next());
                if (r10.compareTo(r11) < 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @fh.g
    @h1(version = "1.4")
    public static final <T, R> m<R> w2(@fh.g m<? extends T> mVar, R r10, @fh.g we.p<? super R, ? super T, ? extends R> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "operation");
        return q.b(new t(r10, mVar, pVar, (ie.d<? super t>) null));
    }

    @fh.g
    public static final <T, C extends Collection<? super T>> C x0(@fh.g m<? extends T> mVar, @fh.g C c10, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (Object next : mVar) {
            if (!lVar.A(next).booleanValue()) {
                c10.add(next);
            }
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T, R extends Comparable<? super R>> R x1(m<? extends T> mVar, we.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R r10 = (Comparable) lVar.A(it.next());
        while (it.hasNext()) {
            R r11 = (Comparable) lVar.A(it.next());
            if (r10.compareTo(r11) < 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @fh.g
    @h1(version = "1.4")
    public static final <T, R> m<R> x2(@fh.g m<? extends T> mVar, R r10, @fh.g we.q<? super Integer, ? super R, ? super T, ? extends R> qVar) {
        l0.p(mVar, "<this>");
        l0.p(qVar, "operation");
        return q.b(new C0328u(r10, mVar, qVar, (ie.d<? super C0328u>) null));
    }

    @fh.g
    public static final <T, C extends Collection<? super T>> C y0(@fh.g m<? extends T> mVar, @fh.g C c10, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (Object next : mVar) {
            if (lVar.A(next).booleanValue()) {
                c10.add(next);
            }
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T> Double y1(m<? extends T> mVar, we.l<? super T, Double> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = lVar.A(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.A(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.g
    public static final <S, T extends S> m<S> y2(@fh.g m<? extends T> mVar, @fh.g we.p<? super S, ? super T, ? extends S> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "operation");
        return q.b(new v(mVar, pVar, (ie.d<? super v>) null));
    }

    @oe.f
    public static final <T> T z0(m<? extends T> mVar, we.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        for (T next : mVar) {
            if (lVar.A(next).booleanValue()) {
                return next;
            }
        }
        return null;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T> Float z1(m<? extends T> mVar, we.l<? super T, Float> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = lVar.A(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.A(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @fh.g
    @h1(version = "1.4")
    public static final <S, T extends S> m<S> z2(@fh.g m<? extends T> mVar, @fh.g we.q<? super Integer, ? super S, ? super T, ? extends S> qVar) {
        l0.p(mVar, "<this>");
        l0.p(qVar, "operation");
        return q.b(new w(mVar, qVar, (ie.d<? super w>) null));
    }
}
