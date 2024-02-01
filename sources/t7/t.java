package t7;

import android.content.Context;
import android.net.Uri;
import d.o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t7.e0;
import w7.a;
import w7.p;
import w7.q0;
import w7.y;

public final class t implements l {

    /* renamed from: m  reason: collision with root package name */
    public static final String f13203m = "DefaultDataSource";

    /* renamed from: n  reason: collision with root package name */
    public static final String f13204n = "asset";

    /* renamed from: o  reason: collision with root package name */
    public static final String f13205o = "content";

    /* renamed from: p  reason: collision with root package name */
    public static final String f13206p = "rtmp";

    /* renamed from: q  reason: collision with root package name */
    public static final String f13207q = "udp";

    /* renamed from: r  reason: collision with root package name */
    public static final String f13208r = "rawresource";

    /* renamed from: b  reason: collision with root package name */
    public final Context f13209b;

    /* renamed from: c  reason: collision with root package name */
    public final List<r0> f13210c;

    /* renamed from: d  reason: collision with root package name */
    public final l f13211d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public l f13212e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public l f13213f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public l f13214g;
    @o0

    /* renamed from: h  reason: collision with root package name */
    public l f13215h;
    @o0

    /* renamed from: i  reason: collision with root package name */
    public l f13216i;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public l f13217j;
    @o0

    /* renamed from: k  reason: collision with root package name */
    public l f13218k;
    @o0

    /* renamed from: l  reason: collision with root package name */
    public l f13219l;

    public t(Context context, String str, int i10, int i11, boolean z10) {
        this(context, new v(str, (y<String>) null, i10, i11, z10, (e0.f) null));
    }

    public t(Context context, String str, boolean z10) {
        this(context, str, 8000, 8000, z10);
    }

    public t(Context context, l lVar) {
        this.f13209b = context.getApplicationContext();
        this.f13211d = (l) a.g(lVar);
        this.f13210c = new ArrayList();
    }

    @Deprecated
    public t(Context context, @o0 r0 r0Var, String str, int i10, int i11, boolean z10) {
        this(context, r0Var, (l) new v(str, (y<String>) null, r0Var, i10, i11, z10, (e0.f) null));
    }

    @Deprecated
    public t(Context context, @o0 r0 r0Var, String str, boolean z10) {
        this(context, r0Var, str, 8000, 8000, z10);
    }

    @Deprecated
    public t(Context context, @o0 r0 r0Var, l lVar) {
        this(context, lVar);
        if (r0Var != null) {
            this.f13210c.add(r0Var);
        }
    }

    public long a(o oVar) throws IOException {
        l lVar;
        a.i(this.f13219l == null);
        String scheme = oVar.f13130a.getScheme();
        if (q0.u0(oVar.f13130a)) {
            String path = oVar.f13130a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                lVar = l();
                this.f13219l = lVar;
                return this.f13219l.a(oVar);
            }
        } else if (!f13204n.equals(scheme)) {
            lVar = f13205o.equals(scheme) ? j() : f13206p.equals(scheme) ? n() : f13207q.equals(scheme) ? o() : "data".equals(scheme) ? k() : "rawresource".equals(scheme) ? m() : this.f13211d;
            this.f13219l = lVar;
            return this.f13219l.a(oVar);
        }
        lVar = i();
        this.f13219l = lVar;
        return this.f13219l.a(oVar);
    }

    public Map<String, List<String>> b() {
        l lVar = this.f13219l;
        return lVar == null ? Collections.emptyMap() : lVar.b();
    }

    public void close() throws IOException {
        l lVar = this.f13219l;
        if (lVar != null) {
            try {
                lVar.close();
            } finally {
                this.f13219l = null;
            }
        }
    }

    public void d(r0 r0Var) {
        this.f13211d.d(r0Var);
        this.f13210c.add(r0Var);
        p(this.f13212e, r0Var);
        p(this.f13213f, r0Var);
        p(this.f13214g, r0Var);
        p(this.f13215h, r0Var);
        p(this.f13216i, r0Var);
        p(this.f13217j, r0Var);
        p(this.f13218k, r0Var);
    }

    @o0
    public Uri g() {
        l lVar = this.f13219l;
        if (lVar == null) {
            return null;
        }
        return lVar.g();
    }

    public final void h(l lVar) {
        for (int i10 = 0; i10 < this.f13210c.size(); i10++) {
            lVar.d(this.f13210c.get(i10));
        }
    }

    public final l i() {
        if (this.f13213f == null) {
            c cVar = new c(this.f13209b);
            this.f13213f = cVar;
            h(cVar);
        }
        return this.f13213f;
    }

    public final l j() {
        if (this.f13214g == null) {
            h hVar = new h(this.f13209b);
            this.f13214g = hVar;
            h(hVar);
        }
        return this.f13214g;
    }

    public final l k() {
        if (this.f13217j == null) {
            i iVar = new i();
            this.f13217j = iVar;
            h(iVar);
        }
        return this.f13217j;
    }

    public final l l() {
        if (this.f13212e == null) {
            a0 a0Var = new a0();
            this.f13212e = a0Var;
            h(a0Var);
        }
        return this.f13212e;
    }

    public final l m() {
        if (this.f13218k == null) {
            m0 m0Var = new m0(this.f13209b);
            this.f13218k = m0Var;
            h(m0Var);
        }
        return this.f13218k;
    }

    public final l n() {
        if (this.f13215h == null) {
            try {
                l lVar = (l) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f13215h = lVar;
                h(lVar);
            } catch (ClassNotFoundException unused) {
                p.l(f13203m, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f13215h == null) {
                this.f13215h = this.f13211d;
            }
        }
        return this.f13215h;
    }

    public final l o() {
        if (this.f13216i == null) {
            s0 s0Var = new s0();
            this.f13216i = s0Var;
            h(s0Var);
        }
        return this.f13216i;
    }

    public final void p(@o0 l lVar, r0 r0Var) {
        if (lVar != null) {
            lVar.d(r0Var);
        }
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((l) a.g(this.f13219l)).read(bArr, i10, i11);
    }
}
