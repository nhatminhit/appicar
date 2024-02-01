package g1;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import d.m0;
import d.o0;
import d.t0;
import java.util.ArrayList;
import java.util.List;

public class a0 {

    /* renamed from: b  reason: collision with root package name */
    public static final int f7524b = -1;

    /* renamed from: a  reason: collision with root package name */
    public final Object f7525a;

    @t0(16)
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final a0 f7526a;

        public a(a0 a0Var) {
            this.f7526a = a0Var;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            z b10 = this.f7526a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.U1();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            List<z> c10 = this.f7526a.c(str, i10);
            if (c10 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c10.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(c10.get(i11).U1());
            }
            return arrayList;
        }

        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f7526a.f(i10, i11, bundle);
        }
    }

    @t0(19)
    public static class b extends a {
        public b(a0 a0Var) {
            super(a0Var);
        }

        public AccessibilityNodeInfo findFocus(int i10) {
            z d10 = this.f7526a.d(i10);
            if (d10 == null) {
                return null;
            }
            return d10.U1();
        }
    }

    @t0(26)
    public static class c extends b {
        public c(a0 a0Var) {
            super(a0Var);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f7526a.a(i10, z.V1(accessibilityNodeInfo), str, bundle);
        }
    }

    public a0() {
        this.f7525a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public a0(Object obj) {
        this.f7525a = obj;
    }

    public void a(int i10, @m0 z zVar, @m0 String str, @o0 Bundle bundle) {
    }

    @o0
    public z b(int i10) {
        return null;
    }

    @o0
    public List<z> c(String str, int i10) {
        return null;
    }

    @o0
    public z d(int i10) {
        return null;
    }

    public Object e() {
        return this.f7525a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }
}
