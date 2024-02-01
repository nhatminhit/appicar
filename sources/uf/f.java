package uf;

import fh.g;
import fh.h;
import ie.d;
import ie.i;
import kotlin.Metadata;
import rf.g0;
import rf.m;
import vf.e;
import we.p;
import xe.w;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u0014\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J!\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R>\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u00148\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Luf/f;", "T", "Lvf/e;", "Lie/g;", "context", "", "capacity", "Lrf/m;", "onBufferOverflow", "i", "Lrf/g0;", "scope", "Lzd/u2;", "g", "(Lrf/g0;Lie/d;)Ljava/lang/Object;", "", "toString", "Lkotlin/Function2;", "Lie/d;", "", "Lzd/u;", "R", "Lwe/p;", "block", "<init>", "(Lwe/p;Lie/g;ILrf/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class f<T> extends e<T> {
    @g
    public final p<g0<? super T>, d<? super u2>, Object> R;

    public f(@g p<? super g0<? super T>, ? super d<? super u2>, ? extends Object> pVar, @g ie.g gVar, int i10, @g m mVar) {
        super(gVar, i10, mVar);
        this.R = pVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(p pVar, ie.g gVar, int i10, m mVar, int i11, w wVar) {
        this(pVar, (i11 & 2) != 0 ? i.O : gVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? m.SUSPEND : mVar);
    }

    public static /* synthetic */ Object o(f fVar, g0 g0Var, d dVar) {
        Object g02 = fVar.R.g0(g0Var, dVar);
        return g02 == ke.d.h() ? g02 : u2.f25116a;
    }

    @h
    public Object g(@g g0<? super T> g0Var, @g d<? super u2> dVar) {
        return o(this, g0Var, dVar);
    }

    @g
    public e<T> i(@g ie.g gVar, int i10, @g m mVar) {
        return new f(this.R, gVar, i10, mVar);
    }

    @g
    public String toString() {
        return "block[" + this.R + "] -> " + super.toString();
    }
}
