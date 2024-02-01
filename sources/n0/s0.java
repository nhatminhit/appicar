package n0;

import android.graphics.Point;
import android.graphics.PointF;
import fh.g;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\n\u001a\r\u0010\u0007\u001a\u00020\u0005*\u00020\u0004H\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\n\u001a\u0015\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\n\u001a\u0015\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\n\u001a\u0015\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0005H\n\u001a\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\n\u001a\u0015\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\n\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\n\u001a\u0015\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0005H\n\u001a\r\u0010\u0012\u001a\u00020\u0000*\u00020\u0000H\n\u001a\r\u0010\b\u001a\u00020\u0004*\u00020\u0004H\n\u001a\r\u0010\u0013\u001a\u00020\u0004*\u00020\u0000H\b\u001a\r\u0010\u0014\u001a\u00020\u0000*\u00020\u0004H\b¨\u0006\u0015"}, d2 = {"Landroid/graphics/Point;", "", "b", "d", "Landroid/graphics/PointF;", "", "a", "c", "p", "j", "l", "xy", "i", "k", "f", "h", "e", "g", "o", "n", "m", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class s0 {
    public static final float a(@g PointF pointF) {
        l0.p(pointF, "<this>");
        return pointF.x;
    }

    public static final int b(@g Point point) {
        l0.p(point, "<this>");
        return point.x;
    }

    public static final float c(@g PointF pointF) {
        l0.p(pointF, "<this>");
        return pointF.y;
    }

    public static final int d(@g Point point) {
        l0.p(point, "<this>");
        return point.y;
    }

    @g
    public static final Point e(@g Point point, int i10) {
        l0.p(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        int i11 = -i10;
        point2.offset(i11, i11);
        return point2;
    }

    @g
    public static final Point f(@g Point point, @g Point point2) {
        l0.p(point, "<this>");
        l0.p(point2, "p");
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    @g
    public static final PointF g(@g PointF pointF, float f10) {
        l0.p(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f11 = -f10;
        pointF2.offset(f11, f11);
        return pointF2;
    }

    @g
    public static final PointF h(@g PointF pointF, @g PointF pointF2) {
        l0.p(pointF, "<this>");
        l0.p(pointF2, "p");
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    @g
    public static final Point i(@g Point point, int i10) {
        l0.p(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        point2.offset(i10, i10);
        return point2;
    }

    @g
    public static final Point j(@g Point point, @g Point point2) {
        l0.p(point, "<this>");
        l0.p(point2, "p");
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    @g
    public static final PointF k(@g PointF pointF, float f10) {
        l0.p(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f10, f10);
        return pointF2;
    }

    @g
    public static final PointF l(@g PointF pointF, @g PointF pointF2) {
        l0.p(pointF, "<this>");
        l0.p(pointF2, "p");
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    @g
    public static final Point m(@g PointF pointF) {
        l0.p(pointF, "<this>");
        return new Point((int) pointF.x, (int) pointF.y);
    }

    @g
    public static final PointF n(@g Point point) {
        l0.p(point, "<this>");
        return new PointF(point);
    }

    @g
    public static final Point o(@g Point point) {
        l0.p(point, "<this>");
        return new Point(-point.x, -point.y);
    }

    @g
    public static final PointF p(@g PointF pointF) {
        l0.p(pointF, "<this>");
        return new PointF(-pointF.x, -pointF.y);
    }
}
