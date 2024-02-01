package d9;

import d.m0;
import f8.h;

public final class g extends h {

    /* renamed from: t  reason: collision with root package name */
    public static final int f6690t = 1000;

    /* renamed from: u  reason: collision with root package name */
    public static final int f6691u = 1001;

    /* renamed from: v  reason: collision with root package name */
    public static final int f6692v = 1002;

    /* renamed from: w  reason: collision with root package name */
    public static final int f6693w = 1004;

    /* renamed from: x  reason: collision with root package name */
    public static final int f6694x = 1005;

    @m0
    public static String a(int i10) {
        switch (i10) {
            case 1000:
                return "GEOFENCE_NOT_AVAILABLE";
            case 1001:
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            case 1002:
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            case 1004:
                return "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION";
            default:
                return h.a(i10);
        }
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return i10;
        }
        if (i10 < 1000 || i10 >= 1006) {
            return 13;
        }
        return i10;
    }
}
