package w3;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.h;
import d.g1;
import d.m0;
import d4.g;
import hh.c;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import t4.c;
import v3.e;
import w3.d;

public class j implements d<InputStream> {
    public static final String U = "HttpUrlFetcher";
    public static final int V = 5;
    @g1
    public static final b W = new a();
    public static final int X = -1;
    public final g O;
    public final int P;
    public final b Q;
    public HttpURLConnection R;
    public InputStream S;
    public volatile boolean T;

    public static class a implements b {
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public j(g gVar, int i10) {
        this(gVar, i10, W);
    }

    @g1
    public j(g gVar, int i10, b bVar) {
        this.O = gVar;
        this.P = i10;
        this.Q = bVar;
    }

    public static boolean e(int i10) {
        return i10 / 100 == 2;
    }

    public static boolean g(int i10) {
        return i10 / 100 == 3;
    }

    @m0
    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void b() {
        InputStream inputStream = this.S;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.R;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.R = null;
    }

    public final InputStream c(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream;
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            inputStream = c.f(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable(U, 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Got non empty content encoding: ");
                sb2.append(httpURLConnection.getContentEncoding());
            }
            inputStream = httpURLConnection.getInputStream();
        }
        this.S = inputStream;
        return this.S;
    }

    public void cancel() {
        this.T = true;
    }

    @m0
    public v3.a d() {
        return v3.a.REMOTE;
    }

    public void f(@m0 h hVar, @m0 d.a<? super InputStream> aVar) {
        StringBuilder sb2;
        long b10 = t4.g.b();
        try {
            aVar.e(h(this.O.i(), 0, (URL) null, this.O.e()));
            if (Log.isLoggable(U, 2)) {
                sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(t4.g.a(b10));
            }
        } catch (IOException e10) {
            boolean isLoggable = Log.isLoggable(U, 3);
            aVar.c(e10);
            if (Log.isLoggable(U, 2)) {
                sb2 = new StringBuilder();
            }
        } catch (Throwable th2) {
            if (Log.isLoggable(U, 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Finished http url fetcher fetch in ");
                sb3.append(t4.g.a(b10));
            }
            throw th2;
        }
    }

    public final InputStream h(URL url, int i10, URL url2, Map<String, String> map) throws IOException {
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new e("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.R = this.Q.a(url);
            for (Map.Entry next : map.entrySet()) {
                this.R.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            this.R.setConnectTimeout(this.P);
            this.R.setReadTimeout(this.P);
            this.R.setUseCaches(false);
            this.R.setDoInput(true);
            this.R.setInstanceFollowRedirects(false);
            this.R.connect();
            this.S = this.R.getInputStream();
            if (this.T) {
                return null;
            }
            int responseCode = this.R.getResponseCode();
            if (e(responseCode)) {
                return c(this.R);
            }
            if (g(responseCode)) {
                String headerField = this.R.getHeaderField(c.e.f19601q);
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    b();
                    return h(url3, i10 + 1, url, map);
                }
                throw new e("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new e(responseCode);
            } else {
                throw new e(this.R.getResponseMessage(), responseCode);
            }
        } else {
            throw new e("Too many (> 5) redirects!");
        }
    }
}
