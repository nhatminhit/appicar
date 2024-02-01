package i8;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import d.m0;
import d.o0;
import e8.a;
import j8.q;
import j8.s;

@a
public abstract class f {
    @a
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final DataHolder f9321a;
    @a

    /* renamed from: b  reason: collision with root package name */
    public int f9322b;

    /* renamed from: c  reason: collision with root package name */
    public int f9323c;

    @a
    public f(@m0 DataHolder dataHolder, int i10) {
        this.f9321a = (DataHolder) s.l(dataHolder);
        n(i10);
    }

    @a
    public void a(@m0 String str, @m0 CharArrayBuffer charArrayBuffer) {
        this.f9321a.P1(str, this.f9322b, this.f9323c, charArrayBuffer);
    }

    @a
    public boolean b(@m0 String str) {
        return this.f9321a.f1(str, this.f9322b, this.f9323c);
    }

    @a
    @m0
    public byte[] c(@m0 String str) {
        return this.f9321a.g1(str, this.f9322b, this.f9323c);
    }

    @a
    public int d() {
        return this.f9322b;
    }

    @a
    public double e(@m0 String str) {
        return this.f9321a.N1(str, this.f9322b, this.f9323c);
    }

    @a
    public boolean equals(@o0 Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            return q.b(Integer.valueOf(fVar.f9322b), Integer.valueOf(this.f9322b)) && q.b(Integer.valueOf(fVar.f9323c), Integer.valueOf(this.f9323c)) && fVar.f9321a == this.f9321a;
        }
    }

    @a
    public float f(@m0 String str) {
        return this.f9321a.O1(str, this.f9322b, this.f9323c);
    }

    @a
    public int g(@m0 String str) {
        return this.f9321a.h1(str, this.f9322b, this.f9323c);
    }

    @a
    public long h(@m0 String str) {
        return this.f9321a.m1(str, this.f9322b, this.f9323c);
    }

    @a
    public int hashCode() {
        return q.c(Integer.valueOf(this.f9322b), Integer.valueOf(this.f9323c), this.f9321a);
    }

    @a
    @m0
    public String i(@m0 String str) {
        return this.f9321a.r1(str, this.f9322b, this.f9323c);
    }

    @a
    public boolean j(@m0 String str) {
        return this.f9321a.F1(str);
    }

    @a
    public boolean k(@m0 String str) {
        return this.f9321a.L1(str, this.f9322b, this.f9323c);
    }

    @a
    public boolean l() {
        return !this.f9321a.isClosed();
    }

    @a
    @o0
    public Uri m(@m0 String str) {
        String r12 = this.f9321a.r1(str, this.f9322b, this.f9323c);
        if (r12 == null) {
            return null;
        }
        return Uri.parse(r12);
    }

    public final void n(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f9321a.getCount()) {
            z10 = true;
        }
        s.r(z10);
        this.f9322b = i10;
        this.f9323c = this.f9321a.A1(i10);
    }
}
