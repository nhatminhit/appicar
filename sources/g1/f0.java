package g1;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityWindowInfo;
import d.m0;

public class f0 {

    /* renamed from: b  reason: collision with root package name */
    public static final int f7557b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f7558c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f7559d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f7560e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static final int f7561f = 4;

    /* renamed from: g  reason: collision with root package name */
    public static final int f7562g = 5;

    /* renamed from: a  reason: collision with root package name */
    public Object f7563a;

    public f0(Object obj) {
        this.f7563a = obj;
    }

    public static f0 n() {
        return r(AccessibilityWindowInfo.obtain());
    }

    public static f0 o(f0 f0Var) {
        if (f0Var == null) {
            return null;
        }
        return r(AccessibilityWindowInfo.obtain((AccessibilityWindowInfo) f0Var.f7563a));
    }

    public static String q(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    public static f0 r(Object obj) {
        if (obj != null) {
            return new f0(obj);
        }
        return null;
    }

    public z a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return z.W1(((AccessibilityWindowInfo) this.f7563a).getAnchor());
        }
        return null;
    }

    public void b(Rect rect) {
        ((AccessibilityWindowInfo) this.f7563a).getBoundsInScreen(rect);
    }

    public f0 c(int i10) {
        return r(((AccessibilityWindowInfo) this.f7563a).getChild(i10));
    }

    public int d() {
        return ((AccessibilityWindowInfo) this.f7563a).getChildCount();
    }

    public int e() {
        return ((AccessibilityWindowInfo) this.f7563a).getId();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f0)) {
            return false;
        }
        Object obj2 = this.f7563a;
        Object obj3 = ((f0) obj).f7563a;
        if (obj2 == null) {
            if (obj3 != null) {
                return false;
            }
        } else if (!obj2.equals(obj3)) {
            return false;
        }
        return true;
    }

    public int f() {
        return ((AccessibilityWindowInfo) this.f7563a).getLayer();
    }

    public f0 g() {
        return r(((AccessibilityWindowInfo) this.f7563a).getParent());
    }

    public z h() {
        return z.W1(((AccessibilityWindowInfo) this.f7563a).getRoot());
    }

    public int hashCode() {
        Object obj = this.f7563a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public CharSequence i() {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((AccessibilityWindowInfo) this.f7563a).getTitle();
        }
        return null;
    }

    public int j() {
        return ((AccessibilityWindowInfo) this.f7563a).getType();
    }

    public boolean k() {
        return ((AccessibilityWindowInfo) this.f7563a).isAccessibilityFocused();
    }

    public boolean l() {
        return ((AccessibilityWindowInfo) this.f7563a).isActive();
    }

    public boolean m() {
        return ((AccessibilityWindowInfo) this.f7563a).isFocused();
    }

    public void p() {
        ((AccessibilityWindowInfo) this.f7563a).recycle();
    }

    @m0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Rect rect = new Rect();
        b(rect);
        sb2.append("AccessibilityWindowInfo[");
        sb2.append("id=");
        sb2.append(e());
        sb2.append(", type=");
        sb2.append(q(j()));
        sb2.append(", layer=");
        sb2.append(f());
        sb2.append(", bounds=");
        sb2.append(rect);
        sb2.append(", focused=");
        sb2.append(m());
        sb2.append(", active=");
        sb2.append(l());
        sb2.append(", hasParent=");
        boolean z10 = true;
        sb2.append(g() != null);
        sb2.append(", hasChildren=");
        if (d() <= 0) {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(']');
        return sb2.toString();
    }
}
