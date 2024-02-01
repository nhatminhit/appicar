package e1;

import android.util.SparseLongArray;
import be.s0;
import be.t0;
import fh.g;
import kotlin.Metadata;
import we.p;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u001a\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\n\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0002\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b\u001a\u0015\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\b\u001a\u001d\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0005H\b\u001a&\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\bø\u0001\u0000\u001a\r\u0010\u0011\u001a\u00020\u0003*\u00020\u0000H\b\u001a\r\u0010\u0012\u001a\u00020\u0003*\u00020\u0000H\b\u001a\u001c\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\u0014\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0007\u001aH\u0010\u0019\u001a\u00020\u0007*\u00020\u000026\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0015H\bø\u0001\u0000\u001a\f\u0010\u001b\u001a\u00020\u001a*\u00020\u0000H\u0007\u001a\f\u0010\u001d\u001a\u00020\u001c*\u00020\u0000H\u0007\"\u0016\u0010 \u001a\u00020\u0001*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0002\u0007\n\u0005\b20\u0001¨\u0006!"}, d2 = {"Landroid/util/SparseLongArray;", "", "key", "", "a", "", "value", "Lzd/u2;", "n", "other", "k", "b", "c", "defaultValue", "e", "Lkotlin/Function0;", "f", "h", "i", "m", "l", "Lkotlin/Function2;", "Lzd/v0;", "name", "action", "d", "Lbe/s0;", "j", "Lbe/t0;", "o", "g", "(Landroid/util/SparseLongArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class u {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"e1/u$a", "Lbe/s0;", "", "hasNext", "", "nextInt", "O", "I", "a", "()I", "b", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends s0 {
        public int O;
        public final /* synthetic */ SparseLongArray P;

        public a(SparseLongArray sparseLongArray) {
            this.P = sparseLongArray;
        }

        public final int a() {
            return this.O;
        }

        public final void b(int i10) {
            this.O = i10;
        }

        public boolean hasNext() {
            return this.O < this.P.size();
        }

        public int nextInt() {
            SparseLongArray sparseLongArray = this.P;
            int i10 = this.O;
            this.O = i10 + 1;
            return sparseLongArray.keyAt(i10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"e1/u$b", "Lbe/t0;", "", "hasNext", "", "nextLong", "", "O", "I", "a", "()I", "b", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class b extends t0 {
        public int O;
        public final /* synthetic */ SparseLongArray P;

        public b(SparseLongArray sparseLongArray) {
            this.P = sparseLongArray;
        }

        public final int a() {
            return this.O;
        }

        public final void b(int i10) {
            this.O = i10;
        }

        public boolean hasNext() {
            return this.O < this.P.size();
        }

        public long nextLong() {
            SparseLongArray sparseLongArray = this.P;
            int i10 = this.O;
            this.O = i10 + 1;
            return sparseLongArray.valueAt(i10);
        }
    }

    @d.t0(18)
    public static final boolean a(@g SparseLongArray sparseLongArray, int i10) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i10) >= 0;
    }

    @d.t0(18)
    public static final boolean b(@g SparseLongArray sparseLongArray, int i10) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i10) >= 0;
    }

    @d.t0(18)
    public static final boolean c(@g SparseLongArray sparseLongArray, long j10) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfValue(j10) >= 0;
    }

    @d.t0(18)
    public static final void d(@g SparseLongArray sparseLongArray, @g p<? super Integer, ? super Long, u2> pVar) {
        l0.p(sparseLongArray, "<this>");
        l0.p(pVar, "action");
        int size = sparseLongArray.size();
        if (size > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                pVar.g0(Integer.valueOf(sparseLongArray.keyAt(i10)), Long.valueOf(sparseLongArray.valueAt(i10)));
                if (i11 < size) {
                    i10 = i11;
                } else {
                    return;
                }
            }
        }
    }

    @d.t0(18)
    public static final long e(@g SparseLongArray sparseLongArray, int i10, long j10) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.get(i10, j10);
    }

    @d.t0(18)
    public static final long f(@g SparseLongArray sparseLongArray, int i10, @g we.a<Long> aVar) {
        l0.p(sparseLongArray, "<this>");
        l0.p(aVar, "defaultValue");
        int indexOfKey = sparseLongArray.indexOfKey(i10);
        return indexOfKey >= 0 ? sparseLongArray.valueAt(indexOfKey) : aVar.n().longValue();
    }

    @d.t0(18)
    public static final int g(@g SparseLongArray sparseLongArray) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.size();
    }

    @d.t0(18)
    public static final boolean h(@g SparseLongArray sparseLongArray) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.size() == 0;
    }

    @d.t0(18)
    public static final boolean i(@g SparseLongArray sparseLongArray) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.size() != 0;
    }

    @d.t0(18)
    @g
    public static final s0 j(@g SparseLongArray sparseLongArray) {
        l0.p(sparseLongArray, "<this>");
        return new a(sparseLongArray);
    }

    @d.t0(18)
    @g
    public static final SparseLongArray k(@g SparseLongArray sparseLongArray, @g SparseLongArray sparseLongArray2) {
        l0.p(sparseLongArray, "<this>");
        l0.p(sparseLongArray2, "other");
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        l(sparseLongArray3, sparseLongArray);
        l(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    @d.t0(18)
    public static final void l(@g SparseLongArray sparseLongArray, @g SparseLongArray sparseLongArray2) {
        l0.p(sparseLongArray, "<this>");
        l0.p(sparseLongArray2, "other");
        int size = sparseLongArray2.size();
        if (size > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                sparseLongArray.put(sparseLongArray2.keyAt(i10), sparseLongArray2.valueAt(i10));
                if (i11 < size) {
                    i10 = i11;
                } else {
                    return;
                }
            }
        }
    }

    @d.t0(18)
    public static final boolean m(@g SparseLongArray sparseLongArray, int i10, long j10) {
        l0.p(sparseLongArray, "<this>");
        int indexOfKey = sparseLongArray.indexOfKey(i10);
        if (indexOfKey < 0 || j10 != sparseLongArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(indexOfKey);
        return true;
    }

    @d.t0(18)
    public static final void n(@g SparseLongArray sparseLongArray, int i10, long j10) {
        l0.p(sparseLongArray, "<this>");
        sparseLongArray.put(i10, j10);
    }

    @d.t0(18)
    @g
    public static final t0 o(@g SparseLongArray sparseLongArray) {
        l0.p(sparseLongArray, "<this>");
        return new b(sparseLongArray);
    }
}
