package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.widget.l;
import d.m0;
import f.a;
import f1.s2;
import h.c;
import java.lang.reflect.Field;
import o0.d;

public class c0 extends ListView {

    /* renamed from: f0  reason: collision with root package name */
    public static final int f1272f0 = -1;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f1273g0 = -1;
    public final Rect O = new Rect();
    public int P = 0;
    public int Q = 0;
    public int R = 0;
    public int S = 0;
    public int T;
    public Field U;
    public a V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1274a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f1275b0;

    /* renamed from: c0  reason: collision with root package name */
    public s2 f1276c0;

    /* renamed from: d0  reason: collision with root package name */
    public l f1277d0;

    /* renamed from: e0  reason: collision with root package name */
    public b f1278e0;

    public static class a extends c {
        public boolean P = true;

        public a(Drawable drawable) {
            super(drawable);
        }

        public void c(boolean z10) {
            this.P = z10;
        }

        public void draw(Canvas canvas) {
            if (this.P) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f10, float f11) {
            if (this.P) {
                super.setHotspot(f10, f11);
            }
        }

        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.P) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.P) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z10, boolean z11) {
            if (this.P) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void a() {
            c0 c0Var = c0.this;
            c0Var.f1278e0 = null;
            c0Var.removeCallbacks(this);
        }

        public void b() {
            c0.this.post(this);
        }

        public void run() {
            c0 c0Var = c0.this;
            c0Var.f1278e0 = null;
            c0Var.drawableStateChanged();
        }
    }

    public c0(@m0 Context context, boolean z10) {
        super(context, (AttributeSet) null, a.c.dropDownListViewStyle);
        this.f1274a0 = z10;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.U = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z10) {
        a aVar = this.V;
        if (aVar != null) {
            aVar.c(z10);
        }
    }

    public final void a() {
        this.f1275b0 = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.T - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        s2 s2Var = this.f1276c0;
        if (s2Var != null) {
            s2Var.c();
            this.f1276c0 = null;
        }
    }

    public final void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (!this.O.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.O);
            selector.draw(canvas);
        }
    }

    public int d(int i10, boolean z10) {
        int i11;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z10) {
                    i11 = Math.max(0, i10);
                    while (i11 < count && !adapter.isEnabled(i11)) {
                        i11++;
                    }
                } else {
                    int min = Math.min(i10, count - 1);
                    while (i11 >= 0 && !adapter.isEnabled(i11)) {
                        min = i11 - 1;
                    }
                }
                if (i11 < 0 || i11 >= count) {
                    return -1;
                }
                return i11;
            } else if (i10 < 0 || i10 >= count) {
                return -1;
            } else {
                return i10;
            }
        }
        return -1;
    }

    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.f1278e0 == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            l();
        }
    }

    public int e(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i15 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i15;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        View view = null;
        while (i16 < count) {
            int itemViewType = adapter.getItemViewType(i16);
            if (itemViewType != i17) {
                view = null;
                i17 = itemViewType;
            }
            view = adapter.getView(i16, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i19 = layoutParams.height;
            view.measure(i10, i19 > 0 ? View.MeasureSpec.makeMeasureSpec(i19, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i16 > 0) {
                i15 += dividerHeight;
            }
            i15 += view.getMeasuredHeight();
            if (i15 >= i13) {
                return (i14 < 0 || i16 <= i14 || i18 <= 0 || i15 == i13) ? i13 : i18;
            }
            if (i14 >= 0 && i16 >= i14) {
                i18 = i15;
            }
            i16++;
        }
        return i15;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = r1
            r3 = r2
            goto L_0x0046
        L_0x0011:
            r9 = r1
            r3 = r9
            goto L_0x0046
        L_0x0014:
            r3 = r2
            goto L_0x0017
        L_0x0016:
            r3 = r1
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = r2
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.j(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.l r9 = r7.f1277d0
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.l r9 = new androidx.core.widget.l
            r9.<init>(r7)
            r7.f1277d0 = r9
        L_0x005a:
            androidx.core.widget.l r9 = r7.f1277d0
            r9.o(r2)
            androidx.core.widget.l r9 = r7.f1277d0
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.l r8 = r7.f1277d0
            if (r8 == 0) goto L_0x006c
            r8.o(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c0.f(android.view.MotionEvent, int):boolean");
    }

    public final void g(int i10, View view) {
        Rect rect = this.O;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.P;
        rect.top -= this.Q;
        rect.right += this.R;
        rect.bottom += this.S;
        try {
            boolean z10 = this.U.getBoolean(this);
            if (view.isEnabled() != z10) {
                this.U.set(this, Boolean.valueOf(!z10));
                if (i10 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        }
    }

    public final void h(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = true;
        boolean z11 = (selector == null || i10 == -1) ? false : true;
        if (z11) {
            selector.setVisible(false, false);
        }
        g(i10, view);
        if (z11) {
            Rect rect = this.O;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z10 = false;
            }
            selector.setVisible(z10, false);
            d.k(selector, exactCenterX, exactCenterY);
        }
    }

    public boolean hasFocus() {
        return this.f1274a0 || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1274a0 || super.hasWindowFocus();
    }

    public final void i(int i10, View view, float f10, float f11) {
        h(i10, view);
        Drawable selector = getSelector();
        if (selector != null && i10 != -1) {
            d.k(selector, f10, f11);
        }
    }

    public boolean isFocused() {
        return this.f1274a0 || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1274a0 && this.W) || super.isInTouchMode();
    }

    public final void j(View view, int i10, float f10, float f11) {
        View childAt;
        this.f1275b0 = true;
        drawableHotspotChanged(f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.T;
        if (!(i11 == -1 || (childAt = getChildAt(i11 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.T = i10;
        view.drawableHotspotChanged(f10 - ((float) view.getLeft()), f11 - ((float) view.getTop()));
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        i(i10, view, f10, f11);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    public final boolean k() {
        return this.f1275b0;
    }

    public final void l() {
        Drawable selector = getSelector();
        if (selector != null && k() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public void onDetachedFromWindow() {
        this.f1278e0 = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(@m0 MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1278e0 == null) {
            b bVar = new b();
            this.f1278e0 = bVar;
            bVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                l();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.T = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f1278e0;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.W = z10;
    }

    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.V = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.P = rect.left;
        this.Q = rect.top;
        this.R = rect.right;
        this.S = rect.bottom;
    }
}
