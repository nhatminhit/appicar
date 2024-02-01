package gi;

import ad.d;
import android.content.Context;
import android.provider.Settings;
import hh.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import qc.c;
import sj.i;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final String f19443c = "LogBotUtils";

    /* renamed from: d  reason: collision with root package name */
    public static a f19444d;

    /* renamed from: a  reason: collision with root package name */
    public di.a f19445a;

    /* renamed from: b  reason: collision with root package name */
    public Context f19446b;

    /* renamed from: gi.a$a  reason: collision with other inner class name */
    public class C0316a implements Callable<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19447a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f19448b;

        public C0316a(String str, String str2) {
            this.f19447a = str;
            this.f19448b = str2;
        }

        public Object call() throws Exception {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("phone", a.this.f19445a.N());
                jSONObject.put("userId", a.this.f19445a.r());
                jSONObject.put("appId", i.f23063d + this.f19447a);
                jSONObject.put("message", this.f19448b);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://www.larksuite.com/flow/api/trigger-webhook/399ff980f60cbe5e577923e35b8c67c2").openConnection();
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestProperty(c.f19573f, "application/json; charset=UTF-8");
                httpURLConnection.setRequestProperty("Accept", "application/json");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), StandardCharsets.UTF_8);
                outputStreamWriter.write(jSONObject.toString());
                outputStreamWriter.flush();
                outputStreamWriter.close();
                if (httpURLConnection.getResponseCode() == 200) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb2.append(readLine);
                        } else {
                            bufferedReader.close();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("add logging success: ");
                            sb3.append(sb2.toString());
                            return null;
                        }
                    }
                } else {
                    d.c(a.f19443c, "cannot add logging");
                    return null;
                }
            } catch (IOException e10) {
                d.c(a.f19443c, e10.getMessage());
                return null;
            }
        }
    }

    public class b implements c.a<Object> {
        public b() {
        }

        public void a(Object obj) {
        }
    }

    public a(Context context) {
        this.f19446b = context;
        this.f19445a = new di.a(context);
    }

    public static a c(Context context) {
        if (f19444d == null) {
            f19444d = new a(context);
        }
        return f19444d;
    }

    public void b(String str) {
        new qc.c().c(new C0316a(Settings.Secure.getString(this.f19446b.getContentResolver(), "android_id"), str), new b());
    }
}
