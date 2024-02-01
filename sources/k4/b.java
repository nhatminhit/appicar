package k4;

import android.graphics.Bitmap;
import d.m0;
import d.o0;
import u3.a;
import z3.e;

public final class b implements a.C0227a {

    /* renamed from: a  reason: collision with root package name */
    public final e f9980a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final z3.b f9981b;

    public b(e eVar) {
        this(eVar, (z3.b) null);
    }

    public b(e eVar, @o0 z3.b bVar) {
        this.f9980a = eVar;
        this.f9981b = bVar;
    }

    @m0
    public Bitmap a(int i10, int i11, @m0 Bitmap.Config config) {
        return this.f9980a.g(i10, i11, config);
    }

    @m0
    public int[] b(int i10) {
        z3.b bVar = this.f9981b;
        return bVar == null ? new int[i10] : (int[]) bVar.e(i10, int[].class);
    }

    public void c(@m0 Bitmap bitmap) {
        this.f9980a.d(bitmap);
    }

    public void d(@m0 byte[] bArr) {
        z3.b bVar = this.f9981b;
        if (bVar != null) {
            bVar.put(bArr);
        }
    }

    @m0
    public byte[] e(int i10) {
        z3.b bVar = this.f9981b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.e(i10, byte[].class);
    }

    public void f(@m0 int[] iArr) {
        z3.b bVar = this.f9981b;
        if (bVar != null) {
            bVar.put(iArr);
        }
    }
}
