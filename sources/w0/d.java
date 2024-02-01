package w0;

import android.net.Uri;
import d.m0;
import d.o0;
import e1.n;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import w7.l;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final String f14357b = "mailto:";

    /* renamed from: c  reason: collision with root package name */
    public static final String f14358c = "mailto";

    /* renamed from: d  reason: collision with root package name */
    public static final String f14359d = "to";

    /* renamed from: e  reason: collision with root package name */
    public static final String f14360e = "body";

    /* renamed from: f  reason: collision with root package name */
    public static final String f14361f = "cc";

    /* renamed from: g  reason: collision with root package name */
    public static final String f14362g = "bcc";

    /* renamed from: h  reason: collision with root package name */
    public static final String f14363h = "subject";

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, String> f14364a = new HashMap<>();

    public static boolean g(@o0 Uri uri) {
        return uri != null && f14358c.equals(uri.getScheme());
    }

    public static boolean h(@o0 String str) {
        return str != null && str.startsWith(f14357b);
    }

    @m0
    public static d i(@m0 Uri uri) throws e {
        return j(uri.toString());
    }

    @m0
    public static d j(@m0 String str) throws e {
        String str2;
        String str3;
        n.g(str);
        if (h(str)) {
            int indexOf = str.indexOf(35);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            int indexOf2 = str.indexOf(63);
            if (indexOf2 == -1) {
                str3 = Uri.decode(str.substring(7));
                str2 = null;
            } else {
                str3 = Uri.decode(str.substring(7, indexOf2));
                str2 = str.substring(indexOf2 + 1);
            }
            d dVar = new d();
            if (str2 != null) {
                for (String split : str2.split("&")) {
                    String[] split2 = split.split(l.f14755k, 2);
                    if (split2.length != 0) {
                        dVar.f14364a.put(Uri.decode(split2[0]).toLowerCase(Locale.ROOT), split2.length > 1 ? Uri.decode(split2[1]) : null);
                    }
                }
            }
            String f10 = dVar.f();
            if (f10 != null) {
                str3 = str3 + ", " + f10;
            }
            dVar.f14364a.put(f14359d, str3);
            return dVar;
        }
        throw new e("Not a mailto scheme");
    }

    @o0
    public String a() {
        return this.f14364a.get(f14362g);
    }

    @o0
    public String b() {
        return this.f14364a.get("body");
    }

    @o0
    public String c() {
        return this.f14364a.get(f14361f);
    }

    @o0
    public Map<String, String> d() {
        return this.f14364a;
    }

    @o0
    public String e() {
        return this.f14364a.get(f14363h);
    }

    @o0
    public String f() {
        return this.f14364a.get(f14359d);
    }

    @m0
    public String toString() {
        StringBuilder sb2 = new StringBuilder(f14357b);
        sb2.append('?');
        for (Map.Entry next : this.f14364a.entrySet()) {
            sb2.append(Uri.encode((String) next.getKey()));
            sb2.append('=');
            sb2.append(Uri.encode((String) next.getValue()));
            sb2.append('&');
        }
        return sb2.toString();
    }
}
