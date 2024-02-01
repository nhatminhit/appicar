package f1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import d.t0;
import d.x0;
import e0.a;
import g1.a0;
import g1.z;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f7001c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f7002a;

    /* renamed from: b  reason: collision with root package name */
    public final View.AccessibilityDelegate f7003b;

    /* renamed from: f1.a$a  reason: collision with other inner class name */
    public static final class C0116a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f7004a;

        public C0116a(a aVar) {
            this.f7004a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f7004a.a(view, accessibilityEvent);
        }

        @t0(16)
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            a0 b10 = this.f7004a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f7004a.f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            z V1 = z.V1(accessibilityNodeInfo);
            V1.C1(w1.Y0(view));
            V1.i1(w1.M0(view));
            V1.w1(w1.H(view));
            V1.I1(w1.u0(view));
            this.f7004a.g(view, V1);
            V1.f(accessibilityNodeInfo.getText(), view);
            List<z.a> c10 = a.c(view);
            for (int i10 = 0; i10 < c10.size(); i10++) {
                V1.b(c10.get(i10));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f7004a.h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f7004a.i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f7004a.j(view, i10, bundle);
        }

        public void sendAccessibilityEvent(View view, int i10) {
            this.f7004a.l(view, i10);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f7004a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f7001c);
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f7002a = accessibilityDelegate;
        this.f7003b = new C0116a(this);
    }

    public static List<z.a> c(View view) {
        List<z.a> list = (List) view.getTag(a.e.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f7002a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public a0 b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f7002a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new a0(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate d() {
        return this.f7003b;
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] w10 = z.w(view.createAccessibilityNodeInfo().getText());
            int i10 = 0;
            while (w10 != null && i10 < w10.length) {
                if (clickableSpan.equals(w10[i10])) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f7002a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, z zVar) {
        this.f7002a.onInitializeAccessibilityNodeInfo(view, zVar.U1());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f7002a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f7002a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List<z.a> c10 = c(view);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= c10.size()) {
                break;
            }
            z.a aVar = c10.get(i11);
            if (aVar.b() == i10) {
                z10 = aVar.d(view, bundle);
                break;
            }
            i11++;
        }
        if (!z10) {
            z10 = this.f7002a.performAccessibilityAction(view, i10, bundle);
        }
        return (z10 || i10 != a.e.accessibility_action_clickable_span) ? z10 : k(bundle.getInt(g1.a.R, -1), view);
    }

    public final boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(a.e.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void l(View view, int i10) {
        this.f7002a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f7002a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
