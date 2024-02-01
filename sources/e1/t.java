package e1;

import android.util.SparseIntArray;
import be.s0;
import fh.g;
import kotlin.Metadata;
import we.p;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0002\u001a\u0015\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\b\u001a\u001d\u0010\r\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\b\u001a&\u0010\u000f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\bø\u0001\u0000\u001a\r\u0010\u0010\u001a\u00020\u0003*\u00020\u0000H\b\u001a\r\u0010\u0011\u001a\u00020\u0003*\u00020\u0000H\b\u001a\u001a\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0012\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000\u001aH\u0010\u0018\u001a\u00020\u0006*\u00020\u000026\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0014H\bø\u0001\u0000\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010\u001b\u001a\u00020\u0019*\u00020\u0000\"\u0016\u0010\u001e\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001f"}, d2 = {"Landroid/util/SparseIntArray;", "", "key", "", "a", "value", "Lzd/u2;", "n", "other", "k", "b", "c", "defaultValue", "e", "Lkotlin/Function0;", "f", "h", "i", "m", "l", "Lkotlin/Function2;", "Lzd/v0;", "name", "action", "d", "Lbe/s0;", "j", "o", "g", "(Landroid/util/SparseIntArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class t {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"e1/t$a", "Lbe/s0;", "", "hasNext", "", "nextInt", "O", "I", "a", "()I", "b", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends s0 {
        public int O;
        public final /* synthetic */ SparseIntArray P;

        public a(SparseIntArray sparseIntArray) {
            this.P = sparseIntArray;
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
            SparseIntArray sparseIntArray = this.P;
            int i10 = this.O;
            this.O = i10 + 1;
            return sparseIntArray.keyAt(i10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"e1/t$b", "Lbe/s0;", "", "hasNext", "", "nextInt", "O", "I", "a", "()I", "b", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class b extends s0 {
        public int O;
        public final /* synthetic */ SparseIntArray P;

        public b(SparseIntArray sparseIntArray) {
            this.P = sparseIntArray;
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
            SparseIntArray sparseIntArray = this.P;
            int i10 = this.O;
            this.O = i10 + 1;
            return sparseIntArray.valueAt(i10);
        }
    }

    public static final boolean a(@g SparseIntArray sparseIntArray, int i10) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(i10) >= 0;
    }

    public static final boolean b(@g SparseIntArray sparseIntArray, int i10) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(i10) >= 0;
    }

    public static final boolean c(@g SparseIntArray sparseIntArray, int i10) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.indexOfValue(i10) >= 0;
    }

    public static final void d(@g SparseIntArray sparseIntArray, @g p<? super Integer, ? super Integer, u2> pVar) {
        l0.p(sparseIntArray, "<this>");
        l0.p(pVar, "action");
        int size = sparseIntArray.size();
        if (size > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                pVar.g0(Integer.valueOf(sparseIntArray.keyAt(i10)), Integer.valueOf(sparseIntArray.valueAt(i10)));
                if (i11 < size) {
                    i10 = i11;
                } else {
                    return;
                }
            }
        }
    }

    public static final int e(@g SparseIntArray sparseIntArray, int i10, int i11) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.get(i10, i11);
    }

    public static final int f(@g SparseIntArray sparseIntArray, int i10, @g we.a<Integer> aVar) {
        l0.p(sparseIntArray, "<this>");
        l0.p(aVar, "defaultValue");
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : aVar.n().intValue();
    }

    public static final int g(@g SparseIntArray sparseIntArray) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.size();
    }

    public static final boolean h(@g SparseIntArray sparseIntArray) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.size() == 0;
    }

    public static final boolean i(@g SparseIntArray sparseIntArray) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.size() != 0;
    }

    @g
    public static final s0 j(@g SparseIntArray sparseIntArray) {
        l0.p(sparseIntArray, "<this>");
        return new a(sparseIntArray);
    }

    @g
    public static final SparseIntArray k(@g SparseIntArray sparseIntArray, @g SparseIntArray sparseIntArray2) {
        l0.p(sparseIntArray, "<this>");
        l0.p(sparseIntArray2, "other");
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        l(sparseIntArray3, sparseIntArray);
        l(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final void l(@g SparseIntArray sparseIntArray, @g SparseIntArray sparseIntArray2) {
        l0.p(sparseIntArray, "<this>");
        l0.p(sparseIntArray2, "other");
        int size = sparseIntArray2.size();
        if (size > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                sparseIntArray.put(sparseIntArray2.keyAt(i10), sparseIntArray2.valueAt(i10));
                if (i11 < size) {
                    i10 = i11;
                } else {
                    return;
                }
            }
        }
    }

    public static final boolean m(@g SparseIntArray sparseIntArray, int i10, int i11) {
        l0.p(sparseIntArray, "<this>");
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey < 0 || i11 != sparseIntArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(indexOfKey);
        return true;
    }

    public static final void n(@g SparseIntArray sparseIntArray, int i10, int i11) {
        l0.p(sparseIntArray, "<this>");
        sparseIntArray.put(i10, i11);
    }

    @g
    public static final s0 o(@g SparseIntArray sparseIntArray) {
        l0.p(sparseIntArray, "<this>");
        return new b(sparseIntArray);
    }
}
