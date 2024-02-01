package ad;

import h0.u0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: f  reason: collision with root package name */
    public static SimpleDateFormat f16054f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());

    /* renamed from: a  reason: collision with root package name */
    public String f16055a;

    /* renamed from: b  reason: collision with root package name */
    public String f16056b;

    /* renamed from: c  reason: collision with root package name */
    public String f16057c;

    /* renamed from: d  reason: collision with root package name */
    public String f16058d;

    /* renamed from: e  reason: collision with root package name */
    public String f16059e;

    public b() {
    }

    public b(String str, String str2, String str3, String str4) {
        this.f16055a = f16054f.format(new Date());
        this.f16056b = str;
        this.f16057c = str2;
        this.f16058d = str3;
        this.f16059e = str4;
    }

    public String a() {
        return this.f16058d;
    }

    public String b() {
        return this.f16059e;
    }

    public String c() {
        return this.f16056b;
    }

    public String d() {
        return this.f16057c;
    }

    public String e() {
        return this.f16055a;
    }

    public b f(String str) {
        this.f16058d = str;
        return this;
    }

    public b g(String str) {
        this.f16059e = str;
        return this;
    }

    public b h(String str) {
        this.f16056b = str;
        return this;
    }

    public b i(String str) {
        this.f16057c = str;
        return this;
    }

    public b j(String str) {
        this.f16055a = str;
        return this;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", this.f16055a);
            jSONObject.put("severity", this.f16056b);
            jSONObject.put("tag", this.f16057c);
            jSONObject.put("data", this.f16058d);
            jSONObject.put(u0.f8528p0, this.f16059e);
        } catch (JSONException e10) {
            d.c("Log", e10.toString());
        }
        return jSONObject.toString();
    }
}
