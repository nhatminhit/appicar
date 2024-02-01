package e1;

import android.util.SparseBooleanArray;
import be.r;
import be.s0;
import fh.g;
import kotlin.Metadata;
import we.p;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0002\u001a\u0015\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\b\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0003H\b\u001a&\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\bø\u0001\u0000\u001a\r\u0010\u0010\u001a\u00020\u0003*\u00020\u0000H\b\u001a\r\u0010\u0011\u001a\u00020\u0003*\u00020\u0000H\b\u001a\u001a\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u0012\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000\u001aH\u0010\u0018\u001a\u00020\u0006*\u00020\u000026\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0014H\bø\u0001\u0000\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010\u001c\u001a\u00020\u001b*\u00020\u0000\"\u0016\u0010\u001f\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0002\u0007\n\u0005\b20\u0001¨\u0006 "}, d2 = {"Landroid/util/SparseBooleanArray;", "", "key", "", "a", "value", "Lzd/u2;", "n", "other", "k", "b", "c", "defaultValue", "e", "Lkotlin/Function0;", "f", "h", "i", "m", "l", "Lkotlin/Function2;", "Lzd/v0;", "name", "action", "d", "Lbe/s0;", "j", "Lbe/r;", "o", "g", "(Landroid/util/SparseBooleanArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class s {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"e1/s$a", "Lbe/s0;", "", "hasNext", "", "nextInt", "O", "I", "a", "()I", "b", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends s0 {
        public int O;
        public final /* synthetic */ SparseBooleanArray P;

        public a(SparseBooleanArray sparseBooleanArray) {
            this.P = sparseBooleanArray;
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
            SparseBooleanArray sparseBooleanArray = this.P;
            int i10 = this.O;
            this.O = i10 + 1;
            return sparseBooleanArray.keyAt(i10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"e1/s$b", "Lbe/r;", "", "hasNext", "b", "", "O", "I", "c", "()I", "d", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class b extends r {
        public int O;
        public final /* synthetic */ SparseBooleanArray P;

        public b(SparseBooleanArray sparseBooleanArray) {
            this.P = sparseBooleanArray;
        }

        public boolean b() {
            SparseBooleanArray sparseBooleanArray = this.P;
            int i10 = this.O;
            this.O = i10 + 1;
            return sparseBooleanArray.valueAt(i10);
        }

        public final int c() {
            return this.O;
        }

        public final void d(int i10) {
            this.O = i10;
        }

        public boolean hasNext() {
            return this.O < this.P.size();
        }
    }

    public static final boolean a(@g SparseBooleanArray sparseBooleanArray, int i10) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfKey(i10) >= 0;
    }

    public static final boolean b(@g SparseBooleanArray sparseBooleanArray, int i10) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfKey(i10) >= 0;
    }

    public static final boolean c(@g SparseBooleanArray sparseBooleanArray, boolean z10) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfValue(z10) >= 0;
    }

    public static final void d(@g SparseBooleanArray sparseBooleanArray, @g p<? super Integer, ? super Boolean, u2> pVar) {
        l0.p(sparseBooleanArray, "<this>");
        l0.p(pVar, "action");
        int size = sparseBooleanArray.size();
        if (size > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                pVar.g0(Integer.valueOf(sparseBooleanArray.keyAt(i10)), Boolean.valueOf(sparseBooleanArray.valueAt(i10)));
                if (i11 < size) {
                    i10 = i11;
                } else {
                    return;
                }
            }
        }
    }

    public static final boolean e(@g SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.get(i10, z10);
    }

    public static final boolean f(@g SparseBooleanArray sparseBooleanArray, int i10, @g we.a<Boolean> aVar) {
        l0.p(sparseBooleanArray, "<this>");
        l0.p(aVar, "defaultValue");
        int indexOfKey = sparseBooleanArray.indexOfKey(i10);
        return indexOfKey >= 0 ? sparseBooleanArray.valueAt(indexOfKey) : aVar.n().booleanValue();
    }

    public static final int g(@g SparseBooleanArray sparseBooleanArray) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size();
    }

    public static final boolean h(@g SparseBooleanArray sparseBooleanArray) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean i(@g SparseBooleanArray sparseBooleanArray) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size() != 0;
    }

    @g
    public static final s0 j(@g SparseBooleanArray sparseBooleanArray) {
        l0.p(sparseBooleanArray, "<this>");
        return new a(sparseBooleanArray);
    }

    @g
    public static final SparseBooleanArray k(@g SparseBooleanArray sparseBooleanArray, @g SparseBooleanArray sparseBooleanArray2) {
        l0.p(sparseBooleanArray, "<this>");
        l0.p(sparseBooleanArray2, "other");
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray.size() + sparseBooleanArray2.size());
        l(sparseBooleanArray3, sparseBooleanArray);
        l(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void l(@g SparseBooleanArray sparseBooleanArray, @g SparseBooleanArray sparseBooleanArray2) {
        l0.p(sparseBooleanArray, "<this>");
        l0.p(sparseBooleanArray2, "other");
        int size = sparseBooleanArray2.size();
        if (size > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                sparseBooleanArray.put(sparseBooleanArray2.keyAt(i10), sparseBooleanArray2.valueAt(i10));
                if (i11 < size) {
                    i10 = i11;
                } else {
                    return;
                }
            }
        }
    }

    public static final boolean m(@g SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        l0.p(sparseBooleanArray, "<this>");
        int indexOfKey = sparseBooleanArray.indexOfKey(i10);
        if (indexOfKey < 0 || z10 != sparseBooleanArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i10);
        return true;
    }

    public static final void n(@g SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        l0.p(sparseBooleanArray, "<this>");
        sparseBooleanArray.put(i10, z10);
    }

    @g
    public static final r o(@g SparseBooleanArray sparseBooleanArray) {
        l0.p(sparseBooleanArray, "<this>");
        return new b(sparseBooleanArray);
    }
}
