package u3;

import android.util.Log;
import d.m0;
import d.o0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class d {

    /* renamed from: e  reason: collision with root package name */
    public static final String f13677e = "GifHeaderParser";

    /* renamed from: f  reason: collision with root package name */
    public static final int f13678f = 255;

    /* renamed from: g  reason: collision with root package name */
    public static final int f13679g = 44;

    /* renamed from: h  reason: collision with root package name */
    public static final int f13680h = 33;

    /* renamed from: i  reason: collision with root package name */
    public static final int f13681i = 59;

    /* renamed from: j  reason: collision with root package name */
    public static final int f13682j = 249;

    /* renamed from: k  reason: collision with root package name */
    public static final int f13683k = 255;

    /* renamed from: l  reason: collision with root package name */
    public static final int f13684l = 254;

    /* renamed from: m  reason: collision with root package name */
    public static final int f13685m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f13686n = 28;

    /* renamed from: o  reason: collision with root package name */
    public static final int f13687o = 2;

    /* renamed from: p  reason: collision with root package name */
    public static final int f13688p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f13689q = 128;

    /* renamed from: r  reason: collision with root package name */
    public static final int f13690r = 64;

    /* renamed from: s  reason: collision with root package name */
    public static final int f13691s = 7;

    /* renamed from: t  reason: collision with root package name */
    public static final int f13692t = 128;

    /* renamed from: u  reason: collision with root package name */
    public static final int f13693u = 7;

    /* renamed from: v  reason: collision with root package name */
    public static final int f13694v = 2;

    /* renamed from: w  reason: collision with root package name */
    public static final int f13695w = 10;

    /* renamed from: x  reason: collision with root package name */
    public static final int f13696x = 256;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13697a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f13698b;

    /* renamed from: c  reason: collision with root package name */
    public c f13699c;

    /* renamed from: d  reason: collision with root package name */
    public int f13700d = 0;

    public void a() {
        this.f13698b = null;
        this.f13699c = null;
    }

    public final boolean b() {
        return this.f13699c.f13665b != 0;
    }

    public boolean c() {
        l();
        if (!b()) {
            j(2);
        }
        return this.f13699c.f13666c > 1;
    }

    @m0
    public c d() {
        if (this.f13698b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (b()) {
            return this.f13699c;
        } else {
            l();
            if (!b()) {
                i();
                c cVar = this.f13699c;
                if (cVar.f13666c < 0) {
                    cVar.f13665b = 1;
                }
            }
            return this.f13699c;
        }
    }

    public final int e() {
        try {
            return this.f13698b.get() & 255;
        } catch (Exception unused) {
            this.f13699c.f13665b = 1;
            return 0;
        }
    }

    public final void f() {
        this.f13699c.f13667d.f13651a = o();
        this.f13699c.f13667d.f13652b = o();
        this.f13699c.f13667d.f13653c = o();
        this.f13699c.f13667d.f13654d = o();
        int e10 = e();
        boolean z10 = false;
        boolean z11 = (e10 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((e10 & 7) + 1));
        b bVar = this.f13699c.f13667d;
        if ((e10 & 64) != 0) {
            z10 = true;
        }
        bVar.f13655e = z10;
        if (z11) {
            bVar.f13661k = h(pow);
        } else {
            bVar.f13661k = null;
        }
        this.f13699c.f13667d.f13660j = this.f13698b.position();
        t();
        if (!b()) {
            c cVar = this.f13699c;
            cVar.f13666c++;
            cVar.f13668e.add(cVar.f13667d);
        }
    }

    public final void g() {
        int e10 = e();
        this.f13700d = e10;
        if (e10 > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    int i12 = this.f13700d;
                    if (i10 < i12) {
                        i11 = i12 - i10;
                        this.f13698b.get(this.f13697a, i10, i11);
                        i10 += i11;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    if (Log.isLoggable(f13677e, 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Error Reading Block n: ");
                        sb2.append(i10);
                        sb2.append(" count: ");
                        sb2.append(i11);
                        sb2.append(" blockSize: ");
                        sb2.append(this.f13700d);
                    }
                    this.f13699c.f13665b = 1;
                    return;
                }
            }
        }
    }

    @o0
    public final int[] h(int i10) {
        byte[] bArr = new byte[(i10 * 3)];
        int[] iArr = null;
        try {
            this.f13698b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & 255) << 16) | -16777216 | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable(f13677e, 3);
            this.f13699c.f13665b = 1;
        }
        return iArr;
    }

    public final void i() {
        j(Integer.MAX_VALUE);
    }

    public final void j(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f13699c.f13666c <= i10) {
            int e10 = e();
            if (e10 == 33) {
                int e11 = e();
                if (e11 != 1) {
                    if (e11 == 249) {
                        this.f13699c.f13667d = new b();
                        k();
                    } else if (e11 != 254 && e11 == 255) {
                        g();
                        StringBuilder sb2 = new StringBuilder();
                        for (int i11 = 0; i11 < 11; i11++) {
                            sb2.append((char) this.f13697a[i11]);
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            n();
                        }
                    }
                }
                s();
            } else if (e10 == 44) {
                c cVar = this.f13699c;
                if (cVar.f13667d == null) {
                    cVar.f13667d = new b();
                }
                f();
            } else if (e10 != 59) {
                this.f13699c.f13665b = 1;
            } else {
                z10 = true;
            }
        }
    }

    public final void k() {
        e();
        int e10 = e();
        b bVar = this.f13699c.f13667d;
        int i10 = (e10 & 28) >> 2;
        bVar.f13657g = i10;
        boolean z10 = true;
        if (i10 == 0) {
            bVar.f13657g = 1;
        }
        if ((e10 & 1) == 0) {
            z10 = false;
        }
        bVar.f13656f = z10;
        int o10 = o();
        if (o10 < 2) {
            o10 = 10;
        }
        b bVar2 = this.f13699c.f13667d;
        bVar2.f13659i = o10 * 10;
        bVar2.f13658h = e();
        e();
    }

    public final void l() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) e());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f13699c.f13665b = 1;
            return;
        }
        m();
        if (this.f13699c.f13671h && !b()) {
            c cVar = this.f13699c;
            cVar.f13664a = h(cVar.f13672i);
            c cVar2 = this.f13699c;
            cVar2.f13675l = cVar2.f13664a[cVar2.f13673j];
        }
    }

    public final void m() {
        this.f13699c.f13669f = o();
        this.f13699c.f13670g = o();
        int e10 = e();
        c cVar = this.f13699c;
        cVar.f13671h = (e10 & 128) != 0;
        cVar.f13672i = (int) Math.pow(2.0d, (double) ((e10 & 7) + 1));
        this.f13699c.f13673j = e();
        this.f13699c.f13674k = e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r3 = this;
        L_0x0000:
            r3.g()
            byte[] r0 = r3.f13697a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            u3.c r2 = r3.f13699c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f13676m = r0
        L_0x001b:
            int r0 = r3.f13700d
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.b()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.d.n():void");
    }

    public final int o() {
        return this.f13698b.getShort();
    }

    public final void p() {
        this.f13698b = null;
        Arrays.fill(this.f13697a, (byte) 0);
        this.f13699c = new c();
        this.f13700d = 0;
    }

    public d q(@m0 ByteBuffer byteBuffer) {
        p();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f13698b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f13698b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public d r(@o0 byte[] bArr) {
        if (bArr != null) {
            q(ByteBuffer.wrap(bArr));
        } else {
            this.f13698b = null;
            this.f13699c.f13665b = 2;
        }
        return this;
    }

    public final void s() {
        int e10;
        do {
            e10 = e();
            this.f13698b.position(Math.min(this.f13698b.position() + e10, this.f13698b.limit()));
        } while (e10 > 0);
    }

    public final void t() {
        e();
        s();
    }
}
