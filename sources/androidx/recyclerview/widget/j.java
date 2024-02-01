package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import d.o0;

public class j extends RecyclerView.n {

    /* renamed from: d  reason: collision with root package name */
    public static final int f3560d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final int f3561e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final String f3562f = "DividerItem";

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f3563g = {16843284};

    /* renamed from: a  reason: collision with root package name */
    public Drawable f3564a;

    /* renamed from: b  reason: collision with root package name */
    public int f3565b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f3566c = new Rect();

    public j(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f3563g);
        this.f3564a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        p(i10);
    }

    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        Drawable drawable = this.f3564a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f3565b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (recyclerView.getLayoutManager() != null && this.f3564a != null) {
            if (this.f3565b == 1) {
                m(canvas, recyclerView);
            } else {
                l(canvas, recyclerView);
            }
        }
    }

    public final void l(Canvas canvas, RecyclerView recyclerView) {
        int i10;
        int i11;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i11 = recyclerView.getPaddingTop();
            i10 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i11, recyclerView.getWidth() - recyclerView.getPaddingRight(), i10);
        } else {
            i10 = recyclerView.getHeight();
            i11 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            recyclerView.getLayoutManager().X(childAt, this.f3566c);
            int round = this.f3566c.right + Math.round(childAt.getTranslationX());
            this.f3564a.setBounds(round - this.f3564a.getIntrinsicWidth(), i11, round, i10);
            this.f3564a.draw(canvas);
        }
        canvas.restore();
    }

    public final void m(Canvas canvas, RecyclerView recyclerView) {
        int i10;
        int i11;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i11 = recyclerView.getPaddingLeft();
            i10 = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i11, recyclerView.getPaddingTop(), i10, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i10 = recyclerView.getWidth();
            i11 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            recyclerView.u0(childAt, this.f3566c);
            int round = this.f3566c.bottom + Math.round(childAt.getTranslationY());
            this.f3564a.setBounds(i11, round - this.f3564a.getIntrinsicHeight(), i10, round);
            this.f3564a.draw(canvas);
        }
        canvas.restore();
    }

    @o0
    public Drawable n() {
        return this.f3564a;
    }

    public void o(@m0 Drawable drawable) {
        if (drawable != null) {
            this.f3564a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    public void p(int i10) {
        if (i10 == 0 || i10 == 1) {
            this.f3565b = i10;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }
}
