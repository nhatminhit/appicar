package o6;

import j6.j;
import java.io.IOException;
import w7.w;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public c f11300a;

    /* renamed from: b  reason: collision with root package name */
    public long f11301b;

    /* renamed from: c  reason: collision with root package name */
    public long f11302c;

    /* renamed from: d  reason: collision with root package name */
    public long f11303d;

    /* renamed from: e  reason: collision with root package name */
    public int f11304e;

    /* renamed from: f  reason: collision with root package name */
    public int f11305f;

    /* renamed from: g  reason: collision with root package name */
    public long[] f11306g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f11307h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f11308i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f11309j;

    /* renamed from: k  reason: collision with root package name */
    public long[] f11310k;

    /* renamed from: l  reason: collision with root package name */
    public boolean[] f11311l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11312m;

    /* renamed from: n  reason: collision with root package name */
    public boolean[] f11313n;

    /* renamed from: o  reason: collision with root package name */
    public m f11314o;

    /* renamed from: p  reason: collision with root package name */
    public int f11315p;

    /* renamed from: q  reason: collision with root package name */
    public w f11316q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f11317r;

    /* renamed from: s  reason: collision with root package name */
    public long f11318s;

    public void a(j jVar) throws IOException, InterruptedException {
        jVar.readFully(this.f11316q.f14880a, 0, this.f11315p);
        this.f11316q.Q(0);
        this.f11317r = false;
    }

    public void b(w wVar) {
        wVar.i(this.f11316q.f14880a, 0, this.f11315p);
        this.f11316q.Q(0);
        this.f11317r = false;
    }

    public long c(int i10) {
        return this.f11310k[i10] + ((long) this.f11309j[i10]);
    }

    public void d(int i10) {
        w wVar = this.f11316q;
        if (wVar == null || wVar.d() < i10) {
            this.f11316q = new w(i10);
        }
        this.f11315p = i10;
        this.f11312m = true;
        this.f11317r = true;
    }

    public void e(int i10, int i11) {
        this.f11304e = i10;
        this.f11305f = i11;
        int[] iArr = this.f11307h;
        if (iArr == null || iArr.length < i10) {
            this.f11306g = new long[i10];
            this.f11307h = new int[i10];
        }
        int[] iArr2 = this.f11308i;
        if (iArr2 == null || iArr2.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f11308i = new int[i12];
            this.f11309j = new int[i12];
            this.f11310k = new long[i12];
            this.f11311l = new boolean[i12];
            this.f11313n = new boolean[i12];
        }
    }

    public void f() {
        this.f11304e = 0;
        this.f11318s = 0;
        this.f11312m = false;
        this.f11317r = false;
        this.f11314o = null;
    }

    public boolean g(int i10) {
        return this.f11312m && this.f11313n[i10];
    }
}
