package t7;

import android.net.Uri;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import d.o0;
import g7.h;
import gc.t;
import hh.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import t2.z;
import t7.e0;
import w7.a;
import w7.p;
import w7.q0;
import w7.y;

public class v extends e implements e0 {
    public static final long A = 2048;
    public static final Pattern B = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference<byte[]> C = new AtomicReference<>();

    /* renamed from: u  reason: collision with root package name */
    public static final int f13223u = 8000;

    /* renamed from: v  reason: collision with root package name */
    public static final int f13224v = 8000;

    /* renamed from: w  reason: collision with root package name */
    public static final String f13225w = "DefaultHttpDataSource";

    /* renamed from: x  reason: collision with root package name */
    public static final int f13226x = 20;

    /* renamed from: y  reason: collision with root package name */
    public static final int f13227y = 307;

    /* renamed from: z  reason: collision with root package name */
    public static final int f13228z = 308;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f13229f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13230g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13231h;

    /* renamed from: i  reason: collision with root package name */
    public final String f13232i;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public final y<String> f13233j;
    @o0

    /* renamed from: k  reason: collision with root package name */
    public final e0.f f13234k;

    /* renamed from: l  reason: collision with root package name */
    public final e0.f f13235l;
    @o0

    /* renamed from: m  reason: collision with root package name */
    public o f13236m;
    @o0

    /* renamed from: n  reason: collision with root package name */
    public HttpURLConnection f13237n;
    @o0

    /* renamed from: o  reason: collision with root package name */
    public InputStream f13238o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f13239p;

    /* renamed from: q  reason: collision with root package name */
    public long f13240q;

    /* renamed from: r  reason: collision with root package name */
    public long f13241r;

    /* renamed from: s  reason: collision with root package name */
    public long f13242s;

    /* renamed from: t  reason: collision with root package name */
    public long f13243t;

    public v(String str) {
        this(str, (y<String>) null);
    }

    public v(String str, @o0 y<String> yVar) {
        this(str, yVar, 8000, 8000);
    }

    public v(String str, @o0 y<String> yVar, int i10, int i11) {
        this(str, yVar, i10, i11, false, (e0.f) null);
    }

    public v(String str, @o0 y<String> yVar, int i10, int i11, boolean z10, @o0 e0.f fVar) {
        super(true);
        this.f13232i = a.e(str);
        this.f13233j = yVar;
        this.f13235l = new e0.f();
        this.f13230g = i10;
        this.f13231h = i11;
        this.f13229f = z10;
        this.f13234k = fVar;
    }

    @Deprecated
    public v(String str, @o0 y<String> yVar, @o0 r0 r0Var) {
        this(str, yVar, r0Var, 8000, 8000);
    }

    @Deprecated
    public v(String str, @o0 y<String> yVar, @o0 r0 r0Var, int i10, int i11) {
        this(str, yVar, r0Var, i10, i11, false, (e0.f) null);
    }

    @Deprecated
    public v(String str, @o0 y<String> yVar, @o0 r0 r0Var, int i10, int i11, boolean z10, @o0 e0.f fVar) {
        this(str, yVar, i10, i11, z10, fVar);
        if (r0Var != null) {
            d(r0Var);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long q(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L_0x002c
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0015 }
            goto L_0x002e
        L_0x0015:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.append(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            w7.p.d(r3, r1)
        L_0x002c:
            r4 = -1
        L_0x002e:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x00a4
            java.util.regex.Pattern r1 = B
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto L_0x00a4
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch:{ NumberFormatException -> 0x008d }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x008d }
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch:{ NumberFormatException -> 0x008d }
            long r8 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x008d }
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0064
            r4 = r6
            goto L_0x00a4
        L_0x0064:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00a4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x008d }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r8 = "Inconsistent headers ["
            r1.append(r8)     // Catch:{ NumberFormatException -> 0x008d }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r0 = "] ["
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x008d }
            r1.append(r10)     // Catch:{ NumberFormatException -> 0x008d }
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r0 = r1.toString()     // Catch:{ NumberFormatException -> 0x008d }
            w7.p.l(r3, r0)     // Catch:{ NumberFormatException -> 0x008d }
            long r0 = java.lang.Math.max(r4, r6)     // Catch:{ NumberFormatException -> 0x008d }
            r4 = r0
            goto L_0x00a4
        L_0x008d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.append(r1)
            r0.append(r10)
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            w7.p.d(r3, r10)
        L_0x00a4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.v.q(java.net.HttpURLConnection):long");
    }

    public static URL r(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (t.f19111e.equals(protocol) || t.f19110d.equals(protocol)) {
                return url2;
            }
            throw new ProtocolException("Unsupported protocol redirect: " + protocol);
        }
        throw new ProtocolException("Null location redirect");
    }

    public static void u(HttpURLConnection httpURLConnection, long j10) {
        int i10 = q0.f14786a;
        if (i10 == 19 || i10 == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    public long a(o oVar) throws e0.c {
        long j10;
        this.f13236m = oVar;
        long j11 = 0;
        this.f13243t = 0;
        this.f13242s = 0;
        j(oVar);
        try {
            HttpURLConnection t10 = t(oVar);
            this.f13237n = t10;
            try {
                int responseCode = t10.getResponseCode();
                String responseMessage = this.f13237n.getResponseMessage();
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = this.f13237n.getHeaderFields();
                    o();
                    e0.e eVar = new e0.e(responseCode, responseMessage, headerFields, oVar);
                    if (responseCode == 416) {
                        eVar.initCause(new m(0));
                    }
                    throw eVar;
                }
                String contentType = this.f13237n.getContentType();
                y<String> yVar = this.f13233j;
                if (yVar == null || yVar.a(contentType)) {
                    if (responseCode == 200) {
                        long j12 = oVar.f13135f;
                        if (j12 != 0) {
                            j11 = j12;
                        }
                    }
                    this.f13240q = j11;
                    if (!oVar.c(1)) {
                        j10 = oVar.f13136g;
                        long j13 = -1;
                        if (j10 == -1) {
                            long q10 = q(this.f13237n);
                            if (q10 != -1) {
                                j13 = q10 - this.f13240q;
                            }
                            this.f13241r = j13;
                            this.f13238o = this.f13237n.getInputStream();
                            this.f13239p = true;
                            k(oVar);
                            return this.f13241r;
                        }
                    } else {
                        j10 = oVar.f13136g;
                    }
                    this.f13241r = j10;
                    try {
                        this.f13238o = this.f13237n.getInputStream();
                        this.f13239p = true;
                        k(oVar);
                        return this.f13241r;
                    } catch (IOException e10) {
                        o();
                        throw new e0.c(e10, oVar, 1);
                    }
                } else {
                    o();
                    throw new e0.d(contentType, oVar);
                }
            } catch (IOException e11) {
                o();
                throw new e0.c("Unable to connect to " + oVar.f13130a.toString(), e11, oVar, 1);
            }
        } catch (IOException e12) {
            throw new e0.c("Unable to connect to " + oVar.f13130a.toString(), e12, oVar, 1);
        }
    }

    public Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.f13237n;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    public void c(String str, String str2) {
        a.g(str);
        a.g(str2);
        this.f13235l.e(str, str2);
    }

    public void close() throws e0.c {
        try {
            if (this.f13238o != null) {
                u(this.f13237n, m());
                this.f13238o.close();
            }
            this.f13238o = null;
            o();
            if (this.f13239p) {
                this.f13239p = false;
                i();
            }
        } catch (IOException e10) {
            throw new e0.c(e10, this.f13236m, 3);
        } catch (Throwable th2) {
            this.f13238o = null;
            o();
            if (this.f13239p) {
                this.f13239p = false;
                i();
            }
            throw th2;
        }
    }

    public void e() {
        this.f13235l.a();
    }

    public void f(String str) {
        a.g(str);
        this.f13235l.d(str);
    }

    @o0
    public Uri g() {
        HttpURLConnection httpURLConnection = this.f13237n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final long l() {
        return this.f13243t;
    }

    public final long m() {
        long j10 = this.f13241r;
        return j10 == -1 ? j10 : j10 - this.f13243t;
    }

    public final long n() {
        return this.f13242s;
    }

    public final void o() {
        HttpURLConnection httpURLConnection = this.f13237n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                p.e(f13225w, "Unexpected error while disconnecting", e10);
            }
            this.f13237n = null;
        }
    }

    @o0
    public final HttpURLConnection p() {
        return this.f13237n;
    }

    public int read(byte[] bArr, int i10, int i11) throws e0.c {
        try {
            w();
            return v(bArr, i10, i11);
        } catch (IOException e10) {
            throw new e0.c(e10, this.f13236m, 2);
        }
    }

    public final HttpURLConnection s(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, boolean z12) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f13230g);
        httpURLConnection.setReadTimeout(this.f13231h);
        e0.f fVar = this.f13234k;
        if (fVar != null) {
            for (Map.Entry next : fVar.c().entrySet()) {
                httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
        }
        for (Map.Entry next2 : this.f13235l.c().entrySet()) {
            httpURLConnection.setRequestProperty((String) next2.getKey(), (String) next2.getValue());
        }
        if (!(j10 == 0 && j11 == -1)) {
            String str = "bytes=" + j10 + "-";
            if (j11 != -1) {
                str = str + ((j10 + j11) - 1);
            }
            httpURLConnection.setRequestProperty(z.f12901f, str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f13232i);
        if (!z10) {
            httpURLConnection.setRequestProperty("Accept-Encoding", h.G);
        }
        if (z11) {
            httpURLConnection.setRequestProperty(IcyHeaders.U, "1");
        }
        httpURLConnection.setInstanceFollowRedirects(z12);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(o.b(i10));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final HttpURLConnection t(o oVar) throws IOException {
        HttpURLConnection s10;
        o oVar2 = oVar;
        URL url = new URL(oVar2.f13130a.toString());
        int i10 = oVar2.f13131b;
        byte[] bArr = oVar2.f13132c;
        long j10 = oVar2.f13135f;
        long j11 = oVar2.f13136g;
        boolean c10 = oVar2.c(1);
        boolean c11 = oVar2.c(2);
        if (!this.f13229f) {
            return s(url, i10, bArr, j10, j11, c10, c11, true);
        }
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            if (i11 <= 20) {
                int i13 = i12;
                long j12 = j11;
                long j13 = j10;
                s10 = s(url, i10, bArr, j10, j11, c10, c11, false);
                int responseCode = s10.getResponseCode();
                String headerField = s10.getHeaderField(c.e.f19601q);
                if ((i10 == 1 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    s10.disconnect();
                    url = r(url, headerField);
                } else if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return s10;
                } else {
                    s10.disconnect();
                    url = r(url, headerField);
                    bArr = null;
                    i10 = 1;
                }
                i11 = i13;
                j11 = j12;
                j10 = j13;
            } else {
                throw new NoRouteToHostException("Too many redirects: " + i12);
            }
        }
        return s10;
    }

    public final int v(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f13241r;
        if (j10 != -1) {
            long j11 = j10 - this.f13243t;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min((long) i11, j11);
        }
        int read = this.f13238o.read(bArr, i10, i11);
        if (read != -1) {
            this.f13243t += (long) read;
            h(read);
            return read;
        } else if (this.f13241r == -1) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void w() throws IOException {
        if (this.f13242s != this.f13240q) {
            byte[] andSet = C.getAndSet((Object) null);
            if (andSet == null) {
                andSet = new byte[4096];
            }
            while (true) {
                long j10 = this.f13242s;
                long j11 = this.f13240q;
                if (j10 != j11) {
                    int read = this.f13238o.read(andSet, 0, (int) Math.min(j11 - j10, (long) andSet.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f13242s += (long) read;
                        h(read);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    C.set(andSet);
                    return;
                }
            }
        }
    }
}
