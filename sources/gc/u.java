package gc;

import android.content.Context;
import android.net.Uri;
import androidx.appcompat.widget.a1;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import d6.f0;
import gc.j;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class u implements j {

    /* renamed from: a  reason: collision with root package name */
    public final OkHttpClient f19114a;

    public u(Context context) {
        this(j0.g(context));
    }

    public u(Context context, long j10) {
        this(j0.g(context), j10);
    }

    public u(OkHttpClient okHttpClient) {
        this.f19114a = okHttpClient;
    }

    public u(File file) {
        this(file, j0.a(file));
    }

    public u(File file, long j10) {
        this(b());
        try {
            this.f19114a.setCache(new Cache(file, j10));
        } catch (IOException unused) {
        }
    }

    public static OkHttpClient b() {
        OkHttpClient okHttpClient = new OkHttpClient();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        okHttpClient.setConnectTimeout(a1.Z, timeUnit);
        okHttpClient.setReadTimeout(f0.f6302r, timeUnit);
        okHttpClient.setWriteTimeout(f0.f6302r, timeUnit);
        return okHttpClient;
    }

    public j.a a(Uri uri, int i10) throws IOException {
        CacheControl cacheControl;
        if (i10 == 0) {
            cacheControl = null;
        } else if (s.a(i10)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!s.b(i10)) {
                builder.noCache();
            }
            if (!s.d(i10)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(uri.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        Response execute = this.f19114a.newCall(url.build()).execute();
        int code = execute.code();
        if (code < 300) {
            boolean z10 = execute.cacheResponse() != null;
            ResponseBody body = execute.body();
            return new j.a(body.byteStream(), z10, body.contentLength());
        }
        execute.body().close();
        throw new j.b(code + " " + execute.message(), i10, code);
    }

    public final OkHttpClient c() {
        return this.f19114a;
    }

    public void shutdown() {
        Cache cache = this.f19114a.getCache();
        if (cache != null) {
            try {
                cache.close();
            } catch (IOException unused) {
            }
        }
    }
}
