package e1;

import d.m0;
import d.o0;
import java.util.Objects;

public class i {
    public static boolean a(@o0 Object obj, @o0 Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int b(@o0 Object... objArr) {
        return Objects.hash(objArr);
    }

    public static int c(@o0 Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @m0
    public static <T> T d(@o0 T t10) {
        t10.getClass();
        return t10;
    }

    @m0
    public static <T> T e(@o0 T t10, @m0 String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    @o0
    public static String f(@o0 Object obj, @o0 String str) {
        return obj != null ? obj.toString() : str;
    }
}
