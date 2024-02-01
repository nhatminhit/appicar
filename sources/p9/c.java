package p9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import com.google.android.material.internal.n;
import d.f;
import d.m0;
import d.o0;
import d.x0;
import i9.a;

@x0({x0.a.LIBRARY_GROUP})
public class c {
    @m0
    public static Rect a(@m0 Context context, @f int i10, int i11) {
        TypedArray j10 = n.j(context, (AttributeSet) null, a.o.MaterialAlertDialog, i10, i11, new int[0]);
        int dimensionPixelSize = j10.getDimensionPixelSize(a.o.MaterialAlertDialog_backgroundInsetStart, context.getResources().getDimensionPixelSize(a.f.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = j10.getDimensionPixelSize(a.o.MaterialAlertDialog_backgroundInsetTop, context.getResources().getDimensionPixelSize(a.f.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = j10.getDimensionPixelSize(a.o.MaterialAlertDialog_backgroundInsetEnd, context.getResources().getDimensionPixelSize(a.f.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = j10.getDimensionPixelSize(a.o.MaterialAlertDialog_backgroundInsetBottom, context.getResources().getDimensionPixelSize(a.f.mtrl_alert_dialog_background_inset_bottom));
        j10.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            int i12 = dimensionPixelSize3;
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = i12;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    @m0
    public static InsetDrawable b(@o0 Drawable drawable, @m0 Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
