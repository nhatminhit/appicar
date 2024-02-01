package j6;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import t7.l;
import w7.a;
import w7.q0;

public final class e implements j {

    /* renamed from: h  reason: collision with root package name */
    public static final int f9566h = 65536;

    /* renamed from: i  reason: collision with root package name */
    public static final int f9567i = 524288;

    /* renamed from: j  reason: collision with root package name */
    public static final int f9568j = 4096;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f9569a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    public final l f9570b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9571c;

    /* renamed from: d  reason: collision with root package name */
    public long f9572d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f9573e = new byte[65536];

    /* renamed from: f  reason: collision with root package name */
    public int f9574f;

    /* renamed from: g  reason: collision with root package name */
    public int f9575g;

    public e(l lVar, long j10, long j11) {
        this.f9570b = lVar;
        this.f9572d = j10;
        this.f9571c = j11;
    }

    public boolean a(byte[] bArr, int i10, int i11, boolean z10) throws IOException, InterruptedException {
        int o10 = o(bArr, i10, i11);
        while (o10 < i11 && o10 != -1) {
            o10 = n(bArr, i10, i11, o10, z10);
        }
        l(o10);
        return o10 != -1;
    }

    public boolean b(int i10, boolean z10) throws IOException, InterruptedException {
        int p10 = p(i10);
        while (p10 < i10 && p10 != -1) {
            p10 = n(this.f9569a, -p10, Math.min(i10, this.f9569a.length + p10), p10, z10);
        }
        l(p10);
        return p10 != -1;
    }

    public boolean c(byte[] bArr, int i10, int i11, boolean z10) throws IOException, InterruptedException {
        if (!j(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f9573e, this.f9574f - i11, bArr, i10, i11);
        return true;
    }

    public long d() {
        return this.f9572d + ((long) this.f9574f);
    }

    public void e(int i10) throws IOException, InterruptedException {
        j(i10, false);
    }

    public int f(int i10) throws IOException, InterruptedException {
        int p10 = p(i10);
        if (p10 == 0) {
            byte[] bArr = this.f9569a;
            p10 = n(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        l(p10);
        return p10;
    }

    public <E extends Throwable> void g(long j10, E e10) throws Throwable {
        a.a(j10 >= 0);
        this.f9572d = j10;
        throw e10;
    }

    public long getLength() {
        return this.f9571c;
    }

    public long getPosition() {
        return this.f9572d;
    }

    public void h() {
        this.f9574f = 0;
    }

    public void i(int i10) throws IOException, InterruptedException {
        b(i10, false);
    }

    public boolean j(int i10, boolean z10) throws IOException, InterruptedException {
        m(i10);
        int i11 = this.f9575g - this.f9574f;
        while (i11 < i10) {
            i11 = n(this.f9573e, this.f9574f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f9575g = this.f9574f + i11;
        }
        this.f9574f += i10;
        return true;
    }

    public void k(byte[] bArr, int i10, int i11) throws IOException, InterruptedException {
        c(bArr, i10, i11, false);
    }

    public final void l(int i10) {
        if (i10 != -1) {
            this.f9572d += (long) i10;
        }
    }

    public final void m(int i10) {
        int i11 = this.f9574f + i10;
        byte[] bArr = this.f9573e;
        if (i11 > bArr.length) {
            this.f9573e = Arrays.copyOf(this.f9573e, q0.u(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    public final int n(byte[] bArr, int i10, int i11, int i12, boolean z10) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int read = this.f9570b.read(bArr, i10 + i12, i11 - i12);
            if (read != -1) {
                return i12 + read;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    public final int o(byte[] bArr, int i10, int i11) {
        int i12 = this.f9575g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f9573e, 0, bArr, i10, min);
        q(min);
        return min;
    }

    public final int p(int i10) {
        int min = Math.min(this.f9575g, i10);
        q(min);
        return min;
    }

    public final void q(int i10) {
        int i11 = this.f9575g - i10;
        this.f9575g = i11;
        this.f9574f = 0;
        byte[] bArr = this.f9573e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[(65536 + i11)] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f9573e = bArr2;
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException, InterruptedException {
        int o10 = o(bArr, i10, i11);
        if (o10 == 0) {
            o10 = n(bArr, i10, i11, 0, true);
        }
        l(o10);
        return o10;
    }

    public void readFully(byte[] bArr, int i10, int i11) throws IOException, InterruptedException {
        a(bArr, i10, i11, false);
    }
}
