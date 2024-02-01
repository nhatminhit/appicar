package n0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.PointF;
import d.t0;
import fh.g;
import kotlin.Metadata;
import we.l;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\bø\u0001\u0000\u001a\u001d\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\n\u001a'\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\n\u001a'\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\b\u001a#\u0010\u0014\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\b\u001a7\u0010\u0018\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\b\u001a\u0015\u0010\u001b\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\n\u001a\u0015\u0010\u001d\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001cH\n\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001e"}, d2 = {"Landroid/graphics/Bitmap;", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Lzd/u2;", "Lzd/u;", "block", "a", "", "x", "y", "h", "color", "k", "width", "height", "", "filter", "i", "Landroid/graphics/Bitmap$Config;", "config", "d", "hasAlpha", "Landroid/graphics/ColorSpace;", "colorSpace", "e", "Landroid/graphics/Point;", "p", "b", "Landroid/graphics/PointF;", "c", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class c {
    @g
    public static final Bitmap a(@g Bitmap bitmap, @g l<? super Canvas, u2> lVar) {
        l0.p(bitmap, "<this>");
        l0.p(lVar, "block");
        lVar.A(new Canvas(bitmap));
        return bitmap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r3 = r3.y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean b(@fh.g android.graphics.Bitmap r2, @fh.g android.graphics.Point r3) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "p"
            xe.l0.p(r3, r0)
            int r0 = r3.x
            if (r0 < 0) goto L_0x0020
            int r1 = r2.getWidth()
            if (r0 >= r1) goto L_0x0020
            int r3 = r3.y
            if (r3 < 0) goto L_0x0020
            int r2 = r2.getHeight()
            if (r3 >= r2) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.c.b(android.graphics.Bitmap, android.graphics.Point):boolean");
    }

    public static final boolean c(@g Bitmap bitmap, @g PointF pointF) {
        l0.p(bitmap, "<this>");
        l0.p(pointF, "p");
        float f10 = pointF.x;
        if (f10 >= 0.0f && f10 < ((float) bitmap.getWidth())) {
            float f11 = pointF.y;
            return f11 >= 0.0f && f11 < ((float) bitmap.getHeight());
        }
    }

    @g
    public static final Bitmap d(int i10, int i11, @g Bitmap.Config config) {
        l0.p(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, config);
        l0.o(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    @t0(26)
    @g
    public static final Bitmap e(int i10, int i11, @g Bitmap.Config config, boolean z10, @g ColorSpace colorSpace) {
        l0.p(config, "config");
        l0.p(colorSpace, "colorSpace");
        Bitmap a10 = Bitmap.createBitmap(i10, i11, config, z10, colorSpace);
        l0.o(a10, "createBitmap(width, height, config, hasAlpha, colorSpace)");
        return a10;
    }

    public static /* synthetic */ Bitmap f(int i10, int i11, Bitmap.Config config, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        l0.p(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, config);
        l0.o(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap g(int i10, int i11, Bitmap.Config config, boolean z10, ColorSpace colorSpace, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i12 & 8) != 0) {
            z10 = true;
        }
        if ((i12 & 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            l0.o(colorSpace, "get(ColorSpace.Named.SRGB)");
        }
        l0.p(config, "config");
        l0.p(colorSpace, "colorSpace");
        Bitmap a10 = Bitmap.createBitmap(i10, i11, config, z10, colorSpace);
        l0.o(a10, "createBitmap(width, height, config, hasAlpha, colorSpace)");
        return a10;
    }

    public static final int h(@g Bitmap bitmap, int i10, int i11) {
        l0.p(bitmap, "<this>");
        return bitmap.getPixel(i10, i11);
    }

    @g
    public static final Bitmap i(@g Bitmap bitmap, int i10, int i11, boolean z10) {
        l0.p(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, z10);
        l0.o(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static /* synthetic */ Bitmap j(Bitmap bitmap, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z10 = true;
        }
        l0.p(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, z10);
        l0.o(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static final void k(@g Bitmap bitmap, int i10, int i11, @d.l int i12) {
        l0.p(bitmap, "<this>");
        bitmap.setPixel(i10, i11, i12);
    }
}
