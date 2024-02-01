package pf;

import fh.g;
import ie.d;
import ie.f;
import kotlin.Metadata;
import we.l;
import we.p;
import xf.b;
import zd.i0;
import zd.j0;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ^\u0010\u000f\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u00022'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118FX\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lpf/w0;", "", "T", "Lkotlin/Function1;", "Lie/d;", "", "block", "completion", "Lzd/u2;", "b", "(Lwe/l;Lie/d;)V", "R", "Lkotlin/Function2;", "Lzd/u;", "receiver", "d", "(Lwe/p;Ljava/lang/Object;Lie/d;)V", "", "e", "()Z", "isLazy$annotations", "()V", "isLazy", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public enum w0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22034a = null;

        static {
            int[] iArr = new int[w0.values().length];
            iArr[w0.DEFAULT.ordinal()] = 1;
            iArr[w0.ATOMIC.ordinal()] = 2;
            iArr[w0.UNDISPATCHED.ordinal()] = 3;
            iArr[w0.LAZY.ordinal()] = 4;
            f22034a = iArr;
        }
    }

    @i2
    public final <T> void b(@g l<? super d<? super T>, ? extends Object> lVar, @g d<? super T> dVar) {
        int i10 = a.f22034a[ordinal()];
        if (i10 == 1) {
            xf.a.d(lVar, dVar);
        } else if (i10 == 2) {
            f.h(lVar, dVar);
        } else if (i10 == 3) {
            b.a(lVar, dVar);
        } else if (i10 != 4) {
            throw new j0();
        }
    }

    @i2
    public final <R, T> void d(@g p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, @g d<? super T> dVar) {
        int i10 = a.f22034a[ordinal()];
        if (i10 == 1) {
            xf.a.f(pVar, r10, dVar, (l) null, 4, (Object) null);
        } else if (i10 == 2) {
            f.i(pVar, r10, dVar);
        } else if (i10 == 3) {
            b.b(pVar, r10, dVar);
        } else if (i10 != 4) {
            throw new j0();
        }
    }

    public final boolean e() {
        return this == LAZY;
    }
}
