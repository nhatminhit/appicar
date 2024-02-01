package ud;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f23348a = Logger.getLogger(a.class.getName());

    public static boolean a(Object obj) {
        Logger logger;
        Level level;
        String str;
        if (obj == null) {
            return false;
        }
        if (obj instanceof byte[]) {
            return true;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            int i10 = 0;
            while (i10 < length) {
                try {
                    if (a(jSONArray.isNull(i10) ? null : jSONArray.get(i10))) {
                        return true;
                    }
                    i10++;
                } catch (JSONException e10) {
                    e = e10;
                    logger = f23348a;
                    level = Level.WARNING;
                    str = "An error occured while retrieving data from JSONArray";
                    logger.log(level, str, e);
                    return false;
                }
            }
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    if (a(jSONObject.get(keys.next()))) {
                        return true;
                    }
                } catch (JSONException e11) {
                    e = e11;
                    logger = f23348a;
                    level = Level.WARNING;
                    str = "An error occured while retrieving data from JSONObject";
                    logger.log(level, str, e);
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean b(Object obj) {
        return a(obj);
    }
}
