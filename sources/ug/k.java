package ug;

import java.io.IOException;
import java.net.ProtocolException;
import og.h0;
import og.l0;
import p7.f;

public final class k {

    /* renamed from: d  reason: collision with root package name */
    public static final int f23392d = 307;

    /* renamed from: e  reason: collision with root package name */
    public static final int f23393e = 308;

    /* renamed from: f  reason: collision with root package name */
    public static final int f23394f = 100;

    /* renamed from: a  reason: collision with root package name */
    public final h0 f23395a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23396b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23397c;

    public k(h0 h0Var, int i10, String str) {
        this.f23395a = h0Var;
        this.f23396b = i10;
        this.f23397c = str;
    }

    public static k a(l0 l0Var) {
        return new k(l0Var.a0(), l0Var.i(), l0Var.A());
    }

    public static k b(String str) throws IOException {
        h0 h0Var;
        String str2;
        int i10 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                h0Var = h0.HTTP_1_0;
            } else if (charAt == 1) {
                h0Var = h0.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            h0Var = h0.HTTP_1_0;
            i10 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i11 = i10 + 3;
        if (str.length() >= i11) {
            try {
                int parseInt = Integer.parseInt(str.substring(i10, i11));
                if (str.length() <= i11) {
                    str2 = "";
                } else if (str.charAt(i11) == ' ') {
                    str2 = str.substring(i10 + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                return new k(h0Var, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23395a == h0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(f.f11698i);
        sb2.append(this.f23396b);
        if (this.f23397c != null) {
            sb2.append(f.f11698i);
            sb2.append(this.f23397c);
        }
        return sb2.toString();
    }
}
