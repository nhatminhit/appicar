package com.google.android.exoplayer2.drm;

import android.annotation.TargetApi;
import android.text.TextUtils;
import com.google.android.exoplayer2.drm.e;
import d.o0;
import hh.c;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import t7.e0;
import w7.a;
import w7.q0;

@TargetApi(18)
public final class g implements i {

    /* renamed from: e  reason: collision with root package name */
    public static final int f5155e = 5;

    /* renamed from: a  reason: collision with root package name */
    public final e0.b f5156a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5157b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5158c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, String> f5159d;

    public g(String str, e0.b bVar) {
        this(str, false, bVar);
    }

    public g(String str, boolean z10, e0.b bVar) {
        this.f5156a = bVar;
        this.f5157b = str;
        this.f5158c = z10;
        this.f5159d = new HashMap();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b A[Catch:{ e -> 0x0051, all -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073 A[LOOP:1: B:7:0x002e->B:29:0x0073, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c A[EDGE_INSN: B:30:0x007c->B:31:? ?: BREAK  , SYNTHETIC, Splitter:B:30:0x007c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] e(t7.e0.b r17, java.lang.String r18, byte[] r19, @d.o0 java.util.Map<java.lang.String, java.lang.String> r20) throws java.io.IOException {
        /*
            t7.e0 r1 = r17.a()
            if (r20 == 0) goto L_0x002a
            java.util.Set r0 = r20.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x000e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.c(r3, r2)
            goto L_0x000e
        L_0x002a:
            r2 = 0
            r0 = r18
            r3 = r2
        L_0x002e:
            t7.o r15 = new t7.o
            android.net.Uri r5 = android.net.Uri.parse(r0)
            r7 = 0
            r9 = 0
            r11 = -1
            r13 = 0
            r14 = 1
            r4 = r15
            r6 = r19
            r4.<init>(r5, r6, r7, r9, r11, r13, r14)
            t7.n r4 = new t7.n
            r4.<init>(r1, r15)
            byte[] r0 = w7.q0.X0(r4)     // Catch:{ e -> 0x0051 }
            w7.q0.q(r4)
            return r0
        L_0x004f:
            r0 = move-exception
            goto L_0x007d
        L_0x0051:
            r0 = move-exception
            r5 = r0
            int r0 = r5.T     // Catch:{ all -> 0x004f }
            r6 = 307(0x133, float:4.3E-43)
            if (r0 == r6) goto L_0x005f
            int r0 = r5.T     // Catch:{ all -> 0x004f }
            r6 = 308(0x134, float:4.32E-43)
            if (r0 != r6) goto L_0x0067
        L_0x005f:
            int r0 = r3 + 1
            r6 = 5
            if (r3 >= r6) goto L_0x0066
            r3 = 1
            goto L_0x0069
        L_0x0066:
            r3 = r0
        L_0x0067:
            r0 = r3
            r3 = r2
        L_0x0069:
            if (r3 == 0) goto L_0x0070
            java.lang.String r3 = f(r5)     // Catch:{ all -> 0x004f }
            goto L_0x0071
        L_0x0070:
            r3 = 0
        L_0x0071:
            if (r3 == 0) goto L_0x007c
            w7.q0.q(r4)
            r16 = r3
            r3 = r0
            r0 = r16
            goto L_0x002e
        L_0x007c:
            throw r5     // Catch:{ all -> 0x004f }
        L_0x007d:
            w7.q0.q(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.g.e(t7.e0$b, java.lang.String, byte[], java.util.Map):byte[]");
    }

    @o0
    public static String f(e0.e eVar) {
        List list;
        Map<String, List<String>> map = eVar.V;
        if (map == null || (list = map.get(c.e.f19601q)) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public byte[] a(UUID uuid, e.a aVar) throws Exception {
        String b10 = aVar.b();
        if (this.f5158c || TextUtils.isEmpty(b10)) {
            b10 = this.f5157b;
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = b6.c.B1;
        hashMap.put(c.f19573f, uuid2.equals(uuid) ? "text/xml" : b6.c.f4299z1.equals(uuid) ? "application/json" : c.f19577j);
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f5159d) {
            hashMap.putAll(this.f5159d);
        }
        return e(this.f5156a, b10, aVar.a(), hashMap);
    }

    public byte[] b(UUID uuid, e.C0086e eVar) throws IOException {
        return e(this.f5156a, eVar.b() + "&signedRequest=" + q0.F(eVar.a()), q0.f14791f, (Map<String, String>) null);
    }

    public void c() {
        synchronized (this.f5159d) {
            this.f5159d.clear();
        }
    }

    public void d(String str) {
        a.g(str);
        synchronized (this.f5159d) {
            this.f5159d.remove(str);
        }
    }

    public void g(String str, String str2) {
        a.g(str);
        a.g(str2);
        synchronized (this.f5159d) {
            this.f5159d.put(str, str2);
        }
    }
}
