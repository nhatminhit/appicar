package od;

import gc.t;
import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static Pattern f21450a = Pattern.compile("^(.*@)?([^:]+)(:\\d+)?$");

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final URI f21451a;

        /* renamed from: b  reason: collision with root package name */
        public final String f21452b;

        public a(URI uri, String str) {
            this.f21451a = uri;
            this.f21452b = str;
        }
    }

    public static String a(String str) {
        if (str != null) {
            Matcher matcher = f21450a.matcher(str);
            if (matcher.matches()) {
                return matcher.group(2);
            }
            throw new RuntimeException("unable to parse the host from the authority");
        }
        throw new RuntimeException("unable to parse the host from the authority");
    }

    public static a b(URI uri) {
        String str;
        String str2;
        String str3;
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.matches("^https?|wss?$")) {
            scheme = t.f19111e;
        }
        int port = uri.getPort();
        if (port == -1) {
            if (t.f19110d.equals(scheme) || "ws".equals(scheme)) {
                port = 80;
            } else if (t.f19111e.equals(scheme) || "wss".equals(scheme)) {
                port = 443;
            }
        }
        String rawPath = uri.getRawPath();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        String rawUserInfo = uri.getRawUserInfo();
        String rawQuery = uri.getRawQuery();
        String rawFragment = uri.getRawFragment();
        String host = uri.getHost();
        if (host == null) {
            host = a(uri.getRawAuthority());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(scheme);
        sb2.append("://");
        String str4 = "";
        if (rawUserInfo != null) {
            str = rawUserInfo + "@";
        } else {
            str = str4;
        }
        sb2.append(str);
        sb2.append(host);
        if (port != -1) {
            str2 = ":" + port;
        } else {
            str2 = str4;
        }
        sb2.append(str2);
        sb2.append(rawPath);
        if (rawQuery != null) {
            str3 = "?" + rawQuery;
        } else {
            str3 = str4;
        }
        sb2.append(str3);
        if (rawFragment != null) {
            str4 = "#" + rawFragment;
        }
        sb2.append(str4);
        return new a(URI.create(sb2.toString()), scheme + "://" + host + ":" + port);
    }
}
