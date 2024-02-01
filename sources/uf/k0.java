package uf;

import fh.g;
import kotlin.Metadata;
import rf.m;
import ve.e;
import vf.i;
import wf.r0;

@Metadata(bv = {}, d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a%\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u0012\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"T", "", "replay", "extraBufferCapacity", "Lrf/m;", "onBufferOverflow", "Luf/d0;", "a", "", "", "", "index", "f", "([Ljava/lang/Object;J)Ljava/lang/Object;", "item", "Lzd/u2;", "h", "([Ljava/lang/Object;JLjava/lang/Object;)V", "Luf/i0;", "Lie/g;", "context", "capacity", "Luf/i;", "e", "Lwf/r0;", "Lwf/r0;", "getNO_VALUE$annotations", "()V", "NO_VALUE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class k0 {
    @g
    @e

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f23351a = new r0("NO_VALUE");

    @g
    public static final <T> d0<T> a(int i10, int i11, @g m mVar) {
        boolean z10 = true;
        if (i10 >= 0) {
            if (i11 >= 0) {
                if (i10 <= 0 && i11 <= 0 && mVar != m.SUSPEND) {
                    z10 = false;
                }
                if (z10) {
                    int i12 = i11 + i10;
                    if (i12 < 0) {
                        i12 = Integer.MAX_VALUE;
                    }
                    return new j0(i10, i12, mVar);
                }
                throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + mVar).toString());
            }
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        }
        throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
    }

    public static /* synthetic */ d0 b(int i10, int i11, m mVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            mVar = m.SUSPEND;
        }
        return a(i10, i11, mVar);
    }

    @g
    public static final <T> i<T> e(@g i0<? extends T> i0Var, @g ie.g gVar, int i10, @g m mVar) {
        return ((i10 == 0 || i10 == -3) && mVar == m.SUSPEND) ? i0Var : new i(i0Var, gVar, i10, mVar);
    }

    public static final Object f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    public static /* synthetic */ void g() {
    }

    public static final void h(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
