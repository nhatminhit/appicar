package ch;

import javax.annotation.Nullable;

public final class w {

    /* renamed from: h  reason: collision with root package name */
    public static final int f16527h = 8192;

    /* renamed from: i  reason: collision with root package name */
    public static final int f16528i = 1024;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f16529a;

    /* renamed from: b  reason: collision with root package name */
    public int f16530b;

    /* renamed from: c  reason: collision with root package name */
    public int f16531c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16532d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16533e;

    /* renamed from: f  reason: collision with root package name */
    public w f16534f;

    /* renamed from: g  reason: collision with root package name */
    public w f16535g;

    public w() {
        this.f16529a = new byte[8192];
        this.f16533e = true;
        this.f16532d = false;
    }

    public w(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f16529a = bArr;
        this.f16530b = i10;
        this.f16531c = i11;
        this.f16532d = z10;
        this.f16533e = z11;
    }

    public final void a() {
        w wVar = this.f16535g;
        if (wVar == this) {
            throw new IllegalStateException();
        } else if (wVar.f16533e) {
            int i10 = this.f16531c - this.f16530b;
            if (i10 <= (8192 - wVar.f16531c) + (wVar.f16532d ? 0 : wVar.f16530b)) {
                g(wVar, i10);
                b();
                x.a(this);
            }
        }
    }

    @Nullable
    public final w b() {
        w wVar = this.f16534f;
        w wVar2 = wVar != this ? wVar : null;
        w wVar3 = this.f16535g;
        wVar3.f16534f = wVar;
        this.f16534f.f16535g = wVar3;
        this.f16534f = null;
        this.f16535g = null;
        return wVar2;
    }

    public final w c(w wVar) {
        wVar.f16535g = this;
        wVar.f16534f = this.f16534f;
        this.f16534f.f16535g = wVar;
        this.f16534f = wVar;
        return wVar;
    }

    public final w d() {
        this.f16532d = true;
        return new w(this.f16529a, this.f16530b, this.f16531c, true, false);
    }

    public final w e(int i10) {
        w wVar;
        if (i10 <= 0 || i10 > this.f16531c - this.f16530b) {
            throw new IllegalArgumentException();
        }
        if (i10 >= 1024) {
            wVar = d();
        } else {
            wVar = x.b();
            System.arraycopy(this.f16529a, this.f16530b, wVar.f16529a, 0, i10);
        }
        wVar.f16531c = wVar.f16530b + i10;
        this.f16530b += i10;
        this.f16535g.c(wVar);
        return wVar;
    }

    public final w f() {
        return new w((byte[]) this.f16529a.clone(), this.f16530b, this.f16531c, false, true);
    }

    public final void g(w wVar, int i10) {
        if (wVar.f16533e) {
            int i11 = wVar.f16531c;
            if (i11 + i10 > 8192) {
                if (!wVar.f16532d) {
                    int i12 = wVar.f16530b;
                    if ((i11 + i10) - i12 <= 8192) {
                        byte[] bArr = wVar.f16529a;
                        System.arraycopy(bArr, i12, bArr, 0, i11 - i12);
                        wVar.f16531c -= wVar.f16530b;
                        wVar.f16530b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f16529a, this.f16530b, wVar.f16529a, wVar.f16531c, i10);
            wVar.f16531c += i10;
            this.f16530b += i10;
            return;
        }
        throw new IllegalArgumentException();
    }
}
