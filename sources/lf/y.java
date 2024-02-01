package lf;

import fh.g;
import oe.f;
import we.l;
import xe.l0;
import xe.w;
import zd.b1;
import zd.h1;
import zd.k;
import zd.k0;
import zd.m;
import zd.u2;

public class y extends x {
    @f
    @k(level = m.O, message = "Use append(value: Any?) instead", replaceWith = @b1(expression = "append(value = obj)", imports = {}))
    public static final StringBuilder h0(StringBuilder sb2, Object obj) {
        l0.p(sb2, "<this>");
        sb2.append(obj);
        l0.o(sb2, "this.append(obj)");
        return sb2;
    }

    @f
    @k(level = m.P, message = "Use appendRange instead.", replaceWith = @b1(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    public static final StringBuilder i0(StringBuilder sb2, char[] cArr, int i10, int i11) {
        l0.p(sb2, "<this>");
        l0.p(cArr, "str");
        throw new k0((String) null, 1, (w) null);
    }

    @g
    public static final StringBuilder j0(@g StringBuilder sb2, @g Object... objArr) {
        l0.p(sb2, "<this>");
        l0.p(objArr, "value");
        for (Object append : objArr) {
            sb2.append(append);
        }
        return sb2;
    }

    @g
    public static final StringBuilder k0(@g StringBuilder sb2, @g String... strArr) {
        l0.p(sb2, "<this>");
        l0.p(strArr, "value");
        for (String append : strArr) {
            sb2.append(append);
        }
        return sb2;
    }

    @h1(version = "1.4")
    @f
    public static final StringBuilder l0(StringBuilder sb2) {
        l0.p(sb2, "<this>");
        sb2.append(10);
        l0.o(sb2, "append('\\n')");
        return sb2;
    }

    @h1(version = "1.4")
    @f
    public static final StringBuilder m0(StringBuilder sb2, char c10) {
        l0.p(sb2, "<this>");
        sb2.append(c10);
        l0.o(sb2, "append(value)");
        sb2.append(10);
        l0.o(sb2, "append('\\n')");
        return sb2;
    }

    @h1(version = "1.4")
    @f
    public static final StringBuilder n0(StringBuilder sb2, CharSequence charSequence) {
        l0.p(sb2, "<this>");
        sb2.append(charSequence);
        l0.o(sb2, "append(value)");
        sb2.append(10);
        l0.o(sb2, "append('\\n')");
        return sb2;
    }

    @h1(version = "1.4")
    @f
    public static final StringBuilder o0(StringBuilder sb2, Object obj) {
        l0.p(sb2, "<this>");
        sb2.append(obj);
        l0.o(sb2, "append(value)");
        sb2.append(10);
        l0.o(sb2, "append('\\n')");
        return sb2;
    }

    @h1(version = "1.4")
    @f
    public static final StringBuilder p0(StringBuilder sb2, String str) {
        l0.p(sb2, "<this>");
        sb2.append(str);
        l0.o(sb2, "append(value)");
        sb2.append(10);
        l0.o(sb2, "append('\\n')");
        return sb2;
    }

    @h1(version = "1.4")
    @f
    public static final StringBuilder q0(StringBuilder sb2, boolean z10) {
        l0.p(sb2, "<this>");
        sb2.append(z10);
        l0.o(sb2, "append(value)");
        sb2.append(10);
        l0.o(sb2, "append('\\n')");
        return sb2;
    }

    @h1(version = "1.4")
    @f
    public static final StringBuilder r0(StringBuilder sb2, char[] cArr) {
        l0.p(sb2, "<this>");
        l0.p(cArr, "value");
        sb2.append(cArr);
        l0.o(sb2, "append(value)");
        sb2.append(10);
        l0.o(sb2, "append('\\n')");
        return sb2;
    }

    @h1(version = "1.1")
    @f
    public static final String s0(int i10, l<? super StringBuilder, u2> lVar) {
        l0.p(lVar, "builderAction");
        StringBuilder sb2 = new StringBuilder(i10);
        lVar.A(sb2);
        String sb3 = sb2.toString();
        l0.o(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    @f
    public static final String t0(l<? super StringBuilder, u2> lVar) {
        l0.p(lVar, "builderAction");
        StringBuilder sb2 = new StringBuilder();
        lVar.A(sb2);
        String sb3 = sb2.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
