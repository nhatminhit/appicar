package qd;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f22262a;

    /* renamed from: b  reason: collision with root package name */
    public String[] f22263b;

    /* renamed from: c  reason: collision with root package name */
    public long f22264c;

    /* renamed from: d  reason: collision with root package name */
    public long f22265d;

    public b(String str) throws JSONException {
        this(new JSONObject(str));
    }

    public b(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("upgrades");
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = jSONArray.getString(i10);
        }
        this.f22262a = jSONObject.getString("sid");
        this.f22263b = strArr;
        this.f22264c = jSONObject.getLong("pingInterval");
        this.f22265d = jSONObject.getLong("pingTimeout");
    }
}
