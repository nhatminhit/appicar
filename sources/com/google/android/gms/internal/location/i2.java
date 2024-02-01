package com.google.android.gms.internal.location;

import d.z;
import d8.f;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class i2 {

    /* renamed from: a  reason: collision with root package name */
    public static final SimpleDateFormat f5876a;

    /* renamed from: b  reason: collision with root package name */
    public static final SimpleDateFormat f5877b;
    @z("sharedStringBuilder")

    /* renamed from: c  reason: collision with root package name */
    public static final StringBuilder f5878c = new StringBuilder(33);

    static {
        Locale locale = Locale.ROOT;
        f5876a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        f5877b = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
    }

    public static String a(long j10) {
        String sb2;
        StringBuilder sb3 = f5878c;
        synchronized (sb3) {
            sb3.setLength(0);
            b(j10, sb3);
            sb2 = sb3.toString();
        }
        return sb2;
    }

    public static void b(long j10, StringBuilder sb2) {
        String str;
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 == 0) {
            str = "0s";
        } else {
            sb2.ensureCapacity(sb2.length() + 27);
            boolean z10 = false;
            if (i10 < 0) {
                sb2.append("-");
                if (j10 != Long.MIN_VALUE) {
                    j10 = -j10;
                } else {
                    j10 = Long.MAX_VALUE;
                    z10 = true;
                }
            }
            if (j10 >= 86400000) {
                sb2.append(j10 / 86400000);
                sb2.append(f.f6598d);
                j10 %= 86400000;
            }
            if (true == z10) {
                j10 = 25975808;
            }
            if (j10 >= 3600000) {
                sb2.append(j10 / 3600000);
                sb2.append("h");
                j10 %= 3600000;
            }
            if (j10 >= 60000) {
                sb2.append(j10 / 60000);
                sb2.append("m");
                j10 %= 60000;
            }
            if (j10 >= 1000) {
                sb2.append(j10 / 1000);
                sb2.append("s");
                j10 %= 1000;
            }
            if (j10 > 0) {
                sb2.append(j10);
                str = "ms";
            } else {
                return;
            }
        }
        sb2.append(str);
    }
}
