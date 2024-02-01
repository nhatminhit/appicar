package g1;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import d.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class b {
    public static final int A = -1;
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final int f7527a = 128;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final int f7528b = 256;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final int f7529c = 512;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public static final int f7530d = 1024;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public static final int f7531e = 2048;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public static final int f7532f = 4096;
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public static final int f7533g = 8192;

    /* renamed from: h  reason: collision with root package name */
    public static final int f7534h = 16384;

    /* renamed from: i  reason: collision with root package name */
    public static final int f7535i = 32768;

    /* renamed from: j  reason: collision with root package name */
    public static final int f7536j = 65536;

    /* renamed from: k  reason: collision with root package name */
    public static final int f7537k = 131072;

    /* renamed from: l  reason: collision with root package name */
    public static final int f7538l = 262144;

    /* renamed from: m  reason: collision with root package name */
    public static final int f7539m = 524288;

    /* renamed from: n  reason: collision with root package name */
    public static final int f7540n = 1048576;

    /* renamed from: o  reason: collision with root package name */
    public static final int f7541o = 2097152;

    /* renamed from: p  reason: collision with root package name */
    public static final int f7542p = 4194304;

    /* renamed from: q  reason: collision with root package name */
    public static final int f7543q = 8388608;

    /* renamed from: r  reason: collision with root package name */
    public static final int f7544r = 16777216;

    /* renamed from: s  reason: collision with root package name */
    public static final int f7545s = 0;

    /* renamed from: t  reason: collision with root package name */
    public static final int f7546t = 1;

    /* renamed from: u  reason: collision with root package name */
    public static final int f7547u = 2;

    /* renamed from: v  reason: collision with root package name */
    public static final int f7548v = 4;

    /* renamed from: w  reason: collision with root package name */
    public static final int f7549w = 8;

    /* renamed from: x  reason: collision with root package name */
    public static final int f7550x = 16;

    /* renamed from: y  reason: collision with root package name */
    public static final int f7551y = 32;

    /* renamed from: z  reason: collision with root package name */
    public static final int f7552z = 64;

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Deprecated
    public static void a(AccessibilityEvent accessibilityEvent, b0 b0Var) {
        accessibilityEvent.appendRecord((AccessibilityRecord) b0Var.g());
    }

    @Deprecated
    public static b0 b(AccessibilityEvent accessibilityEvent) {
        return new b0(accessibilityEvent);
    }

    public static int c(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getAction();
    }

    public static int d(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static int e(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getMovementGranularity();
    }

    @Deprecated
    public static b0 f(AccessibilityEvent accessibilityEvent, int i10) {
        return new b0(accessibilityEvent.getRecord(i10));
    }

    @Deprecated
    public static int g(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static void h(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setAction(i10);
    }

    public static void i(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }

    public static void j(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setMovementGranularity(i10);
    }
}
