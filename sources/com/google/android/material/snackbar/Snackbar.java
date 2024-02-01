package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import d.a1;
import d.l;
import d.m0;
import d.o0;
import d.q;
import d.x0;
import i9.a;

public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    public static final int[] N;
    public static final int[] O;
    @o0
    public final AccessibilityManager K;
    public boolean L;
    @o0
    public BaseTransientBottomBar.t<Snackbar> M;

    @x0({x0.a.LIBRARY_GROUP})
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(@o0 Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@o0 Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(@o0 ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@o0 PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(@o0 View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    public class a implements View.OnClickListener {
        public final /* synthetic */ View.OnClickListener O;

        public a(View.OnClickListener onClickListener) {
            this.O = onClickListener;
        }

        public void onClick(View view) {
            this.O.onClick(view);
            Snackbar.this.x(1);
        }
    }

    public static class b extends BaseTransientBottomBar.t<Snackbar> {

        /* renamed from: f  reason: collision with root package name */
        public static final int f17406f = 0;

        /* renamed from: g  reason: collision with root package name */
        public static final int f17407g = 1;

        /* renamed from: h  reason: collision with root package name */
        public static final int f17408h = 2;

        /* renamed from: i  reason: collision with root package name */
        public static final int f17409i = 3;

        /* renamed from: j  reason: collision with root package name */
        public static final int f17410j = 4;

        /* renamed from: c */
        public void a(Snackbar snackbar, int i10) {
        }

        /* renamed from: d */
        public void b(Snackbar snackbar) {
        }
    }

    static {
        int i10 = a.c.snackbarButtonStyle;
        N = new int[]{i10};
        O = new int[]{i10, a.c.snackbarTextViewStyle};
    }

    public Snackbar(@m0 Context context, @m0 ViewGroup viewGroup, @m0 View view, @m0 aa.a aVar) {
        super(context, viewGroup, view, aVar);
        this.K = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @o0
    public static ViewGroup n0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    @Deprecated
    public static boolean o0(@m0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(N);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public static boolean p0(@m0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(O);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    @m0
    public static Snackbar q0(@m0 Context context, @m0 View view, @m0 CharSequence charSequence, int i10) {
        return t0(context, view, charSequence, i10);
    }

    @m0
    public static Snackbar r0(@m0 View view, @a1 int i10, int i11) {
        return s0(view, view.getResources().getText(i10), i11);
    }

    @m0
    public static Snackbar s0(@m0 View view, @m0 CharSequence charSequence, int i10) {
        return t0((Context) null, view, charSequence, i10);
    }

    @m0
    public static Snackbar t0(@o0 Context context, @m0 View view, @m0 CharSequence charSequence, int i10) {
        ViewGroup n02 = n0(view);
        if (n02 != null) {
            if (context == null) {
                context = n02.getContext();
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(p0(context) ? a.k.mtrl_layout_snackbar_include : a.k.design_layout_snackbar_include, n02, false);
            Snackbar snackbar = new Snackbar(context, n02, snackbarContentLayout, snackbarContentLayout);
            snackbar.E0(charSequence);
            snackbar.a0(i10);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @m0
    public Snackbar A0(@o0 PorterDuff.Mode mode) {
        this.f17362c.setBackgroundTintMode(mode);
        return this;
    }

    @Deprecated
    @m0
    public Snackbar B0(@o0 b bVar) {
        BaseTransientBottomBar.t<Snackbar> tVar = this.M;
        if (tVar != null) {
            U(tVar);
        }
        if (bVar != null) {
            s(bVar);
        }
        this.M = bVar;
        return this;
    }

    @m0
    public Snackbar C0(@q int i10) {
        ((SnackbarContentLayout) this.f17362c.getChildAt(0)).setMaxInlineActionWidth(i10);
        return this;
    }

    public int D() {
        int D = super.D();
        if (D == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.K.getRecommendedTimeoutMillis(D, (this.L ? 4 : 0) | 1 | 2);
        } else if (!this.L || !this.K.isTouchExplorationEnabled()) {
            return D;
        } else {
            return -2;
        }
    }

    @m0
    public Snackbar D0(@a1 int i10) {
        return E0(C().getText(i10));
    }

    @m0
    public Snackbar E0(@m0 CharSequence charSequence) {
        ((SnackbarContentLayout) this.f17362c.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    @m0
    public Snackbar F0(@l int i10) {
        ((SnackbarContentLayout) this.f17362c.getChildAt(0)).getMessageView().setTextColor(i10);
        return this;
    }

    @m0
    public Snackbar G0(ColorStateList colorStateList) {
        ((SnackbarContentLayout) this.f17362c.getChildAt(0)).getMessageView().setTextColor(colorStateList);
        return this;
    }

    public boolean P() {
        return super.P();
    }

    public void f0() {
        super.f0();
    }

    @m0
    public Snackbar u0(@a1 int i10, View.OnClickListener onClickListener) {
        return v0(C().getText(i10), onClickListener);
    }

    @m0
    public Snackbar v0(@o0 CharSequence charSequence, @o0 View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f17362c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener((View.OnClickListener) null);
            this.L = false;
        } else {
            this.L = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new a(onClickListener));
        }
        return this;
    }

    public void w() {
        super.w();
    }

    @m0
    public Snackbar w0(@l int i10) {
        ((SnackbarContentLayout) this.f17362c.getChildAt(0)).getActionView().setTextColor(i10);
        return this;
    }

    @m0
    public Snackbar x0(ColorStateList colorStateList) {
        ((SnackbarContentLayout) this.f17362c.getChildAt(0)).getActionView().setTextColor(colorStateList);
        return this;
    }

    @m0
    public Snackbar y0(@l int i10) {
        return z0(ColorStateList.valueOf(i10));
    }

    @m0
    public Snackbar z0(@o0 ColorStateList colorStateList) {
        this.f17362c.setBackgroundTintList(colorStateList);
        return this;
    }
}
