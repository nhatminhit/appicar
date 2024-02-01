package c5;

import h5.a;
import h5.n;
import w4.e;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4838a;

    /* renamed from: b  reason: collision with root package name */
    public e f4839b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4840c;

    /* renamed from: d  reason: collision with root package name */
    public final a f4841d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f4842e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f4843f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f4844g;

    /* renamed from: h  reason: collision with root package name */
    public char[] f4845h;

    /* renamed from: i  reason: collision with root package name */
    public char[] f4846i;

    /* renamed from: j  reason: collision with root package name */
    public char[] f4847j;

    public d(a aVar, Object obj, boolean z10) {
        this.f4841d = aVar;
        this.f4838a = obj;
        this.f4840c = z10;
    }

    public final void a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw z();
        }
    }

    public final void c(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw z();
        }
    }

    public byte[] d() {
        a(this.f4844g);
        byte[] a10 = this.f4841d.a(3);
        this.f4844g = a10;
        return a10;
    }

    public byte[] e(int i10) {
        a(this.f4844g);
        byte[] b10 = this.f4841d.b(3, i10);
        this.f4844g = b10;
        return b10;
    }

    public char[] f() {
        a(this.f4846i);
        char[] c10 = this.f4841d.c(1);
        this.f4846i = c10;
        return c10;
    }

    public char[] g(int i10) {
        a(this.f4847j);
        char[] d10 = this.f4841d.d(3, i10);
        this.f4847j = d10;
        return d10;
    }

    public byte[] h() {
        a(this.f4842e);
        byte[] a10 = this.f4841d.a(0);
        this.f4842e = a10;
        return a10;
    }

    public byte[] i(int i10) {
        a(this.f4842e);
        byte[] b10 = this.f4841d.b(0, i10);
        this.f4842e = b10;
        return b10;
    }

    public char[] j() {
        a(this.f4845h);
        char[] c10 = this.f4841d.c(0);
        this.f4845h = c10;
        return c10;
    }

    public char[] k(int i10) {
        a(this.f4845h);
        char[] d10 = this.f4841d.d(0, i10);
        this.f4845h = d10;
        return d10;
    }

    public byte[] l() {
        a(this.f4843f);
        byte[] a10 = this.f4841d.a(1);
        this.f4843f = a10;
        return a10;
    }

    public byte[] m(int i10) {
        a(this.f4843f);
        byte[] b10 = this.f4841d.b(1, i10);
        this.f4843f = b10;
        return b10;
    }

    public n n() {
        return new n(this.f4841d);
    }

    public e o() {
        return this.f4839b;
    }

    public Object p() {
        return this.f4838a;
    }

    public boolean q() {
        return this.f4840c;
    }

    public void r(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.f4844g);
            this.f4844g = null;
            this.f4841d.i(3, bArr);
        }
    }

    public void s(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.f4846i);
            this.f4846i = null;
            this.f4841d.j(1, cArr);
        }
    }

    public void t(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.f4847j);
            this.f4847j = null;
            this.f4841d.j(3, cArr);
        }
    }

    public void u(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.f4842e);
            this.f4842e = null;
            this.f4841d.i(0, bArr);
        }
    }

    public void v(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.f4845h);
            this.f4845h = null;
            this.f4841d.j(0, cArr);
        }
    }

    public void w(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.f4843f);
            this.f4843f = null;
            this.f4841d.i(1, bArr);
        }
    }

    public void x(e eVar) {
        this.f4839b = eVar;
    }

    public d y(e eVar) {
        this.f4839b = eVar;
        return this;
    }

    public final IllegalArgumentException z() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }
}
