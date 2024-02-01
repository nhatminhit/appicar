package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.text.TextUtils;
import b6.c;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.e;
import d.o0;
import h6.n;
import h6.o;
import h6.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o6.j;
import w7.a;
import w7.p;
import w7.q0;
import w7.s;
import w7.w;

@TargetApi(23)
public final class f implements e<n> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f5148i = "cenc";

    /* renamed from: j  reason: collision with root package name */
    public static final String f5149j = "https://x";

    /* renamed from: k  reason: collision with root package name */
    public static final String f5150k = "<LA_URL>https://x</LA_URL>";

    /* renamed from: l  reason: collision with root package name */
    public static final int f5151l = 2;

    /* renamed from: m  reason: collision with root package name */
    public static final String f5152m = "FrameworkMediaDrm";

    /* renamed from: g  reason: collision with root package name */
    public final UUID f5153g;

    /* renamed from: h  reason: collision with root package name */
    public final MediaDrm f5154h;

    public f(UUID uuid) throws UnsupportedSchemeException {
        a.g(uuid);
        a.b(!c.f4295y1.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f5153g = uuid;
        MediaDrm mediaDrm = new MediaDrm(w(uuid));
        this.f5154h = mediaDrm;
        if (c.A1.equals(uuid) && C()) {
            y(mediaDrm);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A(e.c cVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        cVar.a(this, bArr, i10, i11, bArr2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void B(e.d dVar, MediaDrm mediaDrm, byte[] bArr, List list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaDrm.KeyStatus keyStatus = (MediaDrm.KeyStatus) it.next();
            arrayList.add(new e.b(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        dVar.a(this, bArr, arrayList, z10);
    }

    public static boolean C() {
        return "ASUS_Z00AD".equals(q0.f14789d);
    }

    public static f D(UUID uuid) throws r {
        try {
            return new f(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new r(1, e10);
        } catch (Exception e11) {
            throw new r(2, e11);
        }
    }

    public static byte[] s(byte[] bArr) {
        w wVar = new w(bArr);
        int o10 = wVar.o();
        short r10 = wVar.r();
        short r11 = wVar.r();
        if (r10 == 1 && r11 == 1) {
            String B = wVar.B(wVar.r(), Charset.forName(c.f4249n));
            if (B.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = B.indexOf("</DATA>");
            if (indexOf == -1) {
                p.l(f5152m, "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = B.substring(0, indexOf) + f5150k + B.substring(indexOf);
            int i10 = o10 + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i10);
            allocate.putShort((short) r10);
            allocate.putShort((short) r11);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(Charset.forName(c.f4249n)));
            return allocate.array();
        }
        p.h(f5152m, "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    public static byte[] t(UUID uuid, byte[] bArr) {
        return c.f4299z1.equals(uuid) ? h6.a.a(bArr) : bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if ("AFTM".equals(r0) == false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] u(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = b6.c.B1
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L_0x0018
            byte[] r1 = o6.j.e(r4, r3)
            if (r1 != 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r4 = r1
        L_0x0010:
            byte[] r4 = s(r4)
            byte[] r4 = o6.j.a(r0, r4)
        L_0x0018:
            int r1 = w7.q0.f14786a
            r2 = 21
            if (r1 >= r2) goto L_0x0026
            java.util.UUID r1 = b6.c.A1
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0050
        L_0x0026:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = w7.q0.f14788c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = w7.q0.f14789d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0050
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0050
            java.lang.String r1 = "AFTM"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
        L_0x0050:
            byte[] r3 = o6.j.e(r4, r3)
            if (r3 == 0) goto L_0x0057
            return r3
        L_0x0057:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.f.u(java.util.UUID, byte[]):byte[]");
    }

    public static String v(UUID uuid, String str) {
        return (q0.f14786a >= 26 || !c.f4299z1.equals(uuid) || (!s.f14807e.equals(str) && !s.f14835t.equals(str))) ? str : "cenc";
    }

    public static UUID w(UUID uuid) {
        return (q0.f14786a >= 27 || !c.f4299z1.equals(uuid)) ? uuid : c.f4295y1;
    }

    @SuppressLint({"WrongConstant"})
    public static void y(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    public static DrmInitData.SchemeData z(UUID uuid, List<DrmInitData.SchemeData> list) {
        boolean z10;
        if (c.A1.equals(uuid)) {
            if (q0.f14786a >= 28 && list.size() > 1) {
                DrmInitData.SchemeData schemeData = list.get(0);
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        z10 = true;
                        break;
                    }
                    DrmInitData.SchemeData schemeData2 = list.get(i10);
                    byte[] bArr = (byte[]) q0.l(schemeData2.S);
                    if (schemeData2.T != schemeData.T || !q0.e(schemeData2.R, schemeData.R) || !q0.e(schemeData2.Q, schemeData.Q) || !j.c(bArr)) {
                        z10 = false;
                    } else {
                        i11 += bArr.length;
                        i10++;
                    }
                }
                z10 = false;
                if (z10) {
                    byte[] bArr2 = new byte[i11];
                    int i12 = 0;
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        byte[] bArr3 = (byte[]) q0.l(list.get(i13).S);
                        int length = bArr3.length;
                        System.arraycopy(bArr3, 0, bArr2, i12, length);
                        i12 += length;
                    }
                    return schemeData.c(bArr2);
                }
            }
            for (int i14 = 0; i14 < list.size(); i14++) {
                DrmInitData.SchemeData schemeData3 = list.get(i14);
                int g10 = j.g((byte[]) q0.l(schemeData3.S));
                int i15 = q0.f14786a;
                if (i15 < 23 && g10 == 0) {
                    return schemeData3;
                }
                if (i15 >= 23 && g10 == 1) {
                    return schemeData3;
                }
            }
        }
        return list.get(0);
    }

    public void a() {
        this.f5154h.release();
    }

    public Map<String, String> b(byte[] bArr) {
        return this.f5154h.queryKeyStatus(bArr);
    }

    public void c(String str, byte[] bArr) {
        this.f5154h.setPropertyByteArray(str, bArr);
    }

    public String d(String str) {
        return this.f5154h.getPropertyString(str);
    }

    public e.C0086e f() {
        MediaDrm.ProvisionRequest provisionRequest = this.f5154h.getProvisionRequest();
        return new e.C0086e(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public byte[] g() throws MediaDrmException {
        return this.f5154h.openSession();
    }

    public void h(byte[] bArr, byte[] bArr2) {
        this.f5154h.restoreKeys(bArr, bArr2);
    }

    public void i(String str, String str2) {
        this.f5154h.setPropertyString(str, str2);
    }

    public void j(byte[] bArr) {
        this.f5154h.closeSession(bArr);
    }

    public byte[] k(String str) {
        return this.f5154h.getPropertyByteArray(str);
    }

    public void l(e.c<? super n> cVar) {
        this.f5154h.setOnEventListener(cVar == null ? null : new o(this, cVar));
    }

    @o0
    public byte[] m(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (c.f4299z1.equals(this.f5153g)) {
            bArr2 = h6.a.b(bArr2);
        }
        return this.f5154h.provideKeyResponse(bArr, bArr2);
    }

    public void n(byte[] bArr) throws DeniedByServerException {
        this.f5154h.provideProvisionResponse(bArr);
    }

    public e.a o(byte[] bArr, @o0 List<DrmInitData.SchemeData> list, int i10, @o0 HashMap<String, String> hashMap) throws NotProvisionedException {
        String str;
        byte[] bArr2;
        DrmInitData.SchemeData schemeData = null;
        if (list != null) {
            schemeData = z(this.f5153g, list);
            bArr2 = u(this.f5153g, (byte[]) a.g(schemeData.S));
            str = v(this.f5153g, schemeData.R);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f5154h.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] t10 = t(this.f5153g, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if (f5149j.equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeData != null && !TextUtils.isEmpty(schemeData.Q)) {
            defaultUrl = schemeData.Q;
        }
        return new e.a(t10, defaultUrl);
    }

    public void p(e.d<? super n> dVar) {
        if (q0.f14786a >= 23) {
            this.f5154h.setOnKeyStatusChangeListener(dVar == null ? null : new h6.p(this, dVar), (Handler) null);
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: x */
    public n e(byte[] bArr) throws MediaCryptoException {
        return new n(w(this.f5153g), bArr, q0.f14786a < 21 && c.A1.equals(this.f5153g) && "L3".equals(d("securityLevel")));
    }
}
