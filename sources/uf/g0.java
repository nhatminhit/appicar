package uf;

import fh.g;
import fh.h;
import ie.d;
import java.util.List;
import kotlin.Metadata;
import pf.n2;
import rf.m;
import vf.r;

@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HAø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00028\u00008\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Luf/g0;", "T", "Luf/t0;", "Luf/c;", "Lvf/r;", "Luf/j;", "collector", "", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "Lie/g;", "context", "", "capacity", "Lrf/m;", "onBufferOverflow", "Luf/i;", "c", "Lpf/n2;", "O", "Lpf/n2;", "job", "", "b", "()Ljava/util/List;", "replayCache", "getValue", "()Ljava/lang/Object;", "value", "flow", "<init>", "(Luf/t0;Lpf/n2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class g0<T> implements t0<T>, c<T>, r<T> {
    @h
    public final n2 O;
    public final /* synthetic */ t0<T> P;

    public g0(@g t0<? extends T> t0Var, @h n2 n2Var) {
        this.O = n2Var;
        this.P = t0Var;
    }

    @h
    public Object a(@g j<? super T> jVar, @g d<?> dVar) {
        return this.P.a(jVar, dVar);
    }

    @g
    public List<T> b() {
        return this.P.b();
    }

    @g
    public i<T> c(@g ie.g gVar, int i10, @g m mVar) {
        return v0.d(this, gVar, i10, mVar);
    }

    public T getValue() {
        return this.P.getValue();
    }
}
