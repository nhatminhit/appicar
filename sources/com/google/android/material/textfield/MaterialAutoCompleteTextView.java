package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.i0;
import com.google.android.material.internal.e;
import com.google.android.material.internal.n;
import d.m0;
import d.o0;
import i9.a;

public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    public static final int U = 15;
    @m0
    public final i0 R;
    @o0
    public final AccessibilityManager S;
    @m0
    public final Rect T;

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            MaterialAutoCompleteTextView.this.e(i10 < 0 ? materialAutoCompleteTextView.R.C() : materialAutoCompleteTextView.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = MaterialAutoCompleteTextView.this.R.F();
                    i10 = MaterialAutoCompleteTextView.this.R.E();
                    j10 = MaterialAutoCompleteTextView.this.R.D();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.R.k(), view, i10, j10);
            }
            MaterialAutoCompleteTextView.this.R.dismiss();
        }
    }

    public MaterialAutoCompleteTextView(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialAutoCompleteTextView(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(ca.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.T = new Rect();
        Context context2 = getContext();
        TypedArray j10 = n.j(context2, attributeSet, a.o.MaterialAutoCompleteTextView, i10, a.n.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i11 = a.o.MaterialAutoCompleteTextView_android_inputType;
        if (j10.hasValue(i11) && j10.getInt(i11, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.S = (AccessibilityManager) context2.getSystemService("accessibility");
        i0 i0Var = new i0(context2);
        this.R = i0Var;
        i0Var.d0(true);
        i0Var.S(this);
        i0Var.a0(2);
        i0Var.q(getAdapter());
        i0Var.f0(new a());
        j10.recycle();
    }

    @o0
    public final TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final int d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout c10 = c();
        int i10 = 0;
        if (adapter == null || c10 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.R.E()) + 15);
        View view = null;
        int i11 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(max, view, c10);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        Drawable i12 = this.R.i();
        if (i12 != null) {
            i12.getPadding(this.T);
            Rect rect = this.T;
            i11 += rect.left + rect.right;
        }
        return i11 + c10.getEndIconView().getMeasuredWidth();
    }

    public final <T extends ListAdapter & Filterable> void e(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @o0
    public CharSequence getHint() {
        TextInputLayout c10 = c();
        return (c10 == null || !c10.Z()) ? super.getHint() : c10.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout c10 = c();
        if (c10 != null && c10.Z() && super.getHint() == null && e.c()) {
            setHint("");
        }
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), d()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(@o0 T t10) {
        super.setAdapter(t10);
        this.R.q(getAdapter());
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.S;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.R.a();
        }
    }
}
