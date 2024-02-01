package j8;

import android.util.Log;
import com.google.errorprone.annotations.FormatMethod;
import com.google.errorprone.annotations.FormatString;
import d.m0;
import d.o0;
import e8.a;

@a
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f9773a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final String f9774b;

    @a
    public j(@m0 String str) {
        this(str, (String) null);
    }

    @a
    public j(@m0 String str, @o0 String str2) {
        s.m(str, "log tag cannot be null");
        s.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f9773a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f9774b = null;
        } else {
            this.f9774b = str2;
        }
    }

    @a
    public boolean a(int i10) {
        return Log.isLoggable(this.f9773a, i10);
    }

    @a
    public boolean b() {
        return false;
    }

    @a
    public void c(@m0 String str, @m0 String str2) {
        if (a(3)) {
            r(str2);
        }
    }

    @a
    public void d(@m0 String str, @m0 String str2, @m0 Throwable th2) {
        if (a(3)) {
            r(str2);
        }
    }

    @a
    public void e(@m0 String str, @m0 String str2) {
        if (a(6)) {
            r(str2);
        }
    }

    @a
    public void f(@m0 String str, @m0 String str2, @m0 Throwable th2) {
        if (a(6)) {
            r(str2);
        }
    }

    @FormatMethod
    @a
    public void g(@m0 String str, @FormatString @m0 String str2, @m0 Object... objArr) {
        if (a(6)) {
            s(str2, objArr);
        }
    }

    @a
    public void h(@m0 String str, @m0 String str2) {
        if (a(4)) {
            r(str2);
        }
    }

    @a
    public void i(@m0 String str, @m0 String str2, @m0 Throwable th2) {
        if (a(4)) {
            r(str2);
        }
    }

    @a
    public void j(@m0 String str, @m0 String str2) {
    }

    @a
    public void k(@m0 String str, @m0 String str2, @m0 Throwable th2) {
    }

    @a
    public void l(@m0 String str, @m0 String str2) {
        if (a(2)) {
            r(str2);
        }
    }

    @a
    public void m(@m0 String str, @m0 String str2, @m0 Throwable th2) {
        if (a(2)) {
            r(str2);
        }
    }

    @a
    public void n(@m0 String str, @m0 String str2) {
        if (a(5)) {
            r(str2);
        }
    }

    @a
    public void o(@m0 String str, @m0 String str2, @m0 Throwable th2) {
        if (a(5)) {
            r(str2);
        }
    }

    @FormatMethod
    @a
    public void p(@m0 String str, @FormatString @m0 String str2, @m0 Object... objArr) {
        if (a(5)) {
            s(str2, objArr);
        }
    }

    @a
    public void q(@m0 String str, @m0 String str2, @m0 Throwable th2) {
        if (a(7)) {
            r(str2);
            Log.wtf(str, r(str2), th2);
        }
    }

    public final String r(String str) {
        String str2 = this.f9774b;
        return str2 == null ? str : str2.concat(str);
    }

    @FormatMethod
    public final String s(String str, Object... objArr) {
        String format = String.format(str, objArr);
        String str2 = this.f9774b;
        return str2 == null ? format : str2.concat(format);
    }
}
