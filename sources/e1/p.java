package e1;

import android.util.Range;
import d.t0;
import fh.g;
import gf.h;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\f¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\f\u001a(\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\fH\u0007¨\u0006\u000f"}, d2 = {"", "T", "that", "Landroid/util/Range;", "d", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;", "value", "c", "(Landroid/util/Range;Ljava/lang/Comparable;)Landroid/util/Range;", "other", "b", "a", "Lgf/h;", "e", "f", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class p {

    @Metadata(bv = {}, d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u001c\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"e1/p$a", "Lgf/h;", "kotlin.jvm.PlatformType", "h", "()Ljava/lang/Comparable;", "endInclusive", "c", "start", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements h<T> {
        public final /* synthetic */ Range<T> O;

        public a(Range<T> range) {
            this.O = range;
        }

        public boolean b(@g T t10) {
            return h.a.a(this, t10);
        }

        public T c() {
            return this.O.getLower();
        }

        public T h() {
            return this.O.getUpper();
        }

        public boolean isEmpty() {
            return h.a.b(this);
        }
    }

    @t0(21)
    @g
    public static final <T extends Comparable<? super T>> Range<T> a(@g Range<T> range, @g Range<T> range2) {
        l0.p(range, "<this>");
        l0.p(range2, "other");
        Range<T> intersect = range.intersect(range2);
        l0.o(intersect, "intersect(other)");
        return intersect;
    }

    @t0(21)
    @g
    public static final <T extends Comparable<? super T>> Range<T> b(@g Range<T> range, @g Range<T> range2) {
        l0.p(range, "<this>");
        l0.p(range2, "other");
        Range<T> extend = range.extend(range2);
        l0.o(extend, "extend(other)");
        return extend;
    }

    @t0(21)
    @g
    public static final <T extends Comparable<? super T>> Range<T> c(@g Range<T> range, @g T t10) {
        l0.p(range, "<this>");
        l0.p(t10, "value");
        Range<T> extend = range.extend(t10);
        l0.o(extend, "extend(value)");
        return extend;
    }

    @t0(21)
    @g
    public static final <T extends Comparable<? super T>> Range<T> d(@g T t10, @g T t11) {
        l0.p(t10, "<this>");
        l0.p(t11, "that");
        return new Range<>(t10, t11);
    }

    @t0(21)
    @g
    public static final <T extends Comparable<? super T>> h<T> e(@g Range<T> range) {
        l0.p(range, "<this>");
        return new a(range);
    }

    @t0(21)
    @g
    public static final <T extends Comparable<? super T>> Range<T> f(@g h<T> hVar) {
        l0.p(hVar, "<this>");
        return new Range<>(hVar.c(), hVar.h());
    }
}
