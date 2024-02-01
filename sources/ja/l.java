package ja;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class l {
    public static String a(int i10) {
        if (i10 == 0) {
            return "EEEE, MMMM d, y";
        }
        if (i10 == 1) {
            return "MMMM d, y";
        }
        if (i10 == 2) {
            return "MMM d, y";
        }
        if (i10 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i10);
    }

    public static String b(int i10) {
        if (i10 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i10 == 1) {
            return "MMMM d, yyyy";
        }
        if (i10 == 2) {
            return "MMM d, yyyy";
        }
        if (i10 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i10);
    }

    public static String c(int i10) {
        if (i10 == 0 || i10 == 1) {
            return "h:mm:ss a z";
        }
        if (i10 == 2) {
            return "h:mm:ss a";
        }
        if (i10 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i10);
    }

    public static DateFormat d(int i10) {
        return new SimpleDateFormat(a(i10), Locale.US);
    }

    public static DateFormat e(int i10, int i11) {
        return new SimpleDateFormat(b(i10) + " " + c(i11), Locale.US);
    }
}
