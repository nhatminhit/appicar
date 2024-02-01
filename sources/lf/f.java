package lf;

import b6.c;
import fh.g;
import fh.h;
import java.nio.charset.Charset;
import ve.e;
import xe.l0;

public final class f {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final f f20791a = new f();
    @g
    @e

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f20792b;
    @g
    @e

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f20793c;
    @g
    @e

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f20794d;
    @g
    @e

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f20795e;
    @g
    @e

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f20796f;
    @g
    @e

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f20797g;
    @h

    /* renamed from: h  reason: collision with root package name */
    public static volatile Charset f20798h;
    @h

    /* renamed from: i  reason: collision with root package name */
    public static volatile Charset f20799i;
    @h

    /* renamed from: j  reason: collision with root package name */
    public static volatile Charset f20800j;

    static {
        Charset forName = Charset.forName("UTF-8");
        l0.o(forName, "forName(\"UTF-8\")");
        f20792b = forName;
        Charset forName2 = Charset.forName(c.f4245m);
        l0.o(forName2, "forName(\"UTF-16\")");
        f20793c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        l0.o(forName3, "forName(\"UTF-16BE\")");
        f20794d = forName3;
        Charset forName4 = Charset.forName(c.f4249n);
        l0.o(forName4, "forName(\"UTF-16LE\")");
        f20795e = forName4;
        Charset forName5 = Charset.forName(c.f4237k);
        l0.o(forName5, "forName(\"US-ASCII\")");
        f20796f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        l0.o(forName6, "forName(\"ISO-8859-1\")");
        f20797g = forName6;
    }

    @g
    @ve.h(name = "UTF32")
    public final Charset a() {
        Charset charset = f20798h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32");
        l0.o(forName, "forName(\"UTF-32\")");
        f20798h = forName;
        return forName;
    }

    @g
    @ve.h(name = "UTF32_BE")
    public final Charset b() {
        Charset charset = f20800j;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        l0.o(forName, "forName(\"UTF-32BE\")");
        f20800j = forName;
        return forName;
    }

    @g
    @ve.h(name = "UTF32_LE")
    public final Charset c() {
        Charset charset = f20799i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        l0.o(forName, "forName(\"UTF-32LE\")");
        f20799i = forName;
        return forName;
    }
}
