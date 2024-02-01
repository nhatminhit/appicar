package gc;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import gc.b0;
import gc.j;
import gc.v;
import java.io.IOException;
import java.io.InputStream;

public class t extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f19109c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final String f19110d = "http";

    /* renamed from: e  reason: collision with root package name */
    public static final String f19111e = "https";

    /* renamed from: a  reason: collision with root package name */
    public final j f19112a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f19113b;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public t(j jVar, d0 d0Var) {
        this.f19112a = jVar;
        this.f19113b = d0Var;
    }

    public boolean c(z zVar) {
        String scheme = zVar.f19165d.getScheme();
        return f19110d.equals(scheme) || f19111e.equals(scheme);
    }

    public int e() {
        return 2;
    }

    public b0.a f(z zVar, int i10) throws IOException {
        j.a a10 = this.f19112a.a(zVar.f19165d, zVar.f19164c);
        if (a10 == null) {
            return null;
        }
        v.e eVar = a10.f19070c ? v.e.DISK : v.e.NETWORK;
        Bitmap a11 = a10.a();
        if (a11 != null) {
            return new b0.a(a11, eVar);
        }
        InputStream c10 = a10.c();
        if (c10 == null) {
            return null;
        }
        if (eVar == v.e.DISK && a10.b() == 0) {
            j0.f(c10);
            throw new a("Received response with 0 content-length header.");
        }
        if (eVar == v.e.NETWORK && a10.b() > 0) {
            this.f19113b.f(a10.b());
        }
        return new b0.a(c10, eVar);
    }

    public boolean h(boolean z10, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    public boolean i() {
        return true;
    }
}
