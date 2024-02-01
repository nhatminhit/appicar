package com.google.android.material.internal;

import android.os.Build;
import d.x0;
import java.util.Locale;

@x0({x0.a.LIBRARY_GROUP})
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f17192a = "lge";

    /* renamed from: b  reason: collision with root package name */
    public static final String f17193b = "samsung";

    /* renamed from: c  reason: collision with root package name */
    public static final String f17194c = "meizu";

    public static boolean a() {
        return b() || d();
    }

    public static boolean b() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f17192a);
    }

    public static boolean c() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f17194c);
    }

    public static boolean d() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f17193b);
    }
}
