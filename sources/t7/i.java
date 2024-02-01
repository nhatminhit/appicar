package t7;

import android.net.Uri;
import android.util.Base64;
import b6.c;
import b6.j0;
import d.o0;
import d4.e;
import java.io.IOException;
import java.net.URLDecoder;
import w7.q0;

public final class i extends e {

    /* renamed from: j  reason: collision with root package name */
    public static final String f13095j = "data";
    @o0

    /* renamed from: f  reason: collision with root package name */
    public o f13096f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public byte[] f13097g;

    /* renamed from: h  reason: collision with root package name */
    public int f13098h;

    /* renamed from: i  reason: collision with root package name */
    public int f13099i;

    public i() {
        super(false);
    }

    public long a(o oVar) throws IOException {
        j(oVar);
        this.f13096f = oVar;
        this.f13099i = (int) oVar.f13135f;
        Uri uri = oVar.f13130a;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] R0 = q0.R0(uri.getSchemeSpecificPart(), ",");
            if (R0.length == 2) {
                String str = R0[1];
                if (R0[0].contains(e.f6017c)) {
                    try {
                        this.f13097g = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e10) {
                        throw new j0("Error while parsing Base64 encoded string: " + str, e10);
                    }
                } else {
                    this.f13097g = q0.m0(URLDecoder.decode(str, c.f4237k));
                }
                long j10 = oVar.f13136g;
                int length = j10 != -1 ? ((int) j10) + this.f13099i : this.f13097g.length;
                this.f13098h = length;
                if (length > this.f13097g.length || this.f13099i > length) {
                    this.f13097g = null;
                    throw new m(0);
                }
                k(oVar);
                return ((long) this.f13098h) - ((long) this.f13099i);
            }
            throw new j0("Unexpected URI format: " + uri);
        }
        throw new j0("Unsupported scheme: " + scheme);
    }

    public void close() {
        if (this.f13097g != null) {
            this.f13097g = null;
            i();
        }
        this.f13096f = null;
    }

    @o0
    public Uri g() {
        o oVar = this.f13096f;
        if (oVar != null) {
            return oVar.f13130a;
        }
        return null;
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f13098h - this.f13099i;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(q0.l(this.f13097g), this.f13099i, bArr, i10, min);
        this.f13099i += min;
        h(min);
        return min;
    }
}
