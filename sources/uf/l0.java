package uf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import ve.e;
import vf.d;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J)\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Luf/l0;", "Lvf/d;", "Luf/j0;", "flow", "", "c", "", "Lie/d;", "Lzd/u2;", "d", "(Luf/j0;)[Lie/d;", "", "a", "J", "index", "b", "Lie/d;", "cont", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class l0 extends d<j0<?>> {
    @e

    /* renamed from: a  reason: collision with root package name */
    public long f23352a = -1;
    @e
    @h

    /* renamed from: b  reason: collision with root package name */
    public ie.d<? super u2> f23353b;

    /* renamed from: c */
    public boolean a(@g j0<?> j0Var) {
        if (this.f23352a >= 0) {
            return false;
        }
        this.f23352a = j0Var.f0();
        return true;
    }

    @g
    /* renamed from: d */
    public ie.d<u2>[] b(@g j0<?> j0Var) {
        long j10 = this.f23352a;
        this.f23352a = -1;
        this.f23353b = null;
        return j0Var.e0(j10);
    }
}
