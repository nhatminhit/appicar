package ug;

import java.net.Proxy;
import og.c0;
import og.j0;
import p7.f;

public final class i {
    public static String a(j0 j0Var, Proxy.Type type) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j0Var.g());
        sb2.append(f.f11698i);
        boolean b10 = b(j0Var, type);
        c0 k10 = j0Var.k();
        if (b10) {
            sb2.append(k10);
        } else {
            sb2.append(c(k10));
        }
        sb2.append(" HTTP/1.1");
        return sb2.toString();
    }

    public static boolean b(j0 j0Var, Proxy.Type type) {
        return !j0Var.f() && type == Proxy.Type.HTTP;
    }

    public static String c(c0 c0Var) {
        String h10 = c0Var.h();
        String j10 = c0Var.j();
        if (j10 == null) {
            return h10;
        }
        return h10 + '?' + j10;
    }
}
