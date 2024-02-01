package g1;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import d.m0;
import d.t0;
import java.util.List;

public final class c {

    @Deprecated
    public interface a {
        @Deprecated
        void onAccessibilityStateChanged(boolean z10);
    }

    @Deprecated
    public static abstract class b implements a {
    }

    /* renamed from: g1.c$c  reason: collision with other inner class name */
    public static class C0132c implements AccessibilityManager.AccessibilityStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public a f7554a;

        public C0132c(@m0 a aVar) {
            this.f7554a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0132c)) {
                return false;
            }
            return this.f7554a.equals(((C0132c) obj).f7554a);
        }

        public int hashCode() {
            return this.f7554a.hashCode();
        }

        public void onAccessibilityStateChanged(boolean z10) {
            this.f7554a.onAccessibilityStateChanged(z10);
        }
    }

    public interface d {
        void onTouchExplorationStateChanged(boolean z10);
    }

    @t0(19)
    public static final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final d f7555a;

        public e(@m0 d dVar) {
            this.f7555a = dVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return this.f7555a.equals(((e) obj).f7555a);
        }

        public int hashCode() {
            return this.f7555a.hashCode();
        }

        public void onTouchExplorationStateChanged(boolean z10) {
            this.f7555a.onTouchExplorationStateChanged(z10);
        }
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new C0132c(aVar));
    }

    public static boolean b(AccessibilityManager accessibilityManager, d dVar) {
        if (dVar == null) {
            return false;
        }
        return accessibilityManager.addTouchExplorationStateChangeListener(new e(dVar));
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> c(AccessibilityManager accessibilityManager, int i10) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i10);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> d(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    @Deprecated
    public static boolean e(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean f(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new C0132c(aVar));
    }

    public static boolean g(AccessibilityManager accessibilityManager, d dVar) {
        if (dVar == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new e(dVar));
    }
}
