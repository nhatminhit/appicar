package nf;

import fh.g;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import xe.l0;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f21244a = false;
    @g

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<DecimalFormat>[] f21245b;

    static {
        Class<e> cls = e.class;
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal<>();
        }
        f21245b = threadLocalArr;
    }

    public static final DecimalFormat a(int i10) {
        DecimalFormat decimalFormat = new DecimalFormat("0");
        if (i10 > 0) {
            decimalFormat.setMinimumFractionDigits(i10);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    @g
    public static final String b(double d10, int i10) {
        DecimalFormat decimalFormat;
        ThreadLocal<DecimalFormat>[] threadLocalArr = f21245b;
        if (i10 < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i10];
            DecimalFormat decimalFormat2 = threadLocal.get();
            if (decimalFormat2 == null) {
                decimalFormat2 = a(i10);
                threadLocal.set(decimalFormat2);
            } else {
                l0.o(decimalFormat2, "get() ?: default().also(this::set)");
            }
            decimalFormat = decimalFormat2;
        } else {
            decimalFormat = a(i10);
        }
        String format = decimalFormat.format(d10);
        l0.o(format, "format.format(value)");
        return format;
    }

    @g
    public static final String c(double d10, int i10) {
        DecimalFormat a10 = a(0);
        a10.setMaximumFractionDigits(i10);
        String format = a10.format(d10);
        l0.o(format, "createFormatForDecimals(… }\n        .format(value)");
        return format;
    }

    public static final boolean d() {
        return f21244a;
    }
}
