package p6;

import j6.j;
import java.io.IOException;
import java.util.Arrays;
import w7.a;
import w7.w;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final f f11550a = new f();

    /* renamed from: b  reason: collision with root package name */
    public final w f11551b = new w(new byte[f.f11557n], 0);

    /* renamed from: c  reason: collision with root package name */
    public int f11552c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f11553d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11554e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f11553d = 0;
        do {
            int i13 = this.f11553d;
            int i14 = i10 + i13;
            f fVar = this.f11550a;
            if (i14 >= fVar.f11566g) {
                break;
            }
            int[] iArr = fVar.f11569j;
            this.f11553d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f11550a;
    }

    public w c() {
        return this.f11551b;
    }

    public boolean d(j jVar) throws IOException, InterruptedException {
        int i10;
        a.i(jVar != null);
        if (this.f11554e) {
            this.f11554e = false;
            this.f11551b.L();
        }
        while (!this.f11554e) {
            if (this.f11552c < 0) {
                if (!this.f11550a.a(jVar, true)) {
                    return false;
                }
                f fVar = this.f11550a;
                int i11 = fVar.f11567h;
                if ((fVar.f11561b & 1) == 1 && this.f11551b.d() == 0) {
                    i11 += a(0);
                    i10 = this.f11553d + 0;
                } else {
                    i10 = 0;
                }
                jVar.i(i11);
                this.f11552c = i10;
            }
            int a10 = a(this.f11552c);
            int i12 = this.f11552c + this.f11553d;
            if (a10 > 0) {
                if (this.f11551b.b() < this.f11551b.d() + a10) {
                    w wVar = this.f11551b;
                    wVar.f14880a = Arrays.copyOf(wVar.f14880a, wVar.d() + a10);
                }
                w wVar2 = this.f11551b;
                jVar.readFully(wVar2.f14880a, wVar2.d(), a10);
                w wVar3 = this.f11551b;
                wVar3.P(wVar3.d() + a10);
                this.f11554e = this.f11550a.f11569j[i12 + -1] != 255;
            }
            if (i12 == this.f11550a.f11566g) {
                i12 = -1;
            }
            this.f11552c = i12;
        }
        return true;
    }

    public void e() {
        this.f11550a.b();
        this.f11551b.L();
        this.f11552c = -1;
        this.f11554e = false;
    }

    public void f() {
        w wVar = this.f11551b;
        byte[] bArr = wVar.f14880a;
        if (bArr.length != 65025) {
            wVar.f14880a = Arrays.copyOf(bArr, Math.max(f.f11557n, wVar.d()));
        }
    }
}
