package jc;

import ad.d;
import android.annotation.SuppressLint;
import ch.c;
import java.io.IOException;
import og.d0;
import og.e0;
import og.j0;
import og.l0;
import og.m0;

public class e implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f19910a = "LoggingInterceptor";

    /* renamed from: b  reason: collision with root package name */
    public static final String f19911b = " %n";

    /* renamed from: c  reason: collision with root package name */
    public static final String f19912c = " %s";

    /* renamed from: d  reason: collision with root package name */
    public static final String f19913d = " in %.1fms";

    /* renamed from: e  reason: collision with root package name */
    public static final String f19914e = "%s";

    /* renamed from: f  reason: collision with root package name */
    public static final String f19915f = " %nResponse: %d";

    /* renamed from: g  reason: collision with root package name */
    public static final String f19916g = "body: %s";

    /* renamed from: h  reason: collision with root package name */
    public static final String f19917h = " %n------------------------------------------- %n";

    /* renamed from: i  reason: collision with root package name */
    public static final String f19918i = " %s in %.1fms %n%s";

    /* renamed from: j  reason: collision with root package name */
    public static final String f19919j = " %nResponse: %d %n%s %n------------------------------------------- %n";

    /* renamed from: k  reason: collision with root package name */
    public static final String f19920k = " %s in %.1fms %n%sbody: %s %n";

    /* renamed from: l  reason: collision with root package name */
    public static final String f19921l = " %nResponse: %d %n%sbody: %s %n %n------------------------------------------- %n";

    public static String b(j0 j0Var) {
        try {
            j0 b10 = j0Var.h().b();
            c cVar = new c();
            b10.a().j(cVar);
            return cVar.o1();
        } catch (IOException unused) {
            return "did not work";
        }
    }

    @SuppressLint({"DefaultLocale"})
    public l0 a(d0.a aVar) throws IOException {
        e0 e0Var;
        j0 c10 = aVar.c();
        long nanoTime = System.nanoTime();
        l0 h10 = aVar.h(c10);
        long nanoTime2 = System.nanoTime();
        String str = null;
        if (h10.c() != null) {
            e0 l10 = h10.c().l();
            str = h10.c().A();
            e0Var = l10;
        } else {
            e0Var = null;
        }
        double d10 = ((double) (nanoTime2 - nanoTime)) / 1000000.0d;
        String g10 = c10.g();
        g10.hashCode();
        char c11 = 65535;
        switch (g10.hashCode()) {
            case 70454:
                if (g10.equals("GET")) {
                    c11 = 0;
                    break;
                }
                break;
            case 79599:
                if (g10.equals("PUT")) {
                    c11 = 1;
                    break;
                }
                break;
            case 2461856:
                if (g10.equals("POST")) {
                    c11 = 2;
                    break;
                }
                break;
            case 2012838315:
                if (g10.equals("DELETE")) {
                    c11 = 3;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                String.format("GET  %s in %.1fms %n%s %nResponse: %d %n%sbody: %s %n %n------------------------------------------- %n", new Object[]{c10.k(), Double.valueOf(d10), c10.e(), Integer.valueOf(h10.i()), h10.q(), c(str)});
                break;
            case 1:
                String.format("PUT  %s in %.1fms %n%sbody: %s %n %nResponse: %d %n%sbody: %s %n %n------------------------------------------- %n", new Object[]{c10.k(), Double.valueOf(d10), c10.e(), c10.a().toString(), Integer.valueOf(h10.i()), h10.q(), c(str)});
                break;
            case 2:
                String.format("POST  %s in %.1fms %n%sbody: %s %n %nResponse: %d %n%sbody: %s %n %n------------------------------------------- %n", new Object[]{c10.k(), Double.valueOf(d10), c10.e(), b(c10), Integer.valueOf(h10.i()), h10.q(), c(str)});
                break;
            case 3:
                String.format("DELETE  %s in %.1fms %n%s %nResponse: %d %n%s %n------------------------------------------- %n", new Object[]{c10.k(), Double.valueOf(d10), c10.e(), Integer.valueOf(h10.i()), h10.q()});
                break;
        }
        d.a(f19910a, c10.k().S().getFile() + "");
        if (h10.c() == null) {
            return h10;
        }
        return h10.P().b(m0.q(e0Var, str)).l(str).c();
    }

    public String c(String str) {
        return str;
    }
}
