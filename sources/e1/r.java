package e1;

import android.util.SparseArray;
import be.s0;
import fh.g;
import java.util.Iterator;
import kotlin.Metadata;
import we.p;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n\u001a0\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\n¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002\u001a!\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\b\u001a(\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\b¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\b\u001a\u0019\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\b\u001a-\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a$\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aT\u0010\u001e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u001aH\bø\u0001\u0000\u001a\u0016\u0010 \u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\"\"\u0010%\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b#\u0010$\u0002\u0007\n\u0005\b20\u0001¨\u0006&"}, d2 = {"T", "Landroid/util/SparseArray;", "", "key", "", "a", "value", "Lzd/u2;", "n", "(Landroid/util/SparseArray;ILjava/lang/Object;)V", "other", "k", "b", "c", "(Landroid/util/SparseArray;Ljava/lang/Object;)Z", "defaultValue", "e", "(Landroid/util/SparseArray;ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "f", "(Landroid/util/SparseArray;ILwe/a;)Ljava/lang/Object;", "h", "i", "m", "(Landroid/util/SparseArray;ILjava/lang/Object;)Z", "l", "Lkotlin/Function2;", "Lzd/v0;", "name", "action", "d", "Lbe/s0;", "j", "", "o", "g", "(Landroid/util/SparseArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class r {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"e1/r$a", "Lbe/s0;", "", "hasNext", "", "nextInt", "O", "I", "a", "()I", "b", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends s0 {
        public int O;
        public final /* synthetic */ SparseArray<T> P;

        public a(SparseArray<T> sparseArray) {
            this.P = sparseArray;
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
            SparseArray<T> sparseArray = this.P;
            int i10 = this.O;
            this.O = i10 + 1;
            return sparseArray.keyAt(i10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"e1/r$b", "", "", "hasNext", "kotlin.jvm.PlatformType", "next", "()Ljava/lang/Object;", "", "O", "I", "a", "()I", "b", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements Iterator<T>, ye.a {
        public int O;
        public final /* synthetic */ SparseArray<T> P;

        public b(SparseArray<T> sparseArray) {
            this.P = sparseArray;
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

        public T next() {
            SparseArray<T> sparseArray = this.P;
            int i10 = this.O;
            this.O = i10 + 1;
            return sparseArray.valueAt(i10);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@g SparseArray<T> sparseArray, int i10) {
        l0.p(sparseArray, "<this>");
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static final <T> boolean b(@g SparseArray<T> sparseArray, int i10) {
        l0.p(sparseArray, "<this>");
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static final <T> boolean c(@g SparseArray<T> sparseArray, T t10) {
        l0.p(sparseArray, "<this>");
        return sparseArray.indexOfValue(t10) >= 0;
    }

    public static final <T> void d(@g SparseArray<T> sparseArray, @g p<? super Integer, ? super T, u2> pVar) {
        l0.p(sparseArray, "<this>");
        l0.p(pVar, "action");
        int size = sparseArray.size();
        if (size > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                pVar.g0(Integer.valueOf(sparseArray.keyAt(i10)), sparseArray.valueAt(i10));
                if (i11 < size) {
                    i10 = i11;
                } else {
                    return;
                }
            }
        }
    }

    public static final <T> T e(@g SparseArray<T> sparseArray, int i10, T t10) {
        l0.p(sparseArray, "<this>");
        T t11 = sparseArray.get(i10);
        return t11 == null ? t10 : t11;
    }

    public static final <T> T f(@g SparseArray<T> sparseArray, int i10, @g we.a<? extends T> aVar) {
        l0.p(sparseArray, "<this>");
        l0.p(aVar, "defaultValue");
        T t10 = sparseArray.get(i10);
        return t10 == null ? aVar.n() : t10;
    }

    public static final <T> int g(@g SparseArray<T> sparseArray) {
        l0.p(sparseArray, "<this>");
        return sparseArray.size();
    }

    public static final <T> boolean h(@g SparseArray<T> sparseArray) {
        l0.p(sparseArray, "<this>");
        return sparseArray.size() == 0;
    }

    public static final <T> boolean i(@g SparseArray<T> sparseArray) {
        l0.p(sparseArray, "<this>");
        return sparseArray.size() != 0;
    }

    @g
    public static final <T> s0 j(@g SparseArray<T> sparseArray) {
        l0.p(sparseArray, "<this>");
        return new a(sparseArray);
    }

    @g
    public static final <T> SparseArray<T> k(@g SparseArray<T> sparseArray, @g SparseArray<T> sparseArray2) {
        l0.p(sparseArray, "<this>");
        l0.p(sparseArray2, "other");
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        l(sparseArray3, sparseArray);
        l(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void l(@g SparseArray<T> sparseArray, @g SparseArray<T> sparseArray2) {
        l0.p(sparseArray, "<this>");
        l0.p(sparseArray2, "other");
        int size = sparseArray2.size();
        if (size > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                sparseArray.put(sparseArray2.keyAt(i10), sparseArray2.valueAt(i10));
                if (i11 < size) {
                    i10 = i11;
                } else {
                    return;
                }
            }
        }
    }

    public static final <T> boolean m(@g SparseArray<T> sparseArray, int i10, T t10) {
        l0.p(sparseArray, "<this>");
        int indexOfKey = sparseArray.indexOfKey(i10);
        if (indexOfKey < 0 || !l0.g(t10, sparseArray.valueAt(indexOfKey))) {
            return false;
        }
        sparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void n(@g SparseArray<T> sparseArray, int i10, T t10) {
        l0.p(sparseArray, "<this>");
        sparseArray.put(i10, t10);
    }

    @g
    public static final <T> Iterator<T> o(@g SparseArray<T> sparseArray) {
        l0.p(sparseArray, "<this>");
        return new b(sparseArray);
    }
}
