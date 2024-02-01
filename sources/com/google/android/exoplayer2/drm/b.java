package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.a;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.drm.e;
import d.o0;
import h6.j;
import h6.k;
import h6.l;
import h6.m;
import h6.n;
import h6.r;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import w7.i;
import w7.p;
import w7.q0;

@TargetApi(18)
public class b<T extends m> implements l<T>, a.c<T> {

    /* renamed from: n  reason: collision with root package name */
    public static final String f5108n = "PRCustomData";

    /* renamed from: o  reason: collision with root package name */
    public static final int f5109o = 0;

    /* renamed from: p  reason: collision with root package name */
    public static final int f5110p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f5111q = 2;

    /* renamed from: r  reason: collision with root package name */
    public static final int f5112r = 3;

    /* renamed from: s  reason: collision with root package name */
    public static final int f5113s = 3;

    /* renamed from: t  reason: collision with root package name */
    public static final String f5114t = "DefaultDrmSessionMgr";

    /* renamed from: a  reason: collision with root package name */
    public final UUID f5115a;

    /* renamed from: b  reason: collision with root package name */
    public final e<T> f5116b;

    /* renamed from: c  reason: collision with root package name */
    public final i f5117c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, String> f5118d;

    /* renamed from: e  reason: collision with root package name */
    public final i<j> f5119e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5120f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5121g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a<T>> f5122h;

    /* renamed from: i  reason: collision with root package name */
    public final List<a<T>> f5123i;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public Looper f5124j;

    /* renamed from: k  reason: collision with root package name */
    public int f5125k;
    @o0

    /* renamed from: l  reason: collision with root package name */
    public byte[] f5126l;
    @o0

    /* renamed from: m  reason: collision with root package name */
    public volatile b<T>.c f5127m;

    /* renamed from: com.google.android.exoplayer2.drm.b$b  reason: collision with other inner class name */
    public class C0085b implements e.c<T> {
        public C0085b() {
        }

        public void a(e<? extends T> eVar, @o0 byte[] bArr, int i10, int i11, @o0 byte[] bArr2) {
            ((c) w7.a.g(b.this.f5127m)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (a aVar : b.this.f5122h) {
                    if (aVar.l(bArr)) {
                        aVar.s(message.what);
                        return;
                    }
                }
            }
        }
    }

    public static final class d extends Exception {
        public d(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public b(UUID uuid, e<T> eVar, i iVar, @o0 HashMap<String, String> hashMap) {
        this(uuid, eVar, iVar, hashMap, false, 3);
    }

    public b(UUID uuid, e<T> eVar, i iVar, @o0 HashMap<String, String> hashMap, boolean z10) {
        this(uuid, eVar, iVar, hashMap, z10, 3);
    }

    public b(UUID uuid, e<T> eVar, i iVar, @o0 HashMap<String, String> hashMap, boolean z10, int i10) {
        w7.a.g(uuid);
        w7.a.g(eVar);
        w7.a.b(!b6.c.f4295y1.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f5115a = uuid;
        this.f5116b = eVar;
        this.f5117c = iVar;
        this.f5118d = hashMap;
        this.f5119e = new i<>();
        this.f5120f = z10;
        this.f5121g = i10;
        this.f5125k = 0;
        this.f5122h = new ArrayList();
        this.f5123i = new ArrayList();
        if (z10 && b6.c.A1.equals(uuid) && q0.f14786a >= 19) {
            eVar.i("sessionSharing", "enable");
        }
        eVar.l(new C0085b());
    }

    public static List<DrmInitData.SchemeData> l(DrmInitData drmInitData, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(drmInitData.R);
        for (int i10 = 0; i10 < drmInitData.R; i10++) {
            DrmInitData.SchemeData e10 = drmInitData.e(i10);
            if ((e10.e(uuid) || (b6.c.f4299z1.equals(uuid) && e10.e(b6.c.f4295y1))) && (e10.S != null || z10)) {
                arrayList.add(e10);
            }
        }
        return arrayList;
    }

    public static b<n> n(UUID uuid, i iVar, @o0 HashMap<String, String> hashMap) throws r {
        return new b(uuid, f.D(uuid), iVar, hashMap, false, 3);
    }

    public static b<n> o(i iVar, @o0 String str) throws r {
        HashMap hashMap;
        if (!TextUtils.isEmpty(str)) {
            hashMap = new HashMap();
            hashMap.put(f5108n, str);
        } else {
            hashMap = null;
        }
        return n(b6.c.B1, iVar, hashMap);
    }

    public static b<n> p(i iVar, @o0 HashMap<String, String> hashMap) throws r {
        return n(b6.c.A1, iVar, hashMap);
    }

    public c<T> a(Looper looper, DrmInitData drmInitData) {
        List<DrmInitData.SchemeData> list;
        Looper looper2 = this.f5124j;
        w7.a.i(looper2 == null || looper2 == looper);
        if (this.f5122h.isEmpty()) {
            this.f5124j = looper;
            if (this.f5127m == null) {
                this.f5127m = new c(looper);
            }
        }
        a aVar = null;
        if (this.f5126l == null) {
            List<DrmInitData.SchemeData> l10 = l(drmInitData, this.f5115a, false);
            if (l10.isEmpty()) {
                d dVar = new d(this.f5115a);
                this.f5119e.b(new k(dVar));
                return new d(new c.a(dVar));
            }
            list = l10;
        } else {
            list = null;
        }
        if (this.f5120f) {
            Iterator<a<T>> it = this.f5122h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a next = it.next();
                if (q0.e(next.f5086f, list)) {
                    aVar = next;
                    break;
                }
            }
        } else if (!this.f5122h.isEmpty()) {
            aVar = this.f5122h.get(0);
        }
        if (aVar == null) {
            a aVar2 = new a(this.f5115a, this.f5116b, this, list, this.f5125k, this.f5126l, this.f5118d, this.f5117c, looper, this.f5119e, this.f5121g);
            this.f5122h.add(aVar2);
            aVar = aVar2;
        }
        aVar.i();
        return aVar;
    }

    public void b(a<T> aVar) {
        if (!this.f5123i.contains(aVar)) {
            this.f5123i.add(aVar);
            if (this.f5123i.size() == 1) {
                aVar.y();
            }
        }
    }

    public void c(Exception exc) {
        for (a<T> u10 : this.f5123i) {
            u10.u(exc);
        }
        this.f5123i.clear();
    }

    public boolean d(DrmInitData drmInitData) {
        if (this.f5126l != null) {
            return true;
        }
        if (l(drmInitData, this.f5115a, true).isEmpty()) {
            if (drmInitData.R != 1 || !drmInitData.e(0).e(b6.c.f4295y1)) {
                return false;
            }
            p.l(f5114t, "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f5115a);
        }
        String str = drmInitData.Q;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return (!b6.c.f4279u1.equals(str) && !b6.c.f4287w1.equals(str) && !b6.c.f4283v1.equals(str)) || q0.f14786a >= 25;
    }

    public void e() {
        for (a<T> t10 : this.f5123i) {
            t10.t();
        }
        this.f5123i.clear();
    }

    public void f(c<T> cVar) {
        if (!(cVar instanceof d)) {
            a<T> aVar = (a) cVar;
            if (aVar.z()) {
                this.f5122h.remove(aVar);
                if (this.f5123i.size() > 1 && this.f5123i.get(0) == aVar) {
                    this.f5123i.get(1).y();
                }
                this.f5123i.remove(aVar);
            }
        }
    }

    public final void i(Handler handler, j jVar) {
        this.f5119e.a(handler, jVar);
    }

    public final byte[] j(String str) {
        return this.f5116b.k(str);
    }

    public final String k(String str) {
        return this.f5116b.d(str);
    }

    public final void q(j jVar) {
        this.f5119e.c(jVar);
    }

    public void r(int i10, @o0 byte[] bArr) {
        w7.a.i(this.f5122h.isEmpty());
        if (i10 == 1 || i10 == 3) {
            w7.a.g(bArr);
        }
        this.f5125k = i10;
        this.f5126l = bArr;
    }

    public final void s(String str, byte[] bArr) {
        this.f5116b.c(str, bArr);
    }

    public final void t(String str, String str2) {
        this.f5116b.i(str, str2);
    }
}
