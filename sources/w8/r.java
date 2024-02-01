package w8;

import android.text.TextUtils;
import d.m0;
import d.o0;
import e8.a;
import j8.s;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@a
@d0
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f14931a = Pattern.compile("\\\\.");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f14932b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    @a
    public static boolean a(@o0 Object obj, @o0 Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = (JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject2.has(next)) {
                    return false;
                }
                try {
                    s.l(next);
                    if (!a(jSONObject.get(next), jSONObject2.get(next))) {
                        return false;
                    }
                } catch (JSONException unused) {
                }
            }
            return true;
        } else if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
            return obj.equals(obj2);
        } else {
            JSONArray jSONArray = (JSONArray) obj;
            JSONArray jSONArray2 = (JSONArray) obj2;
            if (jSONArray.length() != jSONArray2.length()) {
                return false;
            }
            int i10 = 0;
            while (i10 < jSONArray.length()) {
                try {
                    if (!a(jSONArray.get(i10), jSONArray2.get(i10))) {
                        return false;
                    }
                    i10++;
                } catch (JSONException unused2) {
                }
            }
            return true;
        }
    }

    @a
    @o0
    public static String b(@o0 String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f14932b.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char charAt = matcher.group().charAt(0);
            if (charAt == 12) {
                str2 = "\\\\f";
            } else if (charAt == 13) {
                str2 = "\\\\r";
            } else if (charAt == '\"') {
                str2 = "\\\\\\\"";
            } else if (charAt == '/') {
                str2 = "\\\\/";
            } else if (charAt != '\\') {
                switch (charAt) {
                    case 8:
                        str2 = "\\\\b";
                        break;
                    case 9:
                        str2 = "\\\\t";
                        break;
                    case 10:
                        str2 = "\\\\n";
                        break;
                }
            } else {
                str2 = "\\\\\\\\";
            }
            matcher.appendReplacement(stringBuffer, str2);
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @a
    @m0
    public static String c(@m0 String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String a10 = h0.a(str);
        Matcher matcher = f14931a.matcher(a10);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char charAt = matcher.group().charAt(1);
            if (charAt == '\"') {
                str2 = "\"";
            } else if (charAt == '/') {
                str2 = "/";
            } else if (charAt == '\\') {
                str2 = "\\\\";
            } else if (charAt == 'b') {
                str2 = "\b";
            } else if (charAt == 'f') {
                str2 = "\f";
            } else if (charAt == 'n') {
                str2 = "\n";
            } else if (charAt == 'r') {
                str2 = "\r";
            } else if (charAt == 't') {
                str2 = "\t";
            } else {
                throw new IllegalStateException("Found an escaped character that should never be.");
            }
            matcher.appendReplacement(stringBuffer, str2);
        }
        if (stringBuffer == null) {
            return a10;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
