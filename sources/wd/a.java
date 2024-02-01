package wd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f24028a = "_placeholder";

    /* renamed from: b  reason: collision with root package name */
    public static final String f24029b = "num";

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f24030c = Logger.getLogger(a.class.getName());

    /* renamed from: wd.a$a  reason: collision with other inner class name */
    public static class C0477a {

        /* renamed from: a  reason: collision with root package name */
        public d f24031a;

        /* renamed from: b  reason: collision with root package name */
        public byte[][] f24032b;
    }

    public static Object a(Object obj, List<byte[]> list) {
        Logger logger;
        Level level;
        if (obj == null) {
            return null;
        }
        String str = "An error occured while putting data to JSONObject";
        if (obj instanceof byte[]) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(f24028a, true);
                jSONObject.put(f24029b, list.size());
                list.add((byte[]) obj);
                return jSONObject;
            } catch (JSONException e10) {
                e = e10;
                logger = f24030c;
                level = Level.WARNING;
            }
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = (JSONArray) obj;
            int length = jSONArray2.length();
            int i10 = 0;
            while (i10 < length) {
                try {
                    jSONArray.put(i10, a(jSONArray2.get(i10), list));
                    i10++;
                } catch (JSONException e11) {
                    e = e11;
                    logger = f24030c;
                    level = Level.WARNING;
                    str = "An error occured while putting packet data to JSONObject";
                    logger.log(level, str, e);
                    return null;
                }
            }
            return jSONArray;
        } else if (!(obj instanceof JSONObject)) {
            return obj;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = (JSONObject) obj;
            Iterator<String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.put(next, a(jSONObject3.get(next), list));
            }
            return jSONObject2;
        }
    }

    public static Object b(Object obj, byte[][] bArr) {
        Logger logger;
        Level level;
        String str;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            int i10 = 0;
            while (i10 < length) {
                try {
                    jSONArray.put(i10, b(jSONArray.get(i10), bArr));
                    i10++;
                } catch (JSONException e10) {
                    e = e10;
                    logger = f24030c;
                    level = Level.WARNING;
                    str = "An error occured while putting packet data to JSONObject";
                    logger.log(level, str, e);
                    return null;
                }
            }
            return jSONArray;
        }
        boolean z10 = obj instanceof JSONObject;
        JSONObject jSONObject = obj;
        if (z10) {
            JSONObject jSONObject2 = (JSONObject) obj;
            if (jSONObject2.optBoolean(f24028a)) {
                int optInt = jSONObject2.optInt(f24029b, -1);
                if (optInt < 0 || optInt >= bArr.length) {
                    return null;
                }
                return bArr[optInt];
            }
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    jSONObject2.put(next, b(jSONObject2.get(next), bArr));
                } catch (JSONException e11) {
                    e = e11;
                    logger = f24030c;
                    level = Level.WARNING;
                    str = "An error occured while putting data to JSONObject";
                }
            }
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    public static C0477a c(d dVar) {
        ArrayList arrayList = new ArrayList();
        dVar.f24041d = a(dVar.f24041d, arrayList);
        dVar.f24042e = arrayList.size();
        C0477a aVar = new C0477a();
        aVar.f24031a = dVar;
        aVar.f24032b = (byte[][]) arrayList.toArray(new byte[arrayList.size()][]);
        return aVar;
    }

    public static d d(d dVar, byte[][] bArr) {
        dVar.f24041d = b(dVar.f24041d, bArr);
        dVar.f24042e = -1;
        return dVar;
    }
}
