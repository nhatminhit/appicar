package sj;

import android.content.Context;
import ha.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f23045a = "JsonUtil";

    public <T> String a(T t10) {
        return new e().z(t10);
    }

    public <T> T b(String str, Class<T> cls) {
        try {
            return new e().m(new JSONObject(str).toString(), cls);
        } catch (JSONException e10) {
            e10.getMessage();
            return null;
        }
    }

    public <T> T c(Context context, int i10, Class<T> cls) {
        InputStream openRawResource = context.getResources().openRawResource(i10);
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[1024];
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, "UTF-8"));
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read != -1) {
                    stringWriter.write(cArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            openRawResource.close();
        } catch (UnsupportedEncodingException e11) {
            e11.printStackTrace();
            openRawResource.close();
        } catch (IOException e12) {
            e12.printStackTrace();
            openRawResource.close();
        } catch (Throwable th2) {
            try {
                openRawResource.close();
            } catch (IOException e13) {
                e13.printStackTrace();
            }
            throw th2;
        }
        return b(stringWriter.toString(), cls);
    }
}
