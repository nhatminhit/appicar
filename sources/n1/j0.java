package n1;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.databinding.d;
import androidx.databinding.g;
import androidx.databinding.h;
import d.x0;
import p1.c;

@x0({x0.a.LIBRARY})
@h({@g(attribute = "android:backgroundTint", method = "setBackgroundTintList", type = View.class), @g(attribute = "android:fadeScrollbars", method = "setScrollbarFadingEnabled", type = View.class), @g(attribute = "android:getOutline", method = "setOutlineProvider", type = View.class), @g(attribute = "android:nextFocusForward", method = "setNextFocusForwardId", type = View.class), @g(attribute = "android:nextFocusLeft", method = "setNextFocusLeftId", type = View.class), @g(attribute = "android:nextFocusRight", method = "setNextFocusRightId", type = View.class), @g(attribute = "android:nextFocusUp", method = "setNextFocusUpId", type = View.class), @g(attribute = "android:nextFocusDown", method = "setNextFocusDownId", type = View.class), @g(attribute = "android:requiresFadingEdge", method = "setVerticalFadingEdgeEnabled", type = View.class), @g(attribute = "android:scrollbarDefaultDelayBeforeFade", method = "setScrollBarDefaultDelayBeforeFade", type = View.class), @g(attribute = "android:scrollbarFadeDuration", method = "setScrollBarFadeDuration", type = View.class), @g(attribute = "android:scrollbarSize", method = "setScrollBarSize", type = View.class), @g(attribute = "android:scrollbarStyle", method = "setScrollBarStyle", type = View.class), @g(attribute = "android:transformPivotX", method = "setPivotX", type = View.class), @g(attribute = "android:transformPivotY", method = "setPivotY", type = View.class), @g(attribute = "android:onDrag", method = "setOnDragListener", type = View.class), @g(attribute = "android:onClick", method = "setOnClickListener", type = View.class), @g(attribute = "android:onApplyWindowInsets", method = "setOnApplyWindowInsetsListener", type = View.class), @g(attribute = "android:onCreateContextMenu", method = "setOnCreateContextMenuListener", type = View.class), @g(attribute = "android:onFocusChange", method = "setOnFocusChangeListener", type = View.class), @g(attribute = "android:onGenericMotion", method = "setOnGenericMotionListener", type = View.class), @g(attribute = "android:onHover", method = "setOnHoverListener", type = View.class), @g(attribute = "android:onKey", method = "setOnKeyListener", type = View.class), @g(attribute = "android:onLongClick", method = "setOnLongClickListener", type = View.class), @g(attribute = "android:onSystemUiVisibilityChange", method = "setOnSystemUiVisibilityChangeListener", type = View.class), @g(attribute = "android:onTouch", method = "setOnTouchListener", type = View.class)})
public class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f10773a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f10774b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f10775c = 2;

    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ b O;
        public final /* synthetic */ c P;

        public a(b bVar, c cVar) {
            this.O = bVar;
            this.P = cVar;
        }

        public void onViewAttachedToWindow(View view) {
            b bVar = this.O;
            if (bVar != null) {
                bVar.onViewAttachedToWindow(view);
            }
        }

        public void onViewDetachedFromWindow(View view) {
            c cVar = this.P;
            if (cVar != null) {
                cVar.onViewDetachedFromWindow(view);
            }
        }
    }

    @TargetApi(12)
    public interface b {
        void onViewAttachedToWindow(View view);
    }

    @TargetApi(12)
    public interface c {
        void onViewDetachedFromWindow(View view);
    }

    public static int a(float f10) {
        int i10 = (int) (0.5f + f10);
        if (i10 != 0) {
            return i10;
        }
        int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i11 == 0) {
            return 0;
        }
        return i11 > 0 ? 1 : -1;
    }

    @d({"android:background"})
    public static void b(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @d({"android:onClickListener", "android:clickable"})
    public static void c(View view, View.OnClickListener onClickListener, boolean z10) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z10);
    }

    @d(requireAll = false, value = {"android:onViewDetachedFromWindow", "android:onViewAttachedToWindow"})
    public static void d(View view, c cVar, b bVar) {
        a aVar = (cVar == null && bVar == null) ? null : new a(bVar, cVar);
        View.OnAttachStateChangeListener onAttachStateChangeListener = (View.OnAttachStateChangeListener) r.b(view, aVar, c.g.onAttachStateChangeListener);
        if (onAttachStateChangeListener != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        if (aVar != null) {
            view.addOnAttachStateChangeListener(aVar);
        }
    }

    @d({"android:onClick", "android:clickable"})
    public static void e(View view, View.OnClickListener onClickListener, boolean z10) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z10);
    }

    @d({"android:onLayoutChange"})
    public static void f(View view, View.OnLayoutChangeListener onLayoutChangeListener, View.OnLayoutChangeListener onLayoutChangeListener2) {
        if (onLayoutChangeListener != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        if (onLayoutChangeListener2 != null) {
            view.addOnLayoutChangeListener(onLayoutChangeListener2);
        }
    }

    @d({"android:onLongClick", "android:longClickable"})
    public static void g(View view, View.OnLongClickListener onLongClickListener, boolean z10) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z10);
    }

    @d({"android:onLongClickListener", "android:longClickable"})
    public static void h(View view, View.OnLongClickListener onLongClickListener, boolean z10) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z10);
    }

    @d({"android:padding"})
    public static void i(View view, float f10) {
        int a10 = a(f10);
        view.setPadding(a10, a10, a10, a10);
    }

    @d({"android:paddingBottom"})
    public static void j(View view, float f10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a(f10));
    }

    @d({"android:paddingEnd"})
    public static void k(View view, float f10) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), a(f10), view.getPaddingBottom());
    }

    @d({"android:paddingLeft"})
    public static void l(View view, float f10) {
        view.setPadding(a(f10), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    @d({"android:paddingRight"})
    public static void m(View view, float f10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), a(f10), view.getPaddingBottom());
    }

    @d({"android:paddingStart"})
    public static void n(View view, float f10) {
        view.setPaddingRelative(a(f10), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    @d({"android:paddingTop"})
    public static void o(View view, float f10) {
        view.setPadding(view.getPaddingLeft(), a(f10), view.getPaddingRight(), view.getPaddingBottom());
    }

    @d({"android:requiresFadingEdge"})
    public static void p(View view, int i10) {
        boolean z10 = false;
        boolean z11 = (i10 & 2) != 0;
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        view.setVerticalFadingEdgeEnabled(z11);
        view.setHorizontalFadingEdgeEnabled(z10);
    }
}
