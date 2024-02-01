package fd;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Integer> f18892a = a();

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f18893b = Pattern.compile("^\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$");

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public float f18894a;

        /* renamed from: b  reason: collision with root package name */
        public int f18895b;

        public a(float f10, int i10) {
            this.f18894a = f10;
            this.f18895b = i10;
        }
    }

    public static Map<String, Integer> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("px", 0);
        hashMap.put("dip", 1);
        hashMap.put("dp", 1);
        hashMap.put("sp", 2);
        hashMap.put("pt", 3);
        hashMap.put("in", 4);
        hashMap.put("mm", 5);
        return Collections.unmodifiableMap(hashMap);
    }

    public static float b(String str, DisplayMetrics displayMetrics) {
        a d10 = d(str);
        return TypedValue.applyDimension(d10.f18895b, d10.f18894a, displayMetrics);
    }

    public static int c(String str, DisplayMetrics displayMetrics) {
        a d10 = d(str);
        float f10 = d10.f18894a;
        int applyDimension = (int) (TypedValue.applyDimension(d10.f18895b, f10, displayMetrics) + 0.5f);
        if (applyDimension != 0) {
            return applyDimension;
        }
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 == 0) {
            return 0;
        }
        return i10 > 0 ? 1 : -1;
    }

    public static a d(String str) {
        Matcher matcher = f18893b.matcher(str);
        if (matcher.matches()) {
            float floatValue = Float.valueOf(matcher.group(1)).floatValue();
            Integer num = f18892a.get(matcher.group(3).toLowerCase());
            if (num != null) {
                return new a(floatValue, num.intValue());
            }
            throw new NumberFormatException();
        }
        throw new NumberFormatException();
    }
}
