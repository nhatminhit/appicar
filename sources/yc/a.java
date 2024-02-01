package yc;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f24764a = "JWTUtils";

    public static void a(String str) {
        try {
            String[] split = str.split("\\.");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Header: ");
            sb2.append(b(split[0]));
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Body: ");
            sb3.append(b(split[1]));
        } catch (UnsupportedEncodingException e10) {
            e10.getMessage();
        }
    }

    public static String b(String str) throws UnsupportedEncodingException {
        return new String(Base64.decode(str, 8), "UTF-8");
    }

    public static long c(String str) {
        try {
            return new JSONObject(b(str.split("\\.")[1])).getLong("exp");
        } catch (UnsupportedEncodingException | ArrayIndexOutOfBoundsException | JSONException unused) {
            return 0;
        }
    }
}
