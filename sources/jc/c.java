package jc;

import ad.d;
import android.content.Context;
import d.m0;
import f6.e;
import java.io.IOException;
import mc.a;
import og.d0;
import og.j0;
import og.l0;

public class c implements d0 {

    /* renamed from: k  reason: collision with root package name */
    public static final String f19899k = "BaseInterceptor";

    /* renamed from: a  reason: collision with root package name */
    public final Context f19900a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19901b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19902c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19903d;

    /* renamed from: e  reason: collision with root package name */
    public final String f19904e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f19905f;

    /* renamed from: g  reason: collision with root package name */
    public final String f19906g;

    /* renamed from: h  reason: collision with root package name */
    public final String f19907h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f19908i;

    /* renamed from: j  reason: collision with root package name */
    public final a f19909j;

    public c(Context context, String str) {
        this.f19900a = context;
        this.f19901b = str;
        this.f19902c = "";
        this.f19903d = "";
        this.f19904e = "";
        this.f19905f = true;
        this.f19907h = "";
        this.f19906g = "";
        this.f19908i = true;
        this.f19909j = new a(context);
    }

    public c(Context context, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11) {
        this.f19900a = context;
        this.f19901b = str;
        this.f19904e = str3;
        this.f19902c = str2;
        this.f19903d = "";
        this.f19905f = z10;
        this.f19907h = str4;
        this.f19906g = str5;
        this.f19908i = z11;
        this.f19909j = new a(context);
    }

    public c(Context context, String str, String str2, String str3, boolean z10) {
        this.f19900a = context;
        this.f19901b = str;
        this.f19902c = str2;
        this.f19903d = str3;
        this.f19904e = "";
        this.f19905f = z10;
        this.f19907h = "";
        this.f19906g = "";
        this.f19908i = true;
        this.f19909j = new a(context);
    }

    @m0
    public l0 a(d0.a aVar) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        l0 h10 = aVar.h(b(aVar));
        if (h10.i() != 401) {
            int i10 = 0;
            while (!h10.w() && i10 < 3 && h10.i() >= 500) {
                d.c(f19899k, String.format("Request is not successful, code: %s, count: %s", new Object[]{Integer.valueOf(h10.i()), Integer.valueOf(i10)}));
                i10++;
                h10.close();
                h10 = aVar.h(b(aVar));
            }
        } else if (this.f19908i && d()) {
            try {
                h10 = aVar.h(b(aVar));
            } catch (IllegalStateException e10) {
                d.c(f19899k, e10.getMessage());
            }
        }
        String.format("request->response time: %s ms", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
        if (!wc.a.c(h10.q())) {
            return h10;
        }
        byte[] bArr = new byte[0];
        if (h10.c() != null) {
            bArr = h10.c().g();
        }
        return h10.P().b(og.m0.t(h10.c().l(), wc.a.d(bArr))).c();
    }

    public final j0 b(d0.a aVar) {
        if (yc.a.c(this.f19909j.q()) - uc.a.a() < 172800) {
            d();
        }
        j0.a h10 = aVar.c().h();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bearer ");
        String str = "";
        sb2.append(this.f19904e.equals(str) ? this.f19909j.q() : this.f19904e);
        j0.a a10 = h10.a("Authorization", sb2.toString());
        if (this.f19905f) {
            str = "gzip, deflate";
        }
        return a10.a("Accept-Encoding", str).a("accept-language", this.f19909j.c()).a("phone", this.f19906g).a("id", this.f19907h).a(e.f7416h, this.f19902c).a("buildtype", this.f19903d).b();
    }

    public boolean c() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01ce, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean d() {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            boolean r1 = r7.f19908i     // Catch:{ IOException -> 0x01d1 }
            if (r1 == 0) goto L_0x01cd
            mc.a r1 = r7.f19909j     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r1 = r1.q()     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01d1 }
            if (r1 != 0) goto L_0x01cd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r2 = "refreshToken: "
            r1.append(r2)     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r2 = r7.f19901b     // Catch:{ IOException -> 0x01d1 }
            r1.append(r2)     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r2 = "/auth/refresh-token"
            r1.append(r2)     // Catch:{ IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r2 = "token: "
            r1.append(r2)     // Catch:{ IOException -> 0x01d1 }
            mc.a r2 = r7.f19909j     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r2 = r2.q()     // Catch:{ IOException -> 0x01d1 }
            r1.append(r2)     // Catch:{ IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r2 = "refresh: "
            r1.append(r2)     // Catch:{ IOException -> 0x01d1 }
            mc.a r2 = r7.f19909j     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r2 = r2.j()     // Catch:{ IOException -> 0x01d1 }
            r1.append(r2)     // Catch:{ IOException -> 0x01d1 }
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x01d1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d1 }
            r2.<init>()     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r3 = r7.f19901b     // Catch:{ IOException -> 0x01d1 }
            r2.append(r3)     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r3 = "/auth/refresh-token"
            r2.append(r3)     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x01d1 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01d1 }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ IOException -> 0x01d1 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x01d1 }
            r2 = 1
            r1.setDoInput(r2)     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r3 = "POST"
            r1.setRequestMethod(r3)     // Catch:{ IOException -> 0x01d1 }
            r1.setUseCaches(r0)     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r3 = "Authorization"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d1 }
            r4.<init>()     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r5 = "Bearer "
            r4.append(r5)     // Catch:{ IOException -> 0x01d1 }
            mc.a r5 = r7.f19909j     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r5 = r5.q()     // Catch:{ IOException -> 0x01d1 }
            r4.append(r5)     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x01d1 }
            r1.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x01d1 }
            r1.setDoOutput(r2)     // Catch:{ IOException -> 0x01d1 }
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x01d1 }
            java.io.OutputStream r4 = r1.getOutputStream()     // Catch:{ IOException -> 0x01d1 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x01d1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d1 }
            r4.<init>()     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r5 = "refreshToken="
            r4.append(r5)     // Catch:{ IOException -> 0x01d1 }
            mc.a r5 = r7.f19909j     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r5 = r5.j()     // Catch:{ IOException -> 0x01d1 }
            r4.append(r5)     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x01d1 }
            r3.writeBytes(r4)     // Catch:{ IOException -> 0x01d1 }
            r3.flush()     // Catch:{ IOException -> 0x01d1 }
            r3.close()     // Catch:{ IOException -> 0x01d1 }
            int r3 = r1.getResponseCode()     // Catch:{ IOException -> 0x01d1 }
            r4 = 100
            if (r4 > r3) goto L_0x00db
            r4 = 399(0x18f, float:5.59E-43)
            if (r3 > r4) goto L_0x00db
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x01d1 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x01d1 }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x01d1 }
            r5.<init>(r1)     // Catch:{ IOException -> 0x01d1 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x01d1 }
            goto L_0x00e9
        L_0x00db:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x01d1 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x01d1 }
            java.io.InputStream r1 = r1.getErrorStream()     // Catch:{ IOException -> 0x01d1 }
            r5.<init>(r1)     // Catch:{ IOException -> 0x01d1 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x01d1 }
        L_0x00e9:
            java.lang.String r1 = ""
        L_0x00eb:
            java.lang.String r5 = r4.readLine()     // Catch:{ IOException -> 0x01d1 }
            if (r5 == 0) goto L_0x0101
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d1 }
            r6.<init>()     // Catch:{ IOException -> 0x01d1 }
            r6.append(r1)     // Catch:{ IOException -> 0x01d1 }
            r6.append(r5)     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r1 = r6.toString()     // Catch:{ IOException -> 0x01d1 }
            goto L_0x00eb
        L_0x0101:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d1 }
            r4.<init>()     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r5 = "refresh code: "
            r4.append(r5)     // Catch:{ IOException -> 0x01d1 }
            r4.append(r3)     // Catch:{ IOException -> 0x01d1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d1 }
            r4.<init>()     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r5 = "refresh responseBodyString: "
            r4.append(r5)     // Catch:{ IOException -> 0x01d1 }
            r4.append(r1)     // Catch:{ IOException -> 0x01d1 }
            r4 = 0
            java.lang.Class<lc.b> r5 = lc.b.class
            java.lang.Object r1 = xc.a.c(r1, r5)     // Catch:{ Exception -> 0x0126 }
            lc.b r1 = (lc.b) r1     // Catch:{ Exception -> 0x0126 }
            r4 = r1
            goto L_0x0138
        L_0x0126:
            r1 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d1 }
            r5.<init>()     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r6 = "refresh authResponse null: "
            r5.append(r6)     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ IOException -> 0x01d1 }
            r5.append(r1)     // Catch:{ IOException -> 0x01d1 }
        L_0x0138:
            r1 = 200(0xc8, float:2.8E-43)
            if (r3 != r1) goto L_0x01b5
            if (r4 == 0) goto L_0x019d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r3 = "refresh token success: "
            r1.append(r3)     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r3 = r4.toString()     // Catch:{ IOException -> 0x01d1 }
            r1.append(r3)     // Catch:{ IOException -> 0x01d1 }
            mc.a r1 = r7.f19909j     // Catch:{ IOException -> 0x01d1 }
            java.util.List r3 = r4.a()     // Catch:{ IOException -> 0x01d1 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ IOException -> 0x01d1 }
            lc.b$a r3 = (lc.b.a) r3     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r3 = r3.a()     // Catch:{ IOException -> 0x01d1 }
            r1.H(r3)     // Catch:{ IOException -> 0x01d1 }
            mc.a r1 = r7.f19909j     // Catch:{ IOException -> 0x01d1 }
            java.util.List r3 = r4.a()     // Catch:{ IOException -> 0x01d1 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ IOException -> 0x01d1 }
            lc.b$a r3 = (lc.b.a) r3     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r3 = r3.o()     // Catch:{ IOException -> 0x01d1 }
            r1.B(r3)     // Catch:{ IOException -> 0x01d1 }
            mc.a r1 = r7.f19909j     // Catch:{ IOException -> 0x01d1 }
            java.util.List r3 = r4.a()     // Catch:{ IOException -> 0x01d1 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ IOException -> 0x01d1 }
            lc.b$a r3 = (lc.b.a) r3     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r3 = r3.p()     // Catch:{ IOException -> 0x01d1 }
            r1.D(r3)     // Catch:{ IOException -> 0x01d1 }
            mc.a r1 = r7.f19909j     // Catch:{ IOException -> 0x01d1 }
            java.util.List r3 = r4.a()     // Catch:{ IOException -> 0x01d1 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ IOException -> 0x01d1 }
            lc.b$a r3 = (lc.b.a) r3     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r3 = r3.q()     // Catch:{ IOException -> 0x01d1 }
            r1.I(r3)     // Catch:{ IOException -> 0x01d1 }
            monitor-exit(r7)
            return r2
        L_0x019d:
            java.lang.String r1 = "BaseInterceptor"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d1 }
            r2.<init>()     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r4 = "cannot refresh token: "
            r2.append(r4)     // Catch:{ IOException -> 0x01d1 }
            r2.append(r3)     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x01d1 }
            ad.d.c(r1, r2)     // Catch:{ IOException -> 0x01d1 }
            monitor-exit(r7)
            return r0
        L_0x01b5:
            java.lang.String r1 = "BaseInterceptor"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d1 }
            r2.<init>()     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r4 = "cannot refresh token: "
            r2.append(r4)     // Catch:{ IOException -> 0x01d1 }
            r2.append(r3)     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x01d1 }
            ad.d.c(r1, r2)     // Catch:{ IOException -> 0x01d1 }
            monitor-exit(r7)
            return r0
        L_0x01cd:
            monitor-exit(r7)
            return r0
        L_0x01cf:
            r0 = move-exception
            goto L_0x01d7
        L_0x01d1:
            r1 = move-exception
            r1.getMessage()     // Catch:{ all -> 0x01cf }
            monitor-exit(r7)
            return r0
        L_0x01d7:
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jc.c.d():boolean");
    }
}
