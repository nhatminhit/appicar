package w8;

import android.text.TextUtils;
import d.o0;
import e8.a;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

@a
@d0
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f14891a = Pattern.compile("\\$\\{(.*?)\\}");

    @a
    @o0
    public static String a(@o0 String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @a
    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean b(@o0 String str) {
        return str == null || str.trim().isEmpty();
    }
}
