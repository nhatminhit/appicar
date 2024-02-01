package f8;

import d.m0;
import va.k;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final int f7438a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f7439b = 0;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final int f7440c = 2;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public static final int f7441d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final int f7442e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final int f7443f = 5;

    /* renamed from: g  reason: collision with root package name */
    public static final int f7444g = 6;

    /* renamed from: h  reason: collision with root package name */
    public static final int f7445h = 7;

    /* renamed from: i  reason: collision with root package name */
    public static final int f7446i = 8;

    /* renamed from: j  reason: collision with root package name */
    public static final int f7447j = 10;

    /* renamed from: k  reason: collision with root package name */
    public static final int f7448k = 13;

    /* renamed from: l  reason: collision with root package name */
    public static final int f7449l = 14;

    /* renamed from: m  reason: collision with root package name */
    public static final int f7450m = 15;

    /* renamed from: n  reason: collision with root package name */
    public static final int f7451n = 16;

    /* renamed from: o  reason: collision with root package name */
    public static final int f7452o = 17;

    /* renamed from: p  reason: collision with root package name */
    public static final int f7453p = 19;

    /* renamed from: q  reason: collision with root package name */
    public static final int f7454q = 20;

    /* renamed from: r  reason: collision with root package name */
    public static final int f7455r = 21;

    /* renamed from: s  reason: collision with root package name */
    public static final int f7456s = 22;

    @m0
    public static String a(int i10) {
        switch (i10) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return k.a.f23566o;
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
            default:
                return "unknown status code: " + i10;
        }
    }
}
