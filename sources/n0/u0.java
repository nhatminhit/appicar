package n0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import fh.g;
import kotlin.Metadata;
import xe.l0;
import zb.r;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\b\u001a\u00020\u0007*\u00020\u0006H\n\u001a\r\u0010\t\u001a\u00020\u0007*\u00020\u0006H\n\u001a\r\u0010\n\u001a\u00020\u0007*\u00020\u0006H\n\u001a\r\u0010\u000b\u001a\u00020\u0007*\u00020\u0006H\n\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\n\u001a\u0015\u0010\u000e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\n\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\n\u001a\u0015\u0010\u0011\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\n\u001a\u0015\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012H\n\u001a\u0015\u0010\u0015\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0014H\n\u001a\u0015\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\n\u001a\u0015\u0010\f\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\n\u001a\u0015\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\n\u001a\u0015\u0010\u0019\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\n\u001a\u0015\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012H\n\u001a\u0015\u0010\u001b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0014H\n\u001a\u0015\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0001H\n\u001a\u0015\u0010\u001e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0001H\n\u001a\u0015\u0010\u001f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0007H\n\u001a\u0015\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\f\u001a\u0015\u0010!\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\f\u001a\u0015\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\f\u001a\u0015\u0010#\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\f\u001a\u0015\u0010$\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\f\u001a\u0015\u0010%\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\f\u001a\u0015\u0010'\u001a\u00020&*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0012H\n\u001a\u0015\u0010(\u001a\u00020&*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0014H\n\u001a\r\u0010)\u001a\u00020\u0006*\u00020\u0000H\b\u001a\r\u0010*\u001a\u00020\u0000*\u00020\u0006H\b\u001a\r\u0010+\u001a\u00020\u0016*\u00020\u0000H\b\u001a\r\u0010,\u001a\u00020\u0016*\u00020\u0006H\b\u001a\u0015\u0010.\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0018\u001a\u00020-H\b¨\u0006/"}, d2 = {"Landroid/graphics/Rect;", "", "d", "f", "h", "j", "Landroid/graphics/RectF;", "", "c", "e", "g", "i", "r", "w", "z", "xy", "u", "x", "Landroid/graphics/Point;", "v", "Landroid/graphics/PointF;", "y", "Landroid/graphics/Region;", "q", "m", "o", "n", "p", "factor", "A", "C", "B", "s", "t", "a", "b", "I", "J", "", "k", "l", "E", "D", "F", "G", "Landroid/graphics/Matrix;", "H", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class u0 {
    @g
    public static final Rect A(@g Rect rect, int i10) {
        l0.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.top *= i10;
        rect2.left *= i10;
        rect2.right *= i10;
        rect2.bottom *= i10;
        return rect2;
    }

    @g
    public static final RectF B(@g RectF rectF, float f10) {
        l0.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f10;
        rectF2.left *= f10;
        rectF2.right *= f10;
        rectF2.bottom *= f10;
        return rectF2;
    }

    @g
    public static final RectF C(@g RectF rectF, int i10) {
        l0.p(rectF, "<this>");
        float f10 = (float) i10;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f10;
        rectF2.left *= f10;
        rectF2.right *= f10;
        rectF2.bottom *= f10;
        return rectF2;
    }

    @g
    public static final Rect D(@g RectF rectF) {
        l0.p(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @g
    public static final RectF E(@g Rect rect) {
        l0.p(rect, "<this>");
        return new RectF(rect);
    }

    @g
    public static final Region F(@g Rect rect) {
        l0.p(rect, "<this>");
        return new Region(rect);
    }

    @g
    public static final Region G(@g RectF rectF) {
        l0.p(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @g
    public static final RectF H(@g RectF rectF, @g Matrix matrix) {
        l0.p(rectF, "<this>");
        l0.p(matrix, "m");
        matrix.mapRect(rectF);
        return rectF;
    }

    @g
    public static final Region I(@g Rect rect, @g Rect rect2) {
        l0.p(rect, "<this>");
        l0.p(rect2, r.f25096b);
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @g
    public static final Region J(@g RectF rectF, @g RectF rectF2) {
        l0.p(rectF, "<this>");
        l0.p(rectF2, r.f25096b);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @g
    @SuppressLint({"CheckResult"})
    public static final Rect a(@g Rect rect, @g Rect rect2) {
        l0.p(rect, "<this>");
        l0.p(rect2, r.f25096b);
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    @g
    @SuppressLint({"CheckResult"})
    public static final RectF b(@g RectF rectF, @g RectF rectF2) {
        l0.p(rectF, "<this>");
        l0.p(rectF2, r.f25096b);
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    public static final float c(@g RectF rectF) {
        l0.p(rectF, "<this>");
        return rectF.left;
    }

    public static final int d(@g Rect rect) {
        l0.p(rect, "<this>");
        return rect.left;
    }

    public static final float e(@g RectF rectF) {
        l0.p(rectF, "<this>");
        return rectF.top;
    }

    public static final int f(@g Rect rect) {
        l0.p(rect, "<this>");
        return rect.top;
    }

    public static final float g(@g RectF rectF) {
        l0.p(rectF, "<this>");
        return rectF.right;
    }

    public static final int h(@g Rect rect) {
        l0.p(rect, "<this>");
        return rect.right;
    }

    public static final float i(@g RectF rectF) {
        l0.p(rectF, "<this>");
        return rectF.bottom;
    }

    public static final int j(@g Rect rect) {
        l0.p(rect, "<this>");
        return rect.bottom;
    }

    public static final boolean k(@g Rect rect, @g Point point) {
        l0.p(rect, "<this>");
        l0.p(point, "p");
        return rect.contains(point.x, point.y);
    }

    public static final boolean l(@g RectF rectF, @g PointF pointF) {
        l0.p(rectF, "<this>");
        l0.p(pointF, "p");
        return rectF.contains(pointF.x, pointF.y);
    }

    @g
    public static final Rect m(@g Rect rect, int i10) {
        l0.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        int i11 = -i10;
        rect2.offset(i11, i11);
        return rect2;
    }

    @g
    public static final Rect n(@g Rect rect, @g Point point) {
        l0.p(rect, "<this>");
        l0.p(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    @g
    public static final RectF o(@g RectF rectF, float f10) {
        l0.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        float f11 = -f10;
        rectF2.offset(f11, f11);
        return rectF2;
    }

    @g
    public static final RectF p(@g RectF rectF, @g PointF pointF) {
        l0.p(rectF, "<this>");
        l0.p(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }

    @g
    public static final Region q(@g Rect rect, @g Rect rect2) {
        l0.p(rect, "<this>");
        l0.p(rect2, r.f25096b);
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @g
    public static final Region r(@g RectF rectF, @g RectF rectF2) {
        l0.p(rectF, "<this>");
        l0.p(rectF2, r.f25096b);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @g
    public static final Rect s(@g Rect rect, @g Rect rect2) {
        l0.p(rect, "<this>");
        l0.p(rect2, r.f25096b);
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @g
    public static final RectF t(@g RectF rectF, @g RectF rectF2) {
        l0.p(rectF, "<this>");
        l0.p(rectF2, r.f25096b);
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @g
    public static final Rect u(@g Rect rect, int i10) {
        l0.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.offset(i10, i10);
        return rect2;
    }

    @g
    public static final Rect v(@g Rect rect, @g Point point) {
        l0.p(rect, "<this>");
        l0.p(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    @g
    public static final Rect w(@g Rect rect, @g Rect rect2) {
        l0.p(rect, "<this>");
        l0.p(rect2, r.f25096b);
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @g
    public static final RectF x(@g RectF rectF, float f10) {
        l0.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f10, f10);
        return rectF2;
    }

    @g
    public static final RectF y(@g RectF rectF, @g PointF pointF) {
        l0.p(rectF, "<this>");
        l0.p(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    @g
    public static final RectF z(@g RectF rectF, @g RectF rectF2) {
        l0.p(rectF, "<this>");
        l0.p(rectF2, r.f25096b);
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }
}
