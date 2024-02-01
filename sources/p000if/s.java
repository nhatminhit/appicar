package p000if;

import be.b0;
import be.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import le.k;
import we.l;
import we.p;
import xe.l0;
import xe.n0;
import zd.e1;
import zd.h1;
import zd.r1;
import zd.u0;
import zd.u2;

/* renamed from: if.s  reason: invalid package */
public class s extends r {

    /* renamed from: if.s$a */
    public static final class a implements m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ we.a<Iterator<T>> f19724a;

        public a(we.a<? extends Iterator<? extends T>> aVar) {
            this.f19724a = aVar;
        }

        @fh.g
        public Iterator<T> iterator() {
            return this.f19724a.n();
        }
    }

    /* renamed from: if.s$b */
    public static final class b implements m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Iterator f19725a;

        public b(Iterator it) {
            this.f19725a = it;
        }

        @fh.g
        public Iterator<T> iterator() {
            return this.f19725a;
        }
    }

    @le.f(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0}, l = {332}, m = "invokeSuspend", n = {"$this$sequence", "index"}, s = {"L$0", "I$0"})
    /* renamed from: if.s$c */
    public static final class c extends k implements p<o<? super R>, ie.d<? super u2>, Object> {
        public Object Q;
        public int R;
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ m<T> U;
        public final /* synthetic */ p<Integer, T, C> V;
        public final /* synthetic */ l<C, Iterator<R>> W;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m<? extends T> mVar, p<? super Integer, ? super T, ? extends C> pVar, l<? super C, ? extends Iterator<? extends R>> lVar, ie.d<? super c> dVar) {
            super(2, dVar);
            this.U = mVar;
            this.V = pVar;
            this.W = lVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            c cVar = new c(this.U, this.V, this.W, dVar);
            cVar.T = obj;
            return cVar;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            o oVar;
            Iterator<T> it;
            int i10;
            Object h10 = ke.d.h();
            int i11 = this.S;
            if (i11 == 0) {
                e1.n(obj);
                i10 = 0;
                it = this.U.iterator();
                oVar = (o) this.T;
            } else if (i11 == 1) {
                i10 = this.R;
                it = (Iterator) this.Q;
                oVar = (o) this.T;
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (it.hasNext()) {
                T next = it.next();
                p<Integer, T, C> pVar = this.V;
                int i12 = i10 + 1;
                if (i10 < 0) {
                    w.W();
                }
                C g02 = pVar.g0(le.b.f(i10), next);
                this.T = oVar;
                this.Q = it;
                this.R = i12;
                this.S = 1;
                if (oVar.h(this.W.A(g02), this) == h10) {
                    return h10;
                }
                i10 = i12;
            }
            return u2.f25116a;
        }

        @fh.h
        /* renamed from: N */
        public final Object g0(@fh.g o<? super R> oVar, @fh.h ie.d<? super u2> dVar) {
            return ((c) H(oVar, dVar)).K(u2.f25116a);
        }
    }

    /* renamed from: if.s$d */
    public static final class d extends n0 implements l<m<? extends T>, Iterator<? extends T>> {
        public static final d P = new d();

        public d() {
            super(1);
        }

        @fh.g
        /* renamed from: c */
        public final Iterator<T> A(@fh.g m<? extends T> mVar) {
            l0.p(mVar, "it");
            return mVar.iterator();
        }
    }

    /* renamed from: if.s$e */
    public static final class e extends n0 implements l<Iterable<? extends T>, Iterator<? extends T>> {
        public static final e P = new e();

        public e() {
            super(1);
        }

        @fh.g
        /* renamed from: c */
        public final Iterator<T> A(@fh.g Iterable<? extends T> iterable) {
            l0.p(iterable, "it");
            return iterable.iterator();
        }
    }

    /* renamed from: if.s$f */
    public static final class f extends n0 implements l<T, T> {
        public static final f P = new f();

        public f() {
            super(1);
        }

        public final T A(T t10) {
            return t10;
        }
    }

    /* renamed from: if.s$g */
    public static final class g extends n0 implements l<T, T> {
        public final /* synthetic */ we.a<T> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(we.a<? extends T> aVar) {
            super(1);
            this.P = aVar;
        }

        @fh.h
        public final T A(@fh.g T t10) {
            l0.p(t10, "it");
            return this.P.n();
        }
    }

    /* renamed from: if.s$h */
    public static final class h extends n0 implements we.a<T> {
        public final /* synthetic */ T P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(T t10) {
            super(0);
            this.P = t10;
        }

        @fh.h
        public final T n() {
            return this.P;
        }
    }

    @le.f(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: if.s$i */
    public static final class i extends k implements p<o<? super T>, ie.d<? super u2>, Object> {
        public int Q;
        public /* synthetic */ Object R;
        public final /* synthetic */ m<T> S;
        public final /* synthetic */ we.a<m<T>> T;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(m<? extends T> mVar, we.a<? extends m<? extends T>> aVar, ie.d<? super i> dVar) {
            super(2, dVar);
            this.S = mVar;
            this.T = aVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            i iVar = new i(this.S, this.T, dVar);
            iVar.R = obj;
            return iVar;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.Q;
            if (i10 == 0) {
                e1.n(obj);
                o oVar = (o) this.R;
                Iterator<T> it = this.S.iterator();
                if (it.hasNext()) {
                    this.Q = 1;
                    if (oVar.h(it, this) == h10) {
                        return h10;
                    }
                } else {
                    this.Q = 2;
                    if (oVar.b(this.T.n(), this) == h10) {
                        return h10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u2.f25116a;
        }

        @fh.h
        /* renamed from: N */
        public final Object g0(@fh.g o<? super T> oVar, @fh.h ie.d<? super u2> dVar) {
            return ((i) H(oVar, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0}, l = {145}, m = "invokeSuspend", n = {"$this$sequence", "buffer"}, s = {"L$0", "L$1"})
    /* renamed from: if.s$j */
    public static final class j extends k implements p<o<? super T>, ie.d<? super u2>, Object> {
        public Object Q;
        public int R;
        public /* synthetic */ Object S;
        public final /* synthetic */ m<T> T;
        public final /* synthetic */ ef.f U;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(m<? extends T> mVar, ef.f fVar, ie.d<? super j> dVar) {
            super(2, dVar);
            this.T = mVar;
            this.U = fVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            j jVar = new j(this.T, this.U, dVar);
            jVar.S = obj;
            return jVar;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            o oVar;
            List<T> list;
            Object h10 = ke.d.h();
            int i10 = this.R;
            if (i10 == 0) {
                e1.n(obj);
                list = u.d3(this.T);
                oVar = (o) this.S;
            } else if (i10 == 1) {
                list = (List) this.Q;
                oVar = (o) this.S;
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (!list.isEmpty()) {
                int m10 = this.U.m(list.size());
                T L0 = b0.L0(list);
                if (m10 < list.size()) {
                    L0 = list.set(m10, L0);
                }
                this.S = oVar;
                this.Q = list;
                this.R = 1;
                if (oVar.a(L0, this) == h10) {
                    return h10;
                }
            }
            return u2.f25116a;
        }

        @fh.h
        /* renamed from: N */
        public final Object g0(@fh.g o<? super T> oVar, @fh.h ie.d<? super u2> dVar) {
            return ((j) H(oVar, dVar)).K(u2.f25116a);
        }
    }

    @oe.f
    public static final <T> m<T> d(we.a<? extends Iterator<? extends T>> aVar) {
        l0.p(aVar, "iterator");
        return new a(aVar);
    }

    @fh.g
    public static final <T> m<T> e(@fh.g Iterator<? extends T> it) {
        l0.p(it, "<this>");
        return f(new b(it));
    }

    @fh.g
    public static final <T> m<T> f(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return mVar instanceof a ? mVar : new a(mVar);
    }

    @fh.g
    public static final <T> m<T> g() {
        return g.f19704a;
    }

    @fh.g
    public static final <T, C, R> m<R> h(@fh.g m<? extends T> mVar, @fh.g p<? super Integer, ? super T, ? extends C> pVar, @fh.g l<? super C, ? extends Iterator<? extends R>> lVar) {
        l0.p(mVar, b4.a.P);
        l0.p(pVar, "transform");
        l0.p(lVar, "iterator");
        return q.b(new c(mVar, pVar, lVar, (ie.d<? super c>) null));
    }

    @fh.g
    public static final <T> m<T> i(@fh.g m<? extends m<? extends T>> mVar) {
        l0.p(mVar, "<this>");
        return j(mVar, d.P);
    }

    public static final <T, R> m<R> j(m<? extends T> mVar, l<? super T, ? extends Iterator<? extends R>> lVar) {
        return mVar instanceof z ? ((z) mVar).e(lVar) : new i(mVar, f.P, lVar);
    }

    @fh.g
    @ve.h(name = "flattenSequenceOfIterable")
    public static final <T> m<T> k(@fh.g m<? extends Iterable<? extends T>> mVar) {
        l0.p(mVar, "<this>");
        return j(mVar, e.P);
    }

    @fh.g
    @oe.h
    public static final <T> m<T> l(@fh.h T t10, @fh.g l<? super T, ? extends T> lVar) {
        l0.p(lVar, "nextFunction");
        return t10 == null ? g.f19704a : new j(new h(t10), lVar);
    }

    @fh.g
    public static final <T> m<T> m(@fh.g we.a<? extends T> aVar) {
        l0.p(aVar, "nextFunction");
        return f(new j(aVar, new g(aVar)));
    }

    @fh.g
    public static final <T> m<T> n(@fh.g we.a<? extends T> aVar, @fh.g l<? super T, ? extends T> lVar) {
        l0.p(aVar, "seedFunction");
        l0.p(lVar, "nextFunction");
        return new j(aVar, lVar);
    }

    @fh.g
    @h1(version = "1.3")
    public static final <T> m<T> o(@fh.g m<? extends T> mVar, @fh.g we.a<? extends m<? extends T>> aVar) {
        l0.p(mVar, "<this>");
        l0.p(aVar, "defaultValue");
        return q.b(new i(mVar, aVar, (ie.d<? super i>) null));
    }

    @h1(version = "1.3")
    @oe.f
    public static final <T> m<T> p(m<? extends T> mVar) {
        return mVar == null ? g() : mVar;
    }

    @fh.g
    public static final <T> m<T> q(@fh.g T... tArr) {
        l0.p(tArr, "elements");
        return tArr.length == 0 ? g() : be.p.l6(tArr);
    }

    @fh.g
    @h1(version = "1.4")
    public static final <T> m<T> r(@fh.g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return s(mVar, ef.f.O);
    }

    @fh.g
    @h1(version = "1.4")
    public static final <T> m<T> s(@fh.g m<? extends T> mVar, @fh.g ef.f fVar) {
        l0.p(mVar, "<this>");
        l0.p(fVar, "random");
        return q.b(new j(mVar, fVar, (ie.d<? super j>) null));
    }

    @fh.g
    public static final <T, R> u0<List<T>, List<R>> t(@fh.g m<? extends u0<? extends T, ? extends R>> mVar) {
        l0.p(mVar, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (u0 u0Var : mVar) {
            arrayList.add(u0Var.e());
            arrayList2.add(u0Var.f());
        }
        return r1.a(arrayList, arrayList2);
    }
}
