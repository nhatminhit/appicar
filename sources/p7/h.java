package p7;

import b6.j0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w7.q0;
import w7.w;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f11730a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* renamed from: b  reason: collision with root package name */
    public static final String f11731b = "WEBVTT";

    public static Matcher a(w wVar) {
        String n10;
        while (true) {
            String n11 = wVar.n();
            if (n11 == null) {
                return null;
            }
            if (f11730a.matcher(n11).matches()) {
                do {
                    n10 = wVar.n();
                    if (n10 == null) {
                        break;
                    }
                } while (n10.isEmpty());
            } else {
                Matcher matcher = f.f11691b.matcher(n11);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(w wVar) {
        String n10 = wVar.n();
        return n10 != null && n10.startsWith(f11731b);
    }

    public static float c(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) throws NumberFormatException {
        String[] S0 = q0.S0(str, "\\.");
        long j10 = 0;
        for (String parseLong : q0.R0(S0[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(parseLong);
        }
        long j11 = j10 * 1000;
        if (S0.length == 2) {
            j11 += Long.parseLong(S0[1]);
        }
        return j11 * 1000;
    }

    public static void e(w wVar) throws j0 {
        int c10 = wVar.c();
        if (!b(wVar)) {
            wVar.Q(c10);
            throw new j0("Expected WEBVTT. Got " + wVar.n());
        }
    }
}
