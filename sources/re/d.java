package re;

import fh.g;
import java.io.InputStream;
import java.nio.charset.Charset;
import oe.f;
import ve.h;
import xe.l0;
import zd.h1;

@h(name = "ConsoleKt")
public final class d {
    @f
    public static final void a(byte b10) {
        System.out.print(Byte.valueOf(b10));
    }

    @f
    public static final void b(char c10) {
        System.out.print(c10);
    }

    @f
    public static final void c(double d10) {
        System.out.print(d10);
    }

    @f
    public static final void d(float f10) {
        System.out.print(f10);
    }

    @f
    public static final void e(int i10) {
        System.out.print(i10);
    }

    @f
    public static final void f(long j10) {
        System.out.print(j10);
    }

    @f
    public static final void g(Object obj) {
        System.out.print(obj);
    }

    @f
    public static final void h(short s10) {
        System.out.print(Short.valueOf(s10));
    }

    @f
    public static final void i(boolean z10) {
        System.out.print(z10);
    }

    @f
    public static final void j(char[] cArr) {
        l0.p(cArr, "message");
        System.out.print(cArr);
    }

    @f
    public static final void k() {
        System.out.println();
    }

    @f
    public static final void l(byte b10) {
        System.out.println(Byte.valueOf(b10));
    }

    @f
    public static final void m(char c10) {
        System.out.println(c10);
    }

    @f
    public static final void n(double d10) {
        System.out.println(d10);
    }

    @f
    public static final void o(float f10) {
        System.out.println(f10);
    }

    @f
    public static final void p(int i10) {
        System.out.println(i10);
    }

    @f
    public static final void q(long j10) {
        System.out.println(j10);
    }

    @f
    public static final void r(Object obj) {
        System.out.println(obj);
    }

    @f
    public static final void s(short s10) {
        System.out.println(Short.valueOf(s10));
    }

    @f
    public static final void t(boolean z10) {
        System.out.println(z10);
    }

    @f
    public static final void u(char[] cArr) {
        l0.p(cArr, "message");
        System.out.println(cArr);
    }

    @fh.h
    public static final String v() {
        r rVar = r.f22507a;
        InputStream inputStream = System.in;
        l0.o(inputStream, "`in`");
        Charset defaultCharset = Charset.defaultCharset();
        l0.o(defaultCharset, "defaultCharset()");
        return rVar.d(inputStream, defaultCharset);
    }

    @g
    @h1(version = "1.6")
    public static final String w() {
        String x10 = x();
        if (x10 != null) {
            return x10;
        }
        throw new v("EOF has already been reached");
    }

    @h1(version = "1.6")
    @fh.h
    public static final String x() {
        return v();
    }
}
