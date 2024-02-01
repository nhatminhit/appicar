package w8;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f14901a = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f14901a.matcher(str);
        int i10 = 0;
        StringBuilder sb2 = null;
        while (matcher.find()) {
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            int start = matcher.start();
            int i11 = start;
            while (i11 >= 0 && str.charAt(i11) == '\\') {
                i11--;
            }
            if ((start - i11) % 2 != 0) {
                int parseInt = Integer.parseInt(matcher.group().substring(2), 16);
                sb2.append(str, i10, matcher.start());
                if (parseInt == 92) {
                    sb2.append("\\\\");
                } else {
                    sb2.append(Character.toChars(parseInt));
                }
                i10 = matcher.end();
            }
        }
        if (sb2 == null) {
            return str;
        }
        if (i10 < matcher.regionEnd()) {
            sb2.append(str, i10, matcher.regionEnd());
        }
        return sb2.toString();
    }
}
