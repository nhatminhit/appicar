package gc;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import gc.j;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class i0 implements j {

    /* renamed from: b  reason: collision with root package name */
    public static final String f19062b = "X-Android-Response-Source";

    /* renamed from: c  reason: collision with root package name */
    public static volatile Object f19063c = null;

    /* renamed from: d  reason: collision with root package name */
    public static final Object f19064d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final String f19065e = "only-if-cached,max-age=2147483647";

    /* renamed from: f  reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f19066f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f19067a;

    public static class a extends ThreadLocal<StringBuilder> {
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    public static class b {
        public static void a(Object obj) {
            try {
                ((HttpResponseCache) obj).close();
            } catch (IOException unused) {
            }
        }

        public static Object b(Context context) throws IOException {
            File g10 = j0.g(context);
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            return installed == null ? HttpResponseCache.install(g10, j0.a(g10)) : installed;
        }
    }

    public i0(Context context) {
        this.f19067a = context.getApplicationContext();
    }

    public static void b(Context context) {
        if (f19063c == null) {
            try {
                synchronized (f19064d) {
                    if (f19063c == null) {
                        f19063c = b.b(context);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public j.a a(Uri uri, int i10) throws IOException {
        String str;
        b(this.f19067a);
        HttpURLConnection c10 = c(uri);
        c10.setUseCaches(true);
        if (i10 != 0) {
            if (s.a(i10)) {
                str = f19065e;
            } else {
                StringBuilder sb2 = f19066f.get();
                sb2.setLength(0);
                if (!s.b(i10)) {
                    sb2.append("no-cache");
                }
                if (!s.d(i10)) {
                    if (sb2.length() > 0) {
                        sb2.append(',');
                    }
                    sb2.append("no-store");
                }
                str = sb2.toString();
            }
            c10.setRequestProperty("Cache-Control", str);
        }
        int responseCode = c10.getResponseCode();
        if (responseCode < 300) {
            long headerFieldInt = (long) c10.getHeaderFieldInt("Content-Length", -1);
            return new j.a(c10.getInputStream(), j0.x(c10.getHeaderField(f19062b)), headerFieldInt);
        }
        c10.disconnect();
        throw new j.b(responseCode + " " + c10.getResponseMessage(), i10, responseCode);
    }

    public HttpURLConnection c(Uri uri) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }

    public void shutdown() {
        if (f19063c != null) {
            b.a(f19063c);
        }
    }
}
