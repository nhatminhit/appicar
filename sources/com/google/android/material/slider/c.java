package com.google.android.material.slider;

import d.m0;
import java.util.Locale;

public final class c implements d {

    /* renamed from: d  reason: collision with root package name */
    public static final long f17347d = 1000000000000L;

    /* renamed from: e  reason: collision with root package name */
    public static final int f17348e = 1000000000;

    /* renamed from: f  reason: collision with root package name */
    public static final int f17349f = 1000000;

    /* renamed from: g  reason: collision with root package name */
    public static final int f17350g = 1000;

    @m0
    public String a(float f10) {
        if (f10 >= 1.0E12f) {
            return String.format(Locale.US, "%.1fT", new Object[]{Float.valueOf(f10 / 1.0E12f)});
        } else if (f10 >= 1.0E9f) {
            return String.format(Locale.US, "%.1fB", new Object[]{Float.valueOf(f10 / 1.0E9f)});
        } else if (f10 >= 1000000.0f) {
            return String.format(Locale.US, "%.1fM", new Object[]{Float.valueOf(f10 / 1000000.0f)});
        } else if (f10 >= 1000.0f) {
            return String.format(Locale.US, "%.1fK", new Object[]{Float.valueOf(f10 / 1000.0f)});
        } else {
            return String.format(Locale.US, "%.0f", new Object[]{Float.valueOf(f10)});
        }
    }
}
