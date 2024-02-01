package e7;

import android.text.TextUtils;
import b6.c;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import j6.i;
import j6.j;
import j6.k;
import j6.p;
import j6.q;
import j6.s;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p7.h;
import w7.j0;
import w7.w;

public final class s implements i {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f6973j = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f6974k = Pattern.compile("MPEGTS:(\\d+)");

    /* renamed from: l  reason: collision with root package name */
    public static final int f6975l = 6;

    /* renamed from: m  reason: collision with root package name */
    public static final int f6976m = 9;

    /* renamed from: d  reason: collision with root package name */
    public final String f6977d;

    /* renamed from: e  reason: collision with root package name */
    public final j0 f6978e;

    /* renamed from: f  reason: collision with root package name */
    public final w f6979f = new w();

    /* renamed from: g  reason: collision with root package name */
    public k f6980g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f6981h = new byte[1024];

    /* renamed from: i  reason: collision with root package name */
    public int f6982i;

    public s(String str, j0 j0Var) {
        this.f6977d = str;
        this.f6978e = j0Var;
    }

    public void a() {
    }

    public final j6.s b(long j10) {
        j6.s a10 = this.f6980g.a(0, 3);
        a10.d(Format.D((String) null, w7.s.S, (String) null, -1, 0, this.f6977d, (DrmInitData) null, j10));
        this.f6980g.r();
        return a10;
    }

    public boolean c(j jVar) throws IOException, InterruptedException {
        jVar.c(this.f6981h, 0, 6, false);
        this.f6979f.O(this.f6981h, 6);
        if (h.b(this.f6979f)) {
            return true;
        }
        jVar.c(this.f6981h, 6, 3, false);
        this.f6979f.O(this.f6981h, 9);
        return h.b(this.f6979f);
    }

    public final void d() throws b6.j0 {
        w wVar = new w(this.f6981h);
        h.e(wVar);
        long j10 = 0;
        long j11 = 0;
        while (true) {
            String n10 = wVar.n();
            if (TextUtils.isEmpty(n10)) {
                Matcher a10 = h.a(wVar);
                if (a10 == null) {
                    b(0);
                    return;
                }
                long d10 = h.d(a10.group(1));
                long b10 = this.f6978e.b(j0.i((j10 + d10) - j11));
                j6.s b11 = b(b10 - d10);
                this.f6979f.O(this.f6981h, this.f6982i);
                b11.a(this.f6979f, this.f6982i);
                b11.c(b10, 1, this.f6982i, 0, (s.a) null);
                return;
            } else if (n10.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f6973j.matcher(n10);
                if (matcher.find()) {
                    Matcher matcher2 = f6974k.matcher(n10);
                    if (matcher2.find()) {
                        j11 = h.d(matcher.group(1));
                        j10 = j0.f(Long.parseLong(matcher2.group(1)));
                    } else {
                        throw new b6.j0("X-TIMESTAMP-MAP doesn't contain media timestamp: " + n10);
                    }
                } else {
                    throw new b6.j0("X-TIMESTAMP-MAP doesn't contain local timestamp: " + n10);
                }
            }
        }
    }

    public int f(j jVar, p pVar) throws IOException, InterruptedException {
        int length = (int) jVar.getLength();
        int i10 = this.f6982i;
        byte[] bArr = this.f6981h;
        if (i10 == bArr.length) {
            this.f6981h = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f6981h;
        int i11 = this.f6982i;
        int read = jVar.read(bArr2, i11, bArr2.length - i11);
        if (read != -1) {
            int i12 = this.f6982i + read;
            this.f6982i = i12;
            if (length == -1 || i12 != length) {
                return 0;
            }
        }
        d();
        return -1;
    }

    public void g(k kVar) {
        this.f6980g = kVar;
        kVar.q(new q.b(c.f4201b));
    }

    public void h(long j10, long j11) {
        throw new IllegalStateException();
    }
}
