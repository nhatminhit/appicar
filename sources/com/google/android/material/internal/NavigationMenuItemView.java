package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.z0;
import androidx.core.widget.y;
import d.m0;
import d.o0;
import d.q;
import d.x0;
import f.a;
import f1.w1;
import g1.z;
import i9.a;
import k0.g;
import o0.d;

@x0({x0.a.LIBRARY_GROUP})
public class NavigationMenuItemView extends ForegroundLinearLayout implements k.a {
    public static final int[] I0 = {16842912};
    public boolean A0;
    public final CheckedTextView B0;
    public FrameLayout C0;
    public h D0;
    public ColorStateList E0;
    public boolean F0;
    public Drawable G0;
    public final f1.a H0;

    /* renamed from: y0  reason: collision with root package name */
    public int f17152y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f17153z0;

    public class a extends f1.a {
        public a() {
        }

        public void g(View view, @m0 z zVar) {
            super.g(view, zVar);
            zVar.S0(NavigationMenuItemView.this.A0);
        }
    }

    public NavigationMenuItemView(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationMenuItemView(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        this.H0 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(a.k.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(a.f.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(a.h.design_menu_item_text);
        this.B0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        w1.z1(checkedTextView, aVar);
    }

    private void setActionView(@o0 View view) {
        if (view != null) {
            if (this.C0 == null) {
                this.C0 = (FrameLayout) ((ViewStub) findViewById(a.h.design_menu_item_action_area_stub)).inflate();
            }
            this.C0.removeAllViews();
            this.C0.addView(view);
        }
    }

    public final void D() {
        int i10;
        LinearLayoutCompat.b bVar;
        if (G()) {
            this.B0.setVisibility(8);
            FrameLayout frameLayout = this.C0;
            if (frameLayout != null) {
                bVar = (LinearLayoutCompat.b) frameLayout.getLayoutParams();
                i10 = -1;
            } else {
                return;
            }
        } else {
            this.B0.setVisibility(0);
            FrameLayout frameLayout2 = this.C0;
            if (frameLayout2 != null) {
                bVar = (LinearLayoutCompat.b) frameLayout2.getLayoutParams();
                i10 = -2;
            } else {
                return;
            }
        }
        bVar.width = i10;
        this.C0.setLayoutParams(bVar);
    }

    @o0
    public final StateListDrawable E() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(a.c.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(I0, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public void F() {
        FrameLayout frameLayout = this.C0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.B0.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final boolean G() {
        return this.D0.getTitle() == null && this.D0.getIcon() == null && this.D0.getActionView() != null;
    }

    public void b(boolean z10, char c10) {
    }

    public boolean d() {
        return false;
    }

    public boolean f() {
        return true;
    }

    public void g(@m0 h hVar, int i10) {
        this.D0 = hVar;
        if (hVar.getItemId() > 0) {
            setId(hVar.getItemId());
        }
        setVisibility(hVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            w1.G1(this, E());
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.getTitle());
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.getContentDescription());
        z0.a(this, hVar.getTooltipText());
        D();
    }

    public h getItemData() {
        return this.D0;
    }

    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        h hVar = this.D0;
        if (hVar != null && hVar.isCheckable() && this.D0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, I0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.A0 != z10) {
            this.A0 = z10;
            this.H0.l(this.B0, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.B0.setChecked(z10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, 0, i10, 0);
    }

    public void setIcon(@o0 Drawable drawable) {
        if (drawable != null) {
            if (this.F0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = d.r(drawable).mutate();
                d.o(drawable, this.E0);
            }
            int i10 = this.f17152y0;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f17153z0) {
            if (this.G0 == null) {
                Drawable f10 = g.f(getResources(), a.g.navigation_empty_icon, getContext().getTheme());
                this.G0 = f10;
                if (f10 != null) {
                    int i11 = this.f17152y0;
                    f10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.G0;
        }
        y.w(this.B0, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i10) {
        this.B0.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(@q int i10) {
        this.f17152y0 = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.E0 = colorStateList;
        this.F0 = colorStateList != null;
        h hVar = this.D0;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.B0.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f17153z0 = z10;
    }

    public void setTextAppearance(int i10) {
        y.E(this.B0, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.B0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.B0.setText(charSequence);
    }
}
