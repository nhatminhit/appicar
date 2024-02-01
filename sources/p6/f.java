package p6;

import b6.j0;
import j6.j;
import java.io.EOFException;
import java.io.IOException;
import w7.q0;
import w7.w;

public final class f {

    /* renamed from: l  reason: collision with root package name */
    public static final int f11555l = 27;

    /* renamed from: m  reason: collision with root package name */
    public static final int f11556m = 255;

    /* renamed from: n  reason: collision with root package name */
    public static final int f11557n = 65025;

    /* renamed from: o  reason: collision with root package name */
    public static final int f11558o = 65307;

    /* renamed from: p  reason: collision with root package name */
    public static final int f11559p = q0.T("OggS");

    /* renamed from: a  reason: collision with root package name */
    public int f11560a;

    /* renamed from: b  reason: collision with root package name */
    public int f11561b;

    /* renamed from: c  reason: collision with root package name */
    public long f11562c;

    /* renamed from: d  reason: collision with root package name */
    public long f11563d;

    /* renamed from: e  reason: collision with root package name */
    public long f11564e;

    /* renamed from: f  reason: collision with root package name */
    public long f11565f;

    /* renamed from: g  reason: collision with root package name */
    public int f11566g;

    /* renamed from: h  reason: collision with root package name */
    public int f11567h;

    /* renamed from: i  reason: collision with root package name */
    public int f11568i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f11569j = new int[255];

    /* renamed from: k  reason: collision with root package name */
    public final w f11570k = new w(255);

    public boolean a(j jVar, boolean z10) throws IOException, InterruptedException {
        this.f11570k.L();
        b();
        if (!(jVar.getLength() == -1 || jVar.getLength() - jVar.d() >= 27) || !jVar.c(this.f11570k.f14880a, 0, 27, true)) {
            if (z10) {
                return false;
            }
            throw new EOFException();
        } else if (this.f11570k.F() == ((long) f11559p)) {
            int D = this.f11570k.D();
            this.f11560a = D;
            if (D == 0) {
                this.f11561b = this.f11570k.D();
                this.f11562c = this.f11570k.q();
                this.f11563d = this.f11570k.s();
                this.f11564e = this.f11570k.s();
                this.f11565f = this.f11570k.s();
                int D2 = this.f11570k.D();
                this.f11566g = D2;
                this.f11567h = D2 + 27;
                this.f11570k.L();
                jVar.k(this.f11570k.f14880a, 0, this.f11566g);
                for (int i10 = 0; i10 < this.f11566g; i10++) {
                    this.f11569j[i10] = this.f11570k.D();
                    this.f11568i += this.f11569j[i10];
                }
                return true;
            } else if (z10) {
                return false;
            } else {
                throw new j0("unsupported bit stream revision");
            }
        } else if (z10) {
            return false;
        } else {
            throw new j0("expected OggS capture pattern at begin of page");
        }
    }

    public void b() {
        this.f11560a = 0;
        this.f11561b = 0;
        this.f11562c = 0;
        this.f11563d = 0;
        this.f11564e = 0;
        this.f11565f = 0;
        this.f11566g = 0;
        this.f11567h = 0;
        this.f11568i = 0;
    }
}
