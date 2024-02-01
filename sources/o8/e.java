package o8;

import d.m0;
import f8.h;

public final class e extends h {

    /* renamed from: t  reason: collision with root package name */
    public static final int f11347t = 0;

    /* renamed from: u  reason: collision with root package name */
    public static final int f11348u = 46000;

    /* renamed from: v  reason: collision with root package name */
    public static final int f11349v = 46001;

    /* renamed from: w  reason: collision with root package name */
    public static final int f11350w = 46002;

    /* renamed from: x  reason: collision with root package name */
    public static final int f11351x = 46003;

    @m0
    public static String a(int i10) {
        switch (i10) {
            case f11348u /*46000*/:
                return "UNKNOWN_MODULE";
            case f11349v /*46001*/:
                return "NOT_ALLOWED_MODULE";
            case f11350w /*46002*/:
                return "MODULE_NOT_FOUND";
            case f11351x /*46003*/:
                return "INSUFFICIENT_STORAGE";
            default:
                return h.a(i10);
        }
    }
}
