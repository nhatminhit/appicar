package d8;

import android.content.Context;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;
import d.m0;
import d.o0;
import e8.a;
import j8.s;
import j8.w;

@RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@a
@CheckReturnValue
@w
public class n {
    @o0

    /* renamed from: b  reason: collision with root package name */
    public static a0 f6622b;

    /* renamed from: a  reason: collision with root package name */
    public volatile z f6623a;

    public static a0 c() {
        a0 a0Var;
        synchronized (a0.class) {
            if (f6622b == null) {
                f6622b = new a0();
            }
            a0Var = f6622b;
        }
        return a0Var;
    }

    @a
    @w
    @m0
    public o a(@m0 Context context, @m0 String str) {
        boolean k10 = j.k(context);
        c();
        if (o0.f()) {
            String concat = String.valueOf(str).concat(true != k10 ? "-0" : "-1");
            if (this.f6623a == null || !this.f6623a.f6669a.equals(concat)) {
                c();
                v0 c10 = o0.c(str, k10, false, false);
                if (c10.f6658a) {
                    this.f6623a = new z(concat, o.d(str, c10.f6661d));
                } else {
                    s.l(c10.f6659b);
                    return o.a(str, c10.f6659b, c10.f6660c);
                }
            }
            return this.f6623a.f6670b;
        }
        throw new b0();
    }

    @a
    @w
    @m0
    public o b(@m0 Context context, @m0 String str) {
        try {
            o a10 = a(context, str);
            a10.b();
            return a10;
        } catch (SecurityException unused) {
            o a11 = a(context, str);
            if (a11.c()) {
            }
            return a11;
        }
    }
}
