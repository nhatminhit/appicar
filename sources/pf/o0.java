package pf;

import fh.g;
import fh.h;
import ie.b;
import ie.d;
import ie.e;
import ie.g;
import kotlin.Metadata;
import we.l;
import wf.s;
import wf.t;
import xe.n0;
import xe.w;
import zd.k;
import zd.m;
import zd.r;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH&J\u001c\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0017J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0012\u0010\u0014\u001a\u00020\r2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011J\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016¨\u0006\u001d"}, d2 = {"Lpf/o0;", "Lie/a;", "Lie/e;", "Lie/g;", "context", "", "P1", "", "parallelism", "Q1", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lzd/u2;", "N1", "O1", "T", "Lie/d;", "continuation", "Y", "t", "other", "R1", "", "toString", "<init>", "()V", "P", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class o0 extends ie.a implements e {
    @g
    public static final a P = new a((w) null);

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpf/o0$a;", "Lie/b;", "Lie/e;", "Lpf/o0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    @r
    public static final class a extends b<e, o0> {

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lie/g$b;", "it", "Lpf/o0;", "c", "(Lie/g$b;)Lpf/o0;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: pf.o0$a$a  reason: collision with other inner class name */
        public static final class C0387a extends n0 implements l<g.b, o0> {
            public static final C0387a P = new C0387a();

            public C0387a() {
                super(1);
            }

            @h
            /* renamed from: c */
            public final o0 A(@fh.g g.b bVar) {
                if (bVar instanceof o0) {
                    return (o0) bVar;
                }
                return null;
            }
        }

        public a() {
            super(e.B, C0387a.P);
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public o0() {
        super(e.B);
    }

    public abstract void N1(@fh.g ie.g gVar, @fh.g Runnable runnable);

    @i2
    public void O1(@fh.g ie.g gVar, @fh.g Runnable runnable) {
        N1(gVar, runnable);
    }

    public boolean P1(@fh.g ie.g gVar) {
        return true;
    }

    @fh.g
    @c2
    public o0 Q1(int i10) {
        t.a(i10);
        return new s(this, i10);
    }

    @fh.g
    @k(level = m.P, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    public final o0 R1(@fh.g o0 o0Var) {
        return o0Var;
    }

    @fh.g
    public final <T> d<T> Y(@fh.g d<? super T> dVar) {
        return new wf.l(this, dVar);
    }

    @h
    public <E extends g.b> E g(@fh.g g.c<E> cVar) {
        return e.a.b(this, cVar);
    }

    @fh.g
    public ie.g i(@fh.g g.c<?> cVar) {
        return e.a.c(this, cVar);
    }

    public final void t(@fh.g d<?> dVar) {
        ((wf.l) dVar).v();
    }

    @fh.g
    public String toString() {
        return z0.a(this) + '@' + z0.b(this);
    }
}
