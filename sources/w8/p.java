package w8;

import com.google.android.gms.internal.common.i0;
import com.google.android.gms.internal.common.z;
import d.m0;
import e8.a;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@a
public class p {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f14928a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f14929b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f14930c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    @a
    @m0
    public static Map<String, String> a(@m0 URI uri, @m0 String str) {
        Map<String, String> emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = new HashMap<>();
            i0 c10 = i0.c(z.b('='));
            for (String f10 : i0.c(z.b('&')).b().d(rawQuery)) {
                List f11 = c10.f(f10);
                if (f11.isEmpty() || f11.size() > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                emptyMap.put(b((String) f11.get(0), str), f11.size() == 2 ? b((String) f11.get(1), str) : null);
            }
        }
        return emptyMap;
    }

    public static String b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
