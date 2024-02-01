package f1;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import d.m0;
import d.o0;
import d.t0;
import e1.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n0.h0;
import x0.a;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7116a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(Rect rect, List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? new DisplayCutout(rect, list) : null);
    }

    public f(Object obj) {
        this.f7116a = obj;
    }

    public f(@m0 h0 h0Var, @o0 Rect rect, @o0 Rect rect2, @o0 Rect rect3, @o0 Rect rect4, @m0 h0 h0Var2) {
        this(a(h0Var, rect, rect2, rect3, rect4, h0Var2));
    }

    public static DisplayCutout a(@m0 h0 h0Var, @o0 Rect rect, @o0 Rect rect2, @o0 Rect rect3, @o0 Rect rect4, @m0 h0 h0Var2) {
        if (a.h()) {
            return new DisplayCutout(h0Var.h(), rect, rect2, rect3, rect4, h0Var2.h());
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            return new DisplayCutout(h0Var.h(), rect, rect2, rect3, rect4);
        }
        if (i10 < 28) {
            return null;
        }
        Rect rect5 = new Rect(h0Var.f10722a, h0Var.f10723b, h0Var.f10724c, h0Var.f10725d);
        ArrayList arrayList = new ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return new DisplayCutout(rect5, arrayList);
    }

    public static f i(Object obj) {
        if (obj == null) {
            return null;
        }
        return new f(obj);
    }

    @m0
    public List<Rect> b() {
        return Build.VERSION.SDK_INT >= 28 ? ((DisplayCutout) this.f7116a).getBoundingRects() : Collections.emptyList();
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f7116a).getSafeInsetBottom();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f7116a).getSafeInsetLeft();
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f7116a).getSafeInsetRight();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        return i.a(this.f7116a, ((f) obj).f7116a);
    }

    public int f() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f7116a).getSafeInsetTop();
        }
        return 0;
    }

    @m0
    public h0 g() {
        return a.h() ? h0.g(((DisplayCutout) this.f7116a).getWaterfallInsets()) : h0.f10721e;
    }

    @t0(api = 28)
    public DisplayCutout h() {
        return (DisplayCutout) this.f7116a;
    }

    public int hashCode() {
        Object obj = this.f7116a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f7116a + p7.a.f11639j;
    }
}
