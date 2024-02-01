package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.internal.v;
import d.m0;
import d.o0;
import e1.j;
import f1.w1;
import g1.z;
import i9.a;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {
    public final Calendar O;
    public final boolean P;

    public class a extends f1.a {
        public a() {
        }

        public void g(View view, @m0 z zVar) {
            super.g(view, zVar);
            zVar.W0((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.O = m.v();
        if (MaterialDatePicker.n1(getContext())) {
            setNextFocusLeftId(a.h.cancel_button);
            setNextFocusRightId(a.h.confirm_button);
        }
        this.P = MaterialDatePicker.o1(getContext());
        w1.z1(this, new a());
    }

    public static int c(@m0 View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    public static boolean d(@o0 Long l10, @o0 Long l11, @o0 Long l12, @o0 Long l13) {
        return l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue();
    }

    public final void a(int i10, Rect rect) {
        int b10;
        if (i10 == 33) {
            b10 = getAdapter().i();
        } else if (i10 == 130) {
            b10 = getAdapter().b();
        } else {
            super.onFocusChanged(true, i10, rect);
            return;
        }
        setSelection(b10);
    }

    @m0
    /* renamed from: b */
    public g getAdapter() {
        return (g) super.getAdapter();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(@m0 Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        g b10 = getAdapter();
        DateSelector<?> dateSelector = b10.P;
        b bVar = b10.R;
        Long c10 = b10.getItem(b10.b());
        Long c11 = b10.getItem(b10.i());
        for (j next : dateSelector.k()) {
            F f10 = next.f6732a;
            if (f10 != null) {
                if (next.f6733b != null) {
                    long longValue = ((Long) f10).longValue();
                    long longValue2 = ((Long) next.f6733b).longValue();
                    if (!d(c10, c11, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean j10 = v.j(this);
                        if (longValue < c10.longValue()) {
                            i11 = b10.b();
                            if (b10.f(i11)) {
                                i10 = 0;
                            } else {
                                View childAt = materialCalendarGridView.getChildAt(i11 - 1);
                                i10 = !j10 ? childAt.getRight() : childAt.getLeft();
                            }
                        } else {
                            materialCalendarGridView.O.setTimeInMillis(longValue);
                            i11 = b10.a(materialCalendarGridView.O.get(5));
                            i10 = c(materialCalendarGridView.getChildAt(i11));
                        }
                        if (longValue2 > c11.longValue()) {
                            i13 = Math.min(b10.i(), getChildCount() - 1);
                            if (b10.g(i13)) {
                                i12 = getWidth();
                            } else {
                                View childAt2 = materialCalendarGridView.getChildAt(i13);
                                i12 = !j10 ? childAt2.getRight() : childAt2.getLeft();
                            }
                        } else {
                            materialCalendarGridView.O.setTimeInMillis(longValue2);
                            i13 = b10.a(materialCalendarGridView.O.get(5));
                            i12 = c(materialCalendarGridView.getChildAt(i13));
                        }
                        int itemId = (int) b10.getItemId(i11);
                        int itemId2 = (int) b10.getItemId(i13);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt3 = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt3.getTop() + bVar.f17012a.e();
                            int bottom = childAt3.getBottom() - bVar.f17012a.b();
                            if (!j10) {
                                i15 = numColumns > i11 ? 0 : i10;
                                i14 = i13 > numColumns2 ? getWidth() : i12;
                            } else {
                                int i16 = i13 > numColumns2 ? 0 : i12;
                                i14 = numColumns > i11 ? getWidth() : i10;
                                i15 = i16;
                            }
                            canvas.drawRect((float) i15, (float) top, (float) i14, (float) bottom, bVar.f17019h);
                            itemId++;
                            materialCalendarGridView = this;
                            b10 = b10;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            a(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    public void onMeasure(int i10, int i11) {
        if (this.P) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(w1.f7299s, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i10, i11);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof g) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), g.class.getCanonicalName()}));
        }
    }

    public void setSelection(int i10) {
        if (i10 < getAdapter().b()) {
            i10 = getAdapter().b();
        }
        super.setSelection(i10);
    }
}
