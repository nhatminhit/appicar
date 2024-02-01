package d4;

import android.net.Uri;
import android.text.TextUtils;
import d.m0;
import d.o0;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import t4.k;
import v3.f;

public class g implements f {

    /* renamed from: j  reason: collision with root package name */
    public static final String f6024j = "@#&=*+-_.,:!?()/~'%;$";

    /* renamed from: c  reason: collision with root package name */
    public final h f6025c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final URL f6026d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public final String f6027e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public String f6028f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public URL f6029g;
    @o0

    /* renamed from: h  reason: collision with root package name */
    public volatile byte[] f6030h;

    /* renamed from: i  reason: collision with root package name */
    public int f6031i;

    public g(String str) {
        this(str, h.f6033b);
    }

    public g(String str, h hVar) {
        this.f6026d = null;
        this.f6027e = k.b(str);
        this.f6025c = (h) k.d(hVar);
    }

    public g(URL url) {
        this(url, h.f6033b);
    }

    public g(URL url, h hVar) {
        this.f6026d = (URL) k.d(url);
        this.f6027e = null;
        this.f6025c = (h) k.d(hVar);
    }

    public void a(@m0 MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f6027e;
        return str != null ? str : ((URL) k.d(this.f6026d)).toString();
    }

    public final byte[] d() {
        if (this.f6030h == null) {
            this.f6030h = c().getBytes(f.f14159b);
        }
        return this.f6030h;
    }

    public Map<String, String> e() {
        return this.f6025c.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return c().equals(gVar.c()) && this.f6025c.equals(gVar.f6025c);
    }

    public final String f() {
        if (TextUtils.isEmpty(this.f6028f)) {
            String str = this.f6027e;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) k.d(this.f6026d)).toString();
            }
            this.f6028f = Uri.encode(str, f6024j);
        }
        return this.f6028f;
    }

    public final URL g() throws MalformedURLException {
        if (this.f6029g == null) {
            this.f6029g = new URL(f());
        }
        return this.f6029g;
    }

    public String h() {
        return f();
    }

    public int hashCode() {
        if (this.f6031i == 0) {
            int hashCode = c().hashCode();
            this.f6031i = hashCode;
            this.f6031i = (hashCode * 31) + this.f6025c.hashCode();
        }
        return this.f6031i;
    }

    public URL i() throws MalformedURLException {
        return g();
    }

    public String toString() {
        return c();
    }
}
