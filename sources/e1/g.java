package e1;

import android.util.LongSparseArray;
import be.t0;
import java.util.Iterator;
import kotlin.Metadata;
import we.p;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n\u001a0\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\n¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002\u001a!\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\b\u001a(\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\b¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\b\u001a\u0019\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\b\u001a/\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a&\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001aT\u0010\u001e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u001aH\bø\u0001\u0000\u001a\u0018\u0010 \u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\"\"\u0010&\u001a\u00020#\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Ç\u0002¢\u0006\u0006\u001a\u0004\b$\u0010%\u0002\u0007\n\u0005\b20\u0001¨\u0006'"}, d2 = {"T", "Landroid/util/LongSparseArray;", "", "key", "", "a", "value", "Lzd/u2;", "n", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)V", "other", "k", "b", "c", "(Landroid/util/LongSparseArray;Ljava/lang/Object;)Z", "defaultValue", "e", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "f", "(Landroid/util/LongSparseArray;JLwe/a;)Ljava/lang/Object;", "h", "i", "m", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Z", "l", "Lkotlin/Function2;", "Lzd/v0;", "name", "action", "d", "Lbe/t0;", "j", "", "o", "", "g", "(Landroid/util/LongSparseArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class g {

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"e1/g$a", "Lbe/t0;", "", "hasNext", "", "nextLong", "", "O", "I", "a", "()I", "b", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends t0 {
        public int O;
        public final /* synthetic */ LongSparseArray<T> P;

        public a(LongSparseArray<T> longSparseArray) {
            this.P = longSparseArray;
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
            LongSparseArray<T> longSparseArray = this.P;
            int i10 = this.O;
            this.O = i10 + 1;
            return longSparseArray.keyAt(i10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"e1/g$b", "", "", "hasNext", "kotlin.jvm.PlatformType", "next", "()Ljava/lang/Object;", "", "O", "I", "a", "()I", "b", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements Iterator<T>, ye.a {
        public int O;
        public final /* synthetic */ LongSparseArray<T> P;

        public b(LongSparseArray<T> longSparseArray) {
            this.P = longSparseArray;
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
            LongSparseArray<T> longSparseArray = this.P;
            int i10 = this.O;
            this.O = i10 + 1;
            return longSparseArray.valueAt(i10);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @d.t0(16)
    public static final <T> boolean a(@fh.g LongSparseArray<T> longSparseArray, long j10) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j10) >= 0;
    }

    @d.t0(16)
    public static final <T> boolean b(@fh.g LongSparseArray<T> longSparseArray, long j10) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j10) >= 0;
    }

    @d.t0(16)
    public static final <T> boolean c(@fh.g LongSparseArray<T> longSparseArray, T t10) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.indexOfValue(t10) >= 0;
    }

    @d.t0(16)
    public static final <T> void d(@fh.g LongSparseArray<T> longSparseArray, @fh.g p<? super Long, ? super T, u2> pVar) {
        l0.p(longSparseArray, "<this>");
        l0.p(pVar, "action");
        int size = longSparseArray.size();
        if (size > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                pVar.g0(Long.valueOf(longSparseArray.keyAt(i10)), longSparseArray.valueAt(i10));
                if (i11 < size) {
                    i10 = i11;
                } else {
                    return;
                }
            }
        }
    }

    @d.t0(16)
    public static final <T> T e(@fh.g LongSparseArray<T> longSparseArray, long j10, T t10) {
        l0.p(longSparseArray, "<this>");
        T t11 = longSparseArray.get(j10);
        return t11 == null ? t10 : t11;
    }

    @d.t0(16)
    public static final <T> T f(@fh.g LongSparseArray<T> longSparseArray, long j10, @fh.g we.a<? extends T> aVar) {
        l0.p(longSparseArray, "<this>");
        l0.p(aVar, "defaultValue");
        T t10 = longSparseArray.get(j10);
        return t10 == null ? aVar.n() : t10;
    }

    @d.t0(16)
    public static final <T> int g(@fh.g LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    @d.t0(16)
    public static final <T> boolean h(@fh.g LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }

    @d.t0(16)
    public static final <T> boolean i(@fh.g LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.size() != 0;
    }

    @d.t0(16)
    @fh.g
    public static final <T> t0 j(@fh.g LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return new a(longSparseArray);
    }

    @d.t0(16)
    @fh.g
    public static final <T> LongSparseArray<T> k(@fh.g LongSparseArray<T> longSparseArray, @fh.g LongSparseArray<T> longSparseArray2) {
        l0.p(longSparseArray, "<this>");
        l0.p(longSparseArray2, "other");
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        l(longSparseArray3, longSparseArray);
        l(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    @d.t0(16)
    public static final <T> void l(@fh.g LongSparseArray<T> longSparseArray, @fh.g LongSparseArray<T> longSparseArray2) {
        l0.p(longSparseArray, "<this>");
        l0.p(longSparseArray2, "other");
        int size = longSparseArray2.size();
        if (size > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                longSparseArray.put(longSparseArray2.keyAt(i10), longSparseArray2.valueAt(i10));
                if (i11 < size) {
                    i10 = i11;
                } else {
                    return;
                }
            }
        }
    }

    @d.t0(16)
    public static final <T> boolean m(@fh.g LongSparseArray<T> longSparseArray, long j10, T t10) {
        l0.p(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j10);
        if (indexOfKey < 0 || !l0.g(t10, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }

    @d.t0(16)
    public static final <T> void n(@fh.g LongSparseArray<T> longSparseArray, long j10, T t10) {
        l0.p(longSparseArray, "<this>");
        longSparseArray.put(j10, t10);
    }

    @d.t0(16)
    @fh.g
    public static final <T> Iterator<T> o(@fh.g LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return new b(longSparseArray);
    }
}
