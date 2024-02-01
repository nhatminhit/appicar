package f0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import d.m0;
import d.o0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f6990a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f6991b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f6992c = 4;

    /* renamed from: d  reason: collision with root package name */
    public static final int f6993d = 8;

    /* renamed from: e  reason: collision with root package name */
    public static final int f6994e = 32;

    /* renamed from: f  reason: collision with root package name */
    public static final int f6995f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f6996g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f6997h = 4;

    /* renamed from: i  reason: collision with root package name */
    public static final int f6998i = 8;

    /* renamed from: j  reason: collision with root package name */
    public static final int f6999j = 16;

    /* renamed from: k  reason: collision with root package name */
    public static final int f7000k = 32;

    @m0
    public static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @m0
    public static String b(int i10) {
        StringBuilder sb2 = new StringBuilder();
        String str = "[";
        while (true) {
            sb2.append(str);
            while (i10 > 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i10);
                i10 &= ~numberOfTrailingZeros;
                if (sb2.length() > 1) {
                    sb2.append(", ");
                }
                if (numberOfTrailingZeros == 1) {
                    str = "FEEDBACK_SPOKEN";
                } else if (numberOfTrailingZeros == 2) {
                    str = "FEEDBACK_HAPTIC";
                } else if (numberOfTrailingZeros == 4) {
                    str = "FEEDBACK_AUDIBLE";
                } else if (numberOfTrailingZeros == 8) {
                    str = "FEEDBACK_VISUAL";
                } else if (numberOfTrailingZeros == 16) {
                    str = "FEEDBACK_GENERIC";
                }
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    @o0
    public static String c(int i10) {
        if (i10 == 1) {
            return "DEFAULT";
        }
        if (i10 == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (i10 == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i10 == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i10 == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i10 != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }

    public static int d(@m0 AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @o0
    public static String e(@m0 AccessibilityServiceInfo accessibilityServiceInfo, @m0 PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}
