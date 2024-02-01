package h6;

import aj.a;
import androidx.lifecycle.n0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w7.p;
import w7.q0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f8856a = "ClearKeyUtil";

    public static byte[] a(byte[] bArr) {
        return q0.f14786a >= 27 ? bArr : q0.m0(c(q0.F(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (q0.f14786a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(q0.F(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray(n0.f2814h);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(d(jSONObject2.getString(a.e.f16177i)));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return q0.m0(sb2.toString());
        } catch (JSONException e10) {
            p.e(f8856a, "Failed to adjust response data: " + q0.F(bArr), e10);
            return bArr;
        }
    }

    public static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
