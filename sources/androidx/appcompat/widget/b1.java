package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import d.m0;
import d.x0;
import f.a;
import i4.e;

@x0({x0.a.Q})
public class b1 {

    /* renamed from: h  reason: collision with root package name */
    public static final String f1232h = "TooltipPopup";

    /* renamed from: a  reason: collision with root package name */
    public final Context f1233a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1234b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f1235c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f1236d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f1237e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1238f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1239g = new int[2];

    public b1(@m0 Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1236d = layoutParams;
        this.f1233a = context;
        View inflate = LayoutInflater.from(context).inflate(a.k.abc_tooltip, (ViewGroup) null);
        this.f1234b = inflate;
        this.f1235c = (TextView) inflate.findViewById(a.h.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = a.m.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    public final void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int i12;
        int i13;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1233a.getResources().getDimensionPixelOffset(a.f.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1233a.getResources().getDimensionPixelOffset(a.f.tooltip_precise_anchor_extra_offset);
            i13 = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            i13 = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1233a.getResources().getDimensionPixelOffset(z10 ? a.f.tooltip_y_offset_touch : a.f.tooltip_y_offset_non_touch);
        View b10 = b(view);
        if (b10 != null) {
            b10.getWindowVisibleDisplayFrame(this.f1237e);
            Rect rect = this.f1237e;
            if (rect.left < 0 && rect.top < 0) {
                Resources resources = this.f1233a.getResources();
                int identifier = resources.getIdentifier("status_bar_height", "dimen", e.f9023b);
                int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                this.f1237e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            b10.getLocationOnScreen(this.f1239g);
            view.getLocationOnScreen(this.f1238f);
            int[] iArr = this.f1238f;
            int i14 = iArr[0];
            int[] iArr2 = this.f1239g;
            int i15 = i14 - iArr2[0];
            iArr[0] = i15;
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (i15 + i10) - (b10.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f1234b.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = this.f1234b.getMeasuredHeight();
            int i16 = this.f1238f[1];
            int i17 = ((i12 + i16) - dimensionPixelOffset3) - measuredHeight;
            int i18 = i16 + i13 + dimensionPixelOffset3;
            if (!z10 ? measuredHeight + i18 > this.f1237e.height() : i17 >= 0) {
                layoutParams.y = i17;
            } else {
                layoutParams.y = i18;
            }
        }
    }

    public void c() {
        if (d()) {
            ((WindowManager) this.f1233a.getSystemService("window")).removeView(this.f1234b);
        }
    }

    public boolean d() {
        return this.f1234b.getParent() != null;
    }

    public void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1235c.setText(charSequence);
        a(view, i10, i11, z10, this.f1236d);
        ((WindowManager) this.f1233a.getSystemService("window")).addView(this.f1234b, this.f1236d);
    }
}
