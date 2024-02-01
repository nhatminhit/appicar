package td;

import com.google.android.material.badge.BadgeDrawable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class a {
    public static String a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace(BadgeDrawable.f16655n0, "%20").replace("%21", "!").replace("%27", "'").replace("%28", "(").replace("%29", ")").replace("%7E", "~");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }
}
