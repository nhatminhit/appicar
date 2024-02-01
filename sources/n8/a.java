package n8;

import android.util.Log;
import d.m0;
import j8.j;
import java.util.Locale;

@e8.a
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f11004a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11005b;

    /* renamed from: c  reason: collision with root package name */
    public final j f11006c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11007d;

    @e8.a
    public a(@m0 String str, @m0 String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str3 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
            sb2.append("] ");
            str2 = sb2.toString();
        }
        this.f11005b = str2;
        this.f11004a = str;
        this.f11006c = new j(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f11004a, i10)) {
            i10++;
        }
        this.f11007d = i10;
    }

    @e8.a
    public void a(@m0 String str, @m0 Object... objArr) {
        if (g(3)) {
            d(str, objArr);
        }
    }

    @e8.a
    public void b(@m0 String str, @m0 Throwable th2, @m0 Object... objArr) {
        d(str, objArr);
    }

    @e8.a
    public void c(@m0 String str, @m0 Object... objArr) {
        d(str, objArr);
    }

    @e8.a
    @m0
    public String d(@m0 String str, @m0 Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f11005b.concat(str);
    }

    @e8.a
    @m0
    public String e() {
        return this.f11004a;
    }

    @e8.a
    public void f(@m0 String str, @m0 Object... objArr) {
        d(str, objArr);
    }

    @e8.a
    public boolean g(int i10) {
        return this.f11007d <= i10;
    }

    @e8.a
    public void h(@m0 String str, @m0 Throwable th2, @m0 Object... objArr) {
        if (g(2)) {
            d(str, objArr);
        }
    }

    @e8.a
    public void i(@m0 String str, @m0 Object... objArr) {
        if (g(2)) {
            d(str, objArr);
        }
    }

    @e8.a
    public void j(@m0 String str, @m0 Object... objArr) {
        d(str, objArr);
    }

    @e8.a
    public void k(@m0 String str, @m0 Throwable th2, @m0 Object... objArr) {
        Log.wtf(this.f11004a, d(str, objArr), th2);
    }

    @e8.a
    public void l(@m0 Throwable th2) {
        Log.wtf(this.f11004a, th2);
    }
}
