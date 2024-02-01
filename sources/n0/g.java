package n0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;
import we.l;
import xe.i0;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a=\u0010\t\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001aG\u0010\r\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001aQ\u0010\u000e\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a=\u0010\u000f\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a1\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a1\u0010\u0017\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00162\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001aI\u0010\u001d\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001aI\u0010\u001e\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a1\u0010!\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\""}, d2 = {"Landroid/graphics/Canvas;", "Lkotlin/Function1;", "Lzd/u2;", "Lzd/u;", "block", "j", "", "x", "y", "o", "degrees", "pivotX", "pivotY", "h", "k", "m", "Landroid/graphics/Matrix;", "matrix", "f", "Landroid/graphics/Rect;", "clipRect", "d", "Landroid/graphics/RectF;", "e", "", "left", "top", "right", "bottom", "b", "a", "Landroid/graphics/Path;", "clipPath", "c", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class g {
    public static final void a(@fh.g Canvas canvas, float f10, float f11, float f12, float f13, @fh.g l<? super Canvas, u2> lVar) {
        l0.p(canvas, "<this>");
        l0.p(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(f10, f11, f12, f13);
        try {
            lVar.A(canvas);
        } finally {
            i0.d(1);
            canvas.restoreToCount(save);
            i0.c(1);
        }
    }

    public static final void b(@fh.g Canvas canvas, int i10, int i11, int i12, int i13, @fh.g l<? super Canvas, u2> lVar) {
        l0.p(canvas, "<this>");
        l0.p(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(i10, i11, i12, i13);
        try {
            lVar.A(canvas);
        } finally {
            i0.d(1);
            canvas.restoreToCount(save);
            i0.c(1);
        }
    }

    public static final void c(@fh.g Canvas canvas, @fh.g Path path, @fh.g l<? super Canvas, u2> lVar) {
        l0.p(canvas, "<this>");
        l0.p(path, "clipPath");
        l0.p(lVar, "block");
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            lVar.A(canvas);
        } finally {
            i0.d(1);
            canvas.restoreToCount(save);
            i0.c(1);
        }
    }

    public static final void d(@fh.g Canvas canvas, @fh.g Rect rect, @fh.g l<? super Canvas, u2> lVar) {
        l0.p(canvas, "<this>");
        l0.p(rect, "clipRect");
        l0.p(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            lVar.A(canvas);
        } finally {
            i0.d(1);
            canvas.restoreToCount(save);
            i0.c(1);
        }
    }

    public static final void e(@fh.g Canvas canvas, @fh.g RectF rectF, @fh.g l<? super Canvas, u2> lVar) {
        l0.p(canvas, "<this>");
        l0.p(rectF, "clipRect");
        l0.p(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            lVar.A(canvas);
        } finally {
            i0.d(1);
            canvas.restoreToCount(save);
            i0.c(1);
        }
    }

    public static final void f(@fh.g Canvas canvas, @fh.g Matrix matrix, @fh.g l<? super Canvas, u2> lVar) {
        l0.p(canvas, "<this>");
        l0.p(matrix, "matrix");
        l0.p(lVar, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.A(canvas);
        } finally {
            i0.d(1);
            canvas.restoreToCount(save);
            i0.c(1);
        }
    }

    public static /* synthetic */ void g(Canvas canvas, Matrix matrix, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            matrix = new Matrix();
        }
        l0.p(canvas, "<this>");
        l0.p(matrix, "matrix");
        l0.p(lVar, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.A(canvas);
        } finally {
            i0.d(1);
            canvas.restoreToCount(save);
            i0.c(1);
        }
    }

    public static final void h(@fh.g Canvas canvas, float f10, float f11, float f12, @fh.g l<? super Canvas, u2> lVar) {
        l0.p(canvas, "<this>");
        l0.p(lVar, "block");
        int save = canvas.save();
        canvas.rotate(f10, f11, f12);
        try {
            lVar.A(canvas);
        } finally {
            i0.d(1);
            canvas.restoreToCount(save);
            i0.c(1);
        }
    }

    public static /* synthetic */ void i(Canvas canvas, float f10, float f11, float f12, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        l0.p(canvas, "<this>");
        l0.p(lVar, "block");
        int save = canvas.save();
        canvas.rotate(f10, f11, f12);
        try {
            lVar.A(canvas);
        } finally {
            i0.d(1);
            canvas.restoreToCount(save);
            i0.c(1);
        }
    }

    public static final void j(@fh.g Canvas canvas, @fh.g l<? super Canvas, u2> lVar) {
        l0.p(canvas, "<this>");
        l0.p(lVar, "block");
        int save = canvas.save();
        try {
            lVar.A(canvas);
        } finally {
            i0.d(1);
            canvas.restoreToCount(save);
            i0.c(1);
        }
    }

    public static final void k(@fh.g Canvas canvas, float f10, float f11, float f12, float f13, @fh.g l<? super Canvas, u2> lVar) {
        l0.p(canvas, "<this>");
        l0.p(lVar, "block");
        int save = canvas.save();
        canvas.scale(f10, f11, f12, f13);
        try {
            lVar.A(canvas);
        } finally {
            i0.d(1);
            canvas.restoreToCount(save);
            i0.c(1);
        }
    }

    public static /* synthetic */ void l(Canvas canvas, float f10, float f11, float f12, float f13, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f13 = 0.0f;
        }
        l0.p(canvas, "<this>");
        l0.p(lVar, "block");
        int save = canvas.save();
        canvas.scale(f10, f11, f12, f13);
        try {
            lVar.A(canvas);
        } finally {
            i0.d(1);
            canvas.restoreToCount(save);
            i0.c(1);
        }
    }

    public static final void m(@fh.g Canvas canvas, float f10, float f11, @fh.g l<? super Canvas, u2> lVar) {
        l0.p(canvas, "<this>");
        l0.p(lVar, "block");
        int save = canvas.save();
        canvas.skew(f10, f11);
        try {
            lVar.A(canvas);
        } finally {
            i0.d(1);
            canvas.restoreToCount(save);
            i0.c(1);
        }
    }

    public static /* synthetic */ void n(Canvas canvas, float f10, float f11, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        l0.p(canvas, "<this>");
        l0.p(lVar, "block");
        int save = canvas.save();
        canvas.skew(f10, f11);
        try {
            lVar.A(canvas);
        } finally {
            i0.d(1);
            canvas.restoreToCount(save);
            i0.c(1);
        }
    }

    public static final void o(@fh.g Canvas canvas, float f10, float f11, @fh.g l<? super Canvas, u2> lVar) {
        l0.p(canvas, "<this>");
        l0.p(lVar, "block");
        int save = canvas.save();
        canvas.translate(f10, f11);
        try {
            lVar.A(canvas);
        } finally {
            i0.d(1);
            canvas.restoreToCount(save);
            i0.c(1);
        }
    }

    public static /* synthetic */ void p(Canvas canvas, float f10, float f11, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        l0.p(canvas, "<this>");
        l0.p(lVar, "block");
        int save = canvas.save();
        canvas.translate(f10, f11);
        try {
            lVar.A(canvas);
        } finally {
            i0.d(1);
            canvas.restoreToCount(save);
            i0.c(1);
        }
    }
}
