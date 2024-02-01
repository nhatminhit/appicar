package uf;

import fh.g;
import fh.h;
import ie.d;
import ie.i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import pf.u0;
import rf.g0;
import rf.i0;
import rf.m;
import vf.y;
import xe.w;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010&\u001a\u00020#\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b'\u0010(J-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Luf/e;", "T", "Lvf/e;", "Lie/g;", "context", "", "capacity", "Lrf/m;", "onBufferOverflow", "i", "(Lie/g;ILrf/m;)Lvf/e;", "Luf/i;", "j", "()Luf/i;", "Lrf/g0;", "scope", "Lzd/u2;", "g", "(Lrf/g0;Lie/d;)Ljava/lang/Object;", "Lpf/u0;", "Lrf/i0;", "n", "(Lpf/u0;)Lrf/i0;", "Luf/j;", "collector", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "", "e", "()Ljava/lang/String;", "o", "()V", "R", "Lrf/i0;", "channel", "", "S", "Z", "consume", "<init>", "(Lrf/i0;ZLie/g;ILrf/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class e<T> extends vf.e<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater T = AtomicIntegerFieldUpdater.newUpdater(e.class, "consumed");
    @g
    public final i0<T> R;
    public final boolean S;
    @g
    private volatile /* synthetic */ int consumed;

    public e(@g i0<? extends T> i0Var, boolean z10, @g ie.g gVar, int i10, @g m mVar) {
        super(gVar, i10, mVar);
        this.R = i0Var;
        this.S = z10;
        this.consumed = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(i0 i0Var, boolean z10, ie.g gVar, int i10, m mVar, int i11, w wVar) {
        this(i0Var, z10, (i11 & 4) != 0 ? i.O : gVar, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? m.SUSPEND : mVar);
    }

    @h
    public Object a(@g j<? super T> jVar, @g d<? super u2> dVar) {
        if (this.P == -3) {
            o();
            Object a10 = m.e(jVar, this.R, this.S, dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }
        Object a11 = super.a(jVar, dVar);
        return a11 == ke.d.h() ? a11 : u2.f25116a;
    }

    @g
    public String e() {
        return "channel=" + this.R;
    }

    @h
    public Object g(@g g0<? super T> g0Var, @g d<? super u2> dVar) {
        Object a10 = m.e(new y(g0Var), this.R, this.S, dVar);
        return a10 == ke.d.h() ? a10 : u2.f25116a;
    }

    @g
    public vf.e<T> i(@g ie.g gVar, int i10, @g m mVar) {
        return new e(this.R, this.S, gVar, i10, mVar);
    }

    @g
    public i<T> j() {
        return new e(this.R, this.S, (ie.g) null, 0, (m) null, 28, (w) null);
    }

    @g
    public i0<T> n(@g u0 u0Var) {
        o();
        return this.P == -3 ? this.R : super.n(u0Var);
    }

    public final void o() {
        if (this.S) {
            boolean z10 = true;
            if (T.getAndSet(this, 1) != 0) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }
}
