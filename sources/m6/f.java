package m6;

import android.support.v4.media.session.PlaybackStateCompat;
import j6.j;
import java.io.IOException;
import w7.w;
import y4.c;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final int f10629c = 1024;

    /* renamed from: d  reason: collision with root package name */
    public static final int f10630d = 440786851;

    /* renamed from: a  reason: collision with root package name */
    public final w f10631a = new w(8);

    /* renamed from: b  reason: collision with root package name */
    public int f10632b;

    public final long a(j jVar) throws IOException, InterruptedException {
        int i10 = 0;
        jVar.k(this.f10631a.f14880a, 0, 1);
        byte b10 = this.f10631a.f14880a[0] & 255;
        if (b10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((b10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = b10 & (~i11);
        jVar.k(this.f10631a.f14880a, 1, i12);
        while (i10 < i12) {
            i10++;
            i13 = (this.f10631a.f14880a[i10] & 255) + (i13 << 8);
        }
        this.f10632b += i12 + 1;
        return (long) i13;
    }

    public boolean b(j jVar) throws IOException, InterruptedException {
        long a10;
        int i10;
        long length = jVar.getLength();
        int i11 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
        long j10 = PlaybackStateCompat.f554k0;
        if (i11 != 0 && length <= PlaybackStateCompat.f554k0) {
            j10 = length;
        }
        int i12 = (int) j10;
        jVar.k(this.f10631a.f14880a, 0, 4);
        long F = this.f10631a.F();
        this.f10632b = 4;
        while (F != 440786851) {
            int i13 = this.f10632b + 1;
            this.f10632b = i13;
            if (i13 == i12) {
                return false;
            }
            jVar.k(this.f10631a.f14880a, 0, 1);
            F = ((F << 8) & -256) | ((long) (this.f10631a.f14880a[0] & 255));
        }
        long a11 = a(jVar);
        long j11 = (long) this.f10632b;
        if (a11 == Long.MIN_VALUE) {
            return false;
        }
        if (i11 != 0 && j11 + a11 >= length) {
            return false;
        }
        while (true) {
            int i14 = this.f10632b;
            long j12 = j11 + a11;
            if (((long) i14) >= j12) {
                return ((long) i14) == j12;
            }
            if (a(jVar) != Long.MIN_VALUE && a10 >= 0 && a10 <= c.M0) {
                if (i10 != 0) {
                    int a12 = (int) (a10 = a(jVar));
                    jVar.e(a12);
                    this.f10632b += a12;
                }
            }
        }
        return false;
    }
}
