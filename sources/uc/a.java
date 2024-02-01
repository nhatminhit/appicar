package uc;

import a6.a0;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f23345a = "DateTimeUtils";

    /* renamed from: b  reason: collision with root package name */
    public static SimpleDateFormat f23346b = new SimpleDateFormat(a0.Y, Locale.getDefault());

    /* renamed from: c  reason: collision with root package name */
    public static SimpleDateFormat f23347c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());

    public static long a() {
        return System.currentTimeMillis() / 1000;
    }

    public static long b() {
        return System.currentTimeMillis();
    }
}
