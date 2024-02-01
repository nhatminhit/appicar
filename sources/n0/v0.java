package n0;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import fh.g;
import java.util.Iterator;
import kotlin.Metadata;
import we.l;
import xe.l0;
import zb.r;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\n\u001a\u0015\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\n\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\n\u001a\r\u0010\u000b\u001a\u00020\u0000*\u00020\u0000H\n\u001a\r\u0010\f\u001a\u00020\u0000*\u00020\u0000H\n\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\f\u001a\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\f\u001a\u0015\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\f\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\f\u001a\u0015\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\f\u001a\u0015\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\f\u001a3\u0010\u0019\u001a\u00020\u0017*\u00020\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0013H\bø\u0001\u0000\u001a\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a*\u00020\u0000H\u0002\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001c"}, d2 = {"Landroid/graphics/Region;", "Landroid/graphics/Point;", "p", "", "c", "Landroid/graphics/Rect;", "r", "k", "l", "f", "g", "m", "h", "i", "j", "a", "b", "n", "o", "Lkotlin/Function1;", "Lzd/v0;", "name", "rect", "Lzd/u2;", "action", "d", "", "e", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class v0 {

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"n0/v0$a", "", "Landroid/graphics/Rect;", "", "hasNext", "a", "Landroid/graphics/RegionIterator;", "O", "Landroid/graphics/RegionIterator;", "iterator", "P", "Landroid/graphics/Rect;", "rect", "Q", "Z", "hasMore", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Iterator<Rect>, ye.a {
        @g
        public final RegionIterator O;
        @g
        public final Rect P;
        public boolean Q;
        public final /* synthetic */ Region R;

        public a(Region region) {
            this.R = region;
            RegionIterator regionIterator = new RegionIterator(region);
            this.O = regionIterator;
            Rect rect = new Rect();
            this.P = rect;
            this.Q = regionIterator.next(rect);
        }

        @g
        /* renamed from: a */
        public Rect next() {
            if (this.Q) {
                Rect rect = new Rect(this.P);
                this.Q = this.O.next(this.P);
                return rect;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            return this.Q;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @g
    public static final Region a(@g Region region, @g Rect rect) {
        l0.p(region, "<this>");
        l0.p(rect, r.f25096b);
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    @g
    public static final Region b(@g Region region, @g Region region2) {
        l0.p(region, "<this>");
        l0.p(region2, r.f25096b);
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    public static final boolean c(@g Region region, @g Point point) {
        l0.p(region, "<this>");
        l0.p(point, "p");
        return region.contains(point.x, point.y);
    }

    public static final void d(@g Region region, @g l<? super Rect, u2> lVar) {
        l0.p(region, "<this>");
        l0.p(lVar, "action");
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (regionIterator.next(rect)) {
                lVar.A(rect);
            } else {
                return;
            }
        }
    }

    @g
    public static final Iterator<Rect> e(@g Region region) {
        l0.p(region, "<this>");
        return new a(region);
    }

    @g
    public static final Region f(@g Region region, @g Rect rect) {
        l0.p(region, "<this>");
        l0.p(rect, r.f25096b);
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    @g
    public static final Region g(@g Region region, @g Region region2) {
        l0.p(region, "<this>");
        l0.p(region2, r.f25096b);
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    @g
    public static final Region h(@g Region region) {
        l0.p(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @g
    public static final Region i(@g Region region, @g Rect rect) {
        l0.p(region, "<this>");
        l0.p(rect, r.f25096b);
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @g
    public static final Region j(@g Region region, @g Region region2) {
        l0.p(region, "<this>");
        l0.p(region2, r.f25096b);
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @g
    public static final Region k(@g Region region, @g Rect rect) {
        l0.p(region, "<this>");
        l0.p(rect, r.f25096b);
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @g
    public static final Region l(@g Region region, @g Region region2) {
        l0.p(region, "<this>");
        l0.p(region2, r.f25096b);
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @g
    public static final Region m(@g Region region) {
        l0.p(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @g
    public static final Region n(@g Region region, @g Rect rect) {
        l0.p(region, "<this>");
        l0.p(rect, r.f25096b);
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    @g
    public static final Region o(@g Region region, @g Region region2) {
        l0.p(region, "<this>");
        l0.p(region2, r.f25096b);
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }
}
