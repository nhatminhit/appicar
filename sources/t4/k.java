package t4;

import android.text.TextUtils;
import d.m0;
import d.o0;
import java.util.Collection;

public final class k {
    public static void a(boolean z10, @m0 String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    @m0
    public static String b(@o0 String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @m0
    public static <T extends Collection<Y>, Y> T c(@m0 T t10) {
        if (!t10.isEmpty()) {
            return t10;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    @m0
    public static <T> T d(@o0 T t10) {
        return e(t10, "Argument must not be null");
    }

    @m0
    public static <T> T e(@o0 T t10, @m0 String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }
}
