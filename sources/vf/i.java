package vf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import rf.m;
import uf.j;
import xe.w;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lvf/i;", "T", "Lvf/h;", "Lie/g;", "context", "", "capacity", "Lrf/m;", "onBufferOverflow", "Lvf/e;", "i", "Luf/i;", "j", "Luf/j;", "collector", "Lzd/u2;", "s", "(Luf/j;Lie/d;)Ljava/lang/Object;", "flow", "<init>", "(Luf/i;Lie/g;ILrf/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class i<T> extends h<T, T> {
    public i(@g uf.i<? extends T> iVar, @g ie.g gVar, int i10, @g m mVar) {
        super(iVar, gVar, i10, mVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(uf.i iVar, ie.g gVar, int i10, m mVar, int i11, w wVar) {
        this(iVar, (i11 & 2) != 0 ? ie.i.O : gVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? m.SUSPEND : mVar);
    }

    @g
    public e<T> i(@g ie.g gVar, int i10, @g m mVar) {
        return new i(this.R, gVar, i10, mVar);
    }

    @g
    public uf.i<T> j() {
        return this.R;
    }

    @h
    public Object s(@g j<? super T> jVar, @g d<? super u2> dVar) {
        Object a10 = this.R.a(jVar, dVar);
        return a10 == ke.d.h() ? a10 : u2.f25116a;
    }
}
